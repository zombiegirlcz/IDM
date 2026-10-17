package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ky;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface i91 extends ky {

    public static final class a implements i91, ky.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29535a = new a();

        private a() {
        }
    }

    public static final class b implements i91, ky.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ny f29536a;

        public b(ny nyVar) {
            this.f29536a = nyVar;
        }

        @Override // com.fourthline.orca.internal.ky.b
        public ny a() {
            return this.f29536a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f29536a, ((b) obj2).f29536a);
        }

        public int hashCode() {
            ny nyVar = this.f29536a;
            if (nyVar == null) {
                return 0;
            }
            return nyVar.hashCode();
        }

        public String toString() {
            return "FinishFlow(nextFlow=" + this.f29536a + ")";
        }

        @Override // com.fourthline.orca.internal.ky.b
        public void a(ny nyVar) {
            this.f29536a = nyVar;
        }

        public /* synthetic */ b(ny nyVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : nyVar);
        }
    }

    public static final class c implements i91, ky.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f29537a = new c();

        private c() {
        }
    }

    public static final class d implements i91, ky.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f29538a = new d();

        private d() {
        }
    }
}
