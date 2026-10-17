package com.fourthline.orca.internal;

import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface yv0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f35447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f35448b;

        public a(String signatureId, Set acceptableStatuses) {
            Intrinsics.checkNotNullParameter(signatureId, "signatureId");
            Intrinsics.checkNotNullParameter(acceptableStatuses, "acceptableStatuses");
            this.f35447a = signatureId;
            this.f35448b = acceptableStatuses;
        }

        public final Set a() {
            return this.f35448b;
        }

        public final String b() {
            return this.f35447a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f35447a, aVar.f35447a) && Intrinsics.f(this.f35448b, aVar.f35448b);
        }

        public int hashCode() {
            return (this.f35447a.hashCode() * 31) + this.f35448b.hashCode();
        }

        public String toString() {
            return "Input(signatureId=" + this.f35447a + ", acceptableStatuses=" + this.f35448b + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}
