package com.revolut.feature_retail_user_declarations.citizenship.collect_citizenship;

import com.revolut.feature_retail_user_declarations.citizenship.collect_citizenship.CollectCitizenshipFlowContract$Step;
import g75.i;
import gai.d;
import gai.g;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements d {

    @NotNull
    private static final g Companion = new g();
    public final CollectCitizenshipFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f80.a f97522p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final phm.a f97523q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f97524r;

    public b(CollectCitizenshipFlowContract$InputData inputData, f80.a uriHelper, phm.a citizenshipPickerControllerInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(citizenshipPickerControllerInteractor, "citizenshipPickerControllerInteractor");
        this.o = inputData;
        this.f97522p = uriHelper;
        this.f97523q = citizenshipPickerControllerInteractor;
        this.f97524r = cp5.d.a(this, inputData.d ? CollectCitizenshipFlowContract$Step.ChooseCitizenshipPicker.f97518a : new CollectCitizenshipFlowContract$Step.CitizenshipPrompt(inputData.f97512a), f0.f322471a, new i(this, 8));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f97524r;
    }
}
