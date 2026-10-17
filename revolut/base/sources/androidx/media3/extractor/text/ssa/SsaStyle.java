package androidx.media3.extractor.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes15.dex */
final class SsaStyle {
    public final int alignment;
    public final boolean bold;
    public final int borderStyle;
    public final float fontSize;
    public final boolean italic;
    public final String name;
    public final Integer outlineColor;
    public final Integer primaryColor;
    public final boolean strikeout;
    public final boolean underline;

    public static final class Format {
        public final int alignmentIndex;
        public final int boldIndex;
        public final int borderStyleIndex;
        public final int fontSizeIndex;
        public final int italicIndex;
        public final int length;
        public final int nameIndex;
        public final int outlineColorIndex;
        public final int primaryColorIndex;
        public final int strikeoutIndex;
        public final int underlineIndex;

        private Format(int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32, int i33, int i43, int i59) {
            this.nameIndex = i;
            this.alignmentIndex = i2;
            this.primaryColorIndex = i3;
            this.outlineColorIndex = i5;
            this.fontSizeIndex = i6;
            this.boldIndex = i21;
            this.italicIndex = i22;
            this.underlineIndex = i32;
            this.strikeoutIndex = i33;
            this.borderStyleIndex = i43;
            this.length = i59;
        }

        public static Format fromFormatLine(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), ",");
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i5 = -1;
            int i6 = -1;
            int i21 = -1;
            int i22 = -1;
            int i32 = -1;
            int i33 = -1;
            int i43 = -1;
            for (int i59 = 0; i59 < strArrSplit.length; i59++) {
                String lowerCase = Ascii.toLowerCase(strArrSplit[i59].trim());
                lowerCase.getClass();
                switch (lowerCase) {
                    case "italic":
                        i22 = i59;
                        break;
                    case "underline":
                        i32 = i59;
                        break;
                    case "strikeout":
                        i33 = i59;
                        break;
                    case "primarycolour":
                        i3 = i59;
                        break;
                    case "bold":
                        i21 = i59;
                        break;
                    case "name":
                        i = i59;
                        break;
                    case "fontsize":
                        i6 = i59;
                        break;
                    case "borderstyle":
                        i43 = i59;
                        break;
                    case "alignment":
                        i2 = i59;
                        break;
                    case "outlinecolour":
                        i5 = i59;
                        break;
                }
            }
            if (i != -1) {
                return new Format(i, i2, i3, i5, i6, i21, i22, i32, i33, i43, strArrSplit.length);
            }
            return null;
        }
    }

    public static final class Overrides {
        public final int alignment;
        public final PointF position;
        private static final Pattern BRACES_PATTERN = Pattern.compile("\\{([^}]*)\\}");
        private static final Pattern POSITION_PATTERN = Pattern.compile(Util.formatInvariant("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        private static final Pattern MOVE_PATTERN = Pattern.compile(Util.formatInvariant("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        private static final Pattern ALIGNMENT_OVERRIDE_PATTERN = Pattern.compile("\\\\an(\\d+)");

        private Overrides(int i, PointF pointF) {
            this.alignment = i;
            this.position = pointF;
        }

        private static int parseAlignmentOverride(String str) {
            Matcher matcher = ALIGNMENT_OVERRIDE_PATTERN.matcher(str);
            if (matcher.find()) {
                return SsaStyle.parseAlignment((String) Preconditions.checkNotNull(matcher.group(1)));
            }
            return -1;
        }

        public static Overrides parseFromDialogue(String str) {
            Matcher matcher = BRACES_PATTERN.matcher(str);
            PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                String str2 = (String) Preconditions.checkNotNull(matcher.group(1));
                try {
                    PointF position = parsePosition(str2);
                    if (position != null) {
                        pointF = position;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int alignmentOverride = parseAlignmentOverride(str2);
                    if (alignmentOverride != -1) {
                        i = alignmentOverride;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new Overrides(i, pointF);
        }

        private static PointF parsePosition(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = POSITION_PATTERN.matcher(str);
            Matcher matcher2 = MOVE_PATTERN.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    Log.i("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) Preconditions.checkNotNull(strGroup)).trim()), Float.parseFloat(((String) Preconditions.checkNotNull(strGroup2)).trim()));
        }

        public static String stripStyleOverrides(String str) {
            return BRACES_PATTERN.matcher(str).replaceAll("");
        }
    }

    private SsaStyle(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z3, boolean z4, boolean z6, int i2) {
        this.name = str;
        this.alignment = i;
        this.primaryColor = num;
        this.outlineColor = num2;
        this.fontSize = f;
        this.bold = z;
        this.italic = z3;
        this.underline = z4;
        this.strikeout = z6;
        this.borderStyle = i2;
    }

    public static SsaStyle fromStyleLine(String str, Format format) {
        boolean z;
        boolean z3;
        Preconditions.checkArgument(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i = format.length;
        if (length != i) {
            Log.w("SsaStyle", Util.formatInvariant("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[format.nameIndex].trim();
            int i2 = format.alignmentIndex;
            int alignment = i2 != -1 ? parseAlignment(strArrSplit[i2].trim()) : -1;
            int i3 = format.primaryColorIndex;
            Integer color = i3 != -1 ? parseColor(strArrSplit[i3].trim()) : null;
            int i5 = format.outlineColorIndex;
            Integer color2 = i5 != -1 ? parseColor(strArrSplit[i5].trim()) : null;
            int i6 = format.fontSizeIndex;
            float fontSize = i6 != -1 ? parseFontSize(strArrSplit[i6].trim()) : -3.4028235E38f;
            int i21 = format.boldIndex;
            boolean z4 = false;
            boolean z6 = true;
            if (i21 == -1 || !parseBooleanValue(strArrSplit[i21].trim())) {
                z = false;
            } else {
                z = false;
                z4 = true;
            }
            int i22 = format.italicIndex;
            if (i22 == -1 || !parseBooleanValue(strArrSplit[i22].trim())) {
                z3 = true;
                z6 = z;
            } else {
                z3 = true;
            }
            int i32 = format.underlineIndex;
            if (i32 == -1 || !parseBooleanValue(strArrSplit[i32].trim())) {
                z3 = false;
            }
            int i33 = format.strikeoutIndex;
            boolean z11 = i33 != -1 && parseBooleanValue(strArrSplit[i33].trim());
            int i43 = format.borderStyleIndex;
            return new SsaStyle(strTrim, alignment, color, color2, fontSize, z4, z6, z3, z11, i43 != -1 ? parseBorderStyle(strArrSplit[i43].trim()) : -1);
        } catch (RuntimeException e) {
            Log.w("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
            return null;
        }
    }

    private static boolean isValidAlignment(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private static boolean isValidBorderStyle(int i) {
        return i == 1 || i == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int parseAlignment(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            if (isValidAlignment(i)) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        a.D("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    private static boolean parseBooleanValue(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            Log.w("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    private static int parseBorderStyle(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            if (isValidBorderStyle(i)) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        a.D("Ignoring unknown BorderStyle: ", str, "SsaStyle");
        return -1;
    }

    public static Integer parseColor(String str) {
        try {
            long j2 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            Preconditions.checkArgument(j2 <= BodyPartID.bodyIdMax);
            return Integer.valueOf(Color.argb(Ints.checkedCast(((j2 >> 24) & 255) ^ 255), Ints.checkedCast(j2 & 255), Ints.checkedCast((j2 >> 8) & 255), Ints.checkedCast((j2 >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            Log.w("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    private static float parseFontSize(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            Log.w("SsaStyle", "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }
}
