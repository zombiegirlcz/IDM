package com.onfido.android.sdk.capture.utils;

import android.graphics.Bitmap;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class ImageUtils$decodeScaledResource$emptyBitmap$2 extends u implements Function0<Bitmap> {
    final /* synthetic */ int $dstHeight;
    final /* synthetic */ int $dstWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageUtils$decodeScaledResource$emptyBitmap$2(int i, int i2) {
        super(0);
        this.$dstHeight = i;
        this.$dstWidth = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Bitmap invoke() {
        Timber.INSTANCE.e("Can't decode image: Height: " + this.$dstHeight + ", Width: " + this.$dstWidth, new Object[0]);
        return Bitmap.createBitmap(this.$dstWidth, this.$dstHeight, Bitmap.Config.ARGB_8888);
    }
}
