package v4j;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f286113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s4j.b f286114b;

    public h(List updatedNameFields, s4j.b newAccountType) {
        Intrinsics.checkNotNullParameter(updatedNameFields, "updatedNameFields");
        Intrinsics.checkNotNullParameter(newAccountType, "newAccountType");
        this.f286113a = updatedNameFields;
        this.f286114b = newAccountType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f286113a, hVar.f286113a) && this.f286114b == hVar.f286114b;
    }

    public final int hashCode() {
        return this.f286114b.hashCode() + (this.f286113a.hashCode() * 31);
    }
}
