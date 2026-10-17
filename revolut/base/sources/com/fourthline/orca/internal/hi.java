package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface hi extends he1, ee1 {

    public static final class a implements hi {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ky f29266a;

        public a(ky flowAction) {
            Intrinsics.checkNotNullParameter(flowAction, "flowAction");
            this.f29266a = flowAction;
        }

        public final ky c() {
            return this.f29266a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f29266a, ((a) obj2).f29266a);
        }

        public int hashCode() {
            return this.f29266a.hashCode();
        }

        public String toString() {
            return "Forward(flowAction=" + this.f29266a + ")";
        }
    }

    public static final class b implements hi {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29267a = new b();

        private b() {
        }
    }
}
