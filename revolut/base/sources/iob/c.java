package iob;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ncd.j;
import njb.h;
import njb.i;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f163211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f163212b;

    public c(dcd.b savingsInterestRateFormatter, g savingsTermDurationClauseMapper) {
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        Intrinsics.checkNotNullParameter(savingsTermDurationClauseMapper, "savingsTermDurationClauseMapper");
        this.f163211a = savingsInterestRateFormatter;
        this.f163212b = savingsTermDurationClauseMapper;
    }

    public static ImageClause a(ImageClauseTint imageClauseTint) {
        int i = R$drawable.uikit_icn_24_lightning;
        Float fValueOf = Float.valueOf(12.0f);
        return new ImageClause(i, imageClauseTint, fValueOf, fValueOf, 16);
    }

    public final Clause b(j displayRate, i style) {
        List listK;
        Intrinsics.checkNotNullParameter(displayRate, "displayRate");
        Intrinsics.checkNotNullParameter(style, "style");
        Clause clauseD = pbd.a.d(this.f163211a, displayRate, style.b(), 2);
        if (style instanceof h) {
            return clauseD;
        }
        if (!(style instanceof njb.f)) {
            if (!(style instanceof njb.g)) {
                throw new NoWhenBranchMatchedException();
            }
            njb.g gVar = (njb.g) style;
            ImageClauseTint imageClauseTint = gVar.f216439a;
            List listK2 = gVar.f216440b ? v.k(a(imageClauseTint), clauseD, new ImageClause(R$drawable.uikit_icn_16_info_outline, imageClauseTint, (Float) null, (Float) null, 28)) : v.k(clauseD, new ImageClause(R$drawable.uikit_icn_16_info_outline, imageClauseTint, (Float) null, (Float) null, 28));
            m70.a.t(t0.f186434a);
            return new CompositeClause(listK2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        njb.f fVar = (njb.f) style;
        ImageClause imageClauseA = a(fVar.f216437a);
        int i = b.f163210a[fVar.f216438b.ordinal()];
        if (i == 1) {
            listK = v.k(imageClauseA, clauseD);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listK = v.k(clauseD, imageClauseA);
        }
        List list = listK;
        m70.a.t(t0.f186434a);
        return new CompositeClause(list, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.CompositeClause c(lcd.i r20, com.revolut.feature.shared.savings.models.product.SavingsProduct r21, njb.i r22) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "savingsAccount"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "style"
            r3 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            ncd.j r2 = r0.f193856n
            com.revolut.core.ui_kit.models.Style r4 = r3.b()
            r5 = r19
            dcd.b r6 = r5.f163211a
            r7 = 2
            com.revolut.core.ui_kit.models.Clause r2 = pbd.a.d(r6, r2, r4, r7)
            r4 = 0
            if (r1 == 0) goto L25
            com.revolut.feature.shared.savings.models.product.SavingsProduct$Term r6 = r1.v
            goto L26
        L25:
            r6 = r4
        L26:
            if (r6 == 0) goto L41
            lcd.h r0 = r0.f193860s
            if (r0 == 0) goto L41
            com.revolut.core.ui_kit.models.ImageClauseTint r10 = r3.a()
            com.revolut.core.ui_kit.models.ImageClause r8 = new com.revolut.core.ui_kit.models.ImageClause
            int r9 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_lock
            r0 = 1094713344(0x41400000, float:12.0)
            java.lang.Float r11 = java.lang.Float.valueOf(r0)
            r13 = 16
            r12 = r11
            r8.<init>(r9, r10, r11, r12, r13)
            goto L56
        L41:
            if (r1 == 0) goto L55
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            com.revolut.feature.shared.savings.models.product.SavingsProduct$Campaign r0 = r1.o
            if (r0 == 0) goto L55
            com.revolut.core.ui_kit.models.ImageClauseTint r0 = r3.a()
            com.revolut.core.ui_kit.models.ImageClause r8 = a(r0)
            goto L56
        L55:
            r8 = r4
        L56:
            r0 = 1
            if (r1 == 0) goto L79
            com.revolut.feature.shared.savings.models.product.SavingsProduct$InterestRate r1 = r1.f86621h
            if (r1 == 0) goto L79
            java.util.ArrayList r1 = r1.f86644a
            int r6 = r1.size()
            if (r6 <= r0) goto L66
            goto L67
        L66:
            r1 = r4
        L67:
            if (r1 == 0) goto L79
            com.revolut.core.ui_kit.models.ImageClauseTint r11 = r3.a()
            com.revolut.core.ui_kit.models.ImageClause r9 = new com.revolut.core.ui_kit.models.ImageClause
            int r10 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_16_info_outline
            r13 = 0
            r14 = 28
            r12 = 0
            r9.<init>(r10, r11, r12, r13, r14)
            r4 = r9
        L79:
            com.revolut.core.ui_kit.models.CompositeClause r9 = new com.revolut.core.ui_kit.models.CompositeClause
            r1 = 3
            com.revolut.core.ui_kit.models.Clause[] r1 = new com.revolut.core.ui_kit.models.Clause[r1]
            r3 = 0
            r1[r3] = r8
            r1[r0] = r2
            r1[r7] = r4
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.List r10 = kotlin.collections.d.L(r1)
            com.revolut.core.ui_kit.models.TextClause r11 = new com.revolut.core.ui_kit.models.TextClause
            kotlin.jvm.internal.t0 r0 = kotlin.jvm.internal.t0.f186434a
            m70.a.t(r0)
            r17 = 0
            r18 = 126(0x7e, float:1.77E-43)
            java.lang.String r12 = " "
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r14 = 12
            r12 = 0
            r9.<init>(r10, r11, r12, r13, r14)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: iob.c.c(lcd.i, com.revolut.feature.shared.savings.models.product.SavingsProduct, njb.i):com.revolut.core.ui_kit.models.CompositeClause");
    }
}
