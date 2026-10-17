package q90;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lq90/x2;", "Lq90/y;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "result", "Lq90/x2$a;", "Lq90/x2$a;", "()Lq90/x2$a;", "payload", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x2 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("result")
    @NotNull
    private final String result;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("payload")
    private final a payload;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lq90/x2$a;", "Lq90/y;", "<init>", "()V", "a", "b", "Lq90/x2$a$a;", "Lq90/x2$a$b;", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a extends y {

        /* JADX INFO: renamed from: q90.x2$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0016"}, d2 = {"Lq90/x2$a$a;", "Lq90/x2$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "", "b", "D", "d", "()D", "longitude", "c", "latitude", "country", "e", "region", "f", "city", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1336a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("lon")
            private final double longitude;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("lat")
            private final double latitude;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("country")
            private final String country;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("region")
            private final String region;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("city")
            private final String city;

            public C1336a(double d, double d5, String type, String str, String str2, String str3) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
                this.longitude = d;
                this.latitude = d5;
                this.country = str;
                this.region = str2;
                this.city = str3;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCity() {
                return this.city;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getCountry() {
                return this.country;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final double getLatitude() {
                return this.latitude;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final double getLongitude() {
                return this.longitude;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getRegion() {
                return this.region;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1336a)) {
                    return false;
                }
                C1336a c1336a = (C1336a) obj2;
                return Intrinsics.f(this.type, c1336a.type) && Double.compare(this.longitude, c1336a.longitude) == 0 && Double.compare(this.latitude, c1336a.latitude) == 0 && Intrinsics.f(this.country, c1336a.country) && Intrinsics.f(this.region, c1336a.region) && Intrinsics.f(this.city, c1336a.city);
            }

            public final int hashCode() {
                int iC = m72.b.c(m72.b.c(this.type.hashCode() * 31, this.longitude, 31), this.latitude, 31);
                String str = this.country;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.region;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.city;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000b"}, d2 = {"Lq90/x2$a$b;", "Lq90/x2$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "accessCode", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("accessCode")
            @NotNull
            private final String accessCode;

            public b(String type, String accessCode) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(accessCode, "accessCode");
                this.type = type;
                this.accessCode = accessCode;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAccessCode() {
                return this.accessCode;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.accessCode, bVar.accessCode);
            }

            public final int hashCode() {
                return this.accessCode.hashCode() + (this.type.hashCode() * 31);
            }
        }

        private a() {
        }
    }

    public x2(String result, a aVar) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
        this.payload = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj2;
        return Intrinsics.f(this.result, x2Var.result) && Intrinsics.f(this.payload, x2Var.payload);
    }

    public final int hashCode() {
        int iHashCode = this.result.hashCode() * 31;
        a aVar = this.payload;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
