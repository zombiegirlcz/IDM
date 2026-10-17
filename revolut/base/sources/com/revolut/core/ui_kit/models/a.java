package com.revolut.core.ui_kit.models;

import aw0.t8;
import aw0.u8;
import com.revolut.core.ui_kit.models.NavBarCenterViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a {
    public static final t8 a(NavBarCenterViewModel navBarCenterViewModel) {
        Intrinsics.checkNotNullParameter(navBarCenterViewModel, "<this>");
        NavBarCenterViewModel.MainText mainText = navBarCenterViewModel.f57840a;
        if (mainText instanceof NavBarCenterViewModel.MainText.Animated) {
            return u8.a(((NavBarCenterViewModel.MainText.Animated) mainText).f57855a);
        }
        if (mainText instanceof NavBarCenterViewModel.MainText.Static) {
            return u8.a(((NavBarCenterViewModel.MainText.Static) mainText).f57858a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
