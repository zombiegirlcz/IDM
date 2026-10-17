package com.fourthline.orca.internal;

import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface rp0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f32794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f32795b;

        public a(String workflowId, Set acceptableStatuses) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(acceptableStatuses, "acceptableStatuses");
            this.f32794a = workflowId;
            this.f32795b = acceptableStatuses;
        }

        public final Set a() {
            return this.f32795b;
        }

        public final String b() {
            return this.f32794a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f32794a, aVar.f32794a) && Intrinsics.f(this.f32795b, aVar.f32795b);
        }

        public int hashCode() {
            return (this.f32794a.hashCode() * 31) + this.f32795b.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f32794a + ", acceptableStatuses=" + this.f32795b + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}
