package yrb;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y implements j0b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kdh.b f316260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.u f316261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fsb.a f316262c;
    public final Map d;
    public final Map e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f316263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f316264h;
    public final wj0.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final vdf.d f316265j;
    public final csb.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ybl.b f316266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qd0.b f316267m;

    public y(kdh.b instrumentActionsInteractor, te0.u persistentFieldProvider, fsb.a termsAndConditionsControllerProvider, ImmutableMap infoMappers, ImmutableMap configProviders, ImmutableMap centeredAmountMappers, ImmutableMap validationProviders, ImmutableMap tradingInteractors, wj0.a idempotencyKeyHolder, vdf.d assetFormatter, csb.a orderResultDialogProvider, ybl.b instrumentTickerInteractor, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(instrumentActionsInteractor, "instrumentActionsInteractor");
        Intrinsics.checkNotNullParameter(persistentFieldProvider, "persistentFieldProvider");
        Intrinsics.checkNotNullParameter(termsAndConditionsControllerProvider, "termsAndConditionsControllerProvider");
        Intrinsics.checkNotNullParameter(infoMappers, "infoMappers");
        Intrinsics.checkNotNullParameter(configProviders, "configProviders");
        Intrinsics.checkNotNullParameter(centeredAmountMappers, "centeredAmountMappers");
        Intrinsics.checkNotNullParameter(validationProviders, "validationProviders");
        Intrinsics.checkNotNullParameter(tradingInteractors, "tradingInteractors");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(assetFormatter, "assetFormatter");
        Intrinsics.checkNotNullParameter(orderResultDialogProvider, "orderResultDialogProvider");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f316260a = instrumentActionsInteractor;
        this.f316261b = persistentFieldProvider;
        this.f316262c = termsAndConditionsControllerProvider;
        this.d = infoMappers;
        this.e = configProviders;
        this.f = centeredAmountMappers;
        this.f316263g = validationProviders;
        this.f316264h = tradingInteractors;
        this.i = idempotencyKeyHolder;
        this.f316265j = assetFormatter;
        this.k = orderResultDialogProvider;
        this.f316266l = instrumentTickerInteractor;
        this.f316267m = languageProvider;
    }

    @Override // j0b.c
    public final j0b.d a() {
        return new b0(this.f316265j, this.d, this.f);
    }

    @Override // j0b.c
    public final j0b.a b() {
        return new s(this.f316260a, this.f316261b, this.f316262c, this.i, this.f316266l, this.f316264h, this.e, this.f316263g, this.d, this.f316265j, this.k);
    }

    @Override // j0b.c
    public final yji.d c(j0b.b delegatesProvider, j0b.a controllerModelExtension) {
        Intrinsics.checkNotNullParameter(delegatesProvider, "delegatesProvider");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        return new g(this.f316267m, (t) delegatesProvider, (s) controllerModelExtension);
    }

    @Override // j0b.c
    public final j0b.b d() {
        return new t();
    }
}
