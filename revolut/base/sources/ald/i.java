package ald;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6229a;

    public /* synthetic */ i(int i) {
        this.f6229a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj2) {
        switch (this.f6229a) {
            case 0:
                a0.d.B(obj2);
                throw null;
            case 1:
                return ((DynamicScheme) obj2).neutralPalette;
            case 2:
                return ((DynamicScheme) obj2).secondaryPalette;
            case 3:
                return MaterialDynamicColors.lambda$onSecondary$71((DynamicScheme) obj2);
            case 4:
                return ((DynamicScheme) obj2).secondaryPalette;
            case 5:
                return MaterialDynamicColors.lambda$secondary$68((DynamicScheme) obj2);
            case 6:
                return ((DynamicScheme) obj2).neutralPalette;
            case 7:
                return MaterialDynamicColors.lambda$surfaceContainerLowest$22((DynamicScheme) obj2);
            case 8:
                return ((DynamicScheme) obj2).neutralVariantPalette;
            case 9:
                return MaterialDynamicColors.lambda$outline$43((DynamicScheme) obj2);
            case 10:
                return ((DynamicScheme) obj2).neutralPalette;
            case 11:
                return ((DynamicScheme) obj2).primaryPalette;
            case 12:
                return MaterialDynamicColors.lambda$surfaceTint$51((DynamicScheme) obj2);
            case 13:
                return ((DynamicScheme) obj2).secondaryPalette;
            case 14:
                return MaterialDynamicColors.lambda$onSecondaryFixed$124((DynamicScheme) obj2);
            case 15:
                return ((DynamicScheme) obj2).neutralPalette;
            case 16:
                return MaterialDynamicColors.lambda$inverseOnSurface$40((DynamicScheme) obj2);
            case 17:
                return ((DynamicScheme) obj2).tertiaryPalette;
            case 18:
                return MaterialDynamicColors.lambda$neutralPaletteKeyColor$7((DynamicScheme) obj2);
            case 19:
                return ((DynamicScheme) obj2).secondaryPalette;
            case 20:
                return ((DynamicScheme) obj2).primaryPalette;
            case 21:
                return MaterialDynamicColors.lambda$onPrimaryFixed$110((DynamicScheme) obj2);
            case 22:
                return ((DynamicScheme) obj2).errorPalette;
            case 23:
                return ((DynamicScheme) obj2).neutralPalette;
            case 24:
                return MaterialDynamicColors.lambda$error$92((DynamicScheme) obj2);
            case 25:
                return ((DynamicScheme) obj2).neutralPalette;
            case 26:
                return MaterialDynamicColors.lambda$textPrimaryInverse$153((DynamicScheme) obj2);
            case 27:
                return ((DynamicScheme) obj2).neutralPalette;
            case 28:
                return MaterialDynamicColors.lambda$surfaceContainer$26((DynamicScheme) obj2);
            default:
                return ((DynamicScheme) obj2).neutralVariantPalette;
        }
    }

    public /* synthetic */ i(aik.d dVar) {
        this.f6229a = 0;
    }
}
