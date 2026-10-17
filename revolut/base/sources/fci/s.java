package fci;

import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f133807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f133808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f133809c;
    public final float d;
    public final int e;

    public s(u view, PointF origin, float f, float f4, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f133807a = view;
        this.f133808b = origin;
        this.f133809c = f;
        this.d = f4;
        this.e = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f133807a, sVar.f133807a) && Intrinsics.f(this.f133808b, sVar.f133808b) && Float.compare(this.f133809c, sVar.f133809c) == 0 && Float.compare(this.d, sVar.d) == 0 && this.e == sVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + m72.b.b(this.d, m72.b.b(this.f133809c, (this.f133808b.hashCode() + (this.f133807a.hashCode() * 31)) * 31, 31), 31);
    }
}
