package aem;

import java.nio.charset.Charset;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes23.dex */
public final class m0 extends gim.i implements Function3 {
    public /* synthetic */ Object u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f3748w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Charset f3749x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(String str, Charset charset, Continuation continuation) {
        super(3, continuation);
        this.f3748w = str;
        this.f3749x = charset;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        m0 m0Var = new m0(this.f3748w, this.f3749x, (Continuation) obj4);
        m0Var.u = (fem.d) obj2;
        m0Var.v = obj3;
        return m0Var.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Charset charset;
        fem.d dVar = (fem.d) this.u;
        Object obj3 = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Logger logger = p0.f3764a;
        kem.s sVar = dVar.f134659c;
        kem.k0 k0Var = dVar.f134657a;
        List list = kem.u.f183239a;
        if (sVar.g("Accept-Charset") == null) {
            Logger logger2 = p0.f3764a;
            StringBuilder sb6 = new StringBuilder("Adding Accept-Charset=");
            String value = this.f3748w;
            sb6.append(value);
            sb6.append(" to ");
            sb6.append(k0Var);
            logger2.trace(sb6.toString());
            kem.s sVar2 = dVar.f134659c;
            sVar2.getClass();
            Intrinsics.checkNotNullParameter("Accept-Charset", "name");
            Intrinsics.checkNotNullParameter(value, "value");
            sVar2.i(value);
            List listF = sVar2.f("Accept-Charset");
            listF.clear();
            listF.add(value);
        }
        if (!(obj3 instanceof String)) {
            return null;
        }
        kem.i iVarL = a1m.e.l(dVar);
        if (iVarL != null && !Intrinsics.f(iVarL.f183202c, kem.h.f183201a.f183202c)) {
            return null;
        }
        String str = (String) obj3;
        kem.i iVar = iVarL == null ? kem.h.f183201a : iVarL;
        if (iVarL == null || (charset = a1m.e.k(iVarL)) == null) {
            charset = this.f3749x;
        }
        p0.f3764a.trace("Sending request body to " + k0Var + " as text/plain with charset " + charset);
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new nem.h(str, iVar.b("charset", a1m.e.w(charset)));
    }
}
