package a80;

import a09.r;
import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import lim.n;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import te0.w;
import yhm.m;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements zk0.b {

    @NotNull
    public static final c Companion = new c();
    public static final Regex d = new Regex("\\(\\d+\\)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f1993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1994c;

    public h(Context context, l80.e dateProvider, i90.b uuidUtils, String applicationId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f1992a = context;
        this.f1993b = dateProvider;
        this.f1994c = applicationId;
    }

    public static final void b(h hVar, File file) {
        long millis = Duration.ofDays(1L).toMillis();
        ((l80.f) hVar.f1993b).getClass();
        nkm.g gVar = new nkm.g(y.n(y.n(n.k(file, FileWalkDirection.TOP_DOWN), new a5g.h(27)), new a(System.currentTimeMillis(), millis, 0)));
        while (gVar.hasNext()) {
            ((File) gVar.next()).delete();
        }
    }

    public static e g(String str) {
        MatchResult matchResult = (MatchResult) y.w(Regex.c(d, str));
        if (matchResult == null) {
            return null;
        }
        String strSubstring = matchResult.getValue().substring(1, matchResult.getValue().length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return new e(Integer.parseInt(strSubstring), matchResult.getRange());
    }

    public static void s(File file, zk0.c cVar) throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                cVar.g(fileOutputStream);
                fileOutputStream.flush();
                Unit unit = Unit.f186387a;
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th10) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
            if (!(th10 instanceof IOException)) {
                throw new IOException(th10);
            }
            throw th10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File c(java.io.File r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a80.h.c(java.io.File, java.lang.String):java.io.File");
    }

    public final void d(String file) {
        Intrinsics.checkNotNullParameter(file, "file");
        new File(file).delete();
    }

    public final void e(zk0.a fileSystemDir, String fileName) {
        Intrinsics.checkNotNullParameter(fileSystemDir, "fileSystemDir");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        File fileH = h(fileSystemDir);
        fileH.mkdirs();
        File file = new File(fileH, fileName);
        if (file.exists()) {
            file.delete();
        }
    }

    public final void f(List files) {
        Intrinsics.checkNotNullParameter(files, "files");
        Iterator it8 = files.iterator();
        while (it8.hasNext()) {
            String str = (String) it8.next();
            if (!new File(str).delete()) {
                try {
                    Path path = Paths.get(str, new String[0]);
                    Intrinsics.checkNotNullExpressionValue(path, "get(...)");
                    Files.delete(path);
                } catch (Throwable th10) {
                    IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Unable to delete file '", str, "'"), th10);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.WARNING, null, null, illegalStateException, h0Var);
                }
            }
        }
    }

    public final File h(zk0.a aVar) {
        if (f.f1990a[aVar.ordinal()] == 1) {
            return new File(this.f1992a.getCacheDir(), aVar.a());
        }
        throw new IllegalStateException("Directory not supported");
    }

    public final Uri i(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        Uri uriForFile = FileProvider.getUriForFile(this.f1992a, a0.d.r(this.f1994c, ".provider"), file);
        Intrinsics.checkNotNullExpressionValue(uriForFile, "getUriForFile(...)");
        return uriForFile;
    }

    public final String j(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return o80.c.d(file);
    }

    public final File k(String dirName) {
        Intrinsics.checkNotNullParameter(dirName, "dirName");
        File file = new File(this.f1992a.getFilesDir(), dirName);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final ufm.n l(String dirName) {
        Intrinsics.checkNotNullParameter(dirName, "dirName");
        int i = 2;
        ufm.c cVar = new ufm.c(new r(this, dirName, i), i);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return w.i0(cVar);
    }

    public final File m(zk0.a fileSystemDir, String fileName) {
        Intrinsics.checkNotNullParameter(fileSystemDir, "fileSystemDir");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new File(h(fileSystemDir), fileName);
    }

    public final File n(zk0.a fileSystemDir, InputStream inputStream, String fileName) {
        Intrinsics.checkNotNullParameter(fileSystemDir, "fileSystemDir");
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        zjh.f writable = new zjh.f(inputStream, 2);
        Intrinsics.checkNotNullParameter(fileSystemDir, "fileSystemDir");
        Intrinsics.checkNotNullParameter(writable, "writable");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        try {
            File fileH = h(fileSystemDir);
            fileH.mkdirs();
            File file = new File(fileH, fileName);
            if (file.exists()) {
                file.delete();
            }
            s(file, writable);
            return file;
        } catch (IOException unused) {
            return null;
        }
    }

    public final ufm.n o(zk0.a fileSystemDir, zk0.c writable, String fileName) {
        Intrinsics.checkNotNullParameter(fileSystemDir, "fileSystemDir");
        Intrinsics.checkNotNullParameter(writable, "writable");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        ufm.c cVar = new ufm.c(new b(this, fileSystemDir, writable, fileName, 0), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return w.i0(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ufm.n p(zk0.a fileSystemDir, byte[] byteArray, String fileName) {
        Intrinsics.checkNotNullParameter(fileSystemDir, "fileSystemDir");
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        ufm.c cVar = new ufm.c(new b((Object) this, (Object) fileSystemDir, fileName, (Serializable) byteArray, 1), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return w.i0(cVar);
    }

    public final File q(InputStream inputStream, String fileName) {
        Object objA;
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        zk0.a aVar = zk0.a.INTERNAL_CACHE;
        File fileN = n(aVar, inputStream, fileName + ".tmp");
        if (fileN == null) {
            return null;
        }
        try {
            m.Companion companion = m.INSTANCE;
            File fileM = m(aVar, fileName);
            if (fileM.exists()) {
                fileM.delete();
            }
            if (fileN.renameTo(fileM)) {
                objA = fileM;
            } else {
                fileN.delete();
                objA = null;
            }
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
            fileN.delete();
        }
        return (File) (objA instanceof yhm.n ? null : objA);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(zk0.c r6, java.lang.String r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof a80.g
            if (r0 == 0) goto L13
            r0 = r8
            a80.g r0 = (a80.g) r0
            int r1 = r0.f1991w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1991w = r1
            goto L18
        L13:
            a80.g r0 = new a80.g
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f1991w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r8)     // Catch: java.io.IOException -> L48
            goto L45
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r8)
            a1a.c r8 = new a1a.c     // Catch: java.io.IOException -> L48
            r8.<init>(r5, r6, r7, r4)     // Catch: java.io.IOException -> L48
            skm.p0 r6 = skm.p0.f264001a     // Catch: java.io.IOException -> L48
            elm.f r6 = elm.f.f127540b     // Catch: java.io.IOException -> L48
            r0.f1991w = r3     // Catch: java.io.IOException -> L48
            java.lang.Object r8 = skm.e0.J(r6, r8, r0)     // Catch: java.io.IOException -> L48
            if (r8 != r1) goto L45
            return r1
        L45:
            java.io.File r8 = (java.io.File) r8     // Catch: java.io.IOException -> L48
            return r8
        L48:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a80.h.r(zk0.c, java.lang.String, gim.c):java.lang.Object");
    }
}
