package zbb;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f320870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f320871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f320872c;

    public g(int i, int i2, Intent intent) {
        this.f320870a = i;
        this.f320871b = i2;
        this.f320872c = intent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f320870a == gVar.f320870a && this.f320871b == gVar.f320871b && Intrinsics.f(this.f320872c, gVar.f320872c);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f320871b, Integer.hashCode(this.f320870a) * 31, 31);
        Intent intent = this.f320872c;
        return iB + (intent == null ? 0 : intent.hashCode());
    }
}
