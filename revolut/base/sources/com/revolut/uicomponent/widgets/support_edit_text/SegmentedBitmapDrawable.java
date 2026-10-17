package com.revolut.uicomponent.widgets.support_edit_text;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/uicomponent/widgets/support_edit_text/SegmentedBitmapDrawable;", "Landroid/graphics/drawable/BitmapDrawable;", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SegmentedBitmapDrawable extends BitmapDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f107330a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedBitmapDrawable(Resources res, Bitmap bitmap, int i) {
        super(res, bitmap);
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f107330a = i;
    }
}
