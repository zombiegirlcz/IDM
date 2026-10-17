package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_selection;

import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_selection.EsimMobilePlanNumberSelectionFlowContract$Step;
import cp5.d;
import fgj.b;
import fgj.g;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final EsimMobilePlanNumberSelectionFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f100728p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f100729q;

    public a(EsimMobilePlanNumberSelectionFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f100728p = inputData.f100721a;
        g gVar = new g(this, 0);
        this.f100729q = d.a(this, EsimMobilePlanNumberSelectionFlowContract$Step.PhoneNumberSelections.f100726a, f0.f322471a, gVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f100729q;
    }
}
