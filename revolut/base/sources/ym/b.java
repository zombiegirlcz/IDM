package ym;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mm.a f314823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f314824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f314825c;
    public final AtomicLong d;
    public final AtomicBoolean e;

    public b(mm.a action, boolean z, String id10) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f314823a = action;
        this.f314824b = z;
        this.f314825c = id10;
        this.d = new AtomicLong(Long.MIN_VALUE);
        this.e = new AtomicBoolean(false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f314823a, bVar.f314823a) && this.f314824b == bVar.f314824b && Intrinsics.f(this.f314825c, bVar.f314825c);
    }

    public final int hashCode() {
        return this.f314825c.hashCode() + j6.a.c(this.f314823a.hashCode() * 31, 31, this.f314824b);
    }

    public /* synthetic */ b(mm.a aVar, boolean z) {
        this(aVar, z, "");
    }
}
