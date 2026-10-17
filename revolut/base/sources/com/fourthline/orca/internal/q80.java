package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface q80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e f32229a = e.f32244a;

    public interface a extends q80 {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.q80$a$a, reason: collision with other inner class name */
        public static final class C0270a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0270a f32230b = new C0270a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32231c = "address_details";

            private C0270a() {
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32231c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof C0270a);
            }

            public int hashCode() {
                return -1975944700;
            }

            public String toString() {
                return "Details";
            }
        }
    }

    public interface c extends q80 {

        public static final class a implements c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f32234b = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32235c = "bav_capture";

            private a() {
            }

            @Override // com.fourthline.orca.internal.q80.c, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32235c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof a);
            }

            public int hashCode() {
                return 980117329;
            }

            public String toString() {
                return "CaptureIban";
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f32236b = new b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32237c = "bav_intro";

            private b() {
            }

            @Override // com.fourthline.orca.internal.q80.c, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32237c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof b);
            }

            public int hashCode() {
                return -1467385949;
            }

            public String toString() {
                return "FlowIntroduction";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.q80$c$c, reason: collision with other inner class name */
        public static final class C0271c implements c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0271c f32238b = new C0271c();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32239c = "bav_processing";

            private C0271c() {
            }

            @Override // com.fourthline.orca.internal.q80.c, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32239c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof C0271c);
            }

            public int hashCode() {
                return -1947357971;
            }

            public String toString() {
                return "Status";
            }
        }

        public static final class d implements c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f32240b = new d();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32241c = "bav_type";

            private d() {
            }

            @Override // com.fourthline.orca.internal.q80.c, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32241c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof d);
            }

            public int hashCode() {
                return 1410297589;
            }

            public String toString() {
                return "Type";
            }
        }

        @Override // com.fourthline.orca.internal.q80
        default String a() {
            return "bav";
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ e f32244a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final p80 f32245b = new p80(true, true, false, null, 12, null);

        private e() {
        }

        public final p80 a() {
            return f32245b;
        }
    }

    public interface f extends q80 {

        public static final class a implements f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f32246b = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32247c = "contact_details";

            private a() {
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32247c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof a);
            }

            public int hashCode() {
                return 1192060039;
            }

            public String toString() {
                return "Details";
            }
        }
    }

    public interface g extends q80 {

        public static final class a implements g, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32248b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32249c;

            public a(p80 p80Var) {
                this.f32248b = p80Var;
                this.f32249c = "document_capture";
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32249c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && Intrinsics.f(this.f32248b, ((a) obj2).f32248b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32248b;
            }

            public int hashCode() {
                p80 p80Var = this.f32248b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "Scanner(config=" + this.f32248b + ")";
            }

            public /* synthetic */ a(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? q80.f32229a.a() : p80Var);
            }
        }
    }

    public interface h extends q80 {

        public static final class c implements h {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f32254b = new c();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32255c = "document_ready";

            private c() {
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32255c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof c);
            }

            public int hashCode() {
                return -659010923;
            }

            public String toString() {
                return "DocumentReady";
            }
        }

        public static final class a implements h, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32250b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32251c;

            public a(p80 p80Var) {
                this.f32250b = p80Var;
                this.f32251c = "document_details";
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32251c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && Intrinsics.f(this.f32250b, ((a) obj2).f32250b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32250b;
            }

            public int hashCode() {
                p80 p80Var = this.f32250b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "Details(config=" + this.f32250b + ")";
            }

            public /* synthetic */ a(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : p80Var);
            }
        }

        public static final class b implements h, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32252b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32253c;

            public b(p80 p80Var) {
                this.f32252b = p80Var;
                this.f32253c = "document_processing";
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32253c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f32252b, ((b) obj2).f32252b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32252b;
            }

            public int hashCode() {
                p80 p80Var = this.f32252b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "DocumentAnalysis(config=" + this.f32252b + ")";
            }

            public /* synthetic */ b(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : p80Var);
            }
        }

        public static final class d implements h, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32256b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32257c;

            public d(p80 p80Var) {
                this.f32256b = p80Var;
                this.f32257c = "document_capture";
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32257c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof d) && Intrinsics.f(this.f32256b, ((d) obj2).f32256b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32256b;
            }

            public int hashCode() {
                p80 p80Var = this.f32256b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "Scanner(config=" + this.f32256b + ")";
            }

            public /* synthetic */ d(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? q80.f32229a.a() : p80Var);
            }
        }

        public static final class e implements h, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32258b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32259c;

            public e(p80 p80Var) {
                this.f32258b = p80Var;
                this.f32259c = "document_upload";
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32259c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof e) && Intrinsics.f(this.f32258b, ((e) obj2).f32258b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32258b;
            }

            public int hashCode() {
                p80 p80Var = this.f32258b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "UploadData(config=" + this.f32258b + ")";
            }

            public /* synthetic */ e(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : p80Var);
            }
        }
    }

    public interface j extends q80 {

        public static final class c implements j {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f32272b = new c();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32273c = "eid_intro";

            private c() {
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32273c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof c);
            }

            public int hashCode() {
                return -1103090950;
            }

            public String toString() {
                return "Intro";
            }
        }

        public static final class d implements j {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f32274b = new d();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32275c = "eid_nfc_scanner";

            private d() {
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32275c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof d);
            }

            public int hashCode() {
                return 539638201;
            }

            public String toString() {
                return "Nfc";
            }
        }

        public static final class f implements j {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final f f32278b = new f();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32279c = "eid_processing";

            private f() {
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32279c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof f);
            }

            public int hashCode() {
                return 509074227;
            }

            public String toString() {
                return "Upload";
            }
        }

        public static final class a implements j, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32268b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32269c;

            public a(p80 p80Var) {
                this.f32268b = p80Var;
                this.f32269c = "eid_can";
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32269c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && Intrinsics.f(this.f32268b, ((a) obj2).f32268b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32268b;
            }

            public int hashCode() {
                p80 p80Var = this.f32268b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "CanNumber(config=" + this.f32268b + ")";
            }

            public /* synthetic */ a(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : p80Var);
            }
        }

        public static final class b implements j, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32270b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32271c;

            public b(p80 p80Var) {
                this.f32270b = p80Var;
                this.f32271c = "eid_verification_type";
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32271c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f32270b, ((b) obj2).f32270b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32270b;
            }

            public int hashCode() {
                p80 p80Var = this.f32270b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "FlowSelection(config=" + this.f32270b + ")";
            }

            public /* synthetic */ b(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : p80Var);
            }
        }

        public static final class e implements j, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32276b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32277c;

            public e(p80 p80Var) {
                this.f32276b = p80Var;
                this.f32277c = "eid_pin";
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32277c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof e) && Intrinsics.f(this.f32276b, ((e) obj2).f32276b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32276b;
            }

            public int hashCode() {
                p80 p80Var = this.f32276b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "Pin(config=" + this.f32276b + ")";
            }

            public /* synthetic */ e(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : p80Var);
            }
        }
    }

    public static final class l implements q80 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final kh0 f32282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f32283c;

        public l(kh0 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f32282b = error;
            this.f32283c = "finish_with_error";
        }

        @Override // com.fourthline.orca.internal.q80
        public /* bridge */ String a() {
            return super.a();
        }

        @Override // com.fourthline.orca.internal.q80
        public String b() {
            return this.f32283c;
        }

        @Override // com.fourthline.orca.internal.q80
        public /* bridge */ String c() {
            return super.c();
        }

        public final kh0 d() {
            return this.f32282b;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof l) && Intrinsics.f(this.f32282b, ((l) obj2).f32282b);
        }

        public int hashCode() {
            return this.f32282b.hashCode();
        }

        public String toString() {
            return "FINISH_WITH_ERROR(error=" + this.f32282b + ")";
        }
    }

    public static final class m implements q80 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final dj0 f32284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f32285c;

        public m(dj0 success) {
            Intrinsics.checkNotNullParameter(success, "success");
            this.f32284b = success;
            this.f32285c = "finish_with_success";
        }

        @Override // com.fourthline.orca.internal.q80
        public /* bridge */ String a() {
            return super.a();
        }

        @Override // com.fourthline.orca.internal.q80
        public String b() {
            return this.f32285c;
        }

        @Override // com.fourthline.orca.internal.q80
        public /* bridge */ String c() {
            return super.c();
        }

        public final dj0 d() {
            return this.f32284b;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof m) && Intrinsics.f(this.f32284b, ((m) obj2).f32284b);
        }

        public int hashCode() {
            return this.f32284b.hashCode();
        }

        public String toString() {
            return "FINISH_WITH_SUCCESS(success=" + this.f32284b + ")";
        }
    }

    public interface n extends q80 {

        public static final class a implements n {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f32286b = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32287c = "metadata";

            private a() {
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32287c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof a);
            }

            public int hashCode() {
                return -654334811;
            }

            public String toString() {
                return "Scanner";
            }
        }
    }

    public interface p extends q80 {

        public static final class a implements p, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32290b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32291c;

            public a(p80 p80Var) {
                this.f32290b = p80Var;
                this.f32291c = "nfc_scanner";
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32291c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && Intrinsics.f(this.f32290b, ((a) obj2).f32290b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32290b;
            }

            public int hashCode() {
                p80 p80Var = this.f32290b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "Scanner(config=" + this.f32290b + ")";
            }

            public /* synthetic */ a(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? q80.f32229a.a() : p80Var);
            }
        }
    }

    public interface q extends q80 {

        public static final class a implements q {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f32292b = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32293c = "document_can";

            private a() {
            }

            @Override // com.fourthline.orca.internal.q80.q, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32293c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof a);
            }

            public int hashCode() {
                return 1565962903;
            }

            public String toString() {
                return "NfcCanNumber";
            }
        }

        @Override // com.fourthline.orca.internal.q80
        default String a() {
            return "can";
        }

        public static final class b implements q, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32294b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32295c;

            public b(p80 p80Var) {
                this.f32294b = p80Var;
                this.f32295c = "nfc_intro";
            }

            @Override // com.fourthline.orca.internal.q80.q, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32295c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f32294b, ((b) obj2).f32294b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32294b;
            }

            public int hashCode() {
                p80 p80Var = this.f32294b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "NfcIntroduction(config=" + this.f32294b + ")";
            }

            public /* synthetic */ b(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : p80Var);
            }
        }

        public static final class c implements q, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32296b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32297c;

            public c(p80 p80Var) {
                this.f32296b = p80Var;
                this.f32297c = "nfc_scanner";
            }

            @Override // com.fourthline.orca.internal.q80.q, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32297c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof c) && Intrinsics.f(this.f32296b, ((c) obj2).f32296b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32296b;
            }

            public int hashCode() {
                p80 p80Var = this.f32296b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "NfcScanner(config=" + this.f32296b + ")";
            }

            public /* synthetic */ c(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? q80.f32229a.a() : p80Var);
            }
        }
    }

    public interface r extends q80 {

        public static final class a implements r, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32298b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32299c;

            public a(p80 p80Var) {
                this.f32298b = p80Var;
                this.f32299c = "nfc_intro";
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32299c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && Intrinsics.f(this.f32298b, ((a) obj2).f32298b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32298b;
            }

            public int hashCode() {
                p80 p80Var = this.f32298b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "NfcIntroduction(config=" + this.f32298b + ")";
            }

            public /* synthetic */ a(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : p80Var);
            }
        }

        public static final class b implements r, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32300b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32301c;

            public b(p80 p80Var) {
                this.f32300b = p80Var;
                this.f32301c = "nfc_scanner";
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32301c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f32300b, ((b) obj2).f32300b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32300b;
            }

            public int hashCode() {
                p80 p80Var = this.f32300b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "NfcScanner(config=" + this.f32300b + ")";
            }

            public /* synthetic */ b(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? q80.f32229a.a() : p80Var);
            }
        }

        public static final class c implements r, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32302b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32303c;

            public c(p80 p80Var) {
                this.f32302b = p80Var;
                this.f32303c = "document_upload";
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32303c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof c) && Intrinsics.f(this.f32302b, ((c) obj2).f32302b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32302b;
            }

            public int hashCode() {
                p80 p80Var = this.f32302b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "UploadData(config=" + this.f32302b + ")";
            }

            public /* synthetic */ c(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : p80Var);
            }
        }
    }

    public interface s extends q80 {

        public static final class b implements s {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f32306b = new b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32307c = "personal_details";

            private b() {
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32307c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof b);
            }

            public int hashCode() {
                return -1126399063;
            }

            public String toString() {
                return "PersonalDetails";
            }
        }

        public static final class a implements s, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32304b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32305c;

            public a(p80 p80Var) {
                this.f32304b = p80Var;
                this.f32305c = "nationality";
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32305c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && Intrinsics.f(this.f32304b, ((a) obj2).f32304b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32304b;
            }

            public int hashCode() {
                p80 p80Var = this.f32304b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "Nationality(config=" + this.f32304b + ")";
            }

            public /* synthetic */ a(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : p80Var);
            }
        }
    }

    public interface t extends q80 {

        public static final class a implements t {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f32308b = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32309c = "poa_type";

            private a() {
            }

            @Override // com.fourthline.orca.internal.q80.t, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32309c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof a);
            }

            public int hashCode() {
                return -961608443;
            }

            public String toString() {
                return "DocumentType";
            }
        }

        public static final class b implements t {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f32310b = new b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32311c = "poa_intro";

            private b() {
            }

            @Override // com.fourthline.orca.internal.q80.t, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32311c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof b);
            }

            public int hashCode() {
                return 2051182122;
            }

            public String toString() {
                return "Introduction";
            }
        }

        @Override // com.fourthline.orca.internal.q80
        default String a() {
            return "poa";
        }

        public static final class c implements t, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32312b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32313c;

            public c(p80 p80Var) {
                this.f32312b = p80Var;
                this.f32313c = "poa_capture_result";
            }

            @Override // com.fourthline.orca.internal.q80.t, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32313c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof c) && Intrinsics.f(this.f32312b, ((c) obj2).f32312b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32312b;
            }

            public int hashCode() {
                p80 p80Var = this.f32312b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "PickerConfirmation(config=" + this.f32312b + ")";
            }

            public /* synthetic */ c(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? q80.f32229a.a() : p80Var);
            }
        }

        public static final class d implements t, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32314b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32315c;

            public d(p80 p80Var) {
                this.f32314b = p80Var;
                this.f32315c = "poa_capture";
            }

            @Override // com.fourthline.orca.internal.q80.t, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32315c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof d) && Intrinsics.f(this.f32314b, ((d) obj2).f32314b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32314b;
            }

            public int hashCode() {
                p80 p80Var = this.f32314b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "Scanner(config=" + this.f32314b + ")";
            }

            public /* synthetic */ d(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? q80.f32229a.a() : p80Var);
            }
        }

        public static final class e implements t, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32316b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32317c;

            public e(p80 p80Var) {
                this.f32316b = p80Var;
                this.f32317c = "poa_upload";
            }

            @Override // com.fourthline.orca.internal.q80.t, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32317c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof e) && Intrinsics.f(this.f32316b, ((e) obj2).f32316b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32316b;
            }

            public int hashCode() {
                p80 p80Var = this.f32316b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "UploadData(config=" + this.f32316b + ")";
            }

            public /* synthetic */ e(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : p80Var);
            }
        }
    }

    public interface u extends q80 {

        public static final class b implements u {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f32320b = new b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32321c = "qes_intro";

            private b() {
            }

            @Override // com.fourthline.orca.internal.q80.u, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32321c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof b);
            }

            public int hashCode() {
                return 30804955;
            }

            public String toString() {
                return "FlowIntroduction";
            }
        }

        public static final class c implements u {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f32322b = new c();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32323c = "metadata";

            private c() {
            }

            @Override // com.fourthline.orca.internal.q80.u, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32323c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof c);
            }

            public int hashCode() {
                return 1781619382;
            }

            public String toString() {
                return "LocationScanner";
            }
        }

        public static final class d implements u {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f32324b = new d();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32325c = "qes_document_viewer";

            private d() {
            }

            @Override // com.fourthline.orca.internal.q80.u, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32325c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof d);
            }

            public int hashCode() {
                return -396495742;
            }

            public String toString() {
                return "PdfRenderer";
            }
        }

        public static final class e implements u {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f32326b = new e();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32327c = "selfie_intro";

            private e() {
            }

            @Override // com.fourthline.orca.internal.q80.u, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32327c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof e);
            }

            public int hashCode() {
                return -236868523;
            }

            public String toString() {
                return "SelfieIntroduction";
            }
        }

        public static final class g implements u {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final g f32330b = new g();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32331c = "qes_sign";

            private g() {
            }

            @Override // com.fourthline.orca.internal.q80.u, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32331c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof g);
            }

            public int hashCode() {
                return 1043195312;
            }

            public String toString() {
                return "Sign";
            }
        }

        @Override // com.fourthline.orca.internal.q80
        default String a() {
            return "qes";
        }

        public static final class a implements u, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32318b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32319c;

            public a(p80 p80Var) {
                this.f32318b = p80Var;
                this.f32319c = "qes_agree";
            }

            @Override // com.fourthline.orca.internal.q80.u, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32319c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && Intrinsics.f(this.f32318b, ((a) obj2).f32318b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32318b;
            }

            public int hashCode() {
                p80 p80Var = this.f32318b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "Agreements(config=" + this.f32318b + ")";
            }

            public /* synthetic */ a(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : p80Var);
            }
        }

        public static final class f implements u, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32328b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32329c;

            public f(p80 p80Var) {
                this.f32328b = p80Var;
                this.f32329c = "selfie_capture";
            }

            @Override // com.fourthline.orca.internal.q80.u, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32329c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof f) && Intrinsics.f(this.f32328b, ((f) obj2).f32328b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32328b;
            }

            public int hashCode() {
                p80 p80Var = this.f32328b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "SelfieScanner(config=" + this.f32328b + ")";
            }

            public /* synthetic */ f(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? q80.f32229a.a() : p80Var);
            }
        }
    }

    public interface v extends q80 {

        public static final class a implements v, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32332b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32333c;

            public a(p80 p80Var) {
                this.f32332b = p80Var;
                this.f32333c = "selfie_capture";
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32333c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && Intrinsics.f(this.f32332b, ((a) obj2).f32332b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32332b;
            }

            public int hashCode() {
                p80 p80Var = this.f32332b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "Scanner(config=" + this.f32332b + ")";
            }

            public /* synthetic */ a(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? q80.f32229a.a() : p80Var);
            }
        }
    }

    public interface w extends q80 {

        public static final class a implements w {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f32334b = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32335c = "selfie_intro";

            private a() {
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32335c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof a);
            }

            public int hashCode() {
                return -1149302784;
            }

            public String toString() {
                return "Introduction";
            }
        }

        public static final class b implements w, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32336b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32337c;

            public b(p80 p80Var) {
                this.f32336b = p80Var;
                this.f32337c = "selfie_capture";
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32337c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f32336b, ((b) obj2).f32336b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32336b;
            }

            public int hashCode() {
                p80 p80Var = this.f32336b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "Scanner(config=" + this.f32336b + ")";
            }

            public /* synthetic */ b(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? q80.f32229a.a() : p80Var);
            }
        }

        public static final class c implements w, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32338b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32339c;

            public c(p80 p80Var) {
                this.f32338b = p80Var;
                this.f32339c = "selfie_upload";
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32339c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof c) && Intrinsics.f(this.f32338b, ((c) obj2).f32338b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32338b;
            }

            public int hashCode() {
                p80 p80Var = this.f32338b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "UploadData(config=" + this.f32338b + ")";
            }

            public /* synthetic */ c(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : p80Var);
            }
        }
    }

    public interface x extends q80 {

        public static final class b implements x {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f32342b = new b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32343c = "tin_intro";

            private b() {
            }

            @Override // com.fourthline.orca.internal.q80.x, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32343c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof b);
            }

            public int hashCode() {
                return -730833773;
            }

            public String toString() {
                return "Introduction";
            }
        }

        @Override // com.fourthline.orca.internal.q80
        default String a() {
            return "tin";
        }

        public static final class a implements x, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32340b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32341c;

            public a(p80 p80Var) {
                this.f32340b = p80Var;
                this.f32341c = "tin_details";
            }

            @Override // com.fourthline.orca.internal.q80.x, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32341c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && Intrinsics.f(this.f32340b, ((a) obj2).f32340b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32340b;
            }

            public int hashCode() {
                p80 p80Var = this.f32340b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "Details(config=" + this.f32340b + ")";
            }

            public /* synthetic */ a(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : p80Var);
            }
        }

        public static final class c implements x, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32344b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32345c;

            public c(p80 p80Var) {
                this.f32344b = p80Var;
                this.f32345c = "tin_capture";
            }

            @Override // com.fourthline.orca.internal.q80.x, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32345c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof c) && Intrinsics.f(this.f32344b, ((c) obj2).f32344b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32344b;
            }

            public int hashCode() {
                p80 p80Var = this.f32344b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "Scanner(config=" + this.f32344b + ")";
            }

            public /* synthetic */ c(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? q80.f32229a.a() : p80Var);
            }
        }

        public static final class d implements x, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32346b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32347c;

            public d(p80 p80Var) {
                this.f32346b = p80Var;
                this.f32347c = "tin_upload";
            }

            @Override // com.fourthline.orca.internal.q80.x, com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32347c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof d) && Intrinsics.f(this.f32346b, ((d) obj2).f32346b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32346b;
            }

            public int hashCode() {
                p80 p80Var = this.f32346b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "UploadData(config=" + this.f32346b + ")";
            }

            public /* synthetic */ d(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : p80Var);
            }
        }
    }

    public interface y extends q80 {

        public static final class a implements y {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f32348b = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32349c = "workflow_uploading";

            private a() {
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32349c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof a);
            }

            public int hashCode() {
                return -2116454215;
            }

            public String toString() {
                return "Upload";
            }
        }
    }

    public interface z extends q80 {

        public static final class a implements z {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f32350b = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32351c = "workflow_loading";

            private a() {
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32351c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof a);
            }

            public int hashCode() {
                return 726770207;
            }

            public String toString() {
                return "Loading";
            }
        }
    }

    default String a() {
        return "";
    }

    String b();

    default String c() {
        return a() + "." + b();
    }

    public static final class b implements q80, cb {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p80 f32232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f32233c;

        public b(p80 p80Var) {
            this.f32232b = p80Var;
            this.f32233c = "back";
        }

        @Override // com.fourthline.orca.internal.q80
        public /* bridge */ String a() {
            return super.a();
        }

        @Override // com.fourthline.orca.internal.q80
        public String b() {
            return this.f32233c;
        }

        @Override // com.fourthline.orca.internal.q80
        public /* bridge */ String c() {
            return super.c();
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f32232b, ((b) obj2).f32232b);
        }

        @Override // com.fourthline.orca.internal.cb
        public p80 getConfig() {
            return this.f32232b;
        }

        public int hashCode() {
            p80 p80Var = this.f32232b;
            if (p80Var == null) {
                return 0;
            }
            return p80Var.hashCode();
        }

        public String toString() {
            return "BACK(config=" + this.f32232b + ")";
        }

        public /* synthetic */ b(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : p80Var);
        }
    }

    public interface i extends q80 {

        public static final class b implements i {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f32262b = new b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32263c = "document_intro";

            private b() {
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32263c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof b);
            }

            public int hashCode() {
                return -682114565;
            }

            public String toString() {
                return "Introduction";
            }
        }

        public static final class d implements i {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f32266b = new d();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f32267c = "document_version";

            private d() {
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return f32267c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof d);
            }

            public int hashCode() {
                return -550679977;
            }

            public String toString() {
                return "Version";
            }
        }

        public static final class a implements i, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32260b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32261c;

            public a(p80 p80Var) {
                this.f32260b = p80Var;
                this.f32261c = "document_country";
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32261c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && Intrinsics.f(this.f32260b, ((a) obj2).f32260b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32260b;
            }

            public int hashCode() {
                p80 p80Var = this.f32260b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "Country(config=" + this.f32260b + ")";
            }

            public /* synthetic */ a(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : p80Var);
            }
        }

        public static final class c implements i, cb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p80 f32264b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f32265c;

            public c(p80 p80Var) {
                this.f32264b = p80Var;
                this.f32265c = "document_type";
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String a() {
                return super.a();
            }

            @Override // com.fourthline.orca.internal.q80
            public String b() {
                return this.f32265c;
            }

            @Override // com.fourthline.orca.internal.q80
            public /* bridge */ String c() {
                return super.c();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof c) && Intrinsics.f(this.f32264b, ((c) obj2).f32264b);
            }

            @Override // com.fourthline.orca.internal.cb
            public p80 getConfig() {
                return this.f32264b;
            }

            public int hashCode() {
                p80 p80Var = this.f32264b;
                if (p80Var == null) {
                    return 0;
                }
                return p80Var.hashCode();
            }

            public String toString() {
                return "Type(config=" + this.f32264b + ")";
            }

            public /* synthetic */ c(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : p80Var);
            }
        }
    }

    public static final class o implements q80, cb {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p80 f32288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f32289c;

        public o(p80 p80Var) {
            this.f32288b = p80Var;
            this.f32289c = "none";
        }

        @Override // com.fourthline.orca.internal.q80
        public /* bridge */ String a() {
            return super.a();
        }

        @Override // com.fourthline.orca.internal.q80
        public String b() {
            return this.f32289c;
        }

        @Override // com.fourthline.orca.internal.q80
        public /* bridge */ String c() {
            return super.c();
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof o) && Intrinsics.f(this.f32288b, ((o) obj2).f32288b);
        }

        @Override // com.fourthline.orca.internal.cb
        public p80 getConfig() {
            return this.f32288b;
        }

        public int hashCode() {
            p80 p80Var = this.f32288b;
            if (p80Var == null) {
                return 0;
            }
            return p80Var.hashCode();
        }

        public String toString() {
            return "NONE(config=" + this.f32288b + ")";
        }

        public /* synthetic */ o(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : p80Var);
        }
    }

    public static final class d implements q80, cb {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p80 f32242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f32243c;

        public d(p80 p80Var) {
            this.f32242b = p80Var;
            this.f32243c = "cancel_flow";
        }

        @Override // com.fourthline.orca.internal.q80
        public /* bridge */ String a() {
            return super.a();
        }

        @Override // com.fourthline.orca.internal.q80
        public String b() {
            return this.f32243c;
        }

        @Override // com.fourthline.orca.internal.q80
        public /* bridge */ String c() {
            return super.c();
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && Intrinsics.f(this.f32242b, ((d) obj2).f32242b);
        }

        @Override // com.fourthline.orca.internal.cb
        public p80 getConfig() {
            return this.f32242b;
        }

        public int hashCode() {
            p80 p80Var = this.f32242b;
            if (p80Var == null) {
                return 0;
            }
            return p80Var.hashCode();
        }

        public String toString() {
            return "CANCEL_FLOW(config=" + this.f32242b + ")";
        }

        public /* synthetic */ d(p80 p80Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : p80Var);
        }
    }

    public static final class k implements q80, cb {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p80 f32280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ny f32281c;
        private final String d;

        public k(p80 p80Var, ny nyVar) {
            this.f32280b = p80Var;
            this.f32281c = nyVar;
            this.d = "finish_flow";
        }

        @Override // com.fourthline.orca.internal.q80
        public /* bridge */ String a() {
            return super.a();
        }

        @Override // com.fourthline.orca.internal.q80
        public String b() {
            return this.d;
        }

        @Override // com.fourthline.orca.internal.q80
        public /* bridge */ String c() {
            return super.c();
        }

        public final ny d() {
            return this.f32281c;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof k)) {
                return false;
            }
            k kVar = (k) obj2;
            return Intrinsics.f(this.f32280b, kVar.f32280b) && Intrinsics.f(this.f32281c, kVar.f32281c);
        }

        @Override // com.fourthline.orca.internal.cb
        public p80 getConfig() {
            return this.f32280b;
        }

        public int hashCode() {
            p80 p80Var = this.f32280b;
            int iHashCode = (p80Var == null ? 0 : p80Var.hashCode()) * 31;
            ny nyVar = this.f32281c;
            return iHashCode + (nyVar != null ? nyVar.hashCode() : 0);
        }

        public String toString() {
            return "FINISH_FLOW(config=" + this.f32280b + ", target=" + this.f32281c + ")";
        }

        public /* synthetic */ k(p80 p80Var, ny nyVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : p80Var, (i & 2) != 0 ? null : nyVar);
        }
    }
}
