package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mmm.g0;
import mmm.h0;
import mmm.s;
import mmm.s0;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import ulm.f;
import ulm.g;
import ulm.i1;
import ulm.j1;
import ulm.u0;
import ulm.x0;
import wlm.h;
import wlm.j;
import wlm.k;
import wlm.o;
import xlm.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0004UVWXB)\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u000e\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\u000fJ\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010#\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0000¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u001b¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\u001b¢\u0006\u0004\b'\u0010%J\u0013\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(¢\u0006\u0004\b*\u0010+J\r\u0010-\u001a\u00020,¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020,¢\u0006\u0004\b/\u0010.J\r\u00100\u001a\u00020\u0005¢\u0006\u0004\b0\u00101J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u00101J\u000f\u00102\u001a\u00020\u001bH\u0016¢\u0006\u0004\b2\u0010%J\u000f\u00103\u001a\u00020\u001bH\u0016¢\u0006\u0004\b3\u0010%J\u000f\u0010\u0004\u001a\u00020\u000eH\u0007¢\u0006\u0004\b4\u00105J\u0017\u0010:\u001a\u00020\u001b2\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b8\u00109J\u000f\u0010<\u001a\u00020\u001bH\u0000¢\u0006\u0004\b;\u0010%J\r\u0010=\u001a\u00020,¢\u0006\u0004\b=\u0010.J\r\u0010>\u001a\u00020,¢\u0006\u0004\b>\u0010.J\r\u0010?\u001a\u00020,¢\u0006\u0004\b?\u0010.J\u001d\u0010C\u001a\u00020\u001b2\f\u0010B\u001a\b\u0018\u00010@R\u00020AH\u0002¢\u0006\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\"\u0010/\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010I\u001a\u0004\bJ\u0010.\"\u0004\bK\u0010LR\"\u0010-\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010I\u001a\u0004\bM\u0010.\"\u0004\bN\u0010LR\u0016\u0010=\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010IR\u0016\u0010>\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010IR\u0016\u0010?\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010IR\u0011\u0010P\u001a\u00020O8F¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0011\u0010\u0004\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0004\u00105R\u0011\u0010R\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006Y"}, d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lmmm/h0;", "directory", "", "maxSize", "Lmmm/s;", "fileSystem", "Lxlm/d;", "taskRunner", "<init>", "(Lmmm/h0;JLmmm/s;Lxlm/d;)V", "(Lmmm/s;Lmmm/h0;J)V", "Ljava/io/File;", "(Ljava/io/File;J)V", "Lulm/j1;", "request", "Lokhttp3/Response;", "get$okhttp", "(Lulm/j1;)Lokhttp3/Response;", "get", "response", "Lwlm/d;", "put$okhttp", "(Lokhttp3/Response;)Lwlm/d;", "put", "", "remove$okhttp", "(Lulm/j1;)V", "remove", "cached", "network", "update$okhttp", "(Lokhttp3/Response;Lokhttp3/Response;)V", "update", "initialize", "()V", "delete", "evictAll", "", "", "urls", "()Ljava/util/Iterator;", "", "writeAbortCount", "()I", "writeSuccessCount", "size", "()J", "flush", "close", "-deprecated_directory", "()Ljava/io/File;", "Lwlm/f;", "cacheStrategy", "trackResponse$okhttp", "(Lwlm/f;)V", "trackResponse", "trackConditionalCacheHit$okhttp", "trackConditionalCacheHit", "networkCount", "hitCount", "requestCount", "Lwlm/h;", "Lwlm/o;", "editor", "abortQuietly", "(Lwlm/h;)V", "cache", "Lwlm/o;", "getCache$okhttp", "()Lwlm/o;", "I", "getWriteSuccessCount$okhttp", "setWriteSuccessCount$okhttp", "(I)V", "getWriteAbortCount$okhttp", "setWriteAbortCount$okhttp", "", "isClosed", "()Z", "directoryPath", "()Lmmm/h0;", "Companion", "ulm/j", "okhttp3/a", "ulm/f", "ulm/g", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Cache implements Closeable, Flushable {

    @NotNull
    public static final g Companion = new g();
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;

    @NotNull
    private final o cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    public Cache(@NotNull h0 directory, long j2, @NotNull s fileSystem, @NotNull d taskRunner) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.cache = new o(directory, j2, fileSystem, taskRunner);
    }

    private final void abortQuietly(h editor) {
        if (editor != null) {
            try {
                editor.a();
            } catch (IOException unused) {
            }
        }
    }

    @NotNull
    public static final String key(@NotNull x0 x0Var) {
        Companion.getClass();
        return g.a(x0Var);
    }

    @NotNull
    @yhm.d
    /* JADX INFO: renamed from: -deprecated_directory, reason: not valid java name */
    public final File m3806deprecated_directory() {
        return this.cache.f298557a.toFile();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cache.close();
    }

    public final void delete() throws IOException {
        o oVar = this.cache;
        oVar.close();
        vlm.h.h(oVar.f298557a, oVar.f298558b);
    }

    @NotNull
    public final File directory() {
        return this.cache.f298557a.toFile();
    }

    @NotNull
    public final h0 directoryPath() {
        return this.cache.f298557a;
    }

    public final void evictAll() throws IOException {
        o oVar = this.cache;
        synchronized (oVar) {
            try {
                oVar.i();
                Collection collectionValues = oVar.i.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                for (j jVar : (j[]) collectionValues.toArray(new j[0])) {
                    Intrinsics.h(jVar);
                    oVar.p(jVar);
                }
                oVar.o = false;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.cache.flush();
    }

    public final Response get$okhttp(@NotNull j1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        g gVar = Companion;
        x0 x0Var = request.f281095a;
        gVar.getClass();
        try {
            k snapshot = this.cache.h(g.a(x0Var));
            if (snapshot != null) {
                try {
                    a aVar = new a((s0) snapshot.f298550c.get(0));
                    String method = aVar.f226111c;
                    u0 cachedRequest = aVar.f226110b;
                    x0 url2 = aVar.f226109a;
                    Intrinsics.checkNotNullParameter(snapshot, "snapshot");
                    u0 u0Var = aVar.f226112g;
                    String strA = u0Var.a("Content-Type");
                    String strA2 = u0Var.a("Content-Length");
                    Intrinsics.checkNotNullParameter(url2, "url");
                    Intrinsics.checkNotNullParameter(cachedRequest, "headers");
                    Intrinsics.checkNotNullParameter(method, "method");
                    i1 i1Var = new i1();
                    Intrinsics.checkNotNullParameter(url2, "url");
                    i1Var.f281089a = url2;
                    Intrinsics.checkNotNullParameter(cachedRequest, "headers");
                    cachedRequest.getClass();
                    i1Var.f281091c = ue8.c.m(cachedRequest);
                    i1Var.c(!Intrinsics.f(method, "\u0000") ? method : "GET", null);
                    j1 request2 = new j1(i1Var);
                    Response.a aVar2 = new Response.a();
                    Intrinsics.checkNotNullParameter(request2, "request");
                    aVar2.f226099a = request2;
                    aVar2.d(aVar.d);
                    aVar2.f226101c = aVar.e;
                    String message = aVar.f;
                    Intrinsics.checkNotNullParameter(message, "message");
                    aVar2.d = message;
                    aVar2.c(u0Var);
                    f body = new f(snapshot, strA, strA2);
                    Intrinsics.checkNotNullParameter(body, "body");
                    aVar2.f226102g = body;
                    aVar2.e = aVar.f226113h;
                    aVar2.f226105l = aVar.i;
                    aVar2.f226106m = aVar.f226114j;
                    Response cachedResponse = aVar2.a();
                    Intrinsics.checkNotNullParameter(request, "request");
                    Intrinsics.checkNotNullParameter(cachedResponse, "response");
                    if (url2.equals(request.f281095a) && Intrinsics.f(method, request.f281096b)) {
                        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
                        Intrinsics.checkNotNullParameter(cachedRequest, "cachedRequest");
                        Intrinsics.checkNotNullParameter(request, "newRequest");
                        Set<String> setC = g.c(cachedResponse.f);
                        if (!(setC instanceof Collection) || !setC.isEmpty()) {
                            for (String name : setC) {
                                Intrinsics.checkNotNullParameter(name, "name");
                                List listR = ue8.c.r(cachedRequest, name);
                                Intrinsics.checkNotNullParameter(name, "name");
                                u0 u0Var2 = request.f281097c;
                                u0Var2.getClass();
                                Intrinsics.checkNotNullParameter(name, "name");
                                if (!Intrinsics.f(listR, ue8.c.r(u0Var2, name))) {
                                }
                            }
                        }
                        return cachedResponse;
                    }
                    vlm.h.f(cachedResponse.f226090g);
                    return null;
                } catch (IOException unused) {
                    vlm.h.f(snapshot);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: getCache$okhttp, reason: from getter */
    public final o getCache() {
        return this.cache;
    }

    /* JADX INFO: renamed from: getWriteAbortCount$okhttp, reason: from getter */
    public final int getWriteAbortCount() {
        return this.writeAbortCount;
    }

    /* JADX INFO: renamed from: getWriteSuccessCount$okhttp, reason: from getter */
    public final int getWriteSuccessCount() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() throws IOException {
        this.cache.i();
    }

    public final boolean isClosed() {
        boolean z;
        o oVar = this.cache;
        synchronized (oVar) {
            z = oVar.f298565n;
        }
        return z;
    }

    public final long maxSize() {
        long j2;
        o oVar = this.cache;
        synchronized (oVar) {
            j2 = oVar.f298559c;
        }
        return j2;
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    public final wlm.d put$okhttp(@NotNull Response response) {
        h hVarG;
        Intrinsics.checkNotNullParameter(response, "response");
        j1 j1Var = response.f226087a;
        String str = j1Var.f281096b;
        if (nim.a.t(str)) {
            try {
                remove$okhttp(j1Var);
            } catch (IOException unused) {
            }
            return null;
        }
        if (str.equals("GET")) {
            Companion.getClass();
            Intrinsics.checkNotNullParameter(response, "<this>");
            if (!g.c(response.f).contains("*")) {
                a aVar = new a(response);
                try {
                    o oVar = this.cache;
                    String strA = g.a(j1Var.f281095a);
                    wlm.g gVar = o.Companion;
                    hVarG = oVar.g(-1L, strA);
                    if (hVarG != null) {
                        try {
                            aVar.c(hVarG);
                            return new ulm.j(this, hVarG);
                        } catch (IOException unused2) {
                            abortQuietly(hVarG);
                            return null;
                        }
                    }
                } catch (IOException unused3) {
                    hVarG = null;
                }
            }
        }
        return null;
    }

    public final void remove$okhttp(@NotNull j1 request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        o oVar = this.cache;
        g gVar = Companion;
        x0 x0Var = request.f281095a;
        gVar.getClass();
        oVar.o(g.a(x0Var));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i) {
        this.writeAbortCount = i;
    }

    public final void setWriteSuccessCount$okhttp(int i) {
        this.writeSuccessCount = i;
    }

    public final long size() throws IOException {
        long j2;
        o oVar = this.cache;
        synchronized (oVar) {
            oVar.i();
            j2 = oVar.f298560g;
        }
        return j2;
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(@NotNull wlm.f cacheStrategy) {
        try {
            Intrinsics.checkNotNullParameter(cacheStrategy, "cacheStrategy");
            this.requestCount++;
            if (cacheStrategy.f298536a != null) {
                this.networkCount++;
            } else if (cacheStrategy.f298537b != null) {
                this.hitCount++;
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public final void update$okhttp(@NotNull Response cached, @NotNull Response network) {
        h hVarG;
        Intrinsics.checkNotNullParameter(cached, "cached");
        Intrinsics.checkNotNullParameter(network, "network");
        a aVar = new a(network);
        ResponseBody responseBody = cached.f226090g;
        Intrinsics.i(responseBody, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        k kVar = ((f) responseBody).f;
        try {
            hVarG = kVar.d.g(kVar.f298549b, kVar.f298548a);
            if (hVarG == null) {
                return;
            }
            try {
                aVar.c(hVarG);
                hVarG.b();
            } catch (IOException unused) {
                abortQuietly(hVarG);
            }
        } catch (IOException unused2) {
            hVarG = null;
        }
    }

    @NotNull
    public final Iterator<String> urls() throws IOException {
        return new ulm.k(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(@NotNull s fileSystem, @NotNull h0 directory, long j2) {
        this(directory, j2, fileSystem, d.f307058l);
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(directory, "directory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(@NotNull File directory, long j2) {
        this(s.f207307a, g0.b(h0.Companion, directory), j2);
        Intrinsics.checkNotNullParameter(directory, "directory");
    }
}
