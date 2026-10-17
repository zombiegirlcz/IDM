package ep6;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.data.model.Data;
import ip0.y;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import v0f.p;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f128092a = new o();

    private o() {
    }

    @Override // ep6.n
    public final void A1() {
    }

    @Override // ep6.n
    public final Flow F1() {
        return new p(new Data[0], 8);
    }

    @Override // ep6.n
    public final Flow I1(String referenceId, yo6.d referenceType, yo6.c cVar) {
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        Intrinsics.checkNotNullParameter(referenceType, "referenceType");
        return new p(new m[0], 8);
    }

    @Override // ep6.n
    public final void L0() {
    }

    @Override // ep6.n
    public final void o1(LargeActionButtonDelegate.Model clickData, h feedbackParams) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Intrinsics.checkNotNullParameter(feedbackParams, "feedbackParams");
    }

    @Override // ep6.n
    public final void t1(CharSequence comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
    }

    @Override // ep6.n
    public final void v1(y clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
    }
}
