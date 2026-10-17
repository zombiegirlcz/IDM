package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface qr0 extends he1, ee1 {

    public static final class a implements qr0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32518a = new a();

        private a() {
        }
    }

    public static final class b implements qr0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final gt0 f32519a;

        public b(gt0 flowAction) {
            Intrinsics.checkNotNullParameter(flowAction, "flowAction");
            this.f32519a = flowAction;
        }

        public final gt0 c() {
            return this.f32519a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f32519a, ((b) obj2).f32519a);
        }

        public int hashCode() {
            return this.f32519a.hashCode();
        }

        public String toString() {
            return "Forward(flowAction=" + this.f32519a + ")";
        }
    }

    public static final class c implements qr0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f32520a = new c();

        private c() {
        }
    }
}
