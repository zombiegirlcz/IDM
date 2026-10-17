package dwi;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import svi.c1;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f120427a = new h0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String url2 = (String) obj2;
        Intrinsics.checkNotNullParameter(url2, "url");
        return new c1(url2);
    }
}
