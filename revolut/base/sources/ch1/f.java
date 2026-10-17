package ch1;

import com.revolut.feature.atm.api.model.Atm;
import com.revolut.feature.atm.api.model.AtmLocation;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocationDomain f24105b;

    public /* synthetic */ f(LocationDomain locationDomain, int i) {
        this.f24104a = i;
        this.f24105b = locationDomain;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f24104a) {
            case 0:
                LocationDomain locationDomain = this.f24105b;
                return i.a((i) obj2, null, new co3.a(locationDomain.f78066a, locationDomain.f78067b), 15);
            case 1:
                return nwf.e.a((nwf.e) obj2, null, this.f24105b, null, 5);
            case 2:
                LocationDomain locationDomain2 = this.f24105b;
                return sw2.j.a((sw2.j) obj2, null, new co3.a(locationDomain2.f78066a, locationDomain2.f78067b), 15);
            case 3:
                vvc.g update = (vvc.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                LocationDomain locationDomain3 = this.f24105b;
                Intrinsics.checkNotNullParameter(locationDomain3, "<this>");
                return vvc.g.a(update, new vvc.e(new ah0.a(locationDomain3.f78066a, locationDomain3.f78067b)), null, true, null, null, 58);
            default:
                List atms = (List) obj2;
                Intrinsics.checkNotNullParameter(atms, "atms");
                List<Atm> list = atms;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (Atm atm : list) {
                    LocationDomain locationDomain4 = this.f24105b;
                    Intrinsics.h(locationDomain4);
                    Intrinsics.checkNotNullParameter(locationDomain4, "<this>");
                    arrayList.add(yj2.f.a(atm, new AtmLocation(locationDomain4.f78066a, locationDomain4.f78067b)));
                }
                return arrayList;
        }
    }

    public /* synthetic */ f(yj2.l lVar, LocationDomain locationDomain) {
        this.f24104a = 4;
        this.f24105b = locationDomain;
    }
}
