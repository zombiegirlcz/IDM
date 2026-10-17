package com.google.android.material.color.utilities;

import java.util.function.Function;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class e implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f49089b;

    public /* synthetic */ e(MaterialDynamicColors materialDynamicColors, int i) {
        this.f49088a = i;
        this.f49089b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj2) {
        switch (this.f49088a) {
            case 0:
                return this.f49089b.lambda$onPrimaryFixedVariant$116((DynamicScheme) obj2);
            case 1:
                return this.f49089b.lambda$tertiaryFixedDim$136((DynamicScheme) obj2);
            case 2:
                return this.f49089b.lambda$onTertiary$84((DynamicScheme) obj2);
            case 3:
                return this.f49089b.lambda$onError$96((DynamicScheme) obj2);
            case 4:
                return this.f49089b.lambda$onPrimaryContainer$62((DynamicScheme) obj2);
            case 5:
                return this.f49089b.lambda$onPrimaryContainer$63((DynamicScheme) obj2);
            case 6:
                return this.f49089b.lambda$secondaryFixedDim$122((DynamicScheme) obj2);
            case 7:
                return this.f49089b.lambda$primaryFixed$105((DynamicScheme) obj2);
            case 8:
                return this.f49089b.lambda$primaryFixedDim$108((DynamicScheme) obj2);
            case 9:
                return this.f49089b.lambda$tertiaryContainer$87((DynamicScheme) obj2);
            default:
                return this.f49089b.highestSurface((DynamicScheme) obj2);
        }
    }
}
