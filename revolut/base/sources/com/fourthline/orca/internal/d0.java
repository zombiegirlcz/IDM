package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface d0 extends be1 {

    public static final class a implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27598a = new a();

        private a() {
        }
    }

    public static final class b implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27599a = new b();

        private b() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return -196615974;
        }

        public String toString() {
            return "OnDoneButtonClicked";
        }
    }

    public static final class c implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b0 f27600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f27601b;

        public c(b0 type, boolean z) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f27600a = type;
            this.f27601b = z;
        }

        public final b0 a() {
            return this.f27600a;
        }

        public final boolean b() {
            return this.f27601b;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return this.f27600a == cVar.f27600a && this.f27601b == cVar.f27601b;
        }

        public int hashCode() {
            return (this.f27600a.hashCode() * 31) + Boolean.hashCode(this.f27601b);
        }

        public String toString() {
            return "OnFocusChangedEvent(type=" + this.f27600a + ", isFocused=" + this.f27601b + ")";
        }
    }

    public static final class d implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27602a;

        public d(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f27602a = input;
        }

        public final String a() {
            return this.f27602a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && Intrinsics.f(this.f27602a, ((d) obj2).f27602a);
        }

        public int hashCode() {
            return this.f27602a.hashCode();
        }

        public String toString() {
            return "OnInputChanged(input=" + this.f27602a + ")";
        }
    }

    public static final class e implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f27603a = new e();

        private e() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof e);
        }

        public int hashCode() {
            return -1021830330;
        }

        public String toString() {
            return "OnInputFocused";
        }
    }

    public static final class f implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f27604a = new f();

        private f() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof f);
        }

        public int hashCode() {
            return 960194253;
        }

        public String toString() {
            return "OnInputUnfocused";
        }
    }

    public static final class g implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a01 f27605a;

        public g(a01 item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f27605a = item;
        }

        public final a01 a() {
            return this.f27605a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof g) && Intrinsics.f(this.f27605a, ((g) obj2).f27605a);
        }

        public int hashCode() {
            return this.f27605a.hashCode();
        }

        public String toString() {
            return "OnItemSelected(item=" + this.f27605a + ")";
        }
    }

    public static final class h implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f27606a = new h();

        private h() {
        }
    }

    public static final class i implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f27607a = new i();

        private i() {
        }
    }

    public static final class j implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b0 f27608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27609b;

        public j(b0 type, String value) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f27608a = type;
            this.f27609b = value;
        }

        public final b0 a() {
            return this.f27608a;
        }

        public final String b() {
            return this.f27609b;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof j)) {
                return false;
            }
            j jVar = (j) obj2;
            return this.f27608a == jVar.f27608a && Intrinsics.f(this.f27609b, jVar.f27609b);
        }

        public int hashCode() {
            return (this.f27608a.hashCode() * 31) + this.f27609b.hashCode();
        }

        public String toString() {
            return "OnValueChangedEvent(type=" + this.f27608a + ", value=" + this.f27609b + ")";
        }
    }
}
