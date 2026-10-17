package y00;

import kotlin.jvm.internal.Intrinsics;
import x00.j;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f310097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f310098c;
    public final String d;
    public final String e;
    public final String f;

    public b(String docNumber, String docNumberChecksum, String birthDate, String birthDateChecksum, String expiryDate, String expiryDateChecksum) {
        Intrinsics.checkNotNullParameter(docNumber, "docNumber");
        Intrinsics.checkNotNullParameter(docNumberChecksum, "docNumberChecksum");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        Intrinsics.checkNotNullParameter(birthDateChecksum, "birthDateChecksum");
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        Intrinsics.checkNotNullParameter(expiryDateChecksum, "expiryDateChecksum");
        this.f310096a = docNumber;
        this.f310097b = docNumberChecksum;
        this.f310098c = birthDate;
        this.d = birthDateChecksum;
        this.e = expiryDate;
        this.f = expiryDateChecksum;
    }

    @Override // x00.j
    public final String a() {
        return this.f;
    }

    @Override // x00.j
    public final String b() {
        return this.e;
    }

    @Override // x00.j
    public final String c() {
        return this.f310097b;
    }

    @Override // x00.j
    public final String d() {
        return this.f310098c;
    }

    @Override // x00.j
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f310096a, bVar.f310096a) && Intrinsics.f(this.f310097b, bVar.f310097b) && Intrinsics.f(this.f310098c, bVar.f310098c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    @Override // x00.j
    public final String getDocumentNumber() {
        return this.f310096a;
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f310096a.hashCode() * 31, 31, this.f310097b), 31, this.f310098c), 31, this.d), 31, this.e);
    }
}
