package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ky;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface kp0 extends ky {

    public static final class a implements kp0, ky.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30355a = new a();

        private a() {
        }
    }

    public static final class b implements kp0, ky.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ny f30356a;

        public b(ny nyVar) {
            this.f30356a = nyVar;
        }

        @Override // com.fourthline.orca.internal.ky.b
        public ny a() {
            return this.f30356a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f30356a, ((b) obj2).f30356a);
        }

        public int hashCode() {
            ny nyVar = this.f30356a;
            if (nyVar == null) {
                return 0;
            }
            return nyVar.hashCode();
        }

        public String toString() {
            return "FinishFlow(nextFlow=" + this.f30356a + ")";
        }

        @Override // com.fourthline.orca.internal.ky.b
        public void a(ny nyVar) {
            this.f30356a = nyVar;
        }

        public /* synthetic */ b(ny nyVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : nyVar);
        }
    }
}
