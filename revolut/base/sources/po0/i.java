package po0;

import androidx.core.graphics.ColorUtils;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import zhm.q0;
import zhm.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class i implements l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;

    @NotNull
    public static final g Companion;
    public static final i METAL;
    public static final i PREMIUM;
    public static final i PRIVATE;
    public static final i ULTRA;
    public static final i ULTRA_CX;

    @NotNull
    private static final Map<i, String> planDarkRevampedCdnNames;

    @NotNull
    private static final Map<i, String> planLightRevampedCdnNames;

    @NotNull
    private final String cdnName;

    static {
        i iVar = new i("PREMIUM", 0, "premium_background");
        PREMIUM = iVar;
        i iVar2 = new i("METAL", 1, "metal_background");
        METAL = iVar2;
        i iVar3 = new i("ULTRA", 2, "ultra_background");
        ULTRA = iVar3;
        i iVar4 = new i("ULTRA_CX", 3, "ultra_background_cx");
        ULTRA_CX = iVar4;
        i iVar5 = new i("PRIVATE", 4, "private_background");
        PRIVATE = iVar5;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5};
        $VALUES = iVarArr;
        $ENTRIES = vc.s.n(iVarArr);
        Companion = new g();
        planDarkRevampedCdnNames = r0.k(new Pair(iVar, a0.d.r(iVar.cdnName, "_v2")), new Pair(iVar2, a0.d.r(iVar2.cdnName, "_v2")), new Pair(iVar3, a0.d.r(iVar3.cdnName, "_v2")));
        planLightRevampedCdnNames = q0.c(new Pair(iVar3, a0.d.r(iVar3.cdnName, "_v2")));
    }

    public i(String str, int i, String str2) {
        this.cdnName = str2;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // po0.l
    public final int a(boolean z) {
        boolean zBooleanValue = ((Boolean) jo0.g.o.getValue()).booleanValue();
        if (!z) {
            int i = h.f237853a[ordinal()];
            if (i == 1) {
                return io0.c.e(0.3f, 11057868, 9417111);
            }
            if (i == 2) {
                return io0.c.e(0.25f, 16777215, 14272158);
            }
            if (i == 3) {
                return zBooleanValue ? io0.c.e(0.35f, 14871039, 3623280) : io0.c.e(0.15f, 9937336, 16250871);
            }
            if (i == 4) {
                return io0.c.e(0.15f, 9871544, 16250871);
            }
            if (i == 5) {
                return io0.c.e(0.5f, 13224397, 9143938);
            }
            throw new NoWhenBranchMatchedException();
        }
        int i2 = h.f237853a[ordinal()];
        if (i2 == 1) {
            int[] iArr = io0.c.f163133a;
            return io0.c.e(0.35f, 6256783, ColorUtils.blendARGB(io0.a.d(1.0f, 6914931), io0.a.d(1.0f, 3424569), 0.5f));
        }
        if (i2 == 2) {
            return io0.c.e(0.35f, 9011576, 7561553);
        }
        if (i2 == 3) {
            return zBooleanValue ? io0.c.e(0.35f, 464217, 8621219) : io0.c.e(0.1f, 6716588, 0);
        }
        if (i2 == 4) {
            return io0.c.e(0.1f, 3623545, 0);
        }
        if (i2 == 5) {
            return io0.c.e(0.3f, 7434611, 0);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // po0.l
    public final LottieImage b(boolean z, boolean z3) {
        String str;
        boolean zBooleanValue = ((Boolean) jo0.g.o.getValue()).booleanValue();
        LottieImage.Companion companion = LottieImage.INSTANCE;
        String strConcat = "mobile/premium/plan_animations/".concat(z ? "dark" : "light");
        if (zBooleanValue) {
            str = (z ? planDarkRevampedCdnNames : planLightRevampedCdnNames).get(this);
            if (str == null) {
                str = this.cdnName;
            }
        } else {
            str = this.cdnName;
        }
        return LottieImage.Companion.a(companion, uc0.b.a(strConcat, str), false, false, null, null, 254);
    }
}
