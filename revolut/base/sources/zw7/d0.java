package zw7;

import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f325765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f325766c;
    public final String d;
    public final z e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f325767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f325768h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dj0.d f325769j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i1 f325770l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f325771m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a0 f325772n;
    public final s0 o;

    public d0(String id10, c0 type, String str, String name, z gender, e breedModel, LocalDate dateOfBirth, boolean z, String purchasePrice, dj0.d purchasePriceMoney, boolean z3, i1 quoteRequest, List issues, a0 policyStatus, s0 policy) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(breedModel, "breedModel");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(purchasePrice, "purchasePrice");
        Intrinsics.checkNotNullParameter(purchasePriceMoney, "purchasePriceMoney");
        Intrinsics.checkNotNullParameter(quoteRequest, "quoteRequest");
        Intrinsics.checkNotNullParameter(issues, "issues");
        Intrinsics.checkNotNullParameter(policyStatus, "policyStatus");
        Intrinsics.checkNotNullParameter(policy, "policy");
        this.f325764a = id10;
        this.f325765b = type;
        this.f325766c = str;
        this.d = name;
        this.e = gender;
        this.f = breedModel;
        this.f325767g = dateOfBirth;
        this.f325768h = z;
        this.i = purchasePrice;
        this.f325769j = purchasePriceMoney;
        this.k = z3;
        this.f325770l = quoteRequest;
        this.f325771m = issues;
        this.f325772n = policyStatus;
        this.o = policy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f325764a, d0Var.f325764a) && this.f325765b == d0Var.f325765b && Intrinsics.f(this.f325766c, d0Var.f325766c) && Intrinsics.f(this.d, d0Var.d) && this.e == d0Var.e && Intrinsics.f(this.f, d0Var.f) && Intrinsics.f(this.f325767g, d0Var.f325767g) && this.f325768h == d0Var.f325768h && Intrinsics.f(this.i, d0Var.i) && Intrinsics.f(this.f325769j, d0Var.f325769j) && this.k == d0Var.k && Intrinsics.f(this.f325770l, d0Var.f325770l) && Intrinsics.f(this.f325771m, d0Var.f325771m) && this.f325772n == d0Var.f325772n && Intrinsics.f(this.o, d0Var.o);
    }

    public final int hashCode() {
        int iHashCode = (this.f325765b.hashCode() + (this.f325764a.hashCode() * 31)) * 31;
        String str = this.f325766c;
        return this.o.hashCode() + ((this.f325772n.hashCode() + p.a.d((this.f325770l.hashCode() + j6.a.c(v7.c(p.a.c(j6.a.c(com.revolut.data.database.models.openbanking.d.g(this.f325767g, (this.f.hashCode() + ((this.e.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31)) * 31, 31), 31, this.f325768h), 31, this.i), 31, this.f325769j), 31, this.k)) * 31, 31, this.f325771m)) * 31);
    }
}
