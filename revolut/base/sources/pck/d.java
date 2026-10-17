package pck;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f234924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f234925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f234926c;

    public d(b campaign, int i, Instant instant) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        this.f234924a = campaign;
        this.f234925b = i;
        this.f234926c = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f234924a, dVar.f234924a) && this.f234925b == dVar.f234925b && Intrinsics.f(this.f234926c, dVar.f234926c);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f234925b, this.f234924a.hashCode() * 31, 31);
        Instant instant = this.f234926c;
        return iB + (instant == null ? 0 : instant.hashCode());
    }
}
