package yx7;

import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zw7.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class s {
    public static int a(d1 icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        int i = r.f317595a[icon.ordinal()];
        if (i == 1) {
            return R$drawable.uikit_icn_24_price_tag;
        }
        if (i == 2) {
            return R$drawable.uikit_icn_24_premium;
        }
        throw new NoWhenBranchMatchedException();
    }
}
