package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface q2 extends be1 {

    public static final class a implements q2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32162a = new a();

        private a() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return -1156785419;
        }

        public String toString() {
            return "OnBackButtonClicked";
        }
    }

    public static final class b implements q2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32163a = new b();

        private b() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return 1133875258;
        }

        public String toString() {
            return "OnDoneButtonClicked";
        }
    }

    public static final class c implements q2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f32164a;

        public c(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f32164a = input;
        }

        public final String a() {
            return this.f32164a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.f32164a, ((c) obj2).f32164a);
        }

        public int hashCode() {
            return this.f32164a.hashCode();
        }

        public String toString() {
            return "OnInputChanged(input=" + this.f32164a + ")";
        }
    }

    public static final class d implements q2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f32165a = new d();

        private d() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof d);
        }

        public int hashCode() {
            return 1829916646;
        }

        public String toString() {
            return "OnInputFocused";
        }
    }

    public static final class e implements q2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f32166a = new e();

        private e() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof e);
        }

        public int hashCode() {
            return 1299903341;
        }

        public String toString() {
            return "OnInputUnfocused";
        }
    }

    public static final class f implements q2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a01 f32167a;

        public f(a01 item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f32167a = item;
        }

        public final a01 a() {
            return this.f32167a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof f) && Intrinsics.f(this.f32167a, ((f) obj2).f32167a);
        }

        public int hashCode() {
            return this.f32167a.hashCode();
        }

        public String toString() {
            return "OnItemSelected(item=" + this.f32167a + ")";
        }
    }

    public static final class g implements q2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f32168a = new g();

        private g() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof g);
        }

        public int hashCode() {
            return 1494648937;
        }

        public String toString() {
            return "OnNextButtonClicked";
        }
    }

    public static final class h implements q2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f32169a = new h();

        private h() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof h);
        }

        public int hashCode() {
            return 687727948;
        }

        public String toString() {
            return "OnScreenShown";
        }
    }
}
