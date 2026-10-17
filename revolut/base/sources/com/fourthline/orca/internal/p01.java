package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface p01 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f31788a;

        public a(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f31788a = workflowId;
        }

        public final String a() {
            return this.f31788a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f31788a, ((a) obj2).f31788a);
        }

        public int hashCode() {
            return this.f31788a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f31788a + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n01 f31789a;

        public b(n01 flowConfig) {
            Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
            this.f31789a = flowConfig;
        }

        public final n01 a() {
            return this.f31789a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f31789a, ((b) obj2).f31789a);
        }

        public int hashCode() {
            return this.f31789a.hashCode();
        }

        public String toString() {
            return "Output(flowConfig=" + this.f31789a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}
