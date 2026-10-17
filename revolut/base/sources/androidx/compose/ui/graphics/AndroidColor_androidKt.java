package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import yhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "colorLong", "Landroidx/compose/ui/graphics/Color;", "fromColorLong", "(Landroidx/compose/ui/graphics/Color$Companion;J)J", "ui-graphics"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class AndroidColor_androidKt {
    public static final long fromColorLong(@NotNull Color.Companion companion, long j2) {
        long j3 = 63 & j2;
        if (j3 >= 16) {
            j2 = (j2 & (-64)) | (j3 + 1);
        }
        w.Companion companion2 = w.INSTANCE;
        return Color.m1973constructorimpl(j2);
    }
}
