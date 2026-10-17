package ce9;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Parcelable;
import android.view.View;
import androidx.core.content.ContextCompat;
import aw0.o9;
import ch.qos.logback.core.CoreConstants;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.corporate_events.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.add.step.breed.PetBreedDetailsContract$BreedParam;
import com.revolut.feature.tab.accounts.api.model.ProductAccountListAction;
import com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchResponse;
import com.revolut.feature.travel.miles.api.model.TravelMilesMoneyRangeFilter;
import com.revolut.feature.travel.miles.api.model.TravelMilesNumberRangeFilter;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAppliedFilters;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.esim.api.model.EsimUserPocket;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingButton;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingHyperText;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingRefund;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.y;
import gkl.w0;
import h93.j0;
import h93.l0;
import ind.b0;
import ind.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import jel.a3;
import jkl.p2;
import kg.u;
import kg.v;
import kg.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import lnd.p0;
import mx0.tb;
import org.joda.time.LocalDate;
import org.joda.time.format.ISODateTimeFormat;
import org.json.JSONObject;
import yhm.m;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public abstract class m {
    public static final String A(String str, String prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return prefix + str;
    }

    public static final PetBreedDetailsContract$BreedParam B(List list, zw7.h breedType, PetBreedDetailsContract$BreedParam petBreedDetailsContract$BreedParam) {
        zw7.e eVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(breedType, "breedType");
        Intrinsics.checkNotNullParameter(petBreedDetailsContract$BreedParam, "default");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((zw7.e) obj2).f325775c == breedType) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.size() != 1) {
            arrayList = null;
        }
        if (arrayList == null || (eVar = (zw7.e) d0.b0(arrayList)) == null) {
            return petBreedDetailsContract$BreedParam;
        }
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return new PetBreedDetailsContract$BreedParam(eVar.f325773a, eVar.f325774b, true);
    }

    public static void C(efm.r rVar) {
        zfm.d dVar = new zfm.d(1);
        dfm.c cVar = mfm.f.d;
        ofm.p pVar = new ofm.p(cVar, dVar, dVar, cVar);
        rVar.subscribe(pVar);
        if (dVar.getCount() != 0) {
            try {
                dVar.await();
            } catch (InterruptedException e) {
                lfm.d.a(pVar);
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e);
            }
        }
        Throwable th10 = dVar.f322034a;
        if (th10 != null) {
            throw zfm.h.d(th10);
        }
    }

    public static void D(efm.r rVar, y yVar) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ofm.g gVar = new ofm.g(linkedBlockingQueue);
        yVar.onSubscribe(gVar);
        rVar.subscribe(gVar);
        while (!gVar.isDisposed()) {
            Object objPoll = linkedBlockingQueue.poll();
            if (objPoll == null) {
                try {
                    objPoll = linkedBlockingQueue.take();
                } catch (InterruptedException e) {
                    gVar.dispose();
                    yVar.onError(e);
                    return;
                }
            }
            if (gVar.isDisposed() || objPoll == ofm.g.f224917b || zfm.m.b(yVar, objPoll)) {
                return;
            }
        }
    }

    public static void E(efm.r rVar, kfm.g gVar, kfm.g gVar2, kfm.a aVar) {
        mfm.f.b(gVar, "onNext is null");
        mfm.f.b(gVar2, "onError is null");
        mfm.f.b(aVar, "onComplete is null");
        D(rVar, new ofm.p(gVar, gVar2, aVar, mfm.f.d));
    }

    public static void F(Throwable th10) {
        if (th10 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th10);
        }
        if (th10 instanceof ThreadDeath) {
            throw ((ThreadDeath) th10);
        }
        if (th10 instanceof LinkageError) {
            throw ((LinkageError) th10);
        }
    }

    public static final ArrayList G(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(g(f0.f322471a, (my8.y) it8.next()));
        }
        return w.u(arrayList);
    }

    public static final fel.c H(lhl.f fVar) {
        fel.a aVar;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String str = fVar.f195397a;
        List<lhl.e> list = fVar.f195398b;
        List list2 = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (lhl.e eVar : list) {
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                String str2 = eVar.f195393a;
                String str3 = eVar.f195395c;
                fel.a[] aVarArrValues = fel.a.values();
                int length = aVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = aVarArrValues[i];
                    if (a0.z(aVar.name(), str3, true)) {
                        break;
                    }
                    i++;
                }
                fel.b bVar = aVar == null ? null : new fel.b(str2, aVar, eVar.f195394b);
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
            list2 = arrayList;
        }
        if (list2 == null) {
            list2 = f0.f322471a;
        }
        return new fel.c(str, list2);
    }

    public static final w0 I(p2 p2Var) {
        Intrinsics.checkNotNullParameter(p2Var, "<this>");
        switch (yjl.r.f314553b[p2Var.ordinal()]) {
            case 1:
                return w0.ADDRESS;
            case 2:
                return w0.BIRTHDATE;
            case 3:
                return w0.CITIZENSHIP;
            case 4:
                return w0.EMAIL;
            case 5:
                return w0.NAME;
            case 6:
                return w0.OPENID;
            case 7:
                return w0.PHONE;
            case 8:
                return w0.PROFILE;
            case 9:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final kbk.j J(vbk.f fVar) {
        PlanGiftingRefund planGiftingRefund;
        kbk.c cVar;
        PlanGiftingButton planGiftingButton;
        PlanGiftingButton planGiftingButton2;
        PlanGiftingButton planGiftingButton3;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String strF = fVar.getId();
        String strG = fVar.getPlanId();
        PlanGiftingHyperText planGiftingHyperTextA = xbk.a.a(fVar.getTitle());
        PlanGiftingHyperText planGiftingHyperTextA2 = xbk.a.a(fVar.getSubtitle());
        PlanGiftingHyperText planGiftingHyperTextA3 = xbk.a.a(fVar.getTerms());
        vbk.a aVarB = fVar.getAsset();
        Intrinsics.checkNotNullParameter(aVarB, "<this>");
        kbk.b bVar = kbk.c.Companion;
        String strA = aVarB.getType();
        bVar.getClass();
        kbk.c[] cVarArrValues = kbk.c.values();
        int length = cVarArrValues.length;
        int i = 0;
        while (true) {
            planGiftingRefund = null;
            if (i >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i];
            if (Intrinsics.f(cVar.a(), strA)) {
                break;
            }
            i++;
        }
        if (cVar == null) {
            throw new IllegalStateException("Unknown asset type");
        }
        kbk.d dVar = new kbk.d(aVarB.getUrl(), cVar);
        String strA2 = fVar.getActionTitle();
        vbk.b bVarC = fVar.getClaimButton();
        if (bVarC != null) {
            Intrinsics.checkNotNullParameter(bVarC, "<this>");
            planGiftingButton = new PlanGiftingButton(bVarC.getTitle());
        } else {
            planGiftingButton = null;
        }
        vbk.b bVarE = fVar.getDeclineButton();
        if (bVarE != null) {
            Intrinsics.checkNotNullParameter(bVarE, "<this>");
            planGiftingButton2 = new PlanGiftingButton(bVarE.getTitle());
        } else {
            planGiftingButton2 = null;
        }
        vbk.b bVarH = fVar.getSeeBenefitsButton();
        if (bVarH != null) {
            Intrinsics.checkNotNullParameter(bVarH, "<this>");
            planGiftingButton3 = new PlanGiftingButton(bVarH.getTitle());
        } else {
            planGiftingButton3 = null;
        }
        vbk.g gVarD = fVar.getClaimRule();
        if (gVarD != null) {
            Intrinsics.checkNotNullParameter(gVarD, "<this>");
            PlanGiftingHyperText planGiftingHyperTextA4 = xbk.a.a(gVarD.getTitle());
            PlanGiftingHyperText planGiftingHyperTextA5 = xbk.a.a(gVarD.getSubtitle());
            jo3.a aVarA = gVarD.getRefundQuote();
            planGiftingRefund = new PlanGiftingRefund(aVarA != null ? mo3.a.o(aVarA) : null, planGiftingHyperTextA4, planGiftingHyperTextA5);
        }
        return new kbk.j(strF, strG, planGiftingHyperTextA, planGiftingHyperTextA2, planGiftingHyperTextA3, dVar, strA2, planGiftingButton, planGiftingButton2, planGiftingButton3, planGiftingRefund);
    }

    public static final String K(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return ISODateTimeFormat.date().print(localDate);
    }

    public static final JSONObject L(u uVar) {
        Object objA;
        Object objA2;
        if (uVar == null || (uVar instanceof v)) {
            return new JSONObject();
        }
        if (uVar instanceof kg.w) {
            return new JSONObject(((kg.w) uVar).toString());
        }
        if (!(uVar instanceof x)) {
            return new JSONObject();
        }
        x xVar = (x) uVar;
        try {
            m.Companion aVar = yhm.m.INSTANCE;
            objA = xVar.f();
        } catch (Throwable th10) {
            m.Companion aVar2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        String str = (String) objA;
        if (str != null) {
            try {
                objA2 = new JSONObject(str);
            } catch (Throwable th11) {
                m.Companion aVar3 = yhm.m.INSTANCE;
                objA2 = yhm.o.a(th11);
            }
            JSONObject jSONObject = (JSONObject) (objA2 instanceof yhm.n ? null : objA2);
            if (jSONObject != null) {
                return jSONObject;
            }
        }
        return new JSONObject();
    }

    public static final Map M(String str, boolean z) {
        return r0.k(new Pair("STEP_UP_RESPONSE", z ? "accepted" : "failure"), new Pair("ACTIVATION_CODE", str));
    }

    public static final ProductAccountWidgetAction N(ProductAccountListAction productAccountListAction) {
        Intrinsics.checkNotNullParameter(productAccountListAction, "<this>");
        String str = productAccountListAction.f89510a;
        Clause clause = productAccountListAction.f89511b;
        sfe.g gVar = productAccountListAction.d;
        sfe.f fVar = productAccountListAction.e;
        Image image = productAccountListAction.f89512c;
        boolean z = productAccountListAction.f;
        boolean z3 = productAccountListAction.f89513g;
        return new ProductAccountWidgetAction(productAccountListAction.i, clause, image, productAccountListAction.f89514h, str, fVar, gVar, z, z3);
    }

    public static final ArrayList O(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(N((ProductAccountListAction) it8.next()));
        }
        return arrayList;
    }

    public static final CompositeClause P(Clause clause, Integer num) {
        Intrinsics.checkNotNullParameter(clause, "<this>");
        int i = R$drawable.uikit_icn_16_info_outline;
        Float fValueOf = Float.valueOf(12.0f);
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(clause, new ImageClause(i, num, fValueOf, fValueOf, 16)));
    }

    public static final int a(iel.e eVar) {
        switch (ip3.n.f167642a[eVar.ordinal()]) {
            case 1:
                return R$string.feature_corporate_events_event_type_ex_dividend_title;
            case 2:
                return R$string.feature_corporate_events_legend_dividend;
            case 3:
                return R$string.feature_corporate_events_legend_market_holiday;
            case 4:
                return R$string.feature_corporate_events_listing_change_name;
            case 5:
                return R$string.feature_corporate_events_stock_split_name;
            case 6:
                return R$string.feature_corporate_events_symbol_change_name;
            case 7:
                return R$string.feature_corporate_events_earnings_call_name;
            case 8:
                return R$string.feature_corporate_events_event_type_merger_title;
            case 9:
                return R$string.feature_corporate_events_event_type_spin_off_title;
            case 10:
                return R$string.feature_corporate_events_event_type_bankruptcy_title;
            case 11:
                return R$string.feature_corporate_events_event_type_bond_coupon_title;
            case 12:
                return R$string.feature_corporate_events_event_type_structured_note_call_title;
            case 13:
                return R$string.feature_corporate_events_event_type_structured_note_principal_title;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int b(iel.e eVar) {
        switch (ip3.n.f167642a[eVar.ordinal()]) {
            case 1:
                return R$attr.uikit_colorYellow;
            case 2:
                return R$attr.uikit_colorGreen;
            case 3:
                return R$attr.uikit_colorRed;
            case 4:
                return R$attr.uikit_colorOrange;
            case 5:
                return R$attr.uikit_colorDeepPurple;
            case 6:
                return R$attr.uikit_colorCyan;
            case 7:
                return R$attr.uikit_colorPink;
            case 8:
                return R$attr.uikit_colorCyan;
            case 9:
                return R$attr.uikit_colorOrange;
            case 10:
                return R$attr.uikit_colorRed;
            case 11:
                return R$attr.uikit_colorYellow;
            case 12:
                return R$attr.uikit_colorGreen;
            case 13:
                return R$attr.uikit_colorCyan;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final List c() {
        return zhm.v.k(iel.e.EX_DIVIDEND, iel.e.DIVIDENDS, iel.e.LISTING_CHANGE, iel.e.STOCK_SPLIT, iel.e.MERGER, iel.e.SYMBOL_CHANGE, iel.e.COMPANY_MEETING, iel.e.MARKET_HOLIDAY, iel.e.SPINOFF, iel.e.BANKRUPTCY, iel.e.COUPON, iel.e.CALL, iel.e.PRINCIPAL);
    }

    public static final List d(p0 p0Var, b0 section) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        Intrinsics.checkNotNullParameter(section, "section");
        if (section instanceof ind.a0) {
            return zhm.u.c(p0.c(p0Var, ((ind.a0) section).f162787a));
        }
        if (!(section instanceof z)) {
            throw new NoWhenBranchMatchedException();
        }
        z zVar = (z) section;
        return zhm.v.k(p0.c(p0Var, zVar.f162835a), p0.c(p0Var, zVar.f162836b));
    }

    public static final boolean e(EsimUserPocket esimUserPocket, dj0.d checkoutPrice) {
        Intrinsics.checkNotNullParameter(esimUserPocket, "<this>");
        Intrinsics.checkNotNullParameter(checkoutPrice, "checkoutPrice");
        dj0.d dVar = esimUserPocket.f100533c;
        if (Intrinsics.f(dVar.f115083b, checkoutPrice.f115083b)) {
            return dVar.e(checkoutPrice);
        }
        xi0.b bVar = dVar.f115083b;
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "EsimCheckoutExtensions", a0.d.s("Can not perform balance sufficiency check. Pocket currency ", bVar.f306286a, " does not match payment currency ", checkoutPrice.f115083b.f306286a), null, h0Var);
        return false;
    }

    public static final void f(ActionFooterView actionFooterView, ScreenContentRecyclerView scrollingView) {
        Intrinsics.checkNotNullParameter(actionFooterView, "<this>");
        Intrinsics.checkNotNullParameter(scrollingView, "scrollingView");
        tb tbVar = new tb("BOTTOM_OVERLAY_PADDING_LISTENER_TOKEN");
        tbVar.a(scrollingView);
        final at4.b bVar = new at4.b(tbVar, actionFooterView, 13);
        final int i = 0;
        actionFooterView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ay0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i5, int i6, int i21, int i22, int i32, int i33) {
                switch (i) {
                    case 0:
                        bVar.invoke();
                        break;
                    default:
                        bVar.invoke();
                        break;
                }
            }
        });
        final int i2 = 1;
        scrollingView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ay0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i22, int i3, int i5, int i6, int i21, int i222, int i32, int i33) {
                switch (i2) {
                    case 0:
                        bVar.invoke();
                        break;
                    default:
                        bVar.invoke();
                        break;
                }
            }
        });
    }

    public static final List g(List list, my8.y yVar) {
        ArrayList arrayListF0 = d0.F0(yVar.f210402a, list);
        ArrayList arrayList = yVar.f210403b;
        if (arrayList.isEmpty()) {
            return zhm.u.c(arrayListF0);
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(g(arrayListF0, (my8.y) it8.next()));
        }
        return w.u(arrayList2);
    }

    public static final Bitmap h(int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable drawable = ContextCompat.getDrawable(context, i);
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i);
            Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(...)");
            return bitmapDecodeResource;
        }
        if (!(drawable instanceof VectorDrawable)) {
            throw new IllegalArgumentException("unsupported drawable type");
        }
        VectorDrawable vectorDrawable = (VectorDrawable) drawable;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvasE = ch.qos.logback.core.util.a.e(bitmapCreateBitmap, "createBitmap(...)", bitmapCreateBitmap);
        vectorDrawable.setBounds(0, 0, canvasE.getWidth(), canvasE.getHeight());
        vectorDrawable.draw(canvasE);
        return bitmapCreateBitmap;
    }

    public static final boolean i(hfg.j jVar, TravelMilesSearchAppliedFilters appliedFilters) {
        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter;
        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(appliedFilters, "appliedFilters");
        return (appliedFilters.f94125a.isEmpty() && appliedFilters.f94126b.isEmpty() && ((travelMilesNumberRangeFilter = appliedFilters.f94127c) == null || !(travelMilesNumberRangeFilter.equals(jVar.f151852c) ^ true)) && (((travelMilesMoneyRangeFilter = appliedFilters.d) == null || !(travelMilesMoneyRangeFilter.equals(jVar.d) ^ true)) && appliedFilters.e.isEmpty() && appliedFilters.f.isEmpty())) ? false : true;
    }

    public static final String j(Map map, Parcelable value) {
        Object next;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Iterator it8 = map.entrySet().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((Map.Entry) next).getValue(), value)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (String) entry.getKey();
        }
        return null;
    }

    public static final ArrayList k(List list, List selectedDocs) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selectedDocs, "selectedDocs");
        Iterator it8 = selectedDocs.iterator();
        while (it8.hasNext()) {
            my8.l lVar = (my8.l) it8.next();
            Iterator it9 = list.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next = null;
                    break;
                }
                next = it9.next();
                if (Intrinsics.f(((my8.y) next).f210402a.f210383a, lVar.f210383a)) {
                    break;
                }
            }
            my8.y yVar = (my8.y) next;
            if (yVar == null) {
                return null;
            }
            list = yVar.f210403b;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it10 = list2.iterator();
        while (it10.hasNext()) {
            arrayList.add(((my8.y) it10.next()).f210402a);
        }
        return arrayList;
    }

    public static final int l(iwg.a productType, boolean z) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        switch (cyg.a.f110092b[productType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return R$drawable.uikit_icn_24_wealth;
            case 5:
                return R$drawable.uikit_icn_24_bitcoin;
            case 6:
                return R$drawable.uikit_icn_24_commodities;
            case 7:
                return z ? R$drawable.uikit_icn_16_revolut : R$drawable.uikit_icn_24_robo_advisor;
            case 8:
                return R$drawable.uikit_icn_24_cfd;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int m(a3 sector, boolean z) {
        Intrinsics.checkNotNullParameter(sector, "sector");
        switch (cyg.a.f110091a[sector.ordinal()]) {
            case 1:
                return R$drawable.uikit_icn_24_materials;
            case 2:
                return R$drawable.uikit_icn_24_gear;
            case 3:
                return R$drawable.uikit_icn_24_coins;
            case 4:
                return R$drawable.uikit_icn_24_lightning;
            case 5:
                return R$drawable.uikit_icn_24_fastfood;
            case 6:
                return R$drawable.uikit_icn_24_tech;
            case 7:
                return R$drawable.uikit_icn_24_globe;
            case 8:
                return R$drawable.uikit_icn_24_utilities;
            case 9:
                return R$drawable.uikit_icn_24_heart;
            case 10:
                return R$drawable.uikit_icn_24_shopping;
            case 11:
                return R$drawable.uikit_icn_24_drop;
            case 12:
                return R$drawable.uikit_icn_24_bank;
            case 13:
                return R$drawable.uikit_icn_24_bank;
            case 14:
                return R$drawable.uikit_icn_24_bank;
            case 15:
                return R$drawable.uikit_icn_24_cash;
            case 16:
                return R$drawable.uikit_icn_24_bitcoin;
            case 17:
                return R$drawable.uikit_icn_24_more_ios;
            case 18:
                return R$drawable.uikit_icn_24_cfd;
            case 19:
                return R$drawable.uikit_icn_24_commodities;
            case 20:
                return z ? R$drawable.uikit_icn_16_revolut : R$drawable.uikit_icn_24_robo_advisor;
            case 21:
                return R$drawable.uikit_icn_24_more_ios;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static String n(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb6 = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb6.append('[');
                sb6.append(iArr2[i2]);
                sb6.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb6.append(CoreConstants.DOT);
                String str = strArr[i2];
                if (str != null) {
                    sb6.append(str);
                }
            }
        }
        return sb6.toString();
    }

    public static final int o(iwg.a productType, boolean z) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        switch (cyg.a.f110092b[productType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_product_stocks_title;
            case 5:
                return com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_product_crypto_title;
            case 6:
                return com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_product_commodities_title;
            case 7:
                return z ? com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_product_strategies_title : com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_product_robo_title;
            case 8:
                return com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_product_cfds_title;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int p(a3 sector, boolean z) {
        Intrinsics.checkNotNullParameter(sector, "sector");
        switch (cyg.a.f110091a[sector.ordinal()]) {
            case 1:
                return com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_sector_materials_title;
            case 2:
                return com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_sector_industrials_title;
            case 3:
                return com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_sector_financial_title;
            case 4:
                return com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_sector_energy_title;
            case 5:
                return com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_sector_consumer_cyclical_title;
            case 6:
                return com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_sector_technology_title;
            case 7:
                return com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_sector_communication_services_title;
            case 8:
                return com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_sector_real_estate_title;
            case 9:
                return com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_sector_healthcare_title;
            case 10:
                return com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_sector_consumer_defensive_title;
            case 11:
                return com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_sector_utilities_title;
            case 12:
                return com.revolut.retail.wealth.resources.R$string.wealth_robo_template_details_allocation_government_bonds;
            case 13:
                return com.revolut.retail.wealth.resources.R$string.wealth_robo_template_details_allocation_corporate_bonds;
            case 14:
                return com.revolut.retail.wealth.resources.R$string.wealth_robo_template_details_allocation_securitized;
            case 15:
                return com.revolut.retail.wealth.resources.R$string.wealth_robo_template_details_allocation_cash_and_derivatives;
            case 16:
                return com.revolut.retail.wealth.resources.R$string.wealth_robo_template_details_allocation_cryptocurrency;
            case 17:
                return R.string.common_action_other;
            case 18:
                return com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_sector_cfds_title;
            case 19:
                return com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_sector_commodities_title;
            case 20:
                return z ? com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_sector_strategies_title : com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_sector_robo_title;
            case 21:
                return com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_sector_other_title;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final l0 q(e93.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        List listK = fVar.k();
        c93.h.Companion.getClass();
        if (listK.contains(c93.h.f22281p)) {
            return l0.BRAZIL_LOCAL;
        }
        if (fVar.k().contains(c93.h.f22282q)) {
            return l0.BRAZIL_GLOBAL;
        }
        if (fVar.k().contains(c93.h.f22283r)) {
            return l0.INDIA_LOCAL;
        }
        if (fVar.k().contains(c93.h.f22284s)) {
            return l0.INDIA_GLOBAL;
        }
        l0 l0VarR = fVar.r();
        l0 l0Var = l0.US_SECURED_CREDIT;
        if (l0VarR == l0Var) {
            return l0Var;
        }
        l0 l0VarR2 = fVar.r();
        l0 l0Var2 = l0.CREDIT;
        if (l0VarR2 == l0Var2 && fVar.q() == j0.FAMILY) {
            return l0Var2;
        }
        l0 l0VarR3 = fVar.r();
        l0 l0Var3 = l0.CRYPTO;
        if (l0VarR3 == l0Var3) {
            return l0Var3;
        }
        return null;
    }

    public static final boolean r(e93.d dVar, c93.h feature) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(feature, "feature");
        return dVar.f123828g.contains(feature);
    }

    public static final boolean s(e93.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        List listK = fVar.k();
        c93.h.Companion.getClass();
        return listK.contains(c93.h.f22277j);
    }

    public static final boolean t(TravelSearchResponse travelSearchResponse) {
        Intrinsics.checkNotNullParameter(travelSearchResponse, "<this>");
        return travelSearchResponse.f92899b.isEmpty() && travelSearchResponse.f92900c.isEmpty() && travelSearchResponse.f92898a.isEmpty();
    }

    public static final boolean u(e93.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return fVar.q() == j0.PRO;
    }

    public static final boolean v(e93.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return fVar.r() == l0.INDIA_GLOBAL;
    }

    public static final boolean w(e93.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return fVar.q() == j0.YOUTH;
    }

    public static final boolean x(e93.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (!s(eVar)) {
            return false;
        }
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (eVar.f123850p != j0.RETAIL) {
            return false;
        }
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return eVar.r() != l0.CREDIT;
    }

    public static List y(p pVar, Function1 mapLoading, Function2 mapError, Function3 mapContent, Function1 mapPageLoading, Function2 mapPageError) {
        cbh.b mapNullContent = new cbh.b(16);
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(mapLoading, "mapLoading");
        Intrinsics.checkNotNullParameter(mapError, "mapError");
        Intrinsics.checkNotNullParameter(mapContent, "mapContent");
        Intrinsics.checkNotNullParameter(mapPageLoading, "mapPageLoading");
        Intrinsics.checkNotNullParameter(mapPageError, "mapPageError");
        Intrinsics.checkNotNullParameter(mapNullContent, "mapNullContent");
        Object obj2 = pVar.f23436a;
        boolean z = pVar.f23437b;
        boolean z3 = pVar.d;
        Throwable th10 = pVar.e;
        Throwable th11 = pVar.f23438c;
        if (obj2 != null && !z3 && th10 == null) {
            return (List) mapContent.invoke(obj2, Boolean.valueOf(z), th11);
        }
        if (z) {
            return (List) mapLoading.invoke(k.f);
        }
        if (obj2 != null && z3) {
            return d0.E0((Iterable) mapPageLoading.invoke(l.f), (Collection) mapContent.invoke(obj2, Boolean.FALSE, th11));
        }
        if (obj2 != null && tj0.a.a(th10)) {
            return d0.E0((Iterable) mapPageError.invoke(th10, new ccg.c(15)), (Collection) mapContent.invoke(obj2, Boolean.FALSE, th11));
        }
        if (obj2 == null || th10 == null) {
            return tj0.a.a(th11) ? (List) mapError.invoke(th11, new ccg.c(16)) : th11 != null ? (List) mapError.invoke(th11, new ccg.c(17)) : f0.f322471a;
        }
        return d0.E0((List) mapPageError.invoke(th10, new ccg.c(17)), (Collection) mapContent.invoke(obj2, Boolean.FALSE, th11));
    }

    public static final long z(float f) {
        long j2;
        long j3;
        if (f > 1.0E8f) {
            j2 = (long) (f / 1.0E7f);
            j3 = 10000000;
        } else {
            if (f > 1.0E7f || f > 1000000.0f) {
                return ((long) (f / 100000.0f)) * 100000;
            }
            if (f <= 100000.0f) {
                return (long) f;
            }
            j2 = (long) (f / 10000.0f);
            j3 = 10000;
        }
        return j2 * j3;
    }
}
