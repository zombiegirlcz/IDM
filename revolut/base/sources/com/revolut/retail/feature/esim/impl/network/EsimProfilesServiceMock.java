package com.revolut.retail.feature.esim.impl.network;

import kfj.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lfj.q;
import mfj.g;
import mfj.h;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Query;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/network/EsimProfilesServiceMock;", "Lcom/revolut/retail/feature/esim/impl/network/EsimProfilesService;", "<init>", "()V", "", "mobilePlanType", "Lmfj/h;", "getProfiles", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimProfilesServiceMock implements EsimProfilesService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EsimProfilesServiceMock f100569a = new EsimProfilesServiceMock();

    private EsimProfilesServiceMock() {
    }

    @Override // com.revolut.retail.feature.esim.impl.network.EsimProfilesService
    public final Object getConnectivityTroubleshootingInfo(String str, Continuation continuation) {
        if (str == null) {
            str = "f1fe463e-3b55-11ee-be56-0242ac120001";
        }
        return new l(str, null, null, false, false, null);
    }

    @Override // com.revolut.retail.feature.esim.impl.network.EsimProfilesService
    public final Object getConnectivityTroubleshootingScopes(Continuation continuation) {
        return new g(f0.f322471a);
    }

    @Override // com.revolut.retail.feature.esim.impl.network.EsimProfilesService
    public Object getProfiles(@Query("mobilePlanType") String str, @NotNull Continuation<? super h> continuation) {
        return new h(f0.f322471a);
    }

    @Override // com.revolut.retail.feature.esim.impl.network.EsimProfilesService
    public final Object reissueProfile(String str, Continuation continuation) {
        Response responseSuccess = Response.success(null);
        Intrinsics.checkNotNullExpressionValue(responseSuccess, "success(...)");
        return responseSuccess;
    }

    @Override // com.revolut.retail.feature.esim.impl.network.EsimProfilesService
    public final Object trackInstallationProgress(String str, q qVar, Continuation continuation) {
        return Unit.f186387a;
    }

    @Override // com.revolut.retail.feature.esim.impl.network.EsimProfilesService
    public final Object transferProfileToCurrentDevice(String str, Continuation continuation) {
        Response responseSuccess = Response.success(null);
        Intrinsics.checkNotNullExpressionValue(responseSuccess, "success(...)");
        return responseSuccess;
    }

    @Override // com.revolut.retail.feature.esim.impl.network.EsimProfilesService
    public final Object unlockProfile(String str, Continuation continuation) {
        return Unit.f186387a;
    }
}
