package igh;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jgh.p f161207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jgh.j f161208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jgh.i f161209c;

    public f(jgh.e assetsSectionMapper, jgh.p strategySectionMapper, jgh.j sectorSectionMapper, jgh.i regionSectionMapper) {
        Intrinsics.checkNotNullParameter(assetsSectionMapper, "assetsSectionMapper");
        Intrinsics.checkNotNullParameter(strategySectionMapper, "strategySectionMapper");
        Intrinsics.checkNotNullParameter(sectorSectionMapper, "sectorSectionMapper");
        Intrinsics.checkNotNullParameter(regionSectionMapper, "regionSectionMapper");
        this.f161207a = strategySectionMapper;
        this.f161208b = sectorSectionMapper;
        this.f161209c = regionSectionMapper;
    }
}
