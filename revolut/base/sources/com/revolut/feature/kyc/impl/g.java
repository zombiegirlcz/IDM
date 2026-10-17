package com.revolut.feature.kyc.impl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.impl.KycScreenContract$KycDocsStatus;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    public static final StatusViewConfiguration.Pending a(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new StatusViewConfiguration.Pending("verifying_identity_dialog_id", new TextLocalisedClause(R$string.kyc_pending_modal_title, null, null, 14), com.bumptech.glide.d.t(countryCode) ? new TextLocalisedClause(R$string.kyc_pending_modal_jp_description, null, null, 14) : new TextLocalisedClause(R$string.kyc_pending_modal_description, null, null, 14), null, null, KycScreenContract$KycDocsStatus.Completed.f77552a, false, 8120);
    }
}
