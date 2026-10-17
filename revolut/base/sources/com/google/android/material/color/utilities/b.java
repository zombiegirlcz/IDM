package com.google.android.material.color.utilities;

import java.util.function.Function;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class b implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49085a;

    public /* synthetic */ b(int i) {
        this.f49085a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj2) {
        DynamicScheme dynamicScheme = (DynamicScheme) obj2;
        switch (this.f49085a) {
            case 0:
                return MaterialDynamicColors.lambda$onSurfaceVariant$36(dynamicScheme);
            case 1:
                return MaterialDynamicColors.lambda$inverseSurface$37(dynamicScheme);
            case 2:
                return MaterialDynamicColors.lambda$inverseSurface$38(dynamicScheme);
            case 3:
                return MaterialDynamicColors.lambda$surfaceDim$18(dynamicScheme);
            case 4:
                return dynamicScheme.errorPalette;
            case 5:
                return MaterialDynamicColors.lambda$onErrorContainer$101(dynamicScheme);
            case 6:
                return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverse$154(dynamicScheme);
            case 7:
                return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverse$155(dynamicScheme);
            case 8:
                return MaterialDynamicColors.lambda$errorContainer$97(dynamicScheme);
            case 9:
                return MaterialDynamicColors.lambda$errorContainer$98(dynamicScheme);
            case 10:
                return dynamicScheme.tertiaryPalette;
            case 11:
                return MaterialDynamicColors.lambda$tertiaryFixed$132(dynamicScheme);
            case 12:
                return MaterialDynamicColors.lambda$controlNormal$147(dynamicScheme);
            case 13:
                return dynamicScheme.primaryPalette;
            case 14:
                return MaterialDynamicColors.lambda$primary$53(dynamicScheme);
            case 15:
                return dynamicScheme.neutralPalette;
            case 16:
                return MaterialDynamicColors.lambda$scrim$49(dynamicScheme);
            case 17:
                return dynamicScheme.secondaryPalette;
            case 18:
                return MaterialDynamicColors.lambda$onSecondaryFixedVariant$128(dynamicScheme);
            case 19:
                return MaterialDynamicColors.lambda$controlNormal$148(dynamicScheme);
            case 20:
                return MaterialDynamicColors.lambda$tertiary$79(dynamicScheme);
            case 21:
                return MaterialDynamicColors.lambda$tertiary$80(dynamicScheme);
            case 22:
                return MaterialDynamicColors.lambda$controlActivated$145(dynamicScheme);
            case 23:
                return MaterialDynamicColors.lambda$controlActivated$146(dynamicScheme);
            case 24:
                return MaterialDynamicColors.lambda$primaryPaletteKeyColor$0(dynamicScheme);
            case 25:
                return MaterialDynamicColors.lambda$primaryPaletteKeyColor$1(dynamicScheme);
            case 26:
                return MaterialDynamicColors.lambda$surface$16(dynamicScheme);
            case 27:
                return MaterialDynamicColors.lambda$onTertiaryFixedVariant$141(dynamicScheme);
            case 28:
                return MaterialDynamicColors.lambda$onTertiaryFixedVariant$142(dynamicScheme);
            default:
                return MaterialDynamicColors.lambda$secondaryPaletteKeyColor$2(dynamicScheme);
        }
    }
}
