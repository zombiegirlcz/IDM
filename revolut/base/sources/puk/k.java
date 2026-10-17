package puk;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f239939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f239940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f239941c;
    public final x2h.b d;

    public k(j header, ArrayList tabs, String str, x2h.b footerState) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        this.f239939a = header;
        this.f239940b = tabs;
        this.f239941c = str;
        this.d = footerState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f239939a, kVar.f239939a) && this.f239940b.equals(kVar.f239940b) && Intrinsics.f(this.f239941c, kVar.f239941c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f239940b, this.f239939a.hashCode() * 31, 31);
        String str = this.f239941c;
        return this.d.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }
}
