package ul8;

import cli.y;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s7a.a0;
import s7a.c0;
import vkm.j2;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280906a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number.a f280907b;

    public /* synthetic */ h(com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number.a aVar) {
        this.f280907b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        int i = this.f280906a;
        com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number.a aVar = this.f280907b;
        switch (i) {
            case 0:
                a0 result = (a0) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                c0 c0Var = result.f260599a;
                Intrinsics.i(c0Var, "null cannot be cast to non-null type com.revolut.feature.picker.result.CountryPickerControllerResult");
                String str = ((c8a.a) c0Var).f22154a;
                wi0.b.Companion.getClass();
                wi0.b bVarA = wi0.a.a(str);
                y yVar = aVar.f77209r;
                if (!bVarA.equals(((e) ((j2) yVar.f22677a).getValue()).f280902a)) {
                    String strJ = aVar.f77207p.j(bVarA);
                    if (!kotlin.text.a0.H(strJ, "+", false)) {
                        strJ = "+".concat(strJ);
                    }
                    aVar.H2(yVar, new toh.h(bVarA, 22, strJ, aVar));
                }
                return Unit.f186387a;
            default:
                y yVar2 = aVar.f77209r;
                dii.g outputData = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if ((outputData instanceof dii.b) || (outputData instanceof dii.c) || (outputData instanceof dii.d)) {
                    try {
                        m.Companion companion = m.INSTANCE;
                        throw new IllegalStateException(("Unexpected output " + outputData + ".").toString());
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = m.INSTANCE;
                        Throwable thA = m.a(o.a(th10));
                        if (thA != null) {
                            hx7.e.n(thA);
                        }
                    }
                } else if (!(outputData instanceof dii.e)) {
                    if (!(outputData instanceof dii.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.C2(new f(a0.d.r(((e) ((j2) yVar2.f22677a).getValue()).f280904c, ((e) ((j2) yVar2.f22677a).getValue()).f280903b)));
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ h(com.revolut.kompot.navigable.vc.modal.a aVar, com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number.a aVar2) {
        this.f280907b = aVar2;
    }
}
