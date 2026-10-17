package k19;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180161b;

    public /* synthetic */ m(int i, String str, String str2) {
        if (1 != (i & 1)) {
            j1.f(k.f180159a.getDescriptor(), i, 1);
            throw null;
        }
        this.f180160a = str;
        if ((i & 2) == 0) {
            this.f180161b = null;
        } else {
            this.f180161b = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f180160a, mVar.f180160a) && Intrinsics.f(this.f180161b, mVar.f180161b);
    }

    public final int hashCode() {
        int iHashCode = this.f180160a.hashCode() * 31;
        String str = this.f180161b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
