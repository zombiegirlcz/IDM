package xif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f306386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f306387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f306388c;

    public w(String transactionId, String warrantId, String confiscationId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(warrantId, "warrantId");
        Intrinsics.checkNotNullParameter(confiscationId, "confiscationId");
        this.f306386a = transactionId;
        this.f306387b = warrantId;
        this.f306388c = confiscationId;
    }

    @Override // xif.y
    public final String a() {
        return com.google.android.gms.internal.mlkit_vision_face.a.o(super.a(), "_confiscationId_", this.f306388c);
    }

    @Override // xif.y
    public final String b() {
        return this.f306386a;
    }

    @Override // xif.y
    public final String c() {
        return this.f306387b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f306386a, wVar.f306386a) && Intrinsics.f(this.f306387b, wVar.f306387b) && Intrinsics.f(this.f306388c, wVar.f306388c);
    }

    public final int hashCode() {
        return this.f306388c.hashCode() + p.a.c(this.f306386a.hashCode() * 31, 31, this.f306387b);
    }
}
