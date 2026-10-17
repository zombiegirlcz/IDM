package com.revolut.feature.junior_settings.impl.ui_kompot.settings_flow;

import ap8.b;
import ap8.c;
import com.revolut.feature.junior_settings.api.navigation.JuniorSettingsKompotFeatureConfig;
import com.revolut.feature.junior_settings.impl.ui_kompot.settings_flow.SettingsFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.flow.BackStackEntry;
import cp5.d;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f77346p;

    public a(c inputData) {
        FlowStep flowStep;
        List listC;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        JuniorSettingsKompotFeatureConfig.InitialStep initialStep = inputData.f8119b;
        Intrinsics.checkNotNullParameter(initialStep, "<this>");
        JuniorSettingsKompotFeatureConfig.InitialStep.Home home = JuniorSettingsKompotFeatureConfig.InitialStep.Home.f77261a;
        boolean zF = Intrinsics.f(initialStep, home);
        JuniorSettingsKompotFeatureConfig.InitialStep.AppAccess appAccess = JuniorSettingsKompotFeatureConfig.InitialStep.AppAccess.f77260a;
        JuniorSettingsKompotFeatureConfig.InitialStep.SecurityAndPrivacy securityAndPrivacy = JuniorSettingsKompotFeatureConfig.InitialStep.SecurityAndPrivacy.f77262a;
        SettingsFlowContract$Step.Home home2 = SettingsFlowContract$Step.Home.f77344a;
        if (zF) {
            flowStep = home2;
        } else if (Intrinsics.f(initialStep, securityAndPrivacy)) {
            flowStep = SettingsFlowContract$Step.SecurityAndPrivacy.f77345a;
        } else {
            if (!Intrinsics.f(initialStep, appAccess)) {
                throw new NoWhenBranchMatchedException();
            }
            flowStep = SettingsFlowContract$Step.AppAccess.f77342a;
        }
        JuniorSettingsKompotFeatureConfig.InitialStep initialStep2 = inputData.f8119b;
        if (Intrinsics.f(initialStep2, home) || Intrinsics.f(initialStep2, appAccess)) {
            listC = f0.f322471a;
        } else {
            if (!Intrinsics.f(initialStep2, securityAndPrivacy)) {
                throw new NoWhenBranchMatchedException();
            }
            listC = u.c(new BackStackEntry(home2, TransitionAnimation.SLIDE_END_TO_START.f98395a));
        }
        this.f77346p = d.a(this, flowStep, listC, new anc.b(this, 3));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77346p;
    }
}
