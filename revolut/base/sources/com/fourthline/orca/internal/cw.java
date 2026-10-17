package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface cw {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27564a;

        public a(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f27564a = workflowId;
        }

        public final String a() {
            return this.f27564a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f27564a, ((a) obj2).f27564a);
        }

        public int hashCode() {
            return this.f27564a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f27564a + ")";
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f27565a;

            public a(int i) {
                this.f27565a = i;
            }

            public final int a() {
                return this.f27565a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && this.f27565a == ((a) obj2).f27565a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f27565a);
            }

            public String toString() {
                return "Failed(code=" + this.f27565a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.cw$b$b, reason: collision with other inner class name */
        public static final class C0179b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f27566a;

            public C0179b(String tokenUrl) {
                Intrinsics.checkNotNullParameter(tokenUrl, "tokenUrl");
                this.f27566a = tokenUrl;
            }

            public final String a() {
                return this.f27566a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0179b) && Intrinsics.f(this.f27566a, ((C0179b) obj2).f27566a);
            }

            public int hashCode() {
                return this.f27566a.hashCode();
            }

            public String toString() {
                return "Success(tokenUrl=" + this.f27566a + ")";
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}
