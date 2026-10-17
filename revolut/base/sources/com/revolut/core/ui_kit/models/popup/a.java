package com.revolut.core.ui_kit.models.popup;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;
import mw0.g;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a {
    public static PopupMenuItem.Cell a(String listId, Clause title, Image icon, NewBadgeContent newBadgeContent, Object obj2, AnalyticsContext analyticsContext, g gVar, int i) {
        NewBadgeContent newBadgeContent2 = (i & 8) != 0 ? null : newBadgeContent;
        Object obj3 = (i & 32) != 0 ? null : obj2;
        AnalyticsContext analyticsContext2 = (i & 64) != 0 ? null : analyticsContext;
        g gVar2 = (i & 128) != 0 ? null : gVar;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new PopupMenuItem.Cell(listId, title, icon, null, newBadgeContent2, null, null, gVar2, obj3, analyticsContext2, 72);
    }
}
