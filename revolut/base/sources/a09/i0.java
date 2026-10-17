package a09;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u09.p0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i0 extends kotlin.jvm.internal.q implements Function1 {
    public static final i0 f = new i0();

    public i0() {
        super(1, nz8.j.class, "toDomain", "toDomain(Lcom/revolut/feature/learn/shared/impl/data/network/dto/reward/TotalEarnedRewardsInfoDto;)Lcom/revolut/feature/learn/shared/models/domain/LearnTotalEarnedRewardsInfo;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        dj0.d dVar;
        zz8.f p0 = (zz8.f) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        pz8.e eVar = p0.f326594a;
        if (eVar != null) {
            long j2 = eVar.f240912a;
            xi0.a aVar = xi0.b.Companion;
            String str = eVar.f240913b;
            aVar.getClass();
            dVar = new dj0.d(j2, xi0.a.a(str));
        } else {
            dVar = null;
        }
        return new p0(dVar);
    }
}
