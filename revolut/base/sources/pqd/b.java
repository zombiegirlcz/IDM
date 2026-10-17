package pqd;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CRYPTO;
    public static final b INVEST;
    public static final b SAVINGS;
    public static final b SPENDING;
    private final int color;

    static {
        b bVar = new b("SPENDING", 0, R$attr.uikit_colorBlue);
        SPENDING = bVar;
        b bVar2 = new b("SAVINGS", 1, R$attr.uikit_colorTerracotta);
        SAVINGS = bVar2;
        b bVar3 = new b("INVEST", 2, R$attr.uikit_colorLightBlue);
        INVEST = bVar3;
        b bVar4 = new b("CRYPTO", 3, R$attr.uikit_colorPurple);
        CRYPTO = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public b(String str, int i, int i2) {
        this.color = i2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int a() {
        return this.color;
    }
}
