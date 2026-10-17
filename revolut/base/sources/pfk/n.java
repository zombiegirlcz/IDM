package pfk;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f235660w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(s sVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f235660w = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n nVar = new n(this.f235660w, continuation, 0);
                nVar.v = obj2;
                return nVar;
            case 1:
                n nVar2 = new n(this.f235660w, continuation, 1);
                nVar2.v = obj2;
                return nVar2;
            case 2:
                n nVar3 = new n(this.f235660w, continuation, 2);
                nVar3.v = obj2;
                return nVar3;
            case 3:
                n nVar4 = new n(this.f235660w, continuation, 3);
                nVar4.v = obj2;
                return nVar4;
            case 4:
                n nVar5 = new n(this.f235660w, continuation, 4);
                nVar5.v = obj2;
                return nVar5;
            default:
                n nVar6 = new n(this.f235660w, continuation, 5);
                nVar6.v = obj2;
                return nVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((n) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        lha.m mVar;
        lha.l lVar;
        int i = this.u;
        hha.w0 w0Var = null;
        s sVar = this.f235660w;
        switch (i) {
            case 0:
                i iVar = (i) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                lfk.a aVar2 = (lfk.a) sVar.f235687c.T2(s.b(iVar.f235642b), s.o);
                if (aVar2 != null) {
                    return nfk.c.c(aVar2, iVar.f235641a);
                }
                return null;
            case 1:
                k kVar = (k) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                afk.c cVar = (afk.c) sVar.f235687c.T2(s.c(kVar), s.f235684p);
                if (cVar != null) {
                    return nfk.c.g(cVar);
                }
                return null;
            case 2:
                l lVar2 = (l) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                lfk.g gVar = (lfk.g) wp5.y.t(lfk.g.class, sVar.f235687c, lVar2.f235653c);
                if (gVar != null) {
                    return nfk.c.e(gVar);
                }
                return null;
            case 3:
                l lVar3 = (l) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.f235685a.remove(lVar3.f235653c);
                sVar.f235687c.I0(lVar3.f235653c);
                return Unit.f186387a;
            case 4:
                String str = (String) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                afk.c cVar2 = (afk.c) sVar.f235687c.T2(j6.a.q("FAMILY_PLAN_SUBSCRIBE_INFO_", str), s.f235684p);
                if (cVar2 != null) {
                    return nfk.c.g(cVar2);
                }
                return null;
            default:
                String str2 = (String) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                afk.b bVar = (afk.b) sVar.f235687c.T2(j6.a.q("MEMBER_ELIGIBILITY_CACHE_KEY_SUFFIX_", str2), s.f235682m);
                if (bVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                String state = bVar.getState();
                if (state != null) {
                    lha.m[] mVarArrValues = lha.m.values();
                    int length = mVarArrValues.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            mVar = mVarArrValues[i3];
                            if (!kotlin.text.a0.z(mVar.name(), state, true)) {
                                i3++;
                            }
                        } else {
                            mVar = null;
                        }
                    }
                    if (mVar != null) {
                        String reason = bVar.getReason();
                        if (reason != null) {
                            lha.l[] lVarArrValues = lha.l.values();
                            int length2 = lVarArrValues.length;
                            for (int i5 = 0; i5 < length2; i5++) {
                                lVar = lVarArrValues[i5];
                                if (!kotlin.text.a0.z(lVar.name(), reason, true)) {
                                }
                            }
                            lVar = null;
                        } else {
                            lVar = null;
                        }
                        String requiredPlanTier = bVar.getRequiredPlanTier();
                        if (requiredPlanTier != null) {
                            hha.w0[] w0VarArrValues = hha.w0.values();
                            int length3 = w0VarArrValues.length;
                            while (true) {
                                if (i2 < length3) {
                                    hha.w0 w0Var2 = w0VarArrValues[i2];
                                    if (kotlin.text.a0.z(w0Var2.name(), requiredPlanTier, true)) {
                                        w0Var = w0Var2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        }
                        return new lha.n(mVar, lVar, w0Var);
                    }
                }
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "FamilyPlanMemberEligibilityDto.toDomain", "state is null", null, h0Var);
                return null;
        }
    }
}
