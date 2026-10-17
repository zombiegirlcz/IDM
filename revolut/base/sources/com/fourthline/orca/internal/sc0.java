package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface sc0 extends be1 {

    public static final class a implements sc0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32971a = new a();

        private a() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return -375322232;
        }

        public String toString() {
            return "OnBackButtonClicked";
        }
    }

    public static final class b implements sc0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final tc0 f32972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f32973b;

        public b(tc0 type, boolean z) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f32972a = type;
            this.f32973b = z;
        }

        public final boolean a() {
            return this.f32973b;
        }

        public final tc0 b() {
            return this.f32972a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return this.f32972a == bVar.f32972a && this.f32973b == bVar.f32973b;
        }

        public int hashCode() {
            return (this.f32972a.hashCode() * 31) + Boolean.hashCode(this.f32973b);
        }

        public String toString() {
            return "OnFocusChangedEvent(type=" + this.f32972a + ", focused=" + this.f32973b + ")";
        }
    }

    public static final class c implements sc0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f32974a = new c();

        private c() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof c);
        }

        public int hashCode() {
            return -113232555;
        }

        public String toString() {
            return "OnLinkButtonClicked";
        }
    }

    public static final class d implements sc0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f32975a = new d();

        private d() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof d);
        }

        public int hashCode() {
            return -2018855172;
        }

        public String toString() {
            return "OnNextButtonClicked";
        }
    }

    public static final class e implements sc0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f32976a = new e();

        private e() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof e);
        }

        public int hashCode() {
            return -1414447585;
        }

        public String toString() {
            return "OnScreenShown";
        }
    }

    public static final class f implements sc0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final tc0 f32977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f32978b;

        public f(tc0 type, String value) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f32977a = type;
            this.f32978b = value;
        }

        public final String a() {
            return this.f32978b;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof f)) {
                return false;
            }
            f fVar = (f) obj2;
            return this.f32977a == fVar.f32977a && Intrinsics.f(this.f32978b, fVar.f32978b);
        }

        public int hashCode() {
            return (this.f32977a.hashCode() * 31) + this.f32978b.hashCode();
        }

        public String toString() {
            return "OnValueChangedEvent(type=" + this.f32977a + ", value=" + this.f32978b + ")";
        }
    }
}
