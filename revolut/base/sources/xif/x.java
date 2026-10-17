package xif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f306389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f306390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f306391c;

    public x(String transactionId, String warrantId, String subjectId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(warrantId, "warrantId");
        Intrinsics.checkNotNullParameter(subjectId, "subjectId");
        this.f306389a = transactionId;
        this.f306390b = warrantId;
        this.f306391c = subjectId;
    }

    @Override // xif.y
    public final String a() {
        return com.google.android.gms.internal.mlkit_vision_face.a.o(super.a(), "_subjectId_", this.f306391c);
    }

    @Override // xif.y
    public final String b() {
        return this.f306389a;
    }

    @Override // xif.y
    public final String c() {
        return this.f306390b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f306389a, xVar.f306389a) && Intrinsics.f(this.f306390b, xVar.f306390b) && Intrinsics.f(this.f306391c, xVar.f306391c);
    }

    public final int hashCode() {
        return this.f306391c.hashCode() + p.a.c(this.f306389a.hashCode() * 31, 31, this.f306390b);
    }
}
