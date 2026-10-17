package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface ow0 extends he1 {

    public static final class a implements ow0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31777a = new a();

        private a() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return 554606598;
        }

        public String toString() {
            return "ClearFocus";
        }
    }

    public static final class b implements ow0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f31778a = new b();

        private b() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return -2113148412;
        }

        public String toString() {
            return "HideKeyboard";
        }
    }

    public interface c extends ow0, ee1 {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f31779a = new a();

            private a() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof a);
            }

            public int hashCode() {
                return -936945784;
            }

            public String toString() {
                return "Agreements";
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f31780a = new b();

            private b() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof b);
            }

            public int hashCode() {
                return -2100836679;
            }

            public String toString() {
                return "Close";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ow0$c$c, reason: collision with other inner class name */
        public static final class C0259c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final gt0 f31781a;

            public C0259c(gt0 flowAction) {
                Intrinsics.checkNotNullParameter(flowAction, "flowAction");
                this.f31781a = flowAction;
            }

            public final gt0 c() {
                return this.f31781a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0259c) && Intrinsics.f(this.f31781a, ((C0259c) obj2).f31781a);
            }

            public int hashCode() {
                return this.f31781a.hashCode();
            }

            public String toString() {
                return "Forward(flowAction=" + this.f31781a + ")";
            }
        }
    }

    public static final class d implements ow0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f31782a = new d();

        private d() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof d);
        }

        public int hashCode() {
            return 767622335;
        }

        public String toString() {
            return "ShowKeyboard";
        }
    }
}
