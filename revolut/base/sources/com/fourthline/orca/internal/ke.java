package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public interface ke {

    public interface a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ke$a$a, reason: collision with other inner class name */
        public static final class C0235a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0235a f30244a = new C0235a();

            private C0235a() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof C0235a);
            }

            public int hashCode() {
                return 2002997084;
            }

            public String toString() {
                return "Active";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f30245a;

            public b(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.f30245a = error;
            }

            public final Throwable a() {
                return this.f30245a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f30245a, ((b) obj2).f30245a);
            }

            public int hashCode() {
                return this.f30245a.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.f30245a + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f30246a = new c();

            private c() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof c);
            }

            public int hashCode() {
                return -1817716279;
            }

            public String toString() {
                return "Queued";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f30247a;

            public d(Object result) {
                Intrinsics.checkNotNullParameter(result, "result");
                this.f30247a = result;
            }

            public final Object a() {
                return this.f30247a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof d) && Intrinsics.f(this.f30247a, ((d) obj2).f30247a);
            }

            public int hashCode() {
                return this.f30247a.hashCode();
            }

            public String toString() {
                return "Success(result=" + this.f30247a + ")";
            }
        }
    }

    Flow a(String str);

    void a(le leVar);
}
