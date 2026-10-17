package com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog;

import android.os.Parcelable;
import c2i.i;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.c;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements i {
    public static AccountCellItemDelegate.Model a(String str, int i, int i2, int i3, boolean z) {
        return new AccountCellItemDelegate.Model(str, z, (Image) LayeredImage.Companion.b(LayeredImage.INSTANCE, i3, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 12.0f, Float.valueOf(40.0f), null, 32), (Clause) new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), (c) null, false, (Clause) new TextLocalisedClause(i2, null, null, 14), (RowDelegate.Model.c.b) null, (ProgressStyle) null, (Object) null, (Parcelable) null, 130992);
    }
}
