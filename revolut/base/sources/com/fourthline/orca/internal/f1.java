package com.fourthline.orca.internal;

import com.fourthline.orca.internal.er;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface f1 {

    public static final class a implements f1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28308a = new a();

        private a() {
        }

        @Override // com.fourthline.orca.internal.f1
        public boolean a(er error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return true;
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return 1464701444;
        }

        public String toString() {
            return "Default";
        }
    }

    public static final class b implements f1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f28309a = new b();

        private b() {
        }

        @Override // com.fourthline.orca.internal.f1
        public boolean a(er error) {
            Intrinsics.checkNotNullParameter(error, "error");
            if (Intrinsics.f(error, er.g.f28242a) || Intrinsics.f(error, er.f.f28240a) || Intrinsics.f(error, er.e.f28238a) || Intrinsics.f(error, er.d.f28236a)) {
                return false;
            }
            Intrinsics.f(error, er.h.f28244a);
            return true;
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return 2012375287;
        }

        public String toString() {
            return "SkipCountryAndType";
        }
    }

    boolean a(er erVar);
}
