package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.ui.Alignment;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.util.MathHelpersKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u0019\u001a\u00020\u001a*\u00020\u001b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\"\u0010\u001e\u001a\u00020\u001a*\u00020\u001b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\"\u0010\u001f\u001a\u00020\u001a*\u00020\u001b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\u0006\u0010 \u001a\u00020\u001aH\u0016J\"\u0010!\u001a\u00020\u001a*\u00020\u001b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\u0006\u0010 \u001a\u00020\u001aH\u0016J8\u0010\"\u001a\u00020\u001a2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\u0006\u0010 \u001a\u00020\u001a2\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0$H\u0002J<\u0010%\u001a\u00020\u001a*\u00020\u001b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\u0006\u0010\u001d\u001a\u00020\u001a2\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0$H\u0002JO\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¢\u0006\u0004\b.\u0010/Jk\u00100\u001a\u00020\u001a*\u0002012\u0006\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u001a2\u0006\u00109\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020;H\u0002¢\u0006\u0004\b<\u0010=J \u0001\u0010>\u001a\u00020?*\u00020@2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020C2\b\u0010E\u001a\u0004\u0018\u00010C2\b\u0010F\u001a\u0004\u0018\u00010C2\b\u0010G\u001a\u0004\u0018\u00010C2\b\u0010H\u001a\u0004\u0018\u00010C2\b\u0010I\u001a\u0004\u0018\u00010C2\u0006\u0010J\u001a\u00020C2\b\u0010K\u001a\u0004\u0018\u00010C2\u0006\u0010L\u001a\u00020\u001a2\u0006\u0010M\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020;2\u0006\u0010N\u001a\u00020\u001a2\u0006\u0010O\u001a\u00020PH\u0002Jp\u0010Q\u001a\u00020?*\u00020@2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010R\u001a\u00020C2\b\u0010E\u001a\u0004\u0018\u00010C2\b\u0010F\u001a\u0004\u0018\u00010C2\b\u0010G\u001a\u0004\u0018\u00010C2\b\u0010H\u001a\u0004\u0018\u00010C2\b\u0010I\u001a\u0004\u0018\u00010C2\u0006\u0010J\u001a\u00020C2\b\u0010K\u001a\u0004\u0018\u00010C2\u0006\u0010S\u001a\u00020;H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006T"}, d2 = {"Landroidx/compose/material3/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "singleLine", "", "labelPosition", "Landroidx/compose/material3/TextFieldLabelPosition;", "labelProgress", "Landroidx/compose/material3/internal/FloatProducer;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "minimizedLabelHalfHeight", "Landroidx/compose/ui/unit/Dp;", "<init>", "(ZLandroidx/compose/material3/TextFieldLabelPosition;Landroidx/compose/material3/internal/FloatProducer;Landroidx/compose/foundation/layout/PaddingValues;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "height", "minIntrinsicWidth", "intrinsicWidth", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicHeight", "calculateWidth", "leadingWidth", "trailingWidth", "prefixWidth", "suffixWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "calculateWidth-yeHjK3Y", "(IIIIIIIJ)I", "calculateHeight", "Landroidx/compose/ui/unit/Density;", "textFieldHeight", "labelHeight", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "placeholderHeight", "supportingHeight", "isLabelAbove", "", "calculateHeight-mKXJcVc", "(Landroidx/compose/ui/unit/Density;IIIIIIIIJZF)I", "placeWithLabel", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "totalHeight", "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "containerPlaceable", "supportingPlaceable", "labelStartY", "labelEndY", "textPosition", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeWithoutLabel", "textPlaceable", "density", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class TextFieldMeasurePolicy implements MeasurePolicy {

    @NotNull
    private final TextFieldLabelPosition labelPosition;

    @NotNull
    private final FloatProducer labelProgress;
    private final float minimizedLabelHalfHeight;

    @NotNull
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public /* synthetic */ TextFieldMeasurePolicy(boolean z, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, PaddingValues paddingValues, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, textFieldLabelPosition, floatProducer, paddingValues, f);
    }

    /* JADX INFO: renamed from: calculateHeight-mKXJcVc, reason: not valid java name */
    private final int m1417calculateHeightmKXJcVc(Density density, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32, long j2, boolean z, float f) {
        int iMo762roundToPx0680j_4 = density.mo762roundToPx0680j_4(Dp.m3297constructorimpl(this.paddingValues.getBottom() + this.paddingValues.getTop())) + ((i2 <= 0 || z) ? 0 : Math.max(density.mo762roundToPx0680j_4(Dp.m3297constructorimpl(this.minimizedLabelHalfHeight * 2)), MathHelpersKt.lerp(0, i2, MotionTokens.INSTANCE.getEasingEmphasizedAccelerateCubicBezier().transform(f)))) + cim.c.j(i, i22, i6, i21, z ? 0 : MathHelpersKt.lerp(i2, 0, f));
        if (!z) {
            i2 = 0;
        }
        return ConstraintsKt.m3291constrainHeightK40F9xA(j2, Math.max(i3, Math.max(i5, iMo762roundToPx0680j_4)) + i2 + i32);
    }

    /* JADX INFO: renamed from: calculateWidth-yeHjK3Y, reason: not valid java name */
    private final int m1418calculateWidthyeHjK3Y(int leadingWidth, int trailingWidth, int prefixWidth, int suffixWidth, int textFieldWidth, int labelWidth, int placeholderWidth, long constraints) {
        int i = prefixWidth + suffixWidth;
        return ConstraintsKt.m3292constrainWidthK40F9xA(constraints, Math.max(textFieldWidth + i, Math.max(placeholderWidth + i, labelWidth)) + leadingWidth + trailingWidth);
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        IntrinsicMeasurable intrinsicMeasurable;
        int i2;
        int iSubtractConstraintSafely;
        int iIntValue;
        IntrinsicMeasurable intrinsicMeasurable2;
        int iIntValue2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        int i3;
        IntrinsicMeasurable intrinsicMeasurable5;
        int i5;
        IntrinsicMeasurable intrinsicMeasurable6;
        IntrinsicMeasurable intrinsicMeasurable7;
        List<? extends IntrinsicMeasurable> list2 = list;
        int size = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                intrinsicMeasurable = null;
                break;
            }
            intrinsicMeasurable = list.get(i6);
            if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable), "Leading")) {
                break;
            }
            i6++;
        }
        IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable;
        if (intrinsicMeasurable8 != null) {
            i2 = i;
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(i2, intrinsicMeasurable8.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue = ((Number) function2.invoke(intrinsicMeasurable8, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            iSubtractConstraintSafely = i2;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size2) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i21);
            if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable2), "Trailing")) {
                break;
            }
            i21++;
        }
        IntrinsicMeasurable intrinsicMeasurable9 = intrinsicMeasurable2;
        if (intrinsicMeasurable9 != null) {
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable9.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue2 = ((Number) function2.invoke(intrinsicMeasurable9, Integer.valueOf(i2))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i22 = 0;
        while (true) {
            if (i22 >= size3) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i22);
            if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable3), "Label")) {
                break;
            }
            i22++;
        }
        IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable3;
        int iIntValue3 = intrinsicMeasurable10 != null ? ((Number) function2.invoke(intrinsicMeasurable10, Integer.valueOf(iSubtractConstraintSafely))).intValue() : 0;
        int size4 = list2.size();
        int i32 = 0;
        while (true) {
            if (i32 >= size4) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i32);
            if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable4), "Prefix")) {
                break;
            }
            i32++;
        }
        IntrinsicMeasurable intrinsicMeasurable11 = intrinsicMeasurable4;
        if (intrinsicMeasurable11 != null) {
            int iIntValue4 = ((Number) function2.invoke(intrinsicMeasurable11, Integer.valueOf(iSubtractConstraintSafely))).intValue();
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable11.maxIntrinsicWidth(Integer.MAX_VALUE));
            i3 = iIntValue4;
        } else {
            i3 = 0;
        }
        int size5 = list2.size();
        int i33 = 0;
        while (true) {
            if (i33 >= size5) {
                intrinsicMeasurable5 = null;
                break;
            }
            intrinsicMeasurable5 = list.get(i33);
            if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable5), "Suffix")) {
                break;
            }
            i33++;
        }
        IntrinsicMeasurable intrinsicMeasurable12 = intrinsicMeasurable5;
        if (intrinsicMeasurable12 != null) {
            int iIntValue5 = ((Number) function2.invoke(intrinsicMeasurable12, Integer.valueOf(iSubtractConstraintSafely))).intValue();
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable12.maxIntrinsicWidth(Integer.MAX_VALUE));
            i5 = iIntValue5;
        } else {
            i5 = 0;
        }
        int size6 = list2.size();
        for (int i43 = 0; i43 < size6; i43++) {
            IntrinsicMeasurable intrinsicMeasurable13 = list.get(i43);
            if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable13), "TextField")) {
                int iIntValue6 = ((Number) function2.invoke(intrinsicMeasurable13, Integer.valueOf(iSubtractConstraintSafely))).intValue();
                List<? extends IntrinsicMeasurable> list3 = list;
                int size7 = list3.size();
                int i59 = 0;
                while (true) {
                    if (i59 >= size7) {
                        intrinsicMeasurable6 = null;
                        break;
                    }
                    intrinsicMeasurable6 = list.get(i59);
                    if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable6), "Hint")) {
                        break;
                    }
                    i59++;
                }
                IntrinsicMeasurable intrinsicMeasurable14 = intrinsicMeasurable6;
                int iIntValue7 = intrinsicMeasurable14 != null ? ((Number) function2.invoke(intrinsicMeasurable14, Integer.valueOf(iSubtractConstraintSafely))).intValue() : 0;
                int size8 = list3.size();
                int i66 = 0;
                while (true) {
                    if (i66 >= size8) {
                        intrinsicMeasurable7 = null;
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable15 = list.get(i66);
                    if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable15), "Supporting")) {
                        intrinsicMeasurable7 = intrinsicMeasurable15;
                        break;
                    }
                    i66++;
                }
                IntrinsicMeasurable intrinsicMeasurable16 = intrinsicMeasurable7;
                return m1417calculateHeightmKXJcVc(intrinsicMeasureScope, iIntValue6, iIntValue3, iIntValue, iIntValue2, i3, i5, iIntValue7, intrinsicMeasurable16 != null ? ((Number) function2.invoke(intrinsicMeasurable16, Integer.valueOf(i2))).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), false, this.labelProgress.invoke());
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
        IntrinsicMeasurable intrinsicMeasurable5;
        IntrinsicMeasurable intrinsicMeasurable6;
        int size = measurables.size();
        for (int i = 0; i < size; i++) {
            IntrinsicMeasurable intrinsicMeasurable7 = measurables.get(i);
            if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable7), "TextField")) {
                int iIntValue = ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable7, Integer.valueOf(height))).intValue();
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
                    if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable2), "Label")) {
                        break;
                    }
                    i2++;
                }
                IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable2;
                int iIntValue2 = intrinsicMeasurable8 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable8, Integer.valueOf(height))).intValue() : 0;
                int size3 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        intrinsicMeasurable3 = null;
                        break;
                    }
                    intrinsicMeasurable3 = measurables.get(i3);
                    if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable3), "Trailing")) {
                        break;
                    }
                    i3++;
                }
                IntrinsicMeasurable intrinsicMeasurable9 = intrinsicMeasurable3;
                int iIntValue3 = intrinsicMeasurable9 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable9, Integer.valueOf(height))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        intrinsicMeasurable4 = null;
                        break;
                    }
                    intrinsicMeasurable4 = measurables.get(i5);
                    if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable4;
                int iIntValue4 = intrinsicMeasurable10 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable10, Integer.valueOf(height))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        intrinsicMeasurable5 = null;
                        break;
                    }
                    intrinsicMeasurable5 = measurables.get(i6);
                    if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                IntrinsicMeasurable intrinsicMeasurable11 = intrinsicMeasurable5;
                int iIntValue5 = intrinsicMeasurable11 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable11, Integer.valueOf(height))).intValue() : 0;
                int size6 = list.size();
                int i21 = 0;
                while (true) {
                    if (i21 >= size6) {
                        intrinsicMeasurable6 = null;
                        break;
                    }
                    intrinsicMeasurable6 = measurables.get(i21);
                    if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable6), "Leading")) {
                        break;
                    }
                    i21++;
                }
                IntrinsicMeasurable intrinsicMeasurable12 = intrinsicMeasurable6;
                int iIntValue6 = intrinsicMeasurable12 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable12, Integer.valueOf(height))).intValue() : 0;
                int size7 = list.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size7) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable13 = measurables.get(i22);
                    if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable13), "Hint")) {
                        intrinsicMeasurable = intrinsicMeasurable13;
                        break;
                    }
                    i22++;
                }
                IntrinsicMeasurable intrinsicMeasurable14 = intrinsicMeasurable;
                return m1418calculateWidthyeHjK3Y(iIntValue6, iIntValue3, iIntValue4, iIntValue5, iIntValue, iIntValue2, intrinsicMeasurable14 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable14, Integer.valueOf(height))).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$9(Ref$ObjectRef ref$ObjectRef, boolean z, TextFieldMeasurePolicy textFieldMeasurePolicy, int i, int i2, MeasureScope measureScope, int i3, int i5, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, float f, Placeable.PlacementScope placementScope) {
        MeasureScope measureScope2;
        int iMo762roundToPx0680j_4;
        int i6;
        if (ref$ObjectRef.f186409a != null) {
            if (z) {
                measureScope2 = measureScope;
                i6 = 0;
            } else {
                if (textFieldMeasurePolicy.singleLine) {
                    iMo762roundToPx0680j_4 = Alignment.INSTANCE.getCenterVertically().align(((Placeable) ref$ObjectRef.f186409a).getHeight(), i);
                    measureScope2 = measureScope;
                } else {
                    measureScope2 = measureScope;
                    iMo762roundToPx0680j_4 = measureScope2.mo762roundToPx0680j_4(textFieldMeasurePolicy.minimizedLabelHalfHeight) + i2;
                }
                i6 = iMo762roundToPx0680j_4;
            }
            int i21 = z ? 0 : i2;
            Object obj2 = ref$ObjectRef.f186409a;
            textFieldMeasurePolicy.placeWithLabel(placementScope, i3, i5, placeable, (Placeable) obj2, placeable2, placeable3, placeable4, placeable5, placeable6, placeable7, placeable8, i6, i21, z, f, i2 + (z ? 0 : ((Placeable) obj2).getHeight()), measureScope2.getLayoutDirection());
        } else {
            textFieldMeasurePolicy.placeWithoutLabel(placementScope, i3, i5, placeable, placeable2, placeable3, placeable4, placeable5, placeable6, placeable7, placeable8, measureScope.getDensity());
        }
        return Unit.f186387a;
    }

    private final void placeWithLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, int i3, int i5, boolean z, float f, int i6, LayoutDirection layoutDirection) {
        int height = z ? placeable2.getHeight() : 0;
        Placeable.PlacementScope.place$default(placementScope, placeable8, 0, height, BitmapDescriptorFactory.HUE_RED, 4, null);
        int heightOrZero = (i2 - LayoutUtilKt.getHeightOrZero(placeable9)) - (z ? placeable2.getHeight() : 0);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), heightOrZero) + height, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        int iLerp = MathHelpersKt.lerp(i3, i5, f);
        if (z) {
            Placeable.PlacementScope.place$default(placementScope, placeable2, TextFieldImplKt.getMinimizedAlignment(this.labelPosition).align(placeable2.getWidth(), i, layoutDirection), iLerp, BitmapDescriptorFactory.HUE_RED, 4, null);
        } else {
            int widthOrZero = layoutDirection == LayoutDirection.Ltr ? LayoutUtilKt.getWidthOrZero(placeable4) : LayoutUtilKt.getWidthOrZero(placeable5);
            Placeable.PlacementScope.place$default(placementScope, placeable2, MathHelpersKt.lerp(TextFieldImplKt.getExpandedAlignment(this.labelPosition).align(placeable2.getWidth(), (i - LayoutUtilKt.getWidthOrZero(placeable4)) - LayoutUtilKt.getWidthOrZero(placeable5), layoutDirection) + widthOrZero, TextFieldImplKt.getMinimizedAlignment(this.labelPosition).align(placeable2.getWidth(), (i - LayoutUtilKt.getWidthOrZero(placeable4)) - LayoutUtilKt.getWidthOrZero(placeable5), layoutDirection) + widthOrZero, f), iLerp, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, LayoutUtilKt.getWidthOrZero(placeable4), height + i6, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        int widthOrZero2 = LayoutUtilKt.getWidthOrZero(placeable6) + LayoutUtilKt.getWidthOrZero(placeable4);
        int i21 = height + i6;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, widthOrZero2, i21, BitmapDescriptorFactory.HUE_RED, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, widthOrZero2, i21, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, (i - LayoutUtilKt.getWidthOrZero(placeable5)) - placeable7.getWidth(), i21, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i - placeable5.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), heightOrZero) + height, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, height + heightOrZero, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
    }

    private final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, float f) {
        Placeable.PlacementScope.m2556place70tqf50$default(placementScope, placeable7, IntOffset.INSTANCE.m3343getZeronOccac(), BitmapDescriptorFactory.HUE_RED, 2, null);
        int heightOrZero = i2 - LayoutUtilKt.getHeightOrZero(placeable8);
        int iC = rim.d.c(this.paddingValues.getTop() * f);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), heightOrZero), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, LayoutUtilKt.getWidthOrZero(placeable3), placeWithoutLabel$calculateVerticalPosition(this, heightOrZero, iC, placeable5), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        int widthOrZero = LayoutUtilKt.getWidthOrZero(placeable5) + LayoutUtilKt.getWidthOrZero(placeable3);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, widthOrZero, placeWithoutLabel$calculateVerticalPosition(this, heightOrZero, iC, placeable), BitmapDescriptorFactory.HUE_RED, 4, null);
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, widthOrZero, placeWithoutLabel$calculateVerticalPosition(this, heightOrZero, iC, placeable2), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, (i - LayoutUtilKt.getWidthOrZero(placeable4)) - placeable6.getWidth(), placeWithoutLabel$calculateVerticalPosition(this, heightOrZero, iC, placeable6), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i - placeable4.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), heightOrZero), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (placeable8 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable8, 0, heightOrZero, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
    }

    private static final int placeWithoutLabel$calculateVerticalPosition(TextFieldMeasurePolicy textFieldMeasurePolicy, int i, int i2, Placeable placeable) {
        return textFieldMeasurePolicy.singleLine ? Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i) : i2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new d(7));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(list, i, new d(5));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo520measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j2) {
        Measurable measurable;
        Measurable measurable2;
        long j3;
        Placeable placeableMo2530measureBRTryo0;
        Measurable measurable3;
        Measurable measurable4;
        long j5;
        Placeable placeableMo2530measureBRTryo02;
        Measurable measurable5;
        Measurable measurable6;
        Measurable measurable7;
        int i;
        Placeable placeableMo2530measureBRTryo03;
        final float fInvoke = this.labelProgress.invoke();
        int iMo762roundToPx0680j_4 = measureScope.mo762roundToPx0680j_4(this.paddingValues.getTop());
        int iMo762roundToPx0680j_42 = measureScope.mo762roundToPx0680j_4(this.paddingValues.getBottom());
        long jM3271copyZbe2FdA$default = Constraints.m3271copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                measurable = null;
                break;
            }
            measurable = list.get(i2);
            if (Intrinsics.f(LayoutIdKt.getLayoutId(measurable), "Leading")) {
                break;
            }
            i2++;
        }
        Measurable measurable8 = measurable;
        Placeable placeableMo2530measureBRTryo04 = measurable8 != null ? measurable8.mo2530measureBRTryo0(jM3271copyZbe2FdA$default) : null;
        int widthOrZero = LayoutUtilKt.getWidthOrZero(placeableMo2530measureBRTryo04);
        int iMax = Math.max(0, LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo04));
        int size2 = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list.get(i3);
            if (Intrinsics.f(LayoutIdKt.getLayoutId(measurable2), "Trailing")) {
                break;
            }
            i3++;
        }
        Measurable measurable9 = measurable2;
        if (measurable9 != null) {
            j3 = jM3271copyZbe2FdA$default;
            placeableMo2530measureBRTryo0 = measurable9.mo2530measureBRTryo0(ConstraintsKt.m3294offsetNN6EwU$default(j3, -widthOrZero, 0, 2, null));
        } else {
            j3 = jM3271copyZbe2FdA$default;
            placeableMo2530measureBRTryo0 = null;
        }
        int widthOrZero2 = LayoutUtilKt.getWidthOrZero(placeableMo2530measureBRTryo0) + widthOrZero;
        int iMax2 = Math.max(iMax, LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo0));
        int size3 = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                measurable3 = null;
                break;
            }
            measurable3 = list.get(i5);
            if (Intrinsics.f(LayoutIdKt.getLayoutId(measurable3), "Prefix")) {
                break;
            }
            i5++;
        }
        Measurable measurable10 = measurable3;
        Placeable placeableMo2530measureBRTryo05 = measurable10 != null ? measurable10.mo2530measureBRTryo0(ConstraintsKt.m3294offsetNN6EwU$default(j3, -widthOrZero2, 0, 2, null)) : null;
        int widthOrZero3 = LayoutUtilKt.getWidthOrZero(placeableMo2530measureBRTryo05) + widthOrZero2;
        int iMax3 = Math.max(iMax2, LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo05));
        int size4 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size4) {
                measurable4 = null;
                break;
            }
            measurable4 = list.get(i6);
            if (Intrinsics.f(LayoutIdKt.getLayoutId(measurable4), "Suffix")) {
                break;
            }
            i6++;
        }
        Measurable measurable11 = measurable4;
        if (measurable11 != null) {
            j5 = j3;
            placeableMo2530measureBRTryo02 = measurable11.mo2530measureBRTryo0(ConstraintsKt.m3294offsetNN6EwU$default(j3, -widthOrZero3, 0, 2, null));
        } else {
            j5 = j3;
            placeableMo2530measureBRTryo02 = null;
        }
        int widthOrZero4 = LayoutUtilKt.getWidthOrZero(placeableMo2530measureBRTryo02) + widthOrZero3;
        int iMax4 = Math.max(iMax3, LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo02));
        int size5 = list2.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size5) {
                measurable5 = null;
                break;
            }
            measurable5 = list.get(i21);
            if (Intrinsics.f(LayoutIdKt.getLayoutId(measurable5), "Label")) {
                break;
            }
            i21++;
        }
        Measurable measurable12 = measurable5;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        int i22 = -widthOrZero4;
        ref$ObjectRef.f186409a = measurable12 != null ? measurable12.mo2530measureBRTryo0(ConstraintsKt.m3293offsetNN6EwU(j5, i22, -iMo762roundToPx0680j_42)) : null;
        int size6 = list2.size();
        int i32 = 0;
        while (true) {
            if (i32 >= size6) {
                measurable6 = null;
                break;
            }
            measurable6 = list.get(i32);
            if (Intrinsics.f(LayoutIdKt.getLayoutId(measurable6), "Supporting")) {
                break;
            }
            i32++;
        }
        Measurable measurable13 = measurable6;
        int iMinIntrinsicHeight = measurable13 != null ? measurable13.minIntrinsicHeight(Constraints.m3281getMinWidthimpl(j2)) : 0;
        int heightOrZero = LayoutUtilKt.getHeightOrZero((Placeable) ref$ObjectRef.f186409a) + iMo762roundToPx0680j_4;
        Measurable measurable14 = measurable13;
        long jM3293offsetNN6EwU = ConstraintsKt.m3293offsetNN6EwU(Constraints.m3271copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null), i22, ((-heightOrZero) - iMo762roundToPx0680j_42) - iMinIntrinsicHeight);
        int size7 = list2.size();
        int i33 = 0;
        while (i33 < size7) {
            Measurable measurable15 = list.get(i33);
            int i43 = size7;
            if (Intrinsics.f(LayoutIdKt.getLayoutId(measurable15), "TextField")) {
                final Placeable placeableMo2530measureBRTryo06 = measurable15.mo2530measureBRTryo0(jM3293offsetNN6EwU);
                long jM3271copyZbe2FdA$default2 = Constraints.m3271copyZbe2FdA$default(jM3293offsetNN6EwU, 0, 0, 0, 0, 14, null);
                List<? extends Measurable> list3 = list;
                int size8 = list3.size();
                int i59 = 0;
                while (true) {
                    if (i59 >= size8) {
                        measurable7 = null;
                        break;
                    }
                    measurable7 = list.get(i59);
                    int i66 = size8;
                    if (Intrinsics.f(LayoutIdKt.getLayoutId(measurable7), "Hint")) {
                        break;
                    }
                    i59++;
                    size8 = i66;
                }
                Measurable measurable16 = measurable7;
                Placeable placeableMo2530measureBRTryo07 = measurable16 != null ? measurable16.mo2530measureBRTryo0(jM3271copyZbe2FdA$default2) : null;
                int iMax5 = Math.max(iMax4, Math.max(LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo06), LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo07)) + heightOrZero + iMo762roundToPx0680j_42);
                final Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                long j16 = j5;
                Measurable measurable17 = measurable14;
                int iM1418calculateWidthyeHjK3Y = m1418calculateWidthyeHjK3Y(LayoutUtilKt.getWidthOrZero(placeableMo2530measureBRTryo04), LayoutUtilKt.getWidthOrZero(placeableMo2530measureBRTryo0), LayoutUtilKt.getWidthOrZero(placeableMo2530measureBRTryo05), LayoutUtilKt.getWidthOrZero(placeableMo2530measureBRTryo02), placeableMo2530measureBRTryo06.getWidth(), LayoutUtilKt.getWidthOrZero((Placeable) ref$ObjectRef.f186409a), LayoutUtilKt.getWidthOrZero(placeableMo2530measureBRTryo07), j2);
                long jM3271copyZbe2FdA$default3 = Constraints.m3271copyZbe2FdA$default(ConstraintsKt.m3294offsetNN6EwU$default(j16, 0, -iMax5, 1, null), 0, iM1418calculateWidthyeHjK3Y, 0, 0, 9, null);
                if (measurable17 != null) {
                    i = iMo762roundToPx0680j_4;
                    placeableMo2530measureBRTryo03 = measurable17.mo2530measureBRTryo0(jM3271copyZbe2FdA$default3);
                } else {
                    i = iMo762roundToPx0680j_4;
                    placeableMo2530measureBRTryo03 = null;
                }
                int heightOrZero2 = LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo03);
                int height = placeableMo2530measureBRTryo06.getHeight();
                int heightOrZero3 = LayoutUtilKt.getHeightOrZero((Placeable) ref$ObjectRef2.f186409a);
                int heightOrZero4 = LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo04);
                int heightOrZero5 = LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo0);
                int heightOrZero6 = LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo05);
                int heightOrZero7 = LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo02);
                int heightOrZero8 = LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo07);
                int heightOrZero9 = LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo03);
                final Placeable placeable = placeableMo2530measureBRTryo03;
                int i74 = iM1418calculateWidthyeHjK3Y;
                final int iM1417calculateHeightmKXJcVc = m1417calculateHeightmKXJcVc(measureScope, height, heightOrZero3, heightOrZero4, heightOrZero5, heightOrZero6, heightOrZero7, heightOrZero8, heightOrZero9, j2, false, fInvoke);
                final int i92 = iM1417calculateHeightmKXJcVc - heightOrZero2;
                int size9 = list3.size();
                int i96 = 0;
                while (i96 < size9) {
                    Measurable measurable18 = list.get(i96);
                    if (Intrinsics.f(LayoutIdKt.getLayoutId(measurable18), "Container")) {
                        final Placeable placeableMo2530measureBRTryo08 = measurable18.mo2530measureBRTryo0(ConstraintsKt.Constraints(i74 != Integer.MAX_VALUE ? i74 : 0, i74, i92 != Integer.MAX_VALUE ? i92 : 0, i92));
                        final int i99 = i74;
                        final int i100 = i;
                        final Placeable placeable2 = placeableMo2530measureBRTryo04;
                        final Placeable placeable3 = placeableMo2530measureBRTryo0;
                        final Placeable placeable4 = placeableMo2530measureBRTryo05;
                        final Placeable placeable5 = placeableMo2530measureBRTryo07;
                        final Placeable placeable6 = placeableMo2530measureBRTryo02;
                        return MeasureScope.layout$default(measureScope, i99, iM1417calculateHeightmKXJcVc, null, new Function1() { // from class: androidx.compose.material3.g
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return TextFieldMeasurePolicy.measure_3p2s80s$lambda$9(ref$ObjectRef2, false, this, i92, i100, measureScope, i99, iM1417calculateHeightmKXJcVc, placeableMo2530measureBRTryo06, placeable5, placeable2, placeable3, placeable4, placeable6, placeableMo2530measureBRTryo08, placeable, fInvoke, (Placeable.PlacementScope) obj2);
                            }
                        }, 4, null);
                    }
                    i96++;
                    i74 = i74;
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            i33++;
            size7 = i43;
            ref$ObjectRef = ref$ObjectRef;
            measurable14 = measurable14;
            j5 = j5;
            jM3293offsetNN6EwU = jM3293offsetNN6EwU;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new d(6));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(list, i, new d(4));
    }

    private TextFieldMeasurePolicy(boolean z, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, PaddingValues paddingValues, float f) {
        this.singleLine = z;
        this.labelPosition = textFieldLabelPosition;
        this.labelProgress = floatProducer;
        this.paddingValues = paddingValues;
        this.minimizedLabelHalfHeight = f;
    }
}
