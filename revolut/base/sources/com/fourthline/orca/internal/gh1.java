package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface gh1 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f28887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f28888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f28889c;

        public a(String validationCode, String languageCode, String key) {
            Intrinsics.checkNotNullParameter(validationCode, "validationCode");
            Intrinsics.checkNotNullParameter(languageCode, "languageCode");
            Intrinsics.checkNotNullParameter(key, "key");
            this.f28887a = validationCode;
            this.f28888b = languageCode;
            this.f28889c = key;
        }

        public final String a() {
            return this.f28889c;
        }

        public final String b() {
            return this.f28888b;
        }

        public final String c() {
            return this.f28887a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f28887a, aVar.f28887a) && Intrinsics.f(this.f28888b, aVar.f28888b) && Intrinsics.f(this.f28889c, aVar.f28889c);
        }

        public int hashCode() {
            return (((this.f28887a.hashCode() * 31) + this.f28888b.hashCode()) * 31) + this.f28889c.hashCode();
        }

        public String toString() {
            return "Input(validationCode=" + this.f28887a + ", languageCode=" + this.f28888b + ", key=" + this.f28889c + ")";
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f28890a = new a();

            private a() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof a);
            }

            public int hashCode() {
                return 1179510839;
            }

            public String toString() {
                return "InvalidValidationCode";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gh1$b$b, reason: collision with other inner class name */
        public static final class C0203b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final fh1 f28891a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final mb.d f28892b;

            public C0203b(fh1 session, mb.d networkEnvironment) {
                Intrinsics.checkNotNullParameter(session, "session");
                Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
                this.f28891a = session;
                this.f28892b = networkEnvironment;
            }

            public final mb.d a() {
                return this.f28892b;
            }

            public final fh1 b() {
                return this.f28891a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0203b)) {
                    return false;
                }
                C0203b c0203b = (C0203b) obj2;
                return Intrinsics.f(this.f28891a, c0203b.f28891a) && Intrinsics.f(this.f28892b, c0203b.f28892b);
            }

            public int hashCode() {
                return (this.f28891a.hashCode() * 31) + this.f28892b.hashCode();
            }

            public String toString() {
                return "Succeed(session=" + this.f28891a + ", networkEnvironment=" + this.f28892b + ")";
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}
