package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes23.dex */
final class u70 implements VisualTransformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f33971c;
    private final TextStyle d;
    private final List e;

    public static final class a implements OffsetMapping {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f33973b;

        public a(int i) {
            this.f33973b = i;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int originalToTransformed(int i) {
            int iAbs = Math.abs(i);
            if (iAbs == 0) {
                return 0;
            }
            String strSubstring = u70.this.f33969a;
            int length = strSubstring.length();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 < length) {
                    if (strSubstring.charAt(i2) == '#') {
                        i3++;
                    }
                    if (i3 >= iAbs) {
                        strSubstring = strSubstring.substring(0, i2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            return strSubstring.length() + ((Intrinsics.f(strSubstring, "#") || Intrinsics.f(strSubstring, "## / #")) ? 3 : 0) + 1;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int transformedToOriginal(int i) {
            String strU0 = kotlin.text.f0.U0(Math.abs(i), u70.this.f33969a);
            int i2 = 0;
            for (int i3 = 0; i3 < strU0.length(); i3++) {
                if (strU0.charAt(i3) == '#') {
                    i2++;
                }
            }
            return Math.min(i2, this.f33973b);
        }
    }

    public /* synthetic */ u70(String str, String str2, long j2, TextStyle textStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j2, textStyle);
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString text) {
        AnnotatedString annotatedString;
        Intrinsics.checkNotNullParameter(text, "text");
        String string = "";
        int i = 0;
        for (int i2 = 0; i2 < text.length(); i2++) {
            char cCharAt = text.charAt(i2);
            while (this.e.contains(Integer.valueOf(i))) {
                char cCharAt2 = this.f33969a.charAt(i);
                StringBuilder sb6 = new StringBuilder();
                sb6.append((Object) string);
                sb6.append(cCharAt2);
                string = sb6.toString();
                i++;
            }
            StringBuilder sb9 = new StringBuilder();
            sb9.append((Object) string);
            sb9.append(cCharAt);
            string = sb9.toString();
            i++;
        }
        if (this.f33970b == null || string.length() >= this.f33970b.length()) {
            annotatedString = new AnnotatedString(string, null, 2, null);
        } else {
            String strSubstring = this.f33970b.substring(string.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(string);
            int iPushStyle = builder.pushStyle(new SpanStyle(this.f33971c, 0L, null, this.d.m2974getFontStyle4Lr2A7w(), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65526, null));
            try {
                builder.append(strSubstring);
                Unit unit = Unit.f186387a;
                builder.pop(iPushStyle);
                annotatedString = builder.toAnnotatedString();
            } catch (Throwable th10) {
                builder.pop(iPushStyle);
                throw th10;
            }
        }
        return new TransformedText(annotatedString, a(text.length()));
    }

    private u70(String mask, String str, long j2, TextStyle placeholderStyle) {
        Intrinsics.checkNotNullParameter(mask, "mask");
        Intrinsics.checkNotNullParameter(placeholderStyle, "placeholderStyle");
        this.f33969a = mask;
        this.f33970b = str;
        this.f33971c = j2;
        this.d = placeholderStyle;
        IntRange intRangeO = kotlin.text.d0.O(mask);
        ArrayList arrayList = new ArrayList();
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            Object next = it8.next();
            if (this.f33969a.charAt(((Number) next).intValue()) != '#') {
                arrayList.add(next);
            }
        }
        this.e = arrayList;
    }

    private final a a(int i) {
        return new a(i);
    }

    public /* synthetic */ u70(String str, String str2, long j2, TextStyle textStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Color.INSTANCE.m1989getGray0d7_KjU() : j2, (i & 8) != 0 ? TextStyle.INSTANCE.getDefault() : textStyle, null);
    }
}
