package q90;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bD\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\u0004R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\u0004R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\u0004R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b.\u0010\u0004R\u001c\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b!\u0010\u0004R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b4\u0010\u0004R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b$\u0010\u0004R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\u0004R\u001c\u0010=\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b<\u0010\u0004R\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010B\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\bA\u0010\u0004R\u001c\u0010C\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\b1\u0010\u0004R\u001c\u0010F\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010\u0006\u001a\u0004\bE\u0010\u0004R\u001c\u0010G\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b(\u0010\u0004R\u001c\u0010H\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010I\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b+\u0010\u0004R\u001c\u0010J\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b@\u0010\u0004R\u001c\u0010L\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\b>\u0010\u0004R\u001c\u0010M\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\bK\u0010\u0004R\u001c\u0010P\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\bO\u0010\u0004R\u001c\u0010R\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\bQ\u0010\u0004R\u001c\u0010S\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bN\u0010\u0004R\u001c\u0010T\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010U\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010V\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\bD\u0010\u0004R\u001c\u0010W\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\b7\u0010\u0004R\u001c\u0010X\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b9\u0010\u0004¨\u0006Y"}, d2 = {"Lq90/c;", "Lq90/b2;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "p", "id", "", "b", "Z", "A", "()Z", "required", "Lq90/d;", "c", "Lq90/d;", "K", "()Lq90/d;", "value", "Lq90/c$a;", "d", "Lq90/c$a;", "i", "()Lq90/c$a;", "countrySelector", "e", "E", "streetLine1Hint", "f", "G", "streetLine2Hint", "g", "s", "neighbourhoodHint", "h", "z", "regionHint", "cityHint", "j", "o", "houseNumberHint", "k", "I", "streetNameHint", "l", "n", "houseNameHint", "m", "flatHint", "countryHint", "x", "postcodeHint", "countryPickerHint", "q", "addressPickerHint", "r", "y", "postcodePickerHint", "C", "searchBoxHint", "t", "cancelButtonHint", "u", "v", "optionalFieldHint", "genericErrorSubmitHint", "w", "J", "tryAgainHint", "emptyResultsHint", "addressNotFoundHint", "enterAddressManuallyHint", "noSuitableAddressesHint", "B", "noResultsHint", "requiredFieldHint", "D", "F", "streetLine1MaxLengthHint", "H", "streetLine2MaxLengthHint", "streetAddressInvalidCharactersHint", "cityMaxLengthHint", "cityInvalidCharactersHint", "orHint", "invalidAddressHint", "invalidPostcodeHint", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c extends b2 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("noSuitableAddressesHint")
    private final String noSuitableAddressesHint;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("noResultsHint")
    private final String noResultsHint;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("requiredFieldHint")
    private final String requiredFieldHint;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @lg.b("streetLine1MaxLengthHint")
    private final String streetLine1MaxLengthHint;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @lg.b("streetLine2MaxLengthHint")
    private final String streetLine2MaxLengthHint;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @lg.b("streetAddressInvalidCharactersHint")
    private final String streetAddressInvalidCharactersHint;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @lg.b("cityMaxLengthHint")
    private final String cityMaxLengthHint;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @lg.b("cityInvalidCharactersHint")
    private final String cityInvalidCharactersHint;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @lg.b("orHint")
    private final String orHint;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @lg.b("invalidAddressHint")
    private final String invalidAddressHint;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @lg.b("invalidPostcodeHint")
    private final String invalidPostcodeHint;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final boolean required;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    private final d value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("countrySelector")
    @NotNull
    private final a countrySelector;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("streetLine1Hint")
    private final String streetLine1Hint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("streetLine2Hint")
    private final String streetLine2Hint;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("neighbourhoodHint")
    private final String neighbourhoodHint;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("regionHint")
    private final String regionHint;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("cityHint")
    private final String cityHint;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("houseNumberHint")
    private final String houseNumberHint;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("streetNameHint")
    private final String streetNameHint;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("houseNameHint")
    private final String houseNameHint;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("flatHint")
    private final String flatHint;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("countryHint")
    private final String countryHint;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("postcodeHint")
    private final String postcodeHint;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("countryPickerHint")
    private final String countryPickerHint;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("addressPickerHint")
    private final String addressPickerHint;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("postcodePickerHint")
    private final String postcodePickerHint;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("searchBoxHint")
    private final String searchBoxHint;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancelButtonHint")
    private final String cancelButtonHint;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("optionalFieldHint")
    private final String optionalFieldHint;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("genericErrorSubmitHint")
    private final String genericErrorSubmitHint;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("tryAgainHint")
    private final String tryAgainHint;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("emptyResultsHint")
    private final String emptyResultsHint;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("addressNotFoundHint")
    private final String addressNotFoundHint;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("enterAddressManuallyHint")
    private final String enterAddressManuallyHint;

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\f"}, d2 = {"Lq90/c$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "preselectedCountry", "b", "c", "isVisible", "isEditable", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("preselected")
        private final String preselectedCountry;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("visible")
        @NotNull
        private final String isVisible;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("editable")
        @NotNull
        private final String isEditable;

        public a(String str, String isVisible, String isEditable) {
            Intrinsics.checkNotNullParameter(isVisible, "isVisible");
            Intrinsics.checkNotNullParameter(isEditable, "isEditable");
            this.preselectedCountry = str;
            this.isVisible = isVisible;
            this.isEditable = isEditable;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPreselectedCountry() {
            return this.preselectedCountry;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getIsEditable() {
            return this.isEditable;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getIsVisible() {
            return this.isVisible;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.preselectedCountry, aVar.preselectedCountry) && Intrinsics.f(this.isVisible, aVar.isVisible) && Intrinsics.f(this.isEditable, aVar.isEditable);
        }

        public final int hashCode() {
            String str = this.preselectedCountry;
            return this.isEditable.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.isVisible);
        }
    }

    public c(String id10, boolean z, d dVar, a countrySelector) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(countrySelector, "countrySelector");
        this.id = id10;
        this.required = z;
        this.value = dVar;
        this.countrySelector = countrySelector;
        this.streetLine1Hint = null;
        this.streetLine2Hint = null;
        this.neighbourhoodHint = null;
        this.regionHint = null;
        this.cityHint = null;
        this.houseNumberHint = null;
        this.streetNameHint = null;
        this.houseNameHint = null;
        this.flatHint = null;
        this.countryHint = null;
        this.postcodeHint = null;
        this.countryPickerHint = null;
        this.addressPickerHint = null;
        this.postcodePickerHint = null;
        this.searchBoxHint = null;
        this.cancelButtonHint = null;
        this.optionalFieldHint = null;
        this.genericErrorSubmitHint = null;
        this.tryAgainHint = null;
        this.emptyResultsHint = null;
        this.addressNotFoundHint = null;
        this.enterAddressManuallyHint = null;
        this.noSuitableAddressesHint = null;
        this.noResultsHint = null;
        this.requiredFieldHint = null;
        this.streetLine1MaxLengthHint = null;
        this.streetLine2MaxLengthHint = null;
        this.streetAddressInvalidCharactersHint = null;
        this.cityMaxLengthHint = null;
        this.cityInvalidCharactersHint = null;
        this.orHint = null;
        this.invalidAddressHint = null;
        this.invalidPostcodeHint = null;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final String getRequiredFieldHint() {
        return this.requiredFieldHint;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getSearchBoxHint() {
        return this.searchBoxHint;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final String getStreetAddressInvalidCharactersHint() {
        return this.streetAddressInvalidCharactersHint;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final String getStreetLine1Hint() {
        return this.streetLine1Hint;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getStreetLine1MaxLengthHint() {
        return this.streetLine1MaxLengthHint;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final String getStreetLine2Hint() {
        return this.streetLine2Hint;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final String getStreetLine2MaxLengthHint() {
        return this.streetLine2MaxLengthHint;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final String getStreetNameHint() {
        return this.streetNameHint;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final String getTryAgainHint() {
        return this.tryAgainHint;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final d getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddressNotFoundHint() {
        return this.addressNotFoundHint;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAddressPickerHint() {
        return this.addressPickerHint;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCancelButtonHint() {
        return this.cancelButtonHint;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCityHint() {
        return this.cityHint;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCityInvalidCharactersHint() {
        return this.cityInvalidCharactersHint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.id, cVar.id) && this.required == cVar.required && Intrinsics.f(this.value, cVar.value) && Intrinsics.f(this.countrySelector, cVar.countrySelector) && Intrinsics.f(this.streetLine1Hint, cVar.streetLine1Hint) && Intrinsics.f(this.streetLine2Hint, cVar.streetLine2Hint) && Intrinsics.f(this.neighbourhoodHint, cVar.neighbourhoodHint) && Intrinsics.f(this.regionHint, cVar.regionHint) && Intrinsics.f(this.cityHint, cVar.cityHint) && Intrinsics.f(this.houseNumberHint, cVar.houseNumberHint) && Intrinsics.f(this.streetNameHint, cVar.streetNameHint) && Intrinsics.f(this.houseNameHint, cVar.houseNameHint) && Intrinsics.f(this.flatHint, cVar.flatHint) && Intrinsics.f(this.countryHint, cVar.countryHint) && Intrinsics.f(this.postcodeHint, cVar.postcodeHint) && Intrinsics.f(this.countryPickerHint, cVar.countryPickerHint) && Intrinsics.f(this.addressPickerHint, cVar.addressPickerHint) && Intrinsics.f(this.postcodePickerHint, cVar.postcodePickerHint) && Intrinsics.f(this.searchBoxHint, cVar.searchBoxHint) && Intrinsics.f(this.cancelButtonHint, cVar.cancelButtonHint) && Intrinsics.f(this.optionalFieldHint, cVar.optionalFieldHint) && Intrinsics.f(this.genericErrorSubmitHint, cVar.genericErrorSubmitHint) && Intrinsics.f(this.tryAgainHint, cVar.tryAgainHint) && Intrinsics.f(this.emptyResultsHint, cVar.emptyResultsHint) && Intrinsics.f(this.addressNotFoundHint, cVar.addressNotFoundHint) && Intrinsics.f(this.enterAddressManuallyHint, cVar.enterAddressManuallyHint) && Intrinsics.f(this.noSuitableAddressesHint, cVar.noSuitableAddressesHint) && Intrinsics.f(this.noResultsHint, cVar.noResultsHint) && Intrinsics.f(this.requiredFieldHint, cVar.requiredFieldHint) && Intrinsics.f(this.streetLine1MaxLengthHint, cVar.streetLine1MaxLengthHint) && Intrinsics.f(this.streetLine2MaxLengthHint, cVar.streetLine2MaxLengthHint) && Intrinsics.f(this.streetAddressInvalidCharactersHint, cVar.streetAddressInvalidCharactersHint) && Intrinsics.f(this.cityMaxLengthHint, cVar.cityMaxLengthHint) && Intrinsics.f(this.cityInvalidCharactersHint, cVar.cityInvalidCharactersHint) && Intrinsics.f(this.orHint, cVar.orHint) && Intrinsics.f(this.invalidAddressHint, cVar.invalidAddressHint) && Intrinsics.f(this.invalidPostcodeHint, cVar.invalidPostcodeHint);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCityMaxLengthHint() {
        return this.cityMaxLengthHint;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCountryHint() {
        return this.countryHint;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getCountryPickerHint() {
        return this.countryPickerHint;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.id.hashCode() * 31, 31, this.required);
        d dVar = this.value;
        int iHashCode = (this.countrySelector.hashCode() + ((iC + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
        String str = this.streetLine1Hint;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.streetLine2Hint;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.neighbourhoodHint;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.regionHint;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cityHint;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.houseNumberHint;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.streetNameHint;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.houseNameHint;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.flatHint;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.countryHint;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.postcodeHint;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.countryPickerHint;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.addressPickerHint;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.postcodePickerHint;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.searchBoxHint;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.cancelButtonHint;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.optionalFieldHint;
        int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.genericErrorSubmitHint;
        int iHashCode19 = (iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.tryAgainHint;
        int iHashCode20 = (iHashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.emptyResultsHint;
        int iHashCode21 = (iHashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.addressNotFoundHint;
        int iHashCode22 = (iHashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.enterAddressManuallyHint;
        int iHashCode23 = (iHashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.noSuitableAddressesHint;
        int iHashCode24 = (iHashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.noResultsHint;
        int iHashCode25 = (iHashCode24 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.requiredFieldHint;
        int iHashCode26 = (iHashCode25 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.streetLine1MaxLengthHint;
        int iHashCode27 = (iHashCode26 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.streetLine2MaxLengthHint;
        int iHashCode28 = (iHashCode27 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.streetAddressInvalidCharactersHint;
        int iHashCode29 = (iHashCode28 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.cityMaxLengthHint;
        int iHashCode30 = (iHashCode29 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.cityInvalidCharactersHint;
        int iHashCode31 = (iHashCode30 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.orHint;
        int iHashCode32 = (iHashCode31 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.invalidAddressHint;
        int iHashCode33 = (iHashCode32 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.invalidPostcodeHint;
        return iHashCode33 + (str33 != null ? str33.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final a getCountrySelector() {
        return this.countrySelector;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getEmptyResultsHint() {
        return this.emptyResultsHint;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getEnterAddressManuallyHint() {
        return this.enterAddressManuallyHint;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getFlatHint() {
        return this.flatHint;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getGenericErrorSubmitHint() {
        return this.genericErrorSubmitHint;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getHouseNameHint() {
        return this.houseNameHint;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getHouseNumberHint() {
        return this.houseNumberHint;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getInvalidAddressHint() {
        return this.invalidAddressHint;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getInvalidPostcodeHint() {
        return this.invalidPostcodeHint;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getNeighbourhoodHint() {
        return this.neighbourhoodHint;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getNoResultsHint() {
        return this.noResultsHint;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getNoSuitableAddressesHint() {
        return this.noSuitableAddressesHint;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getOptionalFieldHint() {
        return this.optionalFieldHint;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getOrHint() {
        return this.orHint;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getPostcodeHint() {
        return this.postcodeHint;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getPostcodePickerHint() {
        return this.postcodePickerHint;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getRegionHint() {
        return this.regionHint;
    }
}
