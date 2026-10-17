package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface qs {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f32524a;

        public a(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f32524a = workflowId;
        }

        public final String a() {
            return this.f32524a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f32524a, ((a) obj2).f32524a);
        }

        public int hashCode() {
            return this.f32524a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f32524a + ")";
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final boolean f32525a;

            public a(boolean z) {
                this.f32525a = z;
            }

            public final boolean a() {
                return this.f32525a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && this.f32525a == ((a) obj2).f32525a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f32525a);
            }

            public String toString() {
                return "Failed(canRetryEid=" + this.f32525a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.qs$b$b, reason: collision with other inner class name */
        public static final class C0274b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0274b f32526a = new C0274b();

            private C0274b() {
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}
