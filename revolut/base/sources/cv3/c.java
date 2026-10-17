package cv3;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f109243c;
    public final i d;
    public final h e;

    public c(String articleName, String str, Map substitutionData, i nextButtonAction, h offerType) {
        Intrinsics.checkNotNullParameter(articleName, "articleName");
        Intrinsics.checkNotNullParameter(substitutionData, "substitutionData");
        Intrinsics.checkNotNullParameter(nextButtonAction, "nextButtonAction");
        Intrinsics.checkNotNullParameter(offerType, "offerType");
        this.f109241a = articleName;
        this.f109242b = str;
        this.f109243c = substitutionData;
        this.d = nextButtonAction;
        this.e = offerType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f109241a, cVar.f109241a) && Intrinsics.f(this.f109242b, cVar.f109242b) && Intrinsics.f(this.f109243c, cVar.f109243c) && this.d == cVar.d && this.e == cVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f109241a.hashCode() * 31;
        String str = this.f109242b;
        return this.e.hashCode() + ((this.d.hashCode() + p.a.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f109243c)) * 31);
    }
}
