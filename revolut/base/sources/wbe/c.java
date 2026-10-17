package wbe;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.r;
import fva.m;
import ip0.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k71.q;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import mae.h;
import org.jetbrains.annotations.NotNull;
import pcd.s;
import qua.p;
import qua.u;
import qv0.i;
import te0.w;
import zhm.a0;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends abe.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.b f296138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f296139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f01.a f296140c;
    public final t70.b d;

    public c(h recurringPaymentsMapper, a9e.b commonSubscriptionMapper, e dateProvider, f01.a uiKitResources, t70.b currenciesLocalization) {
        Intrinsics.checkNotNullParameter(recurringPaymentsMapper, "recurringPaymentsMapper");
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        this.f296138a = commonSubscriptionMapper;
        this.f296139b = dateProvider;
        this.f296140c = uiKitResources;
        this.d = currenciesLocalization;
    }

    @Override // abe.a
    public final z a(Object obj2) {
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        if (!u.i(model.f296135a, ((f) this.f296139b).g())) {
            return null;
        }
        i9e.f fVar = (i9e.f) this.f296138a;
        ActionsView.Item[] elements = {fVar.m(), fVar.x()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return fVar.c(d.L(elements));
    }

    @Override // abe.a
    public final List b(Object obj2) {
        Data data;
        Data data2;
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        p pVar = model.f296135a;
        q qVar = model.f296137c;
        Data data3 = model.f296136b;
        boolean zI = u.i(pVar, ((f) this.f296139b).g());
        String str = pVar.f249325m;
        ibd.e eVar = pVar.f249314a;
        a9e.b bVar = this.f296138a;
        if (zI) {
            ArrayList arrayList = new ArrayList();
            i9e.f fVar = (i9e.f) bVar;
            i[] elements = {fVar.r(pVar, false), (eVar.e == null || ofm.q.H(pVar)) ? null : fVar.F(eVar.e), ofm.q.y(pVar) ? fVar.v(eVar.f, pVar) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = d.L(elements);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            a0.x(listL, arrayList);
            CellDetailsDelegate.Model modelA = fVar.A(pVar);
            yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
            arrayList.add(modelA);
            CellDetailsNoteDelegate.Model modelW = fVar.w(str);
            if (modelW != null) {
                yp0.b.l(modelW, 0, 0, 0, 0, null, false, 63);
                arrayList.add(modelW);
            }
            try {
                Object content = data3.getContent();
                data2 = new Data(content != null ? ((hce.d) content).f150888a : null, data3.getError(), data3.getLoading());
            } catch (Throwable th10) {
                data2 = new Data(null, th10, data3.getLoading());
            }
            hce.d dVar = (hce.d) data3.getContent();
            List listD = fVar.d(data2, qVar, dVar != null ? dVar.f150889b : null);
            if (listD != null) {
                a0.x(listD, arrayList);
            }
            CellDetailsChevronDelegate.Model modelS = fVar.s();
            yp0.b.l(modelS, 0, 0, 0, 0, null, false, 63);
            arrayList.add(modelS);
            CellDetailsChevronDelegate.Model modelL = fVar.l(R.string.common_action_delete);
            yp0.b.l(modelL, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
            arrayList.add(modelL);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        m mVar = pVar.u;
        i9e.f fVar2 = (i9e.f) bVar;
        sa saVarZ = fVar2.z(mVar != null ? mVar.f138404a : null);
        yp0.b.l(saVarZ, 0, 0, 0, 0, null, false, 63);
        arrayList2.add(saVarZ);
        i[] elements2 = {fVar2.r(pVar, false), (eVar.e == null || ofm.q.H(pVar)) ? null : fVar2.F(eVar.e)};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        List listL2 = d.L(elements2);
        yp0.b.k(listL2, 0, 0, 0, 0, 31);
        a0.x(listL2, arrayList2);
        CellDetailsDelegate.Model modelA2 = fVar2.A(pVar);
        yp0.b.l(modelA2, 0, 0, 0, 0, null, false, 63);
        arrayList2.add(modelA2);
        CellDetailsNoteDelegate.Model modelW2 = fVar2.w(str);
        if (modelW2 != null) {
            yp0.b.l(modelW2, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(modelW2);
        }
        try {
            Object content2 = data3.getContent();
            data = new Data(content2 != null ? ((hce.d) content2).f150888a : null, data3.getError(), data3.getLoading());
        } catch (Throwable th11) {
            data = new Data(null, th11, data3.getLoading());
        }
        hce.d dVar2 = (hce.d) data3.getContent();
        List listD2 = fVar2.d(data, qVar, dVar2 != null ? dVar2.f150889b : null);
        if (listD2 != null) {
            a0.x(listD2, arrayList2);
        }
        CellDetailsChevronDelegate.Model modelS2 = fVar2.s();
        yp0.b.l(modelS2, 0, 0, 0, 0, null, false, 63);
        arrayList2.add(modelS2);
        CellDetailsChevronDelegate.Model modelL2 = fVar2.l(R.string.common_action_delete);
        yp0.b.l(modelL2, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
        arrayList2.add(modelL2);
        return d0.Z(arrayList2);
    }

    @Override // abe.a
    public final r c(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        hce.b bVar = subscriptionContent.f150886a;
        return w.h(new a(bVar.f150883a, bVar.f150884b, bVar.f150885c));
    }

    @Override // abe.a
    public final r d(hce.c subscriptionContent) {
        npg.b bVar;
        Image imageB;
        s sVar;
        Map map;
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        hce.b bVar2 = subscriptionContent.f150886a;
        p pVar = bVar2.f150883a;
        q qVar = bVar2.f150885c;
        String str = null;
        if (qVar == null || (map = qVar.d) == null) {
            bVar = null;
        } else {
            Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
            bVar = (npg.b) map.get(pVar.f249318c);
        }
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        boolean zI = u.i(pVar, ((f) this.f296139b).g());
        dj0.d dVarB = zae.c.b(subscriptionContent);
        i9e.f fVar = (i9e.f) this.f296138a;
        MoneyClause moneyClauseU = fVar.u(dVarB, zI);
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        TextClause textClause = new TextClause(h.a(pVar, this.f296140c, this.d), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.recurring_payment_details_header_subtitle_one_off, null, null, 14);
        LayeredImage layeredImageG = fVar.g(!zI);
        if (bVar == null || (imageB = bVar.f218208b) == null) {
            imageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_vaults_generic, Integer.valueOf(R$attr.uikit_colorTerracotta), R$attr.uikit_colorWhite, 8.0f, null, null, 48);
        }
        Image image = imageB;
        if (bVar != null && (sVar = bVar.f218207a) != null && sVar.f234881a != null) {
            str = "ID_SAVINGS_VAULTS";
        }
        return w.h(new hce.a(moneyClauseU, textClause, textLocalisedClause, image, layeredImageG, str, 32));
    }
}
