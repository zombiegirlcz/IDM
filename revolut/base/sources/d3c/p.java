package d3c;

import com.revolut.feature.revolut_shop.api.domain.model.IppProductType;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IppProductType f111052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111054c;
    public final String d;
    public final q e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f111055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f111056h;

    public p(IppProductType productType, String termsAndConditionsUri, String name, String str, q category, ArrayList variations, ArrayList recommendations, w wVar) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(termsAndConditionsUri, "termsAndConditionsUri");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(variations, "variations");
        Intrinsics.checkNotNullParameter(recommendations, "recommendations");
        this.f111052a = productType;
        this.f111053b = termsAndConditionsUri;
        this.f111054c = name;
        this.d = str;
        this.e = category;
        this.f = variations;
        this.f111055g = recommendations;
        this.f111056h = wVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f111052a.equals(pVar.f111052a) && Intrinsics.f(this.f111053b, pVar.f111053b) && Intrinsics.f(this.f111054c, pVar.f111054c) && Intrinsics.f(this.d, pVar.d) && this.e == pVar.e && this.f.equals(pVar.f) && this.f111055g.equals(pVar.f111055g) && Intrinsics.f(this.f111056h, pVar.f111056h);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f111052a.hashCode() * 31, 31, this.f111053b), 31, this.f111054c);
        String str = this.d;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f111055g, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, (this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31);
        w wVar = this.f111056h;
        return iB + (wVar != null ? wVar.hashCode() : 0);
    }
}
