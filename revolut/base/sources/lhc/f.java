package lhc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f195242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f195243c;
    public final String d;

    public /* synthetic */ f(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(d.f195240a.getDescriptor(), i, 15);
            throw null;
        }
        this.f195241a = str;
        this.f195242b = str2;
        this.f195243c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f195241a, fVar.f195241a) && Intrinsics.f(this.f195242b, fVar.f195242b) && Intrinsics.f(this.f195243c, fVar.f195243c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        String str = this.f195241a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f195242b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f195243c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public f(String str, String str2, String str3, String str4) {
        this.f195241a = str;
        this.f195242b = str2;
        this.f195243c = str3;
        this.d = str4;
    }
}
