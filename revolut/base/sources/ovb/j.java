package ovb;

import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import java.time.Instant;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d f230020b;

    public /* synthetic */ j(com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d dVar, int i) {
        this.f230019a = i;
        this.f230020b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f230019a) {
            case 0:
                e update = (e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d dVar = this.f230020b;
                dVar.f83608s.getClass();
                UUID uuidA = od0.j.a(Instant.now());
                Intrinsics.checkNotNullExpressionValue(uuidA, "generate(...)");
                String string = uuidA.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return e.a(update, null, null, null, null, string, null, dVar.u.a(), 47);
            default:
                AddressFlowContract$OutputData it8 = (AddressFlowContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d dVar2 = this.f230020b;
                dVar2.H2(dVar2.f83612y, new da8.l(it8, 3));
                return Unit.f186387a;
        }
    }
}
