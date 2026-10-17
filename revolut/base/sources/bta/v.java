package bta;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f18504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18505c;
    public final String d;

    public /* synthetic */ v(int i, Boolean bool, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            j1.f(t.f18502a.getDescriptor(), i, 15);
            throw null;
        }
        this.f18503a = str;
        this.f18504b = bool;
        this.f18505c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f18503a, vVar.f18503a) && Intrinsics.f(this.f18504b, vVar.f18504b) && Intrinsics.f(this.f18505c, vVar.f18505c) && Intrinsics.f(this.d, vVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f18503a.hashCode() * 31;
        Boolean bool = this.f18504b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f18505c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
