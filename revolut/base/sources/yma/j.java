package yma;

import android.os.SystemClock;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.data.model.Data;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f314916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f314917b;

    public /* synthetic */ j(p pVar, int i) {
        this.f314916a = i;
        this.f314917b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f314916a;
        int i2 = 5;
        p pVar = this.f314917b;
        switch (i) {
            case 0:
                pVar.i.onNext(new Data(null, null, true, 3, null));
                return Unit.f186387a;
            case 1:
                sf0.h hVar = pVar.f;
                c cVar = pVar.d;
                ServerError serverErrorA = hVar.a((Throwable) obj2);
                numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
                g gVar = (g) cVar;
                gVar.f314912h.getValue(gVar, g.k[5]).set(Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0));
                ((g) cVar).y0().set(d.ERROR);
                return Unit.f186387a;
            case 2:
                String email = (String) obj2;
                Intrinsics.checkNotNullParameter(email, "email");
                pfm.a aVarL = pVar.e.l(email);
                g gVar2 = (g) pVar.d;
                te0.e value = gVar2.i.getValue(gVar2, g.k[6]);
                pVar.f314926g.getClass();
                efm.b bVarH = aVarL.e(value.b(Long.valueOf(SystemClock.elapsedRealtime())).ignoreElements()).e(gVar2.y0().b(d.CHECK_EMAIL).ignoreElements()).h(sjg.a.b(pVar.f314927h));
                Intrinsics.checkNotNullExpressionValue(bVarH, "compose(...)");
                pfm.z zVar = new pfm.z(ue0.e.w(bVarH, new j(pVar, i2)), i, new a68.f(20), numValueOf);
                Intrinsics.checkNotNullExpressionValue(zVar, "toSingle(...)");
                return zVar;
            case 3:
                String confirmationCode = (String) obj2;
                Intrinsics.checkNotNullParameter(confirmationCode, "confirmationCode");
                if (!kotlin.text.d0.W(confirmationCode)) {
                    ((g) pVar.d).y0().set(d.CODE_CONFIRMATION);
                }
                return Unit.f186387a;
            case 4:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                g gVar3 = (g) pVar.d;
                te0.j jVar = gVar3.e;
                KProperty[] kPropertyArr = g.k;
                te0.e value2 = jVar.getValue(gVar3, kPropertyArr[2]);
                String str = user.f116411g;
                if (str == null) {
                    str = "";
                }
                value2.set(str);
                te0.e eVarX0 = gVar3.x0();
                String str2 = user.f116411g;
                eVarX0.set(str2 != null ? str2 : "");
                gVar3.f314911g.getValue(gVar3, kPropertyArr[4]).set(Boolean.valueOf(user.f116412h));
                return Unit.f186387a;
            case 5:
                c cVar2 = pVar.d;
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                ServerError serverErrorA2 = pVar.f.a(error);
                numValueOf = serverErrorA2 != null ? Integer.valueOf(serverErrorA2.f51362a) : null;
                g gVar4 = (g) cVar2;
                gVar4.f314912h.getValue(gVar4, g.k[5]).set(Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0));
                ((g) cVar2).y0().set(d.ERROR);
                return Boolean.TRUE;
            case 6:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                long jLongValue = ((Number) pair.f186385a).longValue();
                Boolean bool = (Boolean) pair.f186386b;
                bool.booleanValue();
                pVar.f314926g.getClass();
                long jElapsedRealtime = 60000 - (SystemClock.elapsedRealtime() - jLongValue);
                return jElapsedRealtime >= 0 ? new Pair(Long.valueOf(jElapsedRealtime), bool) : new Pair(-1L, bool);
            case 7:
                pVar.i.onNext(new Data(null, (Throwable) obj2, false, 5, null));
                return Unit.f186387a;
            case 8:
                String code = (String) obj2;
                Intrinsics.checkNotNullParameter(code, "code");
                efm.b bVarH2 = pVar.e.n(code).h(sjg.a.b(pVar.f314927h));
                Intrinsics.checkNotNullExpressionValue(bVarH2, "compose(...)");
                int i3 = 1;
                pfm.t tVarM = efm.b.q(bVarH2, efm.b.A(2L, TimeUnit.SECONDS, hhm.f.f152431c)).l(new k(pVar, i3)).m(new yj2.a(23, new j(pVar, i3)));
                Intrinsics.checkNotNullExpressionValue(tVarM, "doOnError(...)");
                return ue0.e.v(tVarM);
            default:
                String email2 = (String) obj2;
                Intrinsics.checkNotNullParameter(email2, "email");
                return pVar.f314928j.c(email2);
        }
    }
}
