package w2;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.Savers_androidKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.VerbatimTtsAnnotation;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293902a;

    public /* synthetic */ b(int i) {
        this.f293902a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        SaverScope saverScope = (SaverScope) obj2;
        switch (this.f293902a) {
            case 0:
                return SaversKt.LinkSaver$lambda$0(saverScope, (LinkAnnotation.Url) obj3);
            case 1:
                return SaversKt.BaselineShiftSaver$lambda$0(saverScope, (BaselineShift) obj3);
            case 2:
                return SaversKt.AnnotationRangeListSaver$lambda$0(saverScope, (List) obj3);
            case 3:
                return SaversKt.TextRangeSaver$lambda$0(saverScope, (TextRange) obj3);
            case 4:
                return SaversKt.ShadowSaver$lambda$0(saverScope, (Shadow) obj3);
            case 5:
                return SaversKt.TextAlignSaver$lambda$0(saverScope, (TextAlign) obj3);
            case 6:
                return SaversKt.TextDirectionSaver$lambda$0(saverScope, (TextDirection) obj3);
            case 7:
                return SaversKt.HyphensSaver$lambda$0(saverScope, (Hyphens) obj3);
            case 8:
                return SaversKt.FontStyleSaver$lambda$0(saverScope, (FontStyle) obj3);
            case 9:
                return SaversKt.FontSynthesisSaver$lambda$0(saverScope, (FontSynthesis) obj3);
            case 10:
                return SaversKt.TextUnitSaver$lambda$0(saverScope, (TextUnit) obj3);
            case 11:
                return SaversKt.ClickableSaver$lambda$0(saverScope, (LinkAnnotation.Clickable) obj3);
            case 12:
                return SaversKt.TextUnitTypeSaver$lambda$0(saverScope, (TextUnitType) obj3);
            case 13:
                return SaversKt.OffsetSaver$lambda$0(saverScope, (Offset) obj3);
            case 14:
                return SaversKt.AnnotationRangeSaver$lambda$0(saverScope, (AnnotatedString.Range) obj3);
            case 15:
                return SaversKt.LocaleListSaver$lambda$0(saverScope, (LocaleList) obj3);
            case 16:
                return SaversKt.LocaleSaver$lambda$0(saverScope, (Locale) obj3);
            case 17:
                return SaversKt.LineHeightStyleSaver$lambda$0(saverScope, (LineHeightStyle) obj3);
            case 18:
                return SaversKt.LineHeightStyleAlignmentSaver$lambda$0(saverScope, (LineHeightStyle.Alignment) obj3);
            case 19:
                return SaversKt.LineHeightStyleTrimSaver$lambda$0(saverScope, (LineHeightStyle.Trim) obj3);
            case 20:
                return SaversKt.LineHeightStyleModeSaver$lambda$0(saverScope, (LineHeightStyle.Mode) obj3);
            case 21:
                return SaversKt.VerbatimTtsAnnotationSaver$lambda$0(saverScope, (VerbatimTtsAnnotation) obj3);
            case 22:
                return SaversKt.ParagraphStyleSaver$lambda$0(saverScope, (ParagraphStyle) obj3);
            case 23:
                return SaversKt.UrlAnnotationSaver$lambda$0(saverScope, (UrlAnnotation) obj3);
            case 24:
                return SaversKt.SpanStyleSaver$lambda$0(saverScope, (SpanStyle) obj3);
            case 25:
                return SaversKt.TextLinkStylesSaver$lambda$0(saverScope, (TextLinkStyles) obj3);
            case 26:
                return Savers_androidKt.PlatformParagraphStyleSaver$lambda$0(saverScope, (PlatformParagraphStyle) obj3);
            case 27:
                return Savers_androidKt.emojiSupportMatchSaver$lambda$0(saverScope, (EmojiSupportMatch) obj3);
            case 28:
                return Savers_androidKt.LineBreakSaver$lambda$0(saverScope, (LineBreak) obj3);
            default:
                return Savers_androidKt.TextMotionSaver$lambda$0(saverScope, (TextMotion) obj3);
        }
    }
}
