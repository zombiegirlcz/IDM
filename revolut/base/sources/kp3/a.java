package kp3;

import iel.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iel.a f188164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188165b;

    public a(iel.a event, String assetName) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        this.f188164a = event;
        this.f188165b = assetName;
    }

    @Override // kp3.b
    public final i a() {
        return this.f188164a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f188164a, aVar.f188164a) && Intrinsics.f(this.f188165b, aVar.f188165b);
    }

    public final int hashCode() {
        return this.f188165b.hashCode() + (this.f188164a.hashCode() * 31);
    }
}
