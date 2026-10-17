package f7l;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class h extends q implements Function1 {
    public static final h f = new h();

    public h() {
        super(1, i7l.b.class, "toDomain", "toDomain(Lcom/revolut/shared/feature/configuration/impl/network/models/ConfigBaseEntity;)Lcom/revolut/shared/feature/configuration/api/models/Config;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        j7l.d p0 = (j7l.d) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return i7l.b.d(p0);
    }
}
