package com.google.android.material.color.utilities;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes16.dex */
public class Scheme {
    private int background;
    private int error;
    private int errorContainer;
    private int inverseOnSurface;
    private int inversePrimary;
    private int inverseSurface;
    private int onBackground;
    private int onError;
    private int onErrorContainer;
    private int onPrimary;
    private int onPrimaryContainer;
    private int onSecondary;
    private int onSecondaryContainer;
    private int onSurface;
    private int onSurfaceVariant;
    private int onTertiary;
    private int onTertiaryContainer;
    private int outline;
    private int outlineVariant;
    private int primary;
    private int primaryContainer;
    private int scrim;
    private int secondary;
    private int secondaryContainer;
    private int shadow;
    private int surface;
    private int surfaceVariant;
    private int tertiary;
    private int tertiaryContainer;

    public Scheme() {
    }

    public static Scheme dark(int i) {
        return darkFromCorePalette(CorePalette.of(i));
    }

    public static Scheme darkContent(int i) {
        return darkFromCorePalette(CorePalette.contentOf(i));
    }

    private static Scheme darkFromCorePalette(CorePalette corePalette) {
        return new Scheme().withPrimary(corePalette.a1.tone(80)).withOnPrimary(corePalette.a1.tone(20)).withPrimaryContainer(corePalette.a1.tone(30)).withOnPrimaryContainer(corePalette.a1.tone(90)).withSecondary(corePalette.f49064a2.tone(80)).withOnSecondary(corePalette.f49064a2.tone(20)).withSecondaryContainer(corePalette.f49064a2.tone(30)).withOnSecondaryContainer(corePalette.f49064a2.tone(90)).withTertiary(corePalette.f49065a3.tone(80)).withOnTertiary(corePalette.f49065a3.tone(20)).withTertiaryContainer(corePalette.f49065a3.tone(30)).withOnTertiaryContainer(corePalette.f49065a3.tone(90)).withError(corePalette.error.tone(80)).withOnError(corePalette.error.tone(20)).withErrorContainer(corePalette.error.tone(30)).withOnErrorContainer(corePalette.error.tone(80)).withBackground(corePalette.f49066n1.tone(10)).withOnBackground(corePalette.f49066n1.tone(90)).withSurface(corePalette.f49066n1.tone(10)).withOnSurface(corePalette.f49066n1.tone(90)).withSurfaceVariant(corePalette.f49067n2.tone(30)).withOnSurfaceVariant(corePalette.f49067n2.tone(80)).withOutline(corePalette.f49067n2.tone(60)).withOutlineVariant(corePalette.f49067n2.tone(30)).withShadow(corePalette.f49066n1.tone(0)).withScrim(corePalette.f49066n1.tone(0)).withInverseSurface(corePalette.f49066n1.tone(90)).withInverseOnSurface(corePalette.f49066n1.tone(20)).withInversePrimary(corePalette.a1.tone(40));
    }

    public static Scheme light(int i) {
        return lightFromCorePalette(CorePalette.of(i));
    }

    public static Scheme lightContent(int i) {
        return lightFromCorePalette(CorePalette.contentOf(i));
    }

