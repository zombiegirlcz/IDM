package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface e00 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27960b;

        public a(String workflowId, String documentId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            this.f27959a = workflowId;
            this.f27960b = documentId;
        }

        public final String a() {
            return this.f27960b;
        }

        public final String b() {
            return this.f27959a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f27959a, aVar.f27959a) && Intrinsics.f(this.f27960b, aVar.f27960b);
        }

        public int hashCode() {
            return (this.f27959a.hashCode() * 31) + this.f27960b.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f27959a + ", documentId=" + this.f27960b + ")";
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final d00 f27961a;

            public a(d00 value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this.f27961a = value;
            }

            public final d00 a() {
                return this.f27961a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && Intrinsics.f(this.f27961a, ((a) obj2).f27961a);
            }

            public int hashCode() {
                return this.f27961a.hashCode();
            }

            public String toString() {
                return "Succeed(value=" + this.f27961a + ")";
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}
