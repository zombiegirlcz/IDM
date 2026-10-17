package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface oc1 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f31642a;

        public a(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f31642a = workflowId;
        }

        public final String a() {
            return this.f31642a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f31642a, ((a) obj2).f31642a);
        }

        public int hashCode() {
            return this.f31642a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f31642a + ")";
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f31643a = new a();

            private a() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof a);
            }

            public int hashCode() {
                return 337729013;
            }

            public String toString() {
                return "Succeed";
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}
