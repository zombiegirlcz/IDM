package s1l;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f259165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f259166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f259167c;

    public /* synthetic */ d(int i, q qVar, Instant instant, String str) {
        if (1 != (i & 1)) {
            j1.f(b.f259161a.getDescriptor(), i, 1);
            throw null;
        }
        this.f259165a = qVar;
        if ((i & 2) == 0) {
            this.f259166b = null;
        } else {
            this.f259166b = instant;
        }
        if ((i & 4) == 0) {
            this.f259167c = null;
        } else {
            this.f259167c = str;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f259165a, dVar.f259165a) && Intrinsics.f(this.f259166b, dVar.f259166b) && Intrinsics.f(this.f259167c, dVar.f259167c);
    }

    public final int hashCode() {
        int iHashCode = this.f259165a.f259201a.hashCode() * 31;
        Instant instant = this.f259166b;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        String str = this.f259167c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public d(q icon, Instant instant, String str) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f259165a = icon;
        this.f259166b = instant;
        this.f259167c = str;
    }
}
