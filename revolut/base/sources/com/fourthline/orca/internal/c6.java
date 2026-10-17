package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface c6 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27376a;

        public a(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f27376a = workflowId;
        }

        public final String a() {
            return this.f27376a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f27376a, ((a) obj2).f27376a);
        }

        public int hashCode() {
            return this.f27376a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f27376a + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27377a;

        public b(String redirectUrl) {
            Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
            this.f27377a = redirectUrl;
        }

        public final String a() {
            return this.f27377a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f27377a, ((b) obj2).f27377a);
        }

        public int hashCode() {
            return this.f27377a.hashCode();
        }

        public String toString() {
            return "Output(redirectUrl=" + this.f27377a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}
