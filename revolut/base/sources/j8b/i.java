package j8b;

import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.corporate_events.common.R$string;
import iel.a0;
import iel.m;
import iel.o;
import iel.p;
import iel.q;
import iel.r;
import iel.v;
import iel.w;
import iel.x;
import iel.y;
import java.math.BigDecimal;
import java.math.MathContext;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i {
    public static final TextLocalisedClause a(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        w wVar = yVar.f160829g;
        int i = wVar.f160821a;
        int i2 = wVar.f160822b;
        if (i <= 0) {
            return null;
        }
        int i3 = R$string.feature_corporate_events_bubble_amount_value;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(i);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(bigDecimalValueOf2, MathContext.DECIMAL128);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return new TextLocalisedClause(i3, u.c(new AssetClause(bigDecimalDivide, new AssetClauseType.Stock(0), yVar.f160828c, null, null, 24)), null, 12);
    }

    public static final int b(iel.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        if (iVar instanceof iel.d) {
            return R$attr.uikit_colorGreen;
        }
        if (iVar instanceof iel.k) {
            return R$attr.uikit_colorYellow;
        }
        if (iVar instanceof o) {
            return R$attr.uikit_colorOrange;
        }
        if (iVar instanceof x) {
            return R$attr.uikit_colorGreen;
        }
        if (iVar instanceof y) {
            return R$attr.uikit_colorDeepPurple;
        }
        if (iVar instanceof a0) {
            return R$attr.uikit_colorOrange;
        }
        if (iVar instanceof p) {
            return R$attr.uikit_colorRed;
        }
        if (iVar instanceof iel.h) {
            return R$attr.uikit_colorPink;
        }
        if (iVar instanceof r) {
            return R$attr.uikit_colorCyan;
        }
        if (iVar instanceof v) {
            return R$attr.uikit_colorOrange;
        }
        if (iVar instanceof iel.b) {
            return R$attr.uikit_colorRed;
        }
        if (!(iVar instanceof iel.c) && !(iVar instanceof m)) {
            if (iVar instanceof iel.g) {
                return R$attr.uikit_colorGreen;
            }
            if (iVar instanceof q) {
                return R$attr.uikit_colorCyan;
            }
            throw new NoWhenBranchMatchedException();
        }
        return R$attr.uikit_colorYellow;
    }

    public static final CompositeClause c(int i, ej0.b bVar) {
        Clause[] elements = {new TextLocalisedClause(i, null, null, 14), bVar != null ? h8b.e.a(bVar) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return v1.c.f(kotlin.collections.d.L(elements), null);
    }
}
