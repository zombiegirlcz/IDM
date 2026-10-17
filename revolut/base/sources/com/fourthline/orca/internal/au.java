package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface au extends be1 {

    public static final class a implements au {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26905a = new a();

        private a() {
        }
    }

    public static final class b implements au {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f26906a = new b();

        private b() {
        }
    }

    public static final class c implements au {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f26907a = new c();

        private c() {
        }
    }

    public static final class d implements au {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f26908a = new d();

        private d() {
        }
    }

    public static final class e implements au {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26909a;

        public e(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f26909a = input;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof e) && Intrinsics.f(this.f26909a, ((e) obj2).f26909a);
        }

        public int hashCode() {
            return this.f26909a.hashCode();
        }

        public String toString() {
            return "OnPinChanged(input=" + this.f26909a + ")";
        }
    }

    public static final class f implements au {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26910a;

        public f(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f26910a = input;
        }

        public final String a() {
            return this.f26910a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof f) && Intrinsics.f(this.f26910a, ((f) obj2).f26910a);
        }

        public int hashCode() {
            return this.f26910a.hashCode();
        }

        public String toString() {
            return "OnPinInserted(input=" + this.f26910a + ")";
        }
    }

    public static final class g implements au {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f26911a = new g();

        private g() {
        }
    }
}
