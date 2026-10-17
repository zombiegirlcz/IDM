package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001au\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016\u001a1\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001d\u001a\u00020\u0010*\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "", "maxLines", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "Landroidx/compose/ui/text/Paragraph;", "Paragraph-Ul8oQg4", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Ljava/util/List;II)Landroidx/compose/ui/text/Paragraph;", "Paragraph", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "paragraphIntrinsics", "Paragraph-czeN-Hc", "(Landroidx/compose/ui/text/ParagraphIntrinsics;JII)Landroidx/compose/ui/text/Paragraph;", "", "ceilToInt", "(F)I", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class ParagraphKt {
    @NotNull
    /* JADX INFO: renamed from: Paragraph-Ul8oQg4, reason: not valid java name */
    public static final Paragraph m2899ParagraphUl8oQg4(@NotNull String str, @NotNull TextStyle textStyle, long j2, @NotNull Density density, @NotNull FontFamily.Resolver resolver, @NotNull List<AnnotatedString.Range<SpanStyle>> list, @NotNull List<AnnotatedString.Range<Placeholder>> list2, int i, int i2) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m3112ActualParagraphXGqx6AY(str, textStyle, list, list2, i, i2, j2, density, resolver);
    }

    @NotNull
    /* JADX INFO: renamed from: Paragraph-czeN-Hc, reason: not valid java name */
    public static final Paragraph m2901ParagraphczeNHc(@NotNull ParagraphIntrinsics paragraphIntrinsics, long j2, int i, int i2) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m3111ActualParagraph4FmOz70(paragraphIntrinsics, i, i2, j2);
    }

    public static final int ceilToInt(float f) {
        return (int) Math.ceil(f);
    }
}
