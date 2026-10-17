package uk9;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i extends q implements Function1 {
    public static final i f = new i();

    public i() {
        super(1, u0.class, "filterInProgress", "filterInProgress(Ljava/util/List;)Ljava/util/List;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List p0 = (List) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return u0.n(p0);
    }
}
