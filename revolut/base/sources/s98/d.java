package s98;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f261124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f261125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f261126c;

    public /* synthetic */ d(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(b.f261123a.getDescriptor(), i, 7);
            throw null;
        }
        this.f261124a = str;
        this.f261125b = str2;
        this.f261126c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f261124a, dVar.f261124a) && Intrinsics.f(this.f261125b, dVar.f261125b) && Intrinsics.f(this.f261126c, dVar.f261126c);
    }

    public final int hashCode() {
        return this.f261126c.hashCode() + p.a.c(this.f261124a.hashCode() * 31, 31, this.f261125b);
    }

    public d(String documentNumber) {
        Intrinsics.checkNotNullParameter("GB", "countryCode");
        Intrinsics.checkNotNullParameter("genericTin", "documentType");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        this.f261124a = "GB";
        this.f261125b = "genericTin";
        this.f261126c = documentNumber;
    }
}
