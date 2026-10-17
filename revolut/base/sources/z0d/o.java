package z0d;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f318229c;

    public /* synthetic */ o(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(m.f318226a.getDescriptor(), i, 7);
            throw null;
        }
        this.f318227a = str;
        this.f318228b = str2;
        this.f318229c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f318227a, oVar.f318227a) && Intrinsics.f(this.f318228b, oVar.f318228b) && Intrinsics.f(this.f318229c, oVar.f318229c);
    }

    public final int hashCode() {
        int iHashCode = this.f318227a.hashCode() * 31;
        String str = this.f318228b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f318229c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
