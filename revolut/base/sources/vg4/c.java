package vg4;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f288750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f288751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f288752c;

    public c(int i, int i2, Intent intent) {
        this.f288750a = i;
        this.f288751b = i2;
        this.f288752c = intent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f288750a == cVar.f288750a && this.f288751b == cVar.f288751b && Intrinsics.f(this.f288752c, cVar.f288752c);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f288751b, Integer.hashCode(this.f288750a) * 31, 31);
        Intent intent = this.f288752c;
        return iB + (intent == null ? 0 : intent.hashCode());
    }
}
