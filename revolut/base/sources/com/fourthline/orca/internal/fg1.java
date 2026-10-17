package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface fg1 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f28499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f28500b;

        public a(String validationCode, String languageCode) {
            Intrinsics.checkNotNullParameter(validationCode, "validationCode");
            Intrinsics.checkNotNullParameter(languageCode, "languageCode");
            this.f28499a = validationCode;
            this.f28500b = languageCode;
        }

        public final String a() {
            return this.f28500b;
        }

        public final String b() {
            return this.f28499a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f28499a, aVar.f28499a) && Intrinsics.f(this.f28500b, aVar.f28500b);
        }

        public int hashCode() {
            return (this.f28499a.hashCode() * 31) + this.f28500b.hashCode();
        }

        public String toString() {
            return "Input(validationCode=" + this.f28499a + ", languageCode=" + this.f28500b + ")";
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final cf1 f28501a;

            public a(cf1 error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.f28501a = error;
            }

            public final cf1 a() {
                return this.f28501a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && Intrinsics.f(this.f28501a, ((a) obj2).f28501a);
            }

            public int hashCode() {
                return this.f28501a.hashCode();
            }

            public String toString() {
                return "Error(error=" + this.f28501a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.fg1$b$b, reason: collision with other inner class name */
        public static final class C0198b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final eg1 f28502a;

            public C0198b(eg1 session) {
                Intrinsics.checkNotNullParameter(session, "session");
                this.f28502a = session;
            }

            public final eg1 a() {
                return this.f28502a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0198b) && Intrinsics.f(this.f28502a, ((C0198b) obj2).f28502a);
            }

            public int hashCode() {
                return this.f28502a.hashCode();
            }

            public String toString() {
                return "Succeed(session=" + this.f28502a + ")";
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}
