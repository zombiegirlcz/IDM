package aem;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class b1 {

    @NotNull
    public static final a1 Companion = new a1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f3695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f3696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f3697c;

    static {
        KType kTypeB;
        KClass kClassB = kotlin.jvm.internal.o0.f186429a.b(b1.class);
        try {
            kTypeB = kotlin.jvm.internal.o0.b(b1.class);
        } catch (Throwable unused) {
            kTypeB = null;
        }
        tem.a type = new tem.a(kClassB, kTypeB);
        Intrinsics.checkNotNullParameter("TimeoutConfiguration", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        if (kotlin.text.d0.W("TimeoutConfiguration")) {
            throw new IllegalArgumentException("Name can't be blank");
        }
    }

    public b1() {
        this.f3695a = 0L;
        this.f3696b = 0L;
        this.f3697c = 0L;
        this.f3695a = null;
        this.f3696b = null;
        this.f3697c = null;
    }

    public static void a(Long l2) {
        if (l2 != null && l2.longValue() <= 0) {
            throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeoutConfig.INFINITE_TIMEOUT_MS");
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || b1.class != obj2.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f3695a, b1Var.f3695a) && Intrinsics.f(this.f3696b, b1Var.f3696b) && Intrinsics.f(this.f3697c, b1Var.f3697c);
    }

    public final int hashCode() {
        Long l2 = this.f3695a;
        int iHashCode = (l2 != null ? l2.hashCode() : 0) * 31;
        Long l3 = this.f3696b;
        int iHashCode2 = (iHashCode + (l3 != null ? l3.hashCode() : 0)) * 31;
        Long l4 = this.f3697c;
        return iHashCode2 + (l4 != null ? l4.hashCode() : 0);
    }
}
