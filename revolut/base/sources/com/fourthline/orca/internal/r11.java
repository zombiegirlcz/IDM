package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface r11 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z70 f32607a;

        public a(z70 model) {
            Intrinsics.checkNotNullParameter(model, "model");
            this.f32607a = model;
        }

        public final z70 a() {
            return this.f32607a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && this.f32607a == ((a) obj2).f32607a;
        }

        public int hashCode() {
            return this.f32607a.hashCode();
        }

        public String toString() {
            return "Input(model=" + this.f32607a + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f32608a;

        public b(boolean z) {
            this.f32608a = z;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && this.f32608a == ((b) obj2).f32608a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f32608a);
        }

        public String toString() {
            return "Output(success=" + this.f32608a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}
