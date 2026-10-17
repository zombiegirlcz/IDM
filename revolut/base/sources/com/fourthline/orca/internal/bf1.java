package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface bf1 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27115a;

        public a(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f27115a = workflowId;
        }

        public final String a() {
            return this.f27115a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f27115a, ((a) obj2).f27115a);
        }

        public int hashCode() {
            return this.f27115a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f27115a + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ye1 f27116a;

        public b(ye1 config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f27116a = config;
        }

        public final ye1 a() {
            return this.f27116a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f27116a, ((b) obj2).f27116a);
        }

        public int hashCode() {
            return this.f27116a.hashCode();
        }

        public String toString() {
            return "Output(config=" + this.f27116a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}
