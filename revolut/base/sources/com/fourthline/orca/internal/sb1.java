package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface sb1 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f32967a;

        public a(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f32967a = workflowId;
        }

        public final String a() {
            return this.f32967a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f32967a, ((a) obj2).f32967a);
        }

        public int hashCode() {
            return this.f32967a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f32967a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}
