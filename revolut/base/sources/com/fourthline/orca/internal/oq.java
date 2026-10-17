package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface oq extends he1, fq {

    public static final class a implements oq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31712a = new a();

        private a() {
        }
    }

    public static final class b implements oq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final KycError f31713a;

        public b(KycError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f31713a = error;
        }

        public final KycError c() {
            return this.f31713a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f31713a, ((b) obj2).f31713a);
        }

        public int hashCode() {
            return this.f31713a.hashCode();
        }

        public String toString() {
            return "FinishWithError(error=" + this.f31713a + ")";
        }
    }

    public static final class c implements oq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final fp f31714a;

        public c(fp flowAction) {
            Intrinsics.checkNotNullParameter(flowAction, "flowAction");
            this.f31714a = flowAction;
        }

        public final fp c() {
            return this.f31714a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.f31714a, ((c) obj2).f31714a);
        }

        public int hashCode() {
            return this.f31714a.hashCode();
        }

        public String toString() {
            return "Forward(flowAction=" + this.f31714a + ")";
        }
    }
}
