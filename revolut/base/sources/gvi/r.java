package gvi;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.AsftTravellerDetailsScreenContract$DomainState$TravellerDetails;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.AsftTravellerDetailsScreenContract$InputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import vkm.z1;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends oki.h implements l, gui.g {
    public final AsftTravellerDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ang.f f147196p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f147197q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gui.j f147198r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f147199s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f147200t;

    public r(AsftTravellerDetailsScreenContract$InputData inputData, cli.n stateMapper, ang.f userInteractor, a inputFieldIdentifierMapper, gui.j purchaseExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(inputFieldIdentifierMapper, "inputFieldIdentifierMapper");
        Intrinsics.checkNotNullParameter(purchaseExtension, "purchaseExtension");
        this.o = inputData;
        this.f147196p = userInteractor;
        this.f147197q = inputFieldIdentifierMapper;
        this.f147198r = purchaseExtension;
        this.f147199s = new vii.b();
        if (inputData.f98906a == 0) {
            r6.b.D("Amount of additional travellers must be greater than 0");
        }
        IntRange intRangeO = kotlin.ranges.f.o(0, inputData.f98906a);
        ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            it8.nextInt();
            arrayList.add(new AsftTravellerDetailsScreenContract$DomainState$TravellerDetails(0));
        }
        this.f147200t = mra.d.b(this, new h(new Data(null, null, true, 3, null), arrayList, false), stateMapper, null, false, 12);
    }

    public static h I2(h hVar, int i, Function1 function1) {
        List list = hVar.f147181b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i2 = 0;
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            AsftTravellerDetailsScreenContract$DomainState$TravellerDetails asftTravellerDetailsScreenContract$DomainState$TravellerDetails = (AsftTravellerDetailsScreenContract$DomainState$TravellerDetails) obj2;
            if (i == i2) {
                asftTravellerDetailsScreenContract$DomainState$TravellerDetails = (AsftTravellerDetailsScreenContract$DomainState$TravellerDetails) function1.invoke(asftTravellerDetailsScreenContract$DomainState$TravellerDetails);
            }
            arrayList.add(asftTravellerDetailsScreenContract$DomainState$TravellerDetails);
            i2 = i3;
        }
        return h.a(hVar, null, arrayList, false, 5);
    }

    @Override // yji.l
    public final void I1() {
        gui.j jVar = this.f147198r;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(this, "delegate");
        jVar.o = this;
        z1 z1Var = jVar.f146959q;
        Continuation continuation = null;
        yji.l.a1(this, z1Var, null, null, new q(this, null), 3);
        yji.l.a1(this, vkm.q.Q(this.f147199s, new g6f.l(continuation, this, 18)), null, null, new gul.n(this, continuation, 3), 3);
    }

    @Override // gui.g
    public final int d() {
        return this.o.f98906a;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f147200t;
    }

    @Override // gui.g
    public final boolean s0() {
        return this.o.d;
    }
}
