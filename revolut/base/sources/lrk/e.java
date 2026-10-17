package lrk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f199526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final grk.b f199527b;

    public e(mk0.a personalisationStorage, grk.b assetStatsKeyMapper, d storageKeyMapper) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(assetStatsKeyMapper, "assetStatsKeyMapper");
        Intrinsics.checkNotNullParameter(storageKeyMapper, "storageKeyMapper");
        this.f199526a = personalisationStorage;
        this.f199527b = assetStatsKeyMapper;
    }
}
