package oi0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, d.class, "reverseNativeLibraryPathElements", "reverseNativeLibraryPathElements(Ljava/lang/ClassLoader;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws IllegalAccessException, NoSuchFieldException {
        ClassLoader p0 = (ClassLoader) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        d.b(p0);
        return Unit.f186387a;
    }
}
