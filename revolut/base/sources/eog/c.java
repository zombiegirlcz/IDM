package eog;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gog.b f127908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127909b;

    public c(gog.b relationship, String displayText) {
        Intrinsics.checkNotNullParameter(relationship, "relationship");
        Intrinsics.checkNotNullParameter(displayText, "displayText");
        this.f127908a = relationship;
        this.f127909b = displayText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f127908a == cVar.f127908a && Intrinsics.f(this.f127909b, cVar.f127909b);
    }

    public final int hashCode() {
        return this.f127909b.hashCode() + (this.f127908a.hashCode() * 31);
    }
}
