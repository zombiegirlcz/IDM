package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface wv extends bt {

    public static final class a implements wv {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final kh0 f34804a;

        public a(kh0 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f34804a = error;
        }

        public final kh0 c() {
            return this.f34804a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f34804a, ((a) obj2).f34804a);
        }

        public int hashCode() {
            return this.f34804a.hashCode();
        }

        public String toString() {
            return "FinishWithError(error=" + this.f34804a + ")";
        }
    }

    public static final class b implements wv {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ky f34805a;

        public b(ky flowAction) {
            Intrinsics.checkNotNullParameter(flowAction, "flowAction");
            this.f34805a = flowAction;
        }

        public final ky c() {
            return this.f34805a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f34805a, ((b) obj2).f34805a);
        }

        public int hashCode() {
            return this.f34805a.hashCode();
        }

        public String toString() {
            return "FinishWithSuccess(flowAction=" + this.f34805a + ")";
        }
    }
}
