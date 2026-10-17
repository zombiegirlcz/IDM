package com.revolut.feature.card_order_new.impl.kompot.screen.address_verification;

import ang.f;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.address.common.api.flow.FieldMode;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_design.api.CardDesignCatalogueDestination;
import com.revolut.feature.card_order_new.api.CardOrderFeatureApi$Toggles;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_form.AddressFormController;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_form.AddressFormScreenContract$InputData;
import com.revolut.feature.cards_core.R$string;
import h93.j0;
import h93.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l93.e;
import mh4.x;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pvk.i;
import q13.d;
import q23.g;
import q23.m;
import q23.p;
import q23.q;
import q23.r;
import vkm.j2;
import w4l.j;
import yji.l;
import zhm.d0;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements p {

    @NotNull
    public static final q23.h Companion = new q23.h();
    public final gte.a A;
    public final y B;
    public final com.revolut.kompot.navigable.vc.modal.a C;
    public final CardDeliveryAddressVerificationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f65148p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w39.b f65149q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f65150r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zi1.d f65151s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u23.a f65152t;
    public final j60.a u;
    public final nj1.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final mk3.e f65153w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final fk3.a f65154x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n60.a f65155y;
    public final f z;

    public b(n stateMapper, CardDeliveryAddressVerificationScreenContract$InputData inputData, d deliveryAddressInteractor, w39.b locationInteractor, e changeAddressAllowanceInteractor, zi1.d addressInteractor, u23.a dialogProvider, j60.a bottomExpandableDialogExtension, nj1.d addressValidator, mk3.e addressFormConfigValidator, fk3.a configurationInteractor, n60.a keyboardControllerExtension, f userInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deliveryAddressInteractor, "deliveryAddressInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(changeAddressAllowanceInteractor, "changeAddressAllowanceInteractor");
        Intrinsics.checkNotNullParameter(addressInteractor, "addressInteractor");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogExtension, "bottomExpandableDialogExtension");
        Intrinsics.checkNotNullParameter(addressValidator, "addressValidator");
        Intrinsics.checkNotNullParameter(addressFormConfigValidator, "addressFormConfigValidator");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f65148p = deliveryAddressInteractor;
        this.f65149q = locationInteractor;
        this.f65150r = changeAddressAllowanceInteractor;
        this.f65151s = addressInteractor;
        this.f65152t = dialogProvider;
        this.u = bottomExpandableDialogExtension;
        this.v = addressValidator;
        this.f65153w = addressFormConfigValidator;
        this.f65154x = configurationInteractor;
        this.f65155y = keyboardControllerExtension;
        this.z = userInteractor;
        this.A = featureToggleInteractor;
        Address address = inputData.f65139a;
        this.B = mra.d.b(this, new q(new Data(address, null, address == null, 2, null), false, new Data(null, null, true, 3, null), null, null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), false, new Data(null, null, true, 3, null), null, false, null), stateMapper, null, false, 12);
        this.C = hx7.e.a(this, new pu4.d(this, 21));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b r11, com.revolut.feature.address.models.Address r12, gim.c r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof q23.j
            if (r0 == 0) goto L13
            r0 = r13
            q23.j r0 = (q23.j) r0
            int r1 = r0.f241505x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241505x = r1
            goto L18
        L13:
            q23.j r0 = new q23.j
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241505x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            gk3.d r11 = r0.u
            yhm.o.b(r13)
            goto L6b
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            yhm.o.b(r13)
            cli.y r13 = r11.B
            java.lang.Object r13 = r13.f22677a
            vkm.j2 r13 = (vkm.j2) r13
            java.lang.Object r13 = r13.getValue()
            q23.q r13 = (q23.q) r13
            com.revolut.data.model.Data r13 = r13.f241514g
            wi0.b r2 = nz8.d.g(r12)
            gk3.d r13 = P2(r13, r2)
            zi1.d r11 = r11.f65151s
            r0.u = r13
            r0.f241505x = r4
            cj1.k r11 = r11.f322492a
            r11.getClass()
            c84.y r2 = new c84.y
            r4 = 21
            r2.<init>(r11, r12, r3, r4)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r2, r0)
            if (r11 != r1) goto L68
            return r1
        L68:
            r10 = r13
            r13 = r11
            r11 = r10
        L6b:
            com.revolut.feature.address.models.AddressSuggestion r13 = (com.revolut.feature.address.models.AddressSuggestion) r13
            com.revolut.feature.address.models.AddressSuggestion r4 = new com.revolut.feature.address.models.AddressSuggestion
            boolean r5 = r13.getVerified()
            com.revolut.feature.address.models.Address r12 = r13.getAddress()
            if (r12 == 0) goto L7d
            com.revolut.feature.address.models.Address r3 = m33.a.a(r12, r11)
        L7d:
            r6 = r3
            r8 = 4
            r9 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b.I2(com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b, com.revolut.feature.address.models.Address, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b r7, com.revolut.feature.address.models.Address r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof q23.k
            if (r0 == 0) goto L14
            r0 = r9
            q23.k r0 = (q23.k) r0
            int r1 = r0.f241508y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f241508y = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            q23.k r0 = new q23.k
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.f241506w
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f241508y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            yhm.o.b(r9)
            return r9
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            wi0.b r8 = r6.v
            com.revolut.feature.address.models.Address r1 = r6.u
            yhm.o.b(r9)
            r3 = r1
            goto L5a
        L3d:
            yhm.o.b(r9)
            wi0.b r9 = nz8.d.g(r8)
            zi1.d r1 = r7.f65151s
            java.lang.String r4 = r8.getCountry()
            r6.u = r8
            r6.v = r9
            r6.f241508y = r3
            java.lang.Object r1 = r1.a(r4, r6)
            if (r1 != r0) goto L57
            goto L9e
        L57:
            r3 = r8
            r8 = r9
            r9 = r1
        L5a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r4 = r9.booleanValue()
            cli.y r9 = r7.B
            java.lang.Object r9 = r9.f22677a
            vkm.j2 r9 = (vkm.j2) r9
            java.lang.Object r9 = r9.getValue()
            q23.q r9 = (q23.q) r9
            com.revolut.data.model.Data r9 = r9.f
            java.lang.Object r9 = r9.getContent()
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L78
            zhm.f0 r9 = zhm.f0.f322471a
        L78:
            r5 = r9
            nj1.d r7 = r7.v
            wi0.a r9 = wi0.b.Companion
            r9.getClass()
            wi0.b r9 = wi0.b.O
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r9)
            if (r8 == 0) goto L8b
            com.revolut.feature.address.models.AddressFormat r8 = com.revolut.feature.address.models.AddressFormat.DETAILED
            goto L8d
        L8b:
            com.revolut.feature.address.models.AddressFormat r8 = com.revolut.feature.address.models.AddressFormat.INTERNATIONAL
        L8d:
            r9 = 0
            r6.u = r9
            r6.v = r9
            r6.f241508y = r2
            r1 = r7
            nj1.h r1 = (nj1.h) r1
            r2 = r8
            java.lang.Object r7 = r1.e(r2, r3, r4, r5, r6)
            if (r7 != r0) goto L9f
        L9e:
            return r0
        L9f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b.J2(com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b, com.revolut.feature.address.models.Address, gim.c):java.lang.Object");
    }

    public static /* synthetic */ void M2(b bVar, Address address, boolean z) {
        bVar.L2(address, z, g.UNSPECIFIED);
    }

    public static void O2(b bVar, Address address) {
        bVar.C2(new r(address, null, ((q) ((j2) bVar.B.f22677a).getValue()).f241517l));
    }

    public static gk3.d P2(Data data, wi0.b bVar) {
        Object next;
        gk3.e eVar = (gk3.e) data.getContent();
        if (eVar != null) {
            Iterator it8 = eVar.f144321a.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                List list = ((gk3.d) next).f144319a;
                if (list != null && list.contains(bVar)) {
                    break;
                }
            }
            gk3.d dVar = (gk3.d) next;
            if (dVar != null) {
                return dVar;
            }
        }
        gk3.e eVar2 = (gk3.e) data.getContent();
        if (eVar2 != null) {
            return eVar2.f144322b;
        }
        return null;
    }

    @Override // yji.l
    public final void I1() {
        this.f65155y.R();
        Continuation continuation = null;
        l2(new m(this, continuation, 1), new yi5.b(26));
        l2(new m(this, continuation, 0), new yi5.b(26));
        l.a1(this, this.z.j(j.f294644c), null, null, new q23.l(this, continuation, 2), 3);
        l.a1(this, new i(rd0.e.b(this.u.E()), 8), null, null, new m(this, continuation, 2), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.C;
    }

    public final void K2() {
        c93.e eVar = c93.e.VIRTUAL;
        CardDeliveryAddressVerificationScreenContract$InputData cardDeliveryAddressVerificationScreenContract$InputData = this.o;
        j0 j0Var = cardDeliveryAddressVerificationScreenContract$InputData.e;
        if (j0Var == null) {
            j0Var = j0.RETAIL;
        }
        j0 j0Var2 = j0Var;
        l0 l0Var = cardDeliveryAddressVerificationScreenContract$InputData.f;
        if (l0Var == null) {
            l0Var = l0.DEBIT;
        }
        C1(new CardDesignCatalogueDestination(null, eVar, j0Var2, l0Var, cardDeliveryAddressVerificationScreenContract$InputData.f65142g, null, cardDeliveryAddressVerificationScreenContract$InputData.f65143h, null, false, false, null, null, cardDeliveryAddressVerificationScreenContract$InputData.f65141c, null, null, null, null, y0.b(eVar), false, null, null, 16510880));
    }

    public final void L2(Address address, boolean z, g gVar) {
        Address empty = address == null ? Address.INSTANCE.getEMPTY() : address;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_delivery_address_form_title, null, null, 14);
        CardDeliveryAddressVerificationScreenContract$InputData cardDeliveryAddressVerificationScreenContract$InputData = this.o;
        l.j2(this, new AddressFormController(new AddressFormScreenContract$InputData(empty, z, textLocalisedClause, null, cardDeliveryAddressVerificationScreenContract$InputData.d.size() > 1 ? new FieldMode.Editable(true) : FieldMode.NotEditable.f60955a, cardDeliveryAddressVerificationScreenContract$InputData.f65141c, null, ((q) ((j2) this.B.f22677a).getValue()).f241512b, cardDeliveryAddressVerificationScreenContract$InputData.d, 14712)), null, new pth.m(this, gVar, 23), 1);
    }

    public final void N2() {
        Address addressCopy;
        y yVar = this.B;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        boolean z = ((q) j2Var.getValue()).f241515h;
        if (z) {
            addressCopy = (Address) ((q) j2Var2.getValue()).f241511a.getContent();
        } else {
            Address address = (Address) ((q) j2Var2.getValue()).f241511a.getContent();
            if (address != null) {
                Address empty = Address.INSTANCE.getEMPTY();
                addressCopy = empty.copy((32704 & 1) != 0 ? empty.streetLine1 : null, (32704 & 2) != 0 ? empty.streetLine2 : null, (32704 & 4) != 0 ? empty.region : null, (32704 & 8) != 0 ? empty.city : null, (32704 & 16) != 0 ? empty.postcode : null, (32704 & 32) != 0 ? empty.country : address.getCountry(), (32704 & 64) != 0 ? empty.fullAddress : null, (32704 & 128) != 0 ? empty.streetType : null, (32704 & 256) != 0 ? empty.street : null, (32704 & 512) != 0 ? empty.houseNumber : null, (32704 & 1024) != 0 ? empty.flat : null, (32704 & 2048) != 0 ? empty.neighborhood : null, (32704 & 4096) != 0 ? empty.houseName : null, (32704 & 8192) != 0 ? empty.type : null, (32704 & 16384) != 0 ? empty.landmark : null);
            } else {
                addressCopy = null;
            }
        }
        M2(this, addressCopy, z);
    }

    public final Set Q2(final Address address, gk3.d config) {
        ArrayList arrayList = config.f144320b;
        boolean zC = ((jte.d) this.A).c(CardOrderFeatureApi$Toggles.CardDeliveryKycAddressValidation.f64944c);
        final mk3.e eVar = this.f65153w;
        if (zC) {
            eVar.getClass();
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(config, "config");
            final int i = 1;
            return nkm.y.L(nkm.y.x(nkm.y.n(nkm.y.n(d0.Q(arrayList), new mk3.c(0)), new Function1() { // from class: mk3.b
                /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r3) {
                    /*
                        r2 = this;
                        int r0 = r3
                        gk3.a r3 = (gk3.a) r3
                        switch(r0) {
                            case 0: goto L3f;
                            default: goto L7;
                        }
                    L7:
                        java.lang.String r0 = "fieldConfig"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                        mk3.e r0 = r1
                        r0.getClass()
                        gk3.c r0 = r3.f144316a
                        com.revolut.feature.address.models.Address r1 = r2
                        java.lang.String r0 = mk3.e.a(r1, r0)
                        if (r0 != 0) goto L1d
                        java.lang.String r0 = ""
                    L1d:
                        boolean r1 = r3.a()
                        if (r1 == 0) goto L2a
                        boolean r1 = kotlin.text.d0.W(r0)
                        if (r1 == 0) goto L2a
                        goto L39
                    L2a:
                        int r0 = r0.length()
                        int r1 = r3.f144317b
                        if (r0 < r1) goto L39
                        int r3 = r3.f144318c
                        if (r0 <= r3) goto L37
                        goto L39
                    L37:
                        r3 = 0
                        goto L3a
                    L39:
                        r3 = 1
                    L3a:
                        java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                        return r3
                    L3f:
                        java.lang.String r0 = "fieldConfig"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                        mk3.e r0 = r1
                        r0.getClass()
                        boolean r0 = r3.a()
                        if (r0 == 0) goto L61
                        gk3.c r3 = r3.f144316a
                        com.revolut.feature.address.models.Address r0 = r2
                        java.lang.String r3 = mk3.e.a(r0, r3)
                        if (r3 == 0) goto L5f
                        boolean r3 = kotlin.text.d0.W(r3)
                        if (r3 == 0) goto L61
                    L5f:
                        r3 = 1
                        goto L62
                    L61:
                        r3 = 0
                    L62:
                        java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: mk3.b.invoke(java.lang.Object):java.lang.Object");
                }
            }), new mk3.c(1)));
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(config, "config");
        final int i2 = 0;
        return nkm.y.L(nkm.y.x(nkm.y.n(nkm.y.n(d0.Q(arrayList), new x(28)), new Function1() { // from class: mk3.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object v) {
                /*
                    this = this;
                    int r0 = r3
                    gk3.a r3 = (gk3.a) r3
                    switch(r0) {
                        case 0: goto L3f;
                        default: goto L7;
                    }
                L7:
                    java.lang.String r0 = "fieldConfig"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    mk3.e r0 = r1
                    r0.getClass()
                    gk3.c r0 = r3.f144316a
                    com.revolut.feature.address.models.Address r1 = r2
                    java.lang.String r0 = mk3.e.a(r1, r0)
                    if (r0 != 0) goto L1d
                    java.lang.String r0 = ""
                L1d:
                    boolean r1 = r3.a()
                    if (r1 == 0) goto L2a
                    boolean r1 = kotlin.text.d0.W(r0)
                    if (r1 == 0) goto L2a
                    goto L39
                L2a:
                    int r0 = r0.length()
                    int r1 = r3.f144317b
                    if (r0 < r1) goto L39
                    int r3 = r3.f144318c
                    if (r0 <= r3) goto L37
                    goto L39
                L37:
                    r3 = 0
                    goto L3a
                L39:
                    r3 = 1
                L3a:
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                    return r3
                L3f:
                    java.lang.String r0 = "fieldConfig"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    mk3.e r0 = r1
                    r0.getClass()
                    boolean r0 = r3.a()
                    if (r0 == 0) goto L61
                    gk3.c r3 = r3.f144316a
                    com.revolut.feature.address.models.Address r0 = r2
                    java.lang.String r3 = mk3.e.a(r0, r3)
                    if (r3 == 0) goto L5f
                    boolean r3 = kotlin.text.d0.W(r3)
                    if (r3 == 0) goto L61
                L5f:
                    r3 = 1
                    goto L62
                L61:
                    r3 = 0
                L62:
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: mk3.b.invoke(java.lang.Object):java.lang.Object");
            }
        }), new x(29)));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.B;
    }
}
