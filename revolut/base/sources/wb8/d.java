package wb8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296048a;

    public /* synthetic */ d(int i, String str) {
        if (1 == (i & 1)) {
            this.f296048a = str;
        } else {
            j1.f(b.f296047a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f296048a, ((d) obj2).f296048a);
    }

    public final int hashCode() {
        return this.f296048a.hashCode();
    }

    public d(String registeredIdentityId) {
        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
        this.f296048a = registeredIdentityId;
    }
}
