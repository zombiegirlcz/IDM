package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.res.ImageResources_androidKt;
import com.fourthline.orca.internal.z10;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class q10 {
    public static final ImageBitmap a(z10 imageSource, Composer composer, int i) {
        ImageBitmap imageBitmapImageResource;
        Intrinsics.checkNotNullParameter(imageSource, "imageSource");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1474758806, i, -1, "com.fourthline.orca.core.internal.composable.image.imageBitmap (ImageBitmap.kt:18)");
        }
        if (imageSource instanceof z10.a) {
            composer.startReplaceGroup(-1318792919);
            composer.endReplaceGroup();
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(((z10.a) imageSource).b().getAbsolutePath(), new BitmapFactory.Options());
            imageBitmapImageResource = bitmapDecodeFile != null ? AndroidImageBitmap_androidKt.asImageBitmap(bitmapDecodeFile) : null;
        } else {
            if (!(imageSource instanceof z10.b)) {
                composer.startReplaceGroup(95997502);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(96007912);
            imageBitmapImageResource = ImageResources_androidKt.imageResource(ImageBitmap.INSTANCE, ((z10.b) imageSource).b(), composer, 6);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imageBitmapImageResource;
    }
}
