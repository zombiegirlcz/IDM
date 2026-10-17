package u13;

import com.revolut.feature.card_order_new.impl.delivery.api.repository.network.DeliveryService;
import efm.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.bouncycastle.asn1.BERTags;
import tc7.m0;
import ufm.i;
import wim.z;

/* JADX INFO: loaded from: classes13.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeliveryService f276343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f276344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f276345c;
    public final w4l.f d;

    public g(DeliveryService deliveryService, ne0.d deliveryMemoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(deliveryService, "deliveryService");
        Intrinsics.checkNotNullParameter(deliveryMemoryCache, "deliveryMemoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f276343a = deliveryService;
        this.f276344b = deliveryMemoryCache;
        this.f276345c = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: u13.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f276335b;

            {
                this.f276335b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                g gVar = this.f276335b;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        c params = (c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<v13.c> deliveryDetails = gVar.f276343a.getDeliveryDetails(params.h(), params.e(), params.b(), params.c(), params.i(), params.g(), params.j(), params.f(), params.d(), null);
                        d dVar = d.f;
                        m0 m0Var = new m0();
                        deliveryDetails.getClass();
                        i iVar = new i(deliveryDetails, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        c params2 = (c) obj2;
                        d93.d value = (d93.d) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(value, "value");
                        gVar.f276344b.f(params2.a(), value);
                        break;
                    default:
                        c params3 = (c) obj2;
                        d93.d value2 = (d93.d) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        gVar.f276345c.G(v13.d.V(value2), params3.a(), z.d(o0.b(v13.c.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: u13.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f276337b;

            {
                this.f276337b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                c params = (c) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d93.d) this.f276337b.f276344b.get(params.a());
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        v13.c cVar = (v13.c) this.f276337b.f276345c.T2(params.a(), h.a());
                        if (cVar != null) {
                            return v13.d.B(cVar);
                        }
                        return null;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: u13.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f276335b;

            {
                this.f276335b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i2;
                g gVar = this.f276335b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        c params = (c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<v13.c> deliveryDetails = gVar.f276343a.getDeliveryDetails(params.h(), params.e(), params.b(), params.c(), params.i(), params.g(), params.j(), params.f(), params.d(), null);
                        d dVar = d.f;
                        m0 m0Var = new m0();
                        deliveryDetails.getClass();
                        i iVar = new i(deliveryDetails, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        c params2 = (c) obj2;
                        d93.d value = (d93.d) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(value, "value");
                        gVar.f276344b.f(params2.a(), value);
                        break;
                    default:
                        c params3 = (c) obj2;
                        d93.d value2 = (d93.d) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        gVar.f276345c.G(v13.d.V(value2), params3.a(), z.d(o0.b(v13.c.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: u13.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f276337b;

            {
                this.f276337b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                c params = (c) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d93.d) this.f276337b.f276344b.get(params.a());
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        v13.c cVar = (v13.c) this.f276337b.f276345c.T2(params.a(), h.a());
                        if (cVar != null) {
                            return v13.d.B(cVar);
                        }
                        return null;
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: u13.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f276335b;

            {
                this.f276335b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i3;
                g gVar = this.f276335b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        c params = (c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<v13.c> deliveryDetails = gVar.f276343a.getDeliveryDetails(params.h(), params.e(), params.b(), params.c(), params.i(), params.g(), params.j(), params.f(), params.d(), null);
                        d dVar = d.f;
                        m0 m0Var = new m0();
                        deliveryDetails.getClass();
                        i iVar = new i(deliveryDetails, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        c params2 = (c) obj2;
                        d93.d value = (d93.d) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(value, "value");
                        gVar.f276344b.f(params2.a(), value);
                        break;
                    default:
                        c params3 = (c) obj2;
                        d93.d value2 = (d93.d) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        gVar.f276345c.G(v13.d.V(value2), params3.a(), z.d(o0.b(v13.c.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
