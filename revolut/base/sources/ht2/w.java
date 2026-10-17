package ht2;

import cli.y;
import com.revolut.business.feature.referrals.model.RewardTargetAccount;
import com.revolut.data.model.Data;
import com.revolut.feature.business.referrals.ui.screens.eligibility_criteria.EligibilityCriteriaScreen;
import com.revolut.feature.business.referrals.ui.screens.eligibility_criteria.EligibilityCriteriaScreenContract$InputData;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import ht2.j;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import rp0.k1;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class w extends oki.h implements n {

    @NotNull
    public static final t Companion = new t();
    public final vu.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n5j.i f155245p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c70.a f155246q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g1 f155247r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zs2.b f155248s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f155249t;

    public w(vu.d referralWithIncentiveCampaignRepository, n5j.i c2BReferralProvider, c70.a clipboard, g1 shotDialogDisplayer, zs2.b promptFactory, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(referralWithIncentiveCampaignRepository, "referralWithIncentiveCampaignRepository");
        Intrinsics.checkNotNullParameter(c2BReferralProvider, "c2BReferralProvider");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(promptFactory, "promptFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = referralWithIncentiveCampaignRepository;
        this.f155245p = c2BReferralProvider;
        this.f155246q = clipboard;
        this.f155247r = shotDialogDisplayer;
        this.f155248s = promptFactory;
        this.f155249t = mra.d.b(this, new i(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), false, null, false, null, false), stateMapper, null, false, 12);
    }

    public final void I2() {
        rs2.n nVar = (rs2.n) this.o;
        x4l.c cVar = nVar.d;
        Unit unit = Unit.f186387a;
        Continuation continuation = null;
        yji.l.b1(this, cVar.c(unit, true), null, new hg0.n(this, continuation, 23), 3);
        yji.l.b1(this, nVar.e.c(unit, true), null, new v(this, continuation, 1), 3);
        yji.l.b1(this, nVar.f.c(unit, true), null, new v(this, continuation, 2), 3);
    }

    public final void J2() {
        String strDecode;
        y yVar = this.f155249t;
        ru.y yVar2 = (ru.y) ((i) ((j2) yVar.f22677a).getValue()).f155221a.getContent();
        if (yVar2 == null) {
            return;
        }
        String str = yVar2.d;
        if (!((i) ((j2) yVar.f22677a).getValue()).f155225h) {
            C2(new l(str, yVar2.k, yVar2.f257387a));
            return;
        }
        try {
            strDecode = URLDecoder.decode(str, StandardCharsets.UTF_8.name());
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            strDecode = null;
        }
        if (strDecode != null) {
            str = strDecode;
        }
        this.f155246q.a(null, str, false);
        if (c70.a.g()) {
            return;
        }
        ((k1) this.f155247r).d(((zs2.c) this.f155248s).a());
    }

    public final void K2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "INACTIVE_INVITEES_LIST_ID")) {
            C2(j.b.f155227a);
            return;
        }
        if (obj2 instanceof ru.a) {
            C2(new k(((ru.a) obj2).f257350a));
            return;
        }
        if (Intrinsics.f(listId, "TERMS_AND_CONDITIONS_LIST_ID")) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.String");
            C1(new ExternalDestination.Browser((String) obj2, null));
        } else if (obj2 instanceof RewardTargetAccount) {
            C2(new m((RewardTargetAccount) obj2));
        } else if (obj2 instanceof ru.v) {
            yji.l.j2(this, new EligibilityCriteriaScreen(new EligibilityCriteriaScreenContract$InputData(((ru.v) obj2).e)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        } else if (Intrinsics.f(listId, "RETAIL_REFERRAL_REWARD_LIST_ID")) {
            C2(j.c.f155228a);
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        I2();
        Continuation continuation = null;
        n2(new u(this, continuation, 1), new whi.b(6));
        this.f155245p.getClass();
        yji.l.b1(this, vkm.q.Q(new go.g(Boolean.TRUE, 2), new hcj.o(continuation, this, 12)), new d4f.m(2, 29, continuation), new v(this, continuation, 0), 2);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f155249t;
    }
}
