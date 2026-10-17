package com.fourthline.orca.internal;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.util.FileSize;
import com.fourthline.orca.internal.lz0;
import com.fourthline.orca.internal.pz0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class m71 implements Cloneable {
    String A;
    Boolean B;
    Boolean C;
    lz0.o0 D;
    Float E;
    String F;
    c G;
    String H;
    lz0.o0 I;
    Float J;
    lz0.o0 K;
    Float L;
    o M;
    j N;
    g O;
    b P;
    d Q;
    b9 R;
    b9 S;
    b9 T;
    b9 U;
    b9 V;
    b9 W;
    c9 X;
    p Y;
    f Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f31021a = 0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    n f31022a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    lz0.o0 f31023b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    lz0.q f31024b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    c f31025c;
    lz0.q c0;
    Float d;
    lz0.o0 e;
    Float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    lz0.q f31026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    h f31027h;
    i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Float f31028j;
    lz0.q[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    lz0.q f31029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Float f31030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    lz0.g f31031n;
    List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    lz0.q f31032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Float f31033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    e f31034r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Float f31035s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    l f31036t;
    m u;
    k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Boolean f31037w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    lz0.d f31038x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    String f31039y;
    String z;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31040a;

        static {
            int[] iArr = new int[pz0.g.values().length];
            f31040a = iArr;
            try {
                iArr[pz0.g.fill.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31040a[pz0.g.fill_rule.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31040a[pz0.g.fill_opacity.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31040a[pz0.g.stroke.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31040a[pz0.g.stroke_opacity.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31040a[pz0.g.stroke_width.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31040a[pz0.g.stroke_linecap.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31040a[pz0.g.stroke_linejoin.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f31040a[pz0.g.stroke_miterlimit.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f31040a[pz0.g.stroke_dasharray.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f31040a[pz0.g.stroke_dashoffset.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f31040a[pz0.g.opacity.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f31040a[pz0.g.color.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f31040a[pz0.g.font.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f31040a[pz0.g.font_family.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f31040a[pz0.g.font_size.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f31040a[pz0.g.font_weight.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f31040a[pz0.g.font_style.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f31040a[pz0.g.font_stretch.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f31040a[pz0.g.text_decoration.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f31040a[pz0.g.direction.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f31040a[pz0.g.text_anchor.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f31040a[pz0.g.overflow.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f31040a[pz0.g.marker.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f31040a[pz0.g.marker_start.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f31040a[pz0.g.marker_mid.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f31040a[pz0.g.marker_end.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f31040a[pz0.g.display.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f31040a[pz0.g.visibility.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f31040a[pz0.g.stop_color.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f31040a[pz0.g.stop_opacity.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f31040a[pz0.g.clip.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f31040a[pz0.g.clip_path.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f31040a[pz0.g.clip_rule.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f31040a[pz0.g.mask.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f31040a[pz0.g.solid_color.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f31040a[pz0.g.solid_opacity.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f31040a[pz0.g.viewport_fill.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f31040a[pz0.g.viewport_fill_opacity.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f31040a[pz0.g.vector_effect.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f31040a[pz0.g.image_rendering.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f31040a[pz0.g.isolation.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f31040a[pz0.g.mix_blend_mode.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f31040a[pz0.g.font_kerning.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f31040a[pz0.g.font_variant.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f31040a[pz0.g.font_variant_ligatures.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f31040a[pz0.g.font_variant_position.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f31040a[pz0.g.font_variant_caps.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f31040a[pz0.g.font_variant_numeric.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f31040a[pz0.g.font_variant_east_asian.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f31040a[pz0.g.font_feature_settings.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f31040a[pz0.g.font_variation_settings.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f31040a[pz0.g.letter_spacing.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f31040a[pz0.g.word_spacing.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
        }
    }

    public enum b {
        normal,
        multiply,
        screen,
        overlay,
        darken,
        lighten,
        color_dodge,
        color_burn,
        hard_light,
        soft_light,
        difference,
        exclusion,
        hue,
        saturation,
        color,
        luminosity,
        UNSUPPORTED;


        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final Map f31052r = new HashMap();

        static {
            for (b bVar : values()) {
                if (bVar != UNSUPPORTED) {
                    f31052r.put(bVar.name().replace('_', CoreConstants.DASH_CHAR), bVar);
                }
            }
        }

        public static b a(String str) {
            b bVar = (b) f31052r.get(str);
            return bVar != null ? bVar : UNSUPPORTED;
        }
    }

    public enum c {
        NonZero,
        EvenOdd
    }

    public enum d {
        auto,
        normal,
        none
    }

    public enum e {
        normal,
        italic,
        oblique
    }

    public enum f {
        auto,
        angle0,
        angle90,
        angle180,
        angle270
    }

    public enum g {
        auto,
        isolate
    }

    public enum h {
        Butt,
        Round,
        Square
    }

    public enum i {
        Miter,
        Round,
        Bevel
    }

    public enum j {
        auto,
        optimizeQuality,
        optimizeSpeed
    }

    public enum k {
        Start,
        Middle,
        End
    }

    public enum l {
        None,
        Underline,
        Overline,
        LineThrough,
        Blink
    }

    public enum m {
        LTR,
        RTL
    }

    public enum n {
        mixed,
        upright,
        sideways
    }

    public enum o {
        None,
        NonScalingStroke
    }

    public enum p {
        lr_tb,
        rl_tb,
        tb_rl,
        lr,
        rl,
        tb,
        horizontal_tb,
        vertical_rl,
        vertical_lr
    }

    public static m71 a() {
        m71 m71Var = new m71();
        lz0.g gVar = lz0.g.f30843b;
        m71Var.f31023b = gVar;
        c cVar = c.NonZero;
        m71Var.f31025c = cVar;
        Float fValueOf = Float.valueOf(1.0f);
        m71Var.d = fValueOf;
        m71Var.e = null;
        m71Var.f = fValueOf;
        m71Var.f31026g = new lz0.q(1.0f);
        m71Var.f31027h = h.Butt;
        m71Var.i = i.Miter;
        m71Var.f31028j = Float.valueOf(4.0f);
        m71Var.k = null;
        lz0.q qVar = lz0.q.f30877c;
        m71Var.f31029l = qVar;
        m71Var.f31030m = fValueOf;
        m71Var.f31031n = gVar;
        m71Var.o = null;
        m71Var.f31032p = new lz0.q(12.0f, lz0.d1.pt);
        m71Var.f31033q = Float.valueOf(400.0f);
        m71Var.f31034r = e.normal;
        m71Var.f31035s = Float.valueOf(100.0f);
        m71Var.f31036t = l.None;
        m71Var.u = m.LTR;
        m71Var.v = k.Start;
        Boolean bool = Boolean.TRUE;
        m71Var.f31037w = bool;
        m71Var.f31038x = null;
        m71Var.f31039y = null;
        m71Var.z = null;
        m71Var.A = null;
        m71Var.B = bool;
        m71Var.C = bool;
        m71Var.D = gVar;
        m71Var.E = fValueOf;
        m71Var.F = null;
        m71Var.G = cVar;
        m71Var.H = null;
        m71Var.I = null;
        m71Var.J = fValueOf;
        m71Var.K = null;
        m71Var.L = fValueOf;
        m71Var.M = o.None;
        m71Var.N = j.auto;
        m71Var.O = g.auto;
        m71Var.P = b.normal;
        m71Var.Q = d.auto;
        m71Var.R = b9.d;
        m71Var.S = b9.f;
        m71Var.T = b9.f27051g;
        m71Var.U = b9.i;
        m71Var.V = b9.f27053j;
        m71Var.W = b9.f27049b;
        m71Var.X = null;
        m71Var.f31024b0 = qVar;
        m71Var.c0 = qVar;
        m71Var.Y = p.horizontal_tb;
        m71Var.Z = f.auto;
        m71Var.f31022a0 = n.mixed;
        m71Var.f31021a = -1159984767303681L;
        return m71Var;
    }

    public Object clone() {
        m71 m71Var = (m71) super.clone();
        lz0.q[] qVarArr = this.k;
        if (qVarArr != null) {
            m71Var.k = (lz0.q[]) qVarArr.clone();
        }
        return m71Var;
    }

    public void a(boolean z) {
        Float fValueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        this.B = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        this.f31037w = bool;
        this.f31038x = null;
        this.F = null;
        this.f31030m = fValueOf;
        this.D = lz0.g.f30843b;
        this.E = fValueOf;
        this.H = null;
        this.I = null;
        this.J = fValueOf;
        this.K = null;
        this.L = fValueOf;
        this.M = o.None;
        this.O = g.auto;
        this.P = b.normal;
    }

    public static void a(m71 m71Var, String str, String str2, boolean z) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (a.f31040a[pz0.g.a(str).ordinal()]) {
                case 1:
                    lz0.o0 o0VarU = pz0.u(str2);
                    m71Var.f31023b = o0VarU;
                    if (o0VarU != null) {
                        m71Var.f31021a |= 1;
                    }
                    break;
                case 2:
                    c cVarG = pz0.g(str2);
                    m71Var.f31025c = cVarG;
                    if (cVarG != null) {
                        m71Var.f31021a |= 2;
                    }
                    break;
                case 3:
                    Float fS = pz0.s(str2);
                    m71Var.d = fS;
                    if (fS != null) {
                        m71Var.f31021a |= 4;
                    }
                    break;
                case 4:
                    lz0.o0 o0VarU2 = pz0.u(str2);
                    m71Var.e = o0VarU2;
                    if (o0VarU2 != null) {
                        m71Var.f31021a |= 8;
                    }
                    break;
                case 5:
                    Float fS2 = pz0.s(str2);
                    m71Var.f = fS2;
                    if (fS2 != null) {
                        m71Var.f31021a |= 16;
                    }
                    break;
                case 6:
                    m71Var.f31026g = pz0.p(str2);
                    m71Var.f31021a |= 32;
                    break;
                case 7:
                    h hVarA = pz0.A(str2);
                    m71Var.f31027h = hVarA;
                    if (hVarA != null) {
                        m71Var.f31021a |= 64;
                    }
                    break;
                case 8:
                    i iVarB = pz0.B(str2);
                    m71Var.i = iVarB;
                    if (iVarB != null) {
                        m71Var.f31021a |= 128;
                    }
                    break;
                case 9:
                    m71Var.f31028j = Float.valueOf(pz0.h(str2));
                    m71Var.f31021a |= 256;
                    break;
                case 10:
                    if ("none".equals(str2)) {
                        m71Var.k = null;
                        m71Var.f31021a |= 512;
                    } else {
                        lz0.q[] qVarArrZ = pz0.z(str2);
                        m71Var.k = qVarArrZ;
                        if (qVarArrZ != null) {
                            m71Var.f31021a |= 512;
                        }
                    }
                    break;
                case 11:
                    m71Var.f31029l = pz0.p(str2);
                    m71Var.f31021a |= FileSize.KB_COEFFICIENT;
                    break;
                case 12:
                    m71Var.f31030m = pz0.s(str2);
                    m71Var.f31021a |= 2048;
                    break;
                case 13:
                    m71Var.f31031n = pz0.d(str2);
                    m71Var.f31021a |= 4096;
                    break;
                case 14:
                    if (!z) {
                        pz0.a(m71Var, str2);
                        break;
                    }
                    break;
                case 15:
                    List listI = pz0.i(str2);
                    m71Var.o = listI;
                    if (listI != null) {
                        m71Var.f31021a |= FileAppender.DEFAULT_BUFFER_SIZE;
                    }
                    break;
                case 16:
                    lz0.q qVarJ = pz0.j(str2);
                    m71Var.f31032p = qVarJ;
                    if (qVarJ != null) {
                        m71Var.f31021a |= 16384;
                    }
                    break;
                case 17:
                    Float fM = pz0.m(str2);
                    m71Var.f31033q = fM;
                    if (fM != null) {
                        m71Var.f31021a |= 32768;
                    }
                    break;
                case 18:
                    e eVarL = pz0.l(str2);
                    m71Var.f31034r = eVarL;
                    if (eVarL != null) {
                        m71Var.f31021a |= 65536;
                    }
                    break;
                case 19:
                    Float fK = pz0.k(str2);
                    m71Var.f31035s = fK;
                    if (fK != null) {
                        m71Var.f31021a |= 2251799813685248L;
                    }
                    break;
                case 20:
                    l lVarE = pz0.E(str2);
                    m71Var.f31036t = lVarE;
                    if (lVarE != null) {
                        m71Var.f31021a |= 131072;
                    }
                    break;
                case 21:
                    m mVarF = pz0.F(str2);
                    m71Var.u = mVarF;
                    if (mVarF != null) {
                        m71Var.f31021a |= 68719476736L;
                    }
                    break;
                case 22:
                    k kVarD = pz0.D(str2);
                    m71Var.v = kVarD;
                    if (kVarD != null) {
                        m71Var.f31021a |= 262144;
                    }
                    break;
                case 23:
                    Boolean boolT = pz0.t(str2);
                    m71Var.f31037w = boolT;
                    if (boolT != null) {
                        m71Var.f31021a |= 524288;
                    }
                    break;
                case 24:
                    String strA = pz0.a(str2, str);
                    m71Var.f31039y = strA;
                    m71Var.z = strA;
                    m71Var.A = strA;
                    m71Var.f31021a |= 14680064;
                    break;
                case 25:
                    m71Var.f31039y = pz0.a(str2, str);
                    m71Var.f31021a |= 2097152;
                    break;
                case 26:
                    m71Var.z = pz0.a(str2, str);
                    m71Var.f31021a |= 4194304;
                    break;
                case 27:
                    m71Var.A = pz0.a(str2, str);
                    m71Var.f31021a |= 8388608;
                    break;
                case 28:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                            m71Var.B = Boolean.valueOf(!str2.equals("none"));
                            m71Var.f31021a |= 16777216;
                            break;
                        }
                    }
                    break;
                case 29:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                            m71Var.C = Boolean.valueOf(str2.equals("visible"));
                            m71Var.f31021a |= 33554432;
                            break;
                        }
                    }
                    break;
                case 30:
                    if (str2.equals("currentColor")) {
                        m71Var.D = lz0.h.a();
                    } else {
                        m71Var.D = pz0.d(str2);
                    }
                    m71Var.f31021a |= 67108864;
                    break;
                case 31:
                    m71Var.E = pz0.s(str2);
                    m71Var.f31021a |= 134217728;
                    break;
                case 32:
                    lz0.d dVarC = pz0.c(str2);
                    m71Var.f31038x = dVarC;
                    if (dVarC != null) {
                        m71Var.f31021a |= FileSize.MB_COEFFICIENT;
                    }
                    break;
                case 33:
                    m71Var.F = pz0.a(str2, str);
                    m71Var.f31021a |= 268435456;
                    break;
                case 34:
                    m71Var.G = pz0.g(str2);
                    m71Var.f31021a |= 536870912;
                    break;
                case 35:
                    m71Var.H = pz0.a(str2, str);
                    m71Var.f31021a |= FileSize.GB_COEFFICIENT;
                    break;
                case 36:
                    if (z) {
                        if (str2.equals("currentColor")) {
                            m71Var.I = lz0.h.a();
                        } else {
                            m71Var.I = pz0.d(str2);
                        }
                        m71Var.f31021a |= 2147483648L;
                        break;
                    }
                    break;
                case 37:
                    if (z) {
                        m71Var.J = pz0.s(str2);
                        m71Var.f31021a |= 4294967296L;
                        break;
                    }
                    break;
                case 38:
                    if (str2.equals("currentColor")) {
                        m71Var.K = lz0.h.a();
                    } else {
                        m71Var.K = pz0.d(str2);
                    }
                    m71Var.f31021a |= 8589934592L;
                    break;
                case 39:
                    m71Var.L = pz0.s(str2);
                    m71Var.f31021a |= 17179869184L;
                    break;
                case 40:
                    o oVarH = pz0.H(str2);
                    m71Var.M = oVarH;
                    if (oVarH != null) {
                        m71Var.f31021a |= 34359738368L;
                    }
                    break;
                case 41:
                    j jVarW = pz0.w(str2);
                    m71Var.N = jVarW;
                    if (jVarW != null) {
                        m71Var.f31021a |= 137438953472L;
                    }
                    break;
                case 42:
                    if (!z) {
                        g gVarO = pz0.o(str2);
                        m71Var.O = gVarO;
                        if (gVarO != null) {
                            m71Var.f31021a |= 274877906944L;
                        }
                        break;
                    }
                    break;
                case 43:
                    if (!z) {
                        b bVarA = b.a(str2);
                        m71Var.P = bVarA;
                        if (bVarA != null) {
                            m71Var.f31021a |= 549755813888L;
                        }
                        break;
                    }
                    break;
                case 44:
                    if (!z) {
                        d dVarD = b9.d(str2);
                        m71Var.Q = dVarD;
                        if (dVarD != null) {
                            m71Var.f31021a |= 562949953421312L;
                        }
                        break;
                    }
                    break;
                case 45:
                    if (!z) {
                        b9.a(m71Var, str2);
                        break;
                    }
                    break;
                case 46:
                    if (!z) {
                        b9 b9VarF = b9.f(str2);
                        m71Var.R = b9VarF;
                        if (b9VarF != null) {
                            m71Var.f31021a |= 1099511627776L;
                        }
                        break;
                    }
                    break;
                case 47:
                    if (!z) {
                        b9 b9VarH = b9.h(str2);
                        m71Var.S = b9VarH;
                        if (b9VarH != null) {
                            m71Var.f31021a |= 2199023255552L;
                        }
                        break;
                    }
                    break;
                case 48:
                    if (!z) {
                        b9 b9VarE = b9.e(str2);
                        m71Var.T = b9VarE;
                        if (b9VarE != null) {
                            m71Var.f31021a |= 4398046511104L;
                        }
                        break;
                    }
                    break;
                case 49:
                    if (!z) {
                        b9 b9VarG = b9.g(str2);
                        m71Var.U = b9VarG;
                        if (b9VarG != null) {
                            m71Var.f31021a |= 8796093022208L;
                        }
                        break;
                    }
                    break;
                case 50:
                    if (!z) {
                        b9 b9VarB = b9.b(str2);
                        m71Var.V = b9VarB;
                        if (b9VarB != null) {
                            m71Var.f31021a |= 17592186044416L;
                        }
                        break;
                    }
                    break;
                case 51:
                    if (!z) {
                        b9 b9VarC = b9.c(str2);
                        m71Var.W = b9VarC;
                        if (b9VarC != null) {
                            m71Var.f31021a |= 35184372088832L;
                        }
                        break;
                    }
                    break;
                case 52:
                    if (!z) {
                        c9 c9VarA = c9.a(str2);
                        m71Var.X = c9VarA;
                        if (c9VarA != null) {
                            m71Var.f31021a |= 1125899906842624L;
                        }
                        break;
                    }
                    break;
                case 53:
                    lz0.q qVarR = pz0.r(str2);
                    m71Var.f31024b0 = qVarR;
                    if (qVarR != null) {
                        m71Var.f31021a |= 4503599627370496L;
                    }
                    break;
                case 54:
                    lz0.q qVarR2 = pz0.r(str2);
                    m71Var.c0 = qVarR2;
                    if (qVarR2 != null) {
                        m71Var.f31021a |= 9007199254740992L;
                    }
                    break;
            }
        } catch (nz0 unused) {
        }
    }
}
