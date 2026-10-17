package fn2;

import android.graphics.Rect;
import b4g.a0;
import bw.t;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.workflow.internal.ui.WorkflowFragment;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.camerakit.vision_framework.generated.Core;
import com.revolut.camerakit.vision_framework.generated.Imgproc;
import com.revolut.camerakit.vision_framework.generated.Mat;
import com.revolut.camerakit.vision_framework.generated.Size;
import com.revolut.core.ui_kit.delegates.ChatContextualChartDelegate;
import com.revolut.core.ui_kit.internal.views.diagram.TrendView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.impl.data.service.MerchantAppVerificationService;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.impl.service.AdvertisingService;
import com.revolut.feature.tab.accounts.api.model.ProductAccountListAction;
import com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction;
import com.revolut.feature.teen.accounts.impl.R$string;
import com.revolut.feature.teen_profile.api.models.TeenProfile;
import com.revolut.uicomponent.toolbar.app_bar.SearchViewListener;
import dx.j;
import efm.r;
import fnc.s;
import fx.d;
import g0d.m;
import gim.i;
import igm.g;
import ip0.dm;
import j4h.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kfm.o;
import kl.t1;
import koi.k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import ml.p;
import sfe.f;
import skm.e0;
import te0.w;
import wsg.n;
import xv0.e;
import xv0.h;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements o, SearchViewListener, jz0.c, y50.a, igm.o, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f136517b;

    public /* synthetic */ c() {
        this.f136516a = 26;
    }

    public static final boolean a(c cVar, ChatContextualChartDelegate.Model model) {
        return Intrinsics.f(model.f52040s, ((l) cVar.f136517b).c3().f310974a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ProductAccountListAction j(TeenProfile teenProfile) {
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        List list = null;
        ImageTransformations imageTransformations = null;
        return new ProductAccountListAction(376, null, new TextLocalisedClause(R$string.teen_home_header_actions_manage_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_gear, num, num2, num3, list, imageTransformations, (Clause) null, 254), teenProfile, "MANAGE", 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List k(iqe.c cVar, List list) {
        gqe.a aVar = gqe.a.SEND_MONEY;
        AnalyticsContext analyticsContext = null;
        int i = 300;
        f fVar = null;
        sfe.g gVar = null;
        boolean z = false;
        ProductAccountWidgetAction productAccountWidgetAction = new ProductAccountWidgetAction(i, analyticsContext, new TextLocalisedClause(R$string.teen_home_header_actions_send_money_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_send, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), cVar, aVar.name(), fVar, gVar, z, list.contains(aVar));
        gqe.a aVar2 = gqe.a.DETAILS;
        String strName = aVar2.name();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.teen_home_header_actions_Details_title, null, null, 14);
        Clause clause = null;
        int i2 = 254;
        Integer num = null;
        List list2 = null;
        ImageTransformations imageTransformations = null;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_bank, (Integer) null, (Integer) null, num, list2, imageTransformations, clause, i2);
        boolean zContains = list.contains(aVar2);
        int i3 = 300;
        ProductAccountWidgetAction productAccountWidgetAction2 = new ProductAccountWidgetAction(i3, 0 == true ? 1 : 0, textLocalisedClause, resourceImage, cVar, strName, null, null, false, zContains);
        gqe.a aVar3 = gqe.a.MANAGE;
        String strName2 = aVar3.name();
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.teen_home_header_actions_manage_title, null, null, 14);
        ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_gear, (Integer) null, (Integer) null, num, list2, imageTransformations, clause, i2);
        boolean zContains2 = list.contains(aVar3);
        ProductAccountWidgetAction productAccountWidgetAction3 = new ProductAccountWidgetAction(i3, 0 == true ? 1 : 0, textLocalisedClause2, resourceImage2, cVar, strName2, null, null, false, zContains2);
        gqe.a aVar4 = gqe.a.STATEMENT;
        String strName3 = aVar4.name();
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.teen_home_header_actions_statement_title, null, null, 14);
        ResourceImage resourceImage3 = new ResourceImage(R$drawable.uikit_icn_24_statement, (Integer) null, (Integer) null, num, list2, imageTransformations, clause, i2);
        boolean zContains3 = list.contains(aVar4);
        return v.k(productAccountWidgetAction, productAccountWidgetAction2, productAccountWidgetAction3, new ProductAccountWidgetAction(i3, 0 == true ? 1 : 0, textLocalisedClause3, resourceImage3, cVar, strName3, null, null, false, zContains3));
    }

    @Override // igm.g
    public void accept(Object obj2) {
        p p0 = (p) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((WorkflowFragment) this.f136517b).handleToolbarState(p0);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f136516a) {
            case 1:
                return ((fa9.c) this.f136517b).invoke(obj2);
            case 3:
                return ((m) this.f136517b).invoke(obj2);
            case 13:
                return ((h2i.b) this.f136517b).invoke(obj2);
            default:
                List list = (List) obj2;
                Collections.sort(list, (Comparator) this.f136517b);
                return list;
        }
    }

    @Override // jz0.c
    public void b() {
        ((dm) this.f136517b).setItemRenderState(h.f309151a);
    }

    public Object c(ShopsCampaignOffer shopsCampaignOffer, gim.c cVar) {
        ekc.a aVar;
        if (!Intrinsics.f(shopsCampaignOffer.f87026g, Boolean.TRUE) || (aVar = shopsCampaignOffer.f87027h) == null || (aVar != ekc.a.NOT_ACTIVATED && aVar != ekc.a.REACTIVATION_REQUIRED)) {
            return Unit.f186387a;
        }
        Object objA = nim.a.a(d(y0.b(shopsCampaignOffer.f87023a)), cVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    public efm.b d(Set campaignIds) {
        Intrinsics.checkNotNullParameter(campaignIds, "campaignIds");
        t1 t1Var = (t1) this.f136517b;
        Intrinsics.checkNotNullParameter(campaignIds, "campaignIds");
        return campaignIds.isEmpty() ? pfm.m.f235744a : w.g0(((AdvertisingService) t1Var.f185240b).activateRewards(new fid.a(campaignIds)));
    }

    @Override // jz0.c
    public void e() {
        ((dm) this.f136517b).setItemRenderState(e.f309148a);
    }

    public Object f(List list, i iVar) {
        Object objA;
        ekc.a aVar;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            ShopsCampaignOffer shopsCampaignOffer = obj2 instanceof ShopsCampaignOffer ? (ShopsCampaignOffer) obj2 : null;
            if (shopsCampaignOffer != null) {
                arrayList.add(shopsCampaignOffer);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            ShopsCampaignOffer shopsCampaignOffer2 = (ShopsCampaignOffer) obj3;
            if (Intrinsics.f(shopsCampaignOffer2.f87026g, Boolean.FALSE) && (aVar = shopsCampaignOffer2.f87027h) != null && (aVar == ekc.a.NOT_ACTIVATED || aVar == ekc.a.REACTIVATION_REQUIRED)) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            arrayList3.add(((ShopsCampaignOffer) it8.next()).f87023a);
        }
        Set setI1 = d0.i1(arrayList3);
        return (setI1.isEmpty() || (objA = nim.a.a(d(setI1), iVar)) != fim.a.COROUTINE_SUSPENDED) ? Unit.f186387a : objA;
    }

    public kf.f g() {
        return new kf.f((kf.e) this.f136517b);
    }

    public Mat h(Mat mat) throws Throwable {
        Mat dst;
        Mat mat2;
        double dRows;
        Intrinsics.checkNotNullParameter(mat, "mat");
        t tVar = (t) this.f136517b;
        bw.v vVar = (bw.v) tVar;
        Mat matC = vVar.c();
        Mat matC2 = vVar.c();
        Mat matC3 = vVar.c();
        try {
            ((bw.v) tVar).f(mat, matC, 7);
            dst = matC2;
            try {
                ((bw.v) tVar).a(u.c(matC), u.c(0), matC3, dst, u.c(256), v.k(Float.valueOf(BitmapDescriptorFactory.HUE_RED), Float.valueOf(256.0f)));
                mat2 = matC3;
                try {
                    bw.v vVar2 = (bw.v) tVar;
                    vVar2.getClass();
                    Intrinsics.checkNotNullParameter(dst, "mat");
                    ((c10.h) vVar2.f19164a).a();
                    dRows = dst.rows();
                    bw.v vVar3 = (bw.v) tVar;
                    vVar3.getClass();
                    Intrinsics.checkNotNullParameter(dst, "src");
                    Intrinsics.checkNotNullParameter(dst, "dst");
                    ((c10.h) vVar3.f19164a).a();
                } catch (Throwable th10) {
                    th = th10;
                }
            } catch (Throwable th11) {
                th = th11;
                mat2 = matC3;
                vVar.h(matC);
                vVar.h(mat2);
                vVar.h(dst);
                throw th;
            }
        } catch (Throwable th12) {
            th = th12;
            dst = matC2;
        }
        try {
            Core.normalize(dst, dst, 0.0d, dRows, 32);
            vVar.h(matC);
            vVar.h(mat2);
            return dst;
        } catch (Throwable th13) {
            th = th13;
            dst = dst;
            vVar.h(matC);
            vVar.h(mat2);
            vVar.h(dst);
            throw th;
        }
    }

    @Override // y50.a
    public void h1(d dVar, koi.c delegatesManager) {
        CoroutineScope coroutineScope = dVar.f138715a;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
        k kVarC = delegatesManager.c(ChatContextualChartDelegate.class);
        if (kVarC == null) {
            throw new IllegalStateException(h30.l.r("No delegate found for class ", o0.f186429a.b(ChatContextualChartDelegate.class).e()));
        }
        ChatContextualChartDelegate chatContextualChartDelegate = (ChatContextualChartDelegate) kVarC;
        Continuation continuation = null;
        e0.C(coroutineScope, null, null, new iz1.p(rd0.e.b(chatContextualChartDelegate.f52027m.f121375b), new j4h.b(this), continuation, 13), 3);
        e0.C(coroutineScope, null, null, new iz1.p(rd0.e.b(chatContextualChartDelegate.f52026l.f121375b), new j4h.c(this), continuation, 14), 3);
        e0.C(coroutineScope, null, null, new iz1.p(rd0.e.b(chatContextualChartDelegate.k.f121375b), new j4h.d(this), continuation, 15), 3);
    }

    public dx.k i(dh0.b face, lx.a image, int i, int i2) {
        qy5.a aVar = (qy5.a) this.f136517b;
        Intrinsics.checkNotNullParameter(face, "face");
        Intrinsics.checkNotNullParameter(image, "image");
        Rect rect = face.f114737a;
        Rect rect2 = new Rect(rect);
        Intrinsics.checkNotNullParameter(rect2, "rect");
        ch0.a aVar2 = image.f200499a;
        int i3 = aVar2.f24098b;
        int i5 = aVar2.f24099c;
        boolean z = (aVar2.d / 90) % 2 > 0;
        if (z) {
            i3 = i5;
        }
        if (z) {
            i5 = i3;
        }
        dh0.a aVar3 = face.f114738b;
        if (aVar3 != null) {
            aVar.n(rect, i3, i5, i, i2);
            return new j(rect, rect2, aVar3.f114736a);
        }
        aVar.n(rect, i3, i5, i, i2);
        return new dx.i(rect, rect2);
    }

    public Object l(boolean z, gim.c cVar) {
        Object objB = ((fla.g) this.f136517b).b(z ? w4l.i.f294643c : w4l.h.f294642c, cVar);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable m(java.util.List r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn2.c.m(java.util.List, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x0cb1  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x0ccb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(com.revolut.feature.backgroundpicker.api.model.BackgroundKey r7, com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 3930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn2.c.n(com.revolut.feature.backgroundpicker.api.model.BackgroundKey, com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration, gim.c):java.lang.Object");
    }

    public double o(Mat image, Mat templ) throws InterruptedException {
        Intrinsics.checkNotNullParameter(image, "hist1");
        Intrinsics.checkNotNullParameter(templ, "hist2");
        t tVar = (t) this.f136517b;
        Size size = new Size(1.0d, 1.0d);
        bw.v vVar = (bw.v) tVar;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(size, "size");
        ((c10.h) vVar.f19164a).a();
        Mat mat = Mat.createMatWithSizeObject(size, 5);
        Intrinsics.checkNotNullExpressionValue(mat, "createMatWithSizeObject(...)");
        vVar.getClass();
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(templ, "templ");
        Intrinsics.checkNotNullParameter(mat, "result");
        ((c10.h) vVar.f19164a).a();
        Imgproc.matchTemplate(image, templ, mat, 5);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(mat, "mat");
        ((c10.h) vVar.f19164a).a();
        double dAbs = Math.abs(czi.c.m(mat, 0)[0]);
        vVar.h(mat);
        return dAbs;
    }

    @Override // com.revolut.uicomponent.toolbar.app_bar.SearchViewListener
    public void onSearchViewShow(boolean z) {
        hqi.f fVar = (hqi.f) this.f136517b;
        if (!z) {
            fVar.f154711l.onNext(new Object());
        }
        fVar.f154712m.onNext(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(j1j.d r6, xi0.b r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof i2j.d
            if (r0 == 0) goto L13
            r0 = r8
            i2j.d r0 = (i2j.d) r0
            int r1 = r0.f157993x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157993x = r1
            goto L18
        L13:
            i2j.d r0 = new i2j.d
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f157993x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            j1j.d r6 = r0.u
            yhm.o.b(r8)
            goto L49
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r8)
            r0.u = r6
            r0.f157993x = r4
            if (r6 == 0) goto L45
            java.lang.Object r8 = r5.f136517b
            p2j.c r8 = (p2j.c) r8
            java.lang.Object r7 = r8.b(r6, r7, r0)
            r8 = r7
            goto L46
        L45:
            r8 = r3
        L46:
            if (r8 != r1) goto L49
            return r1
        L49:
            com.revolut.core.ui_kit.models.Clause r8 = (com.revolut.core.ui_kit.models.Clause) r8
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.retail.feature.balance.picker.api.R$string.currency_picker_cta_title
            r1 = 14
            r7.<init>(r0, r3, r3, r1)
            if (r6 == 0) goto L57
            goto L58
        L57:
            r4 = 0
        L58:
            h2j.j r6 = new h2j.j
            r6.<init>(r8, r7, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fn2.c.p(j1j.d, xi0.b, gim.c):java.lang.Object");
    }

    public r q(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        prl.e eVar = (prl.e) this.f136517b;
        Intrinsics.checkNotNullParameter(currency, "currency");
        return ((w4l.f) eVar.e).f(currency, false);
    }

    public vkm.d r(String query, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        a0 a0Var = (a0) this.f136517b;
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return a0Var.f12316c.b(query, loadingStrategy);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(java.lang.String r5, com.revolut.feature.shops.api.model.ShopsBenefit r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, gim.c r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof jid.a
            if (r0 == 0) goto L13
            r0 = r10
            jid.a r0 = (jid.a) r0
            int r1 = r0.f174427w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f174427w = r1
            goto L18
        L13:
            jid.a r0 = new jid.a
            r0.<init>(r4, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f174427w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)
            goto L76
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r10)
            java.lang.Object r10 = r4.f136517b
            kl.t1 r10 = (kl.t1) r10
            java.lang.String r6 = r6.f87020a
            java.lang.String r2 = "campaignId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.lang.String r2 = "rewardType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            java.lang.Object r10 = r10.f185240b
            com.revolut.feature.shops.impl.service.AdvertisingService r10 = (com.revolut.feature.shops.impl.service.AdvertisingService) r10
            fid.b r2 = new fid.b
            r2.<init>(r6, r7, r8, r9)
            efm.d0 r5 = r10.redeem(r5, r2)
            oh3.a r6 = new oh3.a
            r7 = 12
            r6.<init>(r7)
            oid.y r7 = new oid.y
            r8 = 1
            r7.<init>(r6, r8)
            r5.getClass()
            ufm.i r6 = new ufm.i
            r6.<init>(r5, r7, r8)
            java.lang.String r5 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            ufm.n r5 = o70.a.b(r6)
            r0.f174427w = r3
            java.lang.Object r10 = nim.a.b(r5, r0)
            if (r10 != r1) goto L76
            return r1
        L76:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: fn2.c.s(java.lang.String, com.revolut.feature.shops.api.model.ShopsBenefit, java.lang.String, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r1 == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        if (skm.k0.b(r12, r3) == r4) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00bf -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(java.io.File r18, gim.c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn2.c.t(java.io.File, gim.c):java.lang.Object");
    }

    public void u(kf.e eVar) {
        this.f136517b = eVar;
    }

    public float v(float f) {
        return -((TrendView) this.f136517b).l(f);
    }

    public c(fa9.c function) {
        this.f136516a = 1;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f136517b = function;
    }

    public c(m function) {
        this.f136516a = 3;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f136517b = function;
    }

    public c(h2i.b function) {
        this.f136516a = 13;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f136517b = function;
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f136516a = i;
        this.f136517b = obj2;
    }

    public c(dl9.c payWithPhotoMapper) {
        this.f136516a = 24;
        Intrinsics.checkNotNullParameter(payWithPhotoMapper, "payWithPhotoMapper");
        this.f136517b = payWithPhotoMapper;
    }

    public c(xv.h cameraKitDetector) {
        this.f136516a = 18;
        Intrinsics.checkNotNullParameter(cameraKitDetector, "cameraKitDetector");
        this.f136517b = cameraKitDetector;
    }

    public c(fla.g repository) {
        this.f136516a = 21;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f136517b = repository;
    }

    public c(sf0.h serverErrorParser) {
        this.f136516a = 6;
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f136517b = serverErrorParser;
    }

    public c(a0 repository) {
        this.f136516a = 7;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f136517b = repository;
    }

    public c(MerchantAppVerificationService verificationService) {
        this.f136516a = 25;
        Intrinsics.checkNotNullParameter(verificationService, "verificationService");
        this.f136517b = verificationService;
    }

    public c(s listItemsProvider) {
        this.f136516a = 5;
        Intrinsics.checkNotNullParameter(listItemsProvider, "listItemsProvider");
        this.f136517b = listItemsProvider;
    }

    public c(prl.e cryptoDetailsRepository) {
        this.f136516a = 4;
        Intrinsics.checkNotNullParameter(cryptoDetailsRepository, "cryptoDetailsRepository");
        this.f136517b = cryptoDetailsRepository;
    }

    public c(qy5.a viewCoordinatesProjector) {
        this.f136516a = 23;
        Intrinsics.checkNotNullParameter(viewCoordinatesProjector, "viewCoordinatesProjector");
        this.f136517b = viewCoordinatesProjector;
    }

    public c(l widgetModel) {
        this.f136516a = 19;
        Intrinsics.checkNotNullParameter(widgetModel, "widgetModel");
        this.f136517b = widgetModel;
    }

    public c(Json json) {
        this.f136516a = 28;
        Intrinsics.checkNotNullParameter(json, "json");
        this.f136517b = json;
    }

    public c(t1 shopsRedeemRepository) {
        this.f136516a = 20;
        Intrinsics.checkNotNullParameter(shopsRedeemRepository, "shopsRedeemRepository");
        this.f136517b = shopsRedeemRepository;
    }

    public c(p2j.c disclaimerProvider) {
        this.f136516a = 14;
        Intrinsics.checkNotNullParameter(disclaimerProvider, "disclaimerProvider");
        this.f136517b = disclaimerProvider;
    }

    public c(n walletInteractor) {
        this.f136516a = 8;
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f136517b = walletInteractor;
    }

    public c(t openCvProxy) {
        this.f136516a = 12;
        Intrinsics.checkNotNullParameter(openCvProxy, "openCvProxy");
        this.f136517b = openCvProxy;
    }

    public c(xoj.a featuresInteractor) {
        this.f136516a = 2;
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f136517b = featuresInteractor;
    }

    public c(im2.f fVar, gm2.b coreBackgroundPickerConfiguration) {
        this.f136516a = 0;
        Intrinsics.checkNotNullParameter(coreBackgroundPickerConfiguration, "coreBackgroundPickerConfiguration");
        this.f136517b = fVar;
    }

    public c(wa7.p hiddenAccountsActionsProvider) {
        this.f136516a = 17;
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsProvider, "hiddenAccountsActionsProvider");
        this.f136517b = hiddenAccountsActionsProvider;
    }

    public c(jl9.b repository, l80.e dateProvider) {
        this.f136516a = 9;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f136517b = repository;
    }

    public c(ryc.a extensionMapper) {
        this.f136516a = 22;
        Intrinsics.checkNotNullParameter(extensionMapper, "extensionMapper");
        this.f136517b = extensionMapper;
    }
}
