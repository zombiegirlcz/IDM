package r25;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.backgroundpicker.impl.flow.catalogue.BackgroundCatalogControllerContract$ModalStep;
import com.revolut.feature.subscriptions.impl.payment_balance_picker.PaymentBalancePickerScreenContract$SelectedBalanceInfo;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.confirmation.TravelHotelsCancellationConfirmationContract$CancellationConfirmationData;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.core.navigation.NaviCommand;
import elm.f;
import gim.i;
import ip0.um0;
import java.io.File;
import java.util.UUID;
import kl.c0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n38.d0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import pt5.q;
import r40.x0;
import ru5.z;
import s1g.j;
import s38.m;
import s38.n;
import s4i.h;
import s85.k;
import s9b.p;
import skm.e0;
import skm.p0;
import u09.l0;
import u09.m0;
import wli.x;
import yhm.o;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f251051w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f251052x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.revolut.feature.credit.application.plugins.impl.ui.preapplication.b bVar, Continuation continuation) {
        super(1, continuation);
        this.u = 11;
        this.f251052x = bVar;
    }

    private final Object b(Object obj2) {
        com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e eVar = (com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e) this.f251051w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        Continuation continuation = null;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.b bVar = new com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.b(eVar, (um0) this.f251052x, null);
            this.v = 1;
            if (eVar.p2(this, bVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return l.a1(eVar, eVar.X1(new y0("CANCELLATION_DIALOG_ID", new j0((Clause) new TextLocalisedClause(R$string.experiences_cancellation_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4)), null, null, new j(eVar, continuation, 1), 3);
    }

    private final Object c(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            n nVar = (n) this.f251051w;
            d0 d0Var = (d0) this.f251052x;
            this.v = 1;
            if (nVar.Z2(d0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    private final Object n(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        n nVar = (n) this.f251051w;
        m mVar = new m(nVar, (i) this.f251052x, null);
        this.v = 1;
        Object objY2 = nVar.Y2(this, mVar);
        return objY2 == aVar ? aVar : objY2;
    }

    private final Object o(Object obj2) {
        h hVar = (h) this.f251051w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            x xVar = hVar.f259885q;
            Object obj3 = this.f251052x;
            if (xVar.y1((String) obj3)) {
                Boolean bool = Boolean.FALSE;
                this.v = 1;
                if (lg0.b.x1(hVar.f259885q, (String) obj3, null, bool, this, 2) == aVar) {
                    return aVar;
                }
            } else {
                hx7.e.h(new IllegalArgumentException("Unsupported deeplink"));
                Unit unit = Unit.f186387a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object p(Object obj2) {
        h hVar = (h) this.f251051w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            ufm.i iVarC = ((rre.d) hVar.f259887s).c((TermsScope) this.f251052x, null);
            this.v = 1;
            obj2 = nim.a.b(iVarC, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        NaviCommand naviCommand = (NaviCommand) obj2;
        Intrinsics.h(naviCommand);
        hVar.C1(u0.b(naviCommand));
        return Unit.f186387a;
    }

    private final Object s(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.credit.application.plugins.impl.ui.banner.a aVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.banner.a) this.f251051w;
            String str = ((hs3.i) this.f251052x).f154895a;
            this.v = 1;
            if (aVar2.Q2(str, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object t(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        x xVar = ((com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.b) this.f251051w).f67344p;
        String str = ((ty0.a) this.f251052x).f275445a;
        lg0.a aVar2 = lg0.a.OPEN_BROWSER;
        this.v = 1;
        Object objX1 = lg0.b.x1(xVar, str, aVar2, null, this, 4);
        return objX1 == aVar ? aVar : objX1;
    }

    private final Object u(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            k kVar = (k) this.f251051w;
            s85.j jVar = new s85.j(kVar, (koi.j) this.f251052x, null);
            this.v = 1;
            if (kVar.p2(this, jVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object v(Object obj2) throws Throwable {
        p pVar = (p) this.f251051w;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        Continuation continuation = null;
        int i2 = 1;
        if (i == 0) {
            o.b(obj2);
            ogm.i iVar = pVar.f261167s;
            String str = (String) this.f251052x;
            this.v = 1;
            l9b.a aVar = new l9b.a(str, (c0) iVar.f225222b, continuation, i2);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(f.f127540b, aVar, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        pVar.l2(new s64.a(pVar, continuation, 10), new yi5.b(26));
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v42, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a((b) this.f251051w, (Function1) this.f251052x, continuation);
            case 1:
                return new a((x0) this.f251051w, (UUID) this.f251052x, continuation, 1);
            case 2:
                return new a((x0) this.f251051w, this.f251052x, continuation, 2);
            case 3:
                return new a((r7b.l) this.f251051w, (String) this.f251052x, continuation, 3);
            case 4:
                return new a((com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a) this.f251051w, (it3.d) this.f251052x, continuation, 4);
            case 5:
                return new a((com.revolut.feature.subscriptions.impl.block_future_payments.a) this.f251051w, (qua.p) this.f251052x, continuation, 5);
            case 6:
                return new a((TravelHotelsCancellationConfirmationContract$CancellationConfirmationData) this.f251051w, (rbg.j) this.f251052x, continuation, 6);
            case 7:
                return new a((rc8.e) this.f251051w, (psg.a) this.f251052x, continuation, 7);
            case 8:
                return new a((com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.a) this.f251051w, (v94.j) this.f251052x, continuation, 8);
            case 9:
                return new a((rf3.a) this.f251051w, (String) this.f251052x, continuation, 9);
            case 10:
                return new a((rf3.a) this.f251051w, (File) this.f251052x, continuation, 10);
            case 11:
                return new a((com.revolut.feature.credit.application.plugins.impl.ui.preapplication.b) this.f251052x, continuation);
            case 12:
                return new a((com.revolut.feature.junior_remote_login.impl.ui.flow.update_phone_number.b) this.f251051w, (em8.a) this.f251052x, continuation, 12);
            case 13:
                return new a((com.revolut.feature.backgroundpicker.impl.flow.catalogue.b) this.f251051w, (BackgroundCatalogControllerContract$ModalStep) this.f251052x, continuation, 13);
            case 14:
                return new a((rpd.k) this.f251051w, (rpd.b) this.f251052x, continuation, 14);
            case 15:
                return new a((q) this.f251051w, (z) this.f251052x, continuation, 15);
            case 16:
                return new a((rw3.a) this.f251051w, (String) this.f251052x, continuation, 16);
            case 17:
                return new a((com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a) this.f251051w, (yki.b) this.f251052x, continuation, 17);
            case 18:
                return new a((s09.k) this.f251051w, (l0) this.f251052x, continuation, 18);
            case 19:
                return new a((s09.k) this.f251051w, (m0) this.f251052x, continuation, 19);
            case 20:
                return new a((com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e) this.f251051w, (um0) this.f251052x, continuation, 20);
            case 21:
                return new a((n) this.f251051w, (d0) this.f251052x, continuation, 21);
            case 22:
                return new a((n) this.f251051w, (Function1) this.f251052x, continuation);
            case 23:
                return new a((h) this.f251051w, (String) this.f251052x, continuation, 23);
            case 24:
                return new a((h) this.f251051w, (TermsScope) this.f251052x, continuation, 24);
            case 25:
                return new a((com.revolut.feature.credit.application.plugins.impl.ui.banner.a) this.f251051w, (hs3.i) this.f251052x, continuation, 25);
            case 26:
                return new a((com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.b) this.f251051w, (ty0.a) this.f251052x, continuation, 26);
            case 27:
                return new a((k) this.f251051w, (koi.j) this.f251052x, continuation, 27);
            case 28:
                return new a((p) this.f251051w, (String) this.f251052x, continuation, 28);
            default:
                return new a((com.revolut.feature.subscriptions.impl.payment_balance_picker.b) this.f251051w, (PaymentBalancePickerScreenContract$SelectedBalanceInfo) this.f251052x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((a) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x040e A[PHI: r6
      0x040e: PHI (r6v42 nii.u1) = 
      (r6v26 nii.u1)
      (r6v30 nii.u1)
      (r6v35 nii.u1)
      (r6v40 nii.u1)
      (r6v26 nii.u1)
      (r6v44 nii.u1)
      (r6v47 nii.u1)
      (r6v51 nii.u1)
     binds: [B:118:0x03cf, B:224:0x057b, B:203:0x052d, B:182:0x04df, B:155:0x046b, B:161:0x0491, B:142:0x0434, B:131:0x03fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x09d3  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0a26  */
    /* JADX WARN: Removed duplicated region for block: B:520:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:537:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0305 A[FALL_THROUGH] */
    /* JADX WARN: Type inference failed for: r12v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v100 */
    /* JADX WARN: Type inference failed for: r1v101 */
    /* JADX WARN: Type inference failed for: r1v3, types: [r25.b, yji.n] */
    /* JADX WARN: Type inference failed for: r1v87, types: [com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a] */
    /* JADX WARN: Type inference failed for: r1v88, types: [oki.h] */
    /* JADX WARN: Type inference failed for: r1v90 */
    /* JADX WARN: Type inference failed for: r2v21, types: [com.revolut.data.model.Data, int] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v46 */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r50) {
        /*
            Method dump skipped, instruction units count: 3082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r25.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f251051w = obj2;
        this.f251052x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(b bVar, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.u = 0;
        this.f251051w = bVar;
        this.f251052x = (i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(n nVar, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.u = 22;
        this.f251051w = nVar;
        this.f251052x = (i) function1;
    }
}
