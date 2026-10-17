package my8;

import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f210362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f210363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f210364c;
    public final q d;
    public final String e;
    public final wi0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f210365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f210366h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f210367j;
    public final ArrayList k;

    public a0(l doc2, Set consents, r kycScope, q provider, String checkId, wi0.b nationality, String applicationId, boolean z, String str, String documentReference, ArrayList documentSequence) {
        Intrinsics.checkNotNullParameter(doc2, "doc");
        Intrinsics.checkNotNullParameter(consents, "consents");
        Intrinsics.checkNotNullParameter(kycScope, "kycScope");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(checkId, "checkId");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(documentReference, "documentReference");
        Intrinsics.checkNotNullParameter(documentSequence, "documentSequence");
        this.f210362a = doc2;
        this.f210363b = consents;
        this.f210364c = kycScope;
        this.d = provider;
        this.e = checkId;
        this.f = nationality;
        this.f210365g = applicationId;
        this.f210366h = z;
        this.i = str;
        this.f210367j = documentReference;
        this.k = documentSequence;
    }

    public final boolean a() {
        return this.f210366h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f210362a, a0Var.f210362a) && Intrinsics.f(this.f210363b, a0Var.f210363b) && this.f210364c == a0Var.f210364c && this.d == a0Var.d && Intrinsics.f(this.e, a0Var.e) && Intrinsics.f(this.f, a0Var.f) && Intrinsics.f(this.f210365g, a0Var.f210365g) && this.f210366h == a0Var.f210366h && Intrinsics.f(this.i, a0Var.i) && Intrinsics.f(this.f210367j, a0Var.f210367j) && this.k.equals(a0Var.k);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(p.a.c(p.a.c((this.d.hashCode() + ((this.f210364c.hashCode() + p.a.f(this.f210362a.hashCode() * 31, 31, this.f210363b)) * 31)) * 31, 31, this.e), 31, this.f.f297794a), 31, this.f210365g), 31, this.f210366h);
        String str = this.i;
        return this.k.hashCode() + p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f210367j);
    }
}
