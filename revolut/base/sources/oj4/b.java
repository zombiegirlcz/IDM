package oj4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import d67.q;
import d67.s;
import d67.u;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import r7a.g;
import r7a.i;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.c f225726b;

    public /* synthetic */ b(com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.c cVar, int i) {
        this.f225725a = i;
        this.f225726b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f225725a;
        int i2 = 26;
        int i3 = 0;
        Continuation continuation = null;
        com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.c cVar = this.f225726b;
        switch (i) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                y0 y0Var = new y0(null, new z(new TextLocalisedClause(R$string.credit_error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5);
                com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.c cVar2 = this.f225726b;
                l.a1(cVar2, cVar2.X1(y0Var), null, null, new ocb.d(cVar2, continuation, 9), 3);
                return Boolean.TRUE;
            case 1:
                u output = (u) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof s) {
                    cVar.l2(new com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.a(cVar, null), new yi5.b(i2));
                } else if (output instanceof q) {
                    h.D2(cVar.f68529r);
                } else {
                    int i5 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 2:
                pj4.h output2 = (pj4.h) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (!Intrinsics.f(output2, pj4.h.f236667a)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.D2(cVar.f68529r);
                return Unit.f186387a;
            default:
                i output3 = (i) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (!(output3 instanceof r7a.h) && !(output3 instanceof r7a.e) && !(output3 instanceof r7a.f) && !(output3 instanceof g)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar.l2(new c(cVar, continuation, i3), new yi5.b(i2));
                return Unit.f186387a;
        }
    }
}
