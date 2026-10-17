package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u0017\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "", "text", "", "maxLines", "Landroidx/compose/ui/unit/IntSize;", "computeSizeForDefaultText", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/lang/String;I)J", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "focusOffset", "Lkotlin/Function0;", "sizeForDefaultText", "Landroidx/compose/ui/geometry/Rect;", "focusedRectInRoot", "(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/layout/LayoutCoordinates;ILkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", "EmptyTextReplacement", "Ljava/lang/String;", "getEmptyTextReplacement", "()Ljava/lang/String;", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class TextFieldDelegateKt {

    @NotNull
    private static final String EmptyTextReplacement = a0.C("H", 10);

    public static final long computeSizeForDefaultText(@NotNull TextStyle textStyle, @NotNull Density density, @NotNull FontFamily.Resolver resolver, @NotNull String str, int i) {
        Paragraph paragraphM2899ParagraphUl8oQg4 = ParagraphKt.m2899ParagraphUl8oQg4(str, textStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), density, resolver, (64 & 32) != 0 ? f0.f322471a : f0.f322471a, (64 & 64) != 0 ? f0.f322471a : null, (64 & 128) != 0 ? Integer.MAX_VALUE : i, (64 & 256) != 0 ? TextOverflow.INSTANCE.m3262getClipgIe3tQ8() : TextOverflow.INSTANCE.m3262getClipgIe3tQ8());
        return IntSize.m3351constructorimpl((((long) TextDelegateKt.ceilToIntPx(paragraphM2899ParagraphUl8oQg4.getMinIntrinsicWidth())) << 32) | (((long) TextDelegateKt.ceilToIntPx(paragraphM2899ParagraphUl8oQg4.getHeight())) & BodyPartID.bodyIdMax));
    }

    public static /* synthetic */ long computeSizeForDefaultText$default(TextStyle textStyle, Density density, FontFamily.Resolver resolver, String str, int i, int i2, Object obj2) {
        if ((i2 & 8) != 0) {
            str = EmptyTextReplacement;
        }
        if ((i2 & 16) != 0) {
            i = 1;
        }
        return computeSizeForDefaultText(textStyle, density, resolver, str, i);
    }

    @NotNull
    public static final Rect focusedRectInRoot(@NotNull TextLayoutResult textLayoutResult, @NotNull LayoutCoordinates layoutCoordinates, int i, @NotNull Function0<IntSize> function0) {
        Rect boundingBox = i < textLayoutResult.getLayoutInput().getText().length() ? textLayoutResult.getBoundingBox(i) : i != 0 ? textLayoutResult.getBoundingBox(i - 1) : new Rect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, (int) (((IntSize) function0.invoke()).getPackedValue() & BodyPartID.bodyIdMax));
        long jMo2536localToRootMKHz9U = layoutCoordinates.mo2536localToRootMKHz9U(Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(boundingBox.getTop())) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(boundingBox.getLeft())) << 32)));
        return RectKt.m1854Recttz77jQw(Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo2536localToRootMKHz9U >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo2536localToRootMKHz9U & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax)), Size.m1862constructorimpl((((long) Float.floatToRawIntBits(boundingBox.getBottom() - boundingBox.getTop())) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(boundingBox.getRight() - boundingBox.getLeft())) << 32)));
    }

    @NotNull
    public static final String getEmptyTextReplacement() {
        return EmptyTextReplacement;
    }
}
