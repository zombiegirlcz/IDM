package gl;

import android.content.Intent;
import com.onfido.workflow.OnfidoWorkflow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import kotlin.text.t;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends u implements Function0 {
    public final /* synthetic */ OnfidoWorkflow.ResultListener f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Intent f144529h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i, Intent intent, OnfidoWorkflow.ResultListener resultListener) {
        super(0);
        this.f = resultListener;
        this.f144529h = intent;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Intent intent = this.f144529h;
        this.f.onException(new OnfidoWorkflow.WorkflowException.WorkflowUnknownResultException(t.f("\n                    |Unknown result intent: " + (intent != null ? intent.toString() : null) + "\n                    |result code: " + this.i + "\n                    ")));
        return Unit.f186387a;
    }
}
