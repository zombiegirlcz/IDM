package a2l;

import com.revolut.feature.hyper_text.model.ParameterisedHyperText;
import com.revolut.retail.feature.travel_status.impl.domain.model.TravelStatusLinkAccountInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f937c;
    public final k d;
    public final x e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f939h;
    public final r i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ParameterisedHyperText f940j;
    public final TravelStatusLinkAccountInfo k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f941l;

    public y(b header, u uVar, n nVar, k kVar, x xVar, List list, i iVar, String str, r rVar, ParameterisedHyperText parameterisedHyperText, TravelStatusLinkAccountInfo travelStatusLinkAccountInfo, m mVar) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.f935a = header;
        this.f936b = uVar;
        this.f937c = nVar;
        this.d = kVar;
        this.e = xVar;
        this.f = list;
        this.f938g = iVar;
        this.f939h = str;
        this.i = rVar;
        this.f940j = parameterisedHyperText;
        this.k = travelStatusLinkAccountInfo;
        this.f941l = mVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f935a, yVar.f935a) && Intrinsics.f(this.f936b, yVar.f936b) && Intrinsics.f(this.f937c, yVar.f937c) && Intrinsics.f(this.d, yVar.d) && Intrinsics.f(this.e, yVar.e) && Intrinsics.f(this.f, yVar.f) && Intrinsics.f(this.f938g, yVar.f938g) && Intrinsics.f(this.f939h, yVar.f939h) && Intrinsics.f(this.i, yVar.i) && Intrinsics.f(this.f940j, yVar.f940j) && Intrinsics.f(this.k, yVar.k) && Intrinsics.f(this.f941l, yVar.f941l);
    }

    public final int hashCode() {
        int iHashCode = this.f935a.hashCode() * 31;
        u uVar = this.f936b;
        int iHashCode2 = (iHashCode + (uVar == null ? 0 : uVar.hashCode())) * 31;
        n nVar = this.f937c;
        int iHashCode3 = (iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        k kVar = this.d;
        int iHashCode4 = (iHashCode3 + (kVar == null ? 0 : kVar.f911a.hashCode())) * 31;
        x xVar = this.e;
        int iHashCode5 = (iHashCode4 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        List list = this.f;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        i iVar = this.f938g;
        int iHashCode7 = (iHashCode6 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str = this.f939h;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        r rVar = this.i;
        int iHashCode9 = (iHashCode8 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        ParameterisedHyperText parameterisedHyperText = this.f940j;
        int iHashCode10 = (iHashCode9 + (parameterisedHyperText == null ? 0 : parameterisedHyperText.f74758a.hashCode())) * 31;
        TravelStatusLinkAccountInfo travelStatusLinkAccountInfo = this.k;
        int iHashCode11 = (iHashCode10 + (travelStatusLinkAccountInfo == null ? 0 : travelStatusLinkAccountInfo.hashCode())) * 31;
        m mVar = this.f941l;
        return iHashCode11 + (mVar != null ? mVar.hashCode() : 0);
    }
}
