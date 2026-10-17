package zw7;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f325824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f325825c;
    public final h d;
    public final String e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f325826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f325827h;

    public p(String name, c0 petType, z gender, h breedType, String breed, LocalDate dateOfBirth, boolean z, dj0.d purchasePrice) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(petType, "petType");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(breedType, "breedType");
        Intrinsics.checkNotNullParameter(breed, "breed");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(purchasePrice, "purchasePrice");
        this.f325823a = name;
        this.f325824b = petType;
        this.f325825c = gender;
        this.d = breedType;
        this.e = breed;
        this.f = dateOfBirth;
        this.f325826g = z;
        this.f325827h = purchasePrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f325823a, pVar.f325823a) && this.f325824b == pVar.f325824b && this.f325825c == pVar.f325825c && this.d == pVar.d && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f) && this.f325826g == pVar.f325826g && Intrinsics.f(this.f325827h, pVar.f325827h);
    }

    public final int hashCode() {
        return this.f325827h.hashCode() + j6.a.c(com.revolut.data.database.models.openbanking.d.g(this.f, p.a.c((this.d.hashCode() + ((this.f325825c.hashCode() + ((this.f325824b.hashCode() + (this.f325823a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31), 31, this.f325826g);
    }
}
