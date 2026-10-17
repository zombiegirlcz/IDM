package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface h00 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f29084b;

        public a(String validationCode, String languageCode) {
            Intrinsics.checkNotNullParameter(validationCode, "validationCode");
            Intrinsics.checkNotNullParameter(languageCode, "languageCode");
            this.f29083a = validationCode;
            this.f29084b = languageCode;
        }

        public final String a() {
            return this.f29084b;
        }

        public final String b() {
            return this.f29083a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f29083a, aVar.f29083a) && Intrinsics.f(this.f29084b, aVar.f29084b);
        }

        public int hashCode() {
            return (this.f29083a.hashCode() * 31) + this.f29084b.hashCode();
        }

        public String toString() {
            return "Input(validationCode=" + this.f29083a + ", languageCode=" + this.f29084b + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g00 f29085a;

        public b(g00 session) {
            Intrinsics.checkNotNullParameter(session, "session");
            this.f29085a = session;
        }

        public final g00 a() {
            return this.f29085a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f29085a, ((b) obj2).f29085a);
        }

        public int hashCode() {
            return this.f29085a.hashCode();
        }

        public String toString() {
            return "Output(session=" + this.f29085a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}
