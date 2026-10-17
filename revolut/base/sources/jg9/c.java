package jg9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173939b;

    public c(String fieldId, String value) {
        Intrinsics.checkNotNullParameter(fieldId, "fieldId");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f173938a = fieldId;
        this.f173939b = value;
    }

    @Override // jg9.f
    public final String a() {
        return j6.a.s("DateYear(fieldId=", this.f173938a, ", value=", this.f173939b, ")");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f173938a, cVar.f173938a) && Intrinsics.f(this.f173939b, cVar.f173939b);
    }

    public final int hashCode() {
        return this.f173939b.hashCode() + (this.f173938a.hashCode() * 31);
    }
}
