package eif;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.freelancer.common.models.payments.FreelancerPaymentReceipt;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubVatSummary;
import com.revolut.feature.insurance_car.impl.ui.flow.home.InsuranceCarHomeFlowContract$Step;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.driving_score_guide.DrivingScoreGuideScreen;
import com.revolut.feature_exchange.impl.ui.exchange.recurring_order_settings.RecurringOrderSettingsActivity;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.scroller.ScrollerFlowStep;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import efm.r;
import eki.n;
import ew1.m;
import f2i.b0;
import h93.f0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import nii.o0;
import nii.y0;
import nq.j0;
import pq7.i;
import te0.w;
import vkm.j2;
import yzc.p;
import z0f.a0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = 26;
        int i2 = 1;
        int i3 = 2;
        Continuation continuation = null;
        int i5 = 0;
        switch (this.f) {
            case 0:
                d0 p0 = (d0) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                d dVar = (d) this.receiver;
                dVar.getClass();
                ed7.e eVar = new ed7.e(new b(dVar, i2), 19);
                p0.getClass();
                ufm.i iVar = new ufm.i(p0, eVar, 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            case 1:
                d0 p03 = (d0) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                return k.a((k) this.receiver, p03);
            case 2:
                d0 p010 = (d0) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                return k.b((k) this.receiver, p010);
            case 3:
                d0 p011 = (d0) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                return k.a((k) this.receiver, p011);
            case 4:
                d0 p012 = (d0) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                return k.b((k) this.receiver, p012);
            case 5:
                d0 p013 = (d0) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                return k.a((k) this.receiver, p013);
            case 6:
                d0 p014 = (d0) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                return k.b((k) this.receiver, p014);
            case 7:
                ScrollerFlowStep p015 = (ScrollerFlowStep) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                return ((n) this.receiver).x(p015);
            case 8:
                Name p016 = (Name) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                return ((DeserializedClassDescriptor) this.receiver).c(p016);
            case 9:
                wn7.i p017 = (wn7.i) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                com.revolut.feature.insurance_car.impl.ui.flow.home.b bVar = (com.revolut.feature.insurance_car.impl.ui.flow.home.b) this.receiver;
                bVar.getClass();
                if (p017 instanceof wn7.g) {
                    bVar.E2(new InsuranceCarHomeFlowContract$Step.Onboarding(((wn7.g) p017).f298717a), true, null, false);
                } else {
                    if (!(p017 instanceof wn7.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.E2(new InsuranceCarHomeFlowContract$Step.Policy(((wn7.h) p017).f298718a), true, null, false);
                }
                return Unit.f186387a;
            case 10:
                pq7.i p018 = (pq7.i) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                com.revolut.feature.insurance_car.impl.ui.flow.smart_driving.a aVar = (com.revolut.feature.insurance_car.impl.ui.flow.smart_driving.a) this.receiver;
                aVar.getClass();
                if (!Intrinsics.f(p018, i.a.f238693a)) {
                    throw new NoWhenBranchMatchedException();
                }
                yji.l.g2(aVar, new DrivingScoreGuideScreen(), ModalDestination.Style.POPUP.f98311a, null, 2);
                return Unit.f186387a;
            case 11:
                Throwable p019 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.d dVar2 = (com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.d) this.receiver;
                dVar2.getClass();
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, p019, h0Var);
                dVar2.o.getClass();
                yji.l.b1(dVar2, dVar2.X1(new y0(null, vt4.b.a(), false, 5)), null, new ec8.c(dVar2, continuation, 25), 3);
                return Boolean.TRUE;
            case 12:
                Throwable p020 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar3 = (com.revolut.biometric_verification.impl.ui.flow.launcher.d) this.receiver;
                dVar3.getClass();
                return Boolean.valueOf(dVar3.R2(p020, new eq8.b(dVar3, new a76.c(0, dVar3, com.revolut.biometric_verification.impl.ui.flow.launcher.d.class, "fetchInitialInstruction", "fetchInitialInstruction()V", 0, 14))));
            case 13:
                Throwable p021 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                return Boolean.valueOf(com.revolut.biometric_verification.impl.ui.flow.launcher.d.L2((com.revolut.biometric_verification.impl.ui.flow.launcher.d) this.receiver, p021));
            case 14:
                Throwable p022 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                return Boolean.valueOf(com.revolut.biometric_verification.impl.ui.flow.launcher.d.L2((com.revolut.biometric_verification.impl.ui.flow.launcher.d) this.receiver, p022));
            case 15:
                j0 p023 = (j0) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                ((com.revolut.biometric_verification.impl.ui.flow.launcher.d) this.receiver).S2(p023);
                return Unit.f186387a;
            case 16:
                Throwable p024 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                return Boolean.valueOf(com.revolut.biometric_verification.impl.ui.flow.launcher.d.L2((com.revolut.biometric_verification.impl.ui.flow.launcher.d) this.receiver, p024));
            case 17:
                ty0.a p025 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                ((ihm.f) this.receiver).onNext(p025);
                return Unit.f186387a;
            case 18:
                ((od0.h) this.receiver).getClass();
                return od0.h.a((FreelancerPaymentReceipt) obj2);
            case 19:
                ((od0.h) this.receiver).getClass();
                return od0.h.a((TaxHubVatSummary) obj2);
            case 20:
                ((com.revolut.core.ui_kit.internal.views.timer.a) this.receiver).setTime(((Number) obj2).longValue());
                return Unit.f186387a;
            case 21:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "p0");
                m mVar = (m) this.receiver;
                mVar.f129996q.getClass();
                mVar.X1(sv1.d.a());
                return Boolean.TRUE;
            case 22:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "p0");
                m mVar2 = (m) this.receiver;
                mVar2.f129996q.getClass();
                mVar2.X1(sv1.d.a());
                return Boolean.TRUE;
            case 23:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "p0");
                m mVar3 = (m) this.receiver;
                mVar3.f129996q.getClass();
                mVar3.X1(sv1.d.a());
                return Boolean.TRUE;
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "p0");
                m mVar4 = (m) this.receiver;
                mVar4.f129996q.getClass();
                mVar4.X1(sv1.d.a());
                return Boolean.TRUE;
            case 25:
                f0 revolutCard = (f0) obj2;
                Intrinsics.checkNotNullParameter(revolutCard, "p0");
                z63.k kVar = (z63.k) this.receiver;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
                wg1.b bVar2 = kVar.f319674m;
                int i6 = 15;
                pfm.a aVar2 = new pfm.a(bVar2.b(), new z3e.a(new z63.f(kVar, i5), i6), 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                r rVarX = bVar2.a(revolutCard.f150110a).x();
                Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                int i21 = 18;
                d0 d0VarFirstOrError = aVar2.g(w.l(rVarX, m70.a.g(kVar.k.k(false), null, new a0(i21), 1))).firstOrError();
                z3e.a aVar3 = new z3e.a(new z1.c(kVar, revolutCard, i6), 17);
                d0VarFirstOrError.getClass();
                ufm.i iVar2 = new ufm.i(d0VarFirstOrError, aVar3, 0);
                Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                pfm.a aVar4 = new pfm.a(o70.a.i(iVar2).g(f9b.f.b(kVar.f319673l)), new z3e.a(new z63.f(kVar, i3), i21), 4);
                Intrinsics.checkNotNullExpressionValue(aVar4, "flatMapCompletable(...)");
                Function1 function1K = kVar.K();
                pfm.a aVar5 = new pfm.a(aVar4, new yma.h(2, new yma.w(new BreadcrumbException(), 29)), 2);
                Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
                ofm.h hVarW = aVar5.w(new o0(26, function1K), new p(3, z63.h.f319667a));
                Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                w.j0(kVar.f239031a, hVarW);
                return Unit.f186387a;
            case 26:
                NaviCommand p026 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p026, "p0");
                return ((ln.a) this.receiver).a(p026);
            case 27:
                dii.g p027 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(p027, "p0");
                com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b bVar3 = (com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b) this.receiver;
                bVar3.getClass();
                if (Intrinsics.f(p027, dii.e.f115068a)) {
                    List list = ((ezk.a) ((j2) bVar3.v.f22677a).getValue()).f130976c;
                    if (list != null) {
                        bVar3.l2(new esa.i(bVar3, list, continuation, 13), new yi5.b(i));
                    }
                } else if (p027 instanceof dii.c) {
                    bVar3.C1(new ExternalDestination.Browser(((dii.c) p027).f115066a.f275445a, null));
                }
                return Unit.f186387a;
            case 28:
                List p028 = (List) obj2;
                Intrinsics.checkNotNullParameter(p028, "p0");
                ((RecurringOrderSettingsActivity) ((f2i.l) this.receiver)).setItems(p028);
                return Unit.f186387a;
            default:
                f2i.g p029 = (f2i.g) obj2;
                Intrinsics.checkNotNullParameter(p029, "p0");
                return ((b0) ((f2i.k) this.receiver)).a(p029);
        }
    }
}
