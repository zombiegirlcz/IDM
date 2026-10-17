package jb3;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import c93.m;
import cg0.r;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.camerakit.core.camerax.extras.model.ResultInternal;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.foundation.R$id;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.impl.ui.flow.DocumentUpload;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChart;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChartPoint;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import e93.j0;
import ft3.d1;
import ft3.j1;
import grl.m2;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import ix0.f1;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mha.n;
import mha.o;
import mha.p;
import org.joda.time.DateTime;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f172594a;

    public static final PerformanceChart A(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        pvg.i iVar = (pvg.i) d0.d0(list);
        if (iVar == null) {
            return null;
        }
        DateTime dateTime = iVar.f240155b;
        DateTime dateTime2 = iVar.f240156c;
        List<pvg.i> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (pvg.i iVar2 : list2) {
            arrayList.add(new PerformanceChartPoint(iVar2.e, iVar2.f, iVar2.f240157g, iVar2.f240158h, hx7.a.v(iVar2.i)));
        }
        return new PerformanceChart(dateTime, dateTime2, arrayList, iVar.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Type inference failed for: r6v10, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList B(java.util.List r42) {
        /*
            Method dump skipped, instruction units count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jb3.l.B(java.util.List):java.util.ArrayList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    public static final jn8.b C(rn8.i iVar) throws Throwable {
        ?? arrayList;
        jn8.a aVar;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        List<String> list = iVar.f255531a;
        if (list != null) {
            arrayList = new ArrayList();
            for (String str : list) {
                if (Intrinsics.f(str, "QR_CODE")) {
                    aVar = jn8.a.f176658a;
                } else {
                    hx7.e.n(new IllegalStateException(j6.a.q("Unknown restricted sign in method ", str)));
                    aVar = null;
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
        } else {
            arrayList = f0.f322471a;
        }
        return new jn8.b(arrayList);
    }

    public static final p D(zek.k kVar, xi0.b currency) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        String strA = kVar.getUnit();
        if (Intrinsics.f(strA, "QUANTITY")) {
            return new o(Long.parseLong(kVar.getValue()));
        }
        if (Intrinsics.f(strA, "MONEY")) {
            return new n(new dj0.d(Long.parseLong(kVar.getValue()), currency));
        }
        throw new IllegalArgumentException(j6.a.q("unknown plan limit value unit: ", kVar.getUnit()));
    }

    public static final o18.a E(j18.d dVar) {
        o18.b bVar;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        String str = dVar.f170138a;
        j18.f fVar = dVar.f170139b;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        switch (i18.a.f157588a[fVar.ordinal()]) {
            case 1:
                bVar = o18.b.PRICE_MOVEMENT;
                break;
            case 2:
                bVar = o18.b.REVOLUT_RECOMMENDATION;
                break;
            case 3:
                bVar = o18.b.EXTERNAL_SUGGESTION;
                break;
            case 4:
                bVar = o18.b.FUNDAMENTAL_METRIC_CHANGE;
                break;
            case 5:
                bVar = o18.b.PRICE_TARGET_CHANGE;
                break;
            case 6:
                bVar = o18.b.EARNING_CALL;
                break;
            case 7:
                bVar = o18.b.UNKNOWN;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new o18.a(str, bVar, dVar.f170140c, dVar.d, dVar.e, dVar.f, dVar.f170141g, dVar.f170142h);
    }

    public static final tn1.a F(ro1.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String str = bVar.f255802c;
        String str2 = bVar.f;
        String str3 = bVar.d;
        jo3.a aVarP = mo3.a.p(bVar.f255800a);
        List<no1.b> list = bVar.f255801b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (no1.b bVar2 : list) {
            Intrinsics.checkNotNullParameter(bVar2, "<this>");
            arrayList.add(new sn1.a(bVar2.f217897a.name(), bVar2.f217898b));
        }
        String str4 = (str2 == null || str2.length() != 0) ? str2 : null;
        ro1.a aVar = bVar.e;
        return new tn1.a(str, str3, aVar != null ? aVar.name() : null, str4, arrayList, aVarP);
    }

    public static final zek.k G(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        if (pVar instanceof n) {
            return new zek.k("MONEY", String.valueOf(((n) pVar).f205461a.f115082a));
        }
        if (pVar instanceof o) {
            return new zek.k("QUANTITY", String.valueOf(((o) pVar).f205462a));
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Pair H(PerformanceChart performanceChart, eel.c timeSpan, String assetTypesId, xi0.b currency, iwg.c method, String str) {
        Intrinsics.checkNotNullParameter(performanceChart, "<this>");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(assetTypesId, "assetTypesId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(method, "method");
        pvg.j jVar = new pvg.j(timeSpan, performanceChart.f94991a, performanceChart.f94992b, performanceChart.d, assetTypesId, currency.f306286a, method, str == null ? "" : str);
        List<PerformanceChartPoint> list = performanceChart.f94993c;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (PerformanceChartPoint performanceChartPoint : list) {
            arrayList.add(new pvg.k(timeSpan, performanceChartPoint.f94994a, performanceChartPoint.f94995b, performanceChartPoint.f94996c, performanceChartPoint.d, hx7.a.A(performanceChartPoint.e), assetTypesId, currency.f306286a, method, str == null ? "" : str));
        }
        return new Pair(jVar, arrayList);
    }

    public static final s6l.n I(c93.l lVar) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        jo3.b bVarA = hx7.a.A(lVar.f22290a);
        jo3.b bVarA2 = hx7.a.A(lVar.f22291b);
        List list = lVar.f22292c;
        s6l.l lVar2 = null;
        if (list != null) {
            List<m> list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            for (m mVar : list2) {
                Intrinsics.checkNotNullParameter(mVar, "<this>");
                arrayList.add(new s6l.j(mVar.f22294b.name(), hx7.a.A(mVar.f22293a)));
            }
        } else {
            arrayList = null;
        }
        j0 j0Var = lVar.d;
        if (j0Var != null) {
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            lVar2 = new s6l.l(hx7.a.A(j0Var.f123876a), hx7.a.A(j0Var.f123877b), hx7.a.A(j0Var.f123878c));
        }
        return new s6l.n(bVarA, bVarA2, arrayList, lVar2);
    }

    public static final s6l.o J(c93.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return new s6l.o(I(jVar.f22288a), I(jVar.f22289b));
    }

    public static final LinkedHashMap K(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<DocumentUpload> list2 = list;
        int iB = q0.b(w.t(list2, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (DocumentUpload documentUpload : list2) {
            DocumentType documentType = documentUpload.f85909a;
            List list3 = documentUpload.f85910b;
            ArrayList arrayList = new ArrayList(w.t(list3, 10));
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                arrayList.add(new File((String) it8.next()));
            }
            linkedHashMap.put(documentType, arrayList);
        }
        return linkedHashMap;
    }

    public static final ah0.a L(LatLng latLng) {
        Intrinsics.checkNotNullParameter(latLng, "<this>");
        return new ah0.a(latLng.latitude, latLng.longitude);
    }

    public static final LatLng M(ah0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new LatLng(aVar.f4847a, aVar.f4848b);
    }

    public static final BigDecimal N(InstrumentTicker instrumentTicker) {
        BigDecimal bigDecimalValueOf;
        BigDecimal bigDecimalValueOf2;
        Intrinsics.checkNotNullParameter(instrumentTicker, "<this>");
        ej0.b bVar = instrumentTicker.f;
        if (bVar == null || (bigDecimalValueOf = bVar.f126703a) == null) {
            bigDecimalValueOf = BigDecimal.valueOf(instrumentTicker.e.f115082a);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        }
        ej0.b bVar2 = instrumentTicker.f105120p;
        if (bVar2 == null || (bigDecimalValueOf2 = bVar2.f126703a) == null) {
            dj0.d dVar = instrumentTicker.o;
            if (dVar == null) {
                return null;
            }
            bigDecimalValueOf2 = BigDecimal.valueOf(dVar.f115082a);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        }
        return t(bigDecimalValueOf, bigDecimalValueOf2);
    }

    public static final void a() {
        Intrinsics.checkNotNullParameter("PINNED_CONTACTS", "id");
    }

    public static final String b(r rVar) {
        String strB = rVar.getEntityId();
        String strC = rVar.getEntityType();
        return v0.a.i(v0.a.m("HelpCenterQuickActionTroubleshootersBodyDto(entityId=", strB, ", entityType=", strC, ", action="), rVar.getAction(), ")");
    }

    public static final String c(phl.a aVar) {
        LocalDate localDate = aVar.f236341b;
        LocalDate localDate2 = aVar.f236342c;
        boolean z = aVar.d;
        String str = aVar.f236340a;
        String str2 = aVar.e;
        Integer num = aVar.f;
        iel.f fVar = aVar.f236343g;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(localDate);
        sb6.append("_");
        sb6.append(localDate2);
        sb6.append("_");
        sb6.append(z);
        j6.a.D(sb6, "_", str, "_", str2);
        sb6.append("_");
        sb6.append(num);
        sb6.append("_");
        sb6.append(fVar);
        return sb6.toString();
    }

    public static final void d(Paint paint, Context context, int i) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int iX = kli.a.x(i, context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iX, R$styleable.TextAppearance);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        TypedValue typedValue = new TypedValue();
        typedArrayObtainStyledAttributes.getValue(R$styleable.TextAppearance_android_fontFamily, typedValue);
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.TextAppearance_android_textStyle, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TextAppearance_android_textSize, -1);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iX, new int[]{R.attr.fontFeatureSettings});
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
        paint.setFontFeatureSettings(typedArrayObtainStyledAttributes2.getString(0));
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(iX, new int[]{R.attr.letterSpacing});
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes3, "obtainStyledAttributes(...)");
        float f = typedArrayObtainStyledAttributes3.getFloat(0, BitmapDescriptorFactory.HUE_RED);
        CharSequence charSequence = typedValue.string;
        int i3 = typedValue.resourceId;
        paint.setTypeface(i3 != 0 ? is0.c.a(i3, context) : charSequence != null ? Typeface.create(charSequence.toString(), i2) : null);
        paint.setTextSize(dimensionPixelSize);
        paint.setLetterSpacing(f);
        typedArrayObtainStyledAttributes3.recycle();
    }

    public static final void e(TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        f(textView, kli.a.x(i, context));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(android.widget.TextView r8, int r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            android.content.Context r1 = r8.getContext()
            int r2 = androidx.appcompat.R$attr.lineHeight
            int[] r2 = new int[]{r2}
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r9, r2)
            java.lang.String r2 = "obtainStyledAttributes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r2 = 0
            r3 = -1
            int r4 = r1.getDimensionPixelSize(r2, r3)
            r1.recycle()
            androidx.core.widget.TextViewCompat.setTextAppearance(r8, r9)
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r1 < r5) goto Lb3
            android.content.Context r1 = r8.getContext()
            java.lang.String r5 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L71
            int[] r0 = androidx.appcompat.R$styleable.TextAppearance     // Catch: java.lang.Throwable -> L71
            android.content.res.TypedArray r9 = r1.obtainStyledAttributes(r9, r0)     // Catch: java.lang.Throwable -> L71
            java.lang.AutoCloseable r9 = (java.lang.AutoCloseable) r9     // Catch: java.lang.Throwable -> L71
            r0 = r9
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0     // Catch: java.lang.Throwable -> L65
            android.util.TypedValue r6 = new android.util.TypedValue     // Catch: java.lang.Throwable -> L65
            r6.<init>()     // Catch: java.lang.Throwable -> L65
            int r7 = androidx.appcompat.R$styleable.TextAppearance_android_fontFamily     // Catch: java.lang.Throwable -> L65
            boolean r0 = r0.getValue(r7, r6)     // Catch: java.lang.Throwable -> L65
            int r6 = r6.resourceId     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L67
            if (r6 == 0) goto L67
            android.content.res.Resources r0 = r1.getResources()     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = r0.getResourceTypeName(r6)     // Catch: java.lang.Throwable -> L65
            java.lang.String r1 = "font"
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r1)     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L67
            goto L68
        L65:
            r0 = move-exception
            goto L73
        L67:
            r6 = r2
        L68:
            r0 = 0
            mra.d.l(r9, r0)     // Catch: java.lang.Throwable -> L71
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L71
            goto L7f
        L71:
            r9 = move-exception
            goto L79
        L73:
            throw r0     // Catch: java.lang.Throwable -> L74
        L74:
            r1 = move-exception
            mra.d.l(r9, r0)     // Catch: java.lang.Throwable -> L71
            throw r1     // Catch: java.lang.Throwable -> L71
        L79:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r9 = yhm.o.a(r9)
        L7f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r1 = r9 instanceof yhm.n
            if (r1 == 0) goto L88
            r9 = r0
        L88:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 == 0) goto Lb3
            fd0.d r0 = is0.c.f168079a
            android.content.Context r0 = r8.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            android.graphics.Typeface r9 = is0.c.a(r9, r0)
            if (r9 == 0) goto Lb3
            is0.a r0 = g4i.a.j(r8)
            java.lang.String r1 = "typeface"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            r0.f168077b = r9
            aw0.i3 r1 = r0.f168078c
            if (r1 != 0) goto Lb3
            android.widget.TextView r0 = r0.f168076a
            r0.setTypeface(r9)
        Lb3:
            if (r4 == r3) goto Lb8
            androidx.core.widget.TextViewCompat.setLineHeight(r8, r4)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jb3.l.f(android.widget.TextView, int):void");
    }

    public static final float g(Context context, float f) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return f * context.getResources().getDisplayMetrics().density;
    }

    public static final Map h(ResultInternal resultInternal) {
        iw.a aVar = resultInternal.f50736a;
        Map map = aVar != null ? (Map) aVar.f168885a.f186385a : null;
        iw.a aVar2 = resultInternal.f50737b;
        Map map2 = aVar2 != null ? (Map) aVar2.f168885a.f186385a : null;
        iw.a aVar3 = resultInternal.f50738c;
        Map[] elements = {map, map2, aVar3 != null ? (Map) aVar3.f168885a.f186385a : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        if (listL.isEmpty()) {
            listL = null;
        }
        if (listL == null) {
            return null;
        }
        Iterator it8 = listL.iterator();
        if (!it8.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it8.next();
        while (it8.hasNext()) {
            next = r0.p((Map) next, (Map) it8.next());
        }
        return (Map) next;
    }

    public static final AnimatedBackgroundView i(js0.e eVar, ViewGroup fromView) {
        View childAt;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(fromView, "fromView");
        ViewParent parent = fromView.getParent();
        while (true) {
            if (parent == null) {
                return null;
            }
            CoordinatorLayout coordinatorLayout = parent instanceof CoordinatorLayout ? (CoordinatorLayout) parent : null;
            if (coordinatorLayout != null) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    childAt = coordinatorLayout.getChildAt(i);
                    Intrinsics.h(childAt);
                    if (childAt instanceof AnimatedBackgroundView) {
                        break;
                    }
                }
                childAt = null;
            } else {
                childAt = null;
            }
            AnimatedBackgroundView animatedBackgroundView = childAt instanceof AnimatedBackgroundView ? (AnimatedBackgroundView) childAt : null;
            if (animatedBackgroundView != null) {
                return animatedBackgroundView;
            }
            parent = parent.getParent();
        }
    }

    public static final ViewGroup j(js0.e eVar, View fromView) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(fromView, "fromView");
        Context context = fromView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityI = z92.f.i(context);
        if (activityI == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        View decorView = activityI.getWindow().getDecorView();
        Intrinsics.i(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup3 = (ViewGroup) decorView;
        Intrinsics.checkNotNullParameter(fromView, "fromView");
        while (true) {
            viewGroup = null;
            if (fromView == null) {
                viewGroup2 = null;
                break;
            }
            Object tag2 = fromView.getTag(R$id.internal_tag_dialog_host);
            viewGroup2 = tag2 instanceof ViewGroup ? (ViewGroup) tag2 : null;
            if (viewGroup2 != null) {
                break;
            }
            Object parent = fromView.getParent();
            fromView = parent instanceof View ? (View) parent : null;
        }
        if (viewGroup2 != null) {
            if (viewGroup2.getWidth() == viewGroup3.getWidth() && viewGroup2.getHeight() == viewGroup3.getHeight()) {
                viewGroup = viewGroup2;
            }
            if (viewGroup != null) {
                return viewGroup;
            }
        }
        return viewGroup3;
    }

    public static final FloatingBottomBarView k(js0.e eVar, View from) {
        View childAt;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        ViewParent parent = from.getParent();
        while (true) {
            if (parent == null) {
                return null;
            }
            CoordinatorLayout coordinatorLayout = parent instanceof CoordinatorLayout ? (CoordinatorLayout) parent : null;
            if (coordinatorLayout != null) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    childAt = coordinatorLayout.getChildAt(i);
                    Intrinsics.h(childAt);
                    if (childAt instanceof FloatingBottomBarView) {
                        break;
                    }
                }
                childAt = null;
            } else {
                childAt = null;
            }
            FloatingBottomBarView floatingBottomBarView = childAt instanceof FloatingBottomBarView ? (FloatingBottomBarView) childAt : null;
            if (floatingBottomBarView != null) {
                return floatingBottomBarView;
            }
            parent = parent.getParent();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0017, code lost:
    
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.core.ui_kit.views.o l(js0.e r1, android.view.View r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r1 = "fromView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            android.view.ViewParent r1 = r2.getParent()
            boolean r2 = r1 instanceof android.view.View
            r0 = 0
            if (r2 == 0) goto L16
            android.view.View r1 = (android.view.View) r1
            goto L17
        L16:
            r1 = r0
        L17:
            if (r1 == 0) goto L29
            boolean r2 = r1 instanceof com.revolut.core.ui_kit.views.o
            if (r2 == 0) goto L1e
            goto L2a
        L1e:
            android.view.ViewParent r1 = r1.getParent()
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L16
            android.view.View r1 = (android.view.View) r1
            goto L17
        L29:
            r1 = r0
        L2a:
            boolean r2 = r1 instanceof com.revolut.core.ui_kit.views.o
            if (r2 == 0) goto L31
            com.revolut.core.ui_kit.views.o r1 = (com.revolut.core.ui_kit.views.o) r1
            return r1
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jb3.l.l(js0.e, android.view.View):com.revolut.core.ui_kit.views.o");
    }

    public static final Double m(Collection collection, xi0.b from, xi0.b to6) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        if (Intrinsics.f(from, to6)) {
            return Double.valueOf(1.0d);
        }
        Collection collection2 = collection;
        Iterator it8 = collection2.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            n9l.a aVar = (n9l.a) next;
            if (Intrinsics.f(aVar.f213661a, from) && Intrinsics.f(aVar.f213662b, to6)) {
                break;
            }
        }
        n9l.a aVar2 = (n9l.a) next;
        if (aVar2 != null) {
            return Double.valueOf(aVar2.f213663c);
        }
        Iterator it9 = collection2.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            n9l.a aVar3 = (n9l.a) next2;
            if (Intrinsics.f(aVar3.f213662b, from) && Intrinsics.f(aVar3.f213661a, to6)) {
                break;
            }
        }
        n9l.a aVar4 = (n9l.a) next2;
        if (aVar4 != null) {
            return Double.valueOf(1.0d / aVar4.f213663c);
        }
        return null;
    }

    public static final ScreenContentRecyclerView n(View view) {
        if (view instanceof ScreenContentRecyclerView) {
            return (ScreenContentRecyclerView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            ScreenContentRecyclerView screenContentRecyclerViewN = n(childAt);
            if (screenContentRecyclerViewN != null) {
                return screenContentRecyclerViewN;
            }
        }
        return null;
    }

    public static final ViewGroup o(js0.e eVar, View fromView, boolean z) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(fromView, "fromView");
        loop0: while (fromView != null) {
            if (!z || (fromView instanceof CoordinatorLayout)) {
                ViewGroup viewGroup = fromView instanceof ViewGroup ? (ViewGroup) fromView : null;
                if (viewGroup != null) {
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        Intrinsics.h(childAt);
                        if (childAt instanceof AppBarLayout) {
                            break loop0;
                        }
                    }
                }
            }
            Object parent = fromView.getParent();
            fromView = parent instanceof View ? (View) parent : null;
        }
        if (fromView instanceof ViewGroup) {
            return (ViewGroup) fromView;
        }
        return null;
    }

    public static js0.f p(js0.e eVar, View screenDescendant) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(screenDescendant, "screenDescendant");
        ViewGroup viewGroupO = o(eVar, screenDescendant, true);
        if (viewGroupO != null) {
            return new js0.f(screenDescendant, viewGroupO);
        }
        return null;
    }

    public static final fri.a q(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        FragmentActivity activity = fragment.getActivity();
        BaseDelegatesActivity baseDelegatesActivity = activity instanceof BaseDelegatesActivity ? (BaseDelegatesActivity) activity : null;
        if (baseDelegatesActivity == null) {
            throw new IllegalArgumentException(fragment.requireActivity().getClass().getSimpleName().concat(" doesn't inherited from BaseDelegatesActivity"));
        }
        Intrinsics.checkNotNullParameter(baseDelegatesActivity, "<this>");
        gsi.a aVarL0 = baseDelegatesActivity.L0();
        Intrinsics.i(aVarL0, "null cannot be cast to non-null type T of com.revolut.retail.core.ui.activity.BaseDelegatesActivityExtensionKt.getBaseActivityComponentWithInjector");
        return (fri.a) aVarL0;
    }

    public static final int r(m5l.b bVar) {
        switch (bVar == null ? -1 : gue.a.f146903a[bVar.ordinal()]) {
            case -1:
            case 10:
            case 11:
            case 12:
                return R$drawable.uikit_icn_24_card_number;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return R$drawable.uikit_icn_24_logo_visa_colour;
            case 2:
                return R$drawable.uikit_icn_24_logo_ma;
            case 3:
                return R$drawable.uikit_icn_24_logo_mc;
            case 4:
                return R$drawable.uikit_icn_24_logo_amex_colour;
            case 5:
                return R$drawable.uikit_icn_24_logo_diners_club_colour;
            case 6:
                return R$drawable.uikit_icn_24_logo_discover_colour;
            case 7:
                return R$drawable.uikit_icn_24_logo_jcb_colour;
            case 8:
                return R$drawable.uikit_icn_24_mb_way;
            case 9:
                return R$drawable.uikit_icn_24_logo_rupay;
        }
    }

    public static final f1 s(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag2 = view.getTag(R$id.internal_layer_type_controller);
        f1 f1Var = tag2 instanceof f1 ? (f1) tag2 : null;
        if (f1Var != null) {
            return f1Var;
        }
        f1 f1Var2 = new f1(view);
        view.setTag(R$id.internal_layer_type_controller, f1Var2);
        return f1Var2;
    }

    public static final BigDecimal t(BigDecimal current, BigDecimal previous) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(previous, "previous");
        BigDecimal scale = current.setScale(5, 6);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        BigDecimal scale2 = previous.setScale(5, 6);
        Intrinsics.checkNotNullExpressionValue(scale2, "setScale(...)");
        BigDecimal ZERO = BigDecimal.ZERO;
        if (scale2.equals(ZERO.setScale(scale2.scale()))) {
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        BigDecimal bigDecimalDivide = scale.divide(scale2, RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalSubtract = bigDecimalDivide.subtract(ONE);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal scale3 = bigDecimalSubtract.multiply(bigDecimalValueOf).setScale(3);
        Intrinsics.checkNotNullExpressionValue(scale3, "setScale(...)");
        return scale3;
    }

    public static final BigDecimal u(BigDecimal current, BigDecimal previous) {
        BigDecimal bigDecimalValueOf;
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(previous, "previous");
        BigDecimal bigDecimalAbs = t(current, previous).abs();
        if (current.compareTo(previous) >= 0) {
            bigDecimalValueOf = BigDecimal.ONE;
        } else {
            bigDecimalValueOf = BigDecimal.valueOf(-1);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        }
        BigDecimal bigDecimalMultiply = bigDecimalAbs.multiply(bigDecimalValueOf);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    public static void v(Throwable th10) {
        if (th10 == null) {
            th10 = ygm.g.b("onError called with a null Throwable.");
        } else if (!(th10 instanceof OnErrorNotImplementedException) && !(th10 instanceof MissingBackpressureException) && !(th10 instanceof QueueOverflowException) && !(th10 instanceof IllegalStateException) && !(th10 instanceof NullPointerException) && !(th10 instanceof IllegalArgumentException) && !(th10 instanceof CompositeException)) {
            th10 = new UndeliverableException(v1.c.u("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | ", th10), th10);
        }
        th10.printStackTrace();
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th10);
    }

    public static final m2 w(d1 d1Var) {
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        switch (zr3.a.f324549a[d1Var.f137810a.ordinal()]) {
            case 1:
                gt3.f fVar = d1Var.f137811b;
                return fVar == gt3.d.REFINANCING ? m2.REFINANCING_LOAN : fVar == gt3.d.LOAN ? m2.FIXED_TERM_CREDIT : m2.FIXED_TERM_CREDIT;
            case 2:
                return m2.CREDIT_CARD;
            case 3:
                return m2.BUY_NOW_PAY_LATER;
            case 4:
                return m2.CREDIT_CARD_LIMIT_INCREASE;
            case 5:
                return m2.FAMILY_CREDIT_CARD;
            case 6:
                return m2.BASIC_CREDIT_CARD;
            case 7:
                return m2.MORTGAGE;
            case 8:
                return m2.REFINANCING_MORTGAGE;
            case 9:
                return m2.MORTGAGE_RENEGOTIATION;
            case 10:
                return m2.FTC_FORBEARANCE;
            case 11:
                return m2.CC_FORBEARANCE;
            case 12:
                return m2.OVERDRAFT;
            case 13:
                return m2.POST_TERMINATION_REPAYMENT_PLAN;
            case 14:
                return m2.POST_TERMINATION_PARTIAL_SETTLEMENTS;
            case 15:
                return m2.CREDIT_CARD_LIMIT_DECREASE;
            case 16:
                return m2.NON_EMBEDDED_CREDIT_INSURANCE_LOAN;
            case 17:
                return m2.NON_EMBEDDED_CREDIT_INSURANCE_CREDIT_CARD;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final m2 x(j1 j1Var, gt3.f fVar) {
        Intrinsics.checkNotNullParameter(j1Var, "<this>");
        switch (zr3.a.f324549a[j1Var.ordinal()]) {
            case 1:
                return fVar == gt3.d.REFINANCING ? m2.REFINANCING_LOAN : fVar == gt3.d.LOAN ? m2.FIXED_TERM_CREDIT : m2.FIXED_TERM_CREDIT;
            case 2:
                return m2.CREDIT_CARD;
            case 3:
                return m2.BUY_NOW_PAY_LATER;
            case 4:
                return m2.CREDIT_CARD_LIMIT_INCREASE;
            case 5:
                return m2.FAMILY_CREDIT_CARD;
            case 6:
                return m2.BASIC_CREDIT_CARD;
            case 7:
                return m2.MORTGAGE;
            case 8:
                return m2.REFINANCING_MORTGAGE;
            case 9:
                return m2.MORTGAGE_RENEGOTIATION;
            case 10:
                return m2.FTC_FORBEARANCE;
            case 11:
                return m2.CC_FORBEARANCE;
            case 12:
                return m2.OVERDRAFT;
            case 13:
                return m2.POST_TERMINATION_REPAYMENT_PLAN;
            case 14:
                return m2.POST_TERMINATION_PARTIAL_SETTLEMENTS;
            case 15:
                return m2.CREDIT_CARD_LIMIT_DECREASE;
            case 16:
                return m2.NON_EMBEDDED_CREDIT_INSURANCE_LOAN;
            case 17:
                return m2.NON_EMBEDDED_CREDIT_INSURANCE_CREDIT_CARD;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final c93.j y(s6l.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return new c93.j(z(oVar.getPrice()), z(oVar.getOriginalPrice()));
    }

    public static final c93.l z(s6l.n nVar) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        dj0.d dVarV = hx7.a.v(nVar.getTotal());
        dj0.d dVarV2 = hx7.a.v(nVar.getFee());
        List listC = nVar.getTaxes();
        j0 j0Var = null;
        if (listC != null) {
            List<s6l.j> list = listC;
            arrayList = new ArrayList(w.t(list, 10));
            for (s6l.j jVar : list) {
                Intrinsics.checkNotNullParameter(jVar, "<this>");
                dj0.d dVarV3 = hx7.a.v(jVar.getAmount());
                c93.n nVar2 = c93.o.Companion;
                String strB = jVar.getType();
                nVar2.getClass();
                arrayList.add(new m(dVarV3, c93.n.a(strB)));
            }
        } else {
            arrayList = null;
        }
        s6l.l lVarB = nVar.getQuote();
        if (lVarB != null) {
            Intrinsics.checkNotNullParameter(lVarB, "<this>");
            dj0.d dVarV4 = hx7.a.v(lVarB.getPoints());
            j0Var = new j0(dj0.d.c(dVarV4, 0L, xi0.b.a(dVarV4.f115083b, 6), 1), hx7.a.v(lVarB.getDiscount()), hx7.a.v(lVarB.getFinalTotal()));
        }
        return new c93.l(dVarV, dVarV2, arrayList, j0Var);
    }
}
