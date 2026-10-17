package com.fourthline.kyc.internal;

import com.fourthline.kyc.Attachment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class b {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Attachment.LocalFileAttachment.MimeType.values().length];
            try {
                iArr[Attachment.LocalFileAttachment.MimeType.PDF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String a(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        StringBuilder sb6 = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char cCharAt = text.charAt(i);
            if (cCharAt == '\"') {
                sb6.append("&quot;");
            } else if (cCharAt == '<') {
                sb6.append("&lt;");
            } else if (cCharAt == '>') {
                sb6.append("&gt;");
            } else if (cCharAt == '&') {
                sb6.append("&amp;");
            } else if (cCharAt == '\'') {
                sb6.append("&apos;");
            } else if (cCharAt > '~') {
                sb6.append("&#" + ((int) cCharAt) + ";");
            } else {
                sb6.append(cCharAt);
            }
        }
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "with(...)");
        return string;
    }

    public static final String a(Attachment.Document document) {
        String strA;
        Intrinsics.checkNotNullParameter(document, "<this>");
        Attachment.LocalFileAttachment file = document.getFile();
        return (file == null || (strA = a(file)) == null) ? "jpg" : strA;
    }

    public static final String a(Attachment.LocalFileAttachment localFileAttachment) {
        Intrinsics.checkNotNullParameter(localFileAttachment, "<this>");
        if (a.$EnumSwitchMapping$0[localFileAttachment.getMimeType().ordinal()] == 1) {
            return "pdf";
        }
        throw new NoWhenBranchMatchedException();
    }
}
