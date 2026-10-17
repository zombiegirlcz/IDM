package eo;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f127855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f127856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f127857c;
    public final boolean d;

    public e(d operationName, c certificateType, int i, boolean z) {
        Intrinsics.checkNotNullParameter(operationName, "operationName");
        Intrinsics.checkNotNullParameter(certificateType, "certificateType");
        this.f127855a = operationName;
        this.f127856b = certificateType;
        this.f127857c = i;
        this.d = z;
    }

    public static e a(e eVar, int i, boolean z) {
        d operationName = eVar.f127855a;
        c certificateType = eVar.f127856b;
        Intrinsics.checkNotNullParameter(operationName, "operationName");
        Intrinsics.checkNotNullParameter(certificateType, "certificateType");
        return new e(operationName, certificateType, i, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f127855a == eVar.f127855a && this.f127856b == eVar.f127856b && this.f127857c == eVar.f127857c && this.d == eVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.b(this.f127857c, (this.f127856b.hashCode() + (this.f127855a.hashCode() * 31)) * 31, 31);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(d operationName, c certificateType) {
        this(operationName, certificateType, 1, false);
        Intrinsics.checkNotNullParameter(operationName, "operationName");
        Intrinsics.checkNotNullParameter(certificateType, "certificateType");
    }
}
