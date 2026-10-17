package f2h;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.text.d0;
import kotlin.text.r;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d extends q implements Function1 {
    public static final d f = new d();

    public d() {
        super(1, r.class, "trim", "trim(Ljava/lang/String;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String p0 = (String) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return d0.F0(p0).toString();
    }
}
