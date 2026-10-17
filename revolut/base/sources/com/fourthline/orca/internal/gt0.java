package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ky;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface gt0 extends ky {

    public static final class a implements gt0, ky.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ny f28996a;

        public a(ny nyVar) {
            this.f28996a = nyVar;
        }

        @Override // com.fourthline.orca.internal.ky.b
        public ny a() {
            return this.f28996a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f28996a, ((a) obj2).f28996a);
        }

        public int hashCode() {
            ny nyVar = this.f28996a;
            if (nyVar == null) {
                return 0;
            }
            return nyVar.hashCode();
        }

        public String toString() {
            return "FinishFlow(nextFlow=" + this.f28996a + ")";
        }

        public /* synthetic */ a(ny nyVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : nyVar);
        }

        @Override // com.fourthline.orca.internal.ky.b
        public void a(ny nyVar) {
            this.f28996a = nyVar;
        }
    }

    public static final class b implements gt0, ky.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f28997a = new b();

        private b() {
        }
    }
}
