package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.internal.LayoutUtilKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ)\u0010\n\u001a\u00020\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\"\u0010\u0019\u001a\u00020\u0015*\u00020\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\"\u0010\u001a\u001a\u00020\u0015*\u00020\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u001b\u001a\u00020\u0015H\u0016J\"\u0010\u001c\u001a\u00020\u0015*\u00020\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u001b\u001a\u00020\u0015H\u0016J8\u0010\u001d\u001a\u00020\u00152\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u001b\u001a\u00020\u00152\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001fH\u0002J<\u0010 \u001a\u00020\u0015*\u00020\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u0018\u001a\u00020\u00152\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Landroidx/compose/material/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "<init>", "(ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "height", "minIntrinsicWidth", "intrinsicWidth", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicHeight", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class TextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;

    @NotNull
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z, float f, @NotNull PaddingValues paddingValues) {
        this.singleLine = z;
        this.animationProgress = f;
        this.paddingValues = paddingValues;
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        int i2;
        int iIntValue;
        int iSubtractConstraintSafely;
        IntrinsicMeasurable intrinsicMeasurable3;
        int iIntValue2;
        IntrinsicMeasurable intrinsicMeasurable4;
        List<? extends IntrinsicMeasurable> list2 = list;
        int size = list2.size();
        int i3 = 0;
        while (true) {
            intrinsicMeasurable = null;
            if (i3 >= size) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i3);
            if (Intrinsics.f(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "Leading")) {
                break;
            }
            i3++;
        }
        IntrinsicMeasurable intrinsicMeasurable5 = intrinsicMeasurable2;
        if (intrinsicMeasurable5 != null) {
            i2 = i;
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(i2, intrinsicMeasurable5.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue = ((Number) function2.invoke(intrinsicMeasurable5, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            iIntValue = 0;
            iSubtractConstraintSafely = i2;
        }
        int size2 = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size2) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i5);
            if (Intrinsics.f(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), "Trailing")) {
                break;
            }
            i5++;
        }
        IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable3;
        if (intrinsicMeasurable6 != null) {
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable6.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue2 = ((Number) function2.invoke(intrinsicMeasurable6, Integer.valueOf(i2))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i6);
            if (Intrinsics.f(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), "Label")) {
                break;
            }
            i6++;
        }
        IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable4;
        int iIntValue3 = intrinsicMeasurable7 != null ? ((Number) function2.invoke(intrinsicMeasurable7, Integer.valueOf(iSubtractConstraintSafely))).intValue() : 0;
        int size4 = list2.size();
        for (int i21 = 0; i21 < size4; i21++) {
            IntrinsicMeasurable intrinsicMeasurable8 = list.get(i21);
            if (Intrinsics.f(TextFieldImplKt.getLayoutId(intrinsicMeasurable8), "TextField")) {
                int iIntValue4 = ((Number) function2.invoke(intrinsicMeasurable8, Integer.valueOf(iSubtractConstraintSafely))).intValue();
                int size5 = list.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size5) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable9 = list.get(i22);
                    if (Intrinsics.f(TextFieldImplKt.getLayoutId(intrinsicMeasurable9), "Hint")) {
                        intrinsicMeasurable = intrinsicMeasurable9;
                        break;
                    }
                    i22++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable;
                return TextFieldKt.m1277calculateHeightO3s9Psw(iIntValue4, iIntValue3 > 0, iIntValue3, iIntValue, iIntValue2, intrinsicMeasurable10 != null ? ((Number) function2.invoke(intrinsicMeasurable10, Integer.valueOf(iSubtractConstraintSafely))).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    private final int intrinsicWidth(List<? extends IntrinsicMeasurable> measurables, int height, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> intrinsicMeasurer) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        int size = measurables.size();
        for (int i = 0; i < size; i++) {
            IntrinsicMeasurable intrinsicMeasurable5 = measurables.get(i);
            if (Intrinsics.f(TextFieldImplKt.getLayoutId(intrinsicMeasurable5), "TextField")) {
                int iIntValue = ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable5, Integer.valueOf(height))).intValue();
                List<? extends IntrinsicMeasurable> list = measurables;
                int size2 = list.size();
                int i2 = 0;
                while (true) {
                    intrinsicMeasurable = null;
                    if (i2 >= size2) {
                        intrinsicMeasurable2 = null;
                        break;
                    }
                    intrinsicMeasurable2 = measurables.get(i2);
                    if (Intrinsics.f(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "Label")) {
                        break;
                    }
                    i2++;
                }
                IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable2;
                int iIntValue2 = intrinsicMeasurable6 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable6, Integer.valueOf(height))).intValue() : 0;
                int size3 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        intrinsicMeasurable3 = null;
                        break;
                    }
                    intrinsicMeasurable3 = measurables.get(i3);
                    if (Intrinsics.f(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), "Trailing")) {
                        break;
                    }
                    i3++;
                }
                IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable3;
                int iIntValue3 = intrinsicMeasurable7 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable7, Integer.valueOf(height))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        intrinsicMeasurable4 = null;
                        break;
                    }
                    intrinsicMeasurable4 = measurables.get(i5);
                    if (Intrinsics.f(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable4;
                int iIntValue4 = intrinsicMeasurable8 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable8, Integer.valueOf(height))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable9 = measurables.get(i6);
                    if (Intrinsics.f(TextFieldImplKt.getLayoutId(intrinsicMeasurable9), "Hint")) {
                        intrinsicMeasurable = intrinsicMeasurable9;
                        break;
                    }
                    i6++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable;
                return TextFieldKt.m1278calculateWidthVsPV1Ek(iIntValue4, iIntValue3, iIntValue, iIntValue2, intrinsicMeasurable10 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable10, Integer.valueOf(height))).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$6(Placeable placeable, int i, int i2, int i3, int i5, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, TextFieldMeasurePolicy textFieldMeasurePolicy, int i6, int i21, MeasureScope measureScope, Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            int i22 = i - i2;
            if (i22 < 0) {
                i22 = 0;
            }
            TextFieldKt.placeWithLabel(placementScope, i3, i5, placeable2, placeable, placeable3, placeable4, placeable5, textFieldMeasurePolicy.singleLine, i22, i6 + i21, textFieldMeasurePolicy.animationProgress, measureScope.getDensity());
        } else {
            TextFieldKt.placeWithoutLabel(placementScope, i3, i5, placeable2, placeable3, placeable4, placeable5, textFieldMeasurePolicy.singleLine, measureScope.getDensity(), textFieldMeasurePolicy.paddingValues);
        }
        return Unit.f186387a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new g(6));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(list, i, new g(4));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo520measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j2) {
        Measurable measurable;
        Measurable measurable2;
        int i;
        Measurable measurable3;
        final int height;
        Measurable measurable4;
        final TextFieldMeasurePolicy textFieldMeasurePolicy = this;
        final MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        final int iMo762roundToPx0680j_4 = measureScope2.mo762roundToPx0680j_4(textFieldMeasurePolicy.paddingValues.getTop());
        int iMo762roundToPx0680j_42 = measureScope2.mo762roundToPx0680j_4(textFieldMeasurePolicy.paddingValues.getBottom());
        final int iMo762roundToPx0680j_43 = measureScope2.mo762roundToPx0680j_4(TextFieldKt.getTextFieldTopPadding());
        long jM3271copyZbe2FdA$default = Constraints.m3271copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        List<? extends Measurable> list3 = list2;
        int size = list3.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                measurable = null;
                break;
            }
            measurable = list2.get(i2);
            if (Intrinsics.f(LayoutIdKt.getLayoutId(measurable), "Leading")) {
                break;
            }
            i2++;
        }
        Measurable measurable5 = measurable;
        Placeable placeableMo2530measureBRTryo0 = measurable5 != null ? measurable5.mo2530measureBRTryo0(jM3271copyZbe2FdA$default) : null;
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo2530measureBRTryo0);
        int size2 = list3.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list2.get(i3);
            if (Intrinsics.f(LayoutIdKt.getLayoutId(measurable2), "Trailing")) {
                break;
            }
            i3++;
        }
        Measurable measurable6 = measurable2;
        Placeable placeableMo2530measureBRTryo02 = measurable6 != null ? measurable6.mo2530measureBRTryo0(ConstraintsKt.m3294offsetNN6EwU$default(jM3271copyZbe2FdA$default, -iWidthOrZero, 0, 2, null)) : null;
        int i5 = -iMo762roundToPx0680j_42;
        int i6 = -(TextFieldImplKt.widthOrZero(placeableMo2530measureBRTryo02) + iWidthOrZero);
        long jM3293offsetNN6EwU = ConstraintsKt.m3293offsetNN6EwU(jM3271copyZbe2FdA$default, i6, i5);
        int size3 = list3.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size3) {
                i = iMo762roundToPx0680j_42;
                measurable3 = null;
                break;
            }
            measurable3 = list2.get(i21);
            i = iMo762roundToPx0680j_42;
            if (Intrinsics.f(LayoutIdKt.getLayoutId(measurable3), "Label")) {
                break;
            }
            i21++;
            iMo762roundToPx0680j_42 = i;
        }
        Measurable measurable7 = measurable3;
        Placeable placeableMo2530measureBRTryo03 = measurable7 != null ? measurable7.mo2530measureBRTryo0(jM3293offsetNN6EwU) : null;
        if (placeableMo2530measureBRTryo03 != null) {
            height = placeableMo2530measureBRTryo03.get(AlignmentLineKt.getLastBaseline());
            if (height == Integer.MIN_VALUE) {
                height = placeableMo2530measureBRTryo03.getHeight();
            }
        } else {
            height = 0;
        }
        final int iMax = Math.max(height, iMo762roundToPx0680j_4);
        Placeable placeable = placeableMo2530measureBRTryo03;
        long jM3293offsetNN6EwU2 = ConstraintsKt.m3293offsetNN6EwU(Constraints.m3271copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null), i6, placeableMo2530measureBRTryo03 != null ? (i5 - iMo762roundToPx0680j_43) - iMax : (-iMo762roundToPx0680j_4) - i);
        int size4 = list3.size();
        int i22 = 0;
        while (i22 < size4) {
            Measurable measurable8 = list2.get(i22);
            if (Intrinsics.f(LayoutIdKt.getLayoutId(measurable8), "TextField")) {
                final Placeable placeableMo2530measureBRTryo04 = measurable8.mo2530measureBRTryo0(jM3293offsetNN6EwU2);
                long jM3271copyZbe2FdA$default2 = Constraints.m3271copyZbe2FdA$default(jM3293offsetNN6EwU2, 0, 0, 0, 0, 14, null);
                int size5 = list2.size();
                int i32 = 0;
                while (true) {
                    if (i32 >= size5) {
                        measurable4 = null;
                        break;
                    }
                    measurable4 = list2.get(i32);
                    if (Intrinsics.f(LayoutIdKt.getLayoutId(measurable4), "Hint")) {
                        break;
                    }
                    i32++;
                    list2 = list;
                }
                Measurable measurable9 = measurable4;
                final Placeable placeableMo2530measureBRTryo05 = measurable9 != null ? measurable9.mo2530measureBRTryo0(jM3271copyZbe2FdA$default2) : null;
                final int iM1278calculateWidthVsPV1Ek = TextFieldKt.m1278calculateWidthVsPV1Ek(TextFieldImplKt.widthOrZero(placeableMo2530measureBRTryo0), TextFieldImplKt.widthOrZero(placeableMo2530measureBRTryo02), placeableMo2530measureBRTryo04.getWidth(), TextFieldImplKt.widthOrZero(placeable), TextFieldImplKt.widthOrZero(placeableMo2530measureBRTryo05), j2);
                final int iM1277calculateHeightO3s9Psw = TextFieldKt.m1277calculateHeightO3s9Psw(placeableMo2530measureBRTryo04.getHeight(), placeable != null, iMax, TextFieldImplKt.heightOrZero(placeableMo2530measureBRTryo0), TextFieldImplKt.heightOrZero(placeableMo2530measureBRTryo02), TextFieldImplKt.heightOrZero(placeableMo2530measureBRTryo05), j2, measureScope2.getDensity(), textFieldMeasurePolicy.paddingValues);
                final Placeable placeable2 = placeableMo2530measureBRTryo02;
                final Placeable placeable3 = placeable;
                final Placeable placeable4 = placeableMo2530measureBRTryo0;
                return MeasureScope.layout$default(measureScope, iM1278calculateWidthVsPV1Ek, iM1277calculateHeightO3s9Psw, null, new Function1() { // from class: androidx.compose.material.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return TextFieldMeasurePolicy.measure_3p2s80s$lambda$6(placeable3, iMo762roundToPx0680j_4, height, iM1278calculateWidthVsPV1Ek, iM1277calculateHeightO3s9Psw, placeableMo2530measureBRTryo04, placeableMo2530measureBRTryo05, placeable4, placeable2, textFieldMeasurePolicy, iMax, iMo762roundToPx0680j_43, measureScope2, (Placeable.PlacementScope) obj2);
                    }
                }, 4, null);
            }
            i22++;
            textFieldMeasurePolicy = this;
            measureScope2 = measureScope;
            placeable = placeable;
            list2 = list;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new g(5));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(list, i, new g(7));
    }
}
