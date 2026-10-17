package com.fourthline.vision.internal;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final me f36578a = new me("DOCUMENT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final me f36579b = new me("SELFIE_CAPTURE", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final me f36580c = new me("SELFIE_LIVENESS", 2);
    private static final /* synthetic */ me[] d;
    private static final /* synthetic */ EnumEntries e;

    private static final /* synthetic */ me[] $values() {
        return new me[]{f36578a, f36579b, f36580c};
    }

    static {
        me[] meVarArr$values = $values();
        d = meVarArr$values;
        e = vc.s.n(meVarArr$values);
    }

    private me(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return e;
    }

    public static me valueOf(String str) {
        return (me) Enum.valueOf(me.class, str);
    }

    public static me[] values() {
        return (me[]) d.clone();
    }
}
