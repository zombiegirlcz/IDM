package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface ej {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f28154a;

        public a(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f28154a = workflowId;
        }

        public final String a() {
            return this.f28154a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f28154a, ((a) obj2).f28154a);
        }

        public int hashCode() {
            return this.f28154a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f28154a + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dj f28155a;

        public b(dj flowConfig) {
            Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
            this.f28155a = flowConfig;
        }

        public final dj a() {
            return this.f28155a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f28155a, ((b) obj2).f28155a);
        }

        public int hashCode() {
            return this.f28155a.hashCode();
        }

        public String toString() {
            return "Output(flowConfig=" + this.f28155a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}
