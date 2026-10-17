package com.revolut.feature.topup_screen.impl.flows.stored_method.flow;

import com.revolut.feature.topup_screen.impl.flows.stored_method.flow.StoredMethodFlowContract$Step;
import cp5.d;
import gim.i;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n14.k;
import oki.h;
import org.jetbrains.annotations.NotNull;
import sxe.c;
import sxe.f;
import wxe.i0;
import xg6.l;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends h implements sxe.b {

    @NotNull
    public static final f Companion = new f();
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i0 f90796p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wxe.a f90797q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u51.a f90798r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f90799s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.feature.external_accounts.api.navigation.a f90800t;
    public final gte.a u;
    public final yki.a v;

    public b(c inputData, i0 removalDialogProvider, wxe.a revokeDialogProvider, u51.a topUpMethodsInteractor, l linkExternalInstitutionsInteractor, com.revolut.feature.external_accounts.api.navigation.a externalPocketNavigationFactory, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(removalDialogProvider, "removalDialogProvider");
        Intrinsics.checkNotNullParameter(revokeDialogProvider, "revokeDialogProvider");
        Intrinsics.checkNotNullParameter(topUpMethodsInteractor, "topUpMethodsInteractor");
        Intrinsics.checkNotNullParameter(linkExternalInstitutionsInteractor, "linkExternalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(externalPocketNavigationFactory, "externalPocketNavigationFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f90796p = removalDialogProvider;
        this.f90797q = revokeDialogProvider;
        this.f90798r = topUpMethodsInteractor;
        this.f90799s = linkExternalInstitutionsInteractor;
        this.f90800t = externalPocketNavigationFactory;
        this.u = featureToggleInteractor;
        suf.a aVar = new suf.a(this, 7);
        this.v = d.a(this, StoredMethodFlowContract$Step.StoredMethodDetails.f90791a, f0.f322471a, aVar);
    }

    public static final Object I2(b bVar, String str, String str2, String str3, i iVar) {
        Object objQ = k.Q(bVar, null, new lic.a(bVar, 13), new a3b.i(bVar, str3, 19), new sxe.i(bVar, str2, str, null), iVar, 1);
        return objQ == fim.a.COROUTINE_SUSPENDED ? objQ : Unit.f186387a;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
