package com.fourthline.orca.internal;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class k5 implements VisualTransformation {

    public static final class a implements OffsetMapping {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30130b;

        public a(String str, String str2) {
            this.f30129a = str;
            this.f30130b = str2;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int originalToTransformed(int i) {
            int iMin = Math.min(i, this.f30129a.length());
            return Math.min(iMin + (iMin / 4), this.f30130b.length());
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int transformedToOriginal(int i) {
            int iMin = Math.min(i, this.f30130b.length());
            return Math.min(iMin - (iMin / 5), this.f30129a.length());
        }
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int i = 0;
        String strD = kotlin.text.a0.D(text.getText(), " ", "", false);
        StringBuilder sb6 = new StringBuilder();
        int length = strD.length();
        while (i < length) {
            sb6.append(strD.charAt(i));
            int i2 = i + 1;
            if (i2 % 4 == 0 && i != kotlin.text.d0.P(strD)) {
                sb6.append(zsc.p.SPACE_CHAR);
            }
            i = i2;
        }
        String string = sb6.toString();
        return new TransformedText(new AnnotatedString(string, null, 2, null), new a(strD, string));
    }
}
