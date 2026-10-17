package dwf;

import com.revolut.feature.transport.api.navigation.TransportStartType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.transport.impl.ui.hub.ticket_details.b f120384b;

    public /* synthetic */ j(com.revolut.feature.transport.impl.ui.hub.ticket_details.b bVar, int i) {
        this.f120383a = i;
        this.f120384b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f120383a) {
            case 0:
                dii.g outputData = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof dii.e) {
                    this.f120384b.I2(TransportStartType.Hub.Transit.f92499a);
                }
                return Unit.f186387a;
            case 1:
                ((Long) obj2).getClass();
                com.revolut.feature.transport.impl.ui.hub.ticket_details.b bVar = this.f120384b;
                bVar.H2(bVar.v, new j(bVar, 2));
                return Unit.f186387a;
            default:
                f update = (f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return f.a(update, null, null, null, ((l80.f) this.f120384b.f92536t).f(), 7);
        }
    }
}
