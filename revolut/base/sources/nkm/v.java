package nkm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class v extends kotlin.jvm.internal.q implements Function1 {
    public static final v f = new v();

    public v() {
        super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Iterable p0 = (Iterable) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.iterator();
    }
}
