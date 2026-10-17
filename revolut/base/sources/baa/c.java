package baa;

import aii.q;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.utils.ViewIdTarget;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.feature.contacts.impl.ui.contact.flow.ContactFlowContract$Step;
import com.revolut.feature.pix.impl.flow.automatico.PixAutomaticoContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.transition.ProfileCardTransitionAnimation;
import dm3.g;
import dm3.i;
import jk6.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mba.e;
import o27.m;
import o27.n;
import o27.o;
import oba.d;
import oki.h;
import sa2.f;
import ste.e;
import yki.l;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f14004b;

    public /* synthetic */ c(h hVar, l lVar, int i) {
        this.f14003a = i;
        this.f14004b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f14003a) {
            case 0:
                d it8 = (d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                h.D2(this.f14004b);
                return Unit.f186387a;
            case 1:
                e it9 = (e) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                h.D2(this.f14004b);
                return Unit.f186387a;
            case 2:
                uba.d it10 = (uba.d) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                h.D2(this.f14004b);
                return Unit.f186387a;
            case 3:
                eqh.h output = (eqh.h) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!Intrinsics.f(output, eqh.h.f128464a)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.D2(this.f14004b);
                return Unit.f186387a;
            case 4:
                hx2.b it11 = (hx2.b) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                h.D2(this.f14004b);
                return Unit.f186387a;
            case 5:
                i result = (i) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean zF = Intrinsics.f(result, g.f115837a);
                l lVar = this.f14004b;
                if (zF) {
                    h.D2(lVar);
                } else {
                    if (!(result instanceof dm3.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ContactFlowContract$Step.ProfileCard profileCard = new ContactFlowContract$Step.ProfileCard(((dm3.h) result).f115838a);
                    NavBarLargeCentred.INSTANCE.getClass();
                    h.w2(lVar, profileCard, new ModalDestination.Style.Custom(new ProfileCardTransitionAnimation(new ViewIdTarget(R$id.navBarLargeCentred_headerImageView))));
                }
                return Unit.f186387a;
            case 6:
                dii.g result2 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof dii.e) {
                    h.D2(this.f14004b);
                }
                return Unit.f186387a;
            case 7:
                dii.g result3 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 instanceof dii.e) {
                    h.D2(this.f14004b);
                }
                return Unit.f186387a;
            case 8:
                h96.b result4 = (h96.b) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (!Intrinsics.f(result4, h96.b.f150178a)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.D2(this.f14004b);
                return Unit.f186387a;
            case 9:
                jk6.e result5 = (jk6.e) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                if (!Intrinsics.f(result5, e.a.f175107a)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.D2(this.f14004b);
                return Unit.f186387a;
            case 10:
                dii.g result6 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result6, "result");
                if (result6 instanceof dii.e) {
                    h.D2(this.f14004b);
                }
                return Unit.f186387a;
            case 11:
                dii.g result7 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result7, "result");
                if (result7 instanceof dii.e) {
                    h.D2(this.f14004b);
                }
                return Unit.f186387a;
            case 12:
                dm1.h it12 = (dm1.h) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                h.D2(this.f14004b);
                return Unit.f186387a;
            case 13:
                q it13 = (q) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                h.D2(this.f14004b);
                return Unit.f186387a;
            case 14:
                q it14 = (q) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                h.D2(this.f14004b);
                return Unit.f186387a;
            case 15:
                vb4.l it15 = (vb4.l) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                h.D2(this.f14004b);
                return Unit.f186387a;
            case 16:
                o result8 = (o) obj2;
                Intrinsics.checkNotNullParameter(result8, "result");
                if (!Intrinsics.f(result8, m.f221521a) && !Intrinsics.f(result8, n.f221522a)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.D2(this.f14004b);
                return Unit.f186387a;
            case 17:
                kg1.c it16 = (kg1.c) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                h.D2(this.f14004b);
                return Unit.f186387a;
            case 18:
                f it17 = (f) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                h.D2(this.f14004b);
                return Unit.f186387a;
            case 19:
                ste.e result9 = (ste.e) obj2;
                Intrinsics.checkNotNullParameter(result9, "result");
                boolean zF2 = Intrinsics.f(result9, e.a.f265559a);
                l lVar2 = this.f14004b;
                if (!zF2 && !Intrinsics.f(result9, e.b.f265560a)) {
                    throw new NoWhenBranchMatchedException();
                }
                lVar2.e(false);
                return Unit.f186387a;
            case 20:
                w9a.d result10 = (w9a.d) obj2;
                Intrinsics.checkNotNullParameter(result10, "result");
                if (result10 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                h.w2(this.f14004b, new PixAutomaticoContract$Step.PaymentDetails(result10.f295700a), ModalDestination.Style.POPUP.f98311a);
                return Unit.f186387a;
            case 21:
                ccb.l it18 = (ccb.l) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                h.D2(this.f14004b);
                return Unit.f186387a;
            case 22:
                q it19 = (q) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                h.D2(this.f14004b);
                return Unit.f186387a;
            default:
                q it20 = (q) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                h.D2(this.f14004b);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ c(l lVar) {
        this.f14003a = 19;
        this.f14004b = lVar;
    }
}
