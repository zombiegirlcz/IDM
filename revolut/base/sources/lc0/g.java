package lc0;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f193751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f193752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f193753c;
    public final l d;

    public g(Bitmap bitmap, boolean z, boolean z3, l numberCoverMode) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(numberCoverMode, "numberCoverMode");
        this.f193751a = bitmap;
        this.f193752b = z;
        this.f193753c = z3;
        this.d = numberCoverMode;
    }

    @Override // lc0.h
    public final boolean a() {
        return this.f193753c;
    }

    @Override // lc0.h
    public final boolean b() {
        return this.f193752b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f193751a, gVar.f193751a) && this.f193752b == gVar.f193752b && this.f193753c == gVar.f193753c && this.d == gVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(j6.a.c(this.f193751a.hashCode() * 31, 31, this.f193752b), 31, this.f193753c);
    }
}
