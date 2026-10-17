package qd0;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f244818a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Locale f244819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Locale f244820c;

    static {
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        f244819b = ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        f244820c = ENGLISH;
    }

    private a() {
    }

    public static Locale a() {
        return f244819b;
    }
}
