package com.fourthline.orca.internal;

import com.fourthline.vision.selfie.SelfieScannerResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface dj0 {

    public static final class a implements dj0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ym f27794a;

        public a(ym result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f27794a = result;
        }

        public final ym a() {
            return this.f27794a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f27794a, ((a) obj2).f27794a);
        }

        public int hashCode() {
            return this.f27794a.hashCode();
        }

        public String toString() {
            return "Document(result=" + this.f27794a + ")";
        }
    }

    public static final class b implements dj0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27795b = SelfieScannerResult.$stable;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SelfieScannerResult f27796a;

        public b(SelfieScannerResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f27796a = result;
        }

        public final SelfieScannerResult a() {
            return this.f27796a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f27796a, ((b) obj2).f27796a);
        }

        public int hashCode() {
            return this.f27796a.hashCode();
        }

        public String toString() {
            return "Selfie(result=" + this.f27796a + ")";
        }
    }

    public static final class c implements dj0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f27797a = new c();

        private c() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof c);
        }

        public int hashCode() {
            return 1912372768;
        }

        public String toString() {
            return "Workflow";
        }
    }
}
