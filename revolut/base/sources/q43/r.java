package q43;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class r extends kotlin.jvm.internal.q implements Function1 {
    public static final r f = new r();

    public r() {
        super(1, x.class, "<init>", "<init>(Lcom/revolut/controller_extensions/recyclerscroll/ListVisibilityState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        t60.a p0 = (t60.a) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new x(p0);
    }
}
