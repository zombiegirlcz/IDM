package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface bm extends he1 {

    public static final class a implements bm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27157a = new a();

        private a() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return -1606792259;
        }

        public String toString() {
            return "ClearFocus";
        }
    }

    public static final class b implements bm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27158a = new b();

        private b() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return -453278725;
        }

        public String toString() {
            return "HideKeyboard";
        }
    }

    public interface c extends p2, al0 {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f27159a = new a();

            private a() {
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final KycError f27160a;

            public b(KycError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.f27160a = error;
            }

            public final KycError c() {
                return this.f27160a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f27160a, ((b) obj2).f27160a);
            }

            public int hashCode() {
                return this.f27160a.hashCode();
            }

            public String toString() {
                return "FinishWithError(error=" + this.f27160a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.bm$c$c, reason: collision with other inner class name */
        public static final class C0171c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ck0 f27161a;

            public C0171c(ck0 flowAction) {
                Intrinsics.checkNotNullParameter(flowAction, "flowAction");
                this.f27161a = flowAction;
            }

            public final ck0 c() {
                return this.f27161a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0171c) && Intrinsics.f(this.f27161a, ((C0171c) obj2).f27161a);
            }

            public int hashCode() {
                return this.f27161a.hashCode();
            }

            public String toString() {
                return "Forward(flowAction=" + this.f27161a + ")";
            }
        }
    }

    public static final class d implements bm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f27162a = new d();

        private d() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof d);
        }

        public int hashCode() {
            return -1867475274;
        }

        public String toString() {
            return "ShowKeyboard";
        }
    }
}
