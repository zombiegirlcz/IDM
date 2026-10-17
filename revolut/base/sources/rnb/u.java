package rnb;

import android.graphics.Canvas;
import com.revolut.chat.data.repository.chat.AgentInfo;
import com.revolut.chat.domain.model.AgentPresenceState;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.feature.insurance.api.navigation.CFACInsuranceFeatureConfig;
import com.revolut.feature.insurance_embedded.impl.ui.flow.coverage.CoverageFlowContract$Step;
import com.revolut.feature.insurance_pet.impl.ui.edit.planeditor.PetEditQuoteActivity;
import com.revolut.feature.insurance_pet.impl.ui.profile.plan.PetPolicyDetailsActivity;
import com.revolut.feature.junior_profile.impl.ui.flow.details.JuniorProfileDetailsFlowContract$Step;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.trading.managed_portfolios.impl.domain.template.model.TemplateIntro;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import ffk.c0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m20.a;
import nii.y0;
import nii.z;
import org.joda.time.Instant;
import org.joda.time.Period;
import sa6.y;
import sbb.a0;
import skm.i1;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u extends kotlin.jvm.internal.q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.revolut.chat.domain.model.AgentPresenceState] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ArrayList arrayList;
        int i = 1;
        int i2 = 5;
        ?? agentPresenceState = 0;
        agentPresenceState = 0;
        agentPresenceState = 0;
        switch (this.f) {
            case 0:
                List p0 = (List) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((v) this.receiver).e(p0);
            case 1:
                List p03 = (List) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                return ((v) this.receiver).e(p03);
            case 2:
                PopupMenuItem p010 = (PopupMenuItem) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                ((ihm.f) this.receiver).onNext(p010);
                return Unit.f186387a;
            case 3:
                mw0.f p011 = (mw0.f) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                ((ihm.f) this.receiver).onNext(p011);
                return Unit.f186387a;
            case 4:
                ((od0.h) this.receiver).getClass();
                return od0.h.a((SavingsProductData) obj2);
            case 5:
                ((od0.h) this.receiver).getClass();
                return od0.h.a((ejb.e) obj2);
            case 6:
                Throwable p012 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                return ((vyd.a) ((byd.a) this.receiver)).c(p012);
            case 7:
                List p013 = (List) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                ((ihm.f) this.receiver).onNext(p013);
                return Unit.f186387a;
            case 8:
                NaviCommand p014 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                ((sri.m) this.receiver).c(p014);
                return Unit.f186387a;
            case 9:
                av7.g p015 = (av7.g) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                com.revolut.feature.insurance_embedded.impl.ui.flow.coverage.a aVar = (com.revolut.feature.insurance_embedded.impl.ui.flow.coverage.a) this.receiver;
                aVar.getClass();
                if (!(p015 instanceof av7.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                av7.f fVar = (av7.f) p015;
                String str = fVar.f9930a;
                dl7.a aVar2 = fVar.f9931b;
                int i3 = ru7.b.f257460a[aVar2.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    aVar.C1(new BridgeDestination(new FeatureCommand(new CFACInsuranceFeatureConfig.Details(str, new dl7.b(aVar2, fVar.f9932c, null), null))));
                } else {
                    aVar.E2(new CoverageFlowContract$Step.Detail(str, aVar2), true, null, false);
                }
                return Unit.f186387a;
            case 10:
                Canvas p016 = (Canvas) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                InputText.n0((InputText) this.receiver, p016);
                return Unit.f186387a;
            case 11:
                ty0.a p017 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                ((ihm.k) this.receiver).onNext(p017);
                return Unit.f186387a;
            case 12:
                List p018 = (List) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                ((rx7.e) this.receiver).setItems(p018);
                return Unit.f186387a;
            case 13:
                ((iqi.b) ((iqi.h) this.receiver)).Z(((Boolean) obj2).booleanValue());
                return Unit.f186387a;
            case 14:
                List p019 = (List) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                ((PetEditQuoteActivity) ((ry7.d) this.receiver)).setItems(p019);
                return Unit.f186387a;
            case 15:
                String p020 = (String) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                ((cya.f) this.receiver).a2(p020);
                return Unit.f186387a;
            case 16:
                List p021 = (List) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                ((PetPolicyDetailsActivity) ((s08.d) this.receiver)).setItems(p021);
                return Unit.f186387a;
            case 17:
                m20.a dto = (m20.a) obj2;
                Intrinsics.checkNotNullParameter(dto, "p0");
                ((y10.b) ((y10.a) this.receiver)).getClass();
                Intrinsics.checkNotNullParameter(dto, "dto");
                UUID uuidI = dto.getId();
                String strJ = dto.getName();
                String strM = dto.getShortName();
                String strO = dto.getTitle();
                Float fL = dto.getRating();
                Long lD = dto.getChats();
                Instant instantG = dto.getFirstMessage();
                Period periodP = dto.getTotalResolution();
                Period periodH = dto.getFirstResponse();
                String strB = dto.getAvatarUrl();
                Integer numR = dto.getWowReviews();
                Integer numQ = dto.getTotalReviews();
                Period periodN = dto.getTenure();
                List listE = dto.getCompliments();
                if (listE != null) {
                    List<a.C1144a> list = listE;
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                    for (a.C1144a c1144a : list) {
                        arrayList2.add(new AgentInfo.Compliment(c1144a.getLabel(), c1144a.getIconUrl(), c1144a.getAssetUrl(), c1144a.getCount(), c1144a.getTop()));
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                boolean zS = dto.getIsBot();
                String strF = dto.getEmail();
                String strC = dto.getBio();
                v30.c cVarA = dto.getAgentOnlineSessionState();
                m20.b bVarK = dto.getPresenceState();
                if (bVarK != null) {
                    String key = bVarK.getValue();
                    Instant availableAt = bVarK.getAvailableAt();
                    if (key != null) {
                        v30.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        v30.e eVar = (v30.e) v30.e.mapping.get(key);
                        if (eVar != null) {
                            agentPresenceState = new AgentPresenceState(eVar, availableAt);
                        }
                    }
                }
                return new AgentInfo(uuidI, strJ, strM, zS, strB, strO, strF, strC, fL, lD, instantG, periodP, periodH, numR, numQ, periodN, arrayList, cVarA, agentPresenceState);
            case 18:
                String p022 = (String) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                return (TemplateIntro) ((s5f.b) this.receiver).d.get(tz4.d.b(p022));
            case 19:
                Throwable p023 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                sai.k kVar = (sai.k) this.receiver;
                kVar.H2(kVar.u, new y(i2));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, p023, h0Var);
                return Boolean.FALSE;
            case 20:
                Throwable p024 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                ((sbb.o) this.receiver).getClass();
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, p024, h0Var2);
                return Boolean.TRUE;
            case 21:
                File p025 = (File) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                a0 a0Var = (a0) this.receiver;
                a0Var.A2(new BridgeDestination(a0Var.f261530p.b(p025)));
                return Unit.f186387a;
            case 22:
                File p026 = (File) obj2;
                Intrinsics.checkNotNullParameter(p026, "p0");
                a0 a0Var2 = (a0) this.receiver;
                a0Var2.A2(new BridgeDestination(a0Var2.f261530p.a(p026)));
                return Unit.f186387a;
            case 23:
                return ((tm.g) this.receiver).a((mm.g) obj2);
            case 24:
                Throwable p027 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p027, "p0");
                sf9.g gVar = (sf9.g) this.receiver;
                yji.n.j2(gVar, gVar.L2(((wp1.a) gVar.f262378q).a(p027)), null, new sek.q(gVar, agentPresenceState, i), 3);
                return Boolean.TRUE;
            case 25:
                return ((c0) ((cha.c) this.receiver)).d((Continuation) obj2);
            case 26:
                wj8.r p028 = (wj8.r) obj2;
                Intrinsics.checkNotNullParameter(p028, "p0");
                com.revolut.feature.junior_profile.impl.ui.flow.details.a aVar3 = (com.revolut.feature.junior_profile.impl.ui.flow.details.a) this.receiver;
                yki.a aVar4 = aVar3.f77140r;
                if (p028 instanceof wj8.p) {
                    oki.h.t2(aVar3, aVar4, JuniorProfileDetailsFlowContract$Step.UpdateMail.f77135a, true, null, false, 12);
                } else if (p028 instanceof wj8.o) {
                    oki.h.w2(aVar4, JuniorProfileDetailsFlowContract$Step.UpdateGender.f77134a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else {
                    boolean z = p028 instanceof wj8.n;
                    ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                    if (z) {
                        oki.h.w2(aVar4, new JuniorProfileDetailsFlowContract$Step.Workflow(((wj8.n) p028).f298012a), popup);
                    } else {
                        if (!(p028 instanceof wj8.q)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oki.h.w2(aVar4, new JuniorProfileDetailsFlowContract$Step.UpdatePersonalDataManagementConsent(((wj8.q) p028).f298015a.f304101a), popup);
                    }
                }
                return Unit.f186387a;
            case 27:
                ((i1) this.receiver).j((Throwable) obj2);
                return Unit.f186387a;
            case 28:
                Throwable p029 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p029, "p0");
                com.revolut.feature.profile.impl.ui.details.email.c cVar = (com.revolut.feature.profile.impl.ui.details.email.c) this.receiver;
                v60.e eVar2 = cVar.f81388s;
                ServerError serverErrorA = cVar.f81387r.a(p029);
                v60.d dVarB = ((ao0.a) eVar2).b(serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null);
                if (dVarB == null) {
                    dVarB = new v60.b();
                }
                yji.l.a1(cVar, cVar.X1(new y0(null, new z(new TextLocalisedClause(R.string.email_verification_status_error_title, null, null, 14), ofm.q.O(dVarB), new TextLocalisedClause(R.string.common_action_close, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5)), null, null, new se4.c(cVar, agentPresenceState, 12), 3);
                return Boolean.TRUE;
            default:
                ptf.f p030 = (ptf.f) obj2;
                Intrinsics.checkNotNullParameter(p030, "p0");
                com.revolut.feature.transfer_reasons.impl.flow.refund.b bVar = (com.revolut.feature.transfer_reasons.impl.flow.refund.b) this.receiver;
                bVar.getClass();
                bVar.l2(new sbb.w(bVar, p030, agentPresenceState, 24), new yi5.b(26));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(i1 i1Var) {
        super(1, 0, i1.class, i1Var, "invoke", "invoke(Ljava/lang/Throwable;)V");
        this.f = 27;
    }
}
