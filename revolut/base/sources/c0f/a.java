package c0f;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f20250c;

    public a(int i, int i2, Intent intent) {
        this.f20248a = i;
        this.f20249b = i2;
        this.f20250c = intent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f20248a == aVar.f20248a && this.f20249b == aVar.f20249b && Intrinsics.f(this.f20250c, aVar.f20250c);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f20249b, Integer.hashCode(this.f20248a) * 31, 31);
        Intent intent = this.f20250c;
        return iB + (intent == null ? 0 : intent.hashCode());
    }
}
