package du3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f117561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117563c;
    public final c d;
    public final String e;
    public final String f;

    public d(ArrayList documents, String str, String title, c cVar, String description, String button) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f117561a = documents;
        this.f117562b = str;
        this.f117563c = title;
        this.d = cVar;
        this.e = description;
        this.f = button;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f117561a.equals(dVar.f117561a) && Intrinsics.f(this.f117562b, dVar.f117562b) && Intrinsics.f(this.f117563c, dVar.f117563c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f117561a.hashCode() * 31;
        String str = this.f117562b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f117563c);
        c cVar = this.d;
        return this.f.hashCode() + p.a.c((iC + (cVar != null ? cVar.hashCode() : 0)) * 31, 31, this.e);
    }
}
