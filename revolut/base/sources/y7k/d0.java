package y7k;

import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1j.e;
import nii.n1;
import y20.a1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a f311538b;

    public /* synthetic */ d0(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar, int i) {
        this.f311537a = i;
        this.f311538b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f311537a) {
            case 0:
                x it8 = (x) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f311538b.C2(it8);
                return Unit.f186387a;
            case 1:
                Intrinsics.checkNotNullParameter((n1) obj2, "it");
                this.f311538b.C2(v.f311581a);
                return Unit.f186387a;
            case 2:
                x it9 = (x) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                this.f311538b.C2(it9);
                return Unit.f186387a;
            case 3:
                h1j.b output = (h1j.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof h1j.c) {
                    com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar = this.f311538b;
                    aVar.l2(new a1(aVar, ((h1j.c) output).f148579a, null, 11), new yi5.b(26));
                }
                return Unit.f186387a;
            case 4:
                l1j.e output2 = (l1j.e) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (!(output2 instanceof e.a)) {
                    if (!(output2 instanceof l1j.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l1j.f fVar = (l1j.f) output2;
                    String str = fVar.e;
                    String str2 = fVar.f191552a;
                    com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar2 = this.f311538b;
                    aVar2.l2(new xkl.e((yji.l) aVar2, fVar.f191554c, str2, str, fVar.d, (Continuation) null, 4), new yi5.b(26));
                }
                return Unit.f186387a;
            case 5:
                ExchangeGlobalAccessOutput result = (ExchangeGlobalAccessOutput) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof ExchangeGlobalAccessOutput.FeatureAvailable) {
                    com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar3 = this.f311538b;
                    aVar3.l2(new m0(aVar3, null, 0), new yi5.b(26));
                }
                return Unit.f186387a;
            default:
                Intrinsics.checkNotNullParameter((n1) obj2, "it");
                this.f311538b.C2(v.f311581a);
                return Unit.f186387a;
        }
    }
}
