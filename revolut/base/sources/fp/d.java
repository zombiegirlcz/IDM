package fp;

import java.time.Clock;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f137014b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fp.a f137015a;

    public static final class a {
        private a() {
        }
    }

    public d() {
        this(0);
    }

    public d(int i) {
        Clock clock = Clock.systemUTC();
        Intrinsics.checkNotNullExpressionValue(clock, "systemUTC(...)");
        fp.a featureToggles = new fp.a();
        c logOutputStreamFactory = new c(0);
        b threadProvider = new b();
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(logOutputStreamFactory, "logOutputStreamFactory");
        Intrinsics.checkNotNullParameter(threadProvider, "threadProvider");
        this.f137015a = featureToggles;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(logOutputStreamFactory, "logOutputStreamFactory");
        Intrinsics.checkNotNullParameter(threadProvider, "threadProvider");
    }
}
