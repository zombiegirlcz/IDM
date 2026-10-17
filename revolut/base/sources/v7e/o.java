package v7e;

import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286606a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f286607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi0.b f286608c;
    public final /* synthetic */ ChosenBackground d;

    public /* synthetic */ o(u uVar, ChosenBackground chosenBackground, xi0.b bVar) {
        this.f286607b = uVar;
        this.d = chosenBackground;
        this.f286608c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        f fVar;
        switch (this.f286606a) {
            case 0:
                xi0.b currency = this.f286608c;
                g updateState = (g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                Data data2 = ((g) this.f286607b.t2()).e;
                try {
                    Object content = data2.getContent();
                    if (content != null) {
                        f fVar2 = (f) content;
                        List list = fVar2.f286588b;
                        boolean z = fVar2.f286589c;
                        boolean z3 = fVar2.d;
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        fVar = new f(currency, list, z, z3);
                    } else {
                        fVar = null;
                    }
                    data = new Data(fVar, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                return g.a(updateState, null, this.d, null, data, 11);
            default:
                ExchangeGlobalAccessOutput result = (ExchangeGlobalAccessOutput) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof ExchangeGlobalAccessOutput.FeatureAvailable) {
                    u uVar = this.f286607b;
                    uVar.x2(new o(uVar, this.d, this.f286608c));
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ o(u uVar, xi0.b bVar, ChosenBackground chosenBackground) {
        this.f286607b = uVar;
        this.f286608c = bVar;
        this.d = chosenBackground;
    }
}
