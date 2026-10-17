package c2l;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.travel_status.impl.ui.flow.TravelStatusFlowContract$Step;
import g2l.k;
import i2l.v;
import i2l.w;
import i2l.x;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yki.i;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.travel_status.impl.ui.flow.b f20827b;

    public /* synthetic */ c(com.revolut.retail.feature.travel_status.impl.ui.flow.b bVar, int i) {
        this.f20826a = i;
        this.f20827b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f20826a;
        com.revolut.retail.feature.travel_status.impl.ui.flow.b bVar = this.f20827b;
        switch (i) {
            case 0:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Set setB = y0.b(new Pair("TravelStatusFlowModel", "Error while fetching product article ID"));
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, setB);
                bVar.K2();
                return Boolean.TRUE;
            case 1:
                k output = (k) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output == null) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.u2(bVar, bVar.f104313r, new TravelStatusFlowContract$Step.Partner(output.f140142a), null, 6);
                return Unit.f186387a;
            case 2:
                i iVar = bVar.f104313r;
                x output2 = (x) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof w) {
                    w wVar = (w) output2;
                    oki.h.w2(iVar, new TravelStatusFlowContract$Step.PartnerActionBottomSheet(wVar.f158051b, wVar.f158052c, wVar.f158050a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else {
                    if (!(output2 instanceof v)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    v vVar = (v) output2;
                    oki.h.u2(bVar, iVar, new TravelStatusFlowContract$Step.Enrollment(vVar.f158048a, vVar.f158049b), null, 6);
                }
                return Unit.f186387a;
            default:
                yja.b result = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                int i2 = d.f20828a[result.ordinal()];
                if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                    bVar.K2();
                } else {
                    oki.h.D2(bVar.f104313r);
                }
                return Unit.f186387a;
        }
    }
}
