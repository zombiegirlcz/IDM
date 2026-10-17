package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface yp0 {

    public static final class a implements yp0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35407a = new a();

        private a() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return -47437681;
        }

        public String toString() {
            return "Cancelled";
        }
    }

    public static final class b implements yp0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f35408a;

        public b(int i) {
            this.f35408a = i;
        }

        public final int a() {
            return this.f35408a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && this.f35408a == ((b) obj2).f35408a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f35408a);
        }

        public String toString() {
            return "OnMenuItemClicked(index=" + this.f35408a + ")";
        }
    }

    public static final class c implements yp0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final kd1 f35409a;

        public c(kd1 intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.f35409a = intent;
        }

        public final kd1 a() {
            return this.f35409a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.f35409a, ((c) obj2).f35409a);
        }

        public int hashCode() {
            return this.f35409a.hashCode();
        }

        public String toString() {
            return "OnPrimaryClicked(intent=" + this.f35409a + ")";
        }
    }

    public static final class d implements yp0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final kd1 f35410a;

        public d(kd1 intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.f35410a = intent;
        }

        public final kd1 a() {
            return this.f35410a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && Intrinsics.f(this.f35410a, ((d) obj2).f35410a);
        }

        public int hashCode() {
            return this.f35410a.hashCode();
        }

        public String toString() {
            return "OnSecondaryClicked(intent=" + this.f35410a + ")";
        }
    }

    public static final class e implements yp0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f35411a = new e();

        private e() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof e);
        }

        public int hashCode() {
            return 186832769;
        }

        public String toString() {
            return "Skip";
        }
    }
}
