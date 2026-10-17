package com.revolut.feature.blue_prompt;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.blue_prompt.BluePromptBackgroundType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {
    public static final PromptContentDelegate.Model.BackgroundType a(BluePromptBackgroundType bluePromptBackgroundType) {
        if (bluePromptBackgroundType instanceof BluePromptBackgroundType.Image) {
            BluePromptBackgroundType.Image image = (BluePromptBackgroundType.Image) bluePromptBackgroundType;
            return new PromptContentDelegate.Model.BackgroundType.Image(image.f64280a, image.f64281b);
        }
        if (Intrinsics.f(bluePromptBackgroundType, BluePromptBackgroundType.Dialog.f64279a)) {
            return PromptContentDelegate.Model.BackgroundType.Dialog.f53074a;
        }
        if (Intrinsics.f(bluePromptBackgroundType, BluePromptBackgroundType.Default.f64278a) || bluePromptBackgroundType == null) {
            return PromptContentDelegate.Model.BackgroundType.Default.f53073a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
