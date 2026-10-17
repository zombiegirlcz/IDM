package j9g;

import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoomUnit;
import com.revolut.feature_travel_hotels_models.property.room.RoomOccupancy;
import com.revolut.feature_travel_hotels_models.property.room.UnitBedConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f172334a = q0.c(new Pair("SQUARE_METERS", cgi.a.SQUARE_METERS));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f172335b = r0.k(new Pair("PAY_NOW", cgi.e.PAY_NOW), new Pair("PAY_LATER", cgi.e.PAY_LATER));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f172336c = r0.k(new Pair("CARD", cgi.d.CARD), new Pair("WALLET", cgi.d.WALLET));

    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature_travel_hotels_models.property.room.CancellationPolicy a(cag.b r12) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9g.j.a(cag.b):com.revolut.feature_travel_hotels_models.property.room.CancellationPolicy");
    }

    public static final HotelsPropertyRoomUnit b(cag.f fVar) {
        cgi.s sVar;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String name = fVar.getName();
        List<cag.l> beds = fVar.getBeds();
        ArrayList arrayList = new ArrayList(w.t(beds, 10));
        for (cag.l lVar : beds) {
            Intrinsics.checkNotNullParameter(lVar, "<this>");
            String type = lVar.getType();
            cgi.s[] sVarArrValues = cgi.s.values();
            int length = sVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    sVar = null;
                    break;
                }
                sVar = sVarArrValues[i];
                if (a0.z(sVar.name(), type, true)) {
                    break;
                }
                i++;
            }
            if (sVar == null) {
                sVar = cgi.s.UNKNOWN;
            }
            arrayList.add(new UnitBedConfiguration(sVar, lVar.getCount()));
        }
        return new HotelsPropertyRoomUnit(name, arrayList);
    }

    public static final RoomOccupancy c(cag.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return new RoomOccupancy(jVar.getAdults(), jVar.getChildrenAge());
    }
}
