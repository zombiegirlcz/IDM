package cjg;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {

    /* JADX INFO: renamed from: cjg.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcjg/a$a;", "Lcjg/a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "e", "name", "category", "d", "logo", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "approve", "feature_trusted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0154a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("category")
        @NotNull
        private final String category;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("logo")
        private final String logo;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("approve")
        private final Long approve;

        public C0154a(String id10, String name, String category, Long l2, String str) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(category, "category");
            this.id = id10;
            this.name = name;
            this.category = category;
            this.logo = str;
            this.approve = l2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Long getApprove() {
            return this.approve;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLogo() {
            return this.logo;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0154a)) {
                return false;
            }
            C0154a c0154a = (C0154a) obj2;
            return Intrinsics.f(this.id, c0154a.id) && Intrinsics.f(this.name, c0154a.name) && Intrinsics.f(this.category, c0154a.category) && Intrinsics.f(this.logo, c0154a.logo) && Intrinsics.f(this.approve, c0154a.approve);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.name), 31, this.category);
            String str = this.logo;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Long l2 = this.approve;
            return iHashCode + (l2 != null ? l2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcjg/a$b;", "Lcjg/a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "e", "name", "c", "category", "d", "logo", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "lastDecline", "feature_trusted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("category")
        @NotNull
        private final String category;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("logo")
        private final String logo;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("lastDecline")
        private final Long lastDecline;

        public b(String id10, String name, String category, Long l2, String str) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(category, "category");
            this.id = id10;
            this.name = name;
            this.category = category;
            this.logo = str;
            this.lastDecline = l2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Long getLastDecline() {
            return this.lastDecline;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLogo() {
            return this.logo;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.category, bVar.category) && Intrinsics.f(this.logo, bVar.logo) && Intrinsics.f(this.lastDecline, bVar.lastDecline);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.name), 31, this.category);
            String str = this.logo;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Long l2 = this.lastDecline;
            return iHashCode + (l2 != null ? l2.hashCode() : 0);
        }
    }

    private a() {
    }
}
