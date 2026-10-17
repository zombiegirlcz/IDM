package j9g;

import com.revolut.feature_travel_hotels_models.location.HotelsSmartSearchLocation;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyType;
import dag.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements m {
    public final ffi.e a(dag.a dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        if (dto instanceof a.C0668a) {
            return v04.b.u(((a.C0668a) dto).getItem());
        }
        if (!(dto instanceof a.b)) {
            if (dto instanceof a.c) {
                pfi.b item = ((a.c) dto).getItem();
                Intrinsics.checkNotNullParameter(item, "<this>");
                return new HotelsSmartSearchLocation(item.getId(), item.getName());
            }
            if (dto instanceof a.d) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        x9g.f item2 = ((a.b) dto).getItem();
        Intrinsics.checkNotNullParameter(item2, "<this>");
        String id10 = item2.getId();
        String name = item2.getName();
        HotelsPropertyType hotelsPropertyTypeJ = lfi.a.j(item2.getPropertyType());
        x9g.d location = item2.getLocation();
        Intrinsics.checkNotNullParameter(location, "<this>");
        return new dgi.b(id10, name, hotelsPropertyTypeJ, new dgi.a(lfi.a.a(location.getAddress())));
    }
}
