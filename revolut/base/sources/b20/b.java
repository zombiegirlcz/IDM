package b20;

import av7.l;
import com.revolut.chat.data.network.interceptor.ChatNotAuthorizedException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import mm0.o;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import ulm.i1;
import ulm.j1;
import ulm.y0;
import zlm.h;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Interceptor {

    @NotNull
    public static final a Companion = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t20.d f11850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tf3.b f11851b;

    public b(t20.d chatAuthentication, tf3.b chatAuthorizationStatus) {
        Intrinsics.checkNotNullParameter(chatAuthentication, "chatAuthentication");
        Intrinsics.checkNotNullParameter(chatAuthorizationStatus, "chatAuthorizationStatus");
        this.f11850a = chatAuthentication;
        this.f11851b = chatAuthorizationStatus;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) throws ChatNotAuthorizedException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        t20.c cVar = (t20.c) e0.E(g.f186406a, new l(this, null, 7));
        String strB = cVar != null ? cVar.b() : null;
        if (strB == null) {
            j1 j1Var = ((h) chain).e;
            tf3.b bVar = this.f11851b;
            StringBuilder sbT = p.a.t(j1Var.f281096b, " ", j1Var.f281095a.b(), " [", "userAuthorised=" + bVar.b() + ", loginInProgress=" + (((cn0.g) bVar.f270223a).d() instanceof o.a) + ", anonymousAllowed=true");
            sbT.append("]");
            throw new ChatNotAuthorizedException(sbT.toString());
        }
        String strConcat = "Bearer ".concat(strB);
        h hVar = (h) chain;
        i1 i1VarB = hVar.e.b();
        i1VarB.a("Authorization", strConcat);
        j1 j1Var2 = new j1(i1VarB);
        Response responseB = hVar.b(j1Var2);
        int i = responseB.d;
        if (400 <= i && i < 500) {
            String strB2 = j1Var2.f281095a.b();
            String strQ = j6.a.q("***", f0.V0(4, cVar.b()));
            String strName = cVar.a().b().name();
            String strA = cVar.a().a();
            if (strA == null) {
                strA = "N/A";
            }
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.c cVar2 = rd0.c.WARNING;
            StringBuilder sb6 = new StringBuilder("ChatAPI4xx: code=");
            sb6.append(i);
            sb6.append(" path=");
            sb6.append(strB2);
            sb6.append(" chatToken=");
            j6.a.D(sb6, strQ, " auth(source=", strName, " revToken=");
            rd0.d.b(cVar2, "AuthHeaderInterceptor", v0.a.i(sb6, strA, ")"), null, null, 16);
        }
        return responseB;
    }
}
