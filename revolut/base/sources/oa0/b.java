package oa0;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.api.flow.AddressFlowUseCase;
import com.revolut.feature.address.common.api.flow.AddressValidationMode;
import com.revolut.feature.address.common.api.flow.FieldMode;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressVerificationUseCase;
import com.revolut.feature.backend_flow.domain.models.AddressInputItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.jvm.internal.Intrinsics;
import l3l.m;
import n68.w;
import od0.i;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o90.a f223486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final yc0.a f223487m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final aa0.a f223488n;
    public final i o;

    public b(o90.a navigationProvider, yc0.a addressFlowMapper, aa0.a addressInputInteractor, i addressBackendFlowParams) {
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(addressFlowMapper, "addressFlowMapper");
        Intrinsics.checkNotNullParameter(addressInputInteractor, "addressInputInteractor");
        Intrinsics.checkNotNullParameter(addressBackendFlowParams, "addressBackendFlowParams");
        this.f223486l = navigationProvider;
        this.f223487m = addressFlowMapper;
        this.f223488n = addressInputInteractor;
        this.o = addressBackendFlowParams;
    }

    @Override // oa0.a
    public final ViewController Z2(FormScreen screen, m withResult) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(withResult, "withResult");
        Object objB0 = d0.b0(screen.f63468b);
        Intrinsics.i(objB0, "null cannot be cast to non-null type com.revolut.feature.backend_flow.domain.models.AddressInputItem");
        AddressInputItem addressInputItem = (AddressInputItem) objB0;
        AddressFlowContract$InputData inputData = ((yc0.c) this.f223487m).a(screen, addressInputItem);
        if (this.o.f224257a != null) {
            throw new ClassCastException();
        }
        ((ul2.i) this.f223486l).getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AddressValidationMode.Verification addressValidationMode = new AddressValidationMode.Verification(AddressVerificationUseCase.UNSPECIFIED);
        Address address = inputData.f60926a;
        Clause title = inputData.f60927b;
        Clause clause = inputData.d;
        boolean z = inputData.e;
        boolean z3 = inputData.f;
        Clause clause2 = inputData.f60929g;
        FieldMode countryMode = inputData.f60930h;
        qh1.b backNavigationType = inputData.f60932l;
        boolean z4 = inputData.o;
        AnalyticsProduct analyticsProduct = inputData.f60935p;
        boolean z6 = inputData.f60937r;
        AddressFlowUseCase useCase = inputData.f60939t;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(countryMode, "countryMode");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        Intrinsics.checkNotNullParameter(addressValidationMode, "addressValidationMode");
        ViewController viewControllerO2 = o2(new th1.a(new AddressFlowContract$InputData(null, analyticsProduct, title, null, clause, clause2, null, null, useCase, addressValidationMode, countryMode, address, backNavigationType, z, z3, false, false, false, z4, z6, true), null, null, 6));
        w block = new w(this, screen, addressInputItem, withResult, 17);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerO2.H = block;
        return viewControllerO2;
    }
}
