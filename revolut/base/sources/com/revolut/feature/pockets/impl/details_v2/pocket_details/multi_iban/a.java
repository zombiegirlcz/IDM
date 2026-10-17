package com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban;

import com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban.MultiIbanFlowContract$Step;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban.models.MultiIbanPayload;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import lea.c;
import oki.h;
import uea.f;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements c {
    public final MultiIbanFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f80871p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f80872q;

    public a(MultiIbanFlowContract$InputData inputData, f pocketDetailsRepository) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pocketDetailsRepository, "pocketDetailsRepository");
        this.o = inputData;
        this.f80871p = pocketDetailsRepository;
        MultiIbanPayload multiIbanPayload = inputData.f80866a;
        this.f80872q = d.a(this, new MultiIbanFlowContract$Step.VirtualIbanBottomSheet(multiIbanPayload.f80873a, multiIbanPayload.d), f0.f322471a, new lcc.c(this, 3));
    }

    @Override // yki.g
    public final b s() {
        return this.f80872q;
    }
}
