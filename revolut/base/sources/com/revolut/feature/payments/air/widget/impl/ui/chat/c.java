package com.revolut.feature.payments.air.widget.impl.ui.chat;

import kotlin.jvm.internal.Intrinsics;
import lra.d;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cl3.a f79122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3j.b f79123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f79124c;

    public c(cl3.a contactsInteractor, d3j.b beneficiaryInteractor, d cardOwnersInteractor) {
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(cardOwnersInteractor, "cardOwnersInteractor");
        this.f79122a = contactsInteractor;
        this.f79123b = beneficiaryInteractor;
        this.f79124c = cardOwnersInteractor;
    }
}
