package ks6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f189156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f189157c;

    public h0(String id10, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f189155a = id10;
        this.f189156b = str;
        this.f189157c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f189155a, h0Var.f189155a) && Intrinsics.f(this.f189156b, h0Var.f189156b) && Intrinsics.f(this.f189157c, h0Var.f189157c);
    }

    public final int hashCode() {
        int iHashCode = this.f189155a.hashCode() * 31;
        String str = this.f189156b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f189157c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
