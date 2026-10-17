package xue;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u0005\u0010\u001d¨\u0006\u001f"}, d2 = {"Lxue/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "type", "b", "g", "title", "c", "description", "Lque/a;", "d", "Lque/a;", "()Lque/a;", "logo", "", "e", "Ljava/util/List;", "()Ljava/util/List;", "supportedCurrencyCodes", "f", "tags", "fundsArrivalTimeDescription", "Lxue/f$a;", "Lxue/f$a;", "()Lxue/f$a;", "additionalData", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("logo")
    private final que.a logo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("supportedCurrencies")
    @NotNull
    private final List<String> supportedCurrencyCodes;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("tags")
    private final List<String> tags;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("fundsArrivalTimeDescription")
    private final String fundsArrivalTimeDescription;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalData")
    private final a additionalData;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\n\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\u000b"}, d2 = {"Lxue/f$a;", "", "", "toString", "()Ljava/lang/String;", "Lxue/f$a$b;", "a", "Lxue/f$a$b;", "()Lxue/f$a$b;", "supportedInstitutions", "b", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("supportedInstitutions")
        private final b supportedInstitutions;

        /* JADX INFO: renamed from: xue.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lxue/f$a$a;", "", "", "toString", "()Ljava/lang/String;", "Lque/a;", "a", "Lque/a;", "()Lque/a;", "logo", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1713a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("logo")
            private final que.a logo;

            public C1713a(que.a aVar) {
                this.logo = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final que.a getLogo() {
                return this.logo;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C1713a) && Intrinsics.f(this.logo, ((C1713a) obj2).logo);
            }

            public final int hashCode() {
                que.a aVar = this.logo;
                if (aVar == null) {
                    return 0;
                }
                return aVar.hashCode();
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0010"}, d2 = {"Lxue/f$a$b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "total", "", "Lxue/f$a$a;", "Ljava/util/List;", "()Ljava/util/List;", "institutions", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("total")
            private final int total;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("institutions")
            @NotNull
            private final List<C1713a> institutions;

            public b(int i, ArrayList institutions) {
                Intrinsics.checkNotNullParameter(institutions, "institutions");
                this.total = i;
                this.institutions = institutions;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getInstitutions() {
                return this.institutions;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getTotal() {
                return this.total;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return this.total == bVar.total && Intrinsics.f(this.institutions, bVar.institutions);
            }

            public final int hashCode() {
                return this.institutions.hashCode() + (Integer.hashCode(this.total) * 31);
            }
        }

        public a() {
            this(null);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getSupportedInstitutions() {
            return this.supportedInstitutions;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.supportedInstitutions, ((a) obj2).supportedInstitutions);
        }

        public final int hashCode() {
            b bVar = this.supportedInstitutions;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public a(b bVar) {
            this.supportedInstitutions = bVar;
        }
    }

    public f(String type, String title, String str, que.a aVar, List supportedCurrencyCodes, ArrayList arrayList, String str2, a aVar2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(supportedCurrencyCodes, "supportedCurrencyCodes");
        this.type = type;
        this.title = title;
        this.description = str;
        this.logo = aVar;
        this.supportedCurrencyCodes = supportedCurrencyCodes;
        this.tags = arrayList;
        this.fundsArrivalTimeDescription = str2;
        this.additionalData = aVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAdditionalData() {
        return this.additionalData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFundsArrivalTimeDescription() {
        return this.fundsArrivalTimeDescription;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final que.a getLogo() {
        return this.logo;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getSupportedCurrencyCodes() {
        return this.supportedCurrencyCodes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.type, fVar.type) && Intrinsics.f(this.title, fVar.title) && Intrinsics.f(this.description, fVar.description) && Intrinsics.f(this.logo, fVar.logo) && Intrinsics.f(this.supportedCurrencyCodes, fVar.supportedCurrencyCodes) && Intrinsics.f(this.tags, fVar.tags) && Intrinsics.f(this.fundsArrivalTimeDescription, fVar.fundsArrivalTimeDescription) && Intrinsics.f(this.additionalData, fVar.additionalData);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getTags() {
        return this.tags;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int iC = p.a.c(this.type.hashCode() * 31, 31, this.title);
        String str = this.description;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        que.a aVar = this.logo;
        int iD = p.a.d((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.supportedCurrencyCodes);
        List<String> list = this.tags;
        int iHashCode2 = (iD + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.fundsArrivalTimeDescription;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar2 = this.additionalData;
        return iHashCode3 + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
