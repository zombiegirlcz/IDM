package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface o3 extends be1 {

    public static final class a implements o3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31551a = new a();

        private a() {
        }
    }

    public static final class b implements o3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f31552a;

        public b(boolean z) {
            this.f31552a = z;
        }

        public final boolean a() {
            return this.f31552a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && this.f31552a == ((b) obj2).f31552a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f31552a);
        }

        public String toString() {
            return "OnFocusChanged(isFocused=" + this.f31552a + ")";
        }
    }

    public static final class c implements o3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f31553a = new c();

        private c() {
        }
    }

    public static final class d implements o3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f31554a = new d();

        private d() {
        }
    }

    public static final class e implements o3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f31555a = new e();

        private e() {
        }
    }

    public static final class f implements o3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f31556a;

        public f(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f31556a = input;
        }

        public final String a() {
            return this.f31556a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof f) && Intrinsics.f(this.f31556a, ((f) obj2).f31556a);
        }

        public int hashCode() {
            return this.f31556a.hashCode();
        }

        public String toString() {
            return "OnValueChanged(input=" + this.f31556a + ")";
        }
    }
}
