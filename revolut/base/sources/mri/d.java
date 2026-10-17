package mri;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class d implements s {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f208134a;

    public /* synthetic */ d(int i, String str) {
        if (1 == (i & 1)) {
            this.f208134a = str;
        } else {
            j1.f(b.f208133a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f208134a, ((d) obj2).f208134a);
    }

    public final int hashCode() {
        return this.f208134a.hashCode();
    }

    public d(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f208134a = facilityId;
    }
}
