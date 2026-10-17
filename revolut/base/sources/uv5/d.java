package uv5;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f283309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f283310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f283311c;
    public final c d;
    public final ArrayList e;

    public d(int i, int i2, int i3, c sentiment, ArrayList signals) {
        Intrinsics.checkNotNullParameter(sentiment, "sentiment");
        Intrinsics.checkNotNullParameter(signals, "signals");
        this.f283309a = i;
        this.f283310b = i2;
        this.f283311c = i3;
        this.d = sentiment;
        this.e = signals;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f283309a == dVar.f283309a && this.f283310b == dVar.f283310b && this.f283311c == dVar.f283311c && this.d == dVar.d && this.e.equals(dVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + j6.a.b(this.f283311c, j6.a.b(this.f283310b, Integer.hashCode(this.f283309a) * 31, 31), 31)) * 31);
    }
}
