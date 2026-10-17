package com.revolut.core.ui_kit.views.navbar;

import com.revolut.core.ui_kit.views.navbar.ObjectCarouselNavBarContentView;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class t implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        ((Integer) obj2).intValue();
        Intrinsics.checkNotNullParameter(data, "data");
        return Boolean.valueOf(data instanceof ObjectCarouselNavBarContentView.InternalCarouselItemModel);
    }
}
