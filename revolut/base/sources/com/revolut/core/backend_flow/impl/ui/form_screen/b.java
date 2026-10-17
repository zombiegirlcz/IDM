package com.revolut.core.backend_flow.impl.ui.form_screen;

import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import g5k.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendFlow f51288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f51289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f51290c;
    public final phm.a d;
    public final phm.a e;

    public b(BackendFlow backendFlow, e countrySelectionControllerFactory, phm.a currencyPickerInteractor, phm.a phoneCodePickerInteractor, phm.a dropDownItemOptionPickerInteractor) {
        Intrinsics.checkNotNullParameter(backendFlow, "backendFlow");
        Intrinsics.checkNotNullParameter(countrySelectionControllerFactory, "countrySelectionControllerFactory");
        Intrinsics.checkNotNullParameter(currencyPickerInteractor, "currencyPickerInteractor");
        Intrinsics.checkNotNullParameter(phoneCodePickerInteractor, "phoneCodePickerInteractor");
        Intrinsics.checkNotNullParameter(dropDownItemOptionPickerInteractor, "dropDownItemOptionPickerInteractor");
        this.f51288a = backendFlow;
        this.f51289b = countrySelectionControllerFactory;
        this.f51290c = currencyPickerInteractor;
        this.d = phoneCodePickerInteractor;
        this.e = dropDownItemOptionPickerInteractor;
    }
}
