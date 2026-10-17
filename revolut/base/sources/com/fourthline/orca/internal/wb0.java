package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ky;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface wb0 extends ky {

    public static final class a implements wb0, ky.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ny f34584a;

        public a(ny nyVar) {
            this.f34584a = nyVar;
        }

        @Override // com.fourthline.orca.internal.ky.b
        public ny a() {
            return this.f34584a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f34584a, ((a) obj2).f34584a);
        }

        public int hashCode() {
            ny nyVar = this.f34584a;
            if (nyVar == null) {
                return 0;
            }
            return nyVar.hashCode();
        }

        public String toString() {
            return "FinishFlow(nextFlow=" + this.f34584a + ")";
        }

        @Override // com.fourthline.orca.internal.ky.b
        public void a(ny nyVar) {
            this.f34584a = nyVar;
        }
    }
}
