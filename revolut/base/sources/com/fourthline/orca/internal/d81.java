package com.fourthline.orca.internal;

import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import com.fourthline.orca.internal.c81;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class d81 {
    public static final String a(c81 c81Var, Function0 resources) {
        Intrinsics.checkNotNullParameter(c81Var, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return a(c81Var, (Resources) resources.invoke());
    }

    public static final AnnotatedString b(c81 c81Var, Composer composer, int i) {
        SpannedString spannedString;
        Intrinsics.checkNotNullParameter(c81Var, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1862927287, i, -1, "com.fourthline.orca.core.internal.styling.text.asAnnotatedString (TextResource.kt:88)");
        }
        Resources resourcesD = fj0.f28535a.d(composer, 6);
        int i2 = 0;
        if (c81Var instanceof c81.d) {
            spannedString = new SpannedString(resourcesD.getText(((c81.d) c81Var).b()));
        } else if (c81Var instanceof c81.c) {
            c81.c cVar = (c81.c) c81Var;
            int iB = cVar.b();
            String[] strArr = (String[]) cVar.a().toArray(new String[0]);
            spannedString = new SpannedString(a(resourcesD, iB, (String[]) Arrays.copyOf(strArr, strArr.length)));
        } else if (c81Var instanceof c81.e) {
            String strA = ((c81.e) c81Var).a();
            Intrinsics.i(strA, "null cannot be cast to non-null type kotlin.CharSequence");
            spannedString = new SpannedString(strA);
        } else {
            if (!(c81Var instanceof c81.b)) {
                throw new NoWhenBranchMatchedException();
            }
            spannedString = new SpannedString("");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(i2, 1, null);
        String string = spannedString.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        builder.append(string);
        Object[] spans = spannedString.getSpans(0, spannedString.length(), Object.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        int length = spans.length;
        while (i2 < length) {
            Object obj2 = spans[i2];
            int spanStart = spannedString.getSpanStart(obj2);
            int spanEnd = spannedString.getSpanEnd(obj2);
            if (obj2 instanceof StyleSpan) {
                int style = ((StyleSpan) obj2).getStyle();
                if (style == 1) {
                    builder.addStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65531, null), spanStart, spanEnd);
                } else if (style == 2) {
                    builder.addStyle(new SpanStyle(0L, 0L, null, FontStyle.m3013boximpl(FontStyle.INSTANCE.m3020getItalic_LCdwA()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65527, null), spanStart, spanEnd);
                } else if (style == 3) {
                    builder.addStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), FontStyle.m3013boximpl(FontStyle.INSTANCE.m3020getItalic_LCdwA()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65523, null), spanStart, spanEnd);
                }
            } else if (obj2 instanceof UnderlineSpan) {
                builder.addStyle(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.INSTANCE.getUnderline(), null, null, null, 61439, null), spanStart, spanEnd);
            } else if (obj2 instanceof ForegroundColorSpan) {
                builder.addStyle(new SpanStyle(ColorKt.Color(((ForegroundColorSpan) obj2).getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null), spanStart, spanEnd);
            }
            i2++;
        }
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return annotatedString;
    }

    public static final String c(c81 c81Var, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(c81Var, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(588039963, i, -1, "com.fourthline.orca.core.internal.styling.text.asString (TextResource.kt:61)");
        }
        String strA = a(c81Var, fj0.f28535a.d(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strA;
    }

    public static final String a(c81 c81Var, Resources resources) {
        String strA;
        Intrinsics.checkNotNullParameter(c81Var, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (c81Var instanceof c81.d) {
            strA = resources.getString(((c81.d) c81Var).b());
        } else if (c81Var instanceof c81.c) {
            c81.c cVar = (c81.c) c81Var;
            int iB = cVar.b();
            String[] strArr = (String[]) cVar.a().toArray(new String[0]);
            strA = resources.getString(iB, Arrays.copyOf(strArr, strArr.length));
        } else if (c81Var instanceof c81.e) {
            strA = ((c81.e) c81Var).a();
        } else {
            if (!(c81Var instanceof c81.b)) {
                throw new NoWhenBranchMatchedException();
            }
            strA = "";
        }
        Intrinsics.checkNotNullExpressionValue(strA, "with(...)");
        return strA;
    }

    public static final String a(c81 c81Var, Composer composer, int i) {
        String strA;
        Intrinsics.checkNotNullParameter(c81Var, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1056690694, i, -1, "com.fourthline.orca.core.internal.styling.text.accessibilityDescription (TextResource.kt:76)");
        }
        composer.startReplaceGroup(1867476734);
        fj0 fj0Var = fj0.f28535a;
        Resources resourcesD = fj0Var.d(composer, 6);
        if (c81Var instanceof c81.d) {
            composer.startReplaceGroup(-50216194);
            composer.endReplaceGroup();
            strA = resourcesD.getString(((c81.d) c81Var).a());
        } else {
            composer.startReplaceGroup(-50214639);
            strA = a(c81Var, fj0Var.d(composer, 6));
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
        Intrinsics.h(strA);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strA;
    }

    private static final CharSequence a(Resources resources, int i, String... strArr) {
        String html = Html.toHtml(new SpannedString(resources.getText(i)), 63);
        Intrinsics.checkNotNullExpressionValue(html, "toHtml(...)");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        String str = String.format(html, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Spanned spannedFromHtml = Html.fromHtml(str, 63);
        Intrinsics.h(spannedFromHtml);
        return kotlin.text.d0.F0(spannedFromHtml);
    }
}
