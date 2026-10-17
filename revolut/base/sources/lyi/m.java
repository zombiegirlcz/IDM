package lyi;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_passengers.AirportLoungePassPassengersContract$InputData;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kxk.o;
import svi.s;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends oki.h implements d {
    public final dwi.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AirportLoungePassPassengersContract$InputData f200840p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f200841q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f200842r;

    public m(dwi.d interactor, AirportLoungePassPassengersContract$InputData inputData, f dialogBuilder, o stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dialogBuilder, "dialogBuilder");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f200840p = inputData;
        this.f200841q = dialogBuilder;
        Data data = new Data(null, null, true, 3, null);
        String str = inputData.f99135b;
        str = str == null ? "" : str;
        String str2 = inputData.f99136c;
        this.f200842r = mra.d.b(this, new a(data, str, str2 != null ? str2 : "", null), stateMapper, null, false, 12);
    }

    public static s I2(String str, String str2, List list) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            s sVar = (s) next;
            if (a0.z(sVar.f265982b, str, true) && a0.z(sVar.f265983c, str2, true)) {
                break;
            }
        }
        return (s) next;
    }

    @Override // yji.l
    public final void I1() {
        dwi.d dVar = this.o;
        dVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        hwi.g gVar = (hwi.g) dVar.f120414a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.b1(this, gVar.d.b(Unit.f186387a, loadingStrategy), null, new lph.h(this, null, 14), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f200842r;
    }
}
