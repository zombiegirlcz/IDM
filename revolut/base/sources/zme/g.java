package zme;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f323485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f323486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f323487c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f323488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f323489h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f323490j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f323491l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f323492m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f323493n;

    public g(wi0.b bVar, b requirementForIndividual, String documentName, String str, String documentAcronym, String documentType, String validation, String check, String hint, boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        Intrinsics.checkNotNullParameter(requirementForIndividual, "requirementForIndividual");
        Intrinsics.checkNotNullParameter(documentName, "documentName");
        Intrinsics.checkNotNullParameter(documentAcronym, "documentAcronym");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(validation, "validation");
        Intrinsics.checkNotNullParameter(check, "check");
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f323485a = bVar;
        this.f323486b = requirementForIndividual;
        this.f323487c = documentName;
        this.d = str;
        this.e = documentAcronym;
        this.f = documentType;
        this.f323488g = validation;
        this.f323489h = check;
        this.i = hint;
        this.f323490j = z;
        this.k = z3;
        this.f323491l = z4;
        this.f323492m = z6;
        this.f323493n = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f323485a, gVar.f323485a) && this.f323486b == gVar.f323486b && Intrinsics.f(this.f323487c, gVar.f323487c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f323488g, gVar.f323488g) && Intrinsics.f(this.f323489h, gVar.f323489h) && Intrinsics.f(this.i, gVar.i) && this.f323490j == gVar.f323490j && this.k == gVar.k && this.f323491l == gVar.f323491l && this.f323492m == gVar.f323492m && this.f323493n == gVar.f323493n;
    }

    public final int hashCode() {
        wi0.b bVar = this.f323485a;
        int iC = p.a.c((this.f323486b.hashCode() + ((bVar == null ? 0 : bVar.f297794a.hashCode()) * 31)) * 31, 31, this.f323487c);
        String str = this.d;
        return Boolean.hashCode(this.f323493n) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c((iC + (str != null ? str.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.f323488g), 31, this.f323489h), 31, this.i), 31, this.f323490j), 31, this.k), 31, this.f323491l), 31, this.f323492m);
    }
}
