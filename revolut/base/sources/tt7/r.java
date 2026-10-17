package tt7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt7.b f274259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt7.d f274260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt7.c f274261c;
    public final vt7.a d;
    public final yik.b e;

    public r(vt7.b conditionsSectionMapper, vt7.d policyInfoSectionMapper, vt7.c coveragesSectionMapper, vt7.a actionsMapper, yik.b planAnimatedBackgroundTypeMapper) {
        Intrinsics.checkNotNullParameter(conditionsSectionMapper, "conditionsSectionMapper");
        Intrinsics.checkNotNullParameter(policyInfoSectionMapper, "policyInfoSectionMapper");
        Intrinsics.checkNotNullParameter(coveragesSectionMapper, "coveragesSectionMapper");
        Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
        Intrinsics.checkNotNullParameter(planAnimatedBackgroundTypeMapper, "planAnimatedBackgroundTypeMapper");
        this.f274259a = conditionsSectionMapper;
        this.f274260b = policyInfoSectionMapper;
        this.f274261c = coveragesSectionMapper;
        this.d = actionsMapper;
        this.e = planAnimatedBackgroundTypeMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (o) iii.c.f(domainState.f274243a, new tkm.d(this, domainState, 21), new qce.b(this, domainState, 27), new si5.c(this, domainState, 25));
    }
}
