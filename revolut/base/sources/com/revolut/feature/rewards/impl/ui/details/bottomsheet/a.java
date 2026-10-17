package com.revolut.feature.rewards.impl.ui.details.bottomsheet;

import cli.g;
import cli.k;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements jic.b {
    public final RewardBottomSheetContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f84916p;

    public a(RewardBottomSheetContract$InputData inputData, b stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f84916p = d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I2(java.lang.Object r4) {
        /*
            r3 = this;
            com.revolut.feature.rewards.impl.ui.details.bottomsheet.RewardBottomSheetContract$InputData r0 = r3.o
            com.revolut.feature.rewards.api.model.rewards.RewardBottomSheet r0 = r0.f84915a
            com.revolut.feature.rewards.api.model.rewards.RewardBottomSheetFooter r0 = r0.d
            r1 = 0
            if (r0 != 0) goto Lb
        L9:
            r0 = r1
            goto L20
        Lb:
            com.revolut.feature.rewards.impl.ui.details.bottomsheet.RewardBottomSheetContract$ButtonParcel$Primary r2 = com.revolut.feature.rewards.impl.ui.details.bottomsheet.RewardBottomSheetContract$ButtonParcel.Primary.f84913a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r4, r2)
            if (r2 == 0) goto L16
            com.revolut.feature.rewards.api.model.rewards.RewardBottomSheetButton r0 = r0.f84849a
            goto L20
        L16:
            com.revolut.feature.rewards.impl.ui.details.bottomsheet.RewardBottomSheetContract$ButtonParcel$Secondary r2 = com.revolut.feature.rewards.impl.ui.details.bottomsheet.RewardBottomSheetContract$ButtonParcel.Secondary.f84914a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r4, r2)
            if (r2 == 0) goto L9
            com.revolut.feature.rewards.api.model.rewards.RewardBottomSheetButton r0 = r0.f84850b
        L20:
            if (r0 != 0) goto L37
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unexpected reward bottom sheet footer button parcel: "
            java.lang.String r4 = a0.d.m(r4, r2)
            r0.<init>(r4)
            zhm.h0 r4 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r1, r1, r0, r4)
            return
        L37:
            jic.a r4 = new jic.a
            com.revolut.feature.rewards.api.model.rewards.RewardBottomSheetAction r0 = r0.f84848c
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            boolean r1 = r0 instanceof com.revolut.feature.rewards.api.model.rewards.RewardBottomSheetAction.OpenUrl
            if (r1 == 0) goto L4e
            com.revolut.feature.rewards.api.model.rewards.RewardFooterAction$OpenUrl r1 = new com.revolut.feature.rewards.api.model.rewards.RewardFooterAction$OpenUrl
            com.revolut.feature.rewards.api.model.rewards.RewardBottomSheetAction$OpenUrl r0 = (com.revolut.feature.rewards.api.model.rewards.RewardBottomSheetAction.OpenUrl) r0
            java.lang.String r0 = r0.f84845a
            r1.<init>(r0)
            goto L5d
        L4e:
            boolean r1 = r0 instanceof com.revolut.feature.rewards.api.model.rewards.RewardBottomSheetAction.CopyAndOpenUrl
            if (r1 == 0) goto L64
            com.revolut.feature.rewards.api.model.rewards.RewardFooterAction$CopyAndOpenUrl r1 = new com.revolut.feature.rewards.api.model.rewards.RewardFooterAction$CopyAndOpenUrl
            com.revolut.feature.rewards.api.model.rewards.RewardBottomSheetAction$CopyAndOpenUrl r0 = (com.revolut.feature.rewards.api.model.rewards.RewardBottomSheetAction.CopyAndOpenUrl) r0
            java.lang.String r2 = r0.f84843a
            java.lang.String r0 = r0.f84844b
            r1.<init>(r2, r0)
        L5d:
            r4.<init>(r1)
            r3.C2(r4)
            return
        L64:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rewards.impl.ui.details.bottomsheet.a.I2(java.lang.Object):void");
    }

    @Override // cli.z
    public final g getState() {
        return this.f84916p;
    }
}
