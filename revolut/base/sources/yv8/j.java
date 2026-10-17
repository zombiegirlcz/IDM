package yv8;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.n6;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.camerakit.core.errors.CameraKitException;
import com.revolut.camerakit.revolut.ui.barcodeqr.screen.BarcodeQrReaderScreen;
import com.revolut.core.ui_kit.delegates.DraggableDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.kyc_documents_scan.ui.onfido.a;
import com.revolut.feature.rev_points.models.SpareChangeCalculations;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.EditKeyStatsScreen;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlin.text.MatchResult;
import kotlin.text.a0;
import xw6.a;
import yw0.f;
import yxb.s;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317148a;

    public /* synthetic */ j(int i) {
        this.f317148a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Float f;
        Float f4;
        int i = 0;
        z = false;
        boolean z = false;
        z = false;
        boolean z3 = false;
        int iFloatValue = 1;
        Object obj3 = null;
        switch (this.f317148a) {
            case 0:
                d update = (d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                return new d(true);
            case 1:
                SmallActionButtonDelegate.Model it8 = (SmallActionButtonDelegate.Model) obj2;
                KProperty[] kPropertyArr = EditKeyStatsScreen.T;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8.f53342j instanceof yvk.h);
            case 2:
                DraggableDelegate.Model it9 = (DraggableDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = EditKeyStatsScreen.T;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj4 = it9.f52196a.u;
                if (obj4 instanceof yvk.i) {
                    return (yvk.i) obj4;
                }
                return null;
            case 3:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                while (i < 3) {
                    arrayListP.add(nb0.b(pb0.Companion, a0.d.n("loading-row-", i), false, 0, false, 30));
                    i++;
                }
                return arrayListP;
            case 4:
                f.a aVar = yw0.f.Companion;
                Intrinsics.checkNotNullParameter((n6) obj2, "it");
                return Unit.f186387a;
            case 5:
                f.a aVar2 = yw0.f.Companion;
                Intrinsics.checkNotNullParameter((n6) obj2, "it");
                return Unit.f186387a;
            case 6:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new yw6.f((List) getDefaultLoadingItems.invoke(), a.C1718a.f309332a);
            case 7:
                Intrinsics.checkNotNullParameter((ywb.d) obj2, "$this$update");
                return new ywb.d(i);
            case 8:
                IntRange intRangeU = t61.a.u((Function0) obj2, "it", 0, 3, 1);
                ArrayList arrayList = new ArrayList(w.t(intRangeU, 10));
                vim.f it10 = intRangeU.iterator();
                while (it10.f289625c) {
                    arrayList.add(nb0.b(pb0.Companion, a0.d.n("SECTION_LOADING_PREFIX", it10.nextInt()), false, 0, false, 30));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return new ywb.i(arrayList);
            case 9:
                svi.c lounge = (svi.c) obj2;
                Intrinsics.checkNotNullParameter(lounge, "lounge");
                return lounge.f265888j;
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listK = v.k(new pb0("amenityLoadingItemId1"), new pb0("amenityLoadingItemId2"), new pb0("amenityLoadingItemId3"), new pb0("amenityLoadingItemId4"), new pb0("amenityLoadingItemId5"));
                yp0.b.k(listK, 0, R$attr.uikit_dp24, 0, 0, 29);
                return new ywi.f(listK);
            case 11:
                String id10 = (String) obj2;
                KProperty[] kPropertyArr3 = BarcodeQrReaderScreen.R;
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.hashCode() == -2095425942 && id10.equals("TORCH_MENU_ITEM_ID")) {
                    return yx.g.f317505a;
                }
                throw new IllegalStateException("Unknown menu item: ".concat(id10).toString());
            case 12:
                xv.j failure = (xv.j) obj2;
                Intrinsics.checkNotNullParameter(failure, "failure");
                return new Pair(failure.getError().getClass(), failure.getError().getMessage());
            case 13:
                CameraKitException error = (CameraKitException) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return new Pair(error.getClass(), error.getMessage());
            case 14:
                yx5.a update2 = (yx5.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return yx5.a.a(update2, null, null, null, false, "", 7);
            case 15:
                yx5.a update3 = (yx5.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return yx5.a.a(update3, null, null, null, true, null, 23);
            case 16:
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                nx9.b bVar = (nx9.b) d0.d0(it11);
                return Integer.valueOf(bVar != null ? bVar.e() : 0);
            case 17:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                SpareChangeCalculations spareChangeCalculations = (SpareChangeCalculations) pair.f186385a;
                List list = (List) pair.f186386b;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it12 = list.iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            yvh.b bVar2 = (yvh.b) it12.next();
                            if (bVar2.e == yvh.h.LOYALTY_PROFILE && bVar2.f317177b) {
                                z3 = true;
                            }
                        }
                    }
                }
                if (z3) {
                    Iterator it13 = list.iterator();
                    while (true) {
                        if (it13.hasNext()) {
                            Object next = it13.next();
                            if (((yvh.b) next).e == yvh.h.LOYALTY_PROFILE) {
                                obj3 = next;
                            }
                        }
                    }
                    yvh.b bVar3 = (yvh.b) obj3;
                    if (bVar3 != null && (f = bVar3.i) != null) {
                        iFloatValue = (int) f.floatValue();
                    }
                }
                return s.g(spareChangeCalculations, iFloatValue, z3);
            case 18:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                SpareChangeCalculations spareChangeCalculations2 = (SpareChangeCalculations) pair2.f186385a;
                List list2 = (List) pair2.f186386b;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it14 = list2.iterator();
                    while (true) {
                        if (it14.hasNext()) {
                            yvh.b bVar4 = (yvh.b) it14.next();
                            if (bVar4.e == yvh.h.LOYALTY_PROFILE && bVar4.f317177b) {
                                z = true;
                            }
                        }
                    }
                }
                if (z) {
                    Iterator it15 = list2.iterator();
                    while (true) {
                        if (it15.hasNext()) {
                            Object next2 = it15.next();
                            if (((yvh.b) next2).e == yvh.h.LOYALTY_PROFILE) {
                                obj3 = next2;
                            }
                        }
                    }
                    yvh.b bVar5 = (yvh.b) obj3;
                    if (bVar5 != null && (f4 = bVar5.i) != null) {
                        iFloatValue = (int) f4.floatValue();
                    }
                }
                return s.g(spareChangeCalculations2, iFloatValue, z);
            case 19:
                yxe.f update4 = (yxe.f) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return yxe.f.a(update4, "");
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 21:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM trading_onboarding_kyc");
                try {
                    sQLiteStatementPrepare.step();
                    return null;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 22:
                yy6.l update5 = (yy6.l) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return yy6.l.a(update5, null, com.revolut.feature.freelancer.impl.ui.invoice.templates.details.a.a(update5.f317848c, null, null, false, !r12.f73951g, null, null, null, null, 1983), 11);
            case 23:
                yy6.l update6 = (yy6.l) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return yy6.l.a(update6, null, com.revolut.feature.freelancer.impl.ui.invoice.templates.details.a.a(update6.f317848c, null, null, !r12.f, false, null, null, null, null, YearClass.CLASS_2015), 11);
            case 24:
                yy6.l update7 = (yy6.l) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                InvoiceTemplate.CustomField customField = new InvoiceTemplate.CustomField("", "");
                com.revolut.feature.freelancer.impl.ui.invoice.templates.details.a aVar3 = update7.f317848c;
                return yy6.l.a(update7, null, com.revolut.feature.freelancer.impl.ui.invoice.templates.details.a.a(aVar3, null, null, false, false, d0.F0(customField, aVar3.f73952h), null, null, null, 1919), 11);
            case 25:
                return yy6.l.a((yy6.l) obj2, null, null, 14);
            case 26:
                return yy6.l.a((yy6.l) obj2, null, null, 14);
            case 27:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 28:
                Intrinsics.checkNotNullParameter((com.revolut.feature.kyc_documents_scan.ui.onfido.a) obj2, "$this$update");
                return a.C0514a.f77956a;
            default:
                return a0.D((String) a10.b.n((MatchResult) obj2, "it", 1), "-", "", false);
        }
    }

    public /* synthetic */ j(Object obj2, int i) {
        this.f317148a = i;
    }
}
