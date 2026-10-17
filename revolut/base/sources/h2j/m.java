package h2j;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1j.a;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a f148845b;

    public /* synthetic */ m(com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a aVar, int i) {
        this.f148844a = i;
        this.f148845b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f148844a) {
            case 0:
                l1j.a result = (l1j.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!Intrinsics.f(result, a.C1086a.f191546a)) {
                    if (!(result instanceof l1j.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str = ((l1j.b) result).f191547a;
                    xi0.b.Companion.getClass();
                    xi0.b bVarA = xi0.a.a(str);
                    com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a aVar = this.f148845b;
                    aVar.l2(new g0a.e(aVar, bVarA, bVarA, (Continuation) null, 15), new yi5.b(26));
                }
                return Unit.f186387a;
            case 1:
                r66.a result2 = (r66.a) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                String str2 = result2.f251645a;
                xi0.b.Companion.getClass();
                xi0.b bVarA2 = xi0.a.a(str2);
                com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a aVar2 = this.f148845b;
                aVar2.l2(new g0a.e(aVar2, bVarA2, bVarA2, (Continuation) null, 15), new yi5.b(26));
                return Unit.f186387a;
            case 2:
                qa7.e result3 = (qa7.e) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f148845b.J2(result3.f243975a);
                return Unit.f186387a;
            default:
                fh5.f output = (fh5.f) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output != null) {
                    com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a aVar3 = this.f148845b;
                    os2.g gVar = aVar3.B;
                    xi0.b toCurrency = output.f135151a;
                    gVar.getClass();
                    Intrinsics.checkNotNullParameter(toCurrency, "toCurrency");
                    aVar3.C1(((gud.b) gVar.f229224b).a(null, toCurrency));
                }
                return Unit.f186387a;
        }
    }
}
