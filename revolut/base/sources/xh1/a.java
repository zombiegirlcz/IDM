package xh1;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.api.flow.AddressFlowUseCase;
import com.revolut.feature.address.common.api.navigation.AddressFlowNavigationDestination;
import com.revolut.feature.address.common.impl.flow.AddressFlow;
import com.revolut.feature.address.common.impl.flow.screen.find.flow.AddressSearchFlow;
import com.revolut.feature.address.common.impl.flow.screen.select.SelectAddressScreen;
import gc0.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import vh1.d;
import vi1.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f305792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x7a.d f305793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f305794c;

    public a(d defaultAddressValidator, x7a.d defaultCountryPickerInteractor, i addressFlowStringFactory) {
        Intrinsics.checkNotNullParameter(defaultAddressValidator, "defaultAddressValidator");
        Intrinsics.checkNotNullParameter(defaultCountryPickerInteractor, "defaultCountryPickerInteractor");
        Intrinsics.checkNotNullParameter(addressFlowStringFactory, "addressFlowStringFactory");
        this.f305792a = defaultAddressValidator;
        this.f305793b = defaultCountryPickerInteractor;
        this.f305794c = addressFlowStringFactory;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof th1.a)) {
            if (descriptor instanceof th1.i) {
                th1.i iVar = (th1.i) descriptor;
                return iVar.a(new SelectAddressScreen(iVar.b(), this.f305794c.a(AddressFlowUseCase.Default.f60949a, com.bumptech.glide.d.c(iVar.b().getF60960a()))));
            }
            if (!(descriptor instanceof th1.e)) {
                return null;
            }
            th1.e eVar = (th1.e) descriptor;
            return eVar.a(new AddressSearchFlow(eVar.b()));
        }
        th1.a aVar = (th1.a) descriptor;
        AddressFlowContract$InputData addressFlowContract$InputDataD = aVar.d();
        d dVarB = aVar.b();
        if (dVarB == null) {
            dVarB = this.f305792a;
        }
        x7a.d dVarC = aVar.c();
        x7a.d dVar = this.f305793b;
        if (dVarC == null) {
            dVarC = dVar;
        }
        if (dVarC != null) {
            dVar = dVarC;
        }
        return aVar.a(new AddressFlow(addressFlowContract$InputDataD, dVarB, dVar));
    }

    @Override // nte.a
    public final List e() {
        return oh1.b.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof AddressFlowNavigationDestination) {
            return c.b(new AddressFlow(((AddressFlowNavigationDestination) destination).getF60956b(), this.f305792a, this.f305793b), new v1c.c(7));
        }
        return null;
    }
}
