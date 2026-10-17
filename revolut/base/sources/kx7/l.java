package kx7;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.q implements Function1 {
    public static final l f = new l();

    public l() {
        super(1, hx7.d.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List p0 = (List) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return hx7.d.a(p0);
    }
}
