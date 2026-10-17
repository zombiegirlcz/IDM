package xj5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f306502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f306503b;

    public a(List revolutContacts, List frequents) {
        Intrinsics.checkNotNullParameter(revolutContacts, "revolutContacts");
        Intrinsics.checkNotNullParameter(frequents, "frequents");
        this.f306502a = revolutContacts;
        this.f306503b = frequents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f306502a, aVar.f306502a) && Intrinsics.f(this.f306503b, aVar.f306503b);
    }

    public final int hashCode() {
        return this.f306503b.hashCode() + (this.f306502a.hashCode() * 31);
    }
}
