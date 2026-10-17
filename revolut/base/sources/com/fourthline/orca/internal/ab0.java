package com.fourthline.orca.internal;

import java.util.List;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface ab0 {

    public static final class a implements ab0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f26757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f26758c;
        private final Map d;
        private final List e;
        private final sc f;

        public a(String alias, b method, String path, Map headers, List parameters, sc body) {
            Intrinsics.checkNotNullParameter(alias, "alias");
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(body, "body");
            this.f26756a = alias;
            this.f26757b = method;
            this.f26758c = path;
            this.d = headers;
            this.e = parameters;
            this.f = body;
        }

        public final a a(String alias, b method, String path, Map headers, List parameters, sc body) {
            Intrinsics.checkNotNullParameter(alias, "alias");
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(body, "body");
            return new a(alias, method, path, headers, parameters, body);
        }

        public Map b() {
            return this.d;
        }

        public final b c() {
            return this.f26757b;
        }

        public List d() {
            return this.e;
        }

        public String e() {
            return this.f26758c;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f26756a, aVar.f26756a) && this.f26757b == aVar.f26757b && Intrinsics.f(this.f26758c, aVar.f26758c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
        }

        @Override // com.fourthline.orca.internal.ab0
        public String getAlias() {
            return this.f26756a;
        }

        public int hashCode() {
            return (((((((((this.f26756a.hashCode() * 31) + this.f26757b.hashCode()) * 31) + this.f26758c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        }

        public String toString() {
            return "Default(alias=" + this.f26756a + ", method=" + this.f26757b + ", path=" + this.f26758c + ", headers=" + this.d + ", parameters=" + this.e + ", body=" + this.f + ")";
        }

        public static /* synthetic */ a a(a aVar, String str, b bVar, String str2, Map map, List list, sc scVar, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = aVar.f26756a;
            }
            if ((i & 2) != 0) {
                bVar = aVar.f26757b;
            }
            if ((i & 4) != 0) {
                str2 = aVar.f26758c;
            }
            if ((i & 8) != 0) {
                map = aVar.d;
            }
            if ((i & 16) != 0) {
                list = aVar.e;
            }
            if ((i & 32) != 0) {
                scVar = aVar.f;
            }
            List list2 = list;
            sc scVar2 = scVar;
            return aVar.a(str, bVar, str2, map, list2, scVar2);
        }

        public final sc a() {
            return this.f;
        }

        public a(String str, b bVar, String str2, Map map, List list, sc scVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, bVar, str2, (i & 8) != 0 ? zhm.r0.g() : map, (i & 16) != 0 ? zhm.f0.f322471a : list, (i & 32) != 0 ? sc.f32968b.a() : scVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f26759a = new b("GET", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f26760b = new b("POST", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f26761c = new b("PUT", 2);
        private static final /* synthetic */ b[] d;
        private static final /* synthetic */ EnumEntries e;

        static {
            b[] bVarArrA = a();
            d = bVarArrA;
            e = vc.s.n(bVarArrA);
        }

        private b(String str, int i) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f26759a, f26760b, f26761c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    public static final class c implements ab0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f26763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f26764c;
        private final List d;
        private final List e;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f26765a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final sc f26766b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Map f26767c;

            public a(String key, sc value, Map headers) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(headers, "headers");
                this.f26765a = key;
                this.f26766b = value;
                this.f26767c = headers;
            }

            public final a a(String key, sc value, Map headers) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(headers, "headers");
                return new a(key, value, headers);
            }

            public final String b() {
                return this.f26765a;
            }

            public final sc c() {
                return this.f26766b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.f26765a, aVar.f26765a) && Intrinsics.f(this.f26766b, aVar.f26766b) && Intrinsics.f(this.f26767c, aVar.f26767c);
            }

            public int hashCode() {
                return (((this.f26765a.hashCode() * 31) + this.f26766b.hashCode()) * 31) + this.f26767c.hashCode();
            }

            public String toString() {
                return "BodyPart(key=" + this.f26765a + ", value=" + this.f26766b + ", headers=" + this.f26767c + ")";
            }

            public static /* synthetic */ a a(a aVar, String str, sc scVar, Map map, int i, Object obj2) {
                if ((i & 1) != 0) {
                    str = aVar.f26765a;
                }
                if ((i & 2) != 0) {
                    scVar = aVar.f26766b;
                }
                if ((i & 4) != 0) {
                    map = aVar.f26767c;
                }
                return aVar.a(str, scVar, map);
            }

            public final Map a() {
                return this.f26767c;
            }

            public /* synthetic */ a(String str, sc scVar, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, scVar, (i & 4) != 0 ? zhm.r0.g() : map);
            }
        }

        public c(String alias, String path, Map headers, List parameters, List body) {
            Intrinsics.checkNotNullParameter(alias, "alias");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(body, "body");
            this.f26762a = alias;
            this.f26763b = path;
            this.f26764c = headers;
            this.d = parameters;
            this.e = body;
        }

        public final c a(String alias, String path, Map headers, List parameters, List body) {
            Intrinsics.checkNotNullParameter(alias, "alias");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(body, "body");
            return new c(alias, path, headers, parameters, body);
        }

        public Map b() {
            return this.f26764c;
        }

        public List c() {
            return this.d;
        }

        public String d() {
            return this.f26763b;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.f26762a, cVar.f26762a) && Intrinsics.f(this.f26763b, cVar.f26763b) && Intrinsics.f(this.f26764c, cVar.f26764c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
        }

        @Override // com.fourthline.orca.internal.ab0
        public String getAlias() {
            return this.f26762a;
        }

        public int hashCode() {
            return (((((((this.f26762a.hashCode() * 31) + this.f26763b.hashCode()) * 31) + this.f26764c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            return "Multipart(alias=" + this.f26762a + ", path=" + this.f26763b + ", headers=" + this.f26764c + ", parameters=" + this.d + ", body=" + this.e + ")";
        }

        public static /* synthetic */ c a(c cVar, String str, String str2, Map map, List list, List list2, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = cVar.f26762a;
            }
            if ((i & 2) != 0) {
                str2 = cVar.f26763b;
            }
            if ((i & 4) != 0) {
                map = cVar.f26764c;
            }
            if ((i & 8) != 0) {
                list = cVar.d;
            }
            if ((i & 16) != 0) {
                list2 = cVar.e;
            }
            List list3 = list2;
            Map map2 = map;
            return cVar.a(str, str2, map2, list, list3);
        }

        public final List a() {
            return this.e;
        }

        public c(String str, String str2, Map map, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, map, (i & 8) != 0 ? zhm.f0.f322471a : list, list2);
        }
    }

    String getAlias();
}
