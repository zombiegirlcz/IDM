package okf;

import klf.h0;
import klf.m1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f226002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klf.i f226003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1 f226004c;
    public final vlf.b d;

    public b(h0 commonDataSource, klf.i cardDataSource, m1 juniorDataSource, vlf.b commonUiMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(cardDataSource, "cardDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        this.f226002a = commonDataSource;
        this.f226003b = cardDataSource;
        this.f226004c = juniorDataSource;
        this.d = commonUiMapper;
    }
}
