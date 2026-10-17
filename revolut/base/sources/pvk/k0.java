package pvk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f240289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ytk.c f240290b;

    public k0(l0 segmentedHeaderImageBuilder, j0 descriptionBuilder, ytk.c percentageClauseMapper, rvk.e topNoteWidgetMapper) {
        Intrinsics.checkNotNullParameter(segmentedHeaderImageBuilder, "segmentedHeaderImageBuilder");
        Intrinsics.checkNotNullParameter(descriptionBuilder, "descriptionBuilder");
        Intrinsics.checkNotNullParameter(percentageClauseMapper, "percentageClauseMapper");
        Intrinsics.checkNotNullParameter(topNoteWidgetMapper, "topNoteWidgetMapper");
        this.f240289a = descriptionBuilder;
        this.f240290b = percentageClauseMapper;
    }
}
