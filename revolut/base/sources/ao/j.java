package ao;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f7850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7851c;
    public final String d;

    public j(String id10, byte[] raw, long j2, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(raw, "raw");
        this.f7849a = id10;
        this.f7850b = raw;
        this.f7851c = j2;
        this.d = str;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f7849a;
    }

    public final byte[] c() {
        return this.f7850b;
    }

    public final long d() {
        return this.f7851c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!j.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.analytics.db.EventEntity");
        return Intrinsics.f(this.f7849a, ((j) obj2).f7849a);
    }

    public final int hashCode() {
        return this.f7849a.hashCode();
    }
}
