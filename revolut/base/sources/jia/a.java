package jia;

import dj0.d;
import ip0.v7;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f174414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f174415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f174416c;
    public final int d;

    public a(c type, ArrayList intervals, d total, int i) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        Intrinsics.checkNotNullParameter(total, "total");
        this.f174414a = type;
        this.f174415b = intervals;
        this.f174416c = total;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f174414a == aVar.f174414a && this.f174415b.equals(aVar.f174415b) && Intrinsics.f(this.f174416c, aVar.f174416c) && this.d == aVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + v7.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f174415b, this.f174414a.hashCode() * 31, 31), 31, this.f174416c);
    }
}
