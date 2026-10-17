package q22;

import cli.y;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s7a.a0;
import s7a.c0;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.new_contact.a f241496b;

    public /* synthetic */ l(com.revolut.feature.apm.core.ui.impl.ui.new_contact.a aVar, int i) {
        this.f241495a = i;
        this.f241496b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f241495a;
        Continuation continuation = null;
        com.revolut.feature.apm.core.ui.impl.ui.new_contact.a aVar = this.f241496b;
        switch (i) {
            case 0:
                aVar.l2(new jkh.g(25, continuation, aVar, ((Boolean) obj2).booleanValue()), new yi5.b(26));
                break;
            case 1:
                y yVar = aVar.u;
                a0 data = (a0) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                c0 c0Var = data.f260599a;
                c8a.a aVar2 = c0Var instanceof c8a.a ? (c8a.a) c0Var : null;
                String str = aVar2 != null ? aVar2.f22154a : null;
                if (str != null) {
                    wi0.b.Companion.getClass();
                    wi0.b countryCode = wi0.a.a(str);
                    if (!countryCode.equals(((a) ((j2) yVar.f22677a).getValue()).f241484b)) {
                        kge.d dVar = aVar.f62351p;
                        dVar.getClass();
                        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                        aVar.H2(yVar, new ho2.i(3, ((z80.b) dVar.f183975c).j(countryCode), countryCode));
                    }
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("APM NewContact: unexpected result when changing country: resultType=".concat(c0Var.getClass().getSimpleName()));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                break;
            default:
                u22.c output = (u22.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                aVar.f62352q.x(output.f276542a, aVar.o.f62248c);
                break;
        }
        return Unit.f186387a;
    }
}
