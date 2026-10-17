package vr9;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f291524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f291525b;

    public g(ArrayList members, boolean z) {
        Intrinsics.checkNotNullParameter(members, "members");
        this.f291524a = members;
        this.f291525b = z;
    }

    @Override // vr9.j
    public final List a() {
        return this.f291524a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f291524a.equals(gVar.f291524a) && this.f291525b == gVar.f291525b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f291525b) + (this.f291524a.hashCode() * 31);
    }
}
