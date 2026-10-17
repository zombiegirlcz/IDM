package v4e;

import aw0.cb;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import d9.e1;
import ip0.iq;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jel.e2;
import jel.w2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class x {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigDecimal f286069a;

    static {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(1L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        f286069a = e1.Z(bigDecimalValueOf);
    }

    public static InputChecklistDelegate.Model a(String str, Clause clause, CompositeClause compositeClause, boolean z, cb cbVar, k kVar) {
        return new InputChecklistDelegate.Model(str, clause, z, false, new InputChecklistDelegate.a.b(compositeClause), iq.CHECK_BUTTON, null, new ResourceImage(R$drawable.uikit_icn_24_line_indicator, (Integer) null, (Integer) null, Integer.valueOf(cbVar.f10269a), (List) null, (ImageTransformations) null, (Clause) null, 246), kVar, null, 0, 0, 0, 523848);
    }

    public static BigDecimal b(w2 w2Var, List list, e2 e2Var) {
        BigDecimal bigDecimalJ;
        List<r> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (r rVar : list2) {
            InstrumentTicker instrumentTicker = rVar.e;
            ej0.b bVar = rVar.f286063c;
            ej0.b bVar2 = instrumentTicker.f;
            if (bVar2 == null || (bigDecimalJ = bVar2.f126703a) == null) {
                bigDecimalJ = pyd.c.j(instrumentTicker.e);
            }
            arrayList.add(jb3.l.t(bigDecimalJ, bVar.f126703a));
        }
        int i = w.f286066a[e2Var.ordinal()];
        if (i == 1) {
            ArrayList arrayList2 = (arrayList.isEmpty() || arrayList.size() != w2Var.k.size()) ? null : arrayList;
            if (arrayList2 != null) {
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                Iterator it8 = arrayList2.iterator();
                while (it8.hasNext()) {
                    bigDecimalValueOf = bigDecimalValueOf.add((BigDecimal) it8.next());
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
                }
                if (bigDecimalValueOf != null) {
                    BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(arrayList.size());
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                    return bigDecimalValueOf.divide(bigDecimalValueOf2, RoundingMode.HALF_UP);
                }
            }
        } else {
            if (i != 2) {
                if (i == 3) {
                    return (BigDecimal) zhm.d0.d0(arrayList);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (arrayList.isEmpty() || arrayList.size() != w2Var.k.size()) {
                arrayList = null;
            }
            if (arrayList != null) {
                return (BigDecimal) zhm.d0.u0(arrayList);
            }
        }
        return null;
    }
}
