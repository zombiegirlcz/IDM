package q90;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\f\u0010\u0013¨\u0006\u0015"}, d2 = {"Lq90/j;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "isLast", "", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "createdSince", "", "Lq90/j$a;", "Ljava/util/List;", "()Ljava/util/List;", "entities", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("last")
    private final Boolean isLast;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdSince")
    private final Long createdSince;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("entities")
    @NotNull
    private final List<a> entities;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0017"}, d2 = {"Lq90/j$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "g", "title", "c", "description", "f", "secondaryDescription", "Lq90/o;", "e", "Lq90/o;", "()Lq90/o;", "icon", "assetUrl", "moreInfoDeeplink", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        private final String description;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("secondaryDescription")
        private final String secondaryDescription;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("icon")
        private final o icon;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("assetUrl")
        private final String assetUrl;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("moreInfoLink")
        private final String moreInfoDeeplink;

        public a(String id10, String title, String str, String str2, o oVar, String str3, String str4) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = id10;
            this.title = title;
            this.description = str;
            this.secondaryDescription = str2;
            this.icon = oVar;
            this.assetUrl = str3;
            this.moreInfoDeeplink = str4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAssetUrl() {
            return this.assetUrl;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final o getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getMoreInfoDeeplink() {
            return this.moreInfoDeeplink;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.description, aVar.description) && Intrinsics.f(this.secondaryDescription, aVar.secondaryDescription) && Intrinsics.f(this.icon, aVar.icon) && Intrinsics.f(this.assetUrl, aVar.assetUrl) && Intrinsics.f(this.moreInfoDeeplink, aVar.moreInfoDeeplink);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSecondaryDescription() {
            return this.secondaryDescription;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iC = p.a.c(this.id.hashCode() * 31, 31, this.title);
            String str = this.description;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.secondaryDescription;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            o oVar = this.icon;
            int iHashCode3 = (iHashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31;
            String str3 = this.assetUrl;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.moreInfoDeeplink;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    public j(Boolean bool, Long l2, ArrayList entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        this.isLast = bool;
        this.createdSince = l2;
        this.entities = entities;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getCreatedSince() {
        return this.createdSince;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getEntities() {
        return this.entities;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getIsLast() {
        return this.isLast;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.isLast, jVar.isLast) && Intrinsics.f(this.createdSince, jVar.createdSince) && Intrinsics.f(this.entities, jVar.entities);
    }

    public final int hashCode() {
        Boolean bool = this.isLast;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l2 = this.createdSince;
        return this.entities.hashCode() + ((iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31);
    }
}
