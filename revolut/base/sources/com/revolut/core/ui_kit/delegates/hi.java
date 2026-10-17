package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import ip0.jm0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class hi extends TrendViewDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jm0 f54261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f54263c;
    public final int d;
    public final float e;

    public hi(jm0 data, int i, float f, int i2, float f4) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f54261a = data;
        this.f54262b = i;
        this.f54263c = f;
        this.d = i2;
        this.e = f4;
    }

    @Override // com.revolut.core.ui_kit.delegates.TrendViewDelegate.a
    public final jm0 a() {
        return this.f54261a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof hi)) {
            return false;
        }
        hi hiVar = (hi) obj2;
        return Intrinsics.f(this.f54261a, hiVar.f54261a) && this.f54262b == hiVar.f54262b && Float.compare(this.f54263c, hiVar.f54263c) == 0 && this.d == hiVar.d && Float.compare(this.e, hiVar.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + j6.a.b(this.d, m72.b.b(this.f54263c, j6.a.b(this.f54262b, this.f54261a.hashCode() * 31, 31), 31), 31);
    }
}
