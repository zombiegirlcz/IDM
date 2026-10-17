package sre;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265191b;

    public e(String documentId, String str) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        this.f265190a = documentId;
        this.f265191b = str;
    }

    public final String a() {
        String str = this.f265191b;
        return p.a.p("TERMS_BY_ID_KEY_", this.f265190a, (str == null || d0.W(str)) ? "" : j6.a.q("_", str));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f265190a, eVar.f265190a) && Intrinsics.f(this.f265191b, eVar.f265191b);
    }

    public final int hashCode() {
        int iHashCode = this.f265190a.hashCode() * 31;
        String str = this.f265191b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
