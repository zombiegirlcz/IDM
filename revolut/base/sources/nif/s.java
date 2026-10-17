package nif;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216029a;

    public /* synthetic */ s(int i, String str) {
        if (1 == (i & 1)) {
            this.f216029a = str;
        } else {
            qlm.j1.f(q.f216010a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final String a() {
        return this.f216029a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f216029a, ((s) obj2).f216029a);
    }

    public final int hashCode() {
        return this.f216029a.hashCode();
    }

    public s(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f216029a = planId;
    }
}
