package u90;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.backend_flow.domain.models.AddressInputItem;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.c;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        wi0.b bVarA;
        q90.c item = (q90.c) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        boolean required = item.getRequired();
        String preselectedCountry = item.getCountrySelector().getPreselectedCountry();
        if (preselectedCountry != null) {
            wi0.b.Companion.getClass();
            bVarA = wi0.a.a(preselectedCountry);
        } else {
            bVarA = null;
        }
        AddressInputItem.CountrySelector countrySelector = new AddressInputItem.CountrySelector(!Boolean.parseBoolean(item.getCountrySelector().getIsVisible()) ? xl2.c.HIDDEN : (Boolean.parseBoolean(item.getCountrySelector().getIsVisible()) && Boolean.parseBoolean(item.getCountrySelector().getIsEditable())) ? xl2.c.EDITABLE : xl2.c.LOCKED, bVarA);
        q90.d value = item.getValue();
        return new AddressInputItem(id10, required, countrySelector, value != null ? new Address(value.getStreetLine1(), value.getStreetLine2(), value.getRegion(), value.getCity(), value.getPostcode(), value.getCountry(), null, value.getStreetType(), value.getStreet(), value.getHouseNumber(), value.getFlat(), value.getNeighbourhood(), value.getHouseName(), null, null, 24640, null) : null, item.getStreetLine1Hint(), item.getStreetLine2Hint(), item.getNeighbourhoodHint(), item.getRegionHint(), item.getCityHint(), item.getHouseNumberHint(), item.getStreetNameHint(), item.getHouseNameHint(), item.getFlatHint(), item.getCountryHint(), item.getPostcodeHint(), item.getCountryPickerHint(), item.getAddressPickerHint(), item.getPostcodePickerHint(), item.getSearchBoxHint(), item.getCancelButtonHint(), item.getOptionalFieldHint(), item.getGenericErrorSubmitHint(), item.getTryAgainHint(), item.getEmptyResultsHint(), item.getAddressNotFoundHint(), item.getEnterAddressManuallyHint(), item.getNoSuitableAddressesHint(), item.getNoResultsHint(), item.getRequiredFieldHint(), item.getStreetLine1MaxLengthHint(), item.getStreetLine2MaxLengthHint(), item.getStreetAddressInvalidCharactersHint(), item.getCityMaxLengthHint(), item.getCityInvalidCharactersHint(), item.getOrHint(), item.getInvalidAddressHint(), item.getInvalidPostcodeHint());
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        AddressInputItem item = (AddressInputItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63233a;
        boolean z = item.f63234b;
        AddressInputItem.CountrySelector countrySelector = item.f63235c;
        wi0.b bVar = countrySelector.f63251b;
        xl2.c cVar = countrySelector.f63250a;
        c.a aVar = new c.a(bVar != null ? bVar.f297794a : null, String.valueOf(cVar != xl2.c.HIDDEN), String.valueOf(cVar == xl2.c.EDITABLE));
        Address address = item.d;
        return new q90.c(str, z, address != null ? new q90.d(address.getStreetLine1(), address.getStreetLine2(), address.getRegion(), address.getCity(), address.getPostcode(), address.getCountry(), address.getStreet(), address.getStreetType(), address.getHouseNumber(), address.getFlat(), address.getNeighborhood(), address.getHouseName()) : null, aVar);
    }
}
