package com.fourthline.orca.internal;

import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface a6 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f26708b;

        public a(String workflowId, Set acceptableStatuses) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(acceptableStatuses, "acceptableStatuses");
            this.f26707a = workflowId;
            this.f26708b = acceptableStatuses;
        }

        public final Set a() {
            return this.f26708b;
        }

        public final String b() {
            return this.f26707a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f26707a, aVar.f26707a) && Intrinsics.f(this.f26708b, aVar.f26708b);
        }

        public int hashCode() {
            return (this.f26707a.hashCode() * 31) + this.f26708b.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f26707a + ", acceptableStatuses=" + this.f26708b + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}
