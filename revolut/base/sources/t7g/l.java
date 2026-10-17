package t7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f268681c;
    public final String d;

    public /* synthetic */ l(int i, Integer num, String str, String str2, String str3) {
        if (1 != (i & 1)) {
            j1.f(j.f268678a.getDescriptor(), i, 1);
            throw null;
        }
        this.f268679a = str;
        if ((i & 2) == 0) {
            this.f268680b = null;
        } else {
            this.f268680b = str2;
        }
        if ((i & 4) == 0) {
            this.f268681c = null;
        } else {
            this.f268681c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f268679a, lVar.f268679a) && Intrinsics.f(this.f268680b, lVar.f268680b) && Intrinsics.f(this.f268681c, lVar.f268681c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f268679a.hashCode() * 31;
        String str = this.f268680b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f268681c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
