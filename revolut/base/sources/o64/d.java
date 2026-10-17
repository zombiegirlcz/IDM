package o64;

import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.flow.CoBorrowerConsentPartnerFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoBorrowerConsentPartnerFlowContract$InputData f222498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f222499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pw3.b f222500c;

    public d(CoBorrowerConsentPartnerFlowContract$InputData inputData, j memoryCache, pw3.b coBorrowerConsentPartnerInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(coBorrowerConsentPartnerInteractor, "coBorrowerConsentPartnerInteractor");
        this.f222498a = inputData;
        this.f222499b = memoryCache;
        this.f222500c = coBorrowerConsentPartnerInteractor;
    }
}
