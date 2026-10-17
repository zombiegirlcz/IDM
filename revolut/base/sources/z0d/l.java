package z0d;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318225a;

    public /* synthetic */ l(int i, String str) {
        if (1 == (i & 1)) {
            this.f318225a = str;
        } else {
            j1.f(j.f318224a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f318225a, ((l) obj2).f318225a);
    }

    public final int hashCode() {
        return this.f318225a.hashCode();
    }

    public l(String guardianPhoneNumber) {
        Intrinsics.checkNotNullParameter(guardianPhoneNumber, "guardianPhoneNumber");
        this.f318225a = guardianPhoneNumber;
    }
}
