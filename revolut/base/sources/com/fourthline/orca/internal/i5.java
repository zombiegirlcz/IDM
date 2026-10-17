package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface i5 {

    public static final class a implements i5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Integer f29492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c81 f29493b;

        public a(Integer num) {
            this.f29492a = num;
            this.f29493b = num == null ? c81.b.f27406b : c81.a.a(c81.f27404a, num.intValue(), 0, 2, null);
        }

        @Override // com.fourthline.orca.internal.i5
        public /* bridge */ f5 a() {
            return super.a();
        }

        @Override // com.fourthline.orca.internal.i5
        public c81 b() {
            return this.f29493b;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f29492a, ((a) obj2).f29492a);
        }

        public int hashCode() {
            Integer num = this.f29492a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public String toString() {
            return "Continue(suggestedTextResource=" + this.f29492a + ")";
        }
    }

    public static final class b implements i5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29494a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final c81.d f29495b = c81.a.a(c81.f27404a, R.string.shared_validation_iban_country_not_supported, 0, 2, null);

        private b() {
        }

        @Override // com.fourthline.orca.internal.i5
        public /* bridge */ f5 a() {
            return super.a();
        }

        @Override // com.fourthline.orca.internal.i5
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c81.d b() {
            return f29495b;
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return -610640224;
        }

        public String toString() {
            return "InvalidCountry";
        }
    }

    public static final class c implements i5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f29496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f5 f29497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c81.d f29498c = c81.f27404a.a(R.string.shared_validation_invalid_iban_accessibility);

        public c(boolean z, f5 f5Var) {
            this.f29496a = z;
            this.f29497b = f5Var;
        }

        @Override // com.fourthline.orca.internal.i5
        public f5 a() {
            return this.f29497b;
        }

        @Override // com.fourthline.orca.internal.i5
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c81.d b() {
            return this.f29498c;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return this.f29496a == cVar.f29496a && Intrinsics.f(this.f29497b, cVar.f29497b);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.f29496a) * 31;
            f5 f5Var = this.f29497b;
            return iHashCode + (f5Var == null ? 0 : f5Var.hashCode());
        }

        public String toString() {
            return "InvalidFormat(isDefinitive=" + this.f29496a + ", countryConfig=" + this.f29497b + ")";
        }
    }

    public static final class d implements i5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f29499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f5 f29500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c81.c f29501c;

        public d(boolean z, f5 countryConfig) {
            Intrinsics.checkNotNullParameter(countryConfig, "countryConfig");
            this.f29499a = z;
            this.f29500b = countryConfig;
            this.f29501c = c81.f27404a.a(R.string.shared_validation_iban_length, a().getCountryCode(), String.valueOf(a().getLength()));
        }

        @Override // com.fourthline.orca.internal.i5
        public f5 a() {
            return this.f29500b;
        }

        @Override // com.fourthline.orca.internal.i5
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c81.c b() {
            return this.f29501c;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return this.f29499a == dVar.f29499a && Intrinsics.f(this.f29500b, dVar.f29500b);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f29499a) * 31) + this.f29500b.hashCode();
        }

        public String toString() {
            return "InvalidLength(isDefinitive=" + this.f29499a + ", countryConfig=" + this.f29500b + ")";
        }
    }

    public static final class e implements i5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f29502a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final c81.d f29503b = c81.a.a(c81.f27404a, R.string.shared_validation_iban_country_code, 0, 2, null);

        private e() {
        }

        @Override // com.fourthline.orca.internal.i5
        public /* bridge */ f5 a() {
            return super.a();
        }

        @Override // com.fourthline.orca.internal.i5
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c81.d b() {
            return f29503b;
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof e);
        }

        public int hashCode() {
            return 1130330769;
        }

        public String toString() {
            return "MissingCountryStart";
        }
    }

    public static final class f implements i5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f29504a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final c81.d f29505b = c81.f27404a.b(R.string.shared_validation_required_iban_accessibility);

        private f() {
        }

        @Override // com.fourthline.orca.internal.i5
        public /* bridge */ f5 a() {
            return super.a();
        }

        @Override // com.fourthline.orca.internal.i5
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c81.d b() {
            return f29505b;
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof f);
        }

        public int hashCode() {
            return 710047072;
        }

        public String toString() {
            return "Required";
        }
    }

    public static final class g implements i5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f5 f29506a;

        public g(f5 countryConfig) {
            Intrinsics.checkNotNullParameter(countryConfig, "countryConfig");
            this.f29506a = countryConfig;
        }

        @Override // com.fourthline.orca.internal.i5
        public f5 a() {
            return this.f29506a;
        }

        @Override // com.fourthline.orca.internal.i5
        public /* bridge */ c81 b() {
            return super.b();
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof g) && Intrinsics.f(this.f29506a, ((g) obj2).f29506a);
        }

        public int hashCode() {
            return this.f29506a.hashCode();
        }

        public String toString() {
            return "Success(countryConfig=" + this.f29506a + ")";
        }
    }

    default f5 a() {
        return null;
    }

    default c81 b() {
        return c81.b.f27406b;
    }
}
