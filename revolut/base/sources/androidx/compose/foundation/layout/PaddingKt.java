package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a;\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\b\u0010\u0012\u001a\u001b\u0010\u0015\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0017\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a7\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "start", "top", "end", "bottom", "padding-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "padding", "horizontal", "vertical", "padding-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "all", "padding-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "calculateStartPadding", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateEndPadding", "PaddingValues-0680j_4", "(F)Landroidx/compose/foundation/layout/PaddingValues;", "PaddingValues", "PaddingValues-YgX7TsA", "(FF)Landroidx/compose/foundation/layout/PaddingValues;", "PaddingValues-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "foundation-layout"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class PaddingKt {
    @NotNull
    /* JADX INFO: renamed from: PaddingValues-0680j_4, reason: not valid java name */
    public static final PaddingValues m857PaddingValues0680j_4(float f) {
        return new PaddingValuesImpl(f, f, f, f, null);
    }

    @NotNull
    /* JADX INFO: renamed from: PaddingValues-YgX7TsA, reason: not valid java name */
    public static final PaddingValues m858PaddingValuesYgX7TsA(float f, float f4) {
        return new PaddingValuesImpl(f, f4, f, f4, null);
    }

    /* JADX INFO: renamed from: PaddingValues-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m859PaddingValuesYgX7TsA$default(float f, float f4, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = Dp.m3297constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f4 = Dp.m3297constructorimpl(0);
        }
        return m858PaddingValuesYgX7TsA(f, f4);
    }

    @NotNull
    /* JADX INFO: renamed from: PaddingValues-a9UjIt4, reason: not valid java name */
    public static final PaddingValues m860PaddingValuesa9UjIt4(float f, float f4, float f5, float f6) {
        return new PaddingValuesImpl(f, f4, f5, f6, null);
    }

    /* JADX INFO: renamed from: PaddingValues-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m861PaddingValuesa9UjIt4$default(float f, float f4, float f5, float f6, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = Dp.m3297constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f4 = Dp.m3297constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f5 = Dp.m3297constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f6 = Dp.m3297constructorimpl(0);
        }
        return m860PaddingValuesa9UjIt4(f, f4, f5, f6);
    }

    public static final float calculateEndPadding(@NotNull PaddingValues paddingValues, @NotNull LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo851calculateRightPaddingu2uoSUM(layoutDirection) : paddingValues.mo850calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    public static final float calculateStartPadding(@NotNull PaddingValues paddingValues, @NotNull LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo850calculateLeftPaddingu2uoSUM(layoutDirection) : paddingValues.mo851calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @NotNull
    public static final Modifier padding(@NotNull Modifier modifier, @NotNull PaddingValues paddingValues) {
        return modifier.then(new PaddingValuesElement(paddingValues, new hw9.a(paddingValues, 23)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit padding$lambda$0(PaddingValues paddingValues, InspectorInfo inspectorInfo) {
        inspectorInfo.setName("padding");
        inspectorInfo.getProperties().set("paddingValues", paddingValues);
        return Unit.f186387a;
    }

    @NotNull
    /* JADX INFO: renamed from: padding-3ABfNKs, reason: not valid java name */
    public static final Modifier m862padding3ABfNKs(@NotNull Modifier modifier, float f) {
        return modifier.then(new PaddingElement(f, f, f, f, true, new i1.h(f, 0), null));
    }

    @NotNull
    /* JADX INFO: renamed from: padding-VpY3zN4, reason: not valid java name */
    public static final Modifier m863paddingVpY3zN4(@NotNull Modifier modifier, float f, float f4) {
        return modifier.then(new PaddingElement(f, f4, f, f4, true, new i1.f(f, f4, 1), null));
    }

    /* JADX INFO: renamed from: padding-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m864paddingVpY3zN4$default(Modifier modifier, float f, float f4, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = Dp.m3297constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f4 = Dp.m3297constructorimpl(0);
        }
        return m863paddingVpY3zN4(modifier, f, f4);
    }

    @NotNull
    /* JADX INFO: renamed from: padding-qDBjuR0, reason: not valid java name */
    public static final Modifier m865paddingqDBjuR0(@NotNull Modifier modifier, final float f, final float f4, final float f5, final float f6) {
        return modifier.then(new PaddingElement(f, f4, f5, f6, true, new Function1() { // from class: i1.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return PaddingKt.padding_qDBjuR0$lambda$0(f, f4, f5, f6, (InspectorInfo) obj2);
            }
        }, null));
    }

    /* JADX INFO: renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m866paddingqDBjuR0$default(Modifier modifier, float f, float f4, float f5, float f6, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = Dp.m3297constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f4 = Dp.m3297constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f5 = Dp.m3297constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f6 = Dp.m3297constructorimpl(0);
        }
        return m865paddingqDBjuR0(modifier, f, f4, f5, f6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit padding_3ABfNKs$lambda$0(float f, InspectorInfo inspectorInfo) {
        inspectorInfo.setName("padding");
        inspectorInfo.setValue(Dp.m3295boximpl(f));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit padding_VpY3zN4$lambda$0(float f, float f4, InspectorInfo inspectorInfo) {
        inspectorInfo.setName("padding");
        com.revolut.data.database.models.openbanking.d.h(f, inspectorInfo.getProperties(), "horizontal", inspectorInfo).set("vertical", Dp.m3295boximpl(f4));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit padding_qDBjuR0$lambda$0(float f, float f4, float f5, float f6, InspectorInfo inspectorInfo) {
        inspectorInfo.setName("padding");
        com.revolut.data.database.models.openbanking.d.h(f5, com.revolut.data.database.models.openbanking.d.h(f4, com.revolut.data.database.models.openbanking.d.h(f, inspectorInfo.getProperties(), "start", inspectorInfo), "top", inspectorInfo), "end", inspectorInfo).set("bottom", Dp.m3295boximpl(f6));
        return Unit.f186387a;
    }
}
