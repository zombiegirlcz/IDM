package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface pw0 extends be1 {

    public static final class a implements pw0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f32064a;

        public a(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f32064a = input;
        }

        public final String a() {
            return this.f32064a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f32064a, ((a) obj2).f32064a);
        }

        public int hashCode() {
            return this.f32064a.hashCode();
        }

        public String toString() {
            return "OnInputChanged(input=" + this.f32064a + ")";
        }
    }

    public static final class b implements pw0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32065a = new b();

        private b() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return -398968798;
        }

        public String toString() {
            return "OnInputFocused";
        }
    }

    public static final class c implements pw0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f32066a = new c();

        private c() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof c);
        }

        public int hashCode() {
            return -1765294935;
        }

        public String toString() {
            return "OnInputUnfocused";
        }
    }

    public static final class d implements pw0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f32067a = new d();

        private d() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof d);
        }

        public int hashCode() {
            return -982411128;
        }

        public String toString() {
            return "OnPrimaryButtonClicked";
        }
    }

    public static final class e implements pw0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f32068a = new e();

        private e() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof e);
        }

        public int hashCode() {
            return -1046739568;
        }

        public String toString() {
            return "OnScreenShown";
        }
    }

    public static final class f implements pw0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f32069a = new f();

        private f() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof f);
        }

        public int hashCode() {
            return -1364034282;
        }

        public String toString() {
            return "OnSecondaryButtonClicked";
        }
    }

    public static final class g implements pw0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f32070a = new g();

        private g() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof g);
        }

        public int hashCode() {
            return 1399780434;
        }

        public String toString() {
            return "OnSendAgainButtonClicked";
        }
    }
}
