package cv0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a SIZE_24;
    public static final a SIZE_28;
    private final float borderWidth;
    private final float height;
    private final float paddings;
    private final float paddingsSmall;
    private final int textAppearance;

    static {
        a aVar = new a("SIZE_24", 0, 24.0f, 8.0f, 6.0f, 1.0f, R$attr.internal_textAppearanceEmphasis4);
        SIZE_24 = aVar;
        a aVar2 = new a("SIZE_28", 1, 28.0f, 12.0f, 8.0f, 2.0f, R$attr.internal_textAppearanceEmphasis2);
        SIZE_28 = aVar2;
        a[] aVarArr = {aVar, aVar2};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, float f, float f4, float f5, float f6, int i2) {
        this.height = f;
        this.paddings = f4;
        this.paddingsSmall = f5;
        this.borderWidth = f6;
        this.textAppearance = i2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final float a() {
        return this.borderWidth;
    }

    public final float b() {
        return this.height;
    }

    public final float c() {
        return this.paddings;
    }

    public final float d() {
        return this.paddingsSmall;
    }

    public final int e() {
        return this.textAppearance;
    }
}
