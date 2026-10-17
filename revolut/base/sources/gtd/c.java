package gtd;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f146580c;
    public final List d;
    public final List e;
    public final a f;

    public c(String countryName, String imageUrl, ArrayList lifestyleProducts, List infoItems, List toolsItems, a aVar) {
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(lifestyleProducts, "lifestyleProducts");
        Intrinsics.checkNotNullParameter(infoItems, "infoItems");
        Intrinsics.checkNotNullParameter(toolsItems, "toolsItems");
        this.f146578a = countryName;
        this.f146579b = imageUrl;
        this.f146580c = lifestyleProducts;
        this.d = infoItems;
        this.e = toolsItems;
        this.f = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f146578a, cVar.f146578a) && Intrinsics.f(this.f146579b, cVar.f146579b) && this.f146580c.equals(cVar.f146580c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f146580c, p.a.c(this.f146578a.hashCode() * 31, 31, this.f146579b), 31), 31, this.d), 31, this.e);
        a aVar = this.f;
        return iD + (aVar == null ? 0 : aVar.hashCode());
    }
}
