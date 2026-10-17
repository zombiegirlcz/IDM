package wdm;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public class f implements CoroutineScope {

    @NotNull
    public static final d Companion = new d();
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    public static final oem.a e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vdm.b f296601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fem.b f296602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hem.c f296603c;

    @NotNull
    private volatile /* synthetic */ int received;

    static {
        KType kTypeB;
        KClass kClassB = o0.f186429a.b(Object.class);
        try {
            kTypeB = o0.b(Object.class);
        } catch (Throwable unused) {
            kTypeB = null;
        }
        e = new oem.a("CustomResponse", new tem.a(kClassB, kTypeB));
        d = AtomicIntegerFieldUpdater.newUpdater(f.class, "received");
    }

    public f(vdm.b client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f296601a = client;
        this.received = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        if (r9 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(tem.a r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wdm.f.a(tem.a, gim.c):java.lang.Object");
    }

    public boolean b() {
        return false;
    }

    public final fem.b c() {
        fem.b bVar = this.f296602b;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("request");
        throw null;
    }

    public final hem.c d() {
        hem.c cVar = this.f296603c;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("response");
        throw null;
    }

    public final oem.e getAttributes() {
        return c().getAttributes();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return d().getCoroutineContext();
    }

    public final String toString() {
        return "HttpClientCall[" + c().getUrl() + ", " + d().e() + ']';
    }
}
