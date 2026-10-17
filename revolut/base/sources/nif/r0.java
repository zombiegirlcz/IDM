package nif;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class r0 {

    @NotNull
    public static final q0 Companion = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f216018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f216019c;
    public final String d;
    public final dj0.d e;

    public /* synthetic */ r0(int i, String str, String str2, String str3, String str4, dj0.d dVar) {
        if (31 != (i & 31)) {
            qlm.j1.f(p0.f215997a.getDescriptor(), i, 31);
            throw null;
        }
        this.f216017a = str;
        this.f216018b = str2;
        this.f216019c = str3;
        this.d = str4;
        this.e = dVar;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f216019c;
    }

    public final String c() {
        return this.f216018b;
    }

    public final String d() {
        return this.f216017a;
    }

    public final dj0.d e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f216017a, r0Var.f216017a) && Intrinsics.f(this.f216018b, r0Var.f216018b) && Intrinsics.f(this.f216019c, r0Var.f216019c) && Intrinsics.f(this.d, r0Var.d) && Intrinsics.f(this.e, r0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f216017a.hashCode() * 31;
        String str = this.f216018b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f216019c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public r0(dj0.d value, String type, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f216017a = type;
        this.f216018b = str;
        this.f216019c = str2;
        this.d = str3;
        this.e = value;
    }
}
