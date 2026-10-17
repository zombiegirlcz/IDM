package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface yy extends be1 {

    public static final class a implements yy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35453a = new a();

        private a() {
        }
    }

    public static final class b implements yy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f35454a = new b();

        private b() {
        }
    }

    public static final class c implements yy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final yk f35455a;

        public c(yk type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f35455a = type;
        }

        public final yk a() {
            return this.f35455a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && this.f35455a == ((c) obj2).f35455a;
        }

        public int hashCode() {
            return this.f35455a.hashCode();
        }

        public String toString() {
            return "OnOptionClicked(type=" + this.f35455a + ")";
        }
    }

    public static final class d implements yy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f35456a = new d();

        private d() {
        }
    }
}
