package b4b;

import android.os.Parcelable;
import com.revolut.feature.retail.cfd.impl.screens.order.v2.CfdOrderFormControllerContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f0 extends s {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        n currentState = (n) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        boolean z = currentState.k;
        g5b.e eVar = (g5b.e) currentState.f12233l.getContent();
        return new CfdOrderFormControllerContract$RetainedState(z, eVar != null ? eVar.d : null);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        n initialState = (n) obj2;
        CfdOrderFormControllerContract$RetainedState retainedState = (CfdOrderFormControllerContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return n.a(initialState, null, null, null, null, null, null, null, null, null, retainedState.f82247a, zi0.c.P(new g5b.e(null, null, zhm.f0.f322471a, retainedState.f82248b, r2b.b.f251091a), false, null, 3), null, 5119);
    }
}
