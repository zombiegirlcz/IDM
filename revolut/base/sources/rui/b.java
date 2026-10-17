package rui;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f257555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f257556b;

    public b(k providerLogoMapper, g headerMapper, e contentImageMapper, f detailsMapper, h instructionsMapper) {
        Intrinsics.checkNotNullParameter(providerLogoMapper, "providerLogoMapper");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(contentImageMapper, "contentImageMapper");
        Intrinsics.checkNotNullParameter(detailsMapper, "detailsMapper");
        Intrinsics.checkNotNullParameter(instructionsMapper, "instructionsMapper");
        this.f257555a = providerLogoMapper;
        this.f257556b = contentImageMapper;
    }
}
