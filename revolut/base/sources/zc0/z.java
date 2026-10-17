package zc0;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.acquiring.pro_merchant.toggles.api.model.FreelancerPluginType;
import com.revolut.feature.backend_flow.domain.models.BackendFlowBinary;
import com.revolut.feature.backend_flow.domain.models.BackendFlowFile;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;
import com.revolut.feature.backend_flow.domain.models.DeeplinkScreen;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.HtmlPromptScreen;
import com.revolut.feature.backend_flow.domain.models.PromptScreen;
import com.revolut.feature.backend_flow.domain.models.StatusDialogScreen;
import com.revolut.feature.backend_flow.domain.models.StoriesScreen;
import com.revolut.feature.backend_flow.domain.models.SummaryScreen;
import com.revolut.feature.backend_flow.domain.models.TransactionsSelectionItem;
import com.revolut.feature.backend_flow.domain.models.TutorialScreen;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenAction;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.revolutpay.shared.R$string;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.AddAssetRev10Screen;
import ip0.ii;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f321177a;

    public /* synthetic */ z(int i) {
        this.f321177a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        vf8.a aVar;
        int i = this.f321177a;
        rfm.h hVar = rfm.h.f253943a;
        FreelancerPluginType.Woocommerce woocommerce = FreelancerPluginType.Woocommerce.f60847a;
        FreelancerPluginType.PrestaShop prestaShop = FreelancerPluginType.PrestaShop.f60845a;
        FreelancerPluginType.Shopify shopify = FreelancerPluginType.Shopify.f60846a;
        switch (i) {
            case 0:
                List files = (List) obj2;
                Intrinsics.checkNotNullParameter(files, "files");
                List list = files;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(new xu.i((File) it8.next()));
                }
                return arrayList;
            case 1:
                ip0.y it9 = (ip0.y) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj3 = it9.f167226b.f58324n;
                if (obj3 instanceof a3) {
                    return (a3) obj3;
                }
                return null;
            case 2:
                ii it10 = (ii) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object f = it10.f164695b.getF();
                if (f instanceof m3) {
                    return (m3) f;
                }
                return null;
            case 3:
                FincrimeHomeScreenAction.Deeplink deeplink = obj2 instanceof FincrimeHomeScreenAction.Deeplink ? (FincrimeHomeScreenAction.Deeplink) obj2 : null;
                if (deeplink != null) {
                    return deeplink.f64132a;
                }
                return null;
            case 4:
                BackendScreen screen = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen, "screen");
                Object objB0 = zhm.d0.b0(((FormScreen) screen).f63468b);
                Intrinsics.i(objB0, "null cannot be cast to non-null type com.revolut.feature.backend_flow.domain.models.TransactionsSelectionItem");
                return ((TransactionsSelectionItem) objB0).f63704a;
            case 5:
                BackendScreen backendScreen = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(backendScreen, "backendScreen");
                if (backendScreen instanceof StoriesScreen) {
                    return efm.k.g(backendScreen);
                }
                if ((backendScreen instanceof DeeplinkScreen) || (backendScreen instanceof FormScreen) || (backendScreen instanceof SummaryScreen) || (backendScreen instanceof StatusDialogScreen) || (backendScreen instanceof BottomPromptScreen) || (backendScreen instanceof PromptScreen) || (backendScreen instanceof HtmlPromptScreen) || (backendScreen instanceof TutorialScreen)) {
                    return hVar;
                }
                throw new NoWhenBranchMatchedException();
            case 6:
                FormScreen screen2 = (FormScreen) obj2;
                Intrinsics.checkNotNullParameter(screen2, "screen");
                return Boolean.valueOf(uc0.b.q(screen2));
            case 7:
                BackendScreen screen3 = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen3, "screen");
                if (screen3 instanceof FormScreen) {
                    return efm.k.g(Boolean.TRUE);
                }
                if ((screen3 instanceof BottomPromptScreen) || (screen3 instanceof PromptScreen) || (screen3 instanceof HtmlPromptScreen) || (screen3 instanceof StoriesScreen) || (screen3 instanceof StatusDialogScreen)) {
                    return hVar;
                }
                if (screen3 instanceof SummaryScreen) {
                    return efm.k.g(Boolean.TRUE);
                }
                if ((screen3 instanceof TutorialScreen) || (screen3 instanceof DeeplinkScreen)) {
                    return efm.k.g(Boolean.FALSE);
                }
                throw new NoWhenBranchMatchedException();
            case 8:
                BackendScreen screen4 = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen4, "screen");
                if (screen4 instanceof FormScreen) {
                    nkm.i iVar = new nkm.i(nkm.y.t(nkm.y.n(zhm.d0.Q(((FormScreen) screen4).f63468b), l2.f321080a), new zbj.j0(20)));
                    while (iVar.hasNext()) {
                        xl2.e eVar = ((BackendFlowFile) ((BackendFlowBinary) iVar.next())).f;
                        if (eVar == xl2.e.UPLOADING || eVar == xl2.e.VALIDATING) {
                            z = true;
                            return Boolean.valueOf(z);
                        }
                    }
                } else if (!(screen4 instanceof DeeplinkScreen) && !(screen4 instanceof StatusDialogScreen) && !(screen4 instanceof SummaryScreen) && !(screen4 instanceof StoriesScreen) && !(screen4 instanceof BottomPromptScreen) && !(screen4 instanceof PromptScreen) && !(screen4 instanceof HtmlPromptScreen) && !(screen4 instanceof TutorialScreen)) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
                return Boolean.valueOf(z);
            case 9:
                rp0.p it11 = (rp0.p) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11 == rp0.p.USER);
            case 10:
                Intrinsics.checkNotNullParameter((rp0.p) obj2, "it");
                return Unit.f186387a;
            case 11:
                Intrinsics.checkNotNullParameter((cqi.g) obj2, "it");
                return Unit.f186387a;
            case 12:
                BackendScreen backendScreen2 = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(backendScreen2, "backendScreen");
                FormScreen formScreen = backendScreen2 instanceof FormScreen ? (FormScreen) backendScreen2 : null;
                if (formScreen != null) {
                    return formScreen.f63475n;
                }
                return null;
            case 13:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.TRUE;
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                for (int i2 = 0; i2 < 3; i2++) {
                    eVarB.add(new pb0(a0.d.n("LOADING_ITEM_LIST_ID", i2)));
                }
                aim.e eVarA = zhm.u.a(eVarB);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                return eVarA;
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_order_summary_details_title, null, null, 14);
                aim.e eVarB2 = zhm.u.b();
                pb0 pb0VarB = nb0.b(pb0.Companion, "HEADER_ROW_LOADING", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                eVarB2.add(pb0VarB);
                IntRange intRange = new IntRange(0, 2, 1);
                ArrayList arrayList2 = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it12 = intRange.iterator();
                while (it12.f289625c) {
                    arrayList2.add(nb0.b(pb0.Companion, a0.d.n("ROW_LOADING_", it12.nextInt()), false, 0, false, 30));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                eVarB2.addAll(arrayList2);
                IntRange intRange2 = new IntRange(0, 2, 1);
                ArrayList arrayList3 = new ArrayList(zhm.w.t(intRange2, 10));
                vim.f it13 = intRange2.iterator();
                while (it13.f289625c) {
                    arrayList3.add(new s7(a0.d.n("CELL_LOADING_", it13.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                eVarB2.addAll(arrayList3);
                return new zdc.h(textLocalisedClause, zhm.u.a(eVarB2));
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 17:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return zi0.c.P(it14, false, null, 3);
            case 18:
                List walletsWithPockets = (List) obj2;
                Intrinsics.checkNotNullParameter(walletsWithPockets, "walletsWithPockets");
                List list2 = walletsWithPockets;
                int iB = zhm.q0.b(zhm.w.t(list2, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj4 : list2) {
                    linkedHashMap.put(((fo3.c) ((Pair) obj4).f186385a).b(), obj4);
                }
                return linkedHashMap;
            case 19:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List<zf8.d> list3 = (List) pair.f186385a;
                Map map = (Map) pair.f186386b;
                ArrayList arrayList4 = new ArrayList();
                for (zf8.d dVar : list3) {
                    JuniorBankingProfile juniorBankingProfile = dVar.f321890a;
                    String str = juniorBankingProfile.f77103j;
                    sf8.h hVar2 = (sf8.h) map.get(str);
                    if (hVar2 == null) {
                        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Account ui state is null for junior with id = ", str));
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        aVar = null;
                    } else {
                        aVar = new vf8.a(juniorBankingProfile, hVar2, dVar.f321891b, dVar.f321892c);
                    }
                    if (aVar != null) {
                        arrayList4.add(aVar);
                    }
                }
                return arrayList4;
            case 20:
                return ((sf8.m) obj2).f262362c;
            case 21:
                return ((sf8.m) obj2).c();
            case 22:
                mf8.e it15 = (mf8.e) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                int i3 = zf8.m.f321906b[it15.d.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        return new sf8.k(zf8.n.b(it15));
                    }
                    if (i3 != 3) {
                        if (i3 == 4) {
                            return sf8.j.f262358a;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return sf8.i.f262357a;
            case 23:
                kf1.j merchantFeatures = (kf1.j) obj2;
                Intrinsics.checkNotNullParameter(merchantFeatures, "merchantFeatures");
                aim.o oVar = new aim.o();
                kf1.f fVar = merchantFeatures.f183278c;
                if (fVar != null && fVar.f183271a.f183279a) {
                    oVar.add(shopify);
                }
                if (fVar != null && fVar.f183273c.f183274a) {
                    oVar.add(prestaShop);
                }
                if (fVar != null && fVar.f183272b.f183281a) {
                    oVar.add(woocommerce);
                }
                return zhm.y0.a(oVar);
            case 24:
                return Boolean.valueOf(((kf1.d) obj2).f183270a);
            case 25:
                kf1.j it16 = (kf1.j) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(it16.f183276a.f183268a);
            case 26:
                kf1.j merchantFeatures2 = (kf1.j) obj2;
                Intrinsics.checkNotNullParameter(merchantFeatures2, "merchantFeatures");
                aim.o oVar2 = new aim.o();
                kf1.f fVar2 = merchantFeatures2.f183278c;
                if (fVar2 != null && fVar2.f183271a.f183280b) {
                    oVar2.add(shopify);
                }
                if (fVar2 != null && fVar2.f183273c.f183275b) {
                    oVar2.add(prestaShop);
                }
                if (fVar2 != null && fVar2.f183272b.f183282b) {
                    oVar2.add(woocommerce);
                }
                return zhm.y0.a(oVar2);
            case 27:
                RowDelegate.Model it17 = (RowDelegate.Model) obj2;
                AddAssetRev10Screen.Companion aVar2 = AddAssetRev10Screen.INSTANCE;
                Intrinsics.checkNotNullParameter(it17, "it");
                Object obj5 = it17.u;
                if (obj5 instanceof ogd.e) {
                    return (ogd.e) obj5;
                }
                return null;
            case 28:
                zfd.h updateState = (zfd.h) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return zfd.h.a(updateState, new ce9.p(null, null, 61), null, null, updateState.d, 6);
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
        }
    }

    public /* synthetic */ z(Object obj2, int i) {
        this.f321177a = i;
    }
}
