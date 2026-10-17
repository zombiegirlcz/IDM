package ip0;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import bt0.h;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ContextualBarChartDelegate;
import com.revolut.core.ui_kit.delegates.ContextualLineChartDelegate;
import com.revolut.core.ui_kit.delegates.ContextualSegmentedBarDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.delegates.ExtraLargeListingCardDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LinearProgressWithAmountDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardBasicDelegate;
import com.revolut.core.ui_kit.delegates.MapDelegate;
import com.revolut.core.ui_kit.views.ActionsView;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class ad implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f163422b;

    public /* synthetic */ ad(Object obj2, int i) {
        this.f163421a = i;
        this.f163422b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Integer numValueOf;
        ihm.f fVar;
        float fS0;
        switch (this.f163421a) {
            case 0:
                com.revolut.core.ui_kit.delegates.j4 j4Var = (com.revolut.core.ui_kit.delegates.j4) this.f163422b;
                aw0.m9 m9Var = (aw0.m9) obj2;
                aw0.x2 x2Var = j4Var.f54321r;
                if (x2Var != null) {
                    aw0.e5 e5Var = m9Var.f10429a;
                    String str = e5Var != null ? e5Var.f10289a : null;
                    if (!Intrinsics.f(x2Var.f10596c, str)) {
                        koi.j jVar = j4Var.e;
                        Intrinsics.i(jVar, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.ContextualBarChartDelegate.Model");
                        com.revolut.core.ui_kit.delegates.i4 i4Var = new com.revolut.core.ui_kit.delegates.i4((ContextualBarChartDelegate.Model) jVar, str);
                        ihm.f fVar2 = j4Var.f54320q;
                        if (fVar2 != null) {
                            fVar2.onNext(i4Var);
                        }
                    }
                }
                return Unit.f186387a;
            case 1:
                com.revolut.core.ui_kit.delegates.l4 l4Var = (com.revolut.core.ui_kit.delegates.l4) this.f163422b;
                bt0.h hVar = (bt0.h) obj2;
                if (Intrinsics.f(hVar, h.a.f18234a)) {
                    numValueOf = null;
                } else {
                    if (!(hVar instanceof bt0.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    numValueOf = Integer.valueOf(((bt0.i) hVar).f18235a);
                }
                if (!Intrinsics.f(l4Var.u, numValueOf)) {
                    l4Var.u = numValueOf;
                    ContextualLineChartDelegate.Model model = l4Var.f54419r;
                    if (model != null && (fVar = l4Var.f54418q) != null) {
                        fVar.onNext(new com.revolut.core.ui_kit.delegates.k4(model, numValueOf));
                    }
                }
                return Unit.f186387a;
            case 2:
                com.revolut.core.ui_kit.delegates.n4 n4Var = (com.revolut.core.ui_kit.delegates.n4) this.f163422b;
                int iIntValue = ((Integer) obj2).intValue();
                aw0.c3 c3Var = n4Var.f54495r;
                if (c3Var != null) {
                    aw0.a3 a3Var = (aw0.a3) zhm.d0.e0(iIntValue, c3Var.f10255b);
                    String str2 = a3Var != null ? a3Var.f10224a : null;
                    koi.j jVar2 = n4Var.e;
                    Intrinsics.i(jVar2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.ContextualSegmentedBarDelegate.Model");
                    com.revolut.core.ui_kit.delegates.m4 m4Var = new com.revolut.core.ui_kit.delegates.m4((ContextualSegmentedBarDelegate.Model) jVar2, str2);
                    ihm.f fVar3 = n4Var.f54494q;
                    if (fVar3 != null) {
                        fVar3.onNext(m4Var);
                    }
                }
                return Unit.f186387a;
            case 3:
                CounterTextDelegate.Model model2 = (CounterTextDelegate.Model) this.f163422b;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return model2;
            case 4:
                xf xfVar = (xf) this.f163422b;
                od0.i it8 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new Pair(xfVar, it8.g());
            case 5:
                EsimDelegate esimDelegate = (EsimDelegate) this.f163422b;
                com.revolut.core.ui_kit.delegates.r5 additionalDescriptionItem = (com.revolut.core.ui_kit.delegates.r5) obj2;
                Intrinsics.checkNotNullParameter(additionalDescriptionItem, "additionalDescriptionItem");
                esimDelegate.f.onNext(additionalDescriptionItem);
                return Unit.f186387a;
            case 6:
                EsimDelegate.Model model3 = (EsimDelegate.Model) this.f163422b;
                Boolean it9 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new Pair(model3, it9);
            case 7:
                ExtraLargeListingCardDelegate.Model model4 = (ExtraLargeListingCardDelegate.Model) this.f163422b;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return model4;
            case 8:
                ai aiVar = (ai) this.f163422b;
                Intrinsics.checkNotNullParameter((Configuration) obj2, "it");
                aiVar.H(aiVar.f163454n);
                aiVar.H(aiVar.o);
                aiVar.F();
                return Unit.f186387a;
            case 9:
                ji jiVar = (ji) this.f163422b;
                mx0.c6 item = (mx0.c6) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                return new ii(jiVar.f164838a, item);
            case 10:
                com.revolut.core.ui_kit.delegates.s6 s6Var = (com.revolut.core.ui_kit.delegates.s6) this.f163422b;
                tq0.c clickData = (tq0.c) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                return new Pair(s6Var, Integer.valueOf(clickData.f273450b));
            case 11:
                gl glVar = (gl) this.f163422b;
                t3 it10 = (t3) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new Pair(glVar, it10);
            case 12:
                on onVar = (on) this.f163422b;
                Intrinsics.checkNotNullParameter((View) obj2, "it");
                onVar.f.setSelectedPosition(-1);
                return Unit.f186387a;
            case 13:
                zo zoVar = (zo) this.f163422b;
                Intrinsics.checkNotNullParameter((Configuration) obj2, "it");
                wo woVar = zoVar.f167524y;
                if (woVar != null) {
                    zoVar.F(woVar);
                }
                return Unit.f186387a;
            case 14:
                com.revolut.core.ui_kit.delegates.i7 i7Var = (com.revolut.core.ui_kit.delegates.i7) this.f163422b;
                CharSequence text = (CharSequence) obj2;
                Intrinsics.checkNotNullParameter(text, "text");
                InputChecklistDelegate.Model model5 = i7Var.f;
                if (model5 != null) {
                    return new InputChecklistDelegate.TextData(model5.f52519a, text);
                }
                return null;
            case 15:
                LabelButtonDelegate.Model model6 = (LabelButtonDelegate.Model) this.f163422b;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return model6;
            case 16:
                LargeActionButtonDelegate.Model model7 = (LargeActionButtonDelegate.Model) this.f163422b;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return model7;
            case 17:
                qs qsVar = (qs) this.f163422b;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return qsVar;
            case 18:
                LinearProgressWithAmountDelegate linearProgressWithAmountDelegate = (LinearProgressWithAmountDelegate) this.f163422b;
                ty0.a clickData2 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                linearProgressWithAmountDelegate.f52672c.onNext(clickData2);
                return Unit.f186387a;
            case 19:
                LinearProgressWithAmountDelegate.Model model8 = (LinearProgressWithAmountDelegate.Model) this.f163422b;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (iIntValue2 == 0) {
                    fS0 = BitmapDescriptorFactory.HUE_RED;
                } else {
                    List listV0 = zhm.d0.V0(model8.f52678j.f54089a, iIntValue2);
                    ArrayList arrayList = new ArrayList(zhm.w.t(listV0, 10));
                    Iterator it11 = listV0.iterator();
                    while (it11.hasNext()) {
                        arrayList.add(Float.valueOf(((com.revolut.core.ui_kit.delegates.h8) it11.next()).f54236b));
                    }
                    fS0 = zhm.d0.S0(arrayList);
                }
                return Float.valueOf(fS0);
            case 20:
                ListingCardBasicDelegate.Model model9 = (ListingCardBasicDelegate.Model) this.f163422b;
                ActionsView.Item item2 = (ActionsView.Item) obj2;
                Intrinsics.checkNotNullParameter(item2, "item");
                return new com.revolut.core.ui_kit.delegates.p8(model9, item2);
            case 21:
                pu puVar = (pu) this.f163422b;
                Context context = puVar.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int i = ix0.s0.d((Drawable) obj2, context, aw0.s8.DEFAULT).f10611c;
                ((GradientDrawable) puVar.J.getValue()).setColors(new int[]{i, 0});
                puVar.H.setColor(i);
                return Unit.f186387a;
            case 22:
                MapDelegate mapDelegate = (MapDelegate) this.f163422b;
                th0.b mobileServices = (th0.b) obj2;
                Intrinsics.checkNotNullParameter(mobileServices, "mobileServices");
                mobileServices.getClass();
                mapDelegate.f52763g = new ai0.m();
                mapDelegate.e = new ai0.p();
                mapDelegate.f = new ai0.l();
                mapDelegate.f52764h = new ai0.o();
                mapDelegate.i = new ai0.u();
                mapDelegate.k = new ai0.b();
                mapDelegate.f52765j = new ai0.c();
                return Unit.f186387a;
            case 23:
                mx mxVar = (mx) this.f163422b;
                tq0.c clickData3 = (tq0.c) obj2;
                Intrinsics.checkNotNullParameter(clickData3, "clickData");
                Object obj3 = clickData3.f273449a.i;
                Intrinsics.i(obj3, "null cannot be cast to non-null type java.time.YearMonth");
                return new kx(mxVar, (YearMonth) obj3);
            case 24:
                px pxVar = (px) this.f163422b;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return pxVar;
            case 25:
                ((lz) this.f163422b).f.setCurrentTooltip((eu0.h) obj2);
                return Unit.f186387a;
            case 26:
                com.revolut.core.ui_kit.delegates.ea eaVar = (com.revolut.core.ui_kit.delegates.ea) this.f163422b;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return eaVar;
            case 27:
                ((com.revolut.core.ui_kit.delegates.ja) this.f163422b).k = ((Float) obj2).floatValue();
                return Unit.f186387a;
            case 28:
                m00 m00Var = (m00) this.f163422b;
                ActionsView.Item item3 = (ActionsView.Item) obj2;
                Intrinsics.checkNotNullParameter(item3, "item");
                return new l00(m00Var, item3);
            default:
                md mdVar = ((com.revolut.core.ui_kit.delegates.ma) this.f163422b).f54471r;
                if (mdVar != null) {
                    mdVar.invoke();
                }
                return Unit.f186387a;
        }
    }
}
