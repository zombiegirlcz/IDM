package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ky;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface fp extends ky {

    public static final class a implements fp, ky.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28590a = new a();

        private a() {
        }
    }

    public static final class b implements fp, ky.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f28591a = new b();

        private b() {
        }
    }

    public static final class c implements fp, ky.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ny f28592a;

        public c(ny nyVar) {
            this.f28592a = nyVar;
        }

        @Override // com.fourthline.orca.internal.ky.b
        public ny a() {
            return this.f28592a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.f28592a, ((c) obj2).f28592a);
        }

        public int hashCode() {
            ny nyVar = this.f28592a;
            if (nyVar == null) {
                return 0;
            }
            return nyVar.hashCode();
        }

        public String toString() {
            return "FinishFlow(nextFlow=" + this.f28592a + ")";
        }

        public /* synthetic */ c(ny nyVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : nyVar);
        }

        @Override // com.fourthline.orca.internal.ky.b
        public void a(ny nyVar) {
            this.f28592a = nyVar;
        }
    }
}
