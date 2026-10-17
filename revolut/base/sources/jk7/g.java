package jk7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f175113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f175114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f175115c;

    public g(String str, List supportingDocuments, boolean z) {
        Intrinsics.checkNotNullParameter(supportingDocuments, "supportingDocuments");
        this.f175113a = str;
        this.f175114b = supportingDocuments;
        this.f175115c = z;
    }

    public static g a(g gVar, List supportingDocuments) {
        String str = gVar.f175113a;
        boolean z = gVar.f175115c;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(supportingDocuments, "supportingDocuments");
        return new g(str, supportingDocuments, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f175113a, gVar.f175113a) && Intrinsics.f(this.f175114b, gVar.f175114b) && this.f175115c == gVar.f175115c;
    }

    public final int hashCode() {
        String str = this.f175113a;
        return Boolean.hashCode(this.f175115c) + p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f175114b);
    }
}
