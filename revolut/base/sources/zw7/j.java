package zw7;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f325796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f325797c;
    public final h d;
    public final String e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f325798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f325799h;

    public j(String name, c0 petType, z gender, h breedType, String breed, LocalDate dateOfBirth, boolean z, dj0.d purchasePrice) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(petType, "petType");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(breedType, "breedType");
        Intrinsics.checkNotNullParameter(breed, "breed");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(purchasePrice, "purchasePrice");
        this.f325795a = name;
        this.f325796b = petType;
        this.f325797c = gender;
        this.d = breedType;
        this.e = breed;
        this.f = dateOfBirth;
        this.f325798g = z;
        this.f325799h = purchasePrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f325795a, jVar.f325795a) && this.f325796b == jVar.f325796b && this.f325797c == jVar.f325797c && this.d == jVar.d && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && this.f325798g == jVar.f325798g && Intrinsics.f(this.f325799h, jVar.f325799h);
    }

    public final int hashCode() {
        return this.f325799h.hashCode() + j6.a.c(com.revolut.data.database.models.openbanking.d.g(this.f, p.a.c((this.d.hashCode() + ((this.f325797c.hashCode() + ((this.f325796b.hashCode() + (this.f325795a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31), 31, this.f325798g);
    }
}
