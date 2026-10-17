package otk;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f229734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f229735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f229736c;
    public final x2h.b d;

    public k(j header, ArrayList tabs, String str, x2h.b panelState) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(panelState, "panelState");
        this.f229734a = header;
        this.f229735b = tabs;
        this.f229736c = str;
        this.d = panelState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f229734a, kVar.f229734a) && this.f229735b.equals(kVar.f229735b) && Intrinsics.f(this.f229736c, kVar.f229736c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f229735b, this.f229734a.hashCode() * 31, 31);
        String str = this.f229736c;
        return this.d.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }
}
