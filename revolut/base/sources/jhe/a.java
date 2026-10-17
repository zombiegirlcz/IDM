package jhe;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import yfe.a1;
import yfe.a2;
import yfe.a3;
import yfe.b1;
import yfe.b3;
import yfe.c1;
import yfe.d1;
import yfe.e2;
import yfe.h0;
import yfe.i1;
import yfe.l1;
import yfe.o1;
import yfe.p0;
import yfe.q0;
import yfe.q2;
import yfe.r1;
import yfe.r2;
import yfe.s1;
import yfe.t1;
import yfe.t2;
import yfe.u2;
import yfe.v2;
import yfe.w1;
import yfe.w2;
import yfe.x2;
import yfe.y0;
import yfe.y2;
import yfe.z0;
import yfe.z2;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6e.b f174216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f174217b;

    public a(b subproductImageMapper, g6e.b subaccountBackgroundInteractor) {
        Intrinsics.checkNotNullParameter(subproductImageMapper, "subproductImageMapper");
        Intrinsics.checkNotNullParameter(subaccountBackgroundInteractor, "subaccountBackgroundInteractor");
        this.f174216a = subaccountBackgroundInteractor;
        this.f174217b = r0.k(new Pair(yfe.a.Cash, Integer.valueOf(R$drawable.uikit_icn_24_coins)), new Pair(yfe.a.Savings, Integer.valueOf(R$drawable.uikit_icn_24_vault)), new Pair(yfe.a.Crypto, Integer.valueOf(R$drawable.uikit_icn_24_bitcoin)), new Pair(yfe.a.Invest, Integer.valueOf(R$drawable.uikit_icn_24_invest)), new Pair(yfe.a.Joint, Integer.valueOf(R$drawable.uikit_icn_24_joint)), new Pair(yfe.a.Credit, Integer.valueOf(R$drawable.uikit_icn_24_credit)), new Pair(yfe.a.Pro, Integer.valueOf(R$drawable.uikit_icn_24_services)), new Pair(yfe.a.Youth, Integer.valueOf(R$drawable.uikit_icn_24_children)), new Pair(yfe.a.Linked, Integer.valueOf(R$drawable.uikit_icn_24_link)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final p0 a(yfe.a category, h0 snapshot) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        TextClause textClause = new TextClause(snapshot.f313264c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int iIntValue = ((Number) r0.h(category, this.f174217b)).intValue();
        String str = snapshot.d;
        return new p0(iIntValue, textClause, str != null ? new TextClause(str, (Style) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), false, (o9) null, (List) null, 122) : null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final q0 b(yfe.a category, yfe.k snapshot) {
        Object b1Var;
        Object a1Var;
        LayeredImage layeredImageA;
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        int iIntValue = ((Number) r0.h(category, this.f174217b)).intValue();
        TextClause textClause = new TextClause(snapshot.f313274c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        dj0.d dVar = snapshot.d;
        List<s1> list = snapshot.f;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (s1 s1Var : list) {
            if (s1Var instanceof o1) {
                b1Var = new b1(iIntValue);
            } else {
                if (s1Var instanceof l1) {
                    a1Var = new c1(((l1) s1Var).f313281a);
                } else if (s1Var instanceof i1) {
                    i1 i1Var = (i1) s1Var;
                    b1Var = new y0.a(i1Var.f313268a, i1Var.f313269b, i1Var.f313270c, null, 8);
                } else {
                    if (!(s1Var instanceof r1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b3 b3Var = ((r1) s1Var).f313301a;
                    if (b3Var instanceof a3) {
                        a3 subproduct = (a3) b3Var;
                        Intrinsics.checkNotNullParameter(subproduct, "subproduct");
                        if (subproduct.equals(q2.INSTANCE)) {
                            layeredImageA = b.a(R$drawable.uikit_icn_24_cfd);
                        } else if (subproduct.equals(r2.INSTANCE)) {
                            layeredImageA = b.a(R$drawable.uikit_icn_24_commodities);
                        } else if (subproduct.equals(t2.INSTANCE)) {
                            layeredImageA = b.a(R$drawable.uikit_icn_24_wealth);
                        } else if (subproduct.equals(v2.INSTANCE)) {
                            layeredImageA = b.a(R$drawable.uikit_icn_24_children);
                        } else if (subproduct.equals(w2.INSTANCE)) {
                            layeredImageA = b.a(R$drawable.uikit_icn_24_joint);
                        } else if (subproduct.equals(y2.INSTANCE)) {
                            layeredImageA = b.a(R$drawable.uikit_icn_24_robo_advisor);
                        } else if (subproduct.equals(z2.INSTANCE)) {
                            layeredImageA = b.a(R$drawable.uikit_icn_24_revolut);
                        } else {
                            if (!subproduct.equals(u2.INSTANCE) && !subproduct.equals(x2.INSTANCE)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            layeredImageA = b.a(R$drawable.uikit_icn_24_bar_chart_percent);
                        }
                        a1Var = new a1(layeredImageA);
                    } else if (b3Var instanceof a2) {
                        a1Var = new z0(((a2) b3Var).f313241a);
                    } else if (b3Var instanceof e2) {
                        a1Var = new a1(((s6e.d) this.f174216a).d(((e2) b3Var).f313252a));
                    } else {
                        b1Var = new b1(iIntValue);
                    }
                }
                b1Var = a1Var;
            }
            arrayList.add(b1Var);
        }
        d1 d1Var = new d1(v13.d.Z(arrayList, new b1(iIntValue)), false);
        t1 t1Var = snapshot.f313275g;
        return new q0(textClause, dVar, d1Var, t1Var instanceof w1 ? (w1) t1Var : null, snapshot.f313276h, snapshot.i);
    }
}
