package com.revolut.feature.apm.qvik.impl.ui;

import com.revolut.feature.apm.qvik.api.navigation.QvikNavigation$InputData;
import com.revolut.feature.apm.qvik.api.navigation.QvikNavigation$StartType;
import com.revolut.feature.apm.qvik.impl.ui.QvikFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l0c.v;
import lc2.b;
import mc2.g;
import mc2.n;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final QvikNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f62802p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f62803q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f62804r;

    public a(QvikNavigation$InputData flowInputData, g newContactNavigationProvider, n recipientListNavigationProvider) {
        FlowStep pay;
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(newContactNavigationProvider, "newContactNavigationProvider");
        Intrinsics.checkNotNullParameter(recipientListNavigationProvider, "recipientListNavigationProvider");
        this.o = flowInputData;
        this.f62802p = newContactNavigationProvider;
        this.f62803q = recipientListNavigationProvider;
        QvikNavigation$StartType qvikNavigation$StartType = flowInputData.f62774a;
        if (qvikNavigation$StartType instanceof QvikNavigation$StartType.Area) {
            pay = QvikFlowContract$Step.Area.f62797a;
        } else if (qvikNavigation$StartType instanceof QvikNavigation$StartType.NewContact) {
            pay = QvikFlowContract$Step.NewContact.f62798a;
        } else if (qvikNavigation$StartType instanceof QvikNavigation$StartType.RecipientList) {
            pay = QvikFlowContract$Step.RecipientList.f62800a;
        } else if (qvikNavigation$StartType instanceof QvikNavigation$StartType.Settings) {
            pay = QvikFlowContract$Step.Settings.f62801a;
        } else {
            if (!(qvikNavigation$StartType instanceof QvikNavigation$StartType.Pay)) {
                throw new NoWhenBranchMatchedException();
            }
            pay = new QvikFlowContract$Step.Pay((QvikNavigation$StartType.Pay) qvikNavigation$StartType);
        }
        this.f62804r = d.a(this, pay, f0.f322471a, new v(this, 29));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62804r;
    }
}
