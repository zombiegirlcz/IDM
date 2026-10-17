package lnd;

import aw0.l2;
import aw0.o9;
import aw0.r1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f197154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f197155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f197156c;
    public final ArrayList d;
    public final List e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xi0.b f197157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l2 f197158h;
    public final boolean i;

    public a0(f0 mapper, TextLocalisedClause popupTitle, List currentLine, ArrayList currentLabels, List previousLine, ArrayList previousLabels, xi0.b currency, l2 performanceStyle, boolean z) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(popupTitle, "popupTitle");
        Intrinsics.checkNotNullParameter(currentLine, "currentLine");
        Intrinsics.checkNotNullParameter(currentLabels, "currentLabels");
        Intrinsics.checkNotNullParameter(previousLine, "previousLine");
        Intrinsics.checkNotNullParameter(previousLabels, "previousLabels");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(performanceStyle, "performanceStyle");
        this.f197154a = mapper;
        this.f197155b = popupTitle;
        this.f197156c = currentLine;
        this.d = currentLabels;
        this.e = previousLine;
        this.f = previousLabels;
        this.f197157g = currency;
        this.f197158h = performanceStyle;
        this.i = z;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    public final r1 a(int i) {
        Clause clause;
        int i2;
        int i3;
        Integer numValueOf = null;
        if (i != -1) {
            List list = this.e;
            if (!this.i || !list.isEmpty()) {
                boolean zIsEmpty = list.isEmpty();
                TextLocalisedClause textLocalisedClause = this.f197155b;
                ?? r92 = this.f197156c;
                ArrayList arrayList = this.d;
                xi0.b bVar = this.f197157g;
                if (zIsEmpty) {
                    Clause clause2 = (Clause) zhm.d0.e0(i, arrayList);
                    if (clause2 != null) {
                        List listK = zhm.v.k(textLocalisedClause, clause2);
                        Float f = (Float) zhm.d0.e0(i, r92);
                        if (f != null) {
                            return new r1(listK, zhm.v.k(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(otd.f.a(new dj0.d((long) f.floatValue(), bVar)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)));
                        }
                    }
                } else {
                    Clause clause3 = (Clause) zhm.d0.e0(i, arrayList);
                    if (clause3 != null && (clause = (Clause) zhm.d0.e0(i, this.f)) != null) {
                        List listK2 = zhm.v.k(textLocalisedClause, clause3, clause);
                        Float f4 = (Float) zhm.d0.e0(i, r92);
                        if (f4 != null) {
                            float fFloatValue = f4.floatValue();
                            Float f5 = (Float) zhm.d0.e0(i, list);
                            if (f5 != null) {
                                float fFloatValue2 = f5.floatValue();
                                Clause[] elements = new Clause[3];
                                float f6 = fFloatValue - fFloatValue2;
                                int i5 = e0.f197175c[this.f197158h.ordinal()];
                                if (i5 == 1) {
                                    i2 = R$attr.uikit_colorPerformancePositive;
                                    i3 = R$attr.uikit_colorPerformanceNegative;
                                } else {
                                    if (i5 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    i2 = R$attr.uikit_colorPerformanceNegative;
                                    i3 = R$attr.uikit_colorPerformancePositive;
                                }
                                if (f6 > BitmapDescriptorFactory.HUE_RED) {
                                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_10_stocks_arrow_up);
                                } else if (f6 < BitmapDescriptorFactory.HUE_RED) {
                                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_10_stocks_arrow_down);
                                    i2 = i3;
                                } else {
                                    i2 = R$attr.uikit_colorAccentNeutral;
                                }
                                Clause moneyClause = new MoneyClause(otd.f.a(new dj0.d(Math.abs((long) f6), bVar)), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(new Custom.Color.Solid(i2), false, false, 254), null, 8);
                                if (numValueOf != null) {
                                    List listK3 = zhm.v.k(new ImageClause(numValueOf.intValue(), new ImageClauseTint.Color(i2), (Float) null, (Float) null, 28), moneyClause);
                                    m70.a.t(kotlin.jvm.internal.t0.f186434a);
                                    moneyClause = new CompositeClause(listK3, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                                }
                                elements[0] = moneyClause;
                                elements[1] = new MoneyClause(otd.f.a(new dj0.d((long) fFloatValue, bVar)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                                elements[2] = new MoneyClause(otd.f.a(new dj0.d((long) fFloatValue2, bVar)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                                Intrinsics.checkNotNullParameter(elements, "elements");
                                return new r1(listK2, kotlin.collections.d.L(elements));
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return this.f197154a.equals(a0Var.f197154a) && this.f197155b.equals(a0Var.f197155b) && this.f197156c.equals(a0Var.f197156c) && this.d.equals(a0Var.d) && Intrinsics.f(this.e, a0Var.e) && this.f.equals(a0Var.f) && this.f197157g.equals(a0Var.f197157g) && this.f197158h == a0Var.f197158h && this.i == a0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((this.f197158h.hashCode() + h30.l.j(this.f197157g, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, p.a.b(t61.a.a(this.f197154a.hashCode() * 31, 31, this.f197155b), 31, this.f197156c), 31), 31, this.e), 31), 31)) * 31);
    }
}
