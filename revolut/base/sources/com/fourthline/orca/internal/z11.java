package com.fourthline.orca.internal;

import com.fourthline.vision.selfie.SelfieScannerResult;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface z11 extends he1 {

    public interface a extends z11, ee1 {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.z11$a$a, reason: collision with other inner class name */
        public static final class C0320a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0320a f35485a = new C0320a();

            private C0320a() {
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final kh0 f35486a;

            public b(kh0 error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.f35486a = error;
            }

            public final kh0 c() {
                return this.f35486a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f35486a, ((b) obj2).f35486a);
            }

            public int hashCode() {
                return this.f35486a.hashCode();
            }

            public String toString() {
                return "FinishWithError(error=" + this.f35486a + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f35487c = SelfieScannerResult.$stable;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final l01 f35488a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final SelfieScannerResult f35489b;

            public c(l01 flowAction, SelfieScannerResult result) {
                Intrinsics.checkNotNullParameter(flowAction, "flowAction");
                Intrinsics.checkNotNullParameter(result, "result");
                this.f35488a = flowAction;
                this.f35489b = result;
            }

            public final l01 c() {
                return this.f35488a;
            }

            public final SelfieScannerResult d() {
                return this.f35489b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof c)) {
                    return false;
                }
                c cVar = (c) obj2;
                return Intrinsics.f(this.f35488a, cVar.f35488a) && Intrinsics.f(this.f35489b, cVar.f35489b);
            }

            public int hashCode() {
                return (this.f35488a.hashCode() * 31) + this.f35489b.hashCode();
            }

            public String toString() {
                return "Forward(flowAction=" + this.f35488a + ", result=" + this.f35489b + ")";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f35490a = new d();

            private d() {
            }
        }
    }

    public static final class b implements z11 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f35491a = new b();

        private b() {
        }
    }

    public static final class c implements z11 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f35492a;

        public c(List permissions) {
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            this.f35492a = permissions;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.f35492a, ((c) obj2).f35492a);
        }

        public int hashCode() {
            return this.f35492a.hashCode();
        }

        public String toString() {
            return "RequestPermissions(permissions=" + this.f35492a + ")";
        }
    }

    public static final class d implements z11 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f35493a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35494a = new a("LONG", 0);

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f35495b = new a("TICK", 1);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ a[] f35496c;
            private static final /* synthetic */ EnumEntries d;

            static {
                a[] aVarArrA = a();
                f35496c = aVarArrA;
                d = vc.s.n(aVarArrA);
            }

            private a(String str, int i) {
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f35494a, f35495b};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f35496c.clone();
            }
        }

        public d(a type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f35493a = type;
        }

        public final a a() {
            return this.f35493a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && this.f35493a == ((d) obj2).f35493a;
        }

        public int hashCode() {
            return this.f35493a.hashCode();
        }

        public String toString() {
            return "Vibrate(type=" + this.f35493a + ")";
        }

        public /* synthetic */ d(a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? a.f35494a : aVar);
        }
    }
}
