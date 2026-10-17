package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public interface w60 extends hq0 {

    public static final class a implements w60 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34527a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f34528b = "location_unexpected";

        private a() {
        }

        @Override // com.fourthline.orca.internal.w60, com.fourthline.orca.internal.hq0
        public /* bridge */ String a() {
            return super.a();
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        @Override // com.fourthline.orca.internal.hq0
        public String getName() {
            return f34528b;
        }

        public int hashCode() {
            return 447329019;
        }

        public String toString() {
            return "LocationGeneralError";
        }
    }

    public static final class b implements w60 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f34529a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f34530b = "location_permission";

        private b() {
        }

        @Override // com.fourthline.orca.internal.w60, com.fourthline.orca.internal.hq0
        public /* bridge */ String a() {
            return super.a();
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        @Override // com.fourthline.orca.internal.hq0
        public String getName() {
            return f34530b;
        }

        public int hashCode() {
            return -1989062262;
        }

        public String toString() {
            return "LocationPermission";
        }
    }

    public static final class c implements w60 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f34531a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f34532b = "location_permission_not_granted";

        private c() {
        }

        @Override // com.fourthline.orca.internal.w60, com.fourthline.orca.internal.hq0
        public /* bridge */ String a() {
            return super.a();
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof c);
        }

        @Override // com.fourthline.orca.internal.hq0
        public String getName() {
            return f34532b;
        }

        public int hashCode() {
            return 235596178;
        }

        public String toString() {
            return "LocationPermissionNotGranted";
        }
    }

    public static final class d implements w60 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f34533a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f34534b = "location_services_not_enabled";

        private d() {
        }

        @Override // com.fourthline.orca.internal.w60, com.fourthline.orca.internal.hq0
        public /* bridge */ String a() {
            return super.a();
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof d);
        }

        @Override // com.fourthline.orca.internal.hq0
        public String getName() {
            return f34534b;
        }

        public int hashCode() {
            return 1006986407;
        }

        public String toString() {
            return "LocationServicesNotEnabled";
        }
    }

    public static final class e implements w60 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f34535a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f34536b = "precise_location_permission";

        private e() {
        }

        @Override // com.fourthline.orca.internal.w60, com.fourthline.orca.internal.hq0
        public /* bridge */ String a() {
            return super.a();
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof e);
        }

        @Override // com.fourthline.orca.internal.hq0
        public String getName() {
            return f34536b;
        }

        public int hashCode() {
            return -787899335;
        }

        public String toString() {
            return "PreciseLocationPermission";
        }
    }

    @Override // com.fourthline.orca.internal.hq0
    default String a() {
        return "location";
    }
}
