package b9;

import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class e3 {
    private static final /* synthetic */ e3[] $VALUES;
    public static final e3 SWITCH;
    public static final e3 UNSUPPORTED;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e3 f13342a;
    private static final Map<String, e3> cache;
    public static final e3 circle;
    public static final e3 clipPath;
    public static final e3 defs;
    public static final e3 desc;
    public static final e3 ellipse;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e3 f13343g;
    public static final e3 image;
    public static final e3 line;
    public static final e3 linearGradient;
    public static final e3 marker;
    public static final e3 mask;
    public static final e3 path;
    public static final e3 pattern;
    public static final e3 polygon;
    public static final e3 polyline;
    public static final e3 radialGradient;
    public static final e3 rect;
    public static final e3 solidColor;
    public static final e3 stop;
    public static final e3 style;

    /* JADX INFO: renamed from: svg, reason: collision with root package name */
    public static final e3 f13344svg;
    public static final e3 symbol;
    public static final e3 text;
    public static final e3 textPath;
    public static final e3 title;
    public static final e3 tref;
    public static final e3 tspan;

    /* JADX INFO: renamed from: use, reason: collision with root package name */
    public static final e3 f13345use;
    public static final e3 view;

    static {
        e3 e3Var = new e3("svg", 0);
        f13344svg = e3Var;
        e3 e3Var2 = new e3("a", 1);
        f13342a = e3Var2;
        e3 e3Var3 = new e3("circle", 2);
        circle = e3Var3;
        e3 e3Var4 = new e3("clipPath", 3);
        clipPath = e3Var4;
        e3 e3Var5 = new e3("defs", 4);
        defs = e3Var5;
        e3 e3Var6 = new e3("desc", 5);
        desc = e3Var6;
        e3 e3Var7 = new e3("ellipse", 6);
        ellipse = e3Var7;
        e3 e3Var8 = new e3("g", 7);
        f13343g = e3Var8;
        e3 e3Var9 = new e3("image", 8);
        image = e3Var9;
        e3 e3Var10 = new e3("line", 9);
        line = e3Var10;
        e3 e3Var11 = new e3("linearGradient", 10);
        linearGradient = e3Var11;
        e3 e3Var12 = new e3("marker", 11);
        marker = e3Var12;
        e3 e3Var13 = new e3("mask", 12);
        mask = e3Var13;
        e3 e3Var14 = new e3("path", 13);
        path = e3Var14;
        e3 e3Var15 = new e3("pattern", 14);
        pattern = e3Var15;
        e3 e3Var16 = new e3("polygon", 15);
        polygon = e3Var16;
        e3 e3Var17 = new e3("polyline", 16);
        polyline = e3Var17;
        e3 e3Var18 = new e3("radialGradient", 17);
        radialGradient = e3Var18;
        e3 e3Var19 = new e3("rect", 18);
        rect = e3Var19;
        e3 e3Var20 = new e3("solidColor", 19);
        solidColor = e3Var20;
        e3 e3Var21 = new e3("stop", 20);
        stop = e3Var21;
        e3 e3Var22 = new e3("style", 21);
        style = e3Var22;
        e3 e3Var23 = new e3("SWITCH", 22);
        SWITCH = e3Var23;
        e3 e3Var24 = new e3("symbol", 23);
        symbol = e3Var24;
        e3 e3Var25 = new e3("text", 24);
        text = e3Var25;
        e3 e3Var26 = new e3("textPath", 25);
        textPath = e3Var26;
        e3 e3Var27 = new e3("title", 26);
        title = e3Var27;
        e3 e3Var28 = new e3("tref", 27);
        tref = e3Var28;
        e3 e3Var29 = new e3("tspan", 28);
        tspan = e3Var29;
        e3 e3Var30 = new e3("use", 29);
        f13345use = e3Var30;
        e3 e3Var31 = new e3("view", 30);
        view = e3Var31;
        e3 e3Var32 = new e3("UNSUPPORTED", 31);
        UNSUPPORTED = e3Var32;
        $VALUES = new e3[]{e3Var, e3Var2, e3Var3, e3Var4, e3Var5, e3Var6, e3Var7, e3Var8, e3Var9, e3Var10, e3Var11, e3Var12, e3Var13, e3Var14, e3Var15, e3Var16, e3Var17, e3Var18, e3Var19, e3Var20, e3Var21, e3Var22, e3Var23, e3Var24, e3Var25, e3Var26, e3Var27, e3Var28, e3Var29, e3Var30, e3Var31, e3Var32};
        cache = new HashMap();
        for (e3 e3Var33 : values()) {
            if (e3Var33 == SWITCH) {
                cache.put("switch", e3Var33);
            } else if (e3Var33 != UNSUPPORTED) {
                cache.put(e3Var33.name(), e3Var33);
            }
        }
    }

    public static e3 a(String str) {
        e3 e3Var = cache.get(str);
        return e3Var != null ? e3Var : UNSUPPORTED;
    }

    public static e3 valueOf(String str) {
        return (e3) Enum.valueOf(e3.class, str);
    }

    public static e3[] values() {
        return (e3[]) $VALUES.clone();
    }
}
