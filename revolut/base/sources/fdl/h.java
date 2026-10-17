package fdl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class h {

    @NotNull
    public static final b Companion = new b();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0006\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0004¨\u0006\u001a"}, d2 = {"Lfdl/h$a;", "Lfdl/h;", "", "toString", "()Ljava/lang/String;", "Lfdl/h$a$a;", "a", "Lfdl/h$a$a;", "e", "()Lfdl/h$a$a;", "coupon", "Ljava/time/LocalDate;", "b", "Ljava/time/LocalDate;", "g", "()Ljava/time/LocalDate;", "maturityDate", "Lfdl/h$a$b;", "c", "Lfdl/h$a$b;", "f", "()Lfdl/h$a$b;", "issuer", "d", "Ljava/lang/String;", "bondType", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("coupon")
        private final C0788a coupon;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("maturityDate")
        private final LocalDate maturityDate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("issuer")
        private final b issuer;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("bondType")
        private final String bondType;

        /* JADX INFO: renamed from: fdl.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lfdl/h$a$a;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "rate", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0788a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("rate")
            private final BigDecimal rate;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BigDecimal getRate() {
                return this.rate;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0788a) && Intrinsics.f(this.rate, ((C0788a) obj2).rate);
            }

            public final int hashCode() {
                BigDecimal bigDecimal = this.rate;
                if (bigDecimal == null) {
                    return 0;
                }
                return bigDecimal.hashCode();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lfdl/h$a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "fullName", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("fullName")
            private final String fullName;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getFullName() {
                return this.fullName;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.fullName, ((b) obj2).fullName);
            }

            public final int hashCode() {
                String str = this.fullName;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getBondType() {
            return this.bondType;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C0788a getCoupon() {
            return this.coupon;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.coupon, aVar.coupon) && Intrinsics.f(this.maturityDate, aVar.maturityDate) && Intrinsics.f(this.issuer, aVar.issuer) && Intrinsics.f(this.bondType, aVar.bondType);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final b getIssuer() {
            return this.issuer;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final LocalDate getMaturityDate() {
            return this.maturityDate;
        }

        public final int hashCode() {
            C0788a c0788a = this.coupon;
            int iHashCode = (c0788a == null ? 0 : c0788a.hashCode()) * 31;
            LocalDate localDate = this.maturityDate;
            int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
            b bVar = this.issuer;
            int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str = this.bondType;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }
    }

    public static final class b {
        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\u0005R\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\u0005¨\u0006\u0010"}, d2 = {"Lfdl/h$c;", "Lfdl/h;", "Lfdl/i;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "underlyingAssetType", "", "b", "Z", "()Z", "leveraged", "brand", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends h implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("underlyingAssetType")
        private final String underlyingAssetType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("leveraged")
        private final boolean leveraged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("brand")
        private final String brand;

        @Override // fdl.i
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getLeveraged() {
            return this.leveraged;
        }

        @Override // fdl.i
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBrand() {
            return this.brand;
        }

        @Override // fdl.i
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getUnderlyingAssetType() {
            return this.underlyingAssetType;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.underlyingAssetType, cVar.underlyingAssetType) && this.leveraged == cVar.leveraged && Intrinsics.f(this.brand, cVar.brand);
        }

        public final int hashCode() {
            String str = this.underlyingAssetType;
            int iC = j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.leveraged);
            String str2 = this.brand;
            return iC + (str2 != null ? str2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\u0005R\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\u0005¨\u0006\u0010"}, d2 = {"Lfdl/h$d;", "Lfdl/h;", "Lfdl/i;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "underlyingAssetType", "", "b", "Z", "()Z", "leveraged", "brand", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d extends h implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("underlyingAssetType")
        private final String underlyingAssetType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("leveraged")
        private final boolean leveraged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("brand")
        private final String brand;

        @Override // fdl.i
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getLeveraged() {
            return this.leveraged;
        }

        @Override // fdl.i
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBrand() {
            return this.brand;
        }

        @Override // fdl.i
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getUnderlyingAssetType() {
            return this.underlyingAssetType;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.underlyingAssetType, dVar.underlyingAssetType) && this.leveraged == dVar.leveraged && Intrinsics.f(this.brand, dVar.brand);
        }

        public final int hashCode() {
            String str = this.underlyingAssetType;
            int iC = j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.leveraged);
            String str2 = this.brand;
            return iC + (str2 != null ? str2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\u0005R\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\u0005¨\u0006\u0010"}, d2 = {"Lfdl/h$e;", "Lfdl/h;", "Lfdl/i;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "underlyingAssetType", "", "b", "Z", "()Z", "leveraged", "brand", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e extends h implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("underlyingAssetType")
        private final String underlyingAssetType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("leveraged")
        private final boolean leveraged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("brand")
        private final String brand;

        @Override // fdl.i
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getLeveraged() {
            return this.leveraged;
        }

        @Override // fdl.i
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBrand() {
            return this.brand;
        }

        @Override // fdl.i
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getUnderlyingAssetType() {
            return this.underlyingAssetType;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.underlyingAssetType, eVar.underlyingAssetType) && this.leveraged == eVar.leveraged && Intrinsics.f(this.brand, eVar.brand);
        }

        public final int hashCode() {
            String str = this.underlyingAssetType;
            int iC = j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.leveraged);
            String str2 = this.brand;
            return iC + (str2 != null ? str2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006 "}, d2 = {"Lfdl/h$f;", "Lfdl/h;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "distributionPolicy", "", "b", "Z", "j", "()Z", "hedged", "Lfdl/h$f$a;", "c", "Lfdl/h$f$a;", "f", "()Lfdl/h$f$a;", "fundHouseId", "h", "fundRegion", "e", "i", "fundStrategy", "fundClass", "Lfdl/h$f$b;", "g", "Lfdl/h$f$b;", "()Lfdl/h$f$b;", "fundMetadata", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("distributionPolicy")
        @NotNull
        private final String distributionPolicy;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("hedged")
        private final boolean hedged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("fundHouseId")
        @NotNull
        private final a fundHouseId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("region")
        private final String fundRegion;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("strategy")
        private final String fundStrategy;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("fundClass")
        private final String fundClass;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("fundMetadata")
        private final b fundMetadata;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lfdl/h$f$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "value", "origin", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("value")
            @NotNull
            private final String value;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("origin")
            @NotNull
            private final String origin;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getOrigin() {
                return this.origin;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.value, aVar.value) && Intrinsics.f(this.origin, aVar.origin);
            }

            public final int hashCode() {
                return this.origin.hashCode() + (this.value.hashCode() * 31);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0011"}, d2 = {"Lfdl/h$f$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "title", "", "b", "Z", "c", "()Z", "exclusive", "backgroundImageUrl", "animationVideoUrl", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("exclusive")
            private final boolean exclusive;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("backgroundImageURL")
            private final String backgroundImageUrl;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("animationVideoURL")
            private final String animationVideoUrl;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAnimationVideoUrl() {
                return this.animationVideoUrl;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getBackgroundImageUrl() {
                return this.backgroundImageUrl;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getExclusive() {
                return this.exclusive;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.title, bVar.title) && this.exclusive == bVar.exclusive && Intrinsics.f(this.backgroundImageUrl, bVar.backgroundImageUrl) && Intrinsics.f(this.animationVideoUrl, bVar.animationVideoUrl);
            }

            public final int hashCode() {
                int iC = j6.a.c(this.title.hashCode() * 31, 31, this.exclusive);
                String str = this.backgroundImageUrl;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.animationVideoUrl;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDistributionPolicy() {
            return this.distributionPolicy;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getFundClass() {
            return this.fundClass;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof f)) {
                return false;
            }
            f fVar = (f) obj2;
            return Intrinsics.f(this.distributionPolicy, fVar.distributionPolicy) && this.hedged == fVar.hedged && Intrinsics.f(this.fundHouseId, fVar.fundHouseId) && Intrinsics.f(this.fundRegion, fVar.fundRegion) && Intrinsics.f(this.fundStrategy, fVar.fundStrategy) && Intrinsics.f(this.fundClass, fVar.fundClass) && Intrinsics.f(this.fundMetadata, fVar.fundMetadata);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final a getFundHouseId() {
            return this.fundHouseId;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final b getFundMetadata() {
            return this.fundMetadata;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getFundRegion() {
            return this.fundRegion;
        }

        public final int hashCode() {
            int iHashCode = (this.fundHouseId.hashCode() + j6.a.c(this.distributionPolicy.hashCode() * 31, 31, this.hedged)) * 31;
            String str = this.fundRegion;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.fundStrategy;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.fundClass;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            b bVar = this.fundMetadata;
            return iHashCode4 + (bVar != null ? bVar.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getFundStrategy() {
            return this.fundStrategy;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getHedged() {
            return this.hedged;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\tR\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0015\u0010\u001dR\u001c\u0010#\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001b\u0010\"R\u001c\u0010(\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b*\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b \u0010\u0004¨\u0006-"}, d2 = {"Lfdl/h$g;", "Lfdl/h;", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Integer;", "j", "()Ljava/lang/Integer;", "risk", "Ljava/math/BigDecimal;", "b", "Ljava/math/BigDecimal;", "g", "()Ljava/math/BigDecimal;", "maxReturnPercent", "c", "k", "termMonths", "", "d", "Ljava/util/List;", "l", "()Ljava/util/List;", "underlyingAssetsRefs", "Ljo3/a;", "e", "Ljo3/a;", "()Ljo3/a;", "faceValue", "Lko3/a;", "f", "Lko3/a;", "()Lko3/a;", "issuePrice", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "h", "()Ljava/time/LocalDate;", "noteTradeDate", "Ljava/lang/String;", "i", "noteType", "lifecycleState", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("risk")
        private final Integer risk = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("maxReturnPercent")
        private final BigDecimal maxReturnPercent = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("termMonths")
        private final Integer termMonths = null;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("underlyingAssetsRefs")
        private final List<String> underlyingAssetsRefs = null;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("faceValue")
        private final jo3.a faceValue = null;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("issuePrice")
        private final ko3.a issuePrice = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("noteTradeDate")
        private final LocalDate noteTradeDate = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("noteType")
        private final String noteType = null;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("lifecycleState")
        private final String lifecycleState = null;

        /* JADX INFO: renamed from: d, reason: from getter */
        public final jo3.a getFaceValue() {
            return this.faceValue;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ko3.a getIssuePrice() {
            return this.issuePrice;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof g)) {
                return false;
            }
            g gVar = (g) obj2;
            return Intrinsics.f(this.risk, gVar.risk) && Intrinsics.f(this.maxReturnPercent, gVar.maxReturnPercent) && Intrinsics.f(this.termMonths, gVar.termMonths) && Intrinsics.f(this.underlyingAssetsRefs, gVar.underlyingAssetsRefs) && Intrinsics.f(this.faceValue, gVar.faceValue) && Intrinsics.f(this.issuePrice, gVar.issuePrice) && Intrinsics.f(this.noteTradeDate, gVar.noteTradeDate) && Intrinsics.f(this.noteType, gVar.noteType) && Intrinsics.f(this.lifecycleState, gVar.lifecycleState);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getLifecycleState() {
            return this.lifecycleState;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final BigDecimal getMaxReturnPercent() {
            return this.maxReturnPercent;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final LocalDate getNoteTradeDate() {
            return this.noteTradeDate;
        }

        public final int hashCode() {
            Integer num = this.risk;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            BigDecimal bigDecimal = this.maxReturnPercent;
            int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            Integer num2 = this.termMonths;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            List<String> list = this.underlyingAssetsRefs;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            jo3.a aVar = this.faceValue;
            int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            ko3.a aVar2 = this.issuePrice;
            int iHashCode6 = (iHashCode5 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            LocalDate localDate = this.noteTradeDate;
            int iHashCode7 = (iHashCode6 + (localDate == null ? 0 : localDate.hashCode())) * 31;
            String str = this.noteType;
            int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.lifecycleState;
            return iHashCode8 + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getNoteType() {
            return this.noteType;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Integer getRisk() {
            return this.risk;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final Integer getTermMonths() {
            return this.termMonths;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final List getUnderlyingAssetsRefs() {
            return this.underlyingAssetsRefs;
        }
    }

    /* JADX INFO: renamed from: fdl.h$h, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lfdl/h$h;", "Lfdl/h;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class C0789h extends h {

        @NotNull
        public static final C0789h INSTANCE = new C0789h();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f134133a = yhm.j.c(yhm.k.PUBLICATION, new fce.b(3));

        private C0789h() {
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof C0789h);
        }

        public final int hashCode() {
            return 1567185730;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f134133a.getValue();
        }
    }

    private h() {
    }
}
