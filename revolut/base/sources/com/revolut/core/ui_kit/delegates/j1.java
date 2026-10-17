package com.revolut.core.ui_kit.delegates;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class j1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j1[] $VALUES;
    public static final j1 HORIZONTAL;
    public static final j1 VERTICAL;
    private final float avatarGapDp;
    private final float bottomAssetGapDp;
    private final float minHeightDp;

    static {
        j1 j1Var = new j1("VERTICAL", 0, 196.0f, BitmapDescriptorFactory.HUE_RED, 16.0f);
        VERTICAL = j1Var;
        j1 j1Var2 = new j1("HORIZONTAL", 1, 124.0f, 8.0f, 12.0f);
        HORIZONTAL = j1Var2;
        j1[] j1VarArr = {j1Var, j1Var2};
        $VALUES = j1VarArr;
        $ENTRIES = vc.s.n(j1VarArr);
    }

    public j1(String str, int i, float f, float f4, float f5) {
        this.minHeightDp = f;
        this.avatarGapDp = f4;
        this.bottomAssetGapDp = f5;
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) $VALUES.clone();
    }

    public final float a() {
        return this.avatarGapDp;
    }

    public final float b() {
        return this.bottomAssetGapDp;
    }

    public final float c() {
        return this.minHeightDp;
    }
}
