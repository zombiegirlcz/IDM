package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ky;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface l0 extends ky {

    public static final class a implements l0, ky.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ny f30495a;

        public a(ny nyVar) {
            this.f30495a = nyVar;
        }

        @Override // com.fourthline.orca.internal.ky.b
        public ny a() {
            return this.f30495a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f30495a, ((a) obj2).f30495a);
        }

        public int hashCode() {
            ny nyVar = this.f30495a;
            if (nyVar == null) {
                return 0;
            }
            return nyVar.hashCode();
        }

        public String toString() {
            return "FinishFlow(nextFlow=" + this.f30495a + ")";
        }

        public /* synthetic */ a(ny nyVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : nyVar);
        }

        @Override // com.fourthline.orca.internal.ky.b
        public void a(ny nyVar) {
            this.f30495a = nyVar;
        }
    }

    public static final class b implements l0, ky.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f30496a = new b();

        private b() {
        }
    }
}
