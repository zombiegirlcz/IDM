package vdl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class q1 extends kotlin.jvm.internal.q implements Function1 {
    public static final q1 f = new q1();

    public q1() {
        super(1, edl.a.class, "toDomain", "toDomain(Lcom/revolut/shared/feature/wealth/domain/impl/data/network/model/statements/StatementStatusDto;)Lcom/revolut/shared/feature/wealth/domain/api/domain/model/Statement;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        rdl.a p0 = (rdl.a) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return edl.a.E(p0);
    }
}
