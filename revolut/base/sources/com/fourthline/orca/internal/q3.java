package com.fourthline.orca.internal;

import com.fourthline.orca.internal.b7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface q3 {

    public static final class a implements q3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b7.b f32183a;

        public a(b7.b result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f32183a = result;
        }

        public final b7.b a() {
            return this.f32183a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f32183a, ((a) obj2).f32183a);
        }

        public int hashCode() {
            return this.f32183a.hashCode();
        }

        public String toString() {
            return "Completed(result=" + this.f32183a + ")";
        }
    }

    public static final class b implements q3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Throwable f32184a;

        public b(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f32184a = error;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f32184a, ((b) obj2).f32184a);
        }

        public int hashCode() {
            return this.f32184a.hashCode();
        }

        public String toString() {
            return "Failed(error=" + this.f32184a + ")";
        }
    }

    public static final class c implements q3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f32185a = new c();

        private c() {
        }
    }

    public static final class d implements q3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f32186a = new d();

        private d() {
        }
    }
}
