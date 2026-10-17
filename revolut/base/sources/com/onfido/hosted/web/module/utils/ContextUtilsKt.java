package com.onfido.hosted.web.module.utils;

import a0.d;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"hexFrom", "", "Landroid/content/Context;", "colorAttributeResId", "", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ContextUtilsKt {
    @NotNull
    public static final String hexFrom(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return d.v(new Object[]{Integer.valueOf(com.onfido.android.sdk.capture.utils.ContextUtilsKt.colorFromAttr(context, i) & 16777215)}, 1, "#%06X", "format(...)");
    }
}
