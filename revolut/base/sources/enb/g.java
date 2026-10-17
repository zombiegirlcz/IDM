package enb;

import com.revolut.core.model.FileExtension;
import com.revolut.feature.retail.savings.impl.documents.data.network.SavingsDocumentsService;
import dp4.a1;
import dp4.f1;
import dp4.z0;
import g2e.t;
import java.security.MessageDigest;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    @NotNull
    public static final c Companion = new c();
    public static final long i = TimeUnit.DAYS.toMillis(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsDocumentsService f127797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f127798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f127799c;
    public final zk0.b d;
    public final t e;
    public final l80.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f127800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f127801h;

    public g(SavingsDocumentsService service, j memoryCache, ue0.c savingsStorage, zk0.b fileSystemRepository, t rawUrlRequestRepository, l80.e dateTimeProvider) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(savingsStorage, "savingsStorage");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(rawUrlRequestRepository, "rawUrlRequestRepository");
        Intrinsics.checkNotNullParameter(dateTimeProvider, "dateTimeProvider");
        this.f127797a = service;
        this.f127798b = memoryCache;
        this.f127799c = savingsStorage;
        this.d = fileSystemRepository;
        this.e = rawUrlRequestRepository;
        this.f = dateTimeProvider;
        Continuation continuation = null;
        this.f127800g = new x4l.c(new e6d.f(this, continuation, 4), new b(this, 1), new a(this, 1), new ec8.c(this, continuation, 16), new z0(this, continuation, 7));
        int i2 = 2;
        this.f127801h = new x4l.c(new a1(this, continuation, 19), new b(this, i2), new a(this, i2), new f(this, continuation, 0), new f1(this, continuation, 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(enb.g r10, java.lang.String r11, gim.c r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof enb.d
            if (r0 == 0) goto L16
            r0 = r12
            enb.d r0 = (enb.d) r0
            int r1 = r0.f127792y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f127792y = r1
            goto L1b
        L16:
            enb.d r0 = new enb.d
            r0.<init>(r10, r12)
        L1b:
            java.lang.Object r12 = r0.f127790w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127792y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.io.Closeable r10 = r0.v
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L31
            goto La4
        L31:
            r11 = move-exception
            goto Lb7
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            java.lang.String r11 = r0.u
            yhm.o.b(r12)
            goto L57
        L42:
            yhm.o.b(r12)
            g2e.t r12 = r10.e
            r2 = 0
            ufm.i r12 = r12.l(r11, r2)
            r0.u = r11
            r0.f127792y = r4
            java.lang.Object r12 = nim.a.b(r12, r0)
            if (r12 != r1) goto L57
            goto La0
        L57:
            java.io.Closeable r12 = (java.io.Closeable) r12
            r2 = r12
            okhttp3.ResponseBody r2 = (okhttp3.ResponseBody) r2     // Catch: java.lang.Throwable -> L65
            ulm.b1 r4 = r2.contentType()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L68
            java.lang.String r4 = r4.f281067c     // Catch: java.lang.Throwable -> L65
            goto L69
        L65:
            r11 = move-exception
        L66:
            r10 = r12
            goto Lb7
        L68:
            r4 = r5
        L69:
            com.revolut.core.model.FileExtension$Pdf r6 = com.revolut.core.model.FileExtension.Pdf.f51406b     // Catch: java.lang.Throwable -> L65
            java.lang.String r7 = "pdf"
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r4, r7)     // Catch: java.lang.Throwable -> L65
            if (r7 == 0) goto L74
            goto L80
        L74:
            com.revolut.core.model.FileExtension$Html r6 = com.revolut.core.model.FileExtension.Html.f51403b     // Catch: java.lang.Throwable -> L65
            java.lang.String r7 = "html"
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r7)     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L7f
            goto L80
        L7f:
            r6 = r5
        L80:
            zk0.b r10 = r10.d     // Catch: java.lang.Throwable -> L65
            zk0.a r4 = zk0.a.INTERNAL_CACHE     // Catch: java.lang.Throwable -> L65
            au6.y0 r7 = new au6.y0     // Catch: java.lang.Throwable -> L65
            r8 = 1
            r7.<init>(r8, r2)     // Catch: java.lang.Throwable -> L65
            java.lang.String r11 = b(r11, r6)     // Catch: java.lang.Throwable -> L65
            a80.h r10 = (a80.h) r10     // Catch: java.lang.Throwable -> Lb4
            ufm.n r10 = r10.o(r4, r7, r11)     // Catch: java.lang.Throwable -> Lb4
            r0.u = r5     // Catch: java.lang.Throwable -> L65
            r0.v = r12     // Catch: java.lang.Throwable -> L65
            r0.f127792y = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r10 = nim.a.b(r10, r0)     // Catch: java.lang.Throwable -> L65
            if (r10 != r1) goto La1
        La0:
            return r1
        La1:
            r9 = r12
            r12 = r10
            r10 = r9
        La4:
            java.io.File r12 = (java.io.File) r12     // Catch: java.lang.Throwable -> L31
            com.bumptech.glide.d.e(r10, r5)
            if (r12 == 0) goto Lac
            return r12
        Lac:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Fail to create file"
            r10.<init>(r11)
            throw r10
        Lb4:
            r10 = move-exception
            r11 = r10
            goto L66
        Lb7:
            throw r11     // Catch: java.lang.Throwable -> Lb8
        Lb8:
            r12 = move-exception
            com.bumptech.glide.d.e(r10, r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: enb.g.a(enb.g, java.lang.String, gim.c):java.lang.Object");
    }

    public static String b(String str, FileExtension fileExtension) {
        String strQ;
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        String strG = kotlin.text.e.g(bArrDigest);
        if (fileExtension == null || (strQ = j6.a.q(".", fileExtension.getF51399a())) == null) {
            strQ = "";
        }
        return strG.concat(strQ);
    }

    public static String d(List list) {
        return d0.k0(d0.O0(list), null, null, null, 0, new elb.a(14), 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r11, gim.c r12) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r0 = "Revolut_"
            boolean r1 = r12 instanceof enb.e
            if (r1 == 0) goto L15
            r1 = r12
            enb.e r1 = (enb.e) r1
            int r2 = r1.f127795y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f127795y = r2
            goto L1a
        L15:
            enb.e r1 = new enb.e
            r1.<init>(r10, r12)
        L1a:
            java.lang.Object r12 = r1.f127793w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f127795y
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L3f
            if (r3 == r5) goto L39
            if (r3 != r4) goto L31
            java.io.InputStream r11 = r1.v
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L2f
            goto L8a
        L2f:
            r12 = move-exception
            goto L99
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            java.lang.String r11 = r1.u
            yhm.o.b(r12)
            goto L58
        L3f:
            yhm.o.b(r12)
            eif.j r12 = new eif.j
            r3 = 16
            r12.<init>(r10, r11, r6, r3)
            skm.p0 r3 = skm.p0.f264001a
            elm.f r3 = elm.f.f127540b
            r1.u = r11
            r1.f127795y = r5
            java.lang.Object r12 = skm.e0.J(r3, r12, r1)
            if (r12 != r2) goto L58
            goto L86
        L58:
            java.io.InputStream r12 = (java.io.InputStream) r12
            zk0.b r3 = r10.d     // Catch: java.lang.Throwable -> L95
            zk0.a r7 = zk0.a.INTERNAL_CACHE     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L95
            r8.append(r11)     // Catch: java.lang.Throwable -> L95
            java.lang.String r11 = ".pdf"
            r8.append(r11)     // Catch: java.lang.Throwable -> L95
            java.lang.String r11 = r8.toString()     // Catch: java.lang.Throwable -> L95
            eli.k r0 = new eli.k     // Catch: java.lang.Throwable -> L95
            r0.<init>(r12, r5)     // Catch: java.lang.Throwable -> L95
            a80.h r3 = (a80.h) r3     // Catch: java.lang.Throwable -> L95
            ufm.n r11 = r3.o(r7, r0, r11)     // Catch: java.lang.Throwable -> L95
            r1.u = r6     // Catch: java.lang.Throwable -> L95
            r1.v = r12     // Catch: java.lang.Throwable -> L95
            r1.f127795y = r4     // Catch: java.lang.Throwable -> L95
            java.lang.Object r11 = nim.a.b(r11, r1)     // Catch: java.lang.Throwable -> L95
            if (r11 != r2) goto L87
        L86:
            return r2
        L87:
            r9 = r12
            r12 = r11
            r11 = r9
        L8a:
            java.io.File r12 = (java.io.File) r12     // Catch: java.lang.Throwable -> L2f
            com.bumptech.glide.d.e(r11, r6)
            java.lang.String r11 = "use(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r11)
            return r12
        L95:
            r11 = move-exception
            r9 = r12
            r12 = r11
            r11 = r9
        L99:
            throw r12     // Catch: java.lang.Throwable -> L9a
        L9a:
            r0 = move-exception
            com.bumptech.glide.d.e(r11, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: enb.g.c(java.lang.String, gim.c):java.lang.Object");
    }
}
