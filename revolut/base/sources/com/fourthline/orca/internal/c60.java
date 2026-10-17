package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ky;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface c60 extends ky {

    public static final class a implements c60, ky.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ny f27378a;

        public a(ny nyVar) {
            this.f27378a = nyVar;
        }

        @Override // com.fourthline.orca.internal.ky.b
        public ny a() {
            return this.f27378a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f27378a, ((a) obj2).f27378a);
        }

        public int hashCode() {
            ny nyVar = this.f27378a;
            if (nyVar == null) {
                return 0;
            }
            return nyVar.hashCode();
        }

        public String toString() {
            return "FinishFlow(nextFlow=" + this.f27378a + ")";
        }

        public /* synthetic */ a(ny nyVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : nyVar);
        }

        @Override // com.fourthline.orca.internal.ky.b
        public void a(ny nyVar) {
            this.f27378a = nyVar;
        }
    }

    public static final class b implements c60, ky.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27379a = new b();

        private b() {
        }
    }

    public static final class c implements c60, ky.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f27380a = new c();

        private c() {
        }
    }

    public static final class d implements c60, ky.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f27381a = new d();

        private d() {
        }
    }
}
