package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface u6 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f33964a;

        public a(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f33964a = workflowId;
        }

        public final String a() {
            return this.f33964a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f33964a, ((a) obj2).f33964a);
        }

        public int hashCode() {
            return this.f33964a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f33964a + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h6 f33965a;

        public b(h6 status) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.f33965a = status;
        }

        public final h6 a() {
            return this.f33965a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f33965a, ((b) obj2).f33965a);
        }

        public int hashCode() {
            return this.f33965a.hashCode();
        }

        public String toString() {
            return "Output(status=" + this.f33965a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}
