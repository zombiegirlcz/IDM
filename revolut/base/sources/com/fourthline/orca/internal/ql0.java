package com.fourthline.orca.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface ql0 extends be1 {

    public static final class a implements ql0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32474a = new a();

        private a() {
        }
    }

    public static final class b implements ql0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f32475a;

        public b(boolean z) {
            this.f32475a = z;
        }

        public final boolean a() {
            return this.f32475a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && this.f32475a == ((b) obj2).f32475a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f32475a);
        }

        public String toString() {
            return "OnBirthDateInputViewFocusChanged(isFocused=" + this.f32475a + ")";
        }
    }

    public static final class c implements ql0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f32476a;

        public c(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f32476a = value;
        }

        public final String a() {
            return this.f32476a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.f32476a, ((c) obj2).f32476a);
        }

        public int hashCode() {
            return this.f32476a.hashCode();
        }

        public String toString() {
            return "OnBirthDateValueChanged(value=" + this.f32476a + ")";
        }
    }

    public static final class d implements ql0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f32477a;

        public d(boolean z) {
            this.f32477a = z;
        }

        public final boolean a() {
            return this.f32477a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && this.f32477a == ((d) obj2).f32477a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f32477a);
        }

        public String toString() {
            return "OnFirstNameInputViewFocusChanged(isFocused=" + this.f32477a + ")";
        }
    }

    public static final class e implements ql0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f32478a;

        public e(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f32478a = value;
        }

        public final String a() {
            return this.f32478a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof e) && Intrinsics.f(this.f32478a, ((e) obj2).f32478a);
        }

        public int hashCode() {
            return this.f32478a.hashCode();
        }

        public String toString() {
            return "OnFirstNameInputViewValueChanged(value=" + this.f32478a + ")";
        }
    }

    public static final class f implements ql0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f32479a;

        public f(boolean z) {
            this.f32479a = z;
        }

        public final boolean a() {
            return this.f32479a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof f) && this.f32479a == ((f) obj2).f32479a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f32479a);
        }

        public String toString() {
            return "OnGenderInputViewFocusChanged(isFocused=" + this.f32479a + ")";
        }
    }

    public static final class g implements ql0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map.Entry f32480a;

        public g(Map.Entry gender) {
            Intrinsics.checkNotNullParameter(gender, "gender");
            this.f32480a = gender;
        }

        public final Map.Entry a() {
            return this.f32480a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof g) && Intrinsics.f(this.f32480a, ((g) obj2).f32480a);
        }

        public int hashCode() {
            return this.f32480a.hashCode();
        }

        public String toString() {
            return "OnGenderSelected(gender=" + this.f32480a + ")";
        }
    }

    public static final class h implements ql0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f32481a;

        public h(boolean z) {
            this.f32481a = z;
        }

        public final boolean a() {
            return this.f32481a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof h) && this.f32481a == ((h) obj2).f32481a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f32481a);
        }

        public String toString() {
            return "OnLastNameInputViewFocusChanged(isFocused=" + this.f32481a + ")";
        }
    }

    public static final class i implements ql0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f32482a;

        public i(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f32482a = value;
        }

        public final String a() {
            return this.f32482a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof i) && Intrinsics.f(this.f32482a, ((i) obj2).f32482a);
        }

        public int hashCode() {
            return this.f32482a.hashCode();
        }

        public String toString() {
            return "OnLastNameInputViewValueChanged(value=" + this.f32482a + ")";
        }
    }

    public static final class j implements ql0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f32483a = new j();

        private j() {
        }
    }

    public static final class k implements ql0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f32484a = new k();

        private k() {
        }
    }
}
