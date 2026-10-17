package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"BitmapPainter", "Landroidx/compose/ui/graphics/painter/BitmapPainter;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "BitmapPainter-QZhYCtY", "(Landroidx/compose/ui/graphics/ImageBitmap;JJI)Landroidx/compose/ui/graphics/painter/BitmapPainter;", "ui-graphics"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class BitmapPainterKt {
    @NotNull
    /* JADX INFO: renamed from: BitmapPainter-QZhYCtY, reason: not valid java name */
    public static final BitmapPainter m2257BitmapPainterQZhYCtY(@NotNull ImageBitmap imageBitmap, long j2, long j3, int i) {
        BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, j2, j3, null);
        bitmapPainter.m2256setFilterQualityvDHp3xo$ui_graphics(i);
        return bitmapPainter;
    }

    /* JADX INFO: renamed from: BitmapPainter-QZhYCtY$default, reason: not valid java name */
    public static /* synthetic */ BitmapPainter m2258BitmapPainterQZhYCtY$default(ImageBitmap imageBitmap, long j2, long j3, int i, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            j2 = IntOffset.INSTANCE.m3343getZeronOccac();
        }
        long j5 = j2;
        if ((i2 & 4) != 0) {
            j3 = IntSize.m3351constructorimpl((((long) imageBitmap.getHeight()) & BodyPartID.bodyIdMax) | (((long) imageBitmap.getWidth()) << 32));
        }
        long j16 = j3;
        if ((i2 & 8) != 0) {
            i = FilterQuality.INSTANCE.m2022getLowfv9h1I();
        }
        return m2257BitmapPainterQZhYCtY(imageBitmap, j5, j16, i);
    }
}
