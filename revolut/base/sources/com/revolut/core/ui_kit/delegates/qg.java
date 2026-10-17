package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.vf0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class qg implements vf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qg f54637a = new qg();

    private qg() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ip0.vf0
    public final Drawable a(Context context, qv0.c positionInBox) {
        qv0.h hVarA;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        SmallStockCardDelegate.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        qv0.a aVar = positionInBox instanceof qv0.a ? (qv0.a) positionInBox : null;
        if (aVar == null || (hVarA = aVar.a()) == null) {
            hVarA = qv0.h.EXTRA_LARGE;
        }
        return dr0.l.h(context, hVarA.a(), new Color.SolidInt(0), kli.a.k(context, 1.0f), new Color.Solid(R$attr.uikit_colorGreyTone8));
    }
}
