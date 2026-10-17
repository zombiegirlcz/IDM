package l4h;

import aw0.o9;
import aw0.p9;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit_resources.R$attr;
import d9.t0;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ej0.b f192135a;

    public static final class a {
        private a() {
        }
    }

    static {
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        xi0.b.Companion.getClass();
        f192135a = new ej0.b(ZERO, xi0.a.a(""));
    }

    public static MoneyClause a(ej0.b bVar, nel.n nVar) {
        dj0.d dVarD = t0.D(bVar, nVar);
        ScaleMode.PrettyFormat prettyFormat = null;
        z zVar = nVar != null ? nVar.f214597c : null;
        int i = zVar == null ? -1 : j.f192138c[zVar.ordinal()];
        if (i != 9 && i != 10) {
            prettyFormat = ScaleMode.PrettyFormat.f51440a;
        }
        return new MoneyClause(dVarD, new MoneyClause.Format.Defaults(null, prettyFormat, true, false, 9), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), o9.NON_SENSITIVE);
    }

    public static PercentageClause b(BigDecimal bigDecimal) {
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(new BigDecimal(100));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return new PercentageClause(bigDecimalMultiply, new PercentageClause.Format.Custom(2, 10, p9.ONLY_NEGATIVE, null, null), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254));
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ip0.jm0 c(eel.k r44, eel.c r45, int r46, boolean r47, boolean r48, nel.n r49) {
        /*
            Method dump skipped, instruction units count: 1460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4h.i.c(eel.k, eel.c, int, boolean, boolean, nel.n):ip0.jm0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x067f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [iw0.a] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static hw0.k d(eel.l r35, eel.c r36, float r37, java.util.List r38, java.util.List r39, nel.z r40) {
        /*
            Method dump skipped, instruction units count: 1764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4h.i.d(eel.l, eel.c, float, java.util.List, java.util.List, nel.z):hw0.k");
    }
}
