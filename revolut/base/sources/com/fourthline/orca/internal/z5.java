package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface z5 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f35523a;

        public a(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f35523a = workflowId;
        }

        public final String a() {
            return this.f35523a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f35523a, ((a) obj2).f35523a);
        }

        public int hashCode() {
            return this.f35523a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f35523a + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y5 f35524a;

        public b(y5 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f35524a = response;
        }

        public final y5 a() {
            return this.f35524a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f35524a, ((b) obj2).f35524a);
        }

        public int hashCode() {
            return this.f35524a.hashCode();
        }

        public String toString() {
            return "Output(response=" + this.f35524a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}
