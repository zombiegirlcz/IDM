package com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions;

import android.os.Parcelable;
import cli.i;
import kotlin.jvm.internal.Intrinsics;
import pij.v;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f101077a;

    public a(b bVar) {
        this.f101077a = bVar;
    }

    @Override // cli.i
    public final Parcelable a(Object obj2) {
        return new EsimSubscriptionsScreenModel$RetainedState(((v) obj2).f236584j, this.f101077a.f101080d0);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable retainedState) {
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        EsimSubscriptionsScreenModel$RetainedState esimSubscriptionsScreenModel$RetainedState = (EsimSubscriptionsScreenModel$RetainedState) retainedState;
        this.f101077a.f101080d0 = esimSubscriptionsScreenModel$RetainedState.f101076b;
        return v.a((v) obj2, null, null, null, null, null, null, null, null, null, esimSubscriptionsScreenModel$RetainedState.f101075a, null, null, null, null, null, null, null, null, null, null, 2096639);
    }
}
