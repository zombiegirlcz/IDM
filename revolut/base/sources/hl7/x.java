package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153359a;

    public /* synthetic */ x(int i, String str) {
        if (1 == (i & 1)) {
            this.f153359a = str;
        } else {
            qlm.j1.f(v.f153334a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f153359a, ((x) obj2).f153359a);
    }

    public final int hashCode() {
        return this.f153359a.hashCode();
    }

    public x(String cancellingMtaId) {
        Intrinsics.checkNotNullParameter(cancellingMtaId, "cancellingMtaId");
        this.f153359a = cancellingMtaId;
    }
}
