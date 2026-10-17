package gl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.onfido.android.sdk.capture.EnterpriseFeatures;
import com.onfido.android.sdk.capture.ExitCode;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.errors.MissingDependenciesException;
import com.onfido.android.sdk.capture.token.TokenExpirationHandlerService;
import com.onfido.workflow.OnfidoWorkflow;
import com.onfido.workflow.WorkflowConfig;
import com.onfido.workflow.internal.ui.WorkflowFragment;
import java.io.Serializable;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements OnfidoWorkflow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f144530a;

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f144530a = context;
    }

    @Override // com.onfido.workflow.OnfidoWorkflow
    public final Intent createIntent(WorkflowConfig workflowConfig) {
        Intrinsics.checkNotNullParameter(workflowConfig, "workflowConfig");
        try {
            Object objInvoke = WorkflowFragment.class.getMethod("newInstance", null).invoke(null, null);
            Intrinsics.i(objInvoke, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
            OnfidoConfig.Companion companion = OnfidoConfig.INSTANCE;
            Context context = this.f144530a;
            OnfidoConfig.Builder builderWithWorkflowConfig = companion.builder(context).withSDKToken(workflowConfig.getF50173a(), TokenExpirationHandlerService.INSTANCE.getTokenExpirationHandler()).withWorkflowConfig(workflowConfig);
            Locale locale = workflowConfig.getF50175c();
            if (locale != null) {
                builderWithWorkflowConfig.withLocale(locale);
            }
            EnterpriseFeatures enterpriseFeatures = workflowConfig.getD();
            if (enterpriseFeatures != null) {
                builderWithWorkflowConfig.withEnterpriseFeatures(enterpriseFeatures);
            }
            builderWithWorkflowConfig.withTheme(workflowConfig.getF50178j());
            OnfidoConfig onfidoConfigBuild = builderWithWorkflowConfig.build();
            Intent intent = new Intent();
            intent.setClassName(context, "com.onfido.android.sdk.capture.ui.OnfidoSplashActivity");
            intent.putExtra("onfido_config", onfidoConfigBuild);
            intent.putExtra("onfido_session_id", System.currentTimeMillis());
            return intent;
        } catch (Exception unused) {
            throw new MissingDependenciesException("Workflow library is missing, please add it as a dependency and then re-launch the sdk");
        }
    }

    @Override // com.onfido.workflow.OnfidoWorkflow
    public final void handleActivityResult(int i, Intent intent, OnfidoWorkflow.ResultListener resultListener) {
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        a aVar = new a(i, intent, resultListener);
        Serializable serializableExtra = intent != null ? intent.getSerializableExtra("onfido_exit_code") : null;
        ExitCode exitCode = serializableExtra instanceof ExitCode ? (ExitCode) serializableExtra : null;
        if (i == -2) {
            Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("onfido_exception_result") : null;
            OnfidoWorkflow.WorkflowException workflowException = serializableExtra2 instanceof OnfidoWorkflow.WorkflowException ? (OnfidoWorkflow.WorkflowException) serializableExtra2 : null;
            if (workflowException != null) {
                resultListener.onException(workflowException);
                return;
            } else {
                aVar.invoke();
                return;
            }
        }
        if (i == -1) {
            resultListener.onUserCompleted();
        } else {
            if (i != 0) {
                aVar.invoke();
                return;
            }
            if (exitCode == null) {
                exitCode = ExitCode.USER_LEFT_ACTIVITY;
            }
            resultListener.onUserExited(exitCode);
        }
    }

    @Override // com.onfido.workflow.OnfidoWorkflow
    public final void startActivityForResult(Activity activity, int i, WorkflowConfig workflowConfig) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(workflowConfig, "workflowConfig");
        activity.startActivityForResult(createIntent(workflowConfig), i);
    }
}
