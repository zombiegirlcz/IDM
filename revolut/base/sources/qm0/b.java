package qm0;

import ch.qos.logback.core.util.FileSize;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import ulm.i1;
import ulm.j1;
import ulm.y0;
import yhm.j;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Interceptor {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tl0.a f247741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yh0.c f247742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f247743c;

    public b(tl0.a base64Wrapper, yh0.c integrityCheckTokenProvider) {
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(integrityCheckTokenProvider, "integrityCheckTokenProvider");
        this.f247741a = base64Wrapper;
        this.f247742b = integrityCheckTokenProvider;
        this.f247743c = j.b(new qh0.d(28));
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        Object objA;
        Object objA2;
        Intrinsics.checkNotNullParameter(chain, "chain");
        zlm.h hVar = (zlm.h) chain;
        j1 j1Var = hVar.e;
        Response responseB = hVar.b(j1Var);
        if (responseB.d >= 400) {
            try {
                m.Companion companion = m.INSTANCE;
                objA = (f) ((Json) this.f247743c.getValue()).b(f.Companion.serializer(), responseB.h(FileSize.KB_COEFFICIENT).string());
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            if (objA instanceof n) {
                objA = null;
            }
            f fVar = (f) objA;
            if (fVar != null) {
                String str = fVar.f247746b;
                if (fVar.f247745a == 17201) {
                    i1 i1VarB = j1Var.b();
                    od0.a aVar = od0.a.f224253a;
                    if (od0.a.e()) {
                        i1VarB.b("X-Integrity-Check", "dev-" + str);
                    } else {
                        try {
                            objA2 = ((yg0.e) this.f247742b.a(str).e()).a();
                        } catch (Throwable th11) {
                            m.Companion companion3 = m.INSTANCE;
                            objA2 = o.a(th11);
                        }
                        Throwable thA = m.a(objA2);
                        if (thA != null) {
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.WARNING, "IntegrityCheckInterceptor.kt", "Failed to get integrity check token", thA, h0Var);
                            String message = thA.getMessage();
                            if (message == null) {
                                message = "Unexpected error occurred";
                            }
                            byte[] bytes = message.getBytes(Charsets.UTF_8);
                            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                            objA2 = this.f247741a.e(bytes);
                        }
                        i1VarB.b("X-Integrity-Check", (String) objA2);
                    }
                    return hVar.b(new j1(i1VarB));
                }
            }
        }
        return responseB;
    }
}
