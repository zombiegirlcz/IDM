package androidx.media3.extractor.text.ssa;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes15.dex */
final class SsaDialogueFormat {
    public final int endTimeIndex;
    public final int layerIndex;
    public final int length;
    public final int startTimeIndex;
    public final int styleIndex;
    public final int textIndex;

    private SsaDialogueFormat(int i, int i2, int i3, int i5, int i6, int i21) {
        this.layerIndex = i;
        this.startTimeIndex = i2;
        this.endTimeIndex = i3;
        this.styleIndex = i5;
        this.textIndex = i6;
        this.length = i21;
    }

    public static SsaDialogueFormat fromFormatLine(String str) {
        Preconditions.checkArgument(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i5 = -1;
        int i6 = -1;
        for (int i21 = 0; i21 < strArrSplit.length; i21++) {
            String lowerCase = Ascii.toLowerCase(strArrSplit[i21].trim());
            lowerCase.getClass();
            switch (lowerCase) {
                case "end":
                    i3 = i21;
                    break;
                case "text":
                    i6 = i21;
                    break;
                case "layer":
                    i = i21;
                    break;
                case "start":
                    i2 = i21;
                    break;
                case "style":
                    i5 = i21;
                    break;
            }
        }
        if (i2 == -1 || i3 == -1 || i6 == -1) {
            return null;
        }
        return new SsaDialogueFormat(i, i2, i3, i5, i6, strArrSplit.length);
    }
}
