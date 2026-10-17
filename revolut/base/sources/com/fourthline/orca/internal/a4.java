package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ky;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface a4 extends ky {

    public static final class a implements a4, ky.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26699a = new a();

        private a() {
        }
    }

    public static final class b implements a4, ky.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ny f26700a;

        public b(ny nyVar) {
            this.f26700a = nyVar;
        }

        @Override // com.fourthline.orca.internal.ky.b
        public ny a() {
            return this.f26700a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f26700a, ((b) obj2).f26700a);
        }

        public int hashCode() {
            ny nyVar = this.f26700a;
            if (nyVar == null) {
                return 0;
            }
            return nyVar.hashCode();
        }

        public String toString() {
            return "FinishFlow(nextFlow=" + this.f26700a + ")";
        }

        public /* synthetic */ b(ny nyVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : nyVar);
        }

        @Override // com.fourthline.orca.internal.ky.b
        public void a(ny nyVar) {
            this.f26700a = nyVar;
        }
    }

    public static final class c implements a4, ky.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f26701a = new c();

        private c() {
        }
    }

    public static final class d implements a4, ky.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f26702a = new d();

        private d() {
        }
    }
}
