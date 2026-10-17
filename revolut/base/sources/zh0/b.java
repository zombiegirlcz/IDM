package zh0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import bi0.f;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block.BlockMerchantScreen;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block.BlockMerchantTransparentScreen;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.customer.FreelancerAddCustomerScreen;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.status_update.CFACClaimStatusUpdateScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.documents_hint.DocumentsHintScreen;
import com.revolut.feature.payments.groups.impl.ui_new.customize.GroupCustomizationScreen;
import com.revolut.feature.retail.savings.api.SavingsApi$Toggles;
import com.revolut.feature.selfserve.sot.impl.ui.home.SotHomeFragment;
import com.revolut.feature.tax_residency.impl.flows.list.TaxResidenciesListFlow;
import com.revolut.feature.transfer.core.impl.ui.transfer.locate.TransferLocateScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$Mode;
import com.revolut.retail.feature.trading_onboarding.impl.ui.extended_hours.ExtendedHoursBackendFlowContract$Configuration;
import com.revolut.retail.feature.trading_onboarding.impl.ui.extended_hours.extended_hours_screen.ExtendedHoursBackendFlowActivity;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.sso.api.external_entry.RevolutSsoExternalEntryApi$Toggles;
import com.revolut.uicomponent.R$id;
import com.revolut.uicomponent.slidingbottomsheet.BottomExpandableDialogView;
import cxe.u;
import djb.k;
import efm.r;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;
import kotlin.reflect.KProperty;
import ql7.a0;
import skm.p0;
import vf0.x;
import vkm.q;
import w4l.h;
import w4l.j;
import w4l.k;
import zhf.g;
import zhf.i;
import zhm.f0;
import zhm.v;
import zje.n;
import zkh.i0;
import zkk.t;
import zr5.o;
import zsd.l;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f322205b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f322204a = i;
        this.f322205b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v107, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v70, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        r rVarR;
        int i = this.f322204a;
        k kVar = j.f294644c;
        h hVar = h.f294642c;
        int i2 = 5;
        final int i3 = 1;
        boolean z = false;
        Object[] objArr = 0;
        Object obj2 = this.f322205b;
        switch (i) {
            case 0:
                Context context = ((e) obj2).f322207a.f282191a;
                if (context instanceof Activity) {
                    FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient((Activity) context);
                    Intrinsics.h(fusedLocationProviderClient);
                    return fusedLocationProviderClient;
                }
                FusedLocationProviderClient fusedLocationProviderClient2 = LocationServices.getFusedLocationProviderClient(context);
                Intrinsics.h(fusedLocationProviderClient2);
                return fusedLocationProviderClient2;
            case 1:
                g gVar = (g) obj2;
                return mra.d.c(gVar, new i(gVar.c3().f310974a), gVar.f322412n);
            case 2:
                float[] array = (float[]) obj2;
                Intrinsics.checkNotNullParameter(array, "array");
                return new kotlin.jvm.internal.c(array);
            case 3:
                byte[] array2 = (byte[]) obj2;
                Intrinsics.checkNotNullParameter(array2, "array");
                return new kotlin.jvm.internal.b(array2);
            case 4:
                return u0.h((Object[]) obj2);
            case 5:
                n nVar = (n) obj2;
                eke.h hVar2 = nVar.o;
                usc.a stateUpdater = nVar.f322810t;
                hVar2.getClass();
                Intrinsics.checkNotNullParameter(stateUpdater, "stateUpdater");
                return new eke.g(stateUpdater, hVar2.f127039a, hVar2.f127040b, hVar2.f127041c, hVar2.d);
            case 6:
                KProperty[] kPropertyArr = CFACClaimStatusUpdateScreen.f75142a0;
                return (zk7.e) ((nk7.g) ((CFACClaimStatusUpdateScreen) obj2).U.getValue()).f216681c.get();
            case 7:
                return ((zkh.n) obj2).f323019a.b(new TextLocalisedClause(R$string.search_block_orders_name, null, null, 14)).toString();
            case 8:
                return ((i0) obj2).f323005c.b(new TextLocalisedClause(R$string.search_block_popular_stocks_name, null, null, 14)).toString();
            case 9:
                PlanBillingPickerContract$Mode planBillingPickerContract$Mode = ((t) obj2).o.f103478b;
                if (!(planBillingPickerContract$Mode instanceof PlanBillingPickerContract$Mode.Legacy)) {
                    if (!(planBillingPickerContract$Mode instanceof PlanBillingPickerContract$Mode.Standalone)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar = hVar;
                }
                return new vii.b(kVar);
            case 10:
                return Boolean.valueOf(((jte.d) ((com.revolut.sso.impl.ui.external_entry.external_entry.a) obj2).E).c(RevolutSsoExternalEntryApi$Toggles.RevolutSsoSdkNativeFlowEnabled.f105838c));
            case 11:
                return (zne.a) ((ine.n) ((TaxResidenciesListFlow) obj2).P.getValue()).f.get();
            case 12:
                uc.d dVar = (uc.d) obj2;
                return ((f) dVar.f278953b).a(ar2.e.c((xq2.d) dVar.f278952a));
            case 13:
                KProperty[] kPropertyArr2 = DocumentsHintScreen.Z;
                return (zq7.e) ((a0) ((DocumentsHintScreen) obj2).W.getValue()).f247226c.get();
            case 14:
                KProperty[] kPropertyArr3 = TransferLocateScreen.f92223b0;
                return (zqf.k) ((lpf.j) ((TransferLocateScreen) obj2).Z.getValue()).i.get();
            case 15:
                KProperty[] kPropertyArr4 = BlockMerchantScreen.f64239a0;
                return (zr2.e) ((tr2.j) ((BlockMerchantScreen) obj2).X.getValue()).k.get();
            case 16:
                return (zr2.e) ((tr2.j) ((BlockMerchantTransparentScreen) obj2).N.getValue()).k.get();
            case 17:
                zr5.r rVar = (zr5.r) obj2;
                return mra.d.c(rVar, new o(rVar.c3()), rVar.f324603m);
            case 18:
                KProperty[] kPropertyArr5 = GroupCustomizationScreen.g0;
                return (zs9.r) ((kr9.f) ((GroupCustomizationScreen) obj2).Y.getValue()).u.get();
            case 19:
                final l lVar = (l) obj2;
                djb.n nVar2 = lVar.d;
                k.b bVar = k.b.f115282a;
                r rVarF = ((rnb.i) nVar2).f(bVar, hVar);
                r rVarA = ((rnb.i) nVar2).a(bVar, hVar);
                if (((jte.d) lVar.f324903h).c(SavingsApi$Toggles.JointAccountsSavings.f83075c)) {
                    rVarR = pd.b.r(rd0.e.c(lVar.f324902g.h(hVar), p0.f264003c), new Function1() { // from class: zsd.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            List list;
                            switch (i3) {
                                case 0:
                                    x xVar = (x) obj3;
                                    Intrinsics.checkNotNullParameter(xVar, "<destruct>");
                                    ejb.b bVar2 = (ejb.b) xVar.f288487a;
                                    List list2 = (List) xVar.f288488b;
                                    od0.i iVar = (od0.i) xVar.f288489c;
                                    uib.a aVar = (uib.a) xVar.d;
                                    List list3 = (List) xVar.e;
                                    Set set = (Set) xVar.f;
                                    wi0.b bVar3 = (wi0.b) xVar.f288490g;
                                    ejb.b bVarF = cp5.d.f(bVar2, list2, set);
                                    ejb.b bVar4 = (ejb.b) iVar.g();
                                    if (bVar4 == null || (list = bVar4.f126837b) == null) {
                                        list = f0.f322471a;
                                    }
                                    List list4 = bVarF.f126837b;
                                    l lVar2 = lVar;
                                    return nim.a.w(kli.a.h(lVar2.c(list4), lVar2.c(list)), new ael.u0(bVarF, lVar2, aVar, list3, bVar3, iVar, 23));
                                default:
                                    od0.i optional = (od0.i) obj3;
                                    Intrinsics.checkNotNullParameter(optional, "optional");
                                    if (!optional.d()) {
                                        od0.i.Companion.getClass();
                                        return zi0.c.j(od0.i.f224256b);
                                    }
                                    l lVar3 = lVar;
                                    return nim.a.w(kli.a.h(((rnb.i) lVar3.d).f(k.a.f115281a, w4l.h.f294642c), rd0.e.c(new yc7.h(lVar3.i.k(), 4), kotlin.coroutines.g.f186406a)), new zr2.o(13));
                            }
                        }
                    });
                } else {
                    od0.i.Companion.getClass();
                    rVarR = zi0.c.j(od0.i.f224256b);
                }
                r rVar2 = rVarR;
                u uVarA = lVar.f.a(kVar);
                kotlin.coroutines.g gVar2 = kotlin.coroutines.g.f186406a;
                r rVarI = mif.a.i(rVarF, rVarA, rVar2, rd0.e.c(uVarA, gVar2), rd0.e.c(nim.a.y(ijb.a.a(lVar.f324900b, null, null, null, null, 15), new zr2.o(11)), gVar2), rd0.e.c(new yc7.h(lVar.i.k(), i2), gVar2), rd0.e.c(q.q(nim.a.v(lVar.k.j(kVar), new zr2.o(12))), gVar2));
                final Object[] objArr2 = objArr == true ? 1 : 0;
                return rd0.e.b(pd.b.r(rVarI, new Function1() { // from class: zsd.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        List list;
                        switch (objArr2) {
                            case 0:
                                x xVar = (x) obj3;
                                Intrinsics.checkNotNullParameter(xVar, "<destruct>");
                                ejb.b bVar2 = (ejb.b) xVar.f288487a;
                                List list2 = (List) xVar.f288488b;
                                od0.i iVar = (od0.i) xVar.f288489c;
                                uib.a aVar = (uib.a) xVar.d;
                                List list3 = (List) xVar.e;
                                Set set = (Set) xVar.f;
                                wi0.b bVar3 = (wi0.b) xVar.f288490g;
                                ejb.b bVarF = cp5.d.f(bVar2, list2, set);
                                ejb.b bVar4 = (ejb.b) iVar.g();
                                if (bVar4 == null || (list = bVar4.f126837b) == null) {
                                    list = f0.f322471a;
                                }
                                List list4 = bVarF.f126837b;
                                l lVar2 = lVar;
                                return nim.a.w(kli.a.h(lVar2.c(list4), lVar2.c(list)), new ael.u0(bVarF, lVar2, aVar, list3, bVar3, iVar, 23));
                            default:
                                od0.i optional = (od0.i) obj3;
                                Intrinsics.checkNotNullParameter(optional, "optional");
                                if (!optional.d()) {
                                    od0.i.Companion.getClass();
                                    return zi0.c.j(od0.i.f224256b);
                                }
                                l lVar3 = lVar;
                                return nim.a.w(kli.a.h(((rnb.i) lVar3.d).f(k.a.f115281a, w4l.h.f294642c), rd0.e.c(new yc7.h(lVar3.i.k(), 4), kotlin.coroutines.g.f186406a)), new zr2.o(13));
                        }
                    }
                }));
            case 20:
                return ((mel.g) obj2).f204747a.f204776a;
            case 21:
                zv.c cVar = (zv.c) obj2;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(cVar.f325565b, cVar.f325566c, Bitmap.Config.ARGB_8888);
                ByteBuffer byteBuffer = cVar.f325564a;
                byteBuffer.rewind();
                bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "also(...)");
                return bitmapCreateBitmap;
            case 22:
                KProperty[] kPropertyArr6 = FreelancerAddCustomerScreen.f73759b0;
                return (zv6.f) ((us6.o) ((FreelancerAddCustomerScreen) obj2).Y.getValue()).d.get();
            case 23:
                SotHomeFragment.Companion companion = SotHomeFragment.INSTANCE;
                return new z4l.j(7, v.k(new PlainTextWarningDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), new ProgressStepsDelegate(), new ListSubheaderDelegate(), (RowDelegate) ((SotHomeFragment) obj2).f85948d0.getValue()), z);
            case 24:
                int i5 = ExtendedHoursBackendFlowActivity.J0;
                return (ExtendedHoursBackendFlowContract$Configuration) ((ExtendedHoursBackendFlowActivity) obj2).G0();
            default:
                BottomExpandableDialogView.Companion aVar = BottomExpandableDialogView.INSTANCE;
                return (RecyclerView) ((BottomExpandableDialogView) obj2).findViewById(R$id.recyclerView);
        }
    }
}
