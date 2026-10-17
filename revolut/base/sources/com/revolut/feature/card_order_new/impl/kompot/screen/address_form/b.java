package com.revolut.feature.card_order_new.impl.kompot.screen.address_form;

import ang.f;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.address.common.api.flow.FieldMode;
import com.revolut.feature.address.common.api.navigation.FindAddressControllerDescriptor$InputData;
import com.revolut.feature.address.common.api.navigation.SelectAddressControllerDescriptor$InputData;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressFormat;
import com.revolut.feature.address.models.CountryState;
import com.revolut.feature.card_order_new.impl.kompot.interactor.CountryPickerScreenInteractor$Params;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.picker.legacy.PickerScreen;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import neg.q;
import nvg.b0;
import o23.d0;
import o23.m;
import o23.p;
import o23.t;
import o23.u;
import o23.w;
import oki.h;
import s7a.x;
import th1.i;
import vkm.j2;
import w4l.j;
import wpg.g;
import yji.l;
import zi1.d;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements u {
    public final f A;
    public final phm.a B;
    public CountryState C;
    public final y D;
    public final com.revolut.kompot.navigable.vc.modal.a E;
    public final AddressFormScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mk3.a f65131p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rh1.b f65132q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f65133r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vh1.d f65134s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fk3.a f65135t;
    public final n8b.a u;
    public final u23.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final nj1.d f65136w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j60.a f65137x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n60.b f65138y;
    public final t z;

    public b(n stateMapper, AddressFormScreenContract$InputData inputData, mk3.a addressFieldsValidator, rh1.b addressFormInteractor, d addressInteractor, vh1.d addressValidator, fk3.a configurationInteractor, n8b.a countryInteractor, u23.a dialogProvider, nj1.d addressScreenValidator, j60.a bottomExpandableDialogExtension, n60.b keyboardControllerExtension, t fieldsLocalisationProvider, f userInteractor, g streetTypePickerInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(addressFieldsValidator, "addressFieldsValidator");
        Intrinsics.checkNotNullParameter(addressFormInteractor, "addressFormInteractor");
        Intrinsics.checkNotNullParameter(addressInteractor, "addressInteractor");
        Intrinsics.checkNotNullParameter(addressValidator, "addressValidator");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(addressScreenValidator, "addressScreenValidator");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogExtension, "bottomExpandableDialogExtension");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(fieldsLocalisationProvider, "fieldsLocalisationProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(streetTypePickerInteractor, "streetTypePickerInteractor");
        this.o = inputData;
        this.f65131p = addressFieldsValidator;
        this.f65132q = addressFormInteractor;
        this.f65133r = addressInteractor;
        this.f65134s = addressValidator;
        this.f65135t = configurationInteractor;
        this.u = countryInteractor;
        this.v = dialogProvider;
        this.f65136w = addressScreenValidator;
        this.f65137x = bottomExpandableDialogExtension;
        this.f65138y = keyboardControllerExtension;
        this.z = fieldsLocalisationProvider;
        this.A = userInteractor;
        this.B = streetTypePickerInteractor;
        this.C = CountryState.INSTANCE.getEMPTY();
        sh1.h hVarO2 = O2(inputData.f65117a);
        d0 d0Var = d0.UNKNOWN;
        FieldMode fieldMode = inputData.f65121h;
        String fullAddress = inputData.f65117a.getFullAddress();
        this.D = mra.d.b(this, new w(hVarO2, fieldMode, d0Var, fullAddress == null ? "" : fullAddress, null, null, inputData.f65118b, o23.y.EDITABLE, null, null, inputData.f65122j, null, false, false, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.E = e.a(this, new nx2.f(this, 12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b r17, com.revolut.feature.address.models.Address r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.I2(com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b, com.revolut.feature.address.models.Address, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b r11, wi0.b r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.J2(com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b, wi0.b, gim.c):java.lang.Object");
    }

    public static sh1.h O2(Address address) {
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
        String street = address.getStreet();
        if (street == null) {
            street = "";
        }
        sh1.g gVar8 = new sh1.g(street, null, 6);
        String streetType = address.getStreetType();
        if (streetType == null) {
            streetType = "";
        }
        sh1.g gVar9 = new sh1.g(streetType, null, 6);
        String houseNumber = address.getHouseNumber();
        if (houseNumber == null) {
            houseNumber = "";
        }
        sh1.g gVar10 = new sh1.g(houseNumber, null, 6);
        String flat = address.getFlat();
        if (flat == null) {
            flat = "";
        }
        sh1.g gVar11 = new sh1.g(flat, null, 6);
        String landmark = address.getLandmark();
        if (landmark == null) {
            landmark = "";
        }
        return new sh1.h(gVar, gVar2, gVar3, gVar4, gVar5, gVar9, gVar8, gVar10, null, gVar11, gVar6, gVar7, new sh1.g(landmark, null, 6), 256);
    }

    public static void P2(b bVar, Function1 function1) {
        bVar.H2(bVar.D, new q(function1, 16, bVar, hk3.a.SINGLE_FIELD));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, this.A.j(j.f294644c), null, null, new p(this, continuation, 0), 3);
        l.a1(this, rd0.e.b(this.f65138y.d), null, null, new p(this, continuation, 1), 3);
        l2(new o23.q(this, continuation, 0), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.E;
    }

    public final Address K2() {
        Address address = this.o.f65117a;
        String string = kotlin.text.d0.F0(M2()).toString();
        y yVar = this.D;
        String strU = ehe.n.u(((w) ((j2) yVar.f22677a).getValue()).f221464a.f263347b.f263344a);
        j2 j2Var = (j2) yVar.f22677a;
        String strU2 = ehe.n.u(((w) j2Var.getValue()).d);
        String strU3 = ehe.n.u(((w) j2Var.getValue()).f221464a.f263348c.f263344a);
        String strU4 = ehe.n.u(((w) j2Var.getValue()).f221464a.k.f263344a);
        String strU5 = ehe.n.u(((w) j2Var.getValue()).f221464a.f263352l.f263344a);
        String strU6 = ehe.n.u(((w) j2Var.getValue()).f221464a.f263349g.f263344a);
        String strU7 = ehe.n.u(((w) j2Var.getValue()).f221464a.f.f263344a);
        String strU8 = ehe.n.u(((w) j2Var.getValue()).f221464a.f263350h.f263344a);
        String strU9 = ehe.n.u(((w) j2Var.getValue()).f221464a.f263351j.f263344a);
        wi0.b bVarC = com.bumptech.glide.d.c(M2());
        wi0.b.Companion.getClass();
        return address.copy((32704 & 1) != 0 ? address.streetLine1 : strU4, (32704 & 2) != 0 ? address.streetLine2 : strU5, (32704 & 4) != 0 ? address.region : (!bVarC.equals(wi0.b.f297734c) || kotlin.text.d0.W(this.C.getName())) ? !kotlin.text.d0.W(this.C.getCode()) ? this.C.getCode() : ehe.n.u(((w) j2Var.getValue()).f221464a.d.f263344a) : this.C.getName(), (32704 & 8) != 0 ? address.city : strU3, (32704 & 16) != 0 ? address.postcode : strU, (32704 & 32) != 0 ? address.country : string, (32704 & 64) != 0 ? address.fullAddress : strU2, (32704 & 128) != 0 ? address.streetType : strU7, (32704 & 256) != 0 ? address.street : strU6, (32704 & 512) != 0 ? address.houseNumber : strU8, (32704 & 1024) != 0 ? address.flat : strU9, (32704 & 2048) != 0 ? address.neighborhood : ehe.n.u(((w) j2Var.getValue()).f221464a.e.f263344a), (32704 & 4096) != 0 ? address.houseName : null, (32704 & 8192) != 0 ? address.type : null, (32704 & 16384) != 0 ? address.landmark : ehe.n.u(((w) j2Var.getValue()).f221464a.f263353m.f263344a));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof o23.n
            if (r0 == 0) goto L13
            r0 = r8
            o23.n r0 = (o23.n) r0
            int r1 = r0.f221451w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f221451w = r1
            goto L18
        L13:
            o23.n r0 = new o23.n
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f221451w
            cli.y r3 = r7.D
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            yhm.o.b(r8)
            goto L85
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            yhm.o.b(r8)
            java.lang.Object r8 = r3.f22677a
            vkm.j2 r8 = (vkm.j2) r8
            java.lang.Object r8 = r8.getValue()
            o23.w r8 = (o23.w) r8
            o23.v r8 = r8.i
            if (r8 != 0) goto L91
            r0.f221451w = r4
            fk3.a r8 = r7.f65135t
            ik3.c r8 = (ik3.c) r8
            e7l.g$a r2 = e7l.g.a.f123406a
            efm.r r2 = r8.k(r2)
            vkm.d r2 = rd0.e.b(r2)
            fk3.b r8 = r8.f161878a
            ik3.g r8 = (ik3.g) r8
            w4l.f r8 = r8.f161890j
            kotlin.Unit r5 = kotlin.Unit.f186387a
            w4l.h r6 = w4l.h.f294642c
            efm.r r8 = r8.e(r5, r6)
            vkm.d r8 = rd0.e.b(r8)
            t38.e r8 = zh9.u0.m(r2, r8)
            o23.m r2 = new o23.m
            r5 = 1
            r2.<init>(r7, r5)
            akg.n r8 = nim.a.v(r8, r2)
            nz7.g r2 = new nz7.g
            r5 = 13
            r2.<init>(r5)
            r5 = 0
            jhi.b r8 = mo3.a.g(r8, r5, r2, r4)
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L85
            return r1
        L85:
            o23.v r8 = (o23.v) r8
            nya.b0 r0 = new nya.b0
            r1 = 19
            r0.<init>(r8, r1)
            r7.H2(r3, r0)
        L91:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.L2(gim.c):java.lang.Object");
    }

    public final String M2() {
        return ((w) ((j2) this.D.f22677a).getValue()).f221464a.f263346a.f263344a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void N2(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        y yVar = this.D;
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        AddressFormScreenContract$InputData addressFormScreenContract$InputData = this.o;
        switch (iHashCode) {
            case -1433993658:
                if (listId.equals("REGION_ID")) {
                    String strM2 = M2();
                    wi0.b bVarC = com.bumptech.glide.d.c(M2());
                    this.z.getClass();
                    Y1(new PickerScreen(new PickerScreenContract$InputData(strM2, t.a(bVarC), null, null, false, new TextLocalisedClause(R$string.card_delivery_address_form_search_hint, null, null, 14), "RegionPickerScreenInteractor", null, null, null, null, false, null, addressFormScreenContract$InputData.k, addressFormScreenContract$InputData.f65123l, 109050620)), popup, new m(this, 0));
                    break;
                }
                break;
            case -638685150:
                if (listId.equals("POSTAL_CODE_LOOKUP_ID")) {
                    f2(e1(new i(new SelectAddressControllerDescriptor$InputData(M2(), ((w) ((j2) yVar.f22677a).getValue()).f221464a.f263347b.f263344a, addressFormScreenContract$InputData.k, addressFormScreenContract$InputData.f65123l))), popup, new m(this, 3));
                    break;
                }
                break;
            case -532328828:
                if (listId.equals("COUNTRY_ID")) {
                    Y1(new PickerScreen(new PickerScreenContract$InputData(new CountryPickerScreenInteractor$Params(addressFormScreenContract$InputData.f65126p), new TextLocalisedClause(R$string.card_delivery_address_form_country_picker_title, null, null, 14), null, null, false, new TextLocalisedClause(R$string.card_delivery_address_form_country_picker_search_hint, null, null, 14), "CountryPickerScreenInteractor", null, M2(), null, null, false, null, addressFormScreenContract$InputData.k, addressFormScreenContract$InputData.f65123l, 108985084)), popup, new m(this, 4));
                    break;
                }
                break;
            case 269865746:
                if (listId.equals("SEARCH_ID")) {
                    wi0.b bVarC2 = com.bumptech.glide.d.c(M2());
                    wi0.b.Companion.getClass();
                    f2(e1(new th1.e(new FindAddressControllerDescriptor$InputData(M2(), addressFormScreenContract$InputData.k, addressFormScreenContract$InputData.f65123l, 8))), popup, new b0(this, bVarC2.equals(wi0.b.O) ? AddressFormat.DETAILED : AddressFormat.INTERNATIONAL, 21));
                    break;
                }
                break;
            case 422845444:
                if (listId.equals("STREET_TYPE_ID")) {
                    x xVar = new x(new TextLocalisedClause(com.revolut.feature.address.common.api.R$string.address_form_street_type_placeholder, null, null, 14), null, null, null, false, s7a.w.HIDDEN, null, null, null, false, null, ((w) ((j2) yVar.f22677a).getValue()).f221464a.f.f263344a, null, null, false, addressFormScreenContract$InputData.k, addressFormScreenContract$InputData.f65123l, null, null, null, 2046689022);
                    Object obj2 = this.B.get();
                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                    f2(new PickerController(xVar, (x7a.d) obj2), popup, new m(this, 2));
                    break;
                }
                break;
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.D;
    }
}
