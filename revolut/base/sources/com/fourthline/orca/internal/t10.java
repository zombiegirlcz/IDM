package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface t10 {

    public static final class a implements t10 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f33174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Exception f33175b;

        public a(String identifier, Exception exception) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f33174a = identifier;
            this.f33175b = exception;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f33174a, aVar.f33174a) && Intrinsics.f(this.f33175b, aVar.f33175b);
        }

        public int hashCode() {
            return (this.f33174a.hashCode() * 31) + this.f33175b.hashCode();
        }

        public String toString() {
            return "Failed(identifier=" + this.f33174a + ", exception=" + this.f33175b + ")";
        }
    }

    public static final class b implements t10 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f33176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f33177b;

        public b(String identifier, float f) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.f33176a = identifier;
            this.f33177b = f;
        }

        public final float a() {
            return this.f33177b;
        }

        public String b() {
            return this.f33176a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f33176a, bVar.f33176a) && Float.compare(this.f33177b, bVar.f33177b) == 0;
        }

        public int hashCode() {
            return (this.f33176a.hashCode() * 31) + Float.hashCode(this.f33177b);
        }

        public String toString() {
            return "Success(identifier=" + this.f33176a + ", confidence=" + this.f33177b + ")";
        }
    }
}
