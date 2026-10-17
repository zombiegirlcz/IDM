package com.revolut.feature.address.common.impl.flow.screen.add;

import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.address.common.api.AddressFlowApi$AddressCityFieldSearch;
import com.revolut.feature.address.common.api.flow.AddressFlowUseCase;
import com.revolut.feature.address.common.impl.flow.screen.add.AddAddressScreenContract$ModalStep;
import com.revolut.feature.address.common.impl.flow.screen.find.AddressSearchScreenContract$LocationSearchMode;
import com.revolut.feature.address.common.impl.models.AddressConfiguration$FieldConfiguration;
import com.revolut.feature.address.common.impl.models.AddressConfiguration$FieldId;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressFormat;
import com.revolut.feature.address.models.CountryState;
import com.revolut.kompot.common.ModalDestination;
import e4m.c;
import gi1.k;
import gi1.m;
import gi1.t;
import java.text.Normalizer;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.d0;
import mi1.d;
import oki.h;
import pi1.f;
import rh1.b;
import vi1.i;
import vkm.j2;
import wpg.g;
import yi1.e;
import yji.l;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements m {
    public final f A;
    public CountryState B;
    public final y C;
    public final com.revolut.kompot.navigable.vc.modal.a D;
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f61001p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vi1.a f61002q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AddAddressScreenContract$InputData f61003r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final phm.a f61004s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final phm.a f61005t;
    public final phm.a u;
    public final phm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f61006w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f80.a f61007x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d f61008y;
    public final gte.a z;

    public a(b addressFlowInteractor, e addressTypeMapper, vi1.a addressConfigurationInteractor, AddAddressScreenContract$InputData inputData, n stateMapper, c countryPickerInteractor, g regionPickerScreenIntegratorInteractor, g cityPickerScreenIntegratorInteractor, g streetTypePickerInteractor, i addressFlowStringFactory, f80.a uriHelper, d fineLocationExtension, gte.a featureToggleInteractor, f addressValidationExtension) {
        Intrinsics.checkNotNullParameter(addressFlowInteractor, "addressFlowInteractor");
        Intrinsics.checkNotNullParameter(addressTypeMapper, "addressTypeMapper");
        Intrinsics.checkNotNullParameter(addressConfigurationInteractor, "addressConfigurationInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(countryPickerInteractor, "countryPickerInteractor");
        Intrinsics.checkNotNullParameter(regionPickerScreenIntegratorInteractor, "regionPickerScreenIntegratorInteractor");
        Intrinsics.checkNotNullParameter(cityPickerScreenIntegratorInteractor, "cityPickerScreenIntegratorInteractor");
        Intrinsics.checkNotNullParameter(streetTypePickerInteractor, "streetTypePickerInteractor");
        Intrinsics.checkNotNullParameter(addressFlowStringFactory, "addressFlowStringFactory");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(fineLocationExtension, "fineLocationExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(addressValidationExtension, "addressValidationExtension");
        this.o = addressFlowInteractor;
        this.f61001p = addressTypeMapper;
        this.f61002q = addressConfigurationInteractor;
        this.f61003r = inputData;
        this.f61004s = countryPickerInteractor;
        this.f61005t = regionPickerScreenIntegratorInteractor;
        this.u = cityPickerScreenIntegratorInteractor;
        this.v = streetTypePickerInteractor;
        this.f61006w = addressFlowStringFactory;
        this.f61007x = uriHelper;
        this.f61008y = fineLocationExtension;
        this.z = featureToggleInteractor;
        this.A = addressValidationExtension;
        this.B = CountryState.INSTANCE.getEMPTY();
        sh1.h hVarM2 = M2(inputData.f60978a);
        AddressFormat addressFormat = AddressFormat.INTERNATIONAL;
        Address address = inputData.f60978a;
        Address.Type type = address.getType();
        String fullAddress = address.getFullAddress();
        String str = fullAddress == null ? "" : fullAddress;
        boolean z = inputData.f60979b;
        Clause clause = inputData.f60982h;
        Clause clause2 = inputData.i;
        wi0.b bVarA = null;
        LinkedHashMap linkedHashMapJ = r0.j(new Pair(AddressConfiguration$FieldId.Country.f61047a, new AddressConfiguration$FieldConfiguration(inputData.f60983j, (List) null, 0, 14)));
        wi1.a aVar = wi1.a.UNKNOWN;
        boolean z3 = inputData.k;
        boolean z4 = inputData.f60986n;
        boolean z6 = inputData.o;
        AddressFlowUseCase addressFlowUseCase = inputData.f60991t;
        String strL = m70.a.l(address.getCountry());
        if (strL != null) {
            wi0.b.Companion.getClass();
            bVarA = wi0.a.a(strL);
        }
        this.C = mra.d.b(this, new k(hVarM2, addressFormat, type, str, z, clause, clause2, linkedHashMapJ, aVar, z3, null, z4, z6, addressFlowStringFactory.a(addressFlowUseCase, bVarA), mi1.a.NOT_ASKED, null), stateMapper, null, false, 12);
        this.D = hx7.e.a(this, new ghl.c(this, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.address.common.impl.flow.screen.add.a r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof gi1.r
            if (r0 == 0) goto L13
            r0 = r7
            gi1.r r0 = (gi1.r) r0
            int r1 = r0.f144049w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f144049w = r1
            goto L18
        L13:
            gi1.r r0 = new gi1.r
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f144049w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L57
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            rh1.b r7 = r6.o
            lj1.a r7 = (lj1.a) r7
            akg.n r7 = r7.a()
            fq7.k r2 = new fq7.k
            r4 = 25
            r2.<init>(r4)
            nij.d r4 = new nij.d
            r5 = 18
            r4.<init>(r5)
            nji.h r5 = nji.h.f216533a
            kotlinx.coroutines.flow.Flow r7 = nz8.d.i(r7, r5, r2, r4)
            r0.f144049w = r3
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            sh1.n r7 = (sh1.n) r7
            cli.y r0 = r6.C
            gd3.i r1 = new gd3.i
            r2 = 15
            r1.<init>(r7, r2)
            r6.H2(r0, r1)
            r6.N2()
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.address.common.impl.flow.screen.add.a.I2(com.revolut.feature.address.common.impl.flow.screen.add.a, gim.c):java.lang.Object");
    }

    public static final String J2(String str, boolean z) {
        if (!z) {
            return d0.F0(str).toString();
        }
        Regex regex = yi1.c.f314214a;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (d0.W(str)) {
            return "";
        }
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFC);
        Intrinsics.h(strNormalize);
        return d0.F0(yi1.c.f314216c.replace(yi1.c.f314215b.replace(yi1.c.f314214a.replace(strNormalize, ""), " "), " ")).toString();
    }

    public static sh1.h M2(Address address) {
        sh1.g gVar = new sh1.g(address.getCountry(), null, 6);
        String postcode = address.getPostcode();
        if (postcode == null) {
            postcode = "";
        }
        sh1.g gVar2 = new sh1.g(postcode, null, 6);
        String city = address.getCity();
        if (city == null) {
            city = "";
        }
        sh1.g gVar3 = new sh1.g(city, null, 6);
        String region = address.getRegion();
        if (region == null) {
            region = "";
        }
        sh1.g gVar4 = new sh1.g(region, null, 6);
        String neighborhood = address.getNeighborhood();
        if (neighborhood == null) {
            neighborhood = "";
        }
        sh1.g gVar5 = new sh1.g(neighborhood, null, 6);
        String streetLine1 = address.getStreetLine1();
        if (streetLine1 == null) {
            streetLine1 = "";
        }
        sh1.g gVar6 = new sh1.g(streetLine1, null, 6);
        String streetLine2 = address.getStreetLine2();
        if (streetLine2 == null) {
            streetLine2 = "";
        }
        sh1.g gVar7 = new sh1.g(streetLine2, null, 6);
        String streetType = address.getStreetType();
        if (streetType == null) {
            streetType = "";
        }
        sh1.g gVar8 = new sh1.g(streetType, null, 6);
        String street = address.getStreet();
        if (street == null) {
            street = "";
        }
        sh1.g gVar9 = new sh1.g(street, null, 6);
        String houseNumber = address.getHouseNumber();
        if (houseNumber == null) {
            houseNumber = "";
        }
        sh1.g gVar10 = new sh1.g(houseNumber, null, 6);
        String houseName = address.getHouseName();
        if (houseName == null) {
            houseName = "";
        }
        sh1.g gVar11 = new sh1.g(houseName, null, 6);
        String flat = address.getFlat();
        if (flat == null) {
            flat = "";
        }
        return new sh1.h(gVar, gVar2, gVar3, gVar4, gVar5, gVar8, gVar9, gVar10, gVar11, new sh1.g(flat, null, 6), gVar6, gVar7, null, 4096);
    }

    @Override // yji.l
    public final void I1() {
        l2(new ge7.f(this, null, 4), new yi5.b(26));
        if (this.f61003r.f60990s) {
            l.a1(this, this.f61008y.f205595n, null, null, new t(this, null), 3);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.D;
    }

    public final String K2() {
        return ((k) ((j2) this.C.f22677a).getValue()).f144028a.f263346a.f263344a;
    }

    public final void L2(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        boolean zF = Intrinsics.f(listId, "COUNTRY_ID");
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.D;
        if (zF) {
            h.v2(aVar, AddAddressScreenContract$ModalStep.CountryPicker.f60994a, popup);
            return;
        }
        if (Intrinsics.f(listId, "SEARCH_ID")) {
            h.v2(aVar, new AddAddressScreenContract$ModalStep.AddressSearch(this.f61003r.f60990s ? new AddressSearchScreenContract$LocationSearchMode.Enabled(false) : AddressSearchScreenContract$LocationSearchMode.Disabled.f61012a), popup);
            return;
        }
        if (Intrinsics.f(listId, "REGION_ID")) {
            h.v2(aVar, AddAddressScreenContract$ModalStep.RegionPicker.f60999a, popup);
            return;
        }
        if (Intrinsics.f(listId, "POSTAL_CODE_LOOKUP_ID")) {
            h.v2(aVar, AddAddressScreenContract$ModalStep.PostCodeSearch.f60998a, popup);
            return;
        }
        boolean zF2 = Intrinsics.f(listId, "STREET_TYPE_ID");
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (zF2) {
            h.v2(aVar, AddAddressScreenContract$ModalStep.StreetTypePicker.f61000a, bottom_dialog);
            return;
        }
        if (Intrinsics.f(listId, "ADDRESS_TYPE_ID")) {
            h.v2(aVar, AddAddressScreenContract$ModalStep.AddressTypePicker.f60993a, bottom_dialog);
            return;
        }
        if (!Intrinsics.f(listId, "CITY_ID")) {
            if (Intrinsics.f(listId, "USE_LOCATION_SEARCH_ITEM_ID")) {
                if (this.f61008y.c3()) {
                    h.v2(aVar, new AddAddressScreenContract$ModalStep.AddressSearch(new AddressSearchScreenContract$LocationSearchMode.Enabled(true)), popup);
                    return;
                } else {
                    h.v2(aVar, AddAddressScreenContract$ModalStep.LocationPermission.f60996a, ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a);
                    return;
                }
            }
            return;
        }
        if (!((jte.d) this.z).c(AddressFlowApi$AddressCityFieldSearch.f60922c)) {
            h.v2(aVar, AddAddressScreenContract$ModalStep.MunicipalitiesPicker.f60997a, popup);
            return;
        }
        sh1.n nVar = ((k) ((j2) this.C.f22677a).getValue()).f144037p;
        if (nVar == null) {
            throw new IllegalArgumentException("Countries configuration must be initialized");
        }
        h.v2(aVar, new AddAddressScreenContract$ModalStep.FieldSearch(nVar.f263389p.contains(com.bumptech.glide.d.c(K2())) ? ei1.n.CITY : ei1.n.MUNICIPALITY), popup);
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0461  */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N2() {
        /*
            Method dump skipped, instruction units count: 1551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.address.common.impl.flow.screen.add.a.N2():void");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.C;
    }
}
