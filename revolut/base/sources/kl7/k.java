package kl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f185345c;
    public final String d;

    public /* synthetic */ k(int i, String str, String str2, String str3, String str4) {
        if (1 != (i & 1)) {
            qlm.j1.f(i.f185336a.getDescriptor(), i, 1);
            throw null;
        }
        this.f185343a = str;
        if ((i & 2) == 0) {
            this.f185344b = null;
        } else {
            this.f185344b = str2;
        }
        if ((i & 4) == 0) {
            this.f185345c = null;
        } else {
            this.f185345c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f185343a, kVar.f185343a) && Intrinsics.f(this.f185344b, kVar.f185344b) && Intrinsics.f(this.f185345c, kVar.f185345c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f185343a.hashCode() * 31;
        String str = this.f185344b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f185345c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public k(String id10, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f185343a = id10;
        this.f185344b = str;
        this.f185345c = str2;
        this.d = str3;
    }
}
