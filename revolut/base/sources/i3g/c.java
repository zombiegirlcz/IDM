package i3g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0g.d f158205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.b f158206b;

    public c(yk0.d schedulerProvider, o0g.d experiencesReviewsRepository) {
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(experiencesReviewsRepository, "experiencesReviewsRepository");
        this.f158205a = experiencesReviewsRepository;
        this.f158206b = j6.a.h("create(...)");
    }
}
