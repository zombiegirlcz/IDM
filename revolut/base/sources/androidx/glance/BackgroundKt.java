package androidx.glance;

import androidx.glance.layout.ContentScale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Landroidx/glance/GlanceModifier;", "Landroidx/glance/ImageProvider;", "imageProvider", "Landroidx/glance/layout/ContentScale;", "contentScale", "background-l7F5y5Q", "(Landroidx/glance/GlanceModifier;Landroidx/glance/ImageProvider;I)Landroidx/glance/GlanceModifier;", "background", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class BackgroundKt {
    @NotNull
    /* JADX INFO: renamed from: background-l7F5y5Q, reason: not valid java name */
    public static final GlanceModifier m3479backgroundl7F5y5Q(@NotNull GlanceModifier glanceModifier, @NotNull ImageProvider imageProvider, int i) {
        return glanceModifier.then(new BackgroundModifier(imageProvider, i, (DefaultConstructorMarker) null));
    }

    /* JADX INFO: renamed from: background-l7F5y5Q$default, reason: not valid java name */
    public static /* synthetic */ GlanceModifier m3480backgroundl7F5y5Q$default(GlanceModifier glanceModifier, ImageProvider imageProvider, int i, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            i = ContentScale.INSTANCE.m3548getFillBoundsAe3V0ko();
        }
        return m3479backgroundl7F5y5Q(glanceModifier, imageProvider, i);
    }
}
