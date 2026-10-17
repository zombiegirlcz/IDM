package h74;

import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149855a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.b f149856b;

    public /* synthetic */ m(com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.b bVar) {
        this.f149856b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        int i = this.f149855a;
        com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.b bVar = this.f149856b;
        switch (i) {
            case 0:
                e54.p it8 = (e54.p) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof e54.o) {
                    bVar.l2(new h54.o(bVar, it8, null, 5), new yi5.b(26));
                } else {
                    if (!(it8 instanceof e54.n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        throw new IllegalStateException("Custom output is not supported in DocumentsContentScreenModel");
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        Throwable thA = yhm.m.a(yhm.o.a(th10));
                        if (thA != null) {
                            hx7.e.n(thA);
                        }
                    }
                }
                return Unit.f186387a;
            default:
                b74.i outputData = (b74.i) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (!Intrinsics.f(outputData, b74.g.f12889a)) {
                    if (!(outputData instanceof b74.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.l2(new h54.o(bVar, outputData, null, 6), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ m(com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.b bVar, com.revolut.kompot.navigable.vc.modal.a aVar) {
        this.f149856b = bVar;
    }
}
