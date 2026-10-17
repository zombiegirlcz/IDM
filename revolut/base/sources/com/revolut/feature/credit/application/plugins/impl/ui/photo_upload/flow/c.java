package com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.PhotosUploadFlowContract$Step;
import e60.i;
import e60.s;
import e84.e;
import ip0.u00;
import jch.p;
import jg4.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends t implements jg4.b {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PhotosUploadFlowContract$InputData f68198p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e60.a f68199q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wx3.c f68200r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jg4.a f68201s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f68202t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PhotosUploadFlowContract$InputData inputData, e60.a mediaPickerControllerExtension, wx3.c photosUploadPluginInteractor, jg4.a dialogModelProvider, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(photosUploadPluginInteractor, "photosUploadPluginInteractor");
        Intrinsics.checkNotNullParameter(dialogModelProvider, "dialogModelProvider");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68198p = inputData;
        this.f68199q = mediaPickerControllerExtension;
        this.f68200r = photosUploadPluginInteractor;
        this.f68201s = dialogModelProvider;
        p pVar = new p(this, 12);
        this.f68202t = cp5.d.a(this, PhotosUploadFlowContract$Step.Loading.f68193a, f0.f322471a, pVar);
    }

    @Override // yji.l
    public final void I1() {
        l2(new b(this, null), new yi5.b(26));
    }

    public final void P2() {
        ((s) this.f68199q).T(new i(null, null, null, false, 0, 0, f0.f322471a, null, false, u00.BACK, null, 11455));
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, rd0.e.b(((s) this.f68199q).f122868g), null, new a(this, null), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68202t;
    }
}
