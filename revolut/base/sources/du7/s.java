package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f117832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f117833c;

    public /* synthetic */ s(int i, String str, i iVar, i iVar2) {
        if (7 != (i & 7)) {
            qlm.j1.f(q.f117814a.getDescriptor(), i, 7);
            throw null;
        }
        this.f117831a = str;
        this.f117832b = iVar;
        this.f117833c = iVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f117831a, sVar.f117831a) && Intrinsics.f(this.f117832b, sVar.f117832b) && Intrinsics.f(this.f117833c, sVar.f117833c);
    }

    public final int hashCode() {
        String str = this.f117831a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        i iVar = this.f117832b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        i iVar2 = this.f117833c;
        return iHashCode2 + (iVar2 != null ? iVar2.hashCode() : 0);
    }
}
