package com.revolut.feature_retail_user_declarations.occupation.flow;

import com.revolut.feature_retail_user_declarations.occupation.OccupationChooserFlowInputData;
import com.revolut.feature_retail_user_declarations.occupation.flow.OccupationChooserFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import s42.f;
import sbi.b;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {
    public final OccupationChooserFlowInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f97701p;

    public a(OccupationChooserFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        f fVar = new f(this, 23);
        this.f97701p = d.a(this, OccupationChooserFlowContract$Step.ChooseOccupation.f97700a, f0.f322471a, fVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f97701p;
    }
}
