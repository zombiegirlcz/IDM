package com.revolut.feature.rewards.impl.ui.details.bottomsheet;

import aw0.h;
import aw0.i;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.rewards.api.model.rewards.RewardAvatar;
import com.revolut.feature.rewards.api.model.rewards.RewardBottomSheet;
import com.revolut.feature.rewards.api.model.rewards.RewardBottomSheetButton;
import com.revolut.feature.rewards.api.model.rewards.RewardBottomSheetFooter;
import com.revolut.feature.rewards.api.model.rewards.RewardIcon;
import com.revolut.feature.rewards.impl.ui.details.bottomsheet.RewardBottomSheetContract$ButtonParcel;
import java.util.List;
import jic.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lw0.c;
import lw0.g;
import yy0.j;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kb8.a f84917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RewardBottomSheetContract$InputData f84918b;

    public b(kb8.a iconMapper, RewardBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f84917a = iconMapper;
        this.f84918b = inputData;
    }

    public final n6 a(RewardBottomSheetButton rewardBottomSheetButton, LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton, RewardBottomSheetContract$ButtonParcel rewardBottomSheetContract$ButtonParcel) {
        Integer numA;
        m6 m6Var = n6.Companion;
        TextClause textClause = new TextClause(rewardBottomSheetButton.f84847b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = rewardBottomSheetButton.f84846a;
        return m6.c(m6Var, textClause, defaultFilledButton, (str == null || (numA = this.f84917a.a(str)) == null) ? null : new j(new ResourceImage(numA.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), null, false, null, null, rewardBottomSheetContract$ButtonParcel, 504);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        g gVar;
        g bVar;
        GlyphImageTint glyphImageTint;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RewardBottomSheet rewardBottomSheet = this.f84918b.f84915a;
        f0 f0Var = f0.f322471a;
        TextClause textClause = new TextClause(rewardBottomSheet.f84841b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = rewardBottomSheet.f84842c;
        i eVar = null;
        TextClause textClause2 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        RewardAvatar rewardAvatar = rewardBottomSheet.f84840a;
        if (rewardAvatar != null) {
            if (rewardAvatar instanceof RewardAvatar.Icon) {
                RewardIcon rewardIcon = ((RewardAvatar.Icon) rewardAvatar).f84838a;
                Integer numA = this.f84917a.a(rewardIcon.f84878a);
                if (numA != null) {
                    int iIntValue = numA.intValue();
                    int i = e.f174426a[rewardIcon.f84879b.ordinal()];
                    if (i == 1) {
                        glyphImageTint = GlyphImageTint.WARNING.f59933a;
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        glyphImageTint = GlyphImageTint.STANDARD.f59931a;
                    }
                    bVar = new c(new GlyphImage(iIntValue, glyphImageTint, null, 4));
                } else {
                    bVar = null;
                }
            } else {
                if (!(rewardAvatar instanceof RewardAvatar.Image)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new lw0.b(new UrlImage(((RewardAvatar.Image) rewardAvatar).f84839a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null);
            }
            gVar = bVar;
        } else {
            gVar = null;
        }
        lw0.a aVar = new lw0.a(textClause, textClause2, gVar, null, false, 24);
        RewardBottomSheetFooter rewardBottomSheetFooter = rewardBottomSheet.d;
        if (rewardBottomSheetFooter != null) {
            RewardBottomSheetButton rewardBottomSheetButton = rewardBottomSheetFooter.f84849a;
            RewardBottomSheetButton rewardBottomSheetButton2 = rewardBottomSheetFooter.f84850b;
            RewardBottomSheetContract$ButtonParcel.Secondary secondary = RewardBottomSheetContract$ButtonParcel.Secondary.f84914a;
            RewardBottomSheetContract$ButtonParcel.Primary primary = RewardBottomSheetContract$ButtonParcel.Primary.f84913a;
            if (rewardBottomSheetButton != null && rewardBottomSheetButton2 != null) {
                eVar = new h(false, a(rewardBottomSheetButton, LargeActionButton.ButtonStyle.f58725a, primary), a(rewardBottomSheetButton2, LargeActionButton.ButtonStyle.f58726b, secondary), null, null, null, 121);
            } else if (rewardBottomSheetButton != null) {
                eVar = new aw0.e(false, null, null, a(rewardBottomSheetButton, LargeActionButton.ButtonStyle.f58725a, primary), null, null, 55);
            } else if (rewardBottomSheetButton2 != null) {
                eVar = new aw0.e(false, null, null, a(rewardBottomSheetButton2, LargeActionButton.ButtonStyle.f58725a, secondary), null, null, 55);
            }
        }
        return new cii.b(eVar, f0Var, aVar);
    }
}
