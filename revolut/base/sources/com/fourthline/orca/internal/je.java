package com.fourthline.orca.internal;

import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes23.dex */
public interface je {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f29861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC0222a f29862c;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.je$a$a, reason: collision with other inner class name */
        public interface InterfaceC0222a {

            /* JADX INFO: renamed from: com.fourthline.orca.internal.je$a$a$a, reason: collision with other inner class name */
            public static final class C0223a implements InterfaceC0222a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final byte[] f29863a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final String f29864b;

                public C0223a(byte[] data, String str) {
                    Intrinsics.checkNotNullParameter(data, "data");
                    this.f29863a = data;
                    this.f29864b = str;
                }

                public final byte[] a() {
                    return this.f29863a;
                }

                public final String b() {
                    return this.f29864b;
                }

                public boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C0223a)) {
                        return false;
                    }
                    C0223a c0223a = (C0223a) obj2;
                    return Intrinsics.f(this.f29863a, c0223a.f29863a) && Intrinsics.f(this.f29864b, c0223a.f29864b);
                }

                public int hashCode() {
                    int iHashCode = Arrays.hashCode(this.f29863a) * 31;
                    String str = this.f29864b;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public String toString() {
                    return "Bin(data=" + Arrays.toString(this.f29863a) + ", type=" + this.f29864b + ")";
                }
            }

            /* JADX INFO: renamed from: com.fourthline.orca.internal.je$a$a$b */
            public static final class b implements InterfaceC0222a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final JsonElement f29865a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final String f29866b;

                public b(JsonElement data, String str) {
                    Intrinsics.checkNotNullParameter(data, "data");
                    this.f29865a = data;
                    this.f29866b = str;
                }

                public final JsonElement a() {
                    return this.f29865a;
                }

                public final String b() {
                    return this.f29866b;
                }

                public boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj2;
                    return Intrinsics.f(this.f29865a, bVar.f29865a) && Intrinsics.f(this.f29866b, bVar.f29866b);
                }

                public int hashCode() {
                    int iHashCode = this.f29865a.hashCode() * 31;
                    String str = this.f29866b;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public String toString() {
                    return "Json(data=" + this.f29865a + ", type=" + this.f29866b + ")";
                }
            }
        }

        public a(String workflowId, String fileName, InterfaceC0222a data) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(data, "data");
            this.f29860a = workflowId;
            this.f29861b = fileName;
            this.f29862c = data;
        }

        public final InterfaceC0222a a() {
            return this.f29862c;
        }

        public final String b() {
            return this.f29861b;
        }

        public final String c() {
            return this.f29860a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f29860a, aVar.f29860a) && Intrinsics.f(this.f29861b, aVar.f29861b) && Intrinsics.f(this.f29862c, aVar.f29862c);
        }

        public int hashCode() {
            return (((this.f29860a.hashCode() * 31) + this.f29861b.hashCode()) * 31) + this.f29862c.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f29860a + ", fileName=" + this.f29861b + ", data=" + this.f29862c + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29867a = new b();

        private b() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return 1212235419;
        }

        public String toString() {
            return "Output";
        }
    }

    Object a(a aVar, Continuation continuation);
}
