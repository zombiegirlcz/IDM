package eac;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u extends kotlin.jvm.internal.q implements Function1 {
    public static final u f = new u();

    public u() {
        super(1, j.class, "<init>", "<init>(Ljava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List p0 = (List) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new j(p0);
    }
}
