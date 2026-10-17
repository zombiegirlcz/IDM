package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ky;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface ac extends ky {

    public static final class a implements ac, ky.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ny f26768a;

        public a(ny nyVar) {
            this.f26768a = nyVar;
        }

        @Override // com.fourthline.orca.internal.ky.b
        public ny a() {
            return this.f26768a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f26768a, ((a) obj2).f26768a);
        }

        public int hashCode() {
            ny nyVar = this.f26768a;
            if (nyVar == null) {
                return 0;
            }
            return nyVar.hashCode();
        }

        public String toString() {
            return "FinishFlow(nextFlow=" + this.f26768a + ")";
        }

        public /* synthetic */ a(ny nyVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : nyVar);
        }

        @Override // com.fourthline.orca.internal.ky.b
        public void a(ny nyVar) {
            this.f26768a = nyVar;
        }
    }

    public static final class b implements ac, ky.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f26769a = new b();

        private b() {
        }
    }
}
