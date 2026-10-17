package androidx.compose.ui.graphics;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/graphics/ColorMatrix;", "", "", "values", "constructor-impl", "([F)[F", "ui-graphics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ColorMatrix {
    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float[] m2003constructorimpl(@NotNull float[] fArr) {
        return fArr;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2004hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2005toStringimpl(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
