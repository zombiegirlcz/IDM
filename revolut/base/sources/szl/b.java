package szl;

import e8.r;
import java.time.Clock;
import java.time.Instant;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.z;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f266829a = new r((Function0) new szl.a(0));

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ KProperty[] f266830a = {o0.f186429a.f(new z(a.class, "clock", "getClock()Ljava/time/Clock;", 0))};

        private a() {
        }

        public static void a() {
            RuntimeException runtimeException = new RuntimeException("Server error message is used. Please use the code instead.");
            boolean z = ((Clock) b.f266829a.b(f266830a[0])).millis() > Instant.parse("2023-08-13T00:00:00.000Z").toEpochMilli();
            od0.a aVar = od0.a.f224253a;
            if (od0.a.e() && !od0.a.i() && z) {
                throw runtimeException;
            }
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, runtimeException, h0Var);
        }
    }
}
