package i9g;

import com.revolut.feature_travel_hotels_models.property.search.LocationData;
import com.revolut.feature_travel_hotels_models.property.search.LocationType;
import fag.t0;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f159832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f159833c;
    public final /* synthetic */ String d;

    public /* synthetic */ q(t tVar, List list, String str, int i) {
        this.f159831a = i;
        this.f159832b = tVar;
        this.f159833c = list;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Pair pair = (Pair) obj2;
        switch (this.f159831a) {
            case 0:
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                dgi.c cVar = (dgi.c) pair.f186385a;
                od0.i iVar = (od0.i) pair.f186386b;
                if (iVar.d()) {
                    t0 t0Var = this.f159832b.f159839b;
                    bfi.a aVar = bfi.a.BOOKED;
                    LocationData locationData = cVar.f114671a;
                    LocationType locationType = locationData instanceof LocationType ? (LocationType) locationData : null;
                    String str = locationType != null ? locationType.f98134b : null;
                    ffi.a aVarV = ta6.a.v(locationData);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                dgi.c cVar2 = (dgi.c) pair.f186385a;
                od0.i iVar2 = (od0.i) pair.f186386b;
                if (iVar2.d()) {
                    t0 t0Var2 = this.f159832b.f159839b;
                    bfi.a aVar2 = bfi.a.CHECKOUT;
                    String str2 = (String) iVar2.c();
                    LocationData locationData2 = cVar2.f114671a;
                    LocationType locationType2 = locationData2 instanceof LocationType ? (LocationType) locationData2 : null;
                    String str3 = locationType2 != null ? locationType2.f98134b : null;
                    ffi.a aVarV2 = ta6.a.v(locationData2);
                }
                break;
        }
        return pfm.m.f235744a;
    }
}
