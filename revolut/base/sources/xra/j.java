package xra;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class j {

    @NotNull
    public static final i Companion = new i(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qra.f f308317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ura.a f308318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f308319c;

    public j(qra.f pushToCardStatsDao, ura.a mapper, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(pushToCardStatsDao, "pushToCardStatsDao");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f308317a = pushToCardStatsDao;
        this.f308318b = mapper;
        this.f308319c = memoryCache;
    }
}
