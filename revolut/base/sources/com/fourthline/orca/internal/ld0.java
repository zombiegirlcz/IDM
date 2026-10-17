package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ky;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface ld0 extends ky {

    public static final class a implements ld0, ky.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30588a = new a();

        private a() {
        }
    }

    public static final class b implements ld0, ky.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ny f30589a;

        public b(ny nyVar) {
            this.f30589a = nyVar;
        }

        @Override // com.fourthline.orca.internal.ky.b
        public ny a() {
            return this.f30589a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f30589a, ((b) obj2).f30589a);
        }

        public int hashCode() {
            ny nyVar = this.f30589a;
            if (nyVar == null) {
                return 0;
            }
            return nyVar.hashCode();
        }

        public String toString() {
            return "FinishFlow(nextFlow=" + this.f30589a + ")";
        }

        public /* synthetic */ b(ny nyVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : nyVar);
        }

        @Override // com.fourthline.orca.internal.ky.b
        public void a(ny nyVar) {
            this.f30589a = nyVar;
        }
    }
}
