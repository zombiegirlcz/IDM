package xv;

import android.graphics.Rect;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f309140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f309141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f309142c;
    public final int d;
    public final long e;
    public final ArrayList f;

    public u(int i, int i2, Rect cropRect, int i3, long j2, ArrayList planes) {
        Intrinsics.checkNotNullParameter(cropRect, "cropRect");
        Intrinsics.checkNotNullParameter(planes, "planes");
        this.f309140a = i;
        this.f309141b = i2;
        this.f309142c = cropRect;
        this.d = i3;
        this.e = j2;
        this.f = planes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f309140a == uVar.f309140a && this.f309141b == uVar.f309141b && this.f309142c.equals(uVar.f309142c) && this.d == uVar.d && this.e == uVar.e && this.f.equals(uVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + a0.d.c(j6.a.b(this.d, (this.f309142c.hashCode() + j6.a.b(this.f309141b, Integer.hashCode(this.f309140a) * 31, 31)) * 31, 31), 31, this.e);
    }
}
