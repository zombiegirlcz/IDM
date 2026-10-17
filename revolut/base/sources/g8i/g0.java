package g8i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m8i.b f141377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k8i.b f141378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vrf.h f141379c;
    public final d0i.m d;
    public final g e;
    public final d0i.b f;

    public g0(m8i.b buttonTextMapper, k8i.b exchangeSummaryMapper, d moveMoneyReviewDescriptionProvider, vrf.h sectionFactory, d0i.m volatilityBannerMapper, r39.a moveMoneyExplainerMapper, f navBarMapper, g orderModeItemsMapper, m8i.d reviewNoteMapper, d0i.b accountBalanceLimitWarningMapper) {
        Intrinsics.checkNotNullParameter(buttonTextMapper, "buttonTextMapper");
        Intrinsics.checkNotNullParameter(exchangeSummaryMapper, "exchangeSummaryMapper");
        Intrinsics.checkNotNullParameter(moveMoneyReviewDescriptionProvider, "moveMoneyReviewDescriptionProvider");
        Intrinsics.checkNotNullParameter(sectionFactory, "sectionFactory");
        Intrinsics.checkNotNullParameter(volatilityBannerMapper, "volatilityBannerMapper");
        Intrinsics.checkNotNullParameter(moveMoneyExplainerMapper, "moveMoneyExplainerMapper");
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(orderModeItemsMapper, "orderModeItemsMapper");
        Intrinsics.checkNotNullParameter(reviewNoteMapper, "reviewNoteMapper");
        Intrinsics.checkNotNullParameter(accountBalanceLimitWarningMapper, "accountBalanceLimitWarningMapper");
        this.f141377a = buttonTextMapper;
        this.f141378b = exchangeSummaryMapper;
        this.f141379c = sectionFactory;
        this.d = volatilityBannerMapper;
        this.e = orderModeItemsMapper;
        this.f = accountBalanceLimitWarningMapper;
    }

    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v13 g8i.w, still in use, count: 6, list:
          (r10v13 g8i.w) from 0x074d: MOVE (r30v4 g8i.w) = (r10v13 g8i.w)
          (r10v13 g8i.w) from 0x072b: MOVE (r30v6 g8i.w) = (r10v13 g8i.w)
          (r10v13 g8i.w) from 0x06f4: MOVE (r30v8 g8i.w) = (r10v13 g8i.w)
          (r10v13 g8i.w) from 0x06c6: MOVE (r30v9 g8i.w) = (r10v13 g8i.w)
          (r10v13 g8i.w) from 0x06ad: MOVE (r30v11 g8i.w) = (r10v13 g8i.w)
          (r10v13 g8i.w) from 0x0678: MOVE (r30v13 g8i.w) = (r10v13 g8i.w)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // jki.p
    public final jki.m a(jki.i r73) {
        /*
            Method dump skipped, instruction units count: 2608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g8i.g0.a(jki.i):jki.m");
    }
}
