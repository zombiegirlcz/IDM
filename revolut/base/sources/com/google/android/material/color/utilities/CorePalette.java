package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes16.dex */
public final class CorePalette {
    public TonalPalette a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public TonalPalette f49064a2;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public TonalPalette f49065a3;
    public TonalPalette error;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public TonalPalette f49066n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public TonalPalette f49067n2;

    private CorePalette(int i, boolean z) {
        Hct hctFromInt = Hct.fromInt(i);
        double hue2 = hctFromInt.getHue();
        double chroma = hctFromInt.getChroma();
        if (z) {
            this.a1 = TonalPalette.fromHueAndChroma(hue2, chroma);
            this.f49064a2 = TonalPalette.fromHueAndChroma(hue2, chroma / 3.0d);
            this.f49065a3 = TonalPalette.fromHueAndChroma(60.0d + hue2, chroma / 2.0d);
            this.f49066n1 = TonalPalette.fromHueAndChroma(hue2, Math.min(chroma / 12.0d, 4.0d));
            this.f49067n2 = TonalPalette.fromHueAndChroma(hue2, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.a1 = TonalPalette.fromHueAndChroma(hue2, Math.max(48.0d, chroma));
            this.f49064a2 = TonalPalette.fromHueAndChroma(hue2, 16.0d);
            this.f49065a3 = TonalPalette.fromHueAndChroma(60.0d + hue2, 24.0d);
            this.f49066n1 = TonalPalette.fromHueAndChroma(hue2, 4.0d);
            this.f49067n2 = TonalPalette.fromHueAndChroma(hue2, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }

    public static CorePalette contentOf(int i) {
        return new CorePalette(i, true);
    }

    public static CorePalette of(int i) {
        return new CorePalette(i, false);
    }
}
