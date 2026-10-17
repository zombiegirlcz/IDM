package xt5;

import it5.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f308756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308757b;

    public a(e type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f308756a = type;
        this.f308757b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f308756a == aVar.f308756a && Intrinsics.f(this.f308757b, aVar.f308757b);
    }

    public final int hashCode() {
        int iHashCode = this.f308756a.hashCode() * 31;
        String str = this.f308757b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
