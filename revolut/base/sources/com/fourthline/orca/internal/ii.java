package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface ii extends be1 {

    public static final class a implements ii {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f29600a;

        public a(boolean z) {
            this.f29600a = z;
        }

        public final boolean a() {
            return this.f29600a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && this.f29600a == ((a) obj2).f29600a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f29600a);
        }

        public String toString() {
            return "OnBirthDateInputViewFocusChanged(isFocused=" + this.f29600a + ")";
        }
    }

    public static final class b implements ii {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29601a;

        public b(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f29601a = value;
        }

        public final String a() {
            return this.f29601a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f29601a, ((b) obj2).f29601a);
        }

        public int hashCode() {
            return this.f29601a.hashCode();
        }

        public String toString() {
            return "OnBirthDateValueChanged(value=" + this.f29601a + ")";
        }
    }

    public static final class c implements ii {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f29602a;

        public c(boolean z) {
            this.f29602a = z;
        }

        public final boolean a() {
            return this.f29602a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && this.f29602a == ((c) obj2).f29602a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f29602a);
        }

        public String toString() {
            return "OnCheckBoxClicked(newState=" + this.f29602a + ")";
        }
    }

    public static final class d implements ii {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f29603a;

        public d(boolean z) {
            this.f29603a = z;
        }

        public final boolean a() {
            return this.f29603a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && this.f29603a == ((d) obj2).f29603a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f29603a);
        }

        public String toString() {
            return "OnDocumentNumberInputViewFocusChanged(isFocused=" + this.f29603a + ")";
        }
    }

    public static final class e implements ii {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29604a;

        public e(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f29604a = value;
        }

        public final String a() {
            return this.f29604a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof e) && Intrinsics.f(this.f29604a, ((e) obj2).f29604a);
        }

        public int hashCode() {
            return this.f29604a.hashCode();
        }

        public String toString() {
            return "OnDocumentNumberInputViewValueChanged(value=" + this.f29604a + ")";
        }
    }

    public static final class f implements ii {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f29605a;

        public f(boolean z) {
            this.f29605a = z;
        }

        public final boolean a() {
            return this.f29605a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof f) && this.f29605a == ((f) obj2).f29605a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f29605a);
        }

        public String toString() {
            return "OnExpirationDateInputViewFocusChanged(isFocused=" + this.f29605a + ")";
        }
    }

    public static final class g implements ii {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29606a;

        public g(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f29606a = value;
        }

        public final String a() {
            return this.f29606a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof g) && Intrinsics.f(this.f29606a, ((g) obj2).f29606a);
        }

        public int hashCode() {
            return this.f29606a.hashCode();
        }

        public String toString() {
            return "OnExpiryDateValueChanged(value=" + this.f29606a + ")";
        }
    }

    public static final class h implements ii {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f29607a = new h();

        private h() {
        }
    }

    public static final class i implements ii {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f29608a = new i();

        private i() {
        }
    }

    public static final class j implements ii {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f29609a = new j();

        private j() {
        }
    }
}
