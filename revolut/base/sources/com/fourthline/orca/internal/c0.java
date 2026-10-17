package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface c0 extends he1 {

    public static final class a implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27296a = new a();

        private a() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return -344314014;
        }

        public String toString() {
            return "ClearFocus";
        }
    }

    public static final class b implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27297a = new b();

        private b() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return 1607537248;
        }

        public String toString() {
            return "HideKeyboard";
        }
    }

    public interface c extends c0, a1 {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f27298a = new a();

            private a() {
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final l0 f27299a;

            public b(l0 flowAction) {
                Intrinsics.checkNotNullParameter(flowAction, "flowAction");
                this.f27299a = flowAction;
            }

            public final l0 c() {
                return this.f27299a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f27299a, ((b) obj2).f27299a);
            }

            public int hashCode() {
                return this.f27299a.hashCode();
            }

            public String toString() {
                return "Forward(flowAction=" + this.f27299a + ")";
            }
        }
    }

    public static final class d implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f27300a = new d();

        private d() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof d);
        }

        public int hashCode() {
            return 193340699;
        }

        public String toString() {
            return "ShowKeyboard";
        }
    }
}
