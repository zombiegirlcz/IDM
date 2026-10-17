package hcl;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class y0 {

    @NotNull
    public static final x0 Companion = new x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f151226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151228c;

    public /* synthetic */ y0(int i, String str, String str2, Instant instant) {
        if (7 != (i & 7)) {
            qlm.j1.f(w0.f151200a.getDescriptor(), i, 7);
            throw null;
        }
        this.f151226a = instant;
        this.f151227b = str;
        this.f151228c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f151226a, y0Var.f151226a) && Intrinsics.f(this.f151227b, y0Var.f151227b) && Intrinsics.f(this.f151228c, y0Var.f151228c);
    }

    public final int hashCode() {
        return this.f151228c.hashCode() + p.a.c(this.f151226a.hashCode() * 31, 31, this.f151227b);
    }

    public y0(String title, String description, Instant date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f151226a = date;
        this.f151227b = title;
        this.f151228c = description;
    }
}
