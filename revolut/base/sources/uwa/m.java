package uwa;

import bxa.r;
import bxa.v;
import bxa.w;
import bxa.x;
import bxa.y;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesRewardInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.InviteTransactionWidget;
import com.revolut.feature.referrals.common.data.api.domain.model.common.MaxRewardInfo;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f283585w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(q qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f283585w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m mVar = new m(this.f283585w, continuation, 0);
                mVar.v = obj2;
                return mVar;
            case 1:
                m mVar2 = new m(this.f283585w, continuation, 1);
                mVar2.v = obj2;
                return mVar2;
            case 2:
                m mVar3 = new m(this.f283585w, continuation, 2);
                mVar3.v = obj2;
                return mVar3;
            default:
                m mVar4 = new m(this.f283585w, continuation, 3);
                mVar4.v = obj2;
                return mVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m) create((f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((m) create((pwa.n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((m) create((j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m) create((k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        w wVar;
        w wVar2;
        pwa.o oVar;
        Iterator it8;
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo;
        int i = this.u;
        q qVar = this.f283585w;
        switch (i) {
            case 0:
                f fVar = (f) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVar = (y) j6.a.k(y.class, qVar.f283589a, q.l(fVar));
                if (yVar != null) {
                    return cxa.b.a(yVar);
                }
                return null;
            case 1:
                pwa.n nVar = (pwa.n) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bxa.n nVar2 = (bxa.n) j6.a.k(bxa.n.class, qVar.f283589a, q.i(nVar));
                if (nVar2 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(nVar2, "<this>");
                r maxRewardInfo = nVar2.getMaxRewardInfo();
                MaxRewardInfo maxRewardInfo2 = maxRewardInfo != null ? new MaxRewardInfo(maxRewardInfo.getMaxReferrerRewards(), maxRewardInfo.getIsMaxRewardEarned()) : null;
                bxa.d totalRewardEarned = nVar2.getTotalRewardEarned();
                return new pwa.g(maxRewardInfo2, totalRewardEarned != null ? c6d.b.H(totalRewardEarned) : null);
            case 2:
                j jVar = (j) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (jVar.f283579a != null || (wVar = (w) j6.a.k(w.class, qVar.f283589a, q.k(jVar))) == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(wVar, "<this>");
                List invites = wVar.getInvites();
                ArrayList arrayList = new ArrayList(zhm.w.t(invites, 10));
                Iterator it9 = invites.iterator();
                while (it9.hasNext()) {
                    v vVar = (v) it9.next();
                    String id10 = vVar.getId();
                    String firstName = vVar.getFirstName();
                    String lastName = vVar.getLastName();
                    pwa.i iVar = (pwa.i) u1.u(vVar.getType(), a.f283565c);
                    pwa.b bVar = (pwa.b) u1.u(vVar.getStatus(), mwa.a.f209420a);
                    String rewardType = vVar.getRewardType();
                    pwa.o[] oVarArrValues = pwa.o.values();
                    int length = oVarArrValues.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            oVar = oVarArrValues[i2];
                            wVar2 = wVar;
                            if (!a0.z(oVar.name(), rewardType, true)) {
                                i2++;
                                wVar = wVar2;
                            }
                        } else {
                            wVar2 = wVar;
                            oVar = null;
                        }
                    }
                    if (oVar == null) {
                        oVar = pwa.o.MONEY;
                    }
                    pwa.o oVar2 = oVar;
                    String ineligibilityReason = vVar.getIneligibilityReason();
                    bxa.m stepsInfo = vVar.getStepsInfo();
                    pwa.f fVar2 = stepsInfo != null ? new pwa.f(stepsInfo.getTotalSteps(), stepsInfo.getCompletedSteps()) : null;
                    x rewardEarned = vVar.getRewardEarned();
                    if (rewardEarned != null) {
                        it8 = it9;
                        long amount = rewardEarned.getAmount();
                        xi0.a aVar4 = xi0.b.Companion;
                        String currency = rewardEarned.getCurrency();
                        aVar4.getClass();
                        dj0.d dVar = new dj0.d(amount, xi0.a.a(currency));
                        String targetCurrency = rewardEarned.getTargetCurrency();
                        activeOrPastInvitesRewardInfo = new ActiveOrPastInvitesRewardInfo(dVar, rewardEarned.getTitle(), rewardEarned.getSubtitle(), targetCurrency != null ? xi0.a.a(targetCurrency) : null);
                    } else {
                        it8 = it9;
                        activeOrPastInvitesRewardInfo = null;
                    }
                    Long deadline = vVar.getDeadline();
                    Instant instantOfEpochMilli = deadline != null ? Instant.ofEpochMilli(deadline.longValue()) : null;
                    Instant instantOfEpochMilli2 = Instant.ofEpochMilli(vVar.getCreatedDate());
                    Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(...)");
                    arrayList.add(new pwa.j(id10, firstName, lastName, iVar, bVar, oVar2, ineligibilityReason, fVar2, activeOrPastInvitesRewardInfo, instantOfEpochMilli, instantOfEpochMilli2, vVar.getInviteeRevtag()));
                    wVar = wVar2;
                    it9 = it8;
                }
                return new pwa.k(wVar.getNextCursor(), arrayList);
            default:
                k kVar = (k) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bxa.p pVar = (bxa.p) j6.a.k(bxa.p.class, qVar.f283589a, q.m(kVar));
                if (pVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(pVar, "<this>");
                String title = pVar.getTitle();
                String subtitle = pVar.getSubtitle();
                bxa.a cta2 = pVar.getCta();
                Intrinsics.checkNotNullParameter(cta2, "<this>");
                return new InviteTransactionWidget(title, subtitle, new InviteTransactionWidget.Action(cta2.getTitle(), cta2.getDeeplink()));
        }
    }
}
