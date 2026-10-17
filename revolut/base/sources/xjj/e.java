package xjj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f306535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f306536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yjj.f f306537c;
    public final o d;
    public final k e;

    public e(ynj.m installationStateResolver, d actionItemsMapper, q phoneNumberItemMapper, yjj.f navBarDescriptionMapper, o localAllowanceSectionMapper, k internationalAllowanceSectionMapper, s exclusiveBenefitsItemMapper) {
        Intrinsics.checkNotNullParameter(installationStateResolver, "installationStateResolver");
        Intrinsics.checkNotNullParameter(actionItemsMapper, "actionItemsMapper");
        Intrinsics.checkNotNullParameter(phoneNumberItemMapper, "phoneNumberItemMapper");
        Intrinsics.checkNotNullParameter(navBarDescriptionMapper, "navBarDescriptionMapper");
        Intrinsics.checkNotNullParameter(localAllowanceSectionMapper, "localAllowanceSectionMapper");
        Intrinsics.checkNotNullParameter(internationalAllowanceSectionMapper, "internationalAllowanceSectionMapper");
        Intrinsics.checkNotNullParameter(exclusiveBenefitsItemMapper, "exclusiveBenefitsItemMapper");
        this.f306535a = actionItemsMapper;
        this.f306536b = phoneNumberItemMapper;
        this.f306537c = navBarDescriptionMapper;
        this.d = localAllowanceSectionMapper;
        this.e = internationalAllowanceSectionMapper;
    }
}
