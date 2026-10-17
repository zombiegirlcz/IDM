package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface bf0 extends he1 {

    public static final class a implements bf0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27106a = new a();

        private a() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return 727954105;
        }

        public String toString() {
            return "DisableScanner";
        }
    }

    public static final class b implements bf0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27107a = new b();

        private b() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return 1971633624;
        }

        public String toString() {
            return "EnableScanner";
        }
    }

    public interface c extends bf0, ee1 {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f27108a = new a();

            private a() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof a);
            }

            public int hashCode() {
                return 1373147198;
            }

            public String toString() {
                return "Back";
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ld0 f27109a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ad0 f27110b;

            public b(ld0 flowAction, ad0 result) {
                Intrinsics.checkNotNullParameter(flowAction, "flowAction");
                Intrinsics.checkNotNullParameter(result, "result");
                this.f27109a = flowAction;
                this.f27110b = result;
            }

            public final ld0 c() {
                return this.f27109a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.f27109a, bVar.f27109a) && Intrinsics.f(this.f27110b, bVar.f27110b);
            }

            public int hashCode() {
                return (this.f27109a.hashCode() * 31) + this.f27110b.hashCode();
            }

            public String toString() {
                return "Forward(flowAction=" + this.f27109a + ", result=" + this.f27110b + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.bf0$c$c, reason: collision with other inner class name */
        public static final class C0170c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ld0 f27111a;

            public C0170c(ld0 flowAction) {
                Intrinsics.checkNotNullParameter(flowAction, "flowAction");
                this.f27111a = flowAction;
            }

            public final ld0 c() {
                return this.f27111a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0170c) && Intrinsics.f(this.f27111a, ((C0170c) obj2).f27111a);
            }

            public int hashCode() {
                return this.f27111a.hashCode();
            }

            public String toString() {
                return "Skip(flowAction=" + this.f27111a + ")";
            }
        }

        public static final class d implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final kf0 f27112a;

            public d(kf0 kf0Var) {
                this.f27112a = kf0Var;
            }

            public final kf0 c() {
                return this.f27112a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof d) && Intrinsics.f(this.f27112a, ((d) obj2).f27112a);
            }

            public int hashCode() {
                kf0 kf0Var = this.f27112a;
                if (kf0Var == null) {
                    return 0;
                }
                return kf0Var.hashCode();
            }

            public String toString() {
                return "WrongKey(key=" + this.f27112a + ")";
            }
        }
    }

    public static final class d implements bf0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f27113a = new d();

        private d() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof d);
        }

        public int hashCode() {
            return 784654546;
        }

        public String toString() {
            return "OpenNfcSetting";
        }
    }

    public static final class e implements bf0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f27114a = new e();

        private e() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof e);
        }

        public int hashCode() {
            return -621404660;
        }

        public String toString() {
            return "Vibrate";
        }
    }
}
