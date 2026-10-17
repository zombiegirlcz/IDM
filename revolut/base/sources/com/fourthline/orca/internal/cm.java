package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface cm extends be1 {

    public static final class a implements cm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27504a = new a();

        private a() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return -1862877968;
        }

        public String toString() {
            return "OnBackButtonClicked";
        }
    }

    public static final class b implements cm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27505a = new b();

        private b() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return 427782709;
        }

        public String toString() {
            return "OnDoneButtonClicked";
        }
    }

    public static final class c implements cm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dm f27506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f27507b;

        public c(dm type, boolean z) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f27506a = type;
            this.f27507b = z;
        }

        public final boolean a() {
            return this.f27507b;
        }

        public final dm b() {
            return this.f27506a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return this.f27506a == cVar.f27506a && this.f27507b == cVar.f27507b;
        }

        public int hashCode() {
            return (this.f27506a.hashCode() * 31) + Boolean.hashCode(this.f27507b);
        }

        public String toString() {
            return "OnFocusChangedEvent(type=" + this.f27506a + ", focused=" + this.f27507b + ")";
        }
    }

    public static final class d implements cm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27508a;

        public d(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f27508a = input;
        }

        public final String a() {
            return this.f27508a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && Intrinsics.f(this.f27508a, ((d) obj2).f27508a);
        }

        public int hashCode() {
            return this.f27508a.hashCode();
        }

        public String toString() {
            return "OnInputChanged(input=" + this.f27508a + ")";
        }
    }

    public static final class e implements cm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f27509a = new e();

        private e() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof e);
        }

        public int hashCode() {
            return -482616053;
        }

        public String toString() {
            return "OnInputFocused";
        }
    }

    public static final class f implements cm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f27510a = new f();

        private f() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof f);
        }

        public int hashCode() {
            return -545928366;
        }

        public String toString() {
            return "OnInputUnfocused";
        }
    }

    public static final class g implements cm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a01 f27511a;

        public g(a01 item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f27511a = item;
        }

        public final a01 a() {
            return this.f27511a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof g) && Intrinsics.f(this.f27511a, ((g) obj2).f27511a);
        }

        public int hashCode() {
            return this.f27511a.hashCode();
        }

        public String toString() {
            return "OnItemSelected(item=" + this.f27511a + ")";
        }
    }

    public static final class h implements cm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f27512a = new h();

        private h() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof h);
        }

        public int hashCode() {
            return 788556388;
        }

        public String toString() {
            return "OnNextButtonClicked";
        }
    }

    public static final class i implements cm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f27513a = new i();

        private i() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof i);
        }

        public int hashCode() {
            return 613130119;
        }

        public String toString() {
            return "OnScreenShown";
        }
    }

    public static final class j implements cm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dm f27514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27515b;

        public j(dm type, String value) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f27514a = type;
            this.f27515b = value;
        }

        public final dm a() {
            return this.f27514a;
        }

        public final String b() {
            return this.f27515b;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof j)) {
                return false;
            }
            j jVar = (j) obj2;
            return this.f27514a == jVar.f27514a && Intrinsics.f(this.f27515b, jVar.f27515b);
        }

        public int hashCode() {
            return (this.f27514a.hashCode() * 31) + this.f27515b.hashCode();
        }

        public String toString() {
            return "OnValueChangedEvent(type=" + this.f27514a + ", value=" + this.f27515b + ")";
        }
    }
}
