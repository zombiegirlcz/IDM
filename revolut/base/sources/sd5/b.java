package sd5;

import efm.d0;
import java.net.URI;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import rvc.k;
import s06.e;
import sc7.g;
import ufm.i;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f261825a;

    public b(c cryptoConfigInteractor) {
        Intrinsics.checkNotNullParameter(cryptoConfigInteractor, "cryptoConfigInteractor");
        this.f261825a = cryptoConfigInteractor;
    }

    public final i a(xi0.b currency, wk5.a blockchain, String transactionHash) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        Intrinsics.checkNotNullParameter(transactionHash, "transactionHash");
        return c(currency, blockchain, new k(transactionHash, 22));
    }

    public final String b(String explorerUrl) {
        Object objA;
        Intrinsics.checkNotNullParameter(explorerUrl, "explorerUrl");
        try {
            m.Companion companion = m.INSTANCE;
            String authority = URI.create(explorerUrl).getAuthority();
            objA = authority != null ? a0.D(authority, "www.", "", false) : null;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        return (String) (objA instanceof n ? null : objA);
    }

    public final i c(xi0.b bVar, wk5.a aVar, Function1 function1) {
        d0 d0VarFirstOrError = m70.a.g(zi0.c.J(this.f261825a.a(false)), null, new sa5.a(13), 1).firstOrError();
        g gVar = new g(new e(aVar, 10, function1, bVar), 17);
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, gVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
