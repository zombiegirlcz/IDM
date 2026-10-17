package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface t81 extends be1 {

    public static final class a implements t81 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33251a = new a();

        private a() {
        }
    }

    public static final class b implements t81 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f33252a;

        public b(boolean z) {
            this.f33252a = z;
        }

        public final boolean a() {
            return this.f33252a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && this.f33252a == ((b) obj2).f33252a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f33252a);
        }

        public String toString() {
            return "OnFocusChanged(isFocused=" + this.f33252a + ")";
        }
    }

    public static final class c implements t81 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f33253a = new c();

        private c() {
        }
    }

    public static final class d implements t81 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f33254a = new d();

        private d() {
        }
    }

    public static final class e implements t81 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f33255a;

        public e(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f33255a = input;
        }

        public final String a() {
            return this.f33255a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof e) && Intrinsics.f(this.f33255a, ((e) obj2).f33255a);
        }

        public int hashCode() {
            return this.f33255a.hashCode();
        }

        public String toString() {
            return "OnValueChanged(input=" + this.f33255a + ")";
        }
    }
}
