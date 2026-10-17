package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface y60 extends he1 {

    public interface a extends y60, ee1 {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.y60$a$a, reason: collision with other inner class name */
        public static final class C0315a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0315a f35173a = new C0315a();

            private C0315a() {
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final c60 f35174a;

            public b(c60 flowAction) {
                Intrinsics.checkNotNullParameter(flowAction, "flowAction");
                this.f35174a = flowAction;
            }

            public final c60 c() {
                return this.f35174a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f35174a, ((b) obj2).f35174a);
            }

            public int hashCode() {
                return this.f35174a.hashCode();
            }

            public String toString() {
                return "Forward(flowAction=" + this.f35174a + ")";
            }
        }
    }

    public static final class b implements y60 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f35175a = new b();

        private b() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return -233572221;
        }

        public String toString() {
            return "OpenLocationServicesSettings";
        }
    }

    public static final class c implements y60 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f35176a = new c();

        private c() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof c);
        }

        public int hashCode() {
            return -691658529;
        }

        public String toString() {
            return "OpenPermissionSettings";
        }
    }
}
