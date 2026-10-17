package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface vb1 extends he1, ee1 {

    public static final class a implements vb1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34291a = new a();

        private a() {
        }
    }

    public static final class b implements vb1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ky f34292a;

        public b(ky flowAction) {
            Intrinsics.checkNotNullParameter(flowAction, "flowAction");
            this.f34292a = flowAction;
        }

        public final ky c() {
            return this.f34292a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f34292a, ((b) obj2).f34292a);
        }

        public int hashCode() {
            return this.f34292a.hashCode();
        }

        public String toString() {
            return "FinishWithSuccess(flowAction=" + this.f34292a + ")";
        }
    }
}
