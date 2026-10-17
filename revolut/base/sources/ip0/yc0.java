package ip0;

import android.content.Context;
import com.revolut.chat.domain.model.draft.SelectedUploadDraft;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.LoanCancellationV2FlowContract$State;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.LoanCancellationV2FlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.cashback.flow.FreelancerCashbackFlowContract$Step;
import com.revolut.feature.insurance_pet.impl.ui.profile.document.PetPolicyDocumentActivity;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nv6.m;
import rv3.b;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class yc0 extends kotlin.jvm.internal.q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yc0(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = 22;
        int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.f) {
            case 0:
                List p0 = (List) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((ihm.f) this.receiver).onNext(p0);
                return Unit.f186387a;
            case 1:
                qv0.p p03 = (qv0.p) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                iwk.e eVar = (iwk.e) this.receiver;
                eVar.getClass();
                Object i3 = p03.getF();
                iwk.k kVar = i3 instanceof iwk.k ? (iwk.k) i3 : null;
                return Boolean.valueOf(Intrinsics.f(kVar != null ? kVar.D() : null, eVar.f169182h));
            case 2:
                List p010 = (List) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                ((BaseLayoutBuilderFragment) ((iwk.m) this.receiver)).setItems(p010);
                return Unit.f186387a;
            case 3:
                return Integer.valueOf(kli.a.s(((Number) obj2).intValue(), (Context) this.receiver));
            case 4:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                iyl.c cVar = (iyl.c) this.receiver;
                if (zBooleanValue) {
                    cVar.f169792q = true;
                    cVar.d();
                } else {
                    cVar.f169786h.onNext(new iyl.f("Globe load command failed", "GlobeView"));
                }
                return Unit.f186387a;
            case 5:
                Throwable p011 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                j5g.d dVar = (j5g.d) this.receiver;
                dVar.getClass();
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "TravelFlightsChatRedirectScreenModel", "Failed to obtain the support chat redirect URL", p011, h0Var);
                yji.l.a1(dVar, dVar.X1(new nii.y0(null, new nii.z(new TextLocalisedClause(R$string.travel_flights_checkout_error_generic_title, null, null, 14), new TextLocalisedClause(R$string.travel_flights_checkout_error_generic_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5)), null, null, null, 7);
                return Boolean.TRUE;
            case 6:
                ib3.a p012 = (ib3.a) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                ((jb3.d) this.receiver).a(p012);
                return Unit.f186387a;
            case 7:
                ib3.a p013 = (ib3.a) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                ((jb3.a) this.receiver).getClass();
                return jb3.a.b(p013);
            case 8:
                ib3.a p014 = (ib3.a) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                ((jb3.d) this.receiver).a(p014);
                return Unit.f186387a;
            case 9:
                ib3.a p015 = (ib3.a) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                ((jb3.a) this.receiver).getClass();
                return jb3.a.b(p015);
            case 10:
                Throwable p016 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                com.revolut.feature.address.common.impl.flow.screen.find.b bVar = (com.revolut.feature.address.common.impl.flow.screen.find.b) this.receiver;
                bVar.H2(bVar.u, new ab4.q(p016, i));
                return Boolean.TRUE;
            case 11:
                Throwable p017 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                com.revolut.feature.address.common.impl.flow.screen.find.b bVar2 = (com.revolut.feature.address.common.impl.flow.screen.find.b) this.receiver;
                bVar2.H2(bVar2.u, new ab4.q(p017, i));
                return Boolean.TRUE;
            case 12:
                Throwable p018 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                joa.i iVar = (joa.i) this.receiver;
                v60.e eVar2 = iVar.G;
                ServerError serverErrorA = iVar.F.a(p018);
                v60.d dVarB = ((ao0.a) eVar2).b(Integer.valueOf(serverErrorA != null ? serverErrorA.f51362a : 1));
                if (dVarB == null) {
                    dVarB = new v60.b();
                }
                iVar.X1(new nii.y0(null, new nii.z(ofm.q.O(dVarB), null, new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 5));
                return Boolean.TRUE;
            case 13:
                nv6.m p019 = (nv6.m) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                com.revolut.feature.freelancer.impl.ui.cashback.flow.c cVar2 = (com.revolut.feature.freelancer.impl.ui.cashback.flow.c) this.receiver;
                yki.i iVar2 = cVar2.f73748t;
                if (Intrinsics.f(p019, m.a.f219522a)) {
                    oki.h.D2(iVar2);
                } else {
                    int i5 = 6;
                    if (Intrinsics.f(p019, m.b.f219523a)) {
                        cVar2.n2(new jv6.g(cVar2, objArr2 == true ? 1 : 0, i2), new whi.b(i5));
                    } else if (Intrinsics.f(p019, m.d.f219525a)) {
                        oki.h.t2(cVar2, iVar2, FreelancerCashbackFlowContract$Step.Plan.f73742a, true, null, false, 12);
                    } else if (Intrinsics.f(p019, m.c.f219524a)) {
                        cVar2.n2(new jv6.g(cVar2, objArr == true ? 1 : 0, i), new whi.b(i5));
                    } else if (p019 instanceof nv6.n) {
                        cVar2.K2(((nv6.n) p019).f219526a);
                    } else {
                        if (!(p019 instanceof nv6.o)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar2.J2(((nv6.o) p019).f219527a);
                    }
                }
                return Unit.f186387a;
            case 14:
                lv6.o p020 = (lv6.o) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                com.revolut.feature.freelancer.impl.ui.cashback.flow.c cVar3 = (com.revolut.feature.freelancer.impl.ui.cashback.flow.c) this.receiver;
                cVar3.getClass();
                if (p020 instanceof lv6.m) {
                    cVar3.K2(((lv6.m) p020).f200332a);
                } else {
                    if (!(p020 instanceof lv6.n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar3.J2(((lv6.n) p020).f200333a);
                }
                return Unit.f186387a;
            case 15:
                rv6.o p021 = (rv6.o) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                com.revolut.feature.freelancer.impl.ui.cashback.flow.c cVar4 = (com.revolut.feature.freelancer.impl.ui.cashback.flow.c) this.receiver;
                cVar4.getClass();
                if (p021 instanceof rv6.m) {
                    cVar4.K2(((rv6.m) p021).f257704a);
                } else {
                    if (!(p021 instanceof rv6.n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar4.J2(((rv6.n) p021).f257705a);
                }
                return Unit.f186387a;
            case 16:
                return ((et6.u0) this.receiver).a((Continuation) obj2);
            case 17:
                NaviCommand p022 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                ((sri.m) this.receiver).c(p022);
                return Unit.f186387a;
            case 18:
                List p023 = (List) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                ((ihm.f) this.receiver).onNext(p023);
                return Unit.f186387a;
            case 19:
                NaviCommand p024 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                ((sri.m) this.receiver).c(p024);
                return Unit.f186387a;
            case 20:
                NaviCommand p025 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                ((sri.m) this.receiver).c(p025);
                return Unit.f186387a;
            case 21:
                NaviCommand p026 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p026, "p0");
                ((sri.m) this.receiver).c(p026);
                return Unit.f186387a;
            case 22:
                ste.j p027 = (ste.j) obj2;
                Intrinsics.checkNotNullParameter(p027, "p0");
                jze.b bVar3 = (jze.b) this.receiver;
                if (p027 instanceof ste.h) {
                    bVar3.C2(p027);
                } else {
                    bVar3.C2(p027);
                    oki.h.D2(bVar3.f179800r);
                }
                return Unit.f186387a;
            case 23:
                ste.j p028 = (ste.j) obj2;
                Intrinsics.checkNotNullParameter(p028, "p0");
                jze.b bVar4 = (jze.b) this.receiver;
                if (p028 instanceof ste.h) {
                    bVar4.C2(p028);
                } else {
                    bVar4.C2(p028);
                    oki.h.D2(bVar4.f179800r);
                }
                return Unit.f186387a;
            case 24:
                List p029 = (List) obj2;
                Intrinsics.checkNotNullParameter(p029, "p0");
                ((PetPolicyDocumentActivity) ((k08.c) this.receiver)).setItems(p029);
                return Unit.f186387a;
            case 25:
                ((od0.h) this.receiver).getClass();
                return od0.h.a((vl4.u) obj2);
            case 26:
                o30.c p030 = (o30.c) obj2;
                Intrinsics.checkNotNullParameter(p030, "p0");
                k50.j4 j4Var = (k50.j4) this.receiver;
                cli.y yVar = j4Var.f181140w0;
                o30.c.Companion.getClass();
                if (p030 != o30.c.f221671c && !p030.f221672a.b()) {
                    k50.o0 o0Var = ((k50.h0) ((vkm.j2) yVar.f22677a).getValue()).e;
                    if (o0Var.f181192a.length() == 0 && o0Var.f181194c == null && o0Var.f.isEmpty() && o0Var.f181195g == null) {
                        List<SelectedUploadDraft> list = p030.f221672a.d;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (SelectedUploadDraft selectedUploadDraft : list) {
                            arrayList.add(new v20.u0(new File(selectedUploadDraft.f51101a), selectedUploadDraft.f51102b));
                        }
                        j4Var.H2(yVar, new k1.a(p030, arrayList, 20));
                    }
                }
                return Unit.f186387a;
            case 27:
                Throwable p031 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p031, "p0");
                ((k50.j4) this.receiver).getClass();
                zhm.h0 h0Var2 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.WARNING, null, null, p031, h0Var2);
                return Boolean.TRUE;
            case 28:
                rv3.b p032 = (rv3.b) obj2;
                Intrinsics.checkNotNullParameter(p032, "p0");
                com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a aVar = (com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a) this.receiver;
                yki.i iVar3 = aVar.u;
                if (p032 instanceof rv3.c) {
                    ht3.a aVar2 = ((rv3.c) p032).f257693b;
                    if (aVar2 == z45.a.PROCEED) {
                        oki.h.t2(aVar, iVar3, LoanCancellationV2FlowContract$Step.Confirmation.f70373a, false, null, false, 14);
                    } else if (aVar2 == z45.a.KEEP_LOAN || aVar2 == z45.a.CLOSE) {
                        oki.h.D2(iVar3);
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("Unsupported loan cancellation action: " + aVar2);
                        zhm.h0 h0Var3 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var3);
                        oki.h.D2(iVar3);
                    }
                } else if (p032 instanceof b.a) {
                    oki.h.D2(iVar3);
                } else {
                    if (!(p032 instanceof b.C1428b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i6 = jli.h.f175850a;
                }
                return Unit.f186387a;
            default:
                i65.n p033 = (i65.n) obj2;
                Intrinsics.checkNotNullParameter(p033, "p0");
                com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a aVar3 = (com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a) this.receiver;
                yki.i iVar4 = aVar3.u;
                if (p033 instanceof i65.m) {
                    String str = ((LoanCancellationV2FlowContract$State) ((vkm.j2) aVar3.f70380t.f22677a).getValue()).f70371a;
                    if (str == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    z45.e eVar3 = aVar3.K2().f319317c;
                    if (eVar3 == null) {
                        oki.h.D2(iVar4);
                    } else {
                        aVar3.l2(new k0g.b(aVar3, eVar3, str, (Continuation) null, 15), new k65.d(1, aVar3, com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a.class, "handleErrorAndQuit", "handleErrorAndQuit(Ljava/lang/Throwable;)Z", 0, 0));
                    }
                } else {
                    if (!(p033 instanceof i65.l)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(iVar4);
                }
                return Unit.f186387a;
        }
    }
}
