package plg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class i {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f237386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f237387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f237388c;

    public /* synthetic */ i(int i, Integer num, String str, h hVar) {
        if (3 != (i & 3)) {
            j1.f(a.f237373a.getDescriptor(), i, 3);
            throw null;
        }
        this.f237386a = num;
        this.f237387b = str;
        if ((i & 4) == 0) {
            this.f237388c = null;
        } else {
            this.f237388c = hVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f237386a, iVar.f237386a) && Intrinsics.f(this.f237387b, iVar.f237387b) && Intrinsics.f(this.f237388c, iVar.f237388c);
    }

    public final int hashCode() {
        Integer num = this.f237386a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f237387b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        h hVar = this.f237388c;
        return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }
}
