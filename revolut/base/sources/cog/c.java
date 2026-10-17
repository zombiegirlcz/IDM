package cog;

import chc.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements f {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzl.b f25544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0m.a f25545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f25546c;

    public c(zzl.b regexMatcher, f0m.a asciiConverter) {
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        Intrinsics.checkNotNullParameter(asciiConverter, "asciiConverter");
        this.f25544a = regexMatcher;
        this.f25545b = asciiConverter;
        this.f25546c = w.y0(new c0(24));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6 A[RETURN] */
    @Override // cog.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(zng.g r7) {
        /*
            r6 = this;
            java.lang.String r0 = "domainState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            bog.u r0 = r7.f323819a
            boolean r1 = r0 instanceof bog.r
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3c
            bog.r r0 = (bog.r) r0
            bog.d r7 = r0.f17450a
            java.lang.String r7 = r7.f17432c
            boolean r7 = r6.b(r7)
            if (r7 == 0) goto Lb7
            bog.j r7 = r0.f17451b
            if (r7 == 0) goto L20
            java.lang.String r7 = r7.f17441c
            goto L21
        L20:
            r7 = 0
        L21:
            if (r7 == 0) goto L30
            boolean r1 = kotlin.text.d0.W(r7)
            if (r1 == 0) goto L2a
            goto L30
        L2a:
            boolean r7 = r6.b(r7)
            if (r7 == 0) goto Lb7
        L30:
            bog.h r7 = r0.f17452c
            java.lang.String r7 = r7.f17438c
            boolean r7 = r6.b(r7)
            if (r7 == 0) goto Lb7
            goto Lb6
        L3c:
            boolean r1 = r0 instanceof bog.s
            if (r1 == 0) goto L9c
            bog.s r0 = (bog.s) r0
            bog.d r1 = r0.d
            java.lang.String r1 = r1.f17432c
            boolean r1 = r6.b(r1)
            if (r1 == 0) goto Lb7
            bog.h r0 = r0.f17455c
            java.lang.String r0 = r0.f17438c
            boolean r0 = r6.b(r0)
            if (r0 == 0) goto Lb7
            bog.u r7 = r7.f323819a
            bog.s r7 = (bog.s) r7
            bog.l r0 = r7.f17454b
            java.lang.String r0 = r0.f17444c
            bog.n r7 = r7.f17453a
            java.lang.String r7 = r7.f17445c
            if (r0 == 0) goto L6a
            boolean r1 = kotlin.text.d0.W(r0)
            if (r1 == 0) goto L73
        L6a:
            if (r7 == 0) goto Lb6
            boolean r1 = kotlin.text.d0.W(r7)
            if (r1 == 0) goto L73
            goto Lb6
        L73:
            if (r0 == 0) goto L9b
            int r1 = r0.length()
            if (r1 != 0) goto L7c
            goto L9b
        L7c:
            zzl.b r1 = r6.f25544a
            r4 = r1
            zzl.c r4 = (zzl.c) r4
            java.lang.String r5 = "^[\\u4E00-\\u9FBF\\u3040-\\u309f\\u30A0-\\u30FF\\u3000-\\u303F-`' \\s]+$"
            boolean r0 = r4.a(r5, r0)
            if (r0 == 0) goto L9b
            if (r7 == 0) goto L9b
            int r0 = r7.length()
            if (r0 != 0) goto L92
            goto L9b
        L92:
            zzl.c r1 = (zzl.c) r1
            boolean r7 = r1.a(r5, r7)
            if (r7 == 0) goto L9b
            return r3
        L9b:
            return r2
        L9c:
            boolean r7 = r0 instanceof bog.t
            if (r7 == 0) goto Lb8
            bog.t r0 = (bog.t) r0
            bog.d r7 = r0.f17456a
            java.lang.String r7 = r7.f17432c
            boolean r7 = r6.b(r7)
            if (r7 == 0) goto Lb7
            bog.f r7 = r0.f17457b
            java.lang.String r7 = r7.f17435c
            boolean r7 = r6.b(r7)
            if (r7 == 0) goto Lb7
        Lb6:
            return r3
        Lb7:
            return r2
        Lb8:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cog.c.a(zng.g):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean b(String str) {
        if (str == null || d0.W(str)) {
            return false;
        }
        return ((zzl.c) this.f25544a).a("^[a-zA-Z\\-`'&\\s]*$", this.f25545b.a(((Regex) this.f25546c.getValue()).replace(str, "'")));
    }
}
