package cd0;

import com.revolut.feature.backend_flow.domain.models.ValidationResult;
import com.revolut.feature_travel_hotels_models.amenity.HotelsAmenity;
import com.revolut.feature_travel_hotels_models.amenity.HotelsCategorisedAmenities;
import do3.n;
import efm.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import xl2.h0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f23139b;

    public /* synthetic */ a(int i, Function2 function2) {
        this.f23138a = i;
        this.f23139b = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f23138a) {
            case 0:
                e eVar = (e) obj2;
                if (d.b(eVar.f23145b)) {
                    this.f23139b.invoke(eVar.f23145b, null);
                }
                return Unit.f186387a;
            case 1:
                Pair pair = (Pair) obj2;
                h0 h0Var = (h0) pair.f186385a;
                Object obj3 = pair.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj3, "component2(...)");
                this.f23139b.invoke(h0Var, (ValidationResult) obj3);
                return Unit.f186387a;
            case 2:
                HotelsCategorisedAmenities categorisedGroup = (HotelsCategorisedAmenities) obj2;
                Intrinsics.checkNotNullParameter(categorisedGroup, "categorisedGroup");
                List<HotelsAmenity> list = categorisedGroup.f97841b;
                oei.b bVar = categorisedGroup.f97840a;
                ArrayList arrayList = new ArrayList();
                for (HotelsAmenity hotelsAmenity : list) {
                    nag.a aVar = ((Boolean) this.f23139b.invoke(hotelsAmenity, bVar)).booleanValue() ? new nag.a(bVar, hotelsAmenity) : null;
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
                return arrayList;
            case 3:
                HotelsCategorisedAmenities categorisedGroup2 = (HotelsCategorisedAmenities) obj2;
                Intrinsics.checkNotNullParameter(categorisedGroup2, "categorisedGroup");
                List<HotelsAmenity> list2 = categorisedGroup2.f97841b;
                oei.b bVar2 = categorisedGroup2.f97840a;
                ArrayList arrayList2 = new ArrayList();
                for (HotelsAmenity hotelsAmenity2 : list2) {
                    nag.a aVar2 = ((Boolean) this.f23139b.invoke(hotelsAmenity2, bVar2)).booleanValue() ? new nag.a(bVar2, hotelsAmenity2) : null;
                    if (aVar2 != null) {
                        arrayList2.add(aVar2);
                    }
                }
                return arrayList2;
            case 4:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                n nVar = (n) pair2.f186385a;
                return (Flow) this.f23139b.invoke(nVar.f116408a, (xi0.b) pair2.f186386b);
            default:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                n nVar2 = (n) pair3.f186385a;
                return (r) this.f23139b.invoke(nVar2.f116408a, (xi0.b) pair3.f186386b);
        }
    }

    public /* synthetic */ a(d dVar, Function2 function2) {
        this.f23138a = 0;
        this.f23139b = function2;
    }
}
