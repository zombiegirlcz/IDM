package yna;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class h1 implements jki.p {

    @NotNull
    public static final f1 Companion = new f1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qoa.b f315343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yik.g f315344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zjh.j f315345c;
    public final gte.a d;
    public final Lazy e;

    public h1(qoa.b settingsItemsMapper, yik.g pricingPlanAvatarMapper, xjl.u ssoUserActivityInteractor, zjh.j legalEntityDisclaimerMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(settingsItemsMapper, "settingsItemsMapper");
        Intrinsics.checkNotNullParameter(pricingPlanAvatarMapper, "pricingPlanAvatarMapper");
        Intrinsics.checkNotNullParameter(ssoUserActivityInteractor, "ssoUserActivityInteractor");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f315343a = settingsItemsMapper;
        this.f315344b = pricingPlanAvatarMapper;
        this.f315345c = legalEntityDisclaimerMapper;
        this.d = featureToggleInteractor;
        this.e = yhm.j.b(new y99.c(this, 25));
    }

    public static CompositeClause b(TextClause textClause, int i) {
        TextClause textClause2 = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i2 = R$drawable.uikit_icn_24_scan_qr;
        Integer numValueOf = Integer.valueOf(i);
        Float fValueOf = Float.valueOf(16.0f);
        return new CompositeClause(zhm.v.k(textClause, textClause2, new ImageClause(i2, numValueOf, fValueOf, fValueOf, 16)), null, null, null, 14);
    }

    public static boolean c(qla.a aVar) {
        int i = aVar == null ? -1 : g1.f315341a[aVar.ordinal()];
        if (i == -1) {
            return false;
        }
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Type inference failed for: r14v3, types: [com.revolut.core.ui_kit.models.Style] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.lang.Object[], koi.j[]] */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // jki.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jki.m a(jki.i r45) {
        /*
            Method dump skipped, instruction units count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yna.h1.a(jki.i):jki.m");
    }
}
