package com.fourthline.orca.internal;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface pu {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f32046a;

        public a(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f32046a = workflowId;
        }

        public final String a() {
            return this.f32046a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f32046a, ((a) obj2).f32046a);
        }

        public int hashCode() {
            return this.f32046a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f32046a + ")";
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final boolean f32047a;

            public a(boolean z) {
                this.f32047a = z;
            }

            public final boolean a() {
                return this.f32047a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && this.f32047a == ((a) obj2).f32047a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f32047a);
            }

            public String toString() {
                return "Failed(canRetryEid=" + this.f32047a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.pu$b$b, reason: collision with other inner class name */
        public static final class C0265b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List f32048a;

            public C0265b(List accessRights) {
                Intrinsics.checkNotNullParameter(accessRights, "accessRights");
                this.f32048a = accessRights;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0265b) && Intrinsics.f(this.f32048a, ((C0265b) obj2).f32048a);
            }

            public int hashCode() {
                return this.f32048a.hashCode();
            }

            public String toString() {
                return "Success(accessRights=" + this.f32048a + ")";
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}
