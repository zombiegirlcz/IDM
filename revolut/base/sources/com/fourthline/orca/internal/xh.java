package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface xh extends p2, fq {

    public static final class a implements xh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34992a = new a();

        private a() {
        }
    }

    public static final class b implements xh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final KycError f34993a;

        public b(KycError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f34993a = error;
        }

        public final KycError c() {
            return this.f34993a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f34993a, ((b) obj2).f34993a);
        }

        public int hashCode() {
            return this.f34993a.hashCode();
        }

        public String toString() {
            return "FinishWithError(error=" + this.f34993a + ")";
        }
    }

    public static final class c implements xh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f34994a = new c();

        private c() {
        }
    }
}
