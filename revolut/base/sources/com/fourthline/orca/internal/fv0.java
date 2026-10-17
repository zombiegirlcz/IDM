package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface fv0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f28670a;

        public a(String signatureId) {
            Intrinsics.checkNotNullParameter(signatureId, "signatureId");
            this.f28670a = signatureId;
        }

        public final String a() {
            return this.f28670a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f28670a, ((a) obj2).f28670a);
        }

        public int hashCode() {
            return this.f28670a.hashCode();
        }

        public String toString() {
            return "Input(signatureId=" + this.f28670a + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final gx0 f28671a;

        public b(gx0 qesStatus) {
            Intrinsics.checkNotNullParameter(qesStatus, "qesStatus");
            this.f28671a = qesStatus;
        }

        public final gx0 a() {
            return this.f28671a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f28671a, ((b) obj2).f28671a);
        }

        public int hashCode() {
            return this.f28671a.hashCode();
        }

        public String toString() {
            return "Output(qesStatus=" + this.f28671a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}
