package e80;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.LocaleSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuggestionSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends SpannableString {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CharSequence charSequence) {
        super(charSequence);
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
    }

    public static Object a(ImageSpan imageSpan, String str) {
        try {
            Field declaredField = imageSpan.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(imageSpan);
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    @Override // android.text.SpannableString
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e80.j.equals(java.lang.Object):boolean");
    }

    @Override // android.text.SpannableString
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3 = toString().hashCode() + 31;
        for (Object obj2 : getSpans(0, length(), Object.class)) {
            if (obj2 instanceof UnderlineSpan) {
                iHashCode = Integer.hashCode(((UnderlineSpan) obj2).getSpanTypeId());
            } else if (obj2 instanceof StrikethroughSpan) {
                iHashCode = Integer.hashCode(((StrikethroughSpan) obj2).getSpanTypeId());
            } else if (obj2 instanceof SubscriptSpan) {
                iHashCode = Integer.hashCode(((SubscriptSpan) obj2).getSpanTypeId());
            } else if (obj2 instanceof SuperscriptSpan) {
                iHashCode = Integer.hashCode(((SuperscriptSpan) obj2).getSpanTypeId());
            } else if (obj2 instanceof RelativeSizeSpan) {
                RelativeSizeSpan relativeSizeSpan = (RelativeSizeSpan) obj2;
                iHashCode = Float.hashCode(relativeSizeSpan.getSizeChange()) * Integer.hashCode(relativeSizeSpan.getSpanTypeId());
            } else {
                if (obj2 instanceof ImageSpan) {
                    ImageSpan imageSpan = (ImageSpan) obj2;
                    String source = imageSpan.getSource();
                    iHashCode = source != null ? source.hashCode() * 31 : 1;
                    Integer num = (Integer) a(imageSpan, "mResourceId");
                    if (num != null) {
                        iHashCode *= Integer.hashCode(num.intValue()) * 31;
                    }
                    Uri uri2 = (Uri) a(imageSpan, "mContentUri");
                    if (uri2 != null) {
                        iHashCode *= uri2.hashCode() * 31;
                    }
                    Drawable drawable = (Drawable) a(imageSpan, "mDrawable");
                    if (drawable != null) {
                        iHashCode2 = drawable.hashCode() * 31;
                        iHashCode = iHashCode2 * iHashCode;
                    }
                } else if (obj2 instanceof SuggestionSpan) {
                    iHashCode = ((SuggestionSpan) obj2).hashCode();
                } else if (obj2 instanceof URLSpan) {
                    iHashCode = ((URLSpan) obj2).getURL().hashCode();
                } else if (obj2 instanceof ForegroundColorSpan) {
                    iHashCode = Integer.hashCode(((ForegroundColorSpan) obj2).getForegroundColor());
                } else if (obj2 instanceof BackgroundColorSpan) {
                    iHashCode = Integer.hashCode(((BackgroundColorSpan) obj2).getBackgroundColor());
                } else if (obj2 instanceof LocaleSpan) {
                    iHashCode = ((LocaleSpan) obj2).getLocales().hashCode();
                } else if (obj2 instanceof MaskFilterSpan) {
                    iHashCode = ((MaskFilterSpan) obj2).getMaskFilter().hashCode();
                } else if (obj2 instanceof ScaleXSpan) {
                    iHashCode = Float.hashCode(((ScaleXSpan) obj2).getScaleX());
                } else if (obj2 instanceof StyleSpan) {
                    iHashCode = Integer.hashCode(((StyleSpan) obj2).getStyle());
                } else if (obj2 instanceof TypefaceSpan) {
                    String family = ((TypefaceSpan) obj2).getFamily();
                    iHashCode = family != null ? family.hashCode() : iHashCode;
                } else if (obj2 instanceof TextAppearanceSpan) {
                    TextAppearanceSpan textAppearanceSpan = (TextAppearanceSpan) obj2;
                    int iHashCode4 = textAppearanceSpan.getFamily().hashCode();
                    Object linkTextColor = textAppearanceSpan.getLinkTextColor();
                    if (linkTextColor == null) {
                        linkTextColor = 0;
                    }
                    int iHashCode5 = linkTextColor.hashCode() * iHashCode4;
                    Object textColor = textAppearanceSpan.getTextColor();
                    if (textColor == null) {
                        textColor = 0;
                    }
                    iHashCode = Integer.hashCode(textAppearanceSpan.getTextStyle()) * textColor.hashCode() * iHashCode5;
                    iHashCode2 = Integer.hashCode(textAppearanceSpan.getTextSize());
                    iHashCode = iHashCode2 * iHashCode;
                } else {
                    iHashCode = obj2.hashCode();
                }
            }
            iHashCode3 *= iHashCode * 31;
        }
        return iHashCode3;
    }
}
