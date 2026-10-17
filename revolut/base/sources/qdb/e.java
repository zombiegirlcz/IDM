package qdb;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.retail.restaurants.impl.domain.model.LocationInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e {
    public static final LocationInfo a(d dVar) {
        LocationInfo.GeoLocation geoLocation;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        String id10 = dVar.getId();
        String locationId = dVar.getLocationId();
        String name = dVar.getName();
        no3.b address = dVar.getAddress();
        Address addressA = oo3.a.a(address);
        String street = address.getStreet();
        if (street == null) {
            street = address.getStreetName();
        }
        Address addressCopy = addressA.copy((32704 & 1) != 0 ? addressA.streetLine1 : null, (32704 & 2) != 0 ? addressA.streetLine2 : null, (32704 & 4) != 0 ? addressA.region : null, (32704 & 8) != 0 ? addressA.city : null, (32704 & 16) != 0 ? addressA.postcode : null, (32704 & 32) != 0 ? addressA.country : null, (32704 & 64) != 0 ? addressA.fullAddress : null, (32704 & 128) != 0 ? addressA.streetType : null, (32704 & 256) != 0 ? addressA.street : street, (32704 & 512) != 0 ? addressA.houseNumber : null, (32704 & 1024) != 0 ? addressA.flat : null, (32704 & 2048) != 0 ? addressA.neighborhood : null, (32704 & 4096) != 0 ? addressA.houseName : null, (32704 & 8192) != 0 ? addressA.type : null, (32704 & 16384) != 0 ? addressA.landmark : null);
        String timeZone = dVar.getTimeZone();
        c geoLocation2 = dVar.getGeoLocation();
        if (geoLocation2 != null) {
            Intrinsics.checkNotNullParameter(geoLocation2, "<this>");
            geoLocation = new LocationInfo.GeoLocation(geoLocation2.getLat(), geoLocation2.getLon());
        } else {
            geoLocation = null;
        }
        return new LocationInfo(id10, locationId, name, addressCopy, timeZone, geoLocation);
    }

    public static final d b(LocationInfo locationInfo) {
        c cVar;
        Intrinsics.checkNotNullParameter(locationInfo, "<this>");
        String str = locationInfo.f82804a;
        String str2 = locationInfo.f82805b;
        String str3 = locationInfo.f82806c;
        no3.b bVarD = oo3.a.d(locationInfo.d);
        String id10 = locationInfo.a().getId();
        LocationInfo.GeoLocation geoLocation = locationInfo.f;
        if (geoLocation != null) {
            Intrinsics.checkNotNullParameter(geoLocation, "<this>");
            cVar = new c(geoLocation.f82807a, geoLocation.f82808b);
        } else {
            cVar = null;
        }
        return new d(str, str2, str3, bVarD, id10, cVar);
    }
}
