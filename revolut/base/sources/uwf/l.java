package uwf;

import cli.n;
import cli.y;
import com.revolut.feature.transport.impl.ui.transit_checkout.passenger_details.PassengerDetailsScreenContract$InputData;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import up2.q;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends oki.h implements j {
    public final swf.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f283664p;

    public l(swf.b transitCheckoutFieldExtension, n stateMapper, PassengerDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(transitCheckoutFieldExtension, "transitCheckoutFieldExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = transitCheckoutFieldExtension;
        this.f283664p = mra.d.b(this, new h(inputData.f92585b, inputData.f92584a, f0.f322471a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        y yVar = this.f283664p;
        List list = ((h) ((j2) yVar.f22677a).getValue()).f283658a;
        Map map = ((h) ((j2) yVar.f22677a).getValue()).f283659b;
        swf.b bVar = this.o;
        bVar.i3(list, map);
        yji.l.a1(this, bVar.Z2(), null, null, new q(this, null, 9), 3);
    }

    public final void I2() {
        y yVar = this.f283664p;
        C2(new i(new swf.a(((h) ((j2) yVar.f22677a).getValue()).f283659b, ((h) ((j2) yVar.f22677a).getValue()).f283660c.isEmpty())));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f283664p;
    }
}
