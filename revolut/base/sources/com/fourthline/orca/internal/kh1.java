package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface kh1 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30276a;

        public a(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f30276a = workflowId;
        }

        public final String a() {
            return this.f30276a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f30276a, ((a) obj2).f30276a);
        }

        public int hashCode() {
            return this.f30276a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f30276a + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final hh1 f30277a;

        public b(hh1 status) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.f30277a = status;
        }

        public final hh1 a() {
            return this.f30277a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f30277a, ((b) obj2).f30277a);
        }

        public int hashCode() {
            return this.f30277a.hashCode();
        }

        public String toString() {
            return "Output(status=" + this.f30277a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}
