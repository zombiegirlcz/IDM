package com.fourthline.vision.internal;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
final class vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vd f37019a = new vd("PROCESSING", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final vd f37020b = new vd("FAILED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final vd f37021c = new vd("SUCCEED", 2);
    private static final /* synthetic */ vd[] d;
    private static final /* synthetic */ EnumEntries e;

    private static final /* synthetic */ vd[] $values() {
        return new vd[]{f37019a, f37020b, f37021c};
    }

    static {
        vd[] vdVarArr$values = $values();
        d = vdVarArr$values;
        e = vc.s.n(vdVarArr$values);
    }

    private vd(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return e;
    }

    public static vd valueOf(String str) {
        return (vd) Enum.valueOf(vd.class, str);
    }

    public static vd[] values() {
        return (vd[]) d.clone();
    }
}
