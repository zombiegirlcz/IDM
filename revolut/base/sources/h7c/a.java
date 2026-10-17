package h7c;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0006\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lh7c/a;", "", "", "toString", "()Ljava/lang/String;", "Lh7c/a$a;", "a", "Lh7c/a$a;", "getDefaultPaymentMethod", "()Lh7c/a$a;", "defaultPaymentMethod", "Lh7c/a$b;", "b", "Lh7c/a$b;", "getDefaultShippingContact", "()Lh7c/a$b;", "defaultShippingContact", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultPaymentMethod")
    private final C0862a defaultPaymentMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultShippingContact")
    private final b defaultShippingContact;

    /* JADX INFO: renamed from: h7c.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lh7c/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getId", "id", "b", "getPocketId", "pocketId", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0862a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("pocketId")
        private final String pocketId;

        public C0862a(String id10, String str) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.id = id10;
            this.pocketId = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0862a)) {
                return false;
            }
            C0862a c0862a = (C0862a) obj2;
            return Intrinsics.f(this.id, c0862a.id) && Intrinsics.f(this.pocketId, c0862a.pocketId);
        }

        public final int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.pocketId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\t"}, d2 = {"Lh7c/a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getId", "id", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        public b(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.id = id10;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.id, ((b) obj2).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }
    }

    public a() {
        this(null, null, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.defaultPaymentMethod, aVar.defaultPaymentMethod) && Intrinsics.f(this.defaultShippingContact, aVar.defaultShippingContact);
    }

    public final int hashCode() {
        C0862a c0862a = this.defaultPaymentMethod;
        int iHashCode = (c0862a == null ? 0 : c0862a.hashCode()) * 31;
        b bVar = this.defaultShippingContact;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public a(C0862a c0862a, b bVar, int i) {
        c0862a = (i & 1) != 0 ? null : c0862a;
        bVar = (i & 2) != 0 ? null : bVar;
        this.defaultPaymentMethod = c0862a;
        this.defaultShippingContact = bVar;
    }
}
