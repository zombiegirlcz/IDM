package i2l;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f158022a = new k0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        a2l.y partnerLayout = (a2l.y) obj2;
        Intrinsics.checkNotNullParameter(partnerLayout, "partnerLayout");
        Iterable iterable = partnerLayout.f;
        if (iterable == null) {
            iterable = zhm.f0.f322471a;
        }
        return zhm.d0.i1(iterable);
    }
}
