package pf9;

import com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlowContract$OutputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pdi.j;
import vkm.j2;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f235526b;

    public /* synthetic */ a(e eVar, int i) {
        this.f235525a = i;
        this.f235526b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object value;
        String str;
        switch (this.f235525a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                e eVar = this.f235526b;
                n.j2(eVar, eVar.L2(eVar.o.b(it8)), null, null, 7);
                return Boolean.TRUE;
            case 1:
                pm1.a output = (pm1.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output == null) {
                    throw new NoWhenBranchMatchedException();
                }
                j2 j2Var = this.f235526b.u;
                do {
                    value = j2Var.getValue();
                } while (!j2Var.h(value, h.a((h) value, null, null, output.f237442a, 3)));
                return Unit.f186387a;
            case 2:
                BarcodeReaderFlowContract$OutputData output2 = (BarcodeReaderFlowContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if ((output2 instanceof BarcodeReaderFlowContract$OutputData.Success) && (str = ((BarcodeReaderFlowContract$OutputData.Success) output2).f50756a.f51390a) != null) {
                    ap1.b bVar = new ap1.b(jli.g.f(str));
                    e eVar2 = this.f235526b;
                    eVar2.T2(new j(eVar2, bVar, null, 5), new p5e.h(eVar2, bVar, 16));
                }
                return Unit.f186387a;
            default:
                jg9.a aVar = (jg9.a) obj2;
                if (aVar != null) {
                    this.f235526b.o3(aVar.f173935a, aVar.f173936b);
                }
                return Unit.f186387a;
        }
    }
}
