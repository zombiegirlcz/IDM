package com.revolut.feature.payments.profile.impl.ui_kompot.flow;

import cli.y;
import d6k.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import oki.h;
import vw9.g;
import vw9.k;
import vw9.m;
import vw9.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements g {
    public final PaymentProfileFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f79637p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f79638q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f79639r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final uw1.c f79640s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ex1.a f79641t;
    public final vw9.a u;
    public final e60.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f79642w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ali.b f79643x;

    public b(PaymentProfileFlowContract$InputData inputData, o profileSettingsMapper, d editRevTagModelExtension, j60.a bottomExpandableDialog, uw1.c apmFeatureChecker, ex1.a apmProductArticlePaymentProfileInteractor, vw9.a flashlightBridge, e60.a mediaPickerControllerExtension, kxk.o mapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(profileSettingsMapper, "profileSettingsMapper");
        Intrinsics.checkNotNullParameter(editRevTagModelExtension, "editRevTagModelExtension");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(apmProductArticlePaymentProfileInteractor, "apmProductArticlePaymentProfileInteractor");
        Intrinsics.checkNotNullParameter(flashlightBridge, "flashlightBridge");
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = inputData;
        this.f79637p = profileSettingsMapper;
        this.f79638q = editRevTagModelExtension;
        this.f79639r = bottomExpandableDialog;
        this.f79640s = apmFeatureChecker;
        this.f79641t = apmProductArticlePaymentProfileInteractor;
        this.u = flashlightBridge;
        this.v = mediaPickerControllerExtension;
        k.Companion.getClass();
        this.f79642w = mra.d.b(this, new PaymentProfileFlowContract$State(a.f79636b, inputData.f79626a.getId(), inputData.f79627b, false), mapper, null, false, 12);
        this.f79643x = s.b(this, new vvc.s(this, 1));
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f79643x;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new m(this, continuation, 1), new yi5.b(26));
        l2(new m(this, continuation, 2), new yi5.b(26));
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f79642w;
    }
}
