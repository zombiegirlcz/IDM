package kem;

import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class i extends o {

    @NotNull
    public static final f Companion = new f();
    public static final i e = new i("*", "*", zhm.f0.f322471a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f183202c;
    public final String d;

    public i(String str, String str2, String str3, List list) {
        super(str3, list);
        this.f183202c = str;
        this.d = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (kotlin.text.a0.z(r1.f183215b, r7, true) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kem.i b(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.util.List r0 = r5.f183220b
            int r1 = r0.size()
            if (r1 == 0) goto L5f
            r2 = 1
            if (r1 == r2) goto L47
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto L26
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L26
            goto L5f
        L26:
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L5f
            java.lang.Object r3 = r1.next()
            kem.m r3 = (kem.m) r3
            java.lang.String r4 = r3.f183214a
            boolean r4 = kotlin.text.a0.z(r4, r6, r2)
            if (r4 == 0) goto L2a
            java.lang.String r3 = r3.f183215b
            boolean r3 = kotlin.text.a0.z(r3, r7, r2)
            if (r3 == 0) goto L2a
            goto L5e
        L47:
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            kem.m r1 = (kem.m) r1
            java.lang.String r3 = r1.f183214a
            boolean r3 = kotlin.text.a0.z(r3, r6, r2)
            if (r3 == 0) goto L5f
            java.lang.String r1 = r1.f183215b
            boolean r1 = kotlin.text.a0.z(r1, r7, r2)
            if (r1 == 0) goto L5f
        L5e:
            return r5
        L5f:
            kem.i r1 = new kem.i
            java.util.Collection r0 = (java.util.Collection) r0
            kem.m r2 = new kem.m
            r2.<init>(r6, r7)
            java.util.ArrayList r6 = zhm.d0.F0(r2, r0)
            java.lang.String r7 = r5.f183202c
            java.lang.String r0 = r5.d
            java.lang.String r2 = r5.f183219a
            r1.<init>(r7, r0, r2, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kem.i.b(java.lang.String, java.lang.String):kem.i");
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return kotlin.text.a0.z(this.f183202c, iVar.f183202c, true) && kotlin.text.a0.z(this.d, iVar.d, true) && Intrinsics.f(this.f183220b, iVar.f183220b);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f183202c.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.d.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return iHashCode + (iHashCode * 31) + lowerCase2.hashCode() + (this.f183220b.hashCode() * 31);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(String contentType, String contentSubtype, List parameters) {
        this(contentType, contentSubtype, contentType + '/' + contentSubtype, parameters);
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(contentSubtype, "contentSubtype");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }
}
