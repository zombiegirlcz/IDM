package noi;

import do3.s;
import efm.r;
import ho.u;
import ho.v;
import ho.x;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mm0.p;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.analytics.tracking.impl.b f218062b;

    public /* synthetic */ m(com.revolut.retail.analytics.tracking.impl.b bVar, int i) {
        this.f218061a = i;
        this.f218062b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f218061a) {
            case 0:
                com.revolut.retail.analytics.tracking.impl.b bVar = this.f218062b;
                do3.n profile = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(profile, "profile");
                s sVar = profile.f116415m;
                if (sVar == s.WAITING || sVar == s.CONFIRMED) {
                    return efm.k.g(Boolean.TRUE);
                }
                soi.e eVar = bVar.d;
                eVar.getClass();
                rfm.d dVar = new rfm.d(new af.d(eVar, 7), 1);
                Intrinsics.checkNotNullExpressionValue(dVar, "defer(...)");
                return dVar;
            case 1:
                com.revolut.retail.analytics.tracking.impl.b bVar2 = this.f218062b;
                mm0.o oVar = (mm0.o) obj2;
                if (oVar instanceof p) {
                    String value = ((p) oVar).f207119b.f207120a;
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter(value, "$v$c$com-revolut-feature-identity-auth-domain-model-IndividualIdentityId$-individualId$0");
                    bVar2.l3(new u(value));
                } else if ((oVar instanceof mm0.m) && !Intrinsics.f(bVar2.f98554p, mm0.m.class)) {
                    bVar2.l3(new x());
                }
                bVar2.f98554p = oVar.getClass();
                return Unit.f186387a;
            case 2:
                com.revolut.retail.analytics.tracking.impl.b bVar3 = this.f218062b;
                do3.n profile2 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(profile2, "profile");
                s sVar2 = profile2.f116415m;
                if (sVar2 != s.WAITING && sVar2 != s.CONFIRMED) {
                    return zi0.c.q(bVar3.d.d.e(Unit.f186387a, w4l.j.f294644c), Boolean.FALSE);
                }
                r rVarJust = r.just(Boolean.TRUE);
                Intrinsics.h(rVarJust);
                return rVarJust;
            default:
                com.revolut.retail.analytics.tracking.impl.b bVar4 = this.f218062b;
                od0.i iVar = (od0.i) obj2;
                if (!iVar.d()) {
                    return Unit.f186387a;
                }
                mm0.o oVarD = ((cn0.g) bVar4.e).d();
                do3.n nVar = (do3.n) iVar.c();
                String value2 = nVar.f116409b;
                String value3 = nVar.f116408a;
                if (oVarD instanceof mm0.m) {
                    IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("User is not cleared after logout: id=", value3));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "Analytics", null, illegalStateException, h0Var);
                    return Unit.f186387a;
                }
                if (oVarD instanceof p) {
                    String str = ((p) oVarD).f207119b.f207120a;
                    if (value2 != null && !value2.equals(str)) {
                        s sVar3 = nVar.f116415m;
                        StringBuilder sbM = v0.a.m("Unexpected cached user: User(id=", value3, ",individualId=", value2, ",state=");
                        sbM.append(sVar3);
                        sbM.append(") Session(individualId=");
                        sbM.append(str);
                        sbM.append(")");
                        IllegalStateException illegalStateException2 = new IllegalStateException(sbM.toString());
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "Analytics", null, illegalStateException2, h0Var2);
                        return Unit.f186387a;
                    }
                }
                if (value2 != null) {
                    Intrinsics.checkNotNullParameter(value2, "value");
                } else {
                    value2 = null;
                }
                Intrinsics.checkNotNullParameter(value3, "value");
                bVar4.l3(new v(value2, value3));
                return Unit.f186387a;
        }
    }
}
