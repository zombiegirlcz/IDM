package du0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d DEFAULT;
    public static final d SHIMMER;
    private final int askColor;
    private final int bidColor;
    private final float gradientAlpha;

    static {
        d dVar = new d("DEFAULT", 0, 0.4f, R$attr.uikit_colorPerformancePositive, R$attr.uikit_colorPerformanceNegative);
        DEFAULT = dVar;
        int i = R$attr.uikit_colorShimmer;
        d dVar2 = new d("SHIMMER", 1, BitmapDescriptorFactory.HUE_RED, i, i);
        SHIMMER = dVar2;
        d[] dVarArr = {dVar, dVar2};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public d(String str, int i, float f, int i2, int i3) {
        this.bidColor = i2;
        this.askColor = i3;
        this.gradientAlpha = f;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final int a() {
        return this.askColor;
    }

    public final int b() {
        return this.bidColor;
    }

    public final float c() {
        return this.gradientAlpha;
    }
}
