package com.revolut.feature.restricted_access.impl.ui.flow;

import c0b.e;
import c0b.f;
import com.revolut.feature.restricted_access.impl.ui.flow.RestrictedAccessPromptFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements e {

    @NotNull
    public static final f Companion = new f();
    public final RestrictedAccessPromptFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zza.a f82053p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f82054q;

    public b(RestrictedAccessPromptFlowContract$InputData inputData, zza.a restrictedAccessConfiguration) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(restrictedAccessConfiguration, "restrictedAccessConfiguration");
        this.o = inputData;
        this.f82053p = restrictedAccessConfiguration;
        bwd.a aVar = new bwd.a(this, 8);
        this.f82054q = d.a(this, RestrictedAccessPromptFlowContract$Step.Initial.f82050a, f0.f322471a, aVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f82054q;
    }
}
