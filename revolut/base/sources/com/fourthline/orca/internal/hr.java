package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface hr extends he1, fq {

    public static final class a implements hr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29382a = new a();

        private a() {
        }
    }

    public static final class b implements hr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final fp f29383a;

        public b(fp flowAction) {
            Intrinsics.checkNotNullParameter(flowAction, "flowAction");
            this.f29383a = flowAction;
        }

        public final fp c() {
            return this.f29383a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f29383a, ((b) obj2).f29383a);
        }

        public int hashCode() {
            return this.f29383a.hashCode();
        }

        public String toString() {
            return "Forward(flowAction=" + this.f29383a + ")";
        }
    }
}
