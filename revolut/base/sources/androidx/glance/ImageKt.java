package androidx.glance;

import androidx.glance.semantics.SemanticsConfiguration;
import androidx.glance.semantics.SemanticsModifier;
import androidx.glance.semantics.SemanticsProperties;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aG\u0010\u0015\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"", "resId", "Landroidx/glance/ImageProvider;", "ImageProvider", "(I)Landroidx/glance/ImageProvider;", "Landroidx/glance/EmittableImage;", "", "isDecorative", "(Landroidx/glance/EmittableImage;)Z", "provider", "", "contentDescription", "Landroidx/glance/GlanceModifier;", "modifier", "Landroidx/glance/layout/ContentScale;", "contentScale", "Landroidx/glance/ColorFilter;", "colorFilter", "", "Image-GCr5PR4", "(Landroidx/glance/ImageProvider;Ljava/lang/String;Landroidx/glance/GlanceModifier;ILandroidx/glance/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "Image", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ImageKt {
    /* JADX WARN: Removed duplicated region for block: B:61:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0155 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0156  */
    /* JADX INFO: renamed from: Image-GCr5PR4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m3485ImageGCr5PR4(@org.jetbrains.annotations.NotNull androidx.glance.ImageProvider r12, java.lang.String r13, androidx.glance.GlanceModifier r14, int r15, androidx.glance.ColorFilter r16, androidx.compose.runtime.Composer r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.ImageKt.m3485ImageGCr5PR4(androidx.glance.ImageProvider, java.lang.String, androidx.glance.GlanceModifier, int, androidx.glance.ColorFilter, androidx.compose.runtime.Composer, int, int):void");
    }

    @NotNull
    public static final ImageProvider ImageProvider(int i) {
        return new AndroidResourceImageProvider(i);
    }

    public static final boolean isDecorative(@NotNull EmittableImage emittableImage) {
        List list;
        String str = null;
        SemanticsModifier semanticsModifier = (SemanticsModifier) emittableImage.getModifier().foldIn(null, ImageKt$isDecorative$$inlined$findModifier$1.INSTANCE);
        SemanticsConfiguration configuration = semanticsModifier != null ? semanticsModifier.getConfiguration() : null;
        if (configuration != null && (list = (List) configuration.getOrNull(SemanticsProperties.INSTANCE.getContentDescription())) != null) {
            str = (String) list.get(0);
        }
        return str == null || str.length() == 0;
    }
}
