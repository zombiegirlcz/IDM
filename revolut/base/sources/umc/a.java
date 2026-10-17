package umc;

import hx7.e;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends b {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        if (obj2 != null) {
            throw new ClassCastException();
        }
        Intrinsics.checkNotNullParameter(null, "parcel");
        e.n(new IllegalArgumentException("Unknown parcel: null"));
        return Unit.f186387a;
    }
}
