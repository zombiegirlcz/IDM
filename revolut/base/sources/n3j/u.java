package n3j;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1j.a;
import mhd.o0;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d f212161b;

    public /* synthetic */ u(com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar, int i) {
        this.f212160a = i;
        this.f212161b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f212160a) {
            case 0:
                n update = (n) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return n.a(update, null, null, ((n) ((j2) this.f212161b.K.f22677a).getValue()).f212148c + 1, null, null, 59);
            case 1:
                d2k.m output = (d2k.m) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof d2k.l)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar = this.f212161b;
                dVar.L2(new o0(dVar, output, null, 13));
                return Unit.f186387a;
            case 2:
                l1j.a output2 = (l1j.a) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (!Intrinsics.f(output2, a.C1086a.f191546a)) {
                    if (!(output2 instanceof l1j.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar2 = this.f212161b;
                    dVar2.L2(new o0(dVar2, output2, null, 14));
                }
                return Unit.f186387a;
            default:
                l4j.b output3 = (l4j.b) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar3 = this.f212161b;
                dVar3.L2(new o0(dVar3, output3, null, 15));
                return Unit.f186387a;
        }
    }
}
