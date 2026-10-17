package com.fourthline.orca.internal;

import android.graphics.Matrix;
import android.util.Xml;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.orca.internal.e9;
import com.fourthline.orca.internal.lz0;
import com.fourthline.orca.internal.m71;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes23.dex */
class pz0 implements oz0 {
    private static final boolean k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f32081l = Pattern.compile("/\\*.*?\\*/");
    private int e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private lz0 f32082a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private lz0.j0 f32083b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32084c = true;
    private boolean d = false;
    private boolean f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h f32085g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private StringBuilder f32086h = null;
    private boolean i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private StringBuilder f32087j = null;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f32089b;

        static {
            int[] iArr = new int[g.values().length];
            f32089b = iArr;
            try {
                iArr[g.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32089b[g.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32089b[g.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32089b[g.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32089b[g.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32089b[g.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32089b[g.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32089b[g.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32089b[g.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32089b[g.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f32089b[g.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f32089b[g.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f32089b[g.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f32089b[g.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f32089b[g.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f32089b[g.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f32089b[g.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f32089b[g.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f32089b[g.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f32089b[g.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f32089b[g.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f32089b[g.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f32089b[g.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f32089b[g.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f32089b[g.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f32089b[g.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f32089b[g.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f32089b[g.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f32089b[g.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f32089b[g.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f32089b[g.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f32089b[g.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f32089b[g.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f32089b[g.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f32089b[g.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f32089b[g.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f32089b[g.fr.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f32089b[g.offset.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f32089b[g.clipPathUnits.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f32089b[g.startOffset.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f32089b[g.patternUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f32089b[g.patternContentUnits.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f32089b[g.patternTransform.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f32089b[g.maskUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f32089b[g.maskContentUnits.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f32089b[g.style.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f32089b[g.CLASS.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f32089b[g.viewBox.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f32089b[g.type.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f32089b[g.media.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            int[] iArr2 = new int[h.values().length];
            f32088a = iArr2;
            try {
                iArr2[h.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f32088a[h.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f32088a[h.defs.ordinal()] = 3;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f32088a[h.a.ordinal()] = 4;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f32088a[h.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f32088a[h.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f32088a[h.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f32088a[h.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f32088a[h.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f32088a[h.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f32088a[h.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f32088a[h.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f32088a[h.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f32088a[h.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f32088a[h.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f32088a[h.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f32088a[h.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f32088a[h.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f32088a[h.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f32088a[h.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f32088a[h.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f32088a[h.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f32088a[h.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f32088a[h.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f32088a[h.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f32088a[h.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f32088a[h.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f32088a[h.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f32088a[h.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f32088a[h.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f32088a[h.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused81) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f32090a;

        static {
            HashMap map = new HashMap(47);
            f32090a = map;
            map.put("aliceblue", -984833);
            map.put("antiquewhite", -332841);
            map.put("aqua", -16711681);
            map.put("aquamarine", -8388652);
            map.put("azure", -983041);
            map.put("beige", -657956);
            map.put("bisque", -6972);
            map.put("black", -16777216);
            map.put("blanchedalmond", -5171);
            map.put("blue", -16776961);
            map.put("blueviolet", -7722014);
            map.put("brown", -5952982);
            map.put("burlywood", -2180985);
            map.put("cadetblue", -10510688);
            map.put("chartreuse", -8388864);
            map.put("chocolate", -2987746);
            map.put("coral", -32944);
            map.put("cornflowerblue", -10185235);
            map.put("cornsilk", -1828);
            map.put("crimson", -2354116);
            map.put("cyan", -16711681);
            map.put("darkblue", -16777077);
            map.put("darkcyan", -16741493);
            map.put("darkgoldenrod", -4684277);
            map.put("darkgray", -5658199);
            map.put("darkgreen", -16751616);
            map.put("darkgrey", -5658199);
            map.put("darkkhaki", -4343957);
            map.put("darkmagenta", -7667573);
            map.put("darkolivegreen", -11179217);
            map.put("darkorange", -29696);
            map.put("darkorchid", -6737204);
            map.put("darkred", -7667712);
            map.put("darksalmon", -1468806);
            map.put("darkseagreen", -7357297);
            map.put("darkslateblue", -12042869);
            map.put("darkslategray", -13676721);
            map.put("darkslategrey", -13676721);
            map.put("darkturquoise", -16724271);
            map.put("darkviolet", -7077677);
            map.put("deeppink", -60269);
            map.put("deepskyblue", -16728065);
            map.put("dimgray", -9868951);
            map.put("dimgrey", -9868951);
            map.put("dodgerblue", -14774017);
            map.put("firebrick", -5103070);
            map.put("floralwhite", -1296);
            map.put("forestgreen", -14513374);
            map.put("fuchsia", -65281);
            map.put("gainsboro", -2302756);
            map.put("ghostwhite", -460545);
            map.put("gold", -10496);
            map.put("goldenrod", -2448096);
            map.put("gray", -8355712);
            map.put("green", -16744448);
            map.put("greenyellow", -5374161);
            map.put("grey", -8355712);
            map.put("honeydew", -983056);
            map.put("hotpink", -38476);
            map.put("indianred", -3318692);
            map.put("indigo", -11861886);
            map.put("ivory", -16);
            map.put("khaki", -989556);
            map.put("lavender", -1644806);
            map.put("lavenderblush", -3851);
            map.put("lawngreen", -8586240);
            map.put("lemonchiffon", -1331);
            map.put("lightblue", -5383962);
            map.put("lightcoral", -1015680);
            map.put("lightcyan", -2031617);
            map.put("lightgoldenrodyellow", -329006);
            map.put("lightgray", -2894893);
            map.put("lightgreen", -7278960);
            map.put("lightgrey", -2894893);
            map.put("lightpink", -18751);
            map.put("lightsalmon", -24454);
            map.put("lightseagreen", -14634326);
            map.put("lightskyblue", -7876870);
            map.put("lightslategray", -8943463);
            map.put("lightslategrey", -8943463);
            map.put("lightsteelblue", -5192482);
            map.put("lightyellow", -32);
            map.put("lime", -16711936);
            map.put("limegreen", -13447886);
            map.put("linen", -331546);
            map.put("magenta", -65281);
            map.put("maroon", -8388608);
            map.put("mediumaquamarine", -10039894);
            map.put("mediumblue", -16777011);
            map.put("mediumorchid", -4565549);
            map.put("mediumpurple", -7114533);
            map.put("mediumseagreen", -12799119);
            map.put("mediumslateblue", -8689426);
            map.put("mediumspringgreen", -16713062);
            map.put("mediumturquoise", -12004916);
            map.put("mediumvioletred", -3730043);
            map.put("midnightblue", -15132304);
            map.put("mintcream", -655366);
            map.put("mistyrose", -6943);
            map.put("moccasin", -6987);
            map.put("navajowhite", -8531);
            map.put("navy", -16777088);
            map.put("oldlace", -133658);
            map.put("olive", -8355840);
            map.put("olivedrab", -9728477);
            map.put("orange", -23296);
            map.put("orangered", -47872);
            map.put("orchid", -2461482);
            map.put("palegoldenrod", -1120086);
            map.put("palegreen", -6751336);
            map.put("paleturquoise", -5247250);
            map.put("palevioletred", -2396013);
            map.put("papayawhip", -4139);
            map.put("peachpuff", -9543);
            map.put("peru", -3308225);
            map.put("pink", -16181);
            map.put("plum", -2252579);
            map.put("powderblue", -5185306);
            map.put("purple", -8388480);
            map.put("rebeccapurple", -10079335);
            map.put("red", -65536);
            map.put("rosybrown", -4419697);
            map.put("royalblue", -12490271);
            map.put("saddlebrown", -7650029);
            map.put("salmon", -360334);
            map.put("sandybrown", -744352);
            map.put("seagreen", -13726889);
            map.put("seashell", -2578);
            map.put("sienna", -6270419);
            map.put("silver", -4144960);
            map.put("skyblue", -7876885);
            map.put("slateblue", -9807155);
            map.put("slategray", -9404272);
            map.put("slategrey", -9404272);
            map.put("snow", -1286);
            map.put("springgreen", -16711809);
            map.put("steelblue", -12156236);
            map.put("tan", -2968436);
            map.put("teal", -16744320);
            map.put("thistle", -2572328);
            map.put("tomato", -40121);
            map.put("turquoise", -12525360);
            map.put("violet", -1146130);
            map.put("wheat", -663885);
            map.put("white", -1);
            map.put("whitesmoke", -657931);
            map.put("yellow", -256);
            map.put("yellowgreen", -6632142);
            map.put("transparent", 0);
        }

        public static Integer a(String str) {
            return (Integer) f32090a.get(str);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f32091a;

        static {
            HashMap map = new HashMap(9);
            f32091a = map;
            lz0.d1 d1Var = lz0.d1.pt;
            map.put("xx-small", new lz0.q(0.694f, d1Var));
            map.put("x-small", new lz0.q(0.833f, d1Var));
            map.put("small", new lz0.q(10.0f, d1Var));
            map.put("medium", new lz0.q(12.0f, d1Var));
            map.put("large", new lz0.q(14.4f, d1Var));
            map.put("x-large", new lz0.q(17.3f, d1Var));
            map.put("xx-large", new lz0.q(20.7f, d1Var));
            lz0.d1 d1Var2 = lz0.d1.percent;
            map.put("smaller", new lz0.q(83.33f, d1Var2));
            map.put("larger", new lz0.q(120.0f, d1Var2));
        }

        public static lz0.q a(String str) {
            return (lz0.q) f32091a.get(str);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f32092a;

        static {
            HashMap map = new HashMap(9);
            f32092a = map;
            map.put("ultra-condensed", Float.valueOf(50.0f));
            map.put("extra-condensed", Float.valueOf(62.5f));
            map.put("condensed", Float.valueOf(75.0f));
            map.put("semi-condensed", Float.valueOf(87.5f));
            map.put("normal", Float.valueOf(100.0f));
            map.put("semi-expanded", Float.valueOf(112.5f));
            map.put("expanded", Float.valueOf(125.0f));
            map.put("extra-expanded", Float.valueOf(150.0f));
            map.put("ultra-expanded", Float.valueOf(200.0f));
        }

        public static boolean a(String str) {
            return f32092a.containsKey(str);
        }

        public static Float b(String str) {
            return (Float) f32092a.get(str);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f32093a;

        static {
            HashMap map = new HashMap(4);
            f32093a = map;
            map.put("normal", Float.valueOf(400.0f));
            map.put("bold", Float.valueOf(700.0f));
            map.put("bolder", Float.valueOf(Float.MAX_VALUE));
            map.put("lighter", Float.valueOf(Float.MIN_VALUE));
        }

        public static boolean a(String str) {
            return f32093a.containsKey(str);
        }

        public static Float b(String str) {
            return (Float) f32093a.get(str);
        }
    }

    public class f extends DefaultHandler2 {
        public /* synthetic */ f(pz0 pz0Var, int i) {
            this();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) {
            pz0.this.J(new String(cArr, i, i2));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() {
            pz0.this.a();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws nz0 {
            pz0.this.a(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
            pz0.this.a(str, pz0.this.b(new e81(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() {
            pz0.this.b();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws nz0 {
            pz0.this.a(str, str2, str3, attributes);
        }

        private f() {
        }
    }

    public enum g {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        fr,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_feature_settings,
        font_size,
        font_stretch,
        font_style,
        font_weight,
        font_kerning,
        font_variant,
        font_variant_ligatures,
        font_variant_position,
        font_variant_caps,
        font_variant_numeric,
        font_variant_east_asian,
        font_variation_settings,
        glyph_orientation_vertical,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        isolation,
        letter_spacing,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        mix_blend_mode,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        text_orientation,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        word_spacing,
        writing_mode,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;


        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        private static final Map f32108g1 = new HashMap();

        static {
            for (g gVar : values()) {
                if (gVar == CLASS) {
                    f32108g1.put("class", gVar);
                } else if (gVar != UNSUPPORTED) {
                    f32108g1.put(gVar.name().replace('_', CoreConstants.DASH_CHAR), gVar);
                }
            }
        }

        public static g a(String str) {
            g gVar = (g) f32108g1.get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }
    }

    public enum h {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;

        private static final Map G = new HashMap();

        static {
            for (h hVar : values()) {
                if (hVar == SWITCH) {
                    G.put("switch", hVar);
                } else if (hVar != UNSUPPORTED) {
                    G.put(hVar.name(), hVar);
                }
            }
        }

        public static h a(String str) {
            h hVar = (h) G.get(str);
            return hVar != null ? hVar : UNSUPPORTED;
        }
    }

    public static class i implements Attributes {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final XmlPullParser f32150a;

        public i(XmlPullParser xmlPullParser) {
            this.f32150a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.f32150a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i) {
            return this.f32150a.getAttributeName(i);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i) {
            String attributeName = this.f32150a.getAttributeName(i);
            if (this.f32150a.getAttributePrefix(i) == null) {
                return attributeName;
            }
            return this.f32150a.getAttributePrefix(i) + CoreConstants.COLON_CHAR + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i) {
            return this.f32150a.getAttributeNamespace(i);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i) {
            return this.f32150a.getAttributeValue(i);
        }
    }

    private void A(Attributes attributes) throws nz0 {
        a("<use>", new Object[0]);
        if (this.f32083b == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        lz0.e1 e1Var = new lz0.e1();
        e1Var.f30870a = this.f32082a;
        e1Var.f30871b = this.f32083b;
        a((lz0.l0) e1Var, attributes);
        b(e1Var, attributes);
        a((lz0.o) e1Var, attributes);
        a((lz0.g0) e1Var, attributes);
        a(e1Var, attributes);
        this.f32083b.a(e1Var);
        this.f32083b = e1Var;
    }

    private void B(Attributes attributes) throws nz0 {
        a("<view>", new Object[0]);
        if (this.f32083b == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        lz0.r0 f1Var = new lz0.f1();
        f1Var.f30870a = this.f32082a;
        f1Var.f30871b = this.f32083b;
        a((lz0.l0) f1Var, attributes);
        a((lz0.g0) f1Var, attributes);
        a(f1Var, attributes);
        this.f32083b.a(f1Var);
        this.f32083b = f1Var;
    }

    private void C(Attributes attributes) throws nz0 {
        a("<switch>", new Object[0]);
        if (this.f32083b == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        lz0.s0 s0Var = new lz0.s0();
        s0Var.f30870a = this.f32082a;
        s0Var.f30871b = this.f32083b;
        a((lz0.l0) s0Var, attributes);
        b(s0Var, attributes);
        a((lz0.o) s0Var, attributes);
        a((lz0.g0) s0Var, attributes);
        this.f32083b.a(s0Var);
        this.f32083b = s0Var;
    }

    public static m71.k D(String str) {
        str.getClass();
        switch (str) {
            case "middle":
                return m71.k.Middle;
            case "end":
                return m71.k.End;
            case "start":
                return m71.k.Start;
            default:
                return null;
        }
    }

    public static m71.l E(String str) {
        str.getClass();
        switch (str) {
            case "line-through":
                return m71.l.LineThrough;
            case "underline":
                return m71.l.Underline;
            case "none":
                return m71.l.None;
            case "blink":
                return m71.l.Blink;
            case "overline":
                return m71.l.Overline;
            default:
                return null;
        }
    }

    public static m71.m F(String str) {
        str.getClass();
        if (str.equals("ltr")) {
            return m71.m.LTR;
        }
        if (str.equals("rtl")) {
            return m71.m.RTL;
        }
        return null;
    }

    private Matrix G(String str) throws nz0 {
        Matrix matrix = new Matrix();
        e81 e81Var = new e81(str);
        e81Var.q();
        while (!e81Var.c()) {
            String strH = e81Var.h();
            if (strH == null) {
                throw new nz0("Bad transform function encountered in transform list: " + str);
            }
            switch (strH) {
                case "matrix":
                    e81Var.q();
                    float fG = e81Var.g();
                    e81Var.p();
                    float fG2 = e81Var.g();
                    e81Var.p();
                    float fG3 = e81Var.g();
                    e81Var.p();
                    float fG4 = e81Var.g();
                    e81Var.p();
                    float fG5 = e81Var.g();
                    e81Var.p();
                    float fG6 = e81Var.g();
                    e81Var.q();
                    if (Float.isNaN(fG6) || !e81Var.a(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new nz0("Invalid transform list: " + str);
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fG, fG3, fG5, fG2, fG4, fG6, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    e81Var.q();
                    float fG7 = e81Var.g();
                    float fN = e81Var.n();
                    float fN2 = e81Var.n();
                    e81Var.q();
                    if (Float.isNaN(fG7) || !e81Var.a(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new nz0("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(fN)) {
                        matrix.preRotate(fG7);
                    } else {
                        if (Float.isNaN(fN2)) {
                            throw new nz0("Invalid transform list: " + str);
                        }
                        matrix.preRotate(fG7, fN, fN2);
                    }
                    break;
                    break;
                case "scale":
                    e81Var.q();
                    float fG8 = e81Var.g();
                    float fN3 = e81Var.n();
                    e81Var.q();
                    if (Float.isNaN(fG8) || !e81Var.a(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new nz0("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fN3)) {
                        matrix.preScale(fG8, fN3);
                    } else {
                        matrix.preScale(fG8, fG8);
                    }
                    break;
                    break;
                case "skewX":
                    e81Var.q();
                    float fG9 = e81Var.g();
                    e81Var.q();
                    if (Float.isNaN(fG9) || !e81Var.a(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new nz0("Invalid transform list: " + str);
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fG9)), BitmapDescriptorFactory.HUE_RED);
                    break;
                    break;
                case "skewY":
                    e81Var.q();
                    float fG10 = e81Var.g();
                    e81Var.q();
                    if (Float.isNaN(fG10) || !e81Var.a(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new nz0("Invalid transform list: " + str);
                    }
                    matrix.preSkew(BitmapDescriptorFactory.HUE_RED, (float) Math.tan(Math.toRadians(fG10)));
                    break;
                    break;
                case "translate":
                    e81Var.q();
                    float fG11 = e81Var.g();
                    float fN4 = e81Var.n();
                    e81Var.q();
                    if (Float.isNaN(fG11) || !e81Var.a(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new nz0("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fN4)) {
                        matrix.preTranslate(fG11, fN4);
                    } else {
                        matrix.preTranslate(fG11, BitmapDescriptorFactory.HUE_RED);
                    }
                    break;
                    break;
                default:
                    throw new nz0("Invalid transform list fn: " + strH + ")");
            }
            if (e81Var.c()) {
                return matrix;
            }
            e81Var.p();
        }
        return matrix;
    }

    public static m71.o H(String str) {
        str.getClass();
        if (str.equals("none")) {
            return m71.o.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return m71.o.NonScalingStroke;
        }
        return null;
    }

    private static lz0.c I(String str) throws nz0 {
        e81 e81Var = new e81(str);
        e81Var.q();
        float fG = e81Var.g();
        e81Var.p();
        float fG2 = e81Var.g();
        e81Var.p();
        float fG3 = e81Var.g();
        e81Var.p();
        float fG4 = e81Var.g();
        if (Float.isNaN(fG) || Float.isNaN(fG2) || Float.isNaN(fG3) || Float.isNaN(fG4)) {
            throw new nz0("Invalid viewBox definition - should have four numbers");
        }
        if (fG3 < BitmapDescriptorFactory.HUE_RED) {
            throw new nz0("Invalid viewBox. width cannot be negative");
        }
        if (fG4 >= BitmapDescriptorFactory.HUE_RED) {
            return new lz0.c(fG, fG2, fG3, fG4);
        }
        throw new nz0("Invalid viewBox. height cannot be negative");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(String str) {
        if (this.d) {
            return;
        }
        if (this.f) {
            if (this.f32086h == null) {
                this.f32086h = new StringBuilder(str.length());
            }
            this.f32086h.append(str);
        } else if (this.i) {
            if (this.f32087j == null) {
                this.f32087j = new StringBuilder(str.length());
            }
            this.f32087j.append(str);
        } else if (this.f32083b instanceof lz0.y0) {
            a(str);
        }
    }

    private void h(Attributes attributes) throws nz0 {
        a("<line>", new Object[0]);
        if (this.f32083b == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        lz0.r rVar = new lz0.r();
        rVar.f30870a = this.f32082a;
        rVar.f30871b = this.f32083b;
        a((lz0.l0) rVar, attributes);
        b(rVar, attributes);
        a((lz0.o) rVar, attributes);
        a((lz0.g0) rVar, attributes);
        a(rVar, attributes);
        this.f32083b.a(rVar);
    }

    private void i(Attributes attributes) throws nz0 {
        a("<linearGradient>", new Object[0]);
        if (this.f32083b == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        lz0.m0 m0Var = new lz0.m0();
        m0Var.f30870a = this.f32082a;
        m0Var.f30871b = this.f32083b;
        a((lz0.l0) m0Var, attributes);
        b(m0Var, attributes);
        a((lz0.k) m0Var, attributes);
        a(m0Var, attributes);
        this.f32083b.a(m0Var);
        this.f32083b = m0Var;
    }

    private void j(Attributes attributes) throws nz0 {
        a("<marker>", new Object[0]);
        if (this.f32083b == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        lz0.s sVar = new lz0.s();
        sVar.f30870a = this.f32082a;
        sVar.f30871b = this.f32083b;
        a((lz0.l0) sVar, attributes);
        b(sVar, attributes);
        a((lz0.g0) sVar, attributes);
        a((lz0.r0) sVar, attributes);
        a(sVar, attributes);
        this.f32083b.a(sVar);
        this.f32083b = sVar;
    }

    private void k(Attributes attributes) throws nz0 {
        a("<mask>", new Object[0]);
        if (this.f32083b == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        lz0.t tVar = new lz0.t();
        tVar.f30870a = this.f32082a;
        tVar.f30871b = this.f32083b;
        a((lz0.l0) tVar, attributes);
        b(tVar, attributes);
        a((lz0.g0) tVar, attributes);
        a(tVar, attributes);
        this.f32083b.a(tVar);
        this.f32083b = tVar;
    }

    private void l(Attributes attributes) throws nz0 {
        a("<path>", new Object[0]);
        if (this.f32083b == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        lz0.w wVar = new lz0.w();
        wVar.f30870a = this.f32082a;
        wVar.f30871b = this.f32083b;
        a((lz0.l0) wVar, attributes);
        b(wVar, attributes);
        a((lz0.o) wVar, attributes);
        a((lz0.g0) wVar, attributes);
        a(wVar, attributes);
        this.f32083b.a(wVar);
    }

    private void m(Attributes attributes) throws nz0 {
        a("<pattern>", new Object[0]);
        if (this.f32083b == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        lz0.z zVar = new lz0.z();
        zVar.f30870a = this.f32082a;
        zVar.f30871b = this.f32083b;
        a((lz0.l0) zVar, attributes);
        b(zVar, attributes);
        a((lz0.g0) zVar, attributes);
        a((lz0.r0) zVar, attributes);
        a(zVar, attributes);
        this.f32083b.a(zVar);
        this.f32083b = zVar;
    }

    private void n(Attributes attributes) throws nz0 {
        a("<polygon>", new Object[0]);
        if (this.f32083b == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        lz0.a0 b0Var = new lz0.b0();
        b0Var.f30870a = this.f32082a;
        b0Var.f30871b = this.f32083b;
        a((lz0.l0) b0Var, attributes);
        b(b0Var, attributes);
        a((lz0.o) b0Var, attributes);
        a((lz0.g0) b0Var, attributes);
        a(b0Var, attributes, "polygon");
        this.f32083b.a(b0Var);
    }

    private void o(Attributes attributes) throws nz0 {
        a("<polyline>", new Object[0]);
        if (this.f32083b == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        lz0.a0 a0Var = new lz0.a0();
        a0Var.f30870a = this.f32082a;
        a0Var.f30871b = this.f32083b;
        a((lz0.l0) a0Var, attributes);
        b(a0Var, attributes);
        a((lz0.o) a0Var, attributes);
        a((lz0.g0) a0Var, attributes);
        a(a0Var, attributes, "polyline");
        this.f32083b.a(a0Var);
    }

    private void p(Attributes attributes) throws nz0 {
        a("<radialGradient>", new Object[0]);
        if (this.f32083b == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        lz0.q0 q0Var = new lz0.q0();
        q0Var.f30870a = this.f32082a;
        q0Var.f30871b = this.f32083b;
        a((lz0.l0) q0Var, attributes);
        b(q0Var, attributes);
        a((lz0.k) q0Var, attributes);
        a(q0Var, attributes);
        this.f32083b.a(q0Var);
        this.f32083b = q0Var;
    }

    private void q(Attributes attributes) throws nz0 {
        a("<rect>", new Object[0]);
        if (this.f32083b == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        lz0.c0 c0Var = new lz0.c0();
        c0Var.f30870a = this.f32082a;
        c0Var.f30871b = this.f32083b;
        a((lz0.l0) c0Var, attributes);
        b(c0Var, attributes);
        a((lz0.o) c0Var, attributes);
        a((lz0.g0) c0Var, attributes);
        a(c0Var, attributes);
        this.f32083b.a(c0Var);
    }

    private void r(Attributes attributes) throws nz0 {
        a("<solidColor>", new Object[0]);
        if (this.f32083b == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        lz0.d0 d0Var = new lz0.d0();
        d0Var.f30870a = this.f32082a;
        d0Var.f30871b = this.f32083b;
        a(d0Var, attributes);
        b(d0Var, attributes);
        this.f32083b.a(d0Var);
        this.f32083b = d0Var;
    }

    private void s(Attributes attributes) throws nz0 {
        a("<stop>", new Object[0]);
        lz0.j0 j0Var = this.f32083b;
        if (j0Var == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        if (!(j0Var instanceof lz0.k)) {
            throw new nz0("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        lz0.e0 e0Var = new lz0.e0();
        e0Var.f30870a = this.f32082a;
        e0Var.f30871b = this.f32083b;
        a((lz0.l0) e0Var, attributes);
        b(e0Var, attributes);
        a(e0Var, attributes);
        this.f32083b.a(e0Var);
        this.f32083b = e0Var;
    }

    public static Boolean t(String str) {
        str.getClass();
        switch (str) {
            case "hidden":
            case "scroll":
                return Boolean.FALSE;
            case "auto":
            case "visible":
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    private void u(Attributes attributes) throws nz0 {
        a("<svg>", new Object[0]);
        lz0.f0 f0Var = new lz0.f0();
        f0Var.f30870a = this.f32082a;
        f0Var.f30871b = this.f32083b;
        a((lz0.l0) f0Var, attributes);
        b(f0Var, attributes);
        a((lz0.g0) f0Var, attributes);
        a((lz0.r0) f0Var, attributes);
        a(f0Var, attributes);
        lz0.j0 j0Var = this.f32083b;
        if (j0Var == null) {
            this.f32082a.a(f0Var);
        } else {
            j0Var.a(f0Var);
        }
        this.f32083b = f0Var;
    }

    private void v(Attributes attributes) throws nz0 {
        a("<symbol>", new Object[0]);
        if (this.f32083b == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        lz0.r0 t0Var = new lz0.t0();
        t0Var.f30870a = this.f32082a;
        t0Var.f30871b = this.f32083b;
        a((lz0.l0) t0Var, attributes);
        b(t0Var, attributes);
        a((lz0.g0) t0Var, attributes);
        a(t0Var, attributes);
        this.f32083b.a(t0Var);
        this.f32083b = t0Var;
    }

    private void w(Attributes attributes) throws nz0 {
        a("<text>", new Object[0]);
        if (this.f32083b == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        lz0.w0 w0Var = new lz0.w0();
        w0Var.f30870a = this.f32082a;
        w0Var.f30871b = this.f32083b;
        a((lz0.l0) w0Var, attributes);
        b(w0Var, attributes);
        a((lz0.o) w0Var, attributes);
        a((lz0.g0) w0Var, attributes);
        a((lz0.a1) w0Var, attributes);
        this.f32083b.a(w0Var);
        this.f32083b = w0Var;
    }

    private void x(Attributes attributes) throws nz0 {
        a("<textPath>", new Object[0]);
        if (this.f32083b == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        lz0.z0 z0Var = new lz0.z0();
        z0Var.f30870a = this.f32082a;
        z0Var.f30871b = this.f32083b;
        a((lz0.l0) z0Var, attributes);
        b(z0Var, attributes);
        a((lz0.g0) z0Var, attributes);
        a(z0Var, attributes);
        this.f32083b.a(z0Var);
        this.f32083b = z0Var;
        lz0.j0 j0Var = z0Var.f30871b;
        if (j0Var instanceof lz0.b1) {
            z0Var.a((lz0.b1) j0Var);
        } else {
            z0Var.a(((lz0.x0) j0Var).c());
        }
    }

    private void y(Attributes attributes) throws nz0 {
        a("<tref>", new Object[0]);
        lz0.j0 j0Var = this.f32083b;
        if (j0Var == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        if (!(j0Var instanceof lz0.y0)) {
            throw new nz0("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        lz0.u0 u0Var = new lz0.u0();
        u0Var.f30870a = this.f32082a;
        u0Var.f30871b = this.f32083b;
        a((lz0.l0) u0Var, attributes);
        b(u0Var, attributes);
        a((lz0.g0) u0Var, attributes);
        a(u0Var, attributes);
        this.f32083b.a(u0Var);
        lz0.j0 j0Var2 = u0Var.f30871b;
        if (j0Var2 instanceof lz0.b1) {
            u0Var.a((lz0.b1) j0Var2);
        } else {
            u0Var.a(((lz0.x0) j0Var2).c());
        }
    }

    private void z(Attributes attributes) throws nz0 {
        a("<tspan>", new Object[0]);
        lz0.j0 j0Var = this.f32083b;
        if (j0Var == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        if (!(j0Var instanceof lz0.y0)) {
            throw new nz0("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        lz0.v0 v0Var = new lz0.v0();
        v0Var.f30870a = this.f32082a;
        v0Var.f30871b = this.f32083b;
        a((lz0.l0) v0Var, attributes);
        b(v0Var, attributes);
        a((lz0.g0) v0Var, attributes);
        a((lz0.a1) v0Var, attributes);
        this.f32083b.a(v0Var);
        this.f32083b = v0Var;
        lz0.j0 j0Var2 = v0Var.f30871b;
        if (j0Var2 instanceof lz0.b1) {
            v0Var.a((lz0.b1) j0Var2);
        } else {
            v0Var.a(((lz0.x0) j0Var2).c());
        }
    }

    private static float b(float f4, float f5, float f6) {
        float f32;
        if (f6 < BitmapDescriptorFactory.HUE_RED) {
            f6 += 6.0f;
        }
        if (f6 >= 6.0f) {
            f6 -= 6.0f;
        }
        if (f6 < 1.0f) {
            f32 = (f5 - f4) * f6;
        } else {
            if (f6 < 3.0f) {
                return f5;
            }
            if (f6 >= 4.0f) {
                return f4;
            }
            f32 = (f5 - f4) * (4.0f - f6);
        }
        return f32 + f4;
    }

    private void c(InputStream inputStream) throws nz0 {
        try {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            i iVar = new i(xmlPullParserNewPullParser);
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            xmlPullParserNewPullParser.setInput(inputStream, null);
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                if (eventType == 0) {
                    b();
                } else if (eventType == 8) {
                    e81 e81Var = new e81(xmlPullParserNewPullParser.getText());
                    a(e81Var.k(), b(e81Var));
                } else if (eventType == 2) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (xmlPullParserNewPullParser.getPrefix() != null) {
                        name = xmlPullParserNewPullParser.getPrefix() + CoreConstants.COLON_CHAR + name;
                    }
                    a(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, iVar);
                } else if (eventType == 3) {
                    String name2 = xmlPullParserNewPullParser.getName();
                    if (xmlPullParserNewPullParser.getPrefix() != null) {
                        name2 = xmlPullParserNewPullParser.getPrefix() + CoreConstants.COLON_CHAR + name2;
                    }
                    a(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                } else if (eventType == 4) {
                    int[] iArr = new int[2];
                    a(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                } else if (eventType == 5) {
                    J(xmlPullParserNewPullParser.getText());
                } else if (eventType == 6) {
                    J(xmlPullParserNewPullParser.getText());
                }
            }
            a();
        } catch (IOException e2) {
            throw new nz0("Stream error", e2);
        } catch (XmlPullParserException e4) {
            throw new nz0("XML parser problem", e4);
        }
    }

    private void d(Attributes attributes) throws nz0 {
        a("<defs>", new Object[0]);
        if (this.f32083b == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        lz0.i iVar = new lz0.i();
        iVar.f30870a = this.f32082a;
        iVar.f30871b = this.f32083b;
        a((lz0.l0) iVar, attributes);
        b(iVar, attributes);
        a((lz0.o) iVar, attributes);
        this.f32083b.a(iVar);
        this.f32083b = iVar;
    }

    private void e(Attributes attributes) throws nz0 {
        a("<ellipse>", new Object[0]);
        if (this.f32083b == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        lz0.j jVar = new lz0.j();
        jVar.f30870a = this.f32082a;
        jVar.f30871b = this.f32083b;
        a((lz0.l0) jVar, attributes);
        b(jVar, attributes);
        a((lz0.o) jVar, attributes);
        a((lz0.g0) jVar, attributes);
        a(jVar, attributes);
        this.f32083b.a(jVar);
    }

    private void f(Attributes attributes) throws nz0 {
        a("<g>", new Object[0]);
        if (this.f32083b == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        lz0.n nVar = new lz0.n();
        nVar.f30870a = this.f32082a;
        nVar.f30871b = this.f32083b;
        a((lz0.l0) nVar, attributes);
        b(nVar, attributes);
        a((lz0.o) nVar, attributes);
        a((lz0.g0) nVar, attributes);
        this.f32083b.a(nVar);
        this.f32083b = nVar;
    }

    private void g(Attributes attributes) throws nz0 {
        a("<image>", new Object[0]);
        if (this.f32083b == null) {
            throw new nz0("Invalid document. Root element must be <svg>");
        }
        lz0.p pVar = new lz0.p();
        pVar.f30870a = this.f32082a;
        pVar.f30871b = this.f32083b;
        a((lz0.l0) pVar, attributes);
        b(pVar, attributes);
        a((lz0.o) pVar, attributes);
        a((lz0.g0) pVar, attributes);
        a(pVar, attributes);
        this.f32083b.a(pVar);
        this.f32083b = pVar;
    }

    @Override // com.fourthline.orca.internal.oz0
    public oz0 a(mz0 mz0Var) {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
    }

    private void b(InputStream inputStream) throws nz0 {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            int i2 = 0;
            if (!k) {
                sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
                sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            }
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            f fVar = new f(this, i2);
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e2) {
            throw new nz0("Stream error", e2);
        } catch (ParserConfigurationException e4) {
            throw new nz0("XML parser problem", e4);
        } catch (SAXException e5) {
            throw new nz0("SVG parse error", e5);
        }
    }

    private void a(String str, Object... objArr) {
    }

    private void t(Attributes attributes) throws nz0 {
        a("<style>", new Object[0]);
        if (this.f32083b != null) {
            String str = "all";
            boolean zEquals = true;
            for (int i2 = 0; i2 < attributes.getLength(); i2++) {
                String strTrim = attributes.getValue(i2).trim();
                int i3 = a.f32089b[g.a(attributes.getLocalName(i2)).ordinal()];
                if (i3 == 49) {
                    zEquals = strTrim.equals("text/css");
                } else if (i3 == 50) {
                    str = strTrim;
                }
            }
            if (zEquals && e9.a(str, e9.e.screen)) {
                this.i = true;
                return;
            } else {
                this.d = true;
                this.e = 1;
                return;
            }
        }
        throw new nz0("Invalid document. Root element must be <svg>");
    }

    @Override // com.fourthline.orca.internal.oz0
    public lz0 a(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i2 = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i2 == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            try {
                if (k) {
                    a("Forcing SAX parser for this version of Android", new Object[0]);
                    b(inputStream);
                    return this.f32082a;
                }
                if (this.f32084c) {
                    inputStream.mark(4096);
                    byte[] bArr = new byte[4096];
                    String str = new String(bArr, 0, inputStream.read(bArr));
                    inputStream.reset();
                    if (str.contains("<!ENTITY ")) {
                        a("Switching to SAX parser to process entities", new Object[0]);
                        b(inputStream);
                        lz0 lz0Var = this.f32082a;
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                        return lz0Var;
                    }
                }
                c(inputStream);
                lz0 lz0Var2 = this.f32082a;
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
                return lz0Var2;
            } finally {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
        } catch (IOException unused5) {
            c(inputStream);
            lz0 lz0Var3 = this.f32082a;
            try {
                inputStream.close();
            } catch (IOException unused6) {
            }
            return lz0Var3;
        }
    }

    public static lz0.q r(String str) {
        if ("normal".equals(str)) {
            return lz0.q.f30877c;
        }
        try {
            lz0.q qVarP = p(str);
            if (qVarP.f30879b == lz0.d1.percent) {
                return null;
            }
            return qVarP;
        } catch (nz0 unused) {
            return null;
        }
    }

    public static m71.i B(String str) {
        if ("miter".equals(str)) {
            return m71.i.Miter;
        }
        if ("round".equals(str)) {
            return m71.i.Round;
        }
        if ("bevel".equals(str)) {
            return m71.i.Bevel;
        }
        return null;
    }

    private static Set C(String str) {
        e81 e81Var = new e81(str);
        HashSet hashSet = new HashSet();
        while (!e81Var.c()) {
            String strK = e81Var.k();
            int iIndexOf = strK.indexOf(45);
            if (iIndexOf != -1) {
                strK = strK.substring(0, iIndexOf);
            }
            hashSet.add(new Locale(strK, "", "").getLanguage());
            e81Var.q();
        }
        return hashSet;
    }

    public static lz0.g d(String str) {
        if (str.charAt(0) == '#') {
            d30 d30VarA = d30.a(str, 1, str.length());
            if (d30VarA == null) {
                return lz0.g.f30843b;
            }
            int iA = d30VarA.a();
            if (iA == 4) {
                int iB = d30VarA.b();
                int i2 = iB & 3840;
                int i3 = iB & 240;
                int i5 = iB & 15;
                return new lz0.g(i5 | (i2 << 8) | (-16777216) | (i2 << 12) | (i3 << 8) | (i3 << 4) | (i5 << 4));
            }
            if (iA != 5) {
                if (iA == 7) {
                    return new lz0.g(d30VarA.b() | (-16777216));
                }
                if (iA != 9) {
                    return lz0.g.f30843b;
                }
                return new lz0.g((d30VarA.b() >>> 8) | (d30VarA.b() << 24));
            }
            int iB2 = d30VarA.b();
            int i6 = 61440 & iB2;
            int i21 = iB2 & 3840;
            int i22 = iB2 & 240;
            int i32 = iB2 & 15;
            return new lz0.g((i32 << 24) | (i32 << 28) | (i6 << 8) | (i6 << 4) | (i21 << 4) | i21 | i22 | (i22 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        float fG = Float.NaN;
        if (!zStartsWith && !lowerCase.startsWith("rgb(")) {
            boolean zStartsWith2 = lowerCase.startsWith("hsla(");
            if (zStartsWith2 || lowerCase.startsWith("hsl(")) {
                e81 e81Var = new e81(str.substring(zStartsWith2 ? 5 : 4));
                e81Var.q();
                float fG2 = e81Var.g();
                if (!Float.isNaN(fG2)) {
                    e81Var.a("deg");
                    boolean zP = e81Var.p();
                    float fG3 = e81Var.g();
                    if (!Float.isNaN(fG3)) {
                        if (!e81Var.a(CoreConstants.PERCENT_CHAR)) {
                            return lz0.g.f30843b;
                        }
                        if (zP) {
                            if (!e81Var.p()) {
                                return lz0.g.f30843b;
                            }
                        } else {
                            e81Var.q();
                        }
                        float fG4 = e81Var.g();
                        if (!Float.isNaN(fG4)) {
                            if (!e81Var.a(CoreConstants.PERCENT_CHAR)) {
                                return lz0.g.f30843b;
                            }
                            if (zP) {
                                if (e81Var.p()) {
                                    fG = e81Var.g();
                                }
                            } else {
                                e81Var.q();
                                if (e81Var.a('/')) {
                                    e81Var.q();
                                    fG = e81Var.g();
                                }
                            }
                            e81Var.q();
                            if (!e81Var.a(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                                return lz0.g.f30843b;
                            }
                            if (Float.isNaN(fG)) {
                                return new lz0.g(a(fG2, fG3, fG4) | (-16777216));
                            }
                            return new lz0.g(a(fG2, fG3, fG4) | (a(fG * 256.0f) << 24));
                        }
                    }
                }
            }
        } else {
            e81 e81Var2 = new e81(str.substring(zStartsWith ? 5 : 4));
            e81Var2.q();
            float fG5 = e81Var2.g();
            if (!Float.isNaN(fG5)) {
                if (e81Var2.a(CoreConstants.PERCENT_CHAR)) {
                    fG5 = (fG5 * 256.0f) / 100.0f;
                }
                boolean zP2 = e81Var2.p();
                float fG6 = e81Var2.g();
                if (!Float.isNaN(fG6)) {
                    if (e81Var2.a(CoreConstants.PERCENT_CHAR)) {
                        fG6 = (fG6 * 256.0f) / 100.0f;
                    }
                    if (zP2) {
                        if (!e81Var2.p()) {
                            return lz0.g.f30843b;
                        }
                    } else {
                        e81Var2.q();
                    }
                    float fG7 = e81Var2.g();
                    if (!Float.isNaN(fG7)) {
                        if (e81Var2.a(CoreConstants.PERCENT_CHAR)) {
                            fG7 = (fG7 * 256.0f) / 100.0f;
                        }
                        if (zP2) {
                            if (e81Var2.p()) {
                                fG = e81Var2.g();
                            }
                        } else {
                            e81Var2.q();
                            if (e81Var2.a('/')) {
                                e81Var2.q();
                                fG = e81Var2.g();
                            }
                        }
                        e81Var2.q();
                        if (!e81Var2.a(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                            return lz0.g.f30843b;
                        }
                        if (Float.isNaN(fG)) {
                            return new lz0.g((a(fG5) << 16) | (-16777216) | (a(fG6) << 8) | a(fG7));
                        }
                        return new lz0.g((a(fG5) << 16) | (a(fG * 256.0f) << 24) | (a(fG6) << 8) | a(fG7));
                    }
                }
            }
        }
        return e(lowerCase);
    }

    public static float h(String str) throws nz0 {
        int length = str.length();
        if (length != 0) {
            return a(str, 0, length);
        }
        throw new nz0("Invalid float value (empty string)");
    }

    public static List i(String str) {
        e81 e81Var = new e81(str);
        ArrayList arrayList = null;
        do {
            String strJ = e81Var.j();
            if (strJ == null) {
                strJ = e81Var.c(CoreConstants.COMMA_CHAR);
            }
            if (strJ == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strJ);
            e81Var.p();
        } while (!e81Var.c());
        return arrayList;
    }

    public static Float k(String str) {
        Float fB = d.b(str);
        if (fB != null) {
            return fB;
        }
        e81 e81Var = new e81(str);
        float fG = e81Var.g();
        Float fValueOf = Float.valueOf(fG);
        if (!e81Var.a(CoreConstants.PERCENT_CHAR)) {
            return null;
        }
        e81Var.q();
        if (e81Var.c() && fG >= BitmapDescriptorFactory.HUE_RED) {
            return fValueOf;
        }
        return null;
    }

    public static m71.e l(String str) {
        str.getClass();
        switch (str) {
            case "oblique":
                return m71.e.oblique;
            case "italic":
                return m71.e.italic;
            case "normal":
                return m71.e.normal;
            default:
                return null;
        }
    }

    private Float n(String str) throws nz0 {
        if (str.length() != 0) {
            int length = str.length();
            boolean z = true;
            if (str.charAt(str.length() - 1) == '%') {
                length--;
            } else {
                z = false;
            }
            try {
                float fA = a(str, 0, length);
                float f4 = 100.0f;
                if (z) {
                    fA /= 100.0f;
                }
                if (fA < BitmapDescriptorFactory.HUE_RED) {
                    f4 = 0.0f;
                } else if (fA <= 100.0f) {
                    f4 = fA;
                }
                return Float.valueOf(f4);
            } catch (NumberFormatException e2) {
                throw new nz0("Invalid offset value in <stop>: ".concat(str), e2);
            }
        }
        throw new nz0("Invalid offset value in <stop> (empty string)");
    }

    public static m71.g o(String str) {
        str.getClass();
        if (str.equals("auto")) {
            return m71.g.auto;
        }
        if (str.equals("isolate")) {
            return m71.g.isolate;
        }
        return null;
    }

    public static lz0.q p(String str) throws nz0 {
        if (str.length() != 0) {
            int length = str.length();
            lz0.d1 d1VarValueOf = lz0.d1.px;
            char cCharAt = str.charAt(length - 1);
            if (cCharAt == '%') {
                length--;
                d1VarValueOf = lz0.d1.percent;
            } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
                length -= 2;
                try {
                    d1VarValueOf = lz0.d1.valueOf(str.substring(length).toLowerCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                    throw new nz0("Invalid length unit specifier: ".concat(str));
                }
            }
            try {
                return new lz0.q(a(str, 0, length), d1VarValueOf);
            } catch (NumberFormatException e2) {
                throw new nz0("Invalid length value: ".concat(str), e2);
            }
        }
        throw new nz0("Invalid length value (empty string)");
    }

    private static List q(String str) throws nz0 {
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList(1);
            e81 e81Var = new e81(str);
            e81Var.q();
            while (!e81Var.c()) {
                float fG = e81Var.g();
                if (!Float.isNaN(fG)) {
                    lz0.d1 d1VarL = e81Var.l();
                    if (d1VarL == null) {
                        d1VarL = lz0.d1.px;
                    }
                    arrayList.add(new lz0.q(fG, d1VarL));
                    e81Var.p();
                } else {
                    throw new nz0("Invalid length list value: " + e81Var.b());
                }
            }
            return arrayList;
        }
        throw new nz0("Invalid length list (empty string)");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0035. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fourthline.orca.internal.lz0.x v(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.pz0.v(java.lang.String):com.fourthline.orca.internal.lz0$x");
    }

    public static m71.h A(String str) {
        if ("butt".equals(str)) {
            return m71.h.Butt;
        }
        if ("round".equals(str)) {
            return m71.h.Round;
        }
        if ("square".equals(str)) {
            return m71.h.Square;
        }
        return null;
    }

    private static lz0.g e(String str) {
        Integer numA = b.a(str);
        return numA == null ? lz0.g.f30843b : new lz0.g(numA.intValue());
    }

    private static lz0.o0 f(String str) {
        str.getClass();
        if (str.equals("none")) {
            return lz0.g.f30844c;
        }
        if (!str.equals("currentColor")) {
            return d(str);
        }
        return lz0.h.a();
    }

    public static lz0.q j(String str) {
        try {
            lz0.q qVarA = c.a(str);
            return qVarA == null ? p(str) : qVarA;
        } catch (nz0 unused) {
            return null;
        }
    }

    public static Float m(String str) {
        Float fB = e.b(str);
        if (fB != null) {
            return fB;
        }
        e81 e81Var = new e81(str);
        float fG = e81Var.g();
        Float fValueOf = Float.valueOf(fG);
        e81Var.q();
        if (e81Var.c() && fG >= 1.0f && fG <= 1000.0f) {
            return fValueOf;
        }
        return null;
    }

    public static Float s(String str) {
        try {
            float fH = h(str);
            float fMin = BitmapDescriptorFactory.HUE_RED;
            if (fH >= BitmapDescriptorFactory.HUE_RED) {
                fMin = Math.min(fH, 1.0f);
            }
            return Float.valueOf(fMin);
        } catch (nz0 unused) {
            return null;
        }
    }

    public static lz0.o0 u(String str) {
        if (str.startsWith("url(")) {
            int iIndexOf = str.indexOf(")");
            if (iIndexOf != -1) {
                String strTrim = str.substring(4, iIndexOf).trim();
                String strTrim2 = str.substring(iIndexOf + 1).trim();
                return new lz0.v(strTrim, strTrim2.length() > 0 ? f(strTrim2) : null);
            }
            return new lz0.v(str.substring(4).trim(), null);
        }
        return f(str);
    }

    public static m71.j w(String str) {
        str.getClass();
        switch (str) {
            case "optimizeQuality":
                return m71.j.optimizeQuality;
            case "auto":
                return m71.j.auto;
            case "optimizeSpeed":
                return m71.j.optimizeSpeed;
            default:
                return null;
        }
    }

    public static m71.c g(String str) {
        if ("nonzero".equals(str)) {
            return m71.c.NonZero;
        }
        if ("evenodd".equals(str)) {
            return m71.c.EvenOdd;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f32082a = new lz0(this.f32084c, null);
    }

    private static Set x(String str) {
        e81 e81Var = new e81(str);
        HashSet hashSet = new HashSet();
        while (!e81Var.c()) {
            String strK = e81Var.k();
            if (strK.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(strK.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            e81Var.q();
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map b(e81 e81Var) {
        HashMap map = new HashMap();
        e81Var.q();
        String strB = e81Var.b('=');
        while (strB != null) {
            e81Var.a('=');
            map.put(strB, e81Var.j());
            e81Var.q();
            strB = e81Var.b('=');
        }
        return map;
    }

    private static Set y(String str) {
        e81 e81Var = new e81(str);
        HashSet hashSet = new HashSet();
        while (!e81Var.c()) {
            hashSet.add(e81Var.k());
            e81Var.q();
        }
        return hashSet;
    }

    public static lz0.q[] z(String str) {
        lz0.q qVarI;
        e81 e81Var = new e81(str);
        e81Var.q();
        if (e81Var.c() || (qVarI = e81Var.i()) == null || qVarI.b()) {
            return null;
        }
        float fA = qVarI.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(qVarI);
        while (!e81Var.c()) {
            e81Var.p();
            lz0.q qVarI2 = e81Var.i();
            if (qVarI2 == null || qVarI2.b()) {
                return null;
            }
            arrayList.add(qVarI2);
            fA += qVarI2.a();
        }
        if (fA == BitmapDescriptorFactory.HUE_RED) {
            return null;
        }
        return (lz0.q[]) arrayList.toArray(new lz0.q[0]);
    }

    private void b(Attributes attributes) throws nz0 {
        a("<circle>", new Object[0]);
        if (this.f32083b != null) {
            lz0.e eVar = new lz0.e();
            eVar.f30870a = this.f32082a;
            eVar.f30871b = this.f32083b;
            a((lz0.l0) eVar, attributes);
            b(eVar, attributes);
            a((lz0.o) eVar, attributes);
            a((lz0.g0) eVar, attributes);
            a(eVar, attributes);
            this.f32083b.a(eVar);
            return;
        }
        throw new nz0("Invalid document. Root element must be <svg>");
    }

    private void c(Attributes attributes) throws nz0 {
        a("<clipPath>", new Object[0]);
        if (this.f32083b != null) {
            lz0.f fVar = new lz0.f();
            fVar.f30870a = this.f32082a;
            fVar.f30871b = this.f32083b;
            a((lz0.l0) fVar, attributes);
            b(fVar, attributes);
            a((lz0.o) fVar, attributes);
            a((lz0.g0) fVar, attributes);
            a(fVar, attributes);
            this.f32083b.a(fVar);
            this.f32083b = fVar;
            return;
        }
        throw new nz0("Invalid document. Root element must be <svg>");
    }

    public oz0 a(boolean z) {
        this.f32084c = z;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3, Attributes attributes) throws nz0 {
        if (this.d) {
            this.e++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            h hVarA = h.a(str2);
            switch (a.f32088a[hVarA.ordinal()]) {
                case 1:
                    u(attributes);
                    break;
                case 2:
                    f(attributes);
                    break;
                case 3:
                    d(attributes);
                    break;
                case 4:
                    a(attributes);
                    break;
                case 5:
                    A(attributes);
                    break;
                case 6:
                    l(attributes);
                    break;
                case 7:
                    q(attributes);
                    break;
                case 8:
                    b(attributes);
                    break;
                case 9:
                    e(attributes);
                    break;
                case 10:
                    h(attributes);
                    break;
                case 11:
                    o(attributes);
                    break;
                case 12:
                    n(attributes);
                    break;
                case 13:
                    w(attributes);
                    break;
                case 14:
                    z(attributes);
                    break;
                case 15:
                    y(attributes);
                    break;
                case 16:
                    C(attributes);
                    break;
                case 17:
                    v(attributes);
                    break;
                case 18:
                    j(attributes);
                    break;
                case 19:
                    i(attributes);
                    break;
                case 20:
                    p(attributes);
                    break;
                case 21:
                    s(attributes);
                    break;
                case 22:
                case 23:
                    this.f = true;
                    this.f32085g = hVarA;
                    break;
                case 24:
                    c(attributes);
                    break;
                case 25:
                    x(attributes);
                    break;
                case 26:
                    m(attributes);
                    break;
                case 27:
                    g(attributes);
                    break;
                case 28:
                    B(attributes);
                    break;
                case 29:
                    k(attributes);
                    break;
                case 30:
                    t(attributes);
                    break;
                case 31:
                    r(attributes);
                    break;
                default:
                    this.d = true;
                    this.e = 1;
                    break;
            }
        }
    }

    private void b(lz0.l0 l0Var, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            if (strTrim.length() != 0) {
                int i3 = a.f32089b[g.a(attributes.getLocalName(i2)).ordinal()];
                if (i3 == 46) {
                    a(l0Var, strTrim);
                } else if (i3 != 47) {
                    if (l0Var.e == null) {
                        l0Var.e = new m71();
                    }
                    m71.a(l0Var.e, attributes.getLocalName(i2), attributes.getValue(i2).trim(), true);
                } else {
                    l0Var.f30865g = e9.b(strTrim);
                }
            }
        }
    }

    public static lz0.d c(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        e81 e81Var = new e81(str.substring(5));
        e81Var.q();
        lz0.q qVarA = a(e81Var);
        e81Var.p();
        lz0.q qVarA2 = a(e81Var);
        e81Var.p();
        lz0.q qVarA3 = a(e81Var);
        e81Var.p();
        lz0.q qVarA4 = a(e81Var);
        e81Var.q();
        if (e81Var.a(CoreConstants.RIGHT_PARENTHESIS_CHAR) || e81Var.c()) {
            return new lz0.d(qVarA, qVarA2, qVarA3, qVarA4);
        }
        return null;
    }

    private void b(String str) {
        this.f32082a.a(new e9(e9.e.screen, e9.t.Document, null).a(str));
    }

    private void a(char[] cArr, int i2, int i3) {
        if (this.d) {
            return;
        }
        if (this.f) {
            if (this.f32086h == null) {
                this.f32086h = new StringBuilder(i3);
            }
            this.f32086h.append(cArr, i2, i3);
        } else if (this.i) {
            if (this.f32087j == null) {
                this.f32087j = new StringBuilder(i3);
            }
            this.f32087j.append(cArr, i2, i3);
        } else if (this.f32083b instanceof lz0.y0) {
            a(new String(cArr, i2, i3));
        }
    }

    private void a(String str) {
        lz0.h0 h0Var = (lz0.h0) this.f32083b;
        int size = h0Var.getChildren().size();
        lz0.n0 n0Var = size == 0 ? null : (lz0.n0) h0Var.getChildren().get(size - 1);
        if (n0Var instanceof lz0.c1) {
            StringBuilder sb6 = new StringBuilder();
            lz0.c1 c1Var = (lz0.c1) n0Var;
            sb6.append(c1Var.f30820c);
            sb6.append(str);
            c1Var.f30820c = sb6.toString();
            return;
        }
        this.f32083b.a(new lz0.c1(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3) throws nz0 {
        if (this.d) {
            int i2 = this.e - 1;
            this.e = i2;
            if (i2 == 0) {
                this.d = false;
                return;
            }
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i3 = a.f32088a[h.a(str2).ordinal()];
            if (i3 != 13 && i3 != 14 && i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4 && i3 != 5) {
                switch (i3) {
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 31:
                        break;
                    case 22:
                    case 23:
                        this.f = false;
                        StringBuilder sb6 = this.f32086h;
                        if (sb6 != null) {
                            h hVar = this.f32085g;
                            if (hVar == h.title) {
                                this.f32082a.e(sb6.toString());
                            } else if (hVar == h.desc) {
                                this.f32082a.d(sb6.toString());
                            }
                            this.f32086h.setLength(0);
                            return;
                        }
                        return;
                    case 30:
                        StringBuilder sb9 = this.f32087j;
                        if (sb9 != null) {
                            this.i = false;
                            b(sb9.toString());
                            this.f32087j.setLength(0);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
            Object obj2 = this.f32083b;
            if (obj2 != null) {
                this.f32083b = ((lz0.n0) obj2).f30871b;
                return;
            }
            throw new nz0("Unbalanced end element </" + str2 + "> found");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Map map) {
        str.equals("xml-stylesheet");
    }

    private void a(lz0.f0 f0Var, Attributes attributes) throws nz0 {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int i3 = a.f32089b[g.a(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 1) {
                f0Var.f30839q = p(strTrim);
            } else if (i3 == 2) {
                f0Var.f30840r = p(strTrim);
            } else if (i3 == 3) {
                lz0.q qVarP = p(strTrim);
                f0Var.f30841s = qVarP;
                if (qVarP.b()) {
                    throw new nz0("Invalid <svg> element. width cannot be negative");
                }
            } else if (i3 == 4) {
                lz0.q qVarP2 = p(strTrim);
                f0Var.f30842t = qVarP2;
                if (qVarP2.b()) {
                    throw new nz0("Invalid <svg> element. height cannot be negative");
                }
            } else if (i3 == 5) {
                f0Var.u = strTrim;
            }
        }
    }

    private void a(Attributes attributes) throws nz0 {
        a("<a>", new Object[0]);
        if (this.f32083b != null) {
            lz0.b bVar = new lz0.b();
            bVar.f30870a = this.f32082a;
            bVar.f30871b = this.f32083b;
            a((lz0.l0) bVar, attributes);
            b(bVar, attributes);
            a((lz0.o) bVar, attributes);
            a((lz0.g0) bVar, attributes);
            a(bVar, attributes);
            this.f32083b.a(bVar);
            this.f32083b = bVar;
            return;
        }
        throw new nz0("Invalid document. Root element must be <svg>");
    }

    private void a(lz0.b bVar, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            if (a.f32089b[g.a(attributes.getLocalName(i2)).ordinal()] == 6 && ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2)))) {
                bVar.f30811p = strTrim;
            }
        }
    }

    private void a(lz0.e1 e1Var, Attributes attributes) throws nz0 {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int i3 = a.f32089b[g.a(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 1) {
                e1Var.f30834q = p(strTrim);
            } else if (i3 == 2) {
                e1Var.f30835r = p(strTrim);
            } else if (i3 == 3) {
                lz0.q qVarP = p(strTrim);
                e1Var.f30836s = qVarP;
                if (qVarP.b()) {
                    throw new nz0("Invalid <use> element. width cannot be negative");
                }
            } else if (i3 != 4) {
                if (i3 == 6 && ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2)))) {
                    e1Var.f30833p = strTrim;
                }
            } else {
                lz0.q qVarP2 = p(strTrim);
                e1Var.f30837t = qVarP2;
                if (qVarP2.b()) {
                    throw new nz0("Invalid <use> element. height cannot be negative");
                }
            }
        }
    }

    private void a(lz0.p pVar, Attributes attributes) throws nz0 {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int i3 = a.f32089b[g.a(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 1) {
                pVar.f30873q = p(strTrim);
            } else if (i3 == 2) {
                pVar.f30874r = p(strTrim);
            } else if (i3 == 3) {
                lz0.q qVarP = p(strTrim);
                pVar.f30875s = qVarP;
                if (qVarP.b()) {
                    throw new nz0("Invalid <use> element. width cannot be negative");
                }
            } else if (i3 == 4) {
                lz0.q qVarP2 = p(strTrim);
                pVar.f30876t = qVarP2;
                if (qVarP2.b()) {
                    throw new nz0("Invalid <use> element. height cannot be negative");
                }
            } else if (i3 != 6) {
                if (i3 == 7) {
                    a((lz0.p0) pVar, strTrim);
                }
            } else if ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                pVar.f30872p = strTrim;
            }
        }
    }

    private void a(lz0.w wVar, Attributes attributes) throws nz0 {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int i3 = a.f32089b[g.a(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 8) {
                wVar.o = v(strTrim);
            } else if (i3 != 9) {
                continue;
            } else {
                float fH = h(strTrim);
                wVar.f30902p = Float.valueOf(fH);
                if (fH < BitmapDescriptorFactory.HUE_RED) {
                    throw new nz0("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    private void a(lz0.c0 c0Var, Attributes attributes) throws nz0 {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int i3 = a.f32089b[g.a(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 10) {
                lz0.q qVarP = p(strTrim);
                c0Var.f30818s = qVarP;
                if (qVarP.b()) {
                    throw new nz0("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i3 == 11) {
                lz0.q qVarP2 = p(strTrim);
                c0Var.f30819t = qVarP2;
                if (qVarP2.b()) {
                    throw new nz0("Invalid <rect> element. ry cannot be negative");
                }
            } else if (i3 == 1) {
                c0Var.o = p(strTrim);
            } else if (i3 == 2) {
                c0Var.f30815p = p(strTrim);
            } else if (i3 == 3) {
                lz0.q qVarP3 = p(strTrim);
                c0Var.f30816q = qVarP3;
                if (qVarP3.b()) {
                    throw new nz0("Invalid <rect> element. width cannot be negative");
                }
            } else if (i3 != 4) {
                continue;
            } else {
                lz0.q qVarP4 = p(strTrim);
                c0Var.f30817r = qVarP4;
                if (qVarP4.b()) {
                    throw new nz0("Invalid <rect> element. height cannot be negative");
                }
            }
        }
    }

    private void a(lz0.e eVar, Attributes attributes) throws nz0 {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            switch (a.f32089b[g.a(attributes.getLocalName(i2)).ordinal()]) {
                case 12:
                    eVar.o = p(strTrim);
                    break;
                case 13:
                    eVar.f30830p = p(strTrim);
                    break;
                case 14:
                    lz0.q qVarP = p(strTrim);
                    eVar.f30831q = qVarP;
                    if (qVarP.b()) {
                        throw new nz0("Invalid <circle> element. r cannot be negative");
                    }
                    break;
                    break;
            }
        }
    }

    private void a(lz0.j jVar, Attributes attributes) throws nz0 {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            switch (a.f32089b[g.a(attributes.getLocalName(i2)).ordinal()]) {
                case 10:
                    lz0.q qVarP = p(strTrim);
                    jVar.f30855q = qVarP;
                    if (qVarP.b()) {
                        throw new nz0("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                    break;
                case 11:
                    lz0.q qVarP2 = p(strTrim);
                    jVar.f30856r = qVarP2;
                    if (qVarP2.b()) {
                        throw new nz0("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                    break;
                case 12:
                    jVar.o = p(strTrim);
                    break;
                case 13:
                    jVar.f30854p = p(strTrim);
                    break;
            }
        }
    }

    private void a(lz0.r rVar, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            switch (a.f32089b[g.a(attributes.getLocalName(i2)).ordinal()]) {
                case 15:
                    rVar.o = p(strTrim);
                    break;
                case 16:
                    rVar.f30885p = p(strTrim);
                    break;
                case 17:
                    rVar.f30886q = p(strTrim);
                    break;
                case 18:
                    rVar.f30887r = p(strTrim);
                    break;
            }
        }
    }

    private void a(lz0.a0 a0Var, Attributes attributes, String str) throws nz0 {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            if (g.a(attributes.getLocalName(i2)) == g.points) {
                e81 e81Var = new e81(attributes.getValue(i2));
                ArrayList arrayList = new ArrayList();
                e81Var.q();
                while (!e81Var.c()) {
                    float fG = e81Var.g();
                    if (!Float.isNaN(fG)) {
                        e81Var.p();
                        float fG2 = e81Var.g();
                        if (!Float.isNaN(fG2)) {
                            e81Var.p();
                            arrayList.add(Float.valueOf(fG));
                            arrayList.add(Float.valueOf(fG2));
                        } else {
                            throw new nz0("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                        }
                    } else {
                        throw new nz0("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                }
                a0Var.o = new float[arrayList.size()];
                int size = arrayList.size();
                int i3 = 0;
                int i5 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    a0Var.o[i5] = ((Float) obj2).floatValue();
                    i5++;
                }
            }
        }
    }

    private void a(lz0.a1 a1Var, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int i3 = a.f32089b[g.a(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 1) {
                a1Var.o = q(strTrim);
            } else if (i3 == 2) {
                a1Var.f30808p = q(strTrim);
            } else if (i3 == 19) {
                a1Var.f30809q = q(strTrim);
            } else if (i3 == 20) {
                a1Var.f30810r = q(strTrim);
            }
        }
    }

    private void a(lz0.u0 u0Var, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            if (a.f32089b[g.a(attributes.getLocalName(i2)).ordinal()] == 6 && ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2)))) {
                u0Var.o = strTrim;
            }
        }
    }

    private void a(lz0.g0 g0Var, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            switch (a.f32089b[g.a(attributes.getLocalName(i2)).ordinal()]) {
                case 21:
                    g0Var.c(x(strTrim));
                    break;
                case 22:
                    g0Var.a(strTrim);
                    break;
                case 23:
                    g0Var.d(C(strTrim));
                    break;
                case 24:
                    g0Var.a(y(strTrim));
                    break;
                case 25:
                    List listI = i(strTrim);
                    g0Var.b(listI != null ? new HashSet(listI) : new HashSet(0));
                    break;
            }
        }
    }

    private void a(lz0.s sVar, Attributes attributes) throws nz0 {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            switch (a.f32089b[g.a(attributes.getLocalName(i2)).ordinal()]) {
                case 26:
                    sVar.f30890r = p(strTrim);
                    break;
                case 27:
                    sVar.f30891s = p(strTrim);
                    break;
                case 28:
                    lz0.q qVarP = p(strTrim);
                    sVar.f30892t = qVarP;
                    if (qVarP.b()) {
                        throw new nz0("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                    break;
                case 29:
                    lz0.q qVarP2 = p(strTrim);
                    sVar.u = qVarP2;
                    if (qVarP2.b()) {
                        throw new nz0("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                    break;
                case 30:
                    if ("strokeWidth".equals(strTrim)) {
                        sVar.f30889q = false;
                    } else if ("userSpaceOnUse".equals(strTrim)) {
                        sVar.f30889q = true;
                    } else {
                        throw new nz0("Invalid value for attribute markerUnits");
                    }
                    break;
                case 31:
                    if ("auto".equals(strTrim)) {
                        sVar.v = Float.valueOf(Float.NaN);
                    } else {
                        sVar.v = Float.valueOf(h(strTrim));
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0089, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.fourthline.orca.internal.lz0.k r5, org.xml.sax.Attributes r6) throws com.fourthline.orca.internal.nz0 {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L8d
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = com.fourthline.orca.internal.pz0.a.f32089b
            java.lang.String r3 = r6.getLocalName(r0)
            com.fourthline.orca.internal.pz0$g r3 = com.fourthline.orca.internal.pz0.g.a(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 6
            if (r2 == r3) goto L6f
            switch(r2) {
                case 32: goto L4d;
                case 33: goto L46;
                case 34: goto L26;
                default: goto L25;
            }
        L25:
            goto L89
        L26:
            com.fourthline.orca.internal.lz0$l r2 = com.fourthline.orca.internal.lz0.l.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L2d
            r5.k = r2     // Catch: java.lang.IllegalArgumentException -> L2d
            goto L89
        L2d:
            com.fourthline.orca.internal.nz0 r5 = new com.fourthline.orca.internal.nz0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid spreadMethod attribute. \""
            r6.<init>(r0)
            r6.append(r1)
            java.lang.String r0 = "\" is not a valid value."
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L46:
            android.graphics.Matrix r1 = r4.G(r1)
            r5.f30858j = r1
            goto L89
        L4d:
            java.lang.String r2 = "objectBoundingBox"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L5a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5.i = r1
            goto L89
        L5a:
            java.lang.String r2 = "userSpaceOnUse"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L67
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.i = r1
            goto L89
        L67:
            com.fourthline.orca.internal.nz0 r5 = new com.fourthline.orca.internal.nz0
            java.lang.String r6 = "Invalid value for attribute gradientUnits"
            r5.<init>(r6)
            throw r5
        L6f:
            java.lang.String r2 = r6.getURI(r0)
            java.lang.String r3 = ""
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L87
            java.lang.String r2 = r6.getURI(r0)
            java.lang.String r3 = "http://www.w3.org/1999/xlink"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L89
        L87:
            r5.f30859l = r1
        L89:
            int r0 = r0 + 1
            goto L1
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.pz0.a(com.fourthline.orca.internal.lz0$k, org.xml.sax.Attributes):void");
    }

    private void a(lz0.m0 m0Var, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            switch (a.f32089b[g.a(attributes.getLocalName(i2)).ordinal()]) {
                case 15:
                    m0Var.f30867m = p(strTrim);
                    break;
                case 16:
                    m0Var.f30868n = p(strTrim);
                    break;
                case 17:
                    m0Var.o = p(strTrim);
                    break;
                case 18:
                    m0Var.f30869p = p(strTrim);
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.fourthline.orca.internal.lz0.q0 r5, org.xml.sax.Attributes r6) throws com.fourthline.orca.internal.nz0 {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L6e
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = com.fourthline.orca.internal.pz0.a.f32089b
            java.lang.String r3 = r6.getLocalName(r0)
            com.fourthline.orca.internal.pz0$g r3 = com.fourthline.orca.internal.pz0.g.a(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            switch(r2) {
                case 12: goto L65;
                case 13: goto L5e;
                case 14: goto L49;
                default: goto L22;
            }
        L22:
            switch(r2) {
                case 35: goto L42;
                case 36: goto L3b;
                case 37: goto L26;
                default: goto L25;
            }
        L25:
            goto L6b
        L26:
            com.fourthline.orca.internal.lz0$q r1 = p(r1)
            r5.f30884r = r1
            boolean r1 = r1.b()
            if (r1 != 0) goto L33
            goto L6b
        L33:
            com.fourthline.orca.internal.nz0 r5 = new com.fourthline.orca.internal.nz0
            java.lang.String r6 = "Invalid <radialGradient> element. fr cannot be negative"
            r5.<init>(r6)
            throw r5
        L3b:
            com.fourthline.orca.internal.lz0$q r1 = p(r1)
            r5.f30883q = r1
            goto L6b
        L42:
            com.fourthline.orca.internal.lz0$q r1 = p(r1)
            r5.f30882p = r1
            goto L6b
        L49:
            com.fourthline.orca.internal.lz0$q r1 = p(r1)
            r5.o = r1
            boolean r1 = r1.b()
            if (r1 != 0) goto L56
            goto L6b
        L56:
            com.fourthline.orca.internal.nz0 r5 = new com.fourthline.orca.internal.nz0
            java.lang.String r6 = "Invalid <radialGradient> element. r cannot be negative"
            r5.<init>(r6)
            throw r5
        L5e:
            com.fourthline.orca.internal.lz0$q r1 = p(r1)
            r5.f30881n = r1
            goto L6b
        L65:
            com.fourthline.orca.internal.lz0$q r1 = p(r1)
            r5.f30880m = r1
        L6b:
            int r0 = r0 + 1
            goto L1
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.pz0.a(com.fourthline.orca.internal.lz0$q0, org.xml.sax.Attributes):void");
    }

    private void a(lz0.e0 e0Var, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            if (a.f32089b[g.a(attributes.getLocalName(i2)).ordinal()] == 38) {
                e0Var.f30832h = n(strTrim);
            }
        }
    }

    private void a(lz0.f fVar, Attributes attributes) throws nz0 {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            if (a.f32089b[g.a(attributes.getLocalName(i2)).ordinal()] == 39) {
                if ("objectBoundingBox".equals(strTrim)) {
                    fVar.f30838p = Boolean.FALSE;
                } else if ("userSpaceOnUse".equals(strTrim)) {
                    fVar.f30838p = Boolean.TRUE;
                } else {
                    throw new nz0("Invalid value for attribute clipPathUnits");
                }
            }
        }
    }

    private void a(lz0.z0 z0Var, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int i3 = a.f32089b[g.a(attributes.getLocalName(i2)).ordinal()];
            if (i3 != 6) {
                if (i3 == 40) {
                    z0Var.f30913p = p(strTrim);
                }
            } else if ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                z0Var.o = strTrim;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cf, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.fourthline.orca.internal.lz0.z r6, org.xml.sax.Attributes r7) throws com.fourthline.orca.internal.nz0 {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.pz0.a(com.fourthline.orca.internal.lz0$z, org.xml.sax.Attributes):void");
    }

    private void a(lz0.t tVar, Attributes attributes) throws nz0 {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int i3 = a.f32089b[g.a(attributes.getLocalName(i2)).ordinal()];
            if (i3 != 44) {
                if (i3 != 45) {
                    if (i3 == 1) {
                        tVar.f30894q = p(strTrim);
                    } else if (i3 == 2) {
                        tVar.f30895r = p(strTrim);
                    } else if (i3 == 3) {
                        lz0.q qVarP = p(strTrim);
                        tVar.f30896s = qVarP;
                        if (qVarP.b()) {
                            throw new nz0("Invalid <mask> element. width cannot be negative");
                        }
                    } else if (i3 != 4) {
                        continue;
                    } else {
                        lz0.q qVarP2 = p(strTrim);
                        tVar.f30897t = qVarP2;
                        if (qVarP2.b()) {
                            throw new nz0("Invalid <mask> element. height cannot be negative");
                        }
                    }
                } else if ("objectBoundingBox".equals(strTrim)) {
                    tVar.f30893p = Boolean.FALSE;
                } else if ("userSpaceOnUse".equals(strTrim)) {
                    tVar.f30893p = Boolean.TRUE;
                } else {
                    throw new nz0("Invalid value for attribute maskContentUnits");
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                tVar.o = Boolean.FALSE;
            } else if ("userSpaceOnUse".equals(strTrim)) {
                tVar.o = Boolean.TRUE;
            } else {
                throw new nz0("Invalid value for attribute maskUnits");
            }
        }
    }

    private void a(lz0.l0 l0Var, Attributes attributes) throws nz0 {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String qName = attributes.getQName(i2);
            if (!qName.equals("id") && !qName.equals("xml:id")) {
                if (qName.equals("xml:space")) {
                    String strTrim = attributes.getValue(i2).trim();
                    if ("default".equals(strTrim)) {
                        l0Var.d = Boolean.FALSE;
                        return;
                    } else {
                        if ("preserve".equals(strTrim)) {
                            l0Var.d = Boolean.TRUE;
                            return;
                        }
                        throw new nz0("Invalid value for \"xml:space\" attribute: " + strTrim);
                    }
                }
            } else {
                l0Var.f30864c = attributes.getValue(i2).trim();
                return;
            }
        }
    }

    private static void a(lz0.l0 l0Var, String str) {
        f9 f9Var = new f9(f32081l.matcher(str).replaceAll(""));
        while (!f9Var.c()) {
            f9Var.q();
            String strV = f9Var.v();
            f9Var.q();
            if (!f9Var.a(';')) {
                if (!f9Var.a(CoreConstants.COLON_CHAR)) {
                    return;
                }
                f9Var.q();
                String strX = f9Var.x();
                if (strX != null) {
                    f9Var.q();
                    if (f9Var.c() || f9Var.a(';')) {
                        if (l0Var.f == null) {
                            l0Var.f = new m71();
                        }
                        m71.a(l0Var.f, strV, strX, false);
                        f9Var.q();
                    }
                }
            }
        }
    }

    private void a(lz0.r0 r0Var, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int i3 = a.f32089b[g.a(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 7) {
                a((lz0.p0) r0Var, strTrim);
            } else if (i3 == 48) {
                r0Var.f30888p = I(strTrim);
            }
        }
    }

    private void a(lz0.o oVar, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            if (g.a(attributes.getLocalName(i2)) == g.transform) {
                oVar.a(G(attributes.getValue(i2)));
            }
        }
    }

    private static float a(String str, int i2, int i3) throws nz0 {
        float fA = new fg0().a(str, i2, i3);
        if (!Float.isNaN(fA)) {
            return fA;
        }
        throw new nz0("Invalid float value: " + str);
    }

    private static void a(lz0.p0 p0Var, String str) {
        p0Var.o = oq0.a(str);
    }

    private static int a(float f4) {
        if (f4 < BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        if (f4 > 255.0f) {
            return 255;
        }
        return Math.round(f4);
    }

    private static int a(float f4, float f5, float f6) {
        float fMin = BitmapDescriptorFactory.HUE_RED;
        float f32 = f4 % 360.0f;
        if (f4 < BitmapDescriptorFactory.HUE_RED) {
            f32 += 360.0f;
        }
        float f35 = f32 / 60.0f;
        float f36 = f5 / 100.0f;
        float f37 = f6 / 100.0f;
        float fMin2 = f36 < BitmapDescriptorFactory.HUE_RED ? 0.0f : Math.min(f36, 1.0f);
        if (f37 >= BitmapDescriptorFactory.HUE_RED) {
            fMin = Math.min(f37, 1.0f);
        }
        float f41 = fMin <= 0.5f ? (fMin2 + 1.0f) * fMin : (fMin + fMin2) - (fMin2 * fMin);
        float f42 = (fMin * 2.0f) - f41;
        float fB = b(f42, f41, f35 + 2.0f);
        float fB2 = b(f42, f41, f35);
        return a(b(f42, f41, f35 - 2.0f) * 256.0f) | (a(fB * 256.0f) << 16) | (a(fB2 * 256.0f) << 8);
    }

    public static void a(m71 m71Var, String str) {
        String strB;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str + '|')) {
            return;
        }
        e81 e81Var = new e81(str);
        Float fB = null;
        m71.e eVarL = null;
        Boolean bool = null;
        Float fB2 = null;
        while (true) {
            strB = e81Var.b('/');
            e81Var.q();
            if (strB != null) {
                if (fB != null && eVarL != null) {
                    break;
                }
                if (!strB.equals("normal")) {
                    if (fB == null && e.a(strB)) {
                        fB = e.b(strB);
                    } else if (eVarL != null || (eVarL = l(strB)) == null) {
                        if (bool == null && strB.equals("small-caps")) {
                            bool = Boolean.TRUE;
                        } else if (fB2 != null || !d.a(strB)) {
                            break;
                        } else {
                            fB2 = d.b(strB);
                        }
                    }
                }
            } else {
                return;
            }
        }
        lz0.q qVarJ = j(strB);
        if (e81Var.a('/')) {
            e81Var.q();
            String strK = e81Var.k();
            if (strK != null) {
                try {
                    p(strK);
                } catch (nz0 unused) {
                    return;
                }
            }
            e81Var.q();
        }
        m71Var.o = i(e81Var.o());
        m71Var.f31032p = qVarJ;
        m71Var.f31033q = Float.valueOf(fB == null ? 400.0f : fB.floatValue());
        if (eVarL == null) {
            eVarL = m71.e.normal;
        }
        m71Var.f31034r = eVarL;
        m71Var.f31035s = Float.valueOf(fB2 == null ? 100.0f : fB2.floatValue());
        m71Var.Q = m71.d.auto;
        m71Var.R = b9.d;
        m71Var.S = b9.f;
        m71Var.T = b9.f27051g;
        if (bool == Boolean.TRUE) {
            m71Var.T = b9.c();
        }
        m71Var.U = b9.i;
        m71Var.V = b9.f27053j;
        m71Var.W = b9.f27049b;
        m71Var.X = null;
        m71Var.f31021a |= 4009918906621952L;
    }

    private static lz0.q a(e81 e81Var) {
        if (e81Var.a("auto")) {
            return lz0.q.f30877c;
        }
        return e81Var.i();
    }

    public static String a(String str, String str2) {
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        if (str.endsWith(")")) {
            return str.substring(4, str.length() - 1).trim();
        }
        return str.substring(4).trim();
    }
}
