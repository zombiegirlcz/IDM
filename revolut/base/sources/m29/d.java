package m29;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0006\u0010\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0011"}, d2 = {"Lm29/d;", "", "", "toString", "()Ljava/lang/String;", "Lm29/d$a;", "a", "Lm29/d$a;", "b", "()Lm29/d$a;", "savings", "", "Lm29/d$c;", "Ljava/util/List;", "()Ljava/util/List;", "highlights", "c", "feature_lifestyle_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("savings")
    @NotNull
    private final a savings;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("highlights")
    @NotNull
    private final List<c> highlights;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0010"}, d2 = {"Lm29/d$a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "b", "()Ljo3/b;", "totalSaved", "", "Lm29/d$b;", "Ljava/util/List;", "()Ljava/util/List;", "savingsGroups", "feature_lifestyle_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalSaved")
        @NotNull
        private final jo3.b totalSaved;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("savingsGroups")
        private final List<b> savingsGroups;

        public a(ArrayList arrayList, jo3.b totalSaved) {
            Intrinsics.checkNotNullParameter(totalSaved, "totalSaved");
            this.totalSaved = totalSaved;
            this.savingsGroups = arrayList;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getSavingsGroups() {
            return this.savingsGroups;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.b getTotalSaved() {
            return this.totalSaved;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.totalSaved, aVar.totalSaved) && Intrinsics.f(this.savingsGroups, aVar.savingsGroups);
        }

        public final int hashCode() {
            int iHashCode = this.totalSaved.hashCode() * 31;
            List<b> list = this.savingsGroups;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0013"}, d2 = {"Lm29/d$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "type", "Ljo3/b;", "b", "Ljo3/b;", "()Ljo3/b;", "moneySaved", "", "Lm29/a;", "Ljava/util/List;", "()Ljava/util/List;", "products", "feature_lifestyle_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("moneySaved")
        private final jo3.b moneySaved;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("products")
        @NotNull
        private final List<m29.a> products;

        public b(String type, jo3.b bVar, ArrayList products) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(products, "products");
            this.type = type;
            this.moneySaved = bVar;
            this.products = products;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.b getMoneySaved() {
            return this.moneySaved;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getProducts() {
            return this.products;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.moneySaved, bVar.moneySaved) && Intrinsics.f(this.products, bVar.products);
        }

        public final int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            jo3.b bVar = this.moneySaved;
            return this.products.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\f\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u001a"}, d2 = {"Lm29/d$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "title", "b", "e", "subtitle", "c", "backgroundImage", "", "d", "Z", "()Z", "active", "g", "type", "Lm29/d$c$a;", "Lm29/d$c$a;", "()Lm29/d$c$a;", "cta", "deeplink", "feature_lifestyle_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        @NotNull
        private final String subtitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("backgroundImage")
        @NotNull
        private final String backgroundImage;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("active")
        private final boolean active;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("cta")
        private final a cta;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("deeplink")
        private final String deeplink;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lm29/d$c$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "title", "iconId", "feature_lifestyle_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("iconId")
            private final String iconId;

            public a(String title, String str) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.iconId = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getIconId() {
                return this.iconId;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.iconId, aVar.iconId);
            }

            public final int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                String str = this.iconId;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }
        }

        public c(String title, String subtitle, String backgroundImage, boolean z, String type, a aVar, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
            Intrinsics.checkNotNullParameter(type, "type");
            this.title = title;
            this.subtitle = subtitle;
            this.backgroundImage = backgroundImage;
            this.active = z;
            this.type = type;
            this.cta = aVar;
            this.deeplink = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getActive() {
            return this.active;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBackgroundImage() {
            return this.backgroundImage;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final a getCta() {
            return this.cta;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.subtitle, cVar.subtitle) && Intrinsics.f(this.backgroundImage, cVar.backgroundImage) && this.active == cVar.active && Intrinsics.f(this.type, cVar.type) && Intrinsics.f(this.cta, cVar.cta) && Intrinsics.f(this.deeplink, cVar.deeplink);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final int hashCode() {
            int iC = p.a.c(j6.a.c(p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.subtitle), 31, this.backgroundImage), 31, this.active), 31, this.type);
            a aVar = this.cta;
            int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str = this.deeplink;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }
    }

    public d(a savings, ArrayList highlights) {
        Intrinsics.checkNotNullParameter(savings, "savings");
        Intrinsics.checkNotNullParameter(highlights, "highlights");
        this.savings = savings;
        this.highlights = highlights;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getHighlights() {
        return this.highlights;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getSavings() {
        return this.savings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.savings, dVar.savings) && Intrinsics.f(this.highlights, dVar.highlights);
    }

    public final int hashCode() {
        return this.highlights.hashCode() + (this.savings.hashCode() * 31);
    }
}
