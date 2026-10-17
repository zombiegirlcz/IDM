package yt8;

import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import my8.r;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final my8.l f316657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f316658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f316659c;
    public final Set d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f316660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f316661h;

    public a(my8.l doc2, r kycScope, wi0.b nationality, Set consents, String applicationId, String str, String documentReference, ArrayList documentSequence) {
        Intrinsics.checkNotNullParameter(doc2, "doc");
        Intrinsics.checkNotNullParameter(kycScope, "kycScope");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(consents, "consents");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(documentReference, "documentReference");
        Intrinsics.checkNotNullParameter(documentSequence, "documentSequence");
        this.f316657a = doc2;
        this.f316658b = kycScope;
        this.f316659c = nationality;
        this.d = consents;
        this.e = applicationId;
        this.f = str;
        this.f316660g = documentReference;
        this.f316661h = documentSequence;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f316657a, aVar.f316657a) && this.f316658b == aVar.f316658b && Intrinsics.f(this.f316659c, aVar.f316659c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f316660g, aVar.f316660g) && this.f316661h.equals(aVar.f316661h);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.f(p.a.c((this.f316658b.hashCode() + (this.f316657a.hashCode() * 31)) * 31, 31, this.f316659c.f297794a), 31, this.d), 31, this.e);
        String str = this.f;
        return this.f316661h.hashCode() + p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f316660g);
    }
}
