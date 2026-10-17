package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface wy extends he1, bt {

    public static final class a implements wy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34811a = new a();

        private a() {
        }
    }

    public static final class b implements wy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final KycError f34812a;

        public b(KycError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f34812a = error;
        }

        public final KycError c() {
            return this.f34812a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f34812a, ((b) obj2).f34812a);
        }

        public int hashCode() {
            return this.f34812a.hashCode();
        }

        public String toString() {
            return "FinishWithError(error=" + this.f34812a + ")";
        }
    }

    public static final class c implements wy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ss f34813a;

        public c(ss flowAction) {
            Intrinsics.checkNotNullParameter(flowAction, "flowAction");
            this.f34813a = flowAction;
        }

        public final ss c() {
            return this.f34813a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.f34813a, ((c) obj2).f34813a);
        }

        public int hashCode() {
            return this.f34813a.hashCode();
        }

        public String toString() {
            return "Forward(flowAction=" + this.f34813a + ")";
        }
    }
}
