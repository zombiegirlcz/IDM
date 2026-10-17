package rhg;

import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f254468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f254469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phg.h f254470c;

    public u(ArrayList available, Set selected, phg.h type) {
        Intrinsics.checkNotNullParameter(available, "available");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f254468a = available;
        this.f254469b = selected;
        this.f254470c = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f254468a.equals(uVar.f254468a) && Intrinsics.f(this.f254469b, uVar.f254469b) && this.f254470c == uVar.f254470c;
    }

    public final int hashCode() {
        return this.f254470c.hashCode() + p.a.f(this.f254468a.hashCode() * 31, 31, this.f254469b);
    }
}
