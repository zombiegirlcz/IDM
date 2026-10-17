package uad;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0005\u0010\u001aR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010(\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b\u001e\u0010'R\u001c\u0010,\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b\u0012\u0010+R\u001a\u00100\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b\n\u0010/R\u001c\u00103\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00101\u001a\u0004\b\u000f\u00102R\"\u00108\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u00106\u001a\u0004\b\u0018\u00107¨\u00069"}, d2 = {"Luad/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "id", "", "b", "J", "e", "()J", "createdDate", "c", "l", "state", "d", "k", "product", "m", "title", "Lmf0/a;", "f", "Lmf0/a;", "()Lmf0/a;", "amount", "g", "defaultCurrency", "h", "j", "paymentLink", "Luad/d$a;", "Luad/d$a;", "n", "()Luad/d$a;", "usage", "Ljava/lang/Long;", "()Ljava/lang/Long;", "expirationDate", "Luad/d$b;", "Luad/d$b;", "()Luad/d$b;", "createdByUser", "", "I", "()I", "completedOrders", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "completedOrdersLimit", "", "Luad/b;", "Ljava/util/List;", "()Ljava/util/List;", "customFieldDefinitions", "feature_shared_order_initiation_page_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("product")
    @NotNull
    private final String product;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("amount")
    private final mf0.a amount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultCurrency")
    private final String defaultCurrency;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentLink")
    @NotNull
    private final String paymentLink;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("usage")
    private final a usage;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("expirationDate")
    private final Long expirationDate;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("createdByUser")
    private final b createdByUser;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("completedOrders")
    private final int completedOrders;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("completedOrdersLimit")
    private final Integer completedOrdersLimit;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("customFieldDefinitions")
    private final List<uad.b> customFieldDefinitions;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Luad/d$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "limit", "completedOrders", "feature_shared_order_initiation_page_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("limit")
        private final int limit;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("completedOrders")
        private final int completedOrders;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCompletedOrders() {
            return this.completedOrders;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getLimit() {
            return this.limit;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.limit == aVar.limit && this.completedOrders == aVar.completedOrders;
        }

        public final int hashCode() {
            return Integer.hashCode(this.completedOrders) + (Integer.hashCode(this.limit) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Luad/d$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "firstName", "c", "lastName", "feature_shared_order_initiation_page_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("firstName")
        private final String firstName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("lastName")
        private final String lastName;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLastName() {
            return this.lastName;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.firstName, bVar.firstName) && Intrinsics.f(this.lastName, bVar.lastName);
        }

        public final int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.firstName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.lastName;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final mf0.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCompletedOrders() {
        return this.completedOrders;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getCompletedOrdersLimit() {
        return this.completedOrdersLimit;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getCreatedByUser() {
        return this.createdByUser;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.id, dVar.id) && this.createdDate == dVar.createdDate && Intrinsics.f(this.state, dVar.state) && Intrinsics.f(this.product, dVar.product) && Intrinsics.f(this.title, dVar.title) && Intrinsics.f(this.amount, dVar.amount) && Intrinsics.f(this.defaultCurrency, dVar.defaultCurrency) && Intrinsics.f(this.paymentLink, dVar.paymentLink) && Intrinsics.f(this.usage, dVar.usage) && Intrinsics.f(this.expirationDate, dVar.expirationDate) && Intrinsics.f(this.createdByUser, dVar.createdByUser) && this.completedOrders == dVar.completedOrders && Intrinsics.f(this.completedOrdersLimit, dVar.completedOrdersLimit) && Intrinsics.f(this.customFieldDefinitions, dVar.customFieldDefinitions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getCustomFieldDefinitions() {
        return this.customFieldDefinitions;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDefaultCurrency() {
        return this.defaultCurrency;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getExpirationDate() {
        return this.expirationDate;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(a0.d.c(this.id.hashCode() * 31, 31, this.createdDate), 31, this.state), 31, this.product), 31, this.title);
        mf0.a aVar = this.amount;
        int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.defaultCurrency;
        int iC2 = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.paymentLink);
        a aVar2 = this.usage;
        int iHashCode2 = (iC2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Long l2 = this.expirationDate;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        b bVar = this.createdByUser;
        int iB = j6.a.b(this.completedOrders, (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
        Integer num = this.completedOrdersLimit;
        int iHashCode4 = (iB + (num == null ? 0 : num.hashCode())) * 31;
        List<uad.b> list = this.customFieldDefinitions;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getPaymentLink() {
        return this.paymentLink;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final a getUsage() {
        return this.usage;
    }
}
