package npi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f218230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f218231c;

    public e(String dialogId, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        this.f218229a = dialogId;
        this.f218230b = z;
        this.f218231c = obj2;
    }

    public final String a() {
        return this.f218229a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f218229a, eVar.f218229a) && this.f218230b == eVar.f218230b && Intrinsics.f(this.f218231c, eVar.f218231c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f218229a.hashCode() * 31, 31, this.f218230b);
        Object obj2 = this.f218231c;
        return iC + (obj2 == null ? 0 : obj2.hashCode());
    }
}
