package mx0;

import android.content.Context;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public class r8 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r8[] $VALUES;
    public static final r8 REGULAR;
    public static final r8 REGULAR_FULLSCREEN;
    public static final r8 VOLUMETRIC;

    static {
        r8 r8Var = new r8() { // from class: mx0.p8
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // mx0.r8
            public final o8 a(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return (((Boolean) jo0.g.f176833q.getValue()).booleanValue() && ny0.i.c(context)) ? new o8(48.0f, 48.0f, 25.0f, 6.0f) : new o8(64.0f, 64.0f, 25.0f, 6.0f);
            }
        };
        REGULAR_FULLSCREEN = r8Var;
        r8 r8Var2 = new r8("REGULAR", 1);
        REGULAR = r8Var2;
        r8 r8Var3 = new r8() { // from class: mx0.q8
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // mx0.r8
            public final o8 a(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return (((Boolean) jo0.g.f176833q.getValue()).booleanValue() && ny0.i.c(context)) ? new o8(75.0f, 36.0f, 4.0f, 8.0f) : new o8(100.0f, 48.0f, 4.0f, 8.0f);
            }
        };
        VOLUMETRIC = r8Var3;
        r8[] r8VarArr = {r8Var, r8Var2, r8Var3};
        $VALUES = r8VarArr;
        $ENTRIES = vc.s.n(r8VarArr);
    }

    public static r8 valueOf(String str) {
        return (r8) Enum.valueOf(r8.class, str);
    }

    public static r8[] values() {
        return (r8[]) $VALUES.clone();
    }

    public o8 a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new o8(100.0f, 48.0f, 4.0f, 8.0f);
    }
}
