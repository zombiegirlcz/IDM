package zg0;

import a0.d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();
    public static final zg0.a i = zg0.a.PRIORITY_HIGH_ACCURACY;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final LinkedHashMap f322043j = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zg0.a f322044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f322045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f322046c;
    public final long d;
    public final int e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f322047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f322048h;

    public static final class a {
        private a() {
        }
    }

    public b() {
        this(0L, 4095, 0L, BitmapDescriptorFactory.HUE_RED);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f322044a == bVar.f322044a && this.f322045b == bVar.f322045b && this.f322046c == bVar.f322046c && this.d == bVar.d && this.e == bVar.e && Float.compare(this.f, bVar.f) == 0 && this.f322047g == bVar.f322047g && Intrinsics.f(this.f322048h, bVar.f322048h);
    }

    public final int hashCode() {
        return this.f322048h.hashCode() + j6.a.c(d.c(m72.b.b(this.f, j6.a.b(this.e, d.c(d.c(d.c(d.c(this.f322044a.hashCode() * 31, 31, this.f322045b), 31, this.f322046c), 31, this.d), 31, 0L), 31), 31), 31, this.f322047g), 29791, false);
    }

    public b(long j2, int i2, long j3, float f) {
        j2 = (i2 & 2) != 0 ? 5000L : j2;
        long j5 = j2 / 6;
        int i3 = (i2 & 32) != 0 ? Integer.MAX_VALUE : 1;
        f = (i2 & 64) != 0 ? BitmapDescriptorFactory.HUE_RED : f;
        j3 = (i2 & 128) != 0 ? 1000L : j3;
        zg0.a priority = i;
        Intrinsics.checkNotNullParameter(priority, "priority");
        LinkedHashMap extras = f322043j;
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f322044a = priority;
        this.f322045b = j2;
        this.f322046c = j5;
        this.d = Long.MAX_VALUE;
        this.e = i3;
        this.f = f;
        this.f322047g = j3;
        this.f322048h = extras;
    }
}
