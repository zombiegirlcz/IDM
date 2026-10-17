package s6l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\b\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Ls6l/b;", "", "", "toString", "()Ljava/lang/String;", "Ls6l/b$b;", "a", "Ls6l/b$b;", "b", "()Ls6l/b$b;", "assets3d", "Ls6l/b$a;", "Ls6l/b$a;", "()Ls6l/b$a;", "assets2d", "Ls6l/k;", "c", "Ls6l/k;", "()Ls6l/k;", "colorPicker", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("assets3d")
    private final C1443b assets3d;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("assets2d")
    private final a assets2d;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("colorPicker")
    private final k colorPicker;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\f"}, d2 = {"Ls6l/b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "frontUrl", "b", "backUrl", "backSideOverlayUrl", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("frontUrl")
        private final String frontUrl;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("backUrl")
        private final String backUrl;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("backSideOverlayUrl")
        private final String backSideOverlayUrl;

        public a(String str, String str2, String str3) {
            this.frontUrl = str;
            this.backUrl = str2;
            this.backSideOverlayUrl = str3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBackSideOverlayUrl() {
            return this.backSideOverlayUrl;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBackUrl() {
            return this.backUrl;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFrontUrl() {
            return this.frontUrl;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.frontUrl, aVar.frontUrl) && Intrinsics.f(this.backUrl, aVar.backUrl) && Intrinsics.f(this.backSideOverlayUrl, aVar.backSideOverlayUrl);
        }

        public final int hashCode() {
            String str = this.frontUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.backUrl;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.backSideOverlayUrl;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: s6l.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0016"}, d2 = {"Ls6l/b$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "normalLightUrl", "b", "colorLightUrl", "c", "h", "roughnessLightUrl", "d", "metallicLightUrl", "e", "normalDarkUrl", "colorDarkUrl", "g", "roughnessDarkUrl", "metallicDarkUrl", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1443b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("normalLightUrl")
        private final String normalLightUrl;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("colorLightUrl")
        private final String colorLightUrl;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("roughnessLightUrl")
        private final String roughnessLightUrl;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("metallicLightUrl")
        private final String metallicLightUrl;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("normalDarkUrl")
        private final String normalDarkUrl;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("colorDarkUrl")
        private final String colorDarkUrl;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("roughnessDarkUrl")
        private final String roughnessDarkUrl;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("metallicDarkUrl")
        private final String metallicDarkUrl;

        public C1443b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.normalLightUrl = str;
            this.colorLightUrl = str2;
            this.roughnessLightUrl = str3;
            this.metallicLightUrl = str4;
            this.normalDarkUrl = str5;
            this.colorDarkUrl = str6;
            this.roughnessDarkUrl = str7;
            this.metallicDarkUrl = str8;
        }

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
            if (!(obj2 instanceof C1443b)) {
                return false;
            }
            C1443b c1443b = (C1443b) obj2;
            return Intrinsics.f(this.normalLightUrl, c1443b.normalLightUrl) && Intrinsics.f(this.colorLightUrl, c1443b.colorLightUrl) && Intrinsics.f(this.roughnessLightUrl, c1443b.roughnessLightUrl) && Intrinsics.f(this.metallicLightUrl, c1443b.metallicLightUrl) && Intrinsics.f(this.normalDarkUrl, c1443b.normalDarkUrl) && Intrinsics.f(this.colorDarkUrl, c1443b.colorDarkUrl) && Intrinsics.f(this.roughnessDarkUrl, c1443b.roughnessDarkUrl) && Intrinsics.f(this.metallicDarkUrl, c1443b.metallicDarkUrl);
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

    public b(C1443b c1443b, a aVar, k kVar) {
        this.assets3d = c1443b;
        this.assets2d = aVar;
        this.colorPicker = kVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAssets2d() {
        return this.assets2d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C1443b getAssets3d() {
        return this.assets3d;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k getColorPicker() {
        return this.colorPicker;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.assets3d, bVar.assets3d) && Intrinsics.f(this.assets2d, bVar.assets2d) && Intrinsics.f(this.colorPicker, bVar.colorPicker);
    }

    public final int hashCode() {
        C1443b c1443b = this.assets3d;
        int iHashCode = (c1443b == null ? 0 : c1443b.hashCode()) * 31;
        a aVar = this.assets2d;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        k kVar = this.colorPicker;
        return iHashCode2 + (kVar != null ? kVar.hashCode() : 0);
    }
}
