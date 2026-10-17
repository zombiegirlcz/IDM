package oo3;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressSearchListResult;
import com.revolut.feature.address.models.AddressSearchResult;
import com.revolut.feature.address.models.Highlight;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import no3.b;
import no3.c;
import no3.d;
import no3.e;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {
    public static final Address a(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String addressLine1 = bVar.getAddressLine1();
        String addressLine2 = bVar.getAddressLine2();
        String region = bVar.getRegion();
        String country = bVar.getCountry();
        return new Address(addressLine1, addressLine2, region, bVar.getCity(), bVar.getPostcode(), country, null, bVar.getStreetType(), bVar.getStreet(), bVar.getHouseNumber(), bVar.getFlat(), bVar.getNeighborhood(), bVar.getHouseName(), null, bVar.getLandmark(), 8256, null);
    }

    public static final AddressSearchListResult b(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        List<c> results = dVar.getResults();
        ArrayList arrayList = new ArrayList(w.t(results, 10));
        for (c cVar : results) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            String id10 = cVar.getId();
            boolean hasChildren = cVar.getHasChildren();
            String result = cVar.getResult();
            String description = cVar.getDescription();
            List<e> resultHighlights = cVar.getResultHighlights();
            ArrayList arrayList2 = new ArrayList(w.t(resultHighlights, 10));
            for (e eVar : resultHighlights) {
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                arrayList2.add(new Highlight(eVar.getFrom(), eVar.getTo()));
            }
            List<e> descriptionHighlights = cVar.getDescriptionHighlights();
            ArrayList arrayList3 = new ArrayList(w.t(descriptionHighlights, 10));
            for (e eVar2 : descriptionHighlights) {
                Intrinsics.checkNotNullParameter(eVar2, "<this>");
                arrayList3.add(new Highlight(eVar2.getFrom(), eVar2.getTo()));
            }
            arrayList.add(new AddressSearchResult(id10, result, description, hasChildren, arrayList2, arrayList3));
        }
        return new AddressSearchListResult(arrayList, dVar.getSessionId());
    }

    public static final b c(Address address) {
        Intrinsics.checkNotNullParameter(address, "<this>");
        String streetLine1 = address.getStreetLine1();
        if (streetLine1 == null) {
            streetLine1 = "";
        }
        String streetLine2 = address.getStreetLine2();
        if (streetLine2 == null) {
            streetLine2 = "";
        }
        String region = address.getRegion();
        if (region == null) {
            region = "";
        }
        String city = address.getCity();
        if (city == null) {
            city = "";
        }
        String postcode = address.getPostcode();
        if (postcode == null) {
            postcode = "";
        }
        String country = address.getCountry();
        String street = address.getStreet();
        if (street == null) {
            street = "";
        }
        String houseNumber = address.getHouseNumber();
        if (houseNumber == null) {
            houseNumber = "";
        }
        String flat = address.getFlat();
        if (flat == null) {
            flat = "";
        }
        String neighborhood = address.getNeighborhood();
        if (neighborhood == null) {
            neighborhood = "";
        }
        String houseName = address.getHouseName();
        if (houseName == null) {
            houseName = "";
        }
        String streetType = address.getStreetType();
        if (streetType == null) {
            streetType = "";
        }
        String landmark = address.getLandmark();
        if (landmark == null) {
            landmark = "";
        }
        return new b(streetLine1, streetLine2, region, city, postcode, country, street, houseNumber, flat, neighborhood, houseName, streetType, landmark, null, 16512);
    }

    public static final b d(Address address) {
        Intrinsics.checkNotNullParameter(address, "<this>");
        String streetLine1 = address.getStreetLine1();
        String streetLine2 = address.getStreetLine2();
        String region = address.getRegion();
        String city = address.getCity();
        String postcode = address.getPostcode();
        return new b(streetLine1, streetLine2, region, city, postcode != null ? m70.a.l(postcode) : null, address.getCountry(), address.getStreet(), address.getHouseNumber(), address.getFlat(), address.getNeighborhood(), address.getHouseName(), address.getStreetType(), address.getLandmark(), null, 16512);
    }
}
