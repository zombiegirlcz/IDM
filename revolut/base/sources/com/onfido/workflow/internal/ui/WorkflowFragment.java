package com.onfido.workflow.internal.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Keep;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.view.result.ActivityResultLauncher;
import com.onfido.android.sdk.capture.ExitCode;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.common.permissions.PermissionResult;
import com.onfido.android.sdk.capture.common.permissions.PermissionsManagementFragment;
import com.onfido.android.sdk.capture.internal.navigation.OnfidoNavigation;
import com.onfido.android.sdk.capture.internal.navigation.Screen;
import com.onfido.android.sdk.capture.internal.navigation.navigator.FragmentNavigationManager;
import com.onfido.android.sdk.capture.internal.navigation.navigator.NavigationManagerHolder;
import com.onfido.android.sdk.capture.internal.navigation.screens.EmptyScreen;
import com.onfido.android.sdk.capture.internal.util.FragmentManagerExtKt;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.ui.NextActionListener;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.onfido.android.sdk.capture.utils.LifecycleAwareDialog;
import com.onfido.android.sdk.capture.utils.LifecycleDisposableKt;
import com.onfido.android.sdk.capture.utils.UserExitFlowMenuProvider;
import com.onfido.android.sdk.capture.utils.WorkflowToolbarUpdateListener;
import com.onfido.api.client.data.DocSide;
import com.onfido.workflow.OnfidoWorkflow;
import com.onfido.workflow.R;
import fnc.s;
import fu0.a;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kl.c2;
import kl.n;
import kl.o;
import kl.q;
import kl.r;
import kl.t;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ll.c;
import ml.h;
import ml.h0;
import ml.i;
import ml.i0;
import ml.j0;
import ml.k;
import ml.k0;
import ml.l;
import ml.o0;
import ml.p;
import ml.p0;
import n14.e;
import org.jetbrains.annotations.NotNull;
import rl.b;
import rl.f;
import yhm.j;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 f2\u00020\u0001:\u0001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J!\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00101\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010?\u001a\u00020>8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010F\u001a\u00020E8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010N\u001a\u0004\bT\u0010UR\u001b\u0010[\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010N\u001a\u0004\bY\u0010ZR\u001b\u0010`\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010N\u001a\u0004\b^\u0010_R\u001b\u0010e\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010N\u001a\u0004\bc\u0010d¨\u0006g"}, d2 = {"Lcom/onfido/workflow/internal/ui/WorkflowFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "onDetach", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onStop", "Lml/o;", "uiEvent", "handleOneOffUIEvent", "(Lml/o;)V", "", "resultCode", "Lkotlin/Pair;", "", "Ljava/io/Serializable;", "data", "setFragmentResult", "(ILkotlin/Pair;)V", "setupFragmentListeners", "bundle", "Lml/k0;", "permissionResultToUiEvent", "(Landroid/os/Bundle;)Lml/k0;", "Lml/p;", "toolbarState", "handleToolbarState", "(Lml/p;)V", "", "showBackButton", "setupToolbarBackButton", "(Z)V", "Lcom/onfido/android/sdk/capture/ui/NextActionListener;", "nextActionListener", "Lcom/onfido/android/sdk/capture/ui/NextActionListener;", "toolbarStateShowBackButton", "Z", "Lkl/c2;", "workflowViewModel", "Lkl/c2;", "getWorkflowViewModel", "()Lkl/c2;", "setWorkflowViewModel", "(Lkl/c2;)V", "Lrl/b;", "workflowIntentFactory", "Lrl/b;", "getWorkflowIntentFactory", "()Lrl/b;", "setWorkflowIntentFactory", "(Lrl/b;)V", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "getSchedulersProvider", "()Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "setSchedulersProvider", "(Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;)V", "Lcom/onfido/android/sdk/capture/internal/navigation/navigator/NavigationManagerHolder;", "navigationManagerHolder", "Lcom/onfido/android/sdk/capture/internal/navigation/navigator/NavigationManagerHolder;", "getNavigationManagerHolder", "()Lcom/onfido/android/sdk/capture/internal/navigation/navigator/NavigationManagerHolder;", "setNavigationManagerHolder", "(Lcom/onfido/android/sdk/capture/internal/navigation/navigator/NavigationManagerHolder;)V", "Lrl/c;", "orchestrationIntentLauncher$delegate", "Lkotlin/Lazy;", "getOrchestrationIntentLauncher", "()Lrl/c;", "orchestrationIntentLauncher", "Lcom/onfido/android/sdk/capture/internal/navigation/navigator/FragmentNavigationManager;", "navigationManager$delegate", "getNavigationManager", "()Lcom/onfido/android/sdk/capture/internal/navigation/navigator/FragmentNavigationManager;", "navigationManager", "Lll/c;", "backStackManager$delegate", "getBackStackManager", "()Lll/c;", "backStackManager", "Lcom/onfido/android/sdk/capture/utils/LifecycleAwareDialog;", "lifecycleAwareDialog$delegate", "getLifecycleAwareDialog", "()Lcom/onfido/android/sdk/capture/utils/LifecycleAwareDialog;", "lifecycleAwareDialog", "Lcom/onfido/android/sdk/capture/utils/UserExitFlowMenuProvider;", "userExitFlowMenuProvider$delegate", "getUserExitFlowMenuProvider", "()Lcom/onfido/android/sdk/capture/utils/UserExitFlowMenuProvider;", "userExitFlowMenuProvider", "Companion", "onfido-workflow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WorkflowFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: backStackManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy backStackManager;

    /* JADX INFO: renamed from: lifecycleAwareDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lifecycleAwareDialog;

    /* JADX INFO: renamed from: navigationManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationManager;
    public NavigationManagerHolder navigationManagerHolder;
    private NextActionListener nextActionListener;

    /* JADX INFO: renamed from: orchestrationIntentLauncher$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy orchestrationIntentLauncher;
    public SchedulersProvider schedulersProvider;
    private boolean toolbarStateShowBackButton;

    /* JADX INFO: renamed from: userExitFlowMenuProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy userExitFlowMenuProvider;
    public b workflowIntentFactory;
    public c2 workflowViewModel;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/onfido/workflow/internal/ui/WorkflowFragment$Companion;", "", "Lcom/onfido/workflow/internal/ui/WorkflowFragment;", "newInstance", "()Lcom/onfido/workflow/internal/ui/WorkflowFragment;", "onfido-workflow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @Keep
        @NotNull
        public final WorkflowFragment newInstance() {
            return new WorkflowFragment();
        }
    }

    public WorkflowFragment() {
        super(R.layout.onfido_orchestration_fragment);
        this.orchestrationIntentLauncher = j.b(new n(this, 2));
        this.navigationManager = j.b(new o(this));
        this.backStackManager = j.b(new n(this, 0));
        this.lifecycleAwareDialog = j.b(new n(this, 1));
        this.userExitFlowMenuProvider = j.b(new n(this, 4));
    }

    private final c getBackStackManager() {
        return (c) this.backStackManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LifecycleAwareDialog getLifecycleAwareDialog() {
        return (LifecycleAwareDialog) this.lifecycleAwareDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentNavigationManager getNavigationManager() {
        return (FragmentNavigationManager) this.navigationManager.getValue();
    }

    private final rl.c getOrchestrationIntentLauncher() {
        return (rl.c) this.orchestrationIntentLauncher.getValue();
    }

    private final UserExitFlowMenuProvider getUserExitFlowMenuProvider() {
        return (UserExitFlowMenuProvider) this.userExitFlowMenuProvider.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOneOffUIEvent(ml.o uiEvent) {
        h hVar = h.f206526a;
        h hVar2 = h.f206528c;
        h hVar3 = h.f206527b;
        if (!(Intrinsics.f(uiEvent, hVar3) ? true : Intrinsics.f(uiEvent, hVar2) ? true : uiEvent instanceof ml.n)) {
            if (Intrinsics.f(uiEvent, hVar)) {
                return;
            }
            if (!(uiEvent instanceof i)) {
                if (!(uiEvent instanceof k)) {
                    if (uiEvent instanceof l) {
                        setFragmentResult(-1, null);
                        return;
                    }
                    return;
                }
                ml.j jVar = ((k) uiEvent).f206533a;
                if (jVar == ml.j.EXIT_NFC_REQUIRED_FLOW) {
                    setFragmentResult(0, new Pair<>("onfido_exit_code", ExitCode.REQUIRED_NFC_FLOW_NOT_COMPLETED));
                    return;
                } else {
                    if (jVar == ml.j.USER_EXIT_FLOW) {
                        setFragmentResult(0, new Pair<>("onfido_exit_code", ExitCode.USER_LEFT_ACTIVITY));
                        return;
                    }
                    return;
                }
            }
            OnfidoWorkflow.WorkflowException workflowException = ((i) uiEvent).f206530a;
            if (!(workflowException instanceof OnfidoWorkflow.WorkflowException.WorkflowCaptureCancelledException)) {
                setFragmentResult(-2, new Pair<>("onfido_exception_result", workflowException));
                return;
            }
            List<Screen> currentScreensSnapshot = getNavigationManager().getCurrentScreensSnapshot();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : currentScreensSnapshot) {
                if (!(((Screen) obj2) instanceof LoadingScreen)) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                setFragmentResult(0, new Pair<>("onfido_exit_code", ExitCode.USER_LEFT_ACTIVITY));
                return;
            }
            return;
        }
        f fVar = (f) getOrchestrationIntentLauncher();
        OnfidoConfig onfidoConfig = fVar.f254905c;
        Context context = fVar.f254903a;
        Intrinsics.checkNotNullParameter(uiEvent, "uiEvent");
        fVar.f254904b.navigateTo(EmptyScreen.INSTANCE);
        if (Intrinsics.f(uiEvent, hVar)) {
            return;
        }
        if (Intrinsics.f(uiEvent, hVar3)) {
            ActivityResultLauncher activityResultLauncher = fVar.e;
            if (activityResultLauncher != null) {
                activityResultLauncher.launch(CaptureActivity.INSTANCE.createFaceIntent(context, null, onfidoConfig));
                return;
            } else {
                Intrinsics.r("launcher");
                throw null;
            }
        }
        if (Intrinsics.f(uiEvent, hVar2)) {
            ActivityResultLauncher activityResultLauncher2 = fVar.e;
            if (activityResultLauncher2 != null) {
                activityResultLauncher2.launch(CaptureActivity.INSTANCE.createLivenessIntent(context, onfidoConfig));
                return;
            } else {
                Intrinsics.r("launcher");
                throw null;
            }
        }
        if (!(uiEvent instanceof ml.n)) {
            Timber.INSTANCE.e(uiEvent + " has not been handled", new Object[0]);
            return;
        }
        ActivityResultLauncher activityResultLauncher3 = fVar.e;
        if (activityResultLauncher3 == null) {
            Intrinsics.r("launcher");
            throw null;
        }
        ml.n nVar = (ml.n) uiEvent;
        activityResultLauncher3.launch(CaptureActivity.Companion.createDocumentIntent$default(CaptureActivity.INSTANCE, fVar.f254903a, fVar.f254905c, nVar.f206538c == DocSide.FRONT, nVar.f206536a, nVar.f206537b, nVar.d, nVar.e, false, null, null, 896, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleToolbarState(p toolbarState) {
        boolean z = toolbarState.f206540a;
        this.toolbarStateShowBackButton = z;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.i(fragmentActivityRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AppCompatActivity appCompatActivity = (AppCompatActivity) fragmentActivityRequireActivity;
        if (toolbarState.f206542c) {
            ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.hide();
            }
        } else {
            if (toolbarState.f206541b) {
                appCompatActivity.removeMenuProvider(getUserExitFlowMenuProvider());
                appCompatActivity.addMenuProvider(getUserExitFlowMenuProvider(), getViewLifecycleOwner());
            } else {
                appCompatActivity.removeMenuProvider(getUserExitFlowMenuProvider());
            }
            ActionBar supportActionBar2 = appCompatActivity.getSupportActionBar();
            if (supportActionBar2 != null) {
                supportActionBar2.show();
            }
            ActionBar supportActionBar3 = appCompatActivity.getSupportActionBar();
            if (supportActionBar3 != null) {
                supportActionBar3.setHomeButtonEnabled(z);
            }
            setupToolbarBackButton(z);
        }
        Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(R.id.fragment_container);
        View view = getView();
        if (view != null) {
            view.post(new fp0.l(fragmentFindFragmentById, 28));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void handleToolbarState$lambda$1(Fragment fragment) {
        WorkflowToolbarUpdateListener workflowToolbarUpdateListener = fragment instanceof WorkflowToolbarUpdateListener ? (WorkflowToolbarUpdateListener) fragment : null;
        if (workflowToolbarUpdateListener != null) {
            workflowToolbarUpdateListener.onWorkflowToolbarUpdated();
        }
    }

    @Keep
    @NotNull
    public static final WorkflowFragment newInstance() {
        return INSTANCE.newInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k0 permissionResultToUiEvent(Bundle bundle) {
        PermissionResult result = PermissionsManagementFragment.INSTANCE.getResult(bundle);
        if (result instanceof PermissionResult.Granted) {
            return new i0(((PermissionResult.Granted) result).getCaptureStepDataBundle());
        }
        if (result instanceof PermissionResult.Canceled) {
            return h0.f206529a;
        }
        if (result instanceof PermissionResult.NavigateBack) {
            return j0.f206532a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFragmentResult(int resultCode, Pair<String, ? extends Serializable> data) {
        Bundle bundleBundleOf = BundleKt.bundleOf(new Pair("key_workflow_result_code", Integer.valueOf(resultCode)));
        if (data != null) {
            bundleBundleOf.putSerializable((String) data.f186385a, (Serializable) data.f186386b);
        }
        getParentFragmentManager().setFragmentResult("result_workflow", bundleBundleOf);
    }

    private final void setupFragmentListeners() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        FragmentManagerExtKt.setFragmentResultsListeners(childFragmentManager, viewLifecycleOwner, new String[]{"request_key_liveness_confirmation", "request_key_document_selection", "request_key_country_selection_screen", "request_key_face_selfie_intro", "address_page_intro", "request_key_face_liveness_intro", "request_key_permissions_screen", "request_key_nfc_flow", "request_key_retry_workflow", "request_key_poa", "request_key_motion", "request_key_qes_consent", "request_key_nfc_not_supported", "KEY_REQUEST_SELFIE_CAPTURE", "face_liveness_capture", "KEY_REQUEST_DOCUMENT_CAPTURE"}, new t(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupToolbarBackButton(boolean showBackButton) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.i(fragmentActivityRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AppCompatActivity appCompatActivity = (AppCompatActivity) fragmentActivityRequireActivity;
        ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(showBackButton);
        }
        ActionBar supportActionBar2 = appCompatActivity.getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setHomeButtonEnabled(showBackButton);
        }
    }

    @NotNull
    public final NavigationManagerHolder getNavigationManagerHolder() {
        NavigationManagerHolder navigationManagerHolder = this.navigationManagerHolder;
        if (navigationManagerHolder != null) {
            return navigationManagerHolder;
        }
        Intrinsics.r("navigationManagerHolder");
        throw null;
    }

    @NotNull
    public final SchedulersProvider getSchedulersProvider() {
        SchedulersProvider schedulersProvider = this.schedulersProvider;
        if (schedulersProvider != null) {
            return schedulersProvider;
        }
        Intrinsics.r("schedulersProvider");
        throw null;
    }

    @NotNull
    public final b getWorkflowIntentFactory() {
        b bVar = this.workflowIntentFactory;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("workflowIntentFactory");
        throw null;
    }

    @NotNull
    public final c2 getWorkflowViewModel() {
        c2 c2Var = this.workflowViewModel;
        if (c2Var != null) {
            return c2Var;
        }
        Intrinsics.r("workflowViewModel");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.nextActionListener = context instanceof NextActionListener ? (NextActionListener) context : null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        getWorkflowViewModel().getClass();
        il.j.Companion.getClass();
        il.i.f162034b = null;
        this.nextActionListener = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getChildFragmentManager().addOnBackStackChangedListener(getBackStackManager());
        getNavigationManagerHolder().setNavigationManager(getNavigationManager());
        Observable observableHide = ((f) getOrchestrationIntentLauncher()).f.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        Disposable disposableSubscribe = observableHide.map(kl.p.f185205b).subscribe(new q(getWorkflowViewModel(), 0));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleDisposableKt.disposeOnStop(disposableSubscribe, viewLifecycleOwner);
        Disposable disposableSubscribe2 = getWorkflowViewModel().F.subscribeOn(getSchedulersProvider().getComputation()).observeOn(getSchedulersProvider().getUi()).subscribe(new fn2.c(this, 29), r.f185232a);
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleDisposableKt.disposeOnStop(disposableSubscribe2, viewLifecycleOwner2);
        getWorkflowViewModel().b(o0.f206539a);
        Intent intent = requireActivity().getIntent();
        String url2 = intent != null ? intent.getStringExtra("onfido_bridge_url") : null;
        if (url2 == null) {
            url2 = "";
        }
        c2 workflowViewModel = getWorkflowViewModel();
        workflowViewModel.getClass();
        Intrinsics.checkNotNullParameter(url2, "url");
        workflowViewModel.H = url2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getChildFragmentManager().removeOnBackStackChangedListener(getBackStackManager());
        getNavigationManagerHolder().resetNavigationManager();
        getWorkflowViewModel().b(p0.f206543a);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        il.i iVar = il.j.Companion;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        iVar.getClass();
        il.h hVar = (il.h) il.i.a(contextRequireContext);
        this.workflowViewModel = (c2) hVar.D.get();
        this.workflowIntentFactory = (b) hVar.E.f127226a;
        SchedulersProvider schedulersProvider = hVar.f162016a.schedulersProvider();
        e.f(schedulersProvider);
        this.schedulersProvider = schedulersProvider;
        OnfidoNavigation onfidoNavigation = (OnfidoNavigation) hVar.f162021j.get();
        Intrinsics.checkNotNullParameter(onfidoNavigation, "onfidoNavigation");
        NavigationManagerHolder navigationManagerHolder = onfidoNavigation.getNavigationManagerHolder();
        e.g(navigationManagerHolder);
        this.navigationManagerHolder = navigationManagerHolder;
        super.onViewCreated(view, savedInstanceState);
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new a(this, 2));
        setupFragmentListeners();
        getWorkflowViewModel().b(ml.t.f206547a);
        getViewLifecycleOwner().getLifecycle().addObserver(getOrchestrationIntentLauncher());
        Disposable disposableSubscribe = getWorkflowViewModel().G.subscribeOn(getSchedulersProvider().getUi()).observeOn(getSchedulersProvider().getUi()).subscribe(new s(this, 27), kl.s.f185235a);
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleDisposableKt.disposeOnDestroy(disposableSubscribe, viewLifecycleOwner);
    }

    public final void setNavigationManagerHolder(@NotNull NavigationManagerHolder navigationManagerHolder) {
        Intrinsics.checkNotNullParameter(navigationManagerHolder, "<set-?>");
        this.navigationManagerHolder = navigationManagerHolder;
    }

    public final void setSchedulersProvider(@NotNull SchedulersProvider schedulersProvider) {
        Intrinsics.checkNotNullParameter(schedulersProvider, "<set-?>");
        this.schedulersProvider = schedulersProvider;
    }

    public final void setWorkflowIntentFactory(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.workflowIntentFactory = bVar;
    }

    public final void setWorkflowViewModel(@NotNull c2 c2Var) {
        Intrinsics.checkNotNullParameter(c2Var, "<set-?>");
        this.workflowViewModel = c2Var;
    }
}
