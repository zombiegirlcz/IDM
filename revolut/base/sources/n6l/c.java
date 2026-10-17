package n6l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0016"}, d2 = {"Ln6l/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "normalLightUrl", "b", "colorLightUrl", "c", "h", "roughnessLightUrl", "d", "metallicLightUrl", "e", "normalDarkUrl", "colorDarkUrl", "g", "roughnessDarkUrl", "metallicDarkUrl", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("normal-light")
    private final String normalLightUrl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("colour-light")
    private final String colorLightUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("roughness-light")
    private final String roughnessLightUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("metallic-light")
    private final String metallicLightUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("normal-dark")
    private final String normalDarkUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("colour-dark")
    private final String colorDarkUrl;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("roughness-dark")
    private final String roughnessDarkUrl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("metallic-dark")
    private final String metallicDarkUrl;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getColorDarkUrl() {
        return this.colorDarkUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getColorLightUrl() {
        return this.colorLightUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMetallicDarkUrl() {
        return this.metallicDarkUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMetallicLightUrl() {
        return this.metallicLightUrl;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getNormalDarkUrl() {
        return this.normalDarkUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.normalLightUrl, cVar.normalLightUrl) && Intrinsics.f(this.colorLightUrl, cVar.colorLightUrl) && Intrinsics.f(this.roughnessLightUrl, cVar.roughnessLightUrl) && Intrinsics.f(this.metallicLightUrl, cVar.metallicLightUrl) && Intrinsics.f(this.normalDarkUrl, cVar.normalDarkUrl) && Intrinsics.f(this.colorDarkUrl, cVar.colorDarkUrl) && Intrinsics.f(this.roughnessDarkUrl, cVar.roughnessDarkUrl) && Intrinsics.f(this.metallicDarkUrl, cVar.metallicDarkUrl);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getNormalLightUrl() {
        return this.normalLightUrl;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getRoughnessDarkUrl() {
        return this.roughnessDarkUrl;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getRoughnessLightUrl() {
        return this.roughnessLightUrl;
    }

    public final int hashCode() {
        String str = this.normalLightUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.colorLightUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.roughnessLightUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.metallicLightUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.normalDarkUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.colorDarkUrl;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.roughnessDarkUrl;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.metallicDarkUrl;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }
}
