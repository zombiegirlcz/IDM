package androidx.media3.common.util;

import android.graphics.Color;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import ip0.v7;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes15.dex */
public abstract class ColorParser {
    private static final Map<String, Integer> COLOR_MAP;
    private static final Pattern RGB_PATTERN = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern RGBA_PATTERN_INT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern RGBA_PATTERN_FLOAT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    static {
        HashMap map = new HashMap();
        COLOR_MAP = map;
        v7.A(-984833, map, "aliceblue", -332841, "antiquewhite");
        map.put("aqua", -16711681);
        map.put("aquamarine", -8388652);
        v7.A(-983041, map, "azure", -657956, "beige");
        v7.A(-6972, map, "bisque", -16777216, "black");
        v7.A(-5171, map, "blanchedalmond", -16776961, "blue");
        v7.A(-7722014, map, "blueviolet", -5952982, "brown");
        v7.A(-2180985, map, "burlywood", -10510688, "cadetblue");
        v7.A(-8388864, map, "chartreuse", -2987746, "chocolate");
        v7.A(-32944, map, "coral", -10185235, "cornflowerblue");
        v7.A(-1828, map, "cornsilk", -2354116, "crimson");
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        v7.A(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        v7.A(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        v7.A(-29696, map, "darkorange", -6737204, "darkorchid");
        v7.A(-7667712, map, "darkred", -1468806, "darksalmon");
        v7.A(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        v7.A(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        v7.A(-1296, map, "floralwhite", -14513374, "forestgreen");
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        v7.A(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        v7.A(-16744448, map, "green", -5374161, "greenyellow");
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        v7.A(-38476, map, "hotpink", -3318692, "indianred");
        v7.A(-11861886, map, "indigo", -16, "ivory");
        v7.A(-989556, map, "khaki", -1644806, "lavender");
        v7.A(-3851, map, "lavenderblush", -8586240, "lawngreen");
        v7.A(-1331, map, "lemonchiffon", -5383962, "lightblue");
        v7.A(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        v7.A(-18751, map, "lightpink", -24454, "lightsalmon");
        v7.A(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        v7.A(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        v7.A(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        v7.A(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        v7.A(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        v7.A(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        v7.A(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        v7.A(-15132304, map, "midnightblue", -655366, "mintcream");
        v7.A(-6943, map, "mistyrose", -6987, "moccasin");
        v7.A(-8531, map, "navajowhite", -16777088, "navy");
        v7.A(-133658, map, "oldlace", -8355840, "olive");
        v7.A(-9728477, map, "olivedrab", -23296, "orange");
        v7.A(-47872, map, "orangered", -2461482, "orchid");
        v7.A(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        v7.A(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        v7.A(-4139, map, "papayawhip", -9543, "peachpuff");
        v7.A(-3308225, map, "peru", -16181, "pink");
        v7.A(-2252579, map, "plum", -5185306, "powderblue");
        v7.A(-8388480, map, "purple", -10079335, "rebeccapurple");
        v7.A(-65536, map, "red", -4419697, "rosybrown");
        v7.A(-12490271, map, "royalblue", -7650029, "saddlebrown");
        v7.A(-360334, map, "salmon", -744352, "sandybrown");
        v7.A(-13726889, map, "seagreen", -2578, "seashell");
        v7.A(-6270419, map, "sienna", -4144960, "silver");
        v7.A(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        v7.A(-12156236, map, "steelblue", -2968436, "tan");
        v7.A(-16744320, map, "teal", -2572328, "thistle");
        v7.A(-40121, map, "tomato", 0, "transparent");
        v7.A(-12525360, map, "turquoise", -1146130, "violet");
        v7.A(-663885, map, "wheat", -1, "white");
        v7.A(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    private static int parseColorInternal(String str, boolean z) {
        Preconditions.checkArgument(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i;
            }
            if (strReplace.length() == 9) {
                return ((i & 255) << 24) | (i >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z ? RGBA_PATTERN_FLOAT_ALPHA : RGBA_PATTERN_INT_ALPHA).matcher(strReplace);
            if (matcher.matches()) {
                return Color.argb(z ? (int) (Float.parseFloat((String) Preconditions.checkNotNull(matcher.group(4))) * 255.0f) : Integer.parseInt((String) Preconditions.checkNotNull(matcher.group(4)), 10), Integer.parseInt((String) Preconditions.checkNotNull(matcher.group(1)), 10), Integer.parseInt((String) Preconditions.checkNotNull(matcher.group(2)), 10), Integer.parseInt((String) Preconditions.checkNotNull(matcher.group(3)), 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = RGB_PATTERN.matcher(strReplace);
            if (matcher2.matches()) {
                return Color.rgb(Integer.parseInt((String) Preconditions.checkNotNull(matcher2.group(1)), 10), Integer.parseInt((String) Preconditions.checkNotNull(matcher2.group(2)), 10), Integer.parseInt((String) Preconditions.checkNotNull(matcher2.group(3)), 10));
            }
        } else {
            Integer num = COLOR_MAP.get(Ascii.toLowerCase(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    public static int parseCssColor(String str) {
        return parseColorInternal(str, true);
    }

    public static int parseTtmlColor(String str) {
        return parseColorInternal(str, false);
    }
}
