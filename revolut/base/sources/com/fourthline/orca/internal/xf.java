package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface xf extends he1, ee1 {

    public static final class a implements xf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34969a = new a();

        private a() {
        }
    }

    public static final class b implements xf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final er f34970a;

        public b(er error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f34970a = error;
        }

        public final er c() {
            return this.f34970a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f34970a, ((b) obj2).f34970a);
        }

        public int hashCode() {
            return this.f34970a.hashCode();
        }

        public String toString() {
            return "Country(error=" + this.f34970a + ")";
        }
    }

    public static final class c implements xf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final er f34971a;

        public c(er error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f34971a = error;
        }

        public final er c() {
            return this.f34971a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.f34971a, ((c) obj2).f34971a);
        }

        public int hashCode() {
            return this.f34971a.hashCode();
        }

        public String toString() {
            return "FinishWithError(error=" + this.f34971a + ")";
        }
    }

    public static final class d implements xf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ky f34972a;

        public d(ky flowAction) {
            Intrinsics.checkNotNullParameter(flowAction, "flowAction");
            this.f34972a = flowAction;
        }

        public final ky c() {
            return this.f34972a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && Intrinsics.f(this.f34972a, ((d) obj2).f34972a);
        }

        public int hashCode() {
            return this.f34972a.hashCode();
        }

        public String toString() {
            return "FinishWithSuccess(flowAction=" + this.f34972a + ")";
        }
    }

    public static final class e implements xf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final er f34973a;

        public e(er error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f34973a = error;
        }

        public final er c() {
            return this.f34973a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof e) && Intrinsics.f(this.f34973a, ((e) obj2).f34973a);
        }

        public int hashCode() {
            return this.f34973a.hashCode();
        }

        public String toString() {
            return "Type(error=" + this.f34973a + ")";
        }
    }
}
