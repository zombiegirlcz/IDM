package q43;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class q extends kotlin.jvm.internal.q implements Function1 {
    public static final q f = new q();

    public q() {
        super(1, t60.a.class, "isNotEmpty", "isNotEmpty()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        t60.a p0 = (t60.a) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(p0.a());
    }
}
