package r88;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m2j.y;
import r40.n0;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ prl.e f252390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f252391c;

    public /* synthetic */ k(prl.e eVar, String str, int i) {
        this.f252389a = i;
        this.f252390b = eVar;
        this.f252391c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f252389a) {
            case 0:
                prl.e eVar = this.f252390b;
                hj8.a aVar = (hj8.a) eVar.f239326c;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                String str = this.f252391c;
                w4l.h hVar = w4l.h.f294642c;
                return zBooleanValue ? nim.a.v(hj8.a.a(aVar, str, hVar), new n0(str, 6)) : boh.f.e(u0.m(rd0.e.b(osg.b.a((wsg.n) eVar.d, str, false, 4)), hj8.a.a(aVar, str, hVar)), new k(eVar, str, 1));
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                psg.a aVar2 = (psg.a) pair.f186385a;
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) pair.f186386b;
                return ta6.a.A(aVar2) ? nim.a.v(rd0.e.b(((kbb.c) this.f252390b.e).H()), new y(this.f252391c, juniorBankingProfile)) : new go.g(zi0.c.P(new h(juniorBankingProfile.f77099b), false, null, 3), 2);
        }
    }
}
