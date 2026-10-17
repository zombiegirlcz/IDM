package kpi;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f188248c;

    public a(int i, int i2, Intent intent) {
        this.f188246a = i;
        this.f188247b = i2;
        this.f188248c = intent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f188246a == aVar.f188246a && this.f188247b == aVar.f188247b && Intrinsics.f(this.f188248c, aVar.f188248c);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f188247b, Integer.hashCode(this.f188246a) * 31, 31);
        Intent intent = this.f188248c;
        return iB + (intent == null ? 0 : intent.hashCode());
    }
}
