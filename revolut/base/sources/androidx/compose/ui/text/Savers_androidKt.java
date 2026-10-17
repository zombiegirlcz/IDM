package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextMotion;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w2.b;
import w2.c;
import w2.d;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\" \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0004\u001a\u0004\b\u0007\u0010\b\" \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0004\" \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004\" \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004\"$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000*\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0000*\u00020\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0014\"$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\u0000*\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0016\"$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u0000*\u00020\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0018\"$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u0000*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "", "PlatformParagraphStyleSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/EmojiSupportMatch;", "emojiSupportMatchSaver", "getEmojiSupportMatchSaver", "()Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/LineBreak;", "LineBreakSaver", "Landroidx/compose/ui/text/style/TextMotion;", "TextMotionSaver", "Landroidx/compose/ui/text/style/TextMotion$Linearity;", "TextMotionLinearitySaver", "Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;", "getSaver", "(Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Saver", "Landroidx/compose/ui/text/EmojiSupportMatch$Companion;", "(Landroidx/compose/ui/text/EmojiSupportMatch$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/LineBreak$Companion;", "(Landroidx/compose/ui/text/style/LineBreak$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextMotion$Companion;", "(Landroidx/compose/ui/text/style/TextMotion$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextMotion$Linearity$Companion;", "(Landroidx/compose/ui/text/style/TextMotion$Linearity$Companion;)Landroidx/compose/runtime/saveable/Saver;", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class Savers_androidKt {

    @NotNull
    private static final Saver<PlatformParagraphStyle, Object> PlatformParagraphStyleSaver = SaverKt.Saver(new b(26), new c(18));

    @NotNull
    private static final Saver<EmojiSupportMatch, Object> emojiSupportMatchSaver = SaverKt.Saver(new b(27), new c(19));

    @NotNull
    private static final Saver<LineBreak, Object> LineBreakSaver = SaverKt.Saver(new b(28), new c(20));

    @NotNull
    private static final Saver<TextMotion, Object> TextMotionSaver = SaverKt.Saver(new b(29), new c(21));

    @NotNull
    private static final Saver<TextMotion.Linearity, Object> TextMotionLinearitySaver = SaverKt.Saver(new d(0), new c(22));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LineBreakSaver$lambda$0(SaverScope saverScope, LineBreak lineBreak) {
        return Integer.valueOf(lineBreak.getMask());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineBreak LineBreakSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.Int");
        return LineBreak.m3153boximpl(LineBreak.m3154constructorimpl(((Integer) obj2).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object PlatformParagraphStyleSaver$lambda$0(SaverScope saverScope, PlatformParagraphStyle platformParagraphStyle) {
        return v.e(SaversKt.save(Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding())), SaversKt.save(EmojiSupportMatch.m2875boximpl(platformParagraphStyle.getEmojiSupportMatch()), getSaver(EmojiSupportMatch.INSTANCE), saverScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlatformParagraphStyle PlatformParagraphStyleSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj2;
        Object obj3 = list.get(0);
        Boolean bool = obj3 != null ? (Boolean) obj3 : null;
        Intrinsics.h(bool);
        boolean zBooleanValue = bool.booleanValue();
        Object obj4 = list.get(1);
        Saver<EmojiSupportMatch, Object> saver = getSaver(EmojiSupportMatch.INSTANCE);
        EmojiSupportMatch emojiSupportMatchRestore = ((!Intrinsics.f(obj4, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj4 != null) ? saver.restore(obj4) : null;
        Intrinsics.h(emojiSupportMatchRestore);
        return new PlatformParagraphStyle(emojiSupportMatchRestore.getValue(), zBooleanValue, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextMotionLinearitySaver$lambda$0(SaverScope saverScope, TextMotion.Linearity linearity) {
        return Integer.valueOf(linearity.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextMotion.Linearity TextMotionLinearitySaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.Int");
        return TextMotion.Linearity.m3248boximpl(TextMotion.Linearity.m3249constructorimpl(((Integer) obj2).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextMotionSaver$lambda$0(SaverScope saverScope, TextMotion textMotion) {
        return v.e(SaversKt.save(TextMotion.Linearity.m3248boximpl(textMotion.getLinearity()), getSaver(TextMotion.Linearity.INSTANCE), saverScope), SaversKt.save(Boolean.valueOf(textMotion.getSubpixelTextPositioning())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextMotion TextMotionSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj2;
        Object obj3 = list.get(0);
        Saver<TextMotion.Linearity, Object> saver = getSaver(TextMotion.Linearity.INSTANCE);
        TextMotion.Linearity linearityRestore = ((!Intrinsics.f(obj3, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) ? saver.restore(obj3) : null;
        Intrinsics.h(linearityRestore);
        int value = linearityRestore.getValue();
        Object obj4 = list.get(1);
        Boolean bool = obj4 != null ? (Boolean) obj4 : null;
        Intrinsics.h(bool);
        return new TextMotion(value, bool.booleanValue(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object emojiSupportMatchSaver$lambda$0(SaverScope saverScope, EmojiSupportMatch emojiSupportMatch) {
        return Integer.valueOf(emojiSupportMatch.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmojiSupportMatch emojiSupportMatchSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.Int");
        return EmojiSupportMatch.m2875boximpl(EmojiSupportMatch.m2876constructorimpl(((Integer) obj2).intValue()));
    }

    @NotNull
    public static final Saver<PlatformParagraphStyle, Object> getSaver(@NotNull PlatformParagraphStyle.Companion companion) {
        return PlatformParagraphStyleSaver;
    }

    @NotNull
    public static final Saver<EmojiSupportMatch, Object> getSaver(@NotNull EmojiSupportMatch.Companion companion) {
        return emojiSupportMatchSaver;
    }

    @NotNull
    public static final Saver<LineBreak, Object> getSaver(@NotNull LineBreak.Companion companion) {
        return LineBreakSaver;
    }

    @NotNull
    public static final Saver<TextMotion, Object> getSaver(@NotNull TextMotion.Companion companion) {
        return TextMotionSaver;
    }

    private static final Saver<TextMotion.Linearity, Object> getSaver(TextMotion.Linearity.Companion companion) {
        return TextMotionLinearitySaver;
    }
}
