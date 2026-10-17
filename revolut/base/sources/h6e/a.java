package h6e;

import kotlin.jvm.internal.Intrinsics;
import zm3.l;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f149620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f149621b;

    public a(l contact, boolean z) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f149620a = contact;
        this.f149621b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f149620a, aVar.f149620a) && this.f149621b == aVar.f149621b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149621b) + (this.f149620a.hashCode() * 31);
    }
}
