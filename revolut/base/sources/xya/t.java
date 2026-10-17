package xya;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.AllReferralsScreenContract$InputData;
import com.revolut.feature.shared.referrals.ui.impl.R$string;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo8.j0;
import yp0.e0;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class t implements cli.n {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AllReferralsScreenContract$InputData f309695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tya.h f309696b;

    public t(AllReferralsScreenContract$InputData inputData, tya.h paginatedInvitesRenderer, tya.c inviteStatusUIMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(paginatedInvitesRenderer, "paginatedInvitesRenderer");
        Intrinsics.checkNotNullParameter(inviteStatusUIMapper, "inviteStatusUIMapper");
        this.f309695a = inputData;
        this.f309696b = paginatedInvitesRenderer;
    }

    public final List a(Data data, TextLocalisedClause textLocalisedClause) {
        return (List) iii.c.f(data, new xpe.c(this, textLocalisedClause, 29), new xx9.e(20), new wx6.k(this, textLocalisedClause, 23));
    }

    public final List b(Clause clause, List list) {
        if (clause != null) {
            return yp0.b.g(list, tya.c.j(clause), e0.OUTSIDE_BOX, 0, 0, 124);
        }
        yp0.b.k(list, 0, 0, 0, 0, 31);
        return list;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List listE0;
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.referrals_quick_help_all_invitees_title, null, null, 14);
        aim.e eVarB = u.b();
        l lVar = domainState.f309689a;
        if (lVar instanceof k) {
            ArrayList arrayList = new ArrayList(3);
            for (int i = 0; i < 3; i++) {
                arrayList.add(new pb0("LOADING_ITEM_ID"));
            }
            listE0 = b(null, arrayList);
        } else if (lVar instanceof i) {
            listE0 = a(((i) lVar).f309686a, null);
        } else if (lVar instanceof h) {
            h hVar = (h) lVar;
            listE0 = d0.E0(a(hVar.f309685b, new TextLocalisedClause(R$string.referrals_quick_help_all_invitees_past_invites_title, null, null, 14)), a(hVar.f309684a, new TextLocalisedClause(R$string.referrals_quick_help_all_invitees_active_invites_title, null, null, 14)));
        } else {
            if (!(lVar instanceof j)) {
                throw new NoWhenBranchMatchedException();
            }
            listE0 = (List) iii.c.f(((j) lVar).f309687a, new xw9.c(this, 14), new xx9.e(this, 19), new j0(this, 11));
        }
        eVarB.addAll(listE0);
        if (!(domainState.f309689a instanceof j)) {
            if (this.f309695a.f81920a != pwa.n.JUNIOR_TO_JUNIOR) {
                CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("I-cant-find-my-invitee", new TextLocalisedClause(R$string.referrals_quick_help_all_invitees_cant_find_invitee_title, null, null, 14), 0, false, null, null, new py0.a("I-cant-find-my-invitee"), 1020);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                eVarB.add(model);
            }
            if (domainState.f309690b) {
                eVarB.addAll(tya.c.g());
            }
        }
        return new r(u.a(eVarB), textLocalisedClause);
    }
}
