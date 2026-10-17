package tq0;

import com.revolut.core.ui_kit.R$drawable;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d END;
    public static final d MID;
    public static final d SINGLE;
    public static final d START;
    private final int backgroundRes;

    static {
        d dVar = new d("START", 0, R$drawable.internal_grid_highlight_start);
        START = dVar;
        d dVar2 = new d("MID", 1, R$drawable.internal_grid_highlight_mid);
        MID = dVar2;
        d dVar3 = new d("END", 2, R$drawable.internal_grid_highlight_end);
        END = dVar3;
        d dVar4 = new d("SINGLE", 3, R$drawable.internal_grid_highlight_single);
        SINGLE = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public d(String str, int i, int i2) {
        this.backgroundRes = i2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final int a() {
        return this.backgroundRes;
    }
}
