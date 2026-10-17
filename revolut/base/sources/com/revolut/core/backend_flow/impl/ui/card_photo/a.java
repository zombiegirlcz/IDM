package com.revolut.core.backend_flow.impl.ui.card_photo;

import b7d.c;
import bb0.b;
import com.revolut.core.backend_flow.impl.ui.card_photo.BackendFlowCardPhotoFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends h implements b {
    public final BackendFlowCardPhotoFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f51261p;

    public a(BackendFlowCardPhotoFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        c cVar = new c(this, 14);
        this.f51261p = d.a(this, BackendFlowCardPhotoFlowContract$Step.CardPhoto.f51260a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f51261p;
    }
}
