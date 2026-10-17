package xh5;

import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import ji5.e;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import pd.b;
import te0.w;
import yh5.d;

/* JADX INFO: loaded from: classes3.dex */
public interface a {
    static d0 a(a aVar, NaviCommand command) {
        e eVar = (e) aVar;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(command, "command");
        d.a entryPoint = d.a.f313774a;
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        d0 d0VarFirstOrError = w.a0(m70.a.g(b.s(kli.a.h(eVar.f(), rd0.e.c(eVar.f174357b.a(false), g.f186406a)), new je2.d(eVar, command, 16)), null, null, 3), new jhi.a(15)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }
}
