package ny3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f220630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f220631c;
    public final e d;
    public final a e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f220632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f220633h;

    public f(String documentId, String title, String description, e eVar, a addDocumentItem, String str, String buttonTitle, boolean z) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(addDocumentItem, "addDocumentItem");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f220629a = documentId;
        this.f220630b = title;
        this.f220631c = description;
        this.d = eVar;
        this.e = addDocumentItem;
        this.f = str;
        this.f220632g = buttonTitle;
        this.f220633h = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f220629a, fVar.f220629a) && Intrinsics.f(this.f220630b, fVar.f220630b) && Intrinsics.f(this.f220631c, fVar.f220631c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f220632g, fVar.f220632g) && this.f220633h == fVar.f220633h;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f220629a.hashCode() * 31, 31, this.f220630b), 31, this.f220631c);
        e eVar = this.d;
        int iHashCode = (this.e.hashCode() + ((iC + (eVar == null ? 0 : eVar.hashCode())) * 31)) * 31;
        String str = this.f;
        return Boolean.hashCode(this.f220633h) + p.a.c((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f220632g);
    }
}
