package avk;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f10074a = new c0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        nel.n instrument = (nel.n) obj2;
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        return new fsl.f(instrument);
    }
}
