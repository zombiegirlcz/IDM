package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface jz {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30079b;

        public a(String workflowId, String flowVariantName) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(flowVariantName, "flowVariantName");
            this.f30078a = workflowId;
            this.f30079b = flowVariantName;
        }

        public final String a() {
            return this.f30079b;
        }

        public final String b() {
            return this.f30078a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f30078a, aVar.f30078a) && Intrinsics.f(this.f30079b, aVar.f30079b);
        }

        public int hashCode() {
            return (this.f30078a.hashCode() * 31) + this.f30079b.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f30078a + ", flowVariantName=" + this.f30079b + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}