    private static Scheme lightFromCorePalette(CorePalette corePalette) {
        return new Scheme().withPrimary(corePalette.a1.tone(40)).withOnPrimary(corePalette.a1.tone(100)).withPrimaryContainer(corePalette.a1.tone(90)).withOnPrimaryContainer(corePalette.a1.tone(10)).withSecondary(corePalette.f49064a2.tone(40)).withOnSecondary(corePalette.f49064a2.tone(100)).withSecondaryContainer(corePalette.f49064a2.tone(90)).withOnSecondaryContainer(corePalette.f49064a2.tone(10)).withTertiary(corePalette.f49065a3.tone(40)).withOnTertiary(corePalette.f49065a3.tone(100)).withTertiaryContainer(corePalette.f49065a3.tone(90)).withOnTertiaryContainer(corePalette.f49065a3.tone(10)).withError(corePalette.error.tone(40)).withOnError(corePalette.error.tone(100)).withErrorContainer(corePalette.error.tone(90)).withOnErrorContainer(corePalette.error.tone(10)).withBackground(corePalette.f49066n1.tone(99)).withOnBackground(corePalette.f49066n1.tone(10)).withSurface(corePalette.f49066n1.tone(99)).withOnSurface(corePalette.f49066n1.tone(10)).withSurfaceVariant(corePalette.f49067n2.tone(90)).withOnSurfaceVariant(corePalette.f49067n2.tone(30)).withOutline(corePalette.f49067n2.tone(50)).withOutlineVariant(corePalette.f49067n2.tone(80)).withShadow(corePalette.f49066n1.tone(0)).withScrim(corePalette.f49066n1.tone(0)).withInverseSurface(corePalette.f49066n1.tone(20)).withInverseOnSurface(corePalette.f49066n1.tone(95)).withInversePrimary(corePalette.a1.tone(80));
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Scheme) || !super.equals(obj2)) {
            return false;
        }
        Scheme scheme = (Scheme) obj2;
        return this.primary == scheme.primary && this.onPrimary == scheme.onPrimary && this.primaryContainer == scheme.primaryContainer && this.onPrimaryContainer == scheme.onPrimaryContainer && this.secondary == scheme.secondary && this.onSecondary == scheme.onSecondary && this.secondaryContainer == scheme.secondaryContainer && this.onSecondaryContainer == scheme.onSecondaryContainer && this.tertiary == scheme.tertiary && this.onTertiary == scheme.onTertiary && this.tertiaryContainer == scheme.tertiaryContainer && this.onTertiaryContainer == scheme.onTertiaryContainer && this.error == scheme.error && this.onError == scheme.onError && this.errorContainer == scheme.errorContainer && this.onErrorContainer == scheme.onErrorContainer && this.background == scheme.background && this.onBackground == scheme.onBackground && this.surface == scheme.surface && this.onSurface == scheme.onSurface && this.surfaceVariant == scheme.surfaceVariant && this.onSurfaceVariant == scheme.onSurfaceVariant && this.outline == scheme.outline && this.outlineVariant == scheme.outlineVariant && this.shadow == scheme.shadow && this.scrim == scheme.scrim && this.inverseSurface == scheme.inverseSurface && this.inverseOnSurface == scheme.inverseOnSurface && this.inversePrimary == scheme.inversePrimary;
    }

    public int getBackground() {
        return this.background;
    }

    public int getError() {
        return this.error;
    }

    public int getErrorContainer() {
        return this.errorContainer;
    }

    public int getInverseOnSurface() {
        return this.inverseOnSurface;
    }

    public int getInversePrimary() {
        return this.inversePrimary;
    }

    public int getInverseSurface() {
        return this.inverseSurface;
    }

    public int getOnBackground() {
        return this.onBackground;
    }

    public int getOnError() {
        return this.onError;
    }

    public int getOnErrorContainer() {
        return this.onErrorContainer;
    }

    public int getOnPrimary() {
        return this.onPrimary;
    }

    public int getOnPrimaryContainer() {
        return this.onPrimaryContainer;
    }

    public int getOnSecondary() {
        return this.onSecondary;
    }

    public int getOnSecondaryContainer() {
        return this.onSecondaryContainer;
    }

    public int getOnSurface() {
        return this.onSurface;
    }

    public int getOnSurfaceVariant() {
        return this.onSurfaceVariant;
    }

    public int getOnTertiary() {
        return this.onTertiary;
    }

    public int getOnTertiaryContainer() {
        return this.onTertiaryContainer;
    }

    public int getOutline() {
        return this.outline;
    }

    public int getOutlineVariant() {
        return this.outlineVariant;
    }

    public int getPrimary() {
        return this.primary;
    }

    public int getPrimaryContainer() {
        return this.primaryContainer;
    }

    public int getScrim() {
        return this.scrim;
    }

    public int getSecondary() {
        return this.secondary;
    }

    public int getSecondaryContainer() {
        return this.secondaryContainer;
    }

    public int getShadow() {
        return this.shadow;
    }

    public int getSurface() {
        return this.surface;
    }

    public int getSurfaceVariant() {
        return this.surfaceVariant;
    }

    public int getTertiary() {
        return this.tertiary;
    }

    public int getTertiaryContainer() {
        return this.tertiaryContainer;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.primary) * 31) + this.onPrimary) * 31) + this.primaryContainer) * 31) + this.onPrimaryContainer) * 31) + this.secondary) * 31) + this.onSecondary) * 31) + this.secondaryContainer) * 31) + this.onSecondaryContainer) * 31) + this.tertiary) * 31) + this.onTertiary) * 31) + this.tertiaryContainer) * 31) + this.onTertiaryContainer) * 31) + this.error) * 31) + this.onError) * 31) + this.errorContainer) * 31) + this.onErrorContainer) * 31) + this.background) * 31) + this.onBackground) * 31) + this.surface) * 31) + this.onSurface) * 31) + this.surfaceVariant) * 31) + this.onSurfaceVariant) * 31) + this.outline) * 31) + this.outlineVariant) * 31) + this.shadow) * 31) + this.scrim) * 31) + this.inverseSurface) * 31) + this.inverseOnSurface) * 31) + this.inversePrimary;
    }

    public void setBackground(int i) {
        this.background = i;
    }

    public void setError(int i) {
        this.error = i;
    }

    public void setErrorContainer(int i) {
        this.errorContainer = i;
    }

    public void setInverseOnSurface(int i) {
        this.inverseOnSurface = i;
    }

    public void setInversePrimary(int i) {
        this.inversePrimary = i;
    }

    public void setInverseSurface(int i) {
        this.inverseSurface = i;
    }

    public void setOnBackground(int i) {
        this.onBackground = i;
    }

    public void setOnError(int i) {
        this.onError = i;
    }

    public void setOnErrorContainer(int i) {
        this.onErrorContainer = i;
    }

    public void setOnPrimary(int i) {
        this.onPrimary = i;
    }

    public void setOnPrimaryContainer(int i) {
        this.onPrimaryContainer = i;
    }

    public void setOnSecondary(int i) {
        this.onSecondary = i;
    }

    public void setOnSecondaryContainer(int i) {
        this.onSecondaryContainer = i;
    }

    public void setOnSurface(int i) {
        this.onSurface = i;
    }

    public void setOnSurfaceVariant(int i) {
        this.onSurfaceVariant = i;
    }

    public void setOnTertiary(int i) {
        this.onTertiary = i;
    }

    public void setOnTertiaryContainer(int i) {
        this.onTertiaryContainer = i;
    }

    public void setOutline(int i) {
        this.outline = i;
    }

    public void setOutlineVariant(int i) {
        this.outlineVariant = i;
    }

    public void setPrimary(int i) {
        this.primary = i;
    }

    public void setPrimaryContainer(int i) {
        this.primaryContainer = i;
    }

    public void setScrim(int i) {
        this.scrim = i;
    }

    public void setSecondary(int i) {
        this.secondary = i;
    }

    public void setSecondaryContainer(int i) {
        this.secondaryContainer = i;
    }

    public void setShadow(int i) {
        this.shadow = i;
    }

    public void setSurface(int i) {
        this.surface = i;
    }

    public void setSurfaceVariant(int i) {
        this.surfaceVariant = i;
    }

    public void setTertiary(int i) {
        this.tertiary = i;
    }

    public void setTertiaryContainer(int i) {
        this.tertiaryContainer = i;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("Scheme{primary=");
        sb6.append(this.primary);
        sb6.append(", onPrimary=");
        sb6.append(this.onPrimary);
        sb6.append(", primaryContainer=");
        sb6.append(this.primaryContainer);
        sb6.append(", onPrimaryContainer=");
        sb6.append(this.onPrimaryContainer);
        sb6.append(", secondary=");
        sb6.append(this.secondary);
        sb6.append(", onSecondary=");
        sb6.append(this.onSecondary);
        sb6.append(", secondaryContainer=");
        sb6.append(this.secondaryContainer);
        sb6.append(", onSecondaryContainer=");
        sb6.append(this.onSecondaryContainer);
        sb6.append(", tertiary=");
        sb6.append(this.tertiary);
        sb6.append(", onTertiary=");
        sb6.append(this.onTertiary);
        sb6.append(", tertiaryContainer=");
        sb6.append(this.tertiaryContainer);
        sb6.append(", onTertiaryContainer=");
        sb6.append(this.onTertiaryContainer);
        sb6.append(", error=");
        sb6.append(this.error);
        sb6.append(", onError=");
        sb6.append(this.onError);
        sb6.append(", errorContainer=");
        sb6.append(this.errorContainer);
        sb6.append(", onErrorContainer=");
        sb6.append(this.onErrorContainer);
        sb6.append(", background=");
        sb6.append(this.background);
        sb6.append(", onBackground=");
        sb6.append(this.onBackground);
        sb6.append(", surface=");
        sb6.append(this.surface);
        sb6.append(", onSurface=");
        sb6.append(this.onSurface);
        sb6.append(", surfaceVariant=");
        sb6.append(this.surfaceVariant);
        sb6.append(", onSurfaceVariant=");
        sb6.append(this.onSurfaceVariant);
        sb6.append(", outline=");
        sb6.append(this.outline);
        sb6.append(", outlineVariant=");
        sb6.append(this.outlineVariant);
        sb6.append(", shadow=");
        sb6.append(this.shadow);
        sb6.append(", scrim=");
        sb6.append(this.scrim);
        sb6.append(", inverseSurface=");
        sb6.append(this.inverseSurface);
        sb6.append(", inverseOnSurface=");
        sb6.append(this.inverseOnSurface);
        sb6.append(", inversePrimary=");
        return j6.a.t(sb6, this.inversePrimary, CoreConstants.CURLY_RIGHT);
    }

    public Scheme withBackground(int i) {
        this.background = i;
        return this;
    }

    public Scheme withError(int i) {
        this.error = i;
        return this;
    }

    public Scheme withErrorContainer(int i) {
        this.errorContainer = i;
        return this;
    }

    public Scheme withInverseOnSurface(int i) {
        this.inverseOnSurface = i;
        return this;
    }

    public Scheme withInversePrimary(int i) {
        this.inversePrimary = i;
        return this;
    }

    public Scheme withInverseSurface(int i) {
        this.inverseSurface = i;
        return this;
    }

    public Scheme withOnBackground(int i) {
        this.onBackground = i;
        return this;
    }

    public Scheme withOnError(int i) {
        this.onError = i;
        return this;
    }

    public Scheme withOnErrorContainer(int i) {
        this.onErrorContainer = i;
        return this;
    }

    public Scheme withOnPrimary(int i) {
        this.onPrimary = i;
        return this;
    }

    public Scheme withOnPrimaryContainer(int i) {
        this.onPrimaryContainer = i;
        return this;
    }

    public Scheme withOnSecondary(int i) {
        this.onSecondary = i;
        return this;
    }

    public Scheme withOnSecondaryContainer(int i) {
        this.onSecondaryContainer = i;
        return this;
    }

    public Scheme withOnSurface(int i) {
        this.onSurface = i;
        return this;
    }

    public Scheme withOnSurfaceVariant(int i) {
        this.onSurfaceVariant = i;
        return this;
    }

    public Scheme withOnTertiary(int i) {
        this.onTertiary = i;
        return this;
    }

    public Scheme withOnTertiaryContainer(int i) {
        this.onTertiaryContainer = i;
        return this;
    }

    public Scheme withOutline(int i) {
        this.outline = i;
        return this;
    }

    public Scheme withOutlineVariant(int i) {
        this.outlineVariant = i;
        return this;
    }

    public Scheme withPrimary(int i) {
        this.primary = i;
        return this;
    }

    public Scheme withPrimaryContainer(int i) {
        this.primaryContainer = i;
        return this;
    }

    public Scheme withScrim(int i) {
        this.scrim = i;
        return this;
    }

    public Scheme withSecondary(int i) {
        this.secondary = i;
        return this;
    }

    public Scheme withSecondaryContainer(int i) {
        this.secondaryContainer = i;
        return this;
    }

    public Scheme withShadow(int i) {
        this.shadow = i;
        return this;
    }

    public Scheme withSurface(int i) {
        this.surface = i;
        return this;
    }

    public Scheme withSurfaceVariant(int i) {
        this.surfaceVariant = i;
        return this;
    }

    public Scheme withTertiary(int i) {
        this.tertiary = i;
        return this;
    }

    public Scheme withTertiaryContainer(int i) {
        this.tertiaryContainer = i;
        return this;
    }

    public Scheme(int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32, int i33, int i43, int i59, int i66, int i74, int i92, int i96, int i99, int i100, int i101, int i102, int i103, int i104, int i105, int i106, int i107, int i108, int i109, int i110, int i111, int i112) {
        this.primary = i;
        this.onPrimary = i2;
        this.primaryContainer = i3;
        this.onPrimaryContainer = i5;
        this.secondary = i6;
        this.onSecondary = i21;
        this.secondaryContainer = i22;
        this.onSecondaryContainer = i32;
        this.tertiary = i33;
        this.onTertiary = i43;
        this.tertiaryContainer = i59;
        this.onTertiaryContainer = i66;
        this.error = i74;
        this.onError = i92;
        this.errorContainer = i96;
        this.onErrorContainer = i99;
        this.background = i100;
        this.onBackground = i101;
        this.surface = i102;
        this.onSurface = i103;
        this.surfaceVariant = i104;
        this.onSurfaceVariant = i105;
        this.outline = i106;
        this.outlineVariant = i107;
        this.shadow = i108;
        this.scrim = i109;
        this.inverseSurface = i110;
        this.inverseOnSurface = i111;
        this.inversePrimary = i112;
    }
}
