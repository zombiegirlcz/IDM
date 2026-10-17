package pc0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class d extends q implements Function1 {
    public static final d f = new d();

    public d() {
        super(1, wl2.b.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String p0 = (String) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new wl2.b(p0);
    }
}
