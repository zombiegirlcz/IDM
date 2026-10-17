package ur3;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import nx4.k0;
import nx4.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u0005\u0010\u001aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004¨\u0006$"}, d2 = {"Lur3/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "j", "title", "b", "c", "description", "h", "productType", "d", "g", "productSubtype", "e", "f", "productMetadataType", "Lnx4/k0;", "Lnx4/k0;", "()Lnx4/k0;", "image", "Lnx4/l0;", "Lnx4/l0;", "()Lnx4/l0;", "badge", "button", "", "Lur3/a$a;", "i", "Ljava/util/List;", "()Ljava/util/List;", "tags", "facilityId", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("productType")
    @NotNull
    private final String productType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("productSubtype")
    private final String productSubtype;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("productMetadataType")
    private final String productMetadataType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("image")
    @NotNull
    private final k0 image;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @b("badge")
    private final l0 badge;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @b("button")
    private final String button;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @b("tags")
    private final List<C1560a> tags;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @b("facilityId")
    private final String facilityId;

    /* JADX INFO: renamed from: ur3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\f"}, d2 = {"Lur3/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "text", "b", "icon", "color", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1560a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @b("text")
        @NotNull
        private final String text;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @b("icon")
        private final String icon;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @b("color")
        private final String color;

        public C1560a(String text, String str, String str2) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.icon = str;
            this.color = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1560a)) {
                return false;
            }
            C1560a c1560a = (C1560a) obj2;
            return Intrinsics.f(this.text, c1560a.text) && Intrinsics.f(this.icon, c1560a.icon) && Intrinsics.f(this.color, c1560a.color);
        }

        public final int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            String str = this.icon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.color;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }
    }

    public a(String title, String description, String productType, String str, String str2, k0 image, l0 l0Var, String str3, ArrayList arrayList, String str4) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(image, "image");
        this.title = title;
        this.description = description;
        this.productType = productType;
        this.productSubtype = str;
        this.productMetadataType = str2;
        this.image = image;
        this.badge = l0Var;
        this.button = str3;
        this.tags = arrayList;
        this.facilityId = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final l0 getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFacilityId() {
        return this.facilityId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final k0 getImage() {
        return this.image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.description, aVar.description) && Intrinsics.f(this.productType, aVar.productType) && Intrinsics.f(this.productSubtype, aVar.productSubtype) && Intrinsics.f(this.productMetadataType, aVar.productMetadataType) && Intrinsics.f(this.image, aVar.image) && Intrinsics.f(this.badge, aVar.badge) && Intrinsics.f(this.button, aVar.button) && Intrinsics.f(this.tags, aVar.tags) && Intrinsics.f(this.facilityId, aVar.facilityId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getProductMetadataType() {
        return this.productMetadataType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getProductSubtype() {
        return this.productSubtype;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.description), 31, this.productType);
        String str = this.productSubtype;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productMetadataType;
        int iHashCode2 = (this.image.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        l0 l0Var = this.badge;
        int iHashCode3 = (iHashCode2 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        String str3 = this.button;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<C1560a> list = this.tags;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.facilityId;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getTags() {
        return this.tags;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
