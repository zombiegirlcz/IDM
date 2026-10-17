package gdc;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class w {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final IntRange f143146b = new IntRange(5, 45, 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final IntRange f143147c = new IntRange(13, 19, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f143148a;

    public w(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f143148a = dateProvider;
    }

    public static boolean a(String str, boolean z) {
        return str.length() > 0 && !z;
    }
}
