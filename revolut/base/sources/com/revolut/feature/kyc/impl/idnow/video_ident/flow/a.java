package com.revolut.feature.kyc.impl.idnow.video_ident.flow;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.impl.idnow.video_ident.flow.IdnowVideoIdentFlowContract$Step;
import cp5.d;
import fb.c;
import hw8.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final TextLocalisedClause o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextLocalisedClause f77789p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextLocalisedClause f77790q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextLocalisedClause f77791r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CdnImage f77792s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f77793t;

    public a(IdnowVideoIdentFlowContract$InputData inputData, y80.a permissionProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        this.o = new TextLocalisedClause(R$string.video_conference_permissions_not_granted_title, null, null, 14);
        this.f77789p = new TextLocalisedClause(R$string.video_conference_permissions_not_granted_subtitle, null, null, 14);
        this.f77790q = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14);
        this.f77791r = new TextLocalisedClause(R$string.video_conference_permissions_open_settings, null, null, 14);
        this.f77792s = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D019", null, null, null, 30);
        this.f77793t = d.a(this, (permissionProvider.c("android.permission.CAMERA") && permissionProvider.c("android.permission.RECORD_AUDIO")) ? new IdnowVideoIdentFlowContract$Step.WebPortal(inputData.f77783a, inputData.f77784b) : IdnowVideoIdentFlowContract$Step.PermissionPrompt.f77785a, f0.f322471a, new c(this, inputData, 14));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77793t;
    }
}
