package aem;

import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes23.dex */
public final class n0 extends gim.i implements oim.o {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3755w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f3756x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Charset f3757y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(Charset charset, Continuation continuation) {
        super(5, continuation);
        this.f3757y = charset;
    }

    @Override // oim.o
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        n0 n0Var = new n0(this.f3757y, (Continuation) obj6);
        n0Var.v = (hem.c) obj3;
        n0Var.f3755w = (io.ktor.utils.io.t) obj4;
        n0Var.f3756x = (tem.a) obj5;
        return n0Var.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        hem.c cVar = (hem.c) this.v;
        io.ktor.utils.io.t tVar = (io.ktor.utils.io.t) this.f3755w;
        tem.a aVar = (tem.a) this.f3756x;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            if (!Intrinsics.f(aVar.f270126a, kotlin.jvm.internal.o0.f186429a.b(String.class))) {
                return null;
            }
            this.v = cVar;
            this.f3755w = null;
            this.f3756x = null;
            this.u = 1;
            obj2 = io.ktor.utils.io.n0.i(tVar, this);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        jlm.k kVar = (jlm.k) obj2;
        wdm.f fVarA = cVar.a();
        Logger logger = p0.f3764a;
        Charset charset = a1m.e.j(fVarA.d());
        if (charset == null) {
            charset = this.f3757y;
        }
        p0.f3764a.trace("Reading response body for " + fVarA.c().getUrl() + " as String with charset " + charset);
        if ((2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return Intrinsics.f(charset, Charsets.UTF_8) ? jlm.l.g(kVar) : a1m.e.o(charset.newDecoder(), kVar);
    }
}
