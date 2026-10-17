package e93;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f123887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f123888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f123889c;
    public final List d;

    public q(p group, f selectedDesign) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(selectedDesign, "selectedDesign");
        this.f123887a = group;
        this.f123888b = selectedDesign;
        this.f123889c = group.f123885a;
        this.d = group.f123886b;
    }

    public static q a(q qVar, p group, f selectedDesign, int i) {
        if ((i & 1) != 0) {
            group = qVar.f123887a;
        }
        if ((i & 2) != 0) {
            selectedDesign = qVar.f123888b;
        }
        qVar.getClass();
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(selectedDesign, "selectedDesign");
        return new q(group, selectedDesign);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f123887a, qVar.f123887a) && Intrinsics.f(this.f123888b, qVar.f123888b);
    }

    public final int hashCode() {
        return this.f123888b.hashCode() + (this.f123887a.hashCode() * 31);
    }
}
