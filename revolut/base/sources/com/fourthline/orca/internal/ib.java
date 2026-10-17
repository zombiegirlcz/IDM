package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface ib extends he1 {

    public static final class a implements ib {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29548a = new a();

        private a() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return -242866250;
        }

        public String toString() {
            return "ClearFocus";
        }
    }

    public static final class b implements ib {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29549a = new b();

        private b() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return 314590644;
        }

        public String toString() {
            return "HideKeyboard";
        }
    }

    public interface c extends ib, nc {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f29550a = new a();

            private a() {
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ac f29551a;

            public b(ac flowAction) {
                Intrinsics.checkNotNullParameter(flowAction, "flowAction");
                this.f29551a = flowAction;
            }

            public final ac c() {
                return this.f29551a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f29551a, ((b) obj2).f29551a);
            }

            public int hashCode() {
                return this.f29551a.hashCode();
            }

            public String toString() {
                return "Forward(flowAction=" + this.f29551a + ")";
            }
        }
    }
}
