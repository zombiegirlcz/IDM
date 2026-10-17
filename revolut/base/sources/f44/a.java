package f44;

import ft3.h1;
import kotlin.jvm.internal.Intrinsics;
import mv3.i;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f132002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f132003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f132004c;

    public a(i iVar, boolean z, h1 payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f132002a = iVar;
        this.f132003b = z;
        this.f132004c = payload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f132002a, aVar.f132002a) && this.f132003b == aVar.f132003b && this.f132004c.equals(aVar.f132004c);
    }

    public final int hashCode() {
        i iVar = this.f132002a;
        return this.f132004c.hashCode() + j6.a.c((iVar == null ? 0 : iVar.hashCode()) * 31, 31, this.f132003b);
    }
}
