package di8;

import com.revolut.feature.full_screen_prompt.c;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_onboarding.impl.ui.onboarding.b f114947b;

    public /* synthetic */ d(com.revolut.feature.junior_onboarding.impl.ui.onboarding.b bVar, int i) {
        this.f114946a = i;
        this.f114947b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        int i = this.f114946a;
        c cVar = c.f114945a;
        com.revolut.feature.junior_onboarding.impl.ui.onboarding.b bVar = this.f114947b;
        switch (i) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                bVar.C2(cVar);
                oki.h.D2(bVar.v);
                return Boolean.FALSE;
            default:
                yki.i iVar = bVar.v;
                com.revolut.feature.full_screen_prompt.c output = (com.revolut.feature.full_screen_prompt.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if ((output instanceof d67.h) || Intrinsics.f(output, c.b.f74505a) || Intrinsics.f(output, c.d.f74507a)) {
                    try {
                        m.Companion companion = m.INSTANCE;
                        throw new IllegalStateException(("Unexpected result of limit reached prompt: " + o0.f186429a.b(output.getClass()).m()).toString());
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = m.INSTANCE;
                        Throwable thA = m.a(o.a(th10));
                        if (thA != null) {
                            hx7.e.n(thA);
                        }
                        bVar.C2(cVar);
                        oki.h.D2(iVar);
                    }
                } else {
                    if (!(output instanceof c.a) && !Intrinsics.f(output, c.C0497c.f74506a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.C2(cVar);
                    oki.h.D2(iVar);
                }
                return Unit.f186387a;
        }
    }
}
