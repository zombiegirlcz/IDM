package my8;

import com.revolut.feature.kyc_documents_scan.api.models.DocType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DocType f210384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f210385c;
    public final ArrayList d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f210386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f210387h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f210388j;
    public final List k;

    public l(String docRef, DocType docType, wi0.b issuingCountry, ArrayList pages, String name, String subType, String str, List supportedFormats, ArrayList arrayList, List fields, List hints) {
        Intrinsics.checkNotNullParameter(docRef, "docRef");
        Intrinsics.checkNotNullParameter(docType, "docType");
        Intrinsics.checkNotNullParameter(issuingCountry, "issuingCountry");
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(supportedFormats, "supportedFormats");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(hints, "hints");
        this.f210383a = docRef;
        this.f210384b = docType;
        this.f210385c = issuingCountry;
        this.d = pages;
        this.e = name;
        this.f = subType;
        this.f210386g = str;
        this.f210387h = supportedFormats;
        this.i = arrayList;
        this.f210388j = fields;
        this.k = hints;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f210383a, lVar.f210383a) && this.f210384b.equals(lVar.f210384b) && this.f210385c.equals(lVar.f210385c) && this.d.equals(lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f210386g, lVar.f210386g) && Intrinsics.f(this.f210387h, lVar.f210387h) && Intrinsics.f(this.i, lVar.i) && Intrinsics.f(this.f210388j, lVar.f210388j) && Intrinsics.f(this.k, lVar.k);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, p.a.c(p.a.c(this.f210383a.hashCode() * 31, 31, this.f210384b.f77926a), 31, this.f210385c.f297794a), 31), 31, this.e), 31, this.f);
        String str = this.f210386g;
        int iD = p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f210387h);
        List list = this.i;
        return this.k.hashCode() + p.a.d((iD + (list != null ? list.hashCode() : 0)) * 31, 31, this.f210388j);
    }
}
