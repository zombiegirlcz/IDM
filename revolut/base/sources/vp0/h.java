package vp0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h CARD;
    public static final h HOME;
    private final float animationDurationSec;
    private final long pauseAfterFirstFrameMs;
    private final float spreadXDp;
    private final float spreadYDp;
    private final boolean usePixelCopyForSnapshot;

    static {
        h hVar = new h("HOME", 0, 0.8f, 50.0f, 100.0f, true, 144L);
        HOME = hVar;
        h hVar2 = new h("CARD", 1, 0.4f, 20.0f, 30.0f, false, 0L);
        CARD = hVar2;
        h[] hVarArr = {hVar, hVar2};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
    }

    public h(String str, int i, float f, float f4, float f5, boolean z, long j2) {
        this.animationDurationSec = f;
        this.spreadXDp = f4;
        this.spreadYDp = f5;
        this.usePixelCopyForSnapshot = z;
        this.pauseAfterFirstFrameMs = j2;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final float a() {
        return this.animationDurationSec;
    }

    public final long b() {
        return this.pauseAfterFirstFrameMs;
    }

    public final float c() {
        return this.spreadXDp;
    }

    public final float d() {
        return this.spreadYDp;
    }

    public final boolean e() {
        return this.usePixelCopyForSnapshot;
    }
}
