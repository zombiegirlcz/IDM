package com.google.android.material.color.utilities;

import java.util.function.Function;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class a implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f49084b;

    public /* synthetic */ a(MaterialDynamicColors materialDynamicColors, int i) {
        this.f49083a = i;
        this.f49084b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj2) {
        switch (this.f49083a) {
            case 0:
                return this.f49084b.lambda$onSecondary$72((DynamicScheme) obj2);
            case 1:
                return this.f49084b.lambda$secondary$69((DynamicScheme) obj2);
            case 2:
                return this.f49084b.lambda$onSecondaryFixed$125((DynamicScheme) obj2);
            case 3:
                return this.f49084b.lambda$onSecondaryFixed$126((DynamicScheme) obj2);
            case 4:
                return this.f49084b.lambda$inverseOnSurface$41((DynamicScheme) obj2);
            case 5:
                return this.f49084b.lambda$onTertiaryContainer$89((DynamicScheme) obj2);
            case 6:
                return this.f49084b.lambda$onTertiaryContainer$90((DynamicScheme) obj2);
            case 7:
                return this.f49084b.lambda$onSecondaryContainer$77((DynamicScheme) obj2);
            case 8:
                return this.f49084b.lambda$onSecondaryContainer$78((DynamicScheme) obj2);
            case 9:
                return this.f49084b.lambda$onPrimaryFixed$111((DynamicScheme) obj2);
            case 10:
                return this.f49084b.lambda$onPrimaryFixed$112((DynamicScheme) obj2);
            case 11:
                return this.f49084b.lambda$error$93((DynamicScheme) obj2);
            case 12:
                return this.f49084b.lambda$onErrorContainer$102((DynamicScheme) obj2);
            case 13:
                return this.f49084b.lambda$errorContainer$99((DynamicScheme) obj2);
            case 14:
                return this.f49084b.lambda$tertiaryFixed$133((DynamicScheme) obj2);
            case 15:
                return this.f49084b.lambda$primary$54((DynamicScheme) obj2);
            case 16:
                return this.f49084b.lambda$onSecondaryFixedVariant$129((DynamicScheme) obj2);
            case 17:
                return this.f49084b.lambda$onSecondaryFixedVariant$130((DynamicScheme) obj2);
            case 18:
                return this.f49084b.lambda$tertiary$81((DynamicScheme) obj2);
            case 19:
                return this.f49084b.lambda$onTertiaryFixedVariant$143((DynamicScheme) obj2);
            case 20:
                return this.f49084b.lambda$onTertiaryFixedVariant$144((DynamicScheme) obj2);
            case 21:
                return this.f49084b.lambda$secondaryContainer$75((DynamicScheme) obj2);
            case 22:
                return this.f49084b.lambda$onTertiaryFixed$139((DynamicScheme) obj2);
            case 23:
                return this.f49084b.lambda$onTertiaryFixed$140((DynamicScheme) obj2);
            case 24:
                return this.f49084b.lambda$primaryContainer$60((DynamicScheme) obj2);
            case 25:
                return this.f49084b.lambda$onBackground$14((DynamicScheme) obj2);
            case 26:
                return this.f49084b.lambda$onPrimary$57((DynamicScheme) obj2);
            case 27:
                return this.f49084b.lambda$inversePrimary$66((DynamicScheme) obj2);
            case 28:
                return this.f49084b.lambda$secondaryFixed$119((DynamicScheme) obj2);
            default:
                return this.f49084b.lambda$onPrimaryFixedVariant$115((DynamicScheme) obj2);
        }
    }
}
