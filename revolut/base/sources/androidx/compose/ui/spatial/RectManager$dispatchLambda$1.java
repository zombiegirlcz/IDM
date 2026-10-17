package androidx.compose.ui.spatial;

import android.os.Trace;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class RectManager$dispatchLambda$1 extends u implements Function0<Unit> {
    final /* synthetic */ RectManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RectManager$dispatchLambda$1(RectManager rectManager) {
        super(0);
        this.this$0 = rectManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m2843invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m2843invoke() {
        this.this$0.dispatchToken = null;
        RectManager rectManager = this.this$0;
        Trace.beginSection("OnPositionedDispatch");
        try {
            rectManager.dispatchCallbacks();
            Unit unit = Unit.f186387a;
        } finally {
            Trace.endSection();
        }
    }
}
