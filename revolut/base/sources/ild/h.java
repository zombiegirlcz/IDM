package ild;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hld.g f162227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hld.e f162228b;

    public h(hld.g slotIconAssetImageMapper, hld.e slotBadgeAssetImageMapper) {
        Intrinsics.checkNotNullParameter(slotIconAssetImageMapper, "slotIconAssetImageMapper");
        Intrinsics.checkNotNullParameter(slotBadgeAssetImageMapper, "slotBadgeAssetImageMapper");
        this.f162227a = slotIconAssetImageMapper;
        this.f162228b = slotBadgeAssetImageMapper;
    }
}
