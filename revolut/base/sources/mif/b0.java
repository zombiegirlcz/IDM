package mif;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b0 extends kotlin.jvm.internal.q implements Function1 {
    public static final b0 f = new b0();

    public b0() {
        super(1, e0.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String p0 = (String) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return e0.c(p0);
    }
}
