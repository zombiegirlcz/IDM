package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class zb {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ zb[] $VALUES;
    public static final zb DEFAULT;

    @yhm.d
    public static final zb LEGACY;

    @NotNull
    private final yb noDescriptionLayout;

    @NotNull
    private final yb withDescriptionLayout;

    static {
        zb zbVar = new zb("LEGACY", 0, new xb(138.0f), new xb(82.0f));
        LEGACY = zbVar;
        zb zbVar2 = new zb("DEFAULT", 1, new xb(120.0f), wb.f54919a);
        DEFAULT = zbVar2;
        zb[] zbVarArr = {zbVar, zbVar2};
        $VALUES = zbVarArr;
        $ENTRIES = vc.s.n(zbVarArr);
    }

    public zb(String str, int i, xb xbVar, yb ybVar) {
        this.noDescriptionLayout = xbVar;
        this.withDescriptionLayout = ybVar;
    }

    public static zb valueOf(String str) {
        return (zb) Enum.valueOf(zb.class, str);
    }

    public static zb[] values() {
        return (zb[]) $VALUES.clone();
    }

    public final yb a() {
        return this.noDescriptionLayout;
    }

    public final yb b() {
        return this.withDescriptionLayout;
    }
}
