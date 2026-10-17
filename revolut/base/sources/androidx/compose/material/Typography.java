package androidx.compose.material;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001Bq\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u0095\u0001\b\u0016\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b%\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b&\u0010!R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b'\u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b(\u0010!R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b)\u0010!R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b*\u0010!R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b+\u0010!R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b,\u0010!R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b-\u0010!¨\u0006."}, d2 = {"Landroidx/compose/material/Typography;", "", "Landroidx/compose/ui/text/TextStyle;", "h1", "h2", "h3", "h4", "h5", "h6", "subtitle1", "subtitle2", "body1", "body2", "button", "caption", "overline", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "Landroidx/compose/ui/text/font/FontFamily;", "defaultFontFamily", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/TextStyle;", "getH1", "()Landroidx/compose/ui/text/TextStyle;", "getH2", "getH3", "getH4", "getH5", "getH6", "getSubtitle1", "getSubtitle2", "getBody1", "getBody2", "getButton", "getCaption", "getOverline", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Typography {

    @NotNull
    private final TextStyle body1;

    @NotNull
    private final TextStyle body2;

    @NotNull
    private final TextStyle button;

    @NotNull
    private final TextStyle caption;

    @NotNull
    private final TextStyle h1;

    @NotNull
    private final TextStyle h2;

    @NotNull
    private final TextStyle h3;

    @NotNull
    private final TextStyle h4;

    @NotNull
    private final TextStyle h5;

    @NotNull
    private final TextStyle h6;

    @NotNull
    private final TextStyle overline;

    @NotNull
    private final TextStyle subtitle1;

    @NotNull
    private final TextStyle subtitle2;

    public Typography(@NotNull TextStyle textStyle, @NotNull TextStyle textStyle2, @NotNull TextStyle textStyle3, @NotNull TextStyle textStyle4, @NotNull TextStyle textStyle5, @NotNull TextStyle textStyle6, @NotNull TextStyle textStyle7, @NotNull TextStyle textStyle8, @NotNull TextStyle textStyle9, @NotNull TextStyle textStyle10, @NotNull TextStyle textStyle11, @NotNull TextStyle textStyle12, @NotNull TextStyle textStyle13) {
        this.h1 = textStyle;
        this.h2 = textStyle2;
        this.h3 = textStyle3;
        this.h4 = textStyle4;
        this.h5 = textStyle5;
        this.h6 = textStyle6;
        this.subtitle1 = textStyle7;
        this.subtitle2 = textStyle8;
        this.body1 = textStyle9;
        this.body2 = textStyle10;
        this.button = textStyle11;
        this.caption = textStyle12;
        this.overline = textStyle13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) other;
        return Intrinsics.f(this.h1, typography.h1) && Intrinsics.f(this.h2, typography.h2) && Intrinsics.f(this.h3, typography.h3) && Intrinsics.f(this.h4, typography.h4) && Intrinsics.f(this.h5, typography.h5) && Intrinsics.f(this.h6, typography.h6) && Intrinsics.f(this.subtitle1, typography.subtitle1) && Intrinsics.f(this.subtitle2, typography.subtitle2) && Intrinsics.f(this.body1, typography.body1) && Intrinsics.f(this.body2, typography.body2) && Intrinsics.f(this.button, typography.button) && Intrinsics.f(this.caption, typography.caption) && Intrinsics.f(this.overline, typography.overline);
    }

    @NotNull
    public final TextStyle getBody2() {
        return this.body2;
    }

    @NotNull
    public final TextStyle getButton() {
        return this.button;
    }

    @NotNull
    public final TextStyle getCaption() {
        return this.caption;
    }

    @NotNull
    public final TextStyle getSubtitle1() {
        return this.subtitle1;
    }

    public int hashCode() {
        return this.overline.hashCode() + r6.b.b(r6.b.b(r6.b.b(r6.b.b(r6.b.b(r6.b.b(r6.b.b(r6.b.b(r6.b.b(r6.b.b(r6.b.b(this.h1.hashCode() * 31, 31, this.h2), 31, this.h3), 31, this.h4), 31, this.h5), 31, this.h6), 31, this.subtitle1), 31, this.subtitle2), 31, this.body1), 31, this.body2), 31, this.button), 31, this.caption);
    }

    @NotNull
    public String toString() {
        return "Typography(h1=" + this.h1 + ", h2=" + this.h2 + ", h3=" + this.h3 + ", h4=" + this.h4 + ", h5=" + this.h5 + ", h6=" + this.h6 + ", subtitle1=" + this.subtitle1 + ", subtitle2=" + this.subtitle2 + ", body1=" + this.body1 + ", body2=" + this.body2 + ", button=" + this.button + ", caption=" + this.caption + ", overline=" + this.overline + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Typography(FontFamily fontFamily, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        TextStyle textStyleM2967copyp1EtxEg$default;
        TextStyle textStyleM2967copyp1EtxEg$default2;
        TextStyle textStyleM2967copyp1EtxEg$default3;
        TextStyle textStyleM2967copyp1EtxEg$default4;
        TextStyle textStyleM2967copyp1EtxEg$default5;
        TextStyle textStyleM2967copyp1EtxEg$default6;
        TextStyle textStyleM2967copyp1EtxEg$default7;
        TextStyle textStyleM2967copyp1EtxEg$default8;
        TextStyle textStyleM2967copyp1EtxEg$default9;
        TextStyle textStyleM2967copyp1EtxEg$default10;
        TextStyle textStyleM2967copyp1EtxEg$default11;
        TextStyle textStyleM2967copyp1EtxEg$default12;
        TextStyle textStyleM2967copyp1EtxEg$default13;
        FontFamily fontFamily2 = (i & 1) != 0 ? FontFamily.INSTANCE.getDefault() : fontFamily;
        if ((i & 2) != 0) {
            textStyleM2967copyp1EtxEg$default = TextStyle.m2967copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(96), FontWeight.INSTANCE.getLight(), null, null, null, null, TextUnitKt.getSp(-1.5d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(112), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM2967copyp1EtxEg$default = textStyle;
        }
        if ((i & 4) != 0) {
            textStyleM2967copyp1EtxEg$default2 = TextStyle.m2967copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(60), FontWeight.INSTANCE.getLight(), null, null, null, null, TextUnitKt.getSp(-0.5d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(72), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM2967copyp1EtxEg$default2 = textStyle2;
        }
        if ((i & 8) != 0) {
            textStyleM2967copyp1EtxEg$default3 = TextStyle.m2967copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(48), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnitKt.getSp(0), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(56), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM2967copyp1EtxEg$default3 = textStyle3;
        }
        if ((i & 16) != 0) {
            textStyleM2967copyp1EtxEg$default4 = TextStyle.m2967copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(34), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnitKt.getSp(0.25d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(36), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM2967copyp1EtxEg$default4 = textStyle4;
        }
        if ((i & 32) != 0) {
            textStyleM2967copyp1EtxEg$default5 = TextStyle.m2967copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(24), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnitKt.getSp(0), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM2967copyp1EtxEg$default5 = textStyle5;
        }
        if ((i & 64) != 0) {
            textStyleM2967copyp1EtxEg$default6 = TextStyle.m2967copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(20), FontWeight.INSTANCE.getMedium(), null, null, null, null, TextUnitKt.getSp(0.15d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM2967copyp1EtxEg$default6 = textStyle6;
        }
        if ((i & 128) != 0) {
            textStyleM2967copyp1EtxEg$default7 = TextStyle.m2967copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(16), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnitKt.getSp(0.15d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM2967copyp1EtxEg$default7 = textStyle7;
        }
        if ((i & 256) != 0) {
            textStyleM2967copyp1EtxEg$default8 = TextStyle.m2967copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), null, null, null, null, TextUnitKt.getSp(0.1d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM2967copyp1EtxEg$default8 = textStyle8;
        }
        if ((i & 512) != 0) {
            textStyleM2967copyp1EtxEg$default9 = TextStyle.m2967copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(16), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnitKt.getSp(0.5d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM2967copyp1EtxEg$default9 = textStyle9;
        }
        if ((i & 1024) != 0) {
            textStyleM2967copyp1EtxEg$default10 = TextStyle.m2967copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnitKt.getSp(0.25d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(20), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM2967copyp1EtxEg$default10 = textStyle10;
        }
        if ((i & 2048) != 0) {
            textStyleM2967copyp1EtxEg$default11 = TextStyle.m2967copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), null, null, null, null, TextUnitKt.getSp(1.25d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(16), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM2967copyp1EtxEg$default11 = textStyle11;
        }
        if ((i & 4096) != 0) {
            textStyleM2967copyp1EtxEg$default12 = TextStyle.m2967copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(12), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnitKt.getSp(0.4d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(16), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM2967copyp1EtxEg$default12 = textStyle12;
        }
        if ((i & 8192) != 0) {
            textStyleM2967copyp1EtxEg$default13 = TextStyle.m2967copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(10), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnitKt.getSp(1.5d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(16), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM2967copyp1EtxEg$default13 = textStyle13;
        }
        this(fontFamily2, textStyleM2967copyp1EtxEg$default, textStyleM2967copyp1EtxEg$default2, textStyleM2967copyp1EtxEg$default3, textStyleM2967copyp1EtxEg$default4, textStyleM2967copyp1EtxEg$default5, textStyleM2967copyp1EtxEg$default6, textStyleM2967copyp1EtxEg$default7, textStyleM2967copyp1EtxEg$default8, textStyleM2967copyp1EtxEg$default9, textStyleM2967copyp1EtxEg$default10, textStyleM2967copyp1EtxEg$default11, textStyleM2967copyp1EtxEg$default12, textStyleM2967copyp1EtxEg$default13);
    }

    public Typography(@NotNull FontFamily fontFamily, @NotNull TextStyle textStyle, @NotNull TextStyle textStyle2, @NotNull TextStyle textStyle3, @NotNull TextStyle textStyle4, @NotNull TextStyle textStyle5, @NotNull TextStyle textStyle6, @NotNull TextStyle textStyle7, @NotNull TextStyle textStyle8, @NotNull TextStyle textStyle9, @NotNull TextStyle textStyle10, @NotNull TextStyle textStyle11, @NotNull TextStyle textStyle12, @NotNull TextStyle textStyle13) {
        this(TypographyKt.withDefaultFontFamily(textStyle, fontFamily), TypographyKt.withDefaultFontFamily(textStyle2, fontFamily), TypographyKt.withDefaultFontFamily(textStyle3, fontFamily), TypographyKt.withDefaultFontFamily(textStyle4, fontFamily), TypographyKt.withDefaultFontFamily(textStyle5, fontFamily), TypographyKt.withDefaultFontFamily(textStyle6, fontFamily), TypographyKt.withDefaultFontFamily(textStyle7, fontFamily), TypographyKt.withDefaultFontFamily(textStyle8, fontFamily), TypographyKt.withDefaultFontFamily(textStyle9, fontFamily), TypographyKt.withDefaultFontFamily(textStyle10, fontFamily), TypographyKt.withDefaultFontFamily(textStyle11, fontFamily), TypographyKt.withDefaultFontFamily(textStyle12, fontFamily), TypographyKt.withDefaultFontFamily(textStyle13, fontFamily));
    }
}
