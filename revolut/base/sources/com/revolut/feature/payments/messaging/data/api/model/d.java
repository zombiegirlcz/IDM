package com.revolut.feature.payments.messaging.data.api.model;

import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d {
    public static final boolean a(MessageType.PlanReferral planReferral) {
        Intrinsics.checkNotNullParameter(planReferral, "<this>");
        return Math.abs(planReferral.f - 1.0d) < 1.0E-5d;
    }
}
