package uz;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public abstract class y {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y[] $VALUES;

    @NotNull
    private static final s Companion;
    public static final y FACE_CAPTURE;
    public static final y FACE_CAPTURE_FAILED;
    public static final y FACE_MATCHED;

    @Deprecated
    public static final int FACE_MATCHED_MASK_MAX_ALPHA = 255;
    public static final y WAITING_FOR_FACE_MATCH;

    @NotNull
    private final w rendering;
    private final boolean showsPlaceholder;
    private final boolean usesFullHeight;

    static {
        w wVar = w.FACE_MATCH;
        x xVar = new x("WAITING_FOR_FACE_MATCH", 0, wVar, true, false);
        WAITING_FOR_FACE_MATCH = xVar;
        v vVar = new v("FACE_MATCHED", 1, wVar, false, false);
        FACE_MATCHED = vVar;
        t tVar = new t("FACE_CAPTURE", 2, w.CAPTURE, false, true);
        FACE_CAPTURE = tVar;
        u uVar = new u("FACE_CAPTURE_FAILED", 3, w.FRAME, false, false);
        FACE_CAPTURE_FAILED = uVar;
        y[] yVarArr = {xVar, vVar, tVar, uVar};
        $VALUES = yVarArr;
        $ENTRIES = vc.s.n(yVarArr);
        Companion = new s();
    }

    public y(String str, int i, w wVar, boolean z, boolean z3) {
        this.rendering = wVar;
        this.showsPlaceholder = z;
        this.usesFullHeight = z3;
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }

    public final w a() {
        return this.rendering;
    }

    public final boolean b() {
        return this.showsPlaceholder;
    }

    public final boolean c() {
        return this.usesFullHeight;
    }

    public abstract int d(float f, int i, int i2);
}
