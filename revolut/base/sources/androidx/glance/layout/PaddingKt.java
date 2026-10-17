package androidx.glance.layout;

import android.content.res.Resources;
import androidx.compose.ui.unit.Dp;
import androidx.glance.GlanceModifier;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000f\u001a\u00020\f*\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a$\u0010\u0014\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/glance/GlanceModifier;", "Landroidx/compose/ui/unit/Dp;", "start", "top", "end", "bottom", "padding-qDBjuR0", "(Landroidx/glance/GlanceModifier;FFFF)Landroidx/glance/GlanceModifier;", "padding", "all", "padding-3ABfNKs", "(Landroidx/glance/GlanceModifier;F)Landroidx/glance/GlanceModifier;", "Landroidx/glance/layout/PaddingDimension;", "toPadding-0680j_4", "(F)Landroidx/glance/layout/PaddingDimension;", "toPadding", "", "", "Landroid/content/res/Resources;", "resources", "toDp", "(Ljava/util/List;Landroid/content/res/Resources;)F", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class PaddingKt {
    @NotNull
    /* JADX INFO: renamed from: padding-3ABfNKs, reason: not valid java name */
    public static final GlanceModifier m3563padding3ABfNKs(@NotNull GlanceModifier glanceModifier, float f) {
        PaddingDimension paddingDimensionM3566toPadding0680j_4 = m3566toPadding0680j_4(f);
        return glanceModifier.then(new PaddingModifier(null, paddingDimensionM3566toPadding0680j_4, paddingDimensionM3566toPadding0680j_4, null, paddingDimensionM3566toPadding0680j_4, paddingDimensionM3566toPadding0680j_4, 9, null));
    }

    @NotNull
    /* JADX INFO: renamed from: padding-qDBjuR0, reason: not valid java name */
    public static final GlanceModifier m3564paddingqDBjuR0(@NotNull GlanceModifier glanceModifier, float f, float f4, float f5, float f6) {
        return glanceModifier.then(new PaddingModifier(null, m3566toPadding0680j_4(f), m3566toPadding0680j_4(f4), null, m3566toPadding0680j_4(f5), m3566toPadding0680j_4(f6), 9, null));
    }

    /* JADX INFO: renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ GlanceModifier m3565paddingqDBjuR0$default(GlanceModifier glanceModifier, float f, float f4, float f5, float f6, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = Dp.m3297constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f4 = Dp.m3297constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f5 = Dp.m3297constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f6 = Dp.m3297constructorimpl(0);
        }
        return m3564paddingqDBjuR0(glanceModifier, f, f4, f5, f6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toDp(List<Integer> list, Resources resources) {
        float fM3297constructorimpl = Dp.m3297constructorimpl(0);
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            fM3297constructorimpl = Dp.m3297constructorimpl(Dp.m3297constructorimpl(resources.getDimension(((Number) it8.next()).intValue()) / resources.getDisplayMetrics().density) + fM3297constructorimpl);
        }
        return fM3297constructorimpl;
    }

    /* JADX INFO: renamed from: toPadding-0680j_4, reason: not valid java name */
    private static final PaddingDimension m3566toPadding0680j_4(float f) {
        return new PaddingDimension(f, null, 2, null);
    }
}
