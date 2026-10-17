package vb6;

import aw0.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f287427c = new d0(167, 180);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f287428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wb6.a f287429b;

    public c(e regularTransfersItemMapper, wb6.a charityCampaignItemMapper) {
        Intrinsics.checkNotNullParameter(regularTransfersItemMapper, "regularTransfersItemMapper");
        Intrinsics.checkNotNullParameter(charityCampaignItemMapper, "charityCampaignItemMapper");
        this.f287428a = regularTransfersItemMapper;
        this.f287429b = charityCampaignItemMapper;
    }
}
