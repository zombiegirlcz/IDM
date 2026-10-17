package androidx.glance.layout;

import androidx.glance.GlanceModifier;
import androidx.glance.unit.Dimension;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u001f\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001f\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0004\u001a\u0011\u0010\n\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a\u0011\u0010\u000b\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0006\u001a\u001f\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u0004\u001a\u0011\u0010\u000e\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0006\u001a\u0011\u0010\u000f\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/glance/GlanceModifier;", "Landroidx/compose/ui/unit/Dp;", "width", "width-3ABfNKs", "(Landroidx/glance/GlanceModifier;F)Landroidx/glance/GlanceModifier;", "wrapContentWidth", "(Landroidx/glance/GlanceModifier;)Landroidx/glance/GlanceModifier;", "fillMaxWidth", "height", "height-3ABfNKs", "wrapContentHeight", "fillMaxHeight", "size", "size-3ABfNKs", "wrapContentSize", "fillMaxSize", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class SizeModifiersKt {
    @NotNull
    public static final GlanceModifier fillMaxHeight(@NotNull GlanceModifier glanceModifier) {
        return glanceModifier.then(new HeightModifier(Dimension.Fill.INSTANCE));
    }

    @NotNull
    public static final GlanceModifier fillMaxSize(@NotNull GlanceModifier glanceModifier) {
        return fillMaxHeight(fillMaxWidth(glanceModifier));
    }

    @NotNull
    public static final GlanceModifier fillMaxWidth(@NotNull GlanceModifier glanceModifier) {
        return glanceModifier.then(new WidthModifier(Dimension.Fill.INSTANCE));
    }

    @NotNull
    /* JADX INFO: renamed from: height-3ABfNKs, reason: not valid java name */
    public static final GlanceModifier m3570height3ABfNKs(@NotNull GlanceModifier glanceModifier, float f) {
        return glanceModifier.then(new HeightModifier(new Dimension.Dp(f, null)));
    }

    @NotNull
    /* JADX INFO: renamed from: size-3ABfNKs, reason: not valid java name */
    public static final GlanceModifier m3571size3ABfNKs(@NotNull GlanceModifier glanceModifier, float f) {
        return m3570height3ABfNKs(m3572width3ABfNKs(glanceModifier, f), f);
    }

    @NotNull
    /* JADX INFO: renamed from: width-3ABfNKs, reason: not valid java name */
    public static final GlanceModifier m3572width3ABfNKs(@NotNull GlanceModifier glanceModifier, float f) {
        return glanceModifier.then(new WidthModifier(new Dimension.Dp(f, null)));
    }

    @NotNull
    public static final GlanceModifier wrapContentHeight(@NotNull GlanceModifier glanceModifier) {
        return glanceModifier.then(new HeightModifier(Dimension.Wrap.INSTANCE));
    }

    @NotNull
    public static final GlanceModifier wrapContentSize(@NotNull GlanceModifier glanceModifier) {
        return wrapContentWidth(wrapContentHeight(glanceModifier));
    }

    @NotNull
    public static final GlanceModifier wrapContentWidth(@NotNull GlanceModifier glanceModifier) {
        return glanceModifier.then(new WidthModifier(Dimension.Wrap.INSTANCE));
    }
}
