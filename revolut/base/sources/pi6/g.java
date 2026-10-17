package pi6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tnb.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements d {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f236438a;

    public g(g0 openBankingErrorParser) {
        Intrinsics.checkNotNullParameter(openBankingErrorParser, "openBankingErrorParser");
        this.f236438a = openBankingErrorParser;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.jvm.functions.Function1 r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof pi6.f
            if (r0 == 0) goto L13
            r0 = r6
            pi6.f r0 = (pi6.f) r0
            int r1 = r0.f236437w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f236437w = r1
            goto L18
        L13:
            pi6.f r0 = new pi6.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f236437w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L27
            goto L3d
        L27:
            r5 = move-exception
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.f236437w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L27
            if (r6 != r1) goto L3d
            return r1
        L3d:
            pi6.b r5 = new pi6.b     // Catch: java.lang.Throwable -> L27
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L27
            return r5
        L43:
            tnb.g0 r6 = r4.f236438a
            java.lang.String r0 = "throwable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r5 instanceof retrofit2.HttpException
            r1 = 0
            if (r0 == 0) goto L53
            r0 = r5
            retrofit2.HttpException r0 = (retrofit2.HttpException) r0
            goto L54
        L53:
            r0 = r1
        L54:
            if (r0 == 0) goto L7b
            ulm.r1 r0 = i26.l.m(r0)
            if (r0 == 0) goto L61
            java.lang.String r0 = r0.string()
            goto L62
        L61:
            r0 = r1
        L62:
            if (r0 == 0) goto L7b
            java.lang.Object r6 = r6.f272384b     // Catch: java.lang.Exception -> L71
            je0.d r6 = (je0.d) r6     // Catch: java.lang.Exception -> L71
            java.lang.Class<wh6.d> r2 = wh6.d.class
            java.lang.Object r6 = r6.b(r0, r2)     // Catch: java.lang.Exception -> L71
            wh6.d r6 = (wh6.d) r6     // Catch: java.lang.Exception -> L71
            goto L7c
        L71:
            r6 = move-exception
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r1, r1, r6, r0)
        L7b:
            r6 = r1
        L7c:
            if (r6 == 0) goto L88
            int r0 = r6.getCode()
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r0)
            goto L89
        L88:
            r2 = r1
        L89:
            if (r2 != 0) goto L8c
            goto L94
        L8c:
            int r0 = r2.intValue()
            r3 = 26000(0x6590, float:3.6434E-41)
            if (r0 == r3) goto La0
        L94:
            if (r2 == 0) goto L9f
            int r0 = r2.intValue()
            r2 = 11102(0x2b5e, float:1.5557E-41)
            if (r0 != r2) goto L9f
            goto La0
        L9f:
            throw r5
        La0:
            pi6.a r5 = new pi6.a
            wh6.d$c r6 = r6.getParams()
            if (r6 == 0) goto Lac
            java.lang.String r1 = r6.getRedirectUri()
        Lac:
            r5.<init>(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pi6.g.a(kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }
}
