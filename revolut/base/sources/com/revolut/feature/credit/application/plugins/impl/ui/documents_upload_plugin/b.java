package com.revolut.feature.credit.application.plugins.impl.ui.documents_upload_plugin;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload_plugin.DocumentsUploadPluginFlowContract$Step;
import cp5.d;
import da4.g;
import e84.e;
import g75.i;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends t implements ga4.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jw3.a f67602p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ax3.a f67603q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final DocumentsUploadPluginFlowContract$InputData f67604r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f67605s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f67606t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(jw3.a documentsUploadInteractor, ax3.a documentsUploadPluginInteractor, DocumentsUploadPluginFlowContract$InputData inputData, g documentsUploadSuccessDialogMapper, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(documentsUploadInteractor, "documentsUploadInteractor");
        Intrinsics.checkNotNullParameter(documentsUploadPluginInteractor, "documentsUploadPluginInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(documentsUploadSuccessDialogMapper, "documentsUploadSuccessDialogMapper");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67602p = documentsUploadInteractor;
        this.f67603q = documentsUploadPluginInteractor;
        this.f67604r = inputData;
        this.f67605s = documentsUploadSuccessDialogMapper;
        i iVar = new i(this, 5);
        this.f67606t = d.a(this, DocumentsUploadPluginFlowContract$Step.Initial.f67601a, f0.f322471a, iVar);
    }

    @Override // yji.l
    public final void I1() {
        l2(new a(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67606t;
    }
}
