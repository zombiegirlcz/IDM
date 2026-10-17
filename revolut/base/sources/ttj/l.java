package ttj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274365b;

    public /* synthetic */ l(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(j.f274354a.getDescriptor(), i, 3);
            throw null;
        }
        this.f274364a = str;
        this.f274365b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f274364a, lVar.f274364a) && Intrinsics.f(this.f274365b, lVar.f274365b);
    }

    public final int hashCode() {
        int iHashCode = this.f274364a.hashCode() * 31;
        String str = this.f274365b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
