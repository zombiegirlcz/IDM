package yj6;

import grl.w3;
import grl.y3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w3 f314423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y3 f314424b;

    public a(w3 errorType, y3 limitName) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(limitName, "limitName");
        this.f314423a = errorType;
        this.f314424b = limitName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f314423a == aVar.f314423a && this.f314424b == aVar.f314424b;
    }

    public final int hashCode() {
        return this.f314424b.hashCode() + (this.f314423a.hashCode() * 31);
    }
}
