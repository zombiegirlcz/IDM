package androidx.glance;

import androidx.glance.GlanceModifier;
import androidx.glance.layout.ContentScale;
import androidx.glance.unit.ColorProvider;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B*\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tB\u001c\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/glance/BackgroundModifier;", "Landroidx/glance/GlanceModifier$Element;", "Landroidx/glance/unit/ColorProvider;", "colorProvider", "Landroidx/glance/ImageProvider;", "imageProvider", "Landroidx/glance/layout/ContentScale;", "contentScale", "<init>", "(Landroidx/glance/unit/ColorProvider;Landroidx/glance/ImageProvider;I)V", "(Landroidx/glance/ImageProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/glance/unit/ColorProvider;", "getColorProvider", "()Landroidx/glance/unit/ColorProvider;", "Landroidx/glance/ImageProvider;", "getImageProvider", "()Landroidx/glance/ImageProvider;", "I", "getContentScale-Ae3V0ko", "()I", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BackgroundModifier implements GlanceModifier.Element {
    private final ColorProvider colorProvider;
    private final int contentScale;
    private final ImageProvider imageProvider;

    public /* synthetic */ BackgroundModifier(ImageProvider imageProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageProvider, i);
    }

    public final ColorProvider getColorProvider() {
        return this.colorProvider;
    }

    /* JADX INFO: renamed from: getContentScale-Ae3V0ko, reason: not valid java name and from getter */
    public final int getContentScale() {
        return this.contentScale;
    }

    public final ImageProvider getImageProvider() {
        return this.imageProvider;
    }

    @NotNull
    public String toString() {
        return "BackgroundModifier(colorProvider=" + this.colorProvider + ", imageProvider=" + this.imageProvider + ", contentScale=" + ((Object) ContentScale.m3545toStringimpl(this.contentScale)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private BackgroundModifier(ColorProvider colorProvider, ImageProvider imageProvider, int i) {
        this.colorProvider = colorProvider;
        this.imageProvider = imageProvider;
        this.contentScale = i;
        if (!((colorProvider != null) ^ (imageProvider != null))) {
            throw new IllegalArgumentException("Exactly one of colorProvider and imageProvider must be non-null");
        }
    }

    private BackgroundModifier(ImageProvider imageProvider, int i) {
        this((ColorProvider) null, imageProvider, i);
    }
}
