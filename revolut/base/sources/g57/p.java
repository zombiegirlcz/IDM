package g57;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.a f140684b;

    public /* synthetic */ p(com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.a aVar, int i) {
        this.f140683a = i;
        this.f140684b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f140683a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                od0.i iVar = (od0.i) pair.f186385a;
                fs6.e eVar = (fs6.e) pair.f186386b;
                com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.a aVar = this.f140684b;
                aVar.H2(aVar.f74444q, new g48.j(aVar, iVar, eVar));
                return new f(iVar, eVar);
            case 1:
                z47.c result = (z47.c) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.a aVar2 = this.f140684b;
                aVar2.H2(aVar2.f74444q, new g4k.e(result, 2));
                return Unit.f186387a;
            default:
                b57.c result2 = (b57.c) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.a aVar3 = this.f140684b;
                aVar3.H2(aVar3.f74444q, new g4k.e(result2, 3));
                return Unit.f186387a;
        }
    }
}
