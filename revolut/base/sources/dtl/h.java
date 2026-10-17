package dtl;

import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f117472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InvestOrder f117473c;

    public /* synthetic */ h(m mVar, InvestOrder investOrder, int i) {
        this.f117471a = i;
        this.f117472b = mVar;
        this.f117473c = investOrder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f117471a;
        InvestOrder investOrder = this.f117473c;
        m mVar = this.f117472b;
        switch (i) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, "Failed to cancel the order.", error, h0Var);
                mVar.L2(new y0(null, m.b3(investOrder), false, 5));
                return Boolean.TRUE;
            default:
                dii.g outputData = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (Intrinsics.f(outputData, dii.f.f115069a)) {
                    mVar.Z2(investOrder);
                }
                return Unit.f186387a;
        }
    }
}
