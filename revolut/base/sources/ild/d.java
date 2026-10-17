package ild;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hld.g f162224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hld.e f162225b;

    public d(hld.g slotIconAssetImageMapper, hld.e slotBadgeAssetImageMapper) {
        Intrinsics.checkNotNullParameter(slotIconAssetImageMapper, "slotIconAssetImageMapper");
        Intrinsics.checkNotNullParameter(slotBadgeAssetImageMapper, "slotBadgeAssetImageMapper");
        this.f162224a = slotIconAssetImageMapper;
        this.f162225b = slotBadgeAssetImageMapper;
    }
}
