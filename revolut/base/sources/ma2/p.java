package ma2;

import cli.y;
import com.revolut.feature.apm.core.models.alias.Alias;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.a f203933b;

    public /* synthetic */ p(com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.a aVar, int i) {
        this.f203932a = i;
        this.f203933b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f203932a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.a aVar = this.f203933b;
                aVar.H2(aVar.f62723r, new ab4.q(it8, 27));
                return Boolean.TRUE;
            case 1:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                this.f203933b.s1();
                return Boolean.FALSE;
            default:
                com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.a aVar2 = this.f203933b;
                y yVar = aVar2.f62723r;
                oa2.h outputData = (oa2.h) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (!(outputData instanceof oa2.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                Iterator it9 = ((e) ((j2) yVar.f22677a).getValue()).f203922a.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        if (Intrinsics.f(((Alias) next).f61878a, ((oa2.g) outputData).f223507a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Alias alias = (Alias) next;
                if (alias != null) {
                    aVar2.H2(yVar, new q(alias));
                }
                return Unit.f186387a;
        }
    }
}
