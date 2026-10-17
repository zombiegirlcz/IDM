package androidx.media3.common;

import android.text.TextUtils;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.common.base.Preconditions;
import java.util.Arrays;
import v0.a;

/* JADX INFO: loaded from: classes.dex */
public final class TrackGroup {
    private static final String FIELD_FORMATS = Util.intToStringMaxRadix(0);
    private static final String FIELD_ID = Util.intToStringMaxRadix(1);
    private final Format[] formats;
    private int hashCode;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final String f7458id;
    public final int length;
    public final int type;

    public TrackGroup(Format... formatArr) {
        this("", formatArr);
    }

    private static void logErrorMessage(String str, String str2, String str3, int i) {
        StringBuilder sbM = a.m("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbM.append(str3);
        sbM.append("' (track ");
        sbM.append(i);
        sbM.append(")");
        Log.e("TrackGroup", "", new IllegalStateException(sbM.toString()));
    }

    private static String normalizeLanguage(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int normalizeRoleFlags(int i) {
        return i | 16384;
    }

    private void verifyCorrectness() {
        String strNormalizeLanguage = normalizeLanguage(this.formats[0].language);
        int iNormalizeRoleFlags = normalizeRoleFlags(this.formats[0].roleFlags);
        int i = 1;
        while (true) {
            Format[] formatArr = this.formats;
            if (i >= formatArr.length) {
                return;
            }
            if (!strNormalizeLanguage.equals(normalizeLanguage(formatArr[i].language))) {
                Format[] formatArr2 = this.formats;
                logErrorMessage("languages", formatArr2[0].language, formatArr2[i].language, i);
                return;
            } else {
                if (iNormalizeRoleFlags != normalizeRoleFlags(this.formats[i].roleFlags)) {
                    logErrorMessage("role flags", Integer.toBinaryString(this.formats[0].roleFlags), Integer.toBinaryString(this.formats[i].roleFlags), i);
                    return;
                }
                i++;
            }
        }
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && TrackGroup.class == obj2.getClass()) {
            TrackGroup trackGroup = (TrackGroup) obj2;
            if (this.f7458id.equals(trackGroup.f7458id) && Arrays.equals(this.formats, trackGroup.formats)) {
                return true;
            }
        }
        return false;
    }

    public Format getFormat(int i) {
        return this.formats[i];
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = Arrays.hashCode(this.formats) + p.a.c(527, 31, this.f7458id);
        }
        return this.hashCode;
    }

    public int indexOf(Format format) {
        int i = 0;
        while (true) {
            Format[] formatArr = this.formats;
            if (i >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i]) {
                return i;
            }
            i++;
        }
    }

    public String toString() {
        return this.f7458id + ": " + Arrays.toString(this.formats);
    }

    public TrackGroup(String str, Format... formatArr) {
        Preconditions.checkArgument(formatArr.length > 0);
        this.f7458id = str;
        this.formats = formatArr;
        this.length = formatArr.length;
        String str2 = formatArr[0].sampleMimeType;
        this.type = TextUtils.isEmpty(str2) ? MimeTypes.getTrackType(formatArr[0].containerMimeType) : MimeTypes.getTrackType(str2);
        verifyCorrectness();
    }
}
