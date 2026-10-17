package sfe;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f262412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f262413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f262414c;

    public i(int i, int i2, Intent intent) {
        this.f262412a = i;
        this.f262413b = i2;
        this.f262414c = intent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f262412a == iVar.f262412a && this.f262413b == iVar.f262413b && Intrinsics.f(this.f262414c, iVar.f262414c);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f262413b, Integer.hashCode(this.f262412a) * 31, 31);
        Intent intent = this.f262414c;
        return iB + (intent == null ? 0 : intent.hashCode());
    }
}
