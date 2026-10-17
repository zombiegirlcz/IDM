package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.Size;
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
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001BC\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020 0\u00172\u0006\u0010!\u001a\u00020\u001eH\u0016J\"\u0010\"\u001a\u00020\u001e*\u00020\u001f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020 0\u00172\u0006\u0010!\u001a\u00020\u001eH\u0016J\"\u0010#\u001a\u00020\u001e*\u00020\u001f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020 0\u00172\u0006\u0010$\u001a\u00020\u001eH\u0016J\"\u0010%\u001a\u00020\u001e*\u00020\u001f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020 0\u00172\u0006\u0010$\u001a\u00020\u001eH\u0016J<\u0010&\u001a\u00020\u001e*\u00020\u001f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020 0\u00172\u0006\u0010$\u001a\u00020\u001e2\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0(H\u0002J<\u0010)\u001a\u00020\u001e*\u00020\u001f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020 0\u00172\u0006\u0010!\u001a\u00020\u001e2\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0(H\u0002J[\u0010*\u001a\u00020\u001e*\u00020+2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\n\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105Jk\u00106\u001a\u00020\u001e*\u00020+2\u0006\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u001e2\u0006\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\u00072\u0006\u0010\n\u001a\u000203H\u0002¢\u0006\u0004\b@\u0010AJ\u009a\u0001\u0010B\u001a\u00020\u0005*\u00020C2\u0006\u0010D\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\b\u0010E\u001a\u0004\u0018\u00010F2\b\u0010G\u001a\u0004\u0018\u00010F2\b\u0010H\u001a\u0004\u0018\u00010F2\b\u0010I\u001a\u0004\u0018\u00010F2\u0006\u0010J\u001a\u00020F2\b\u0010K\u001a\u0004\u0018\u00010F2\b\u0010L\u001a\u0004\u0018\u00010F2\u0006\u0010M\u001a\u00020F2\b\u0010N\u001a\u0004\u0018\u00010F2\u0006\u0010O\u001a\u0002032\u0006\u0010P\u001a\u00020Q2\u0006\u0010?\u001a\u00020\u00072\u0006\u0010\n\u001a\u0002032\u0006\u0010R\u001a\u000203H\u0002R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006S"}, d2 = {"Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "onLabelMeasured", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Size;", "", "singleLine", "", "labelPosition", "Landroidx/compose/material3/TextFieldLabelPosition;", "labelProgress", "Landroidx/compose/material3/internal/FloatProducer;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "horizontalIconPadding", "Landroidx/compose/ui/unit/Dp;", "<init>", "(Lkotlin/jvm/functions/Function1;ZLandroidx/compose/material3/TextFieldLabelPosition;Landroidx/compose/material3/internal/FloatProducer;Landroidx/compose/foundation/layout/PaddingValues;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "height", "minIntrinsicWidth", "intrinsicWidth", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicHeight", "calculateWidth", "Landroidx/compose/ui/unit/Density;", "leadingPlaceableWidth", "trailingPlaceableWidth", "prefixPlaceableWidth", "suffixPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "", "calculateWidth-IzADHW4", "(Landroidx/compose/ui/unit/Density;IIIIIIIJF)I", "calculateHeight", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "textFieldHeight", "labelHeight", "placeholderHeight", "supportingHeight", "isLabelAbove", "calculateHeight-mKXJcVc", "(Landroidx/compose/ui/unit/Density;IIIIIIIIJZF)I", "place", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "totalHeight", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "containerPlaceable", "supportingPlaceable", "density", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "iconPadding", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    private final float horizontalIconPadding;

    @NotNull
    private final TextFieldLabelPosition labelPosition;

    @NotNull
    private final FloatProducer labelProgress;

    @NotNull
    private final Function1<Size, Unit> onLabelMeasured;

    @NotNull
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public /* synthetic */ OutlinedTextFieldMeasurePolicy(Function1 function1, boolean z, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, PaddingValues paddingValues, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, z, textFieldLabelPosition, floatProducer, paddingValues, f);
    }

    /* JADX INFO: renamed from: calculateHeight-mKXJcVc, reason: not valid java name */
    private final int m1380calculateHeightmKXJcVc(Density density, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32, long j2, boolean z, float f) {
        int iJ = cim.c.j(i6, i22, i3, i5, z ? 0 : MathHelpersKt.lerp(i21, 0, f));
        float fMo768toPx0680j_4 = density.mo768toPx0680j_4(this.paddingValues.getTop());
        if (!z) {
            fMo768toPx0680j_4 = MathHelpersKt.lerp(fMo768toPx0680j_4, Math.max(fMo768toPx0680j_4, i21 / 2.0f), f);
        }
        float fMo768toPx0680j_42 = fMo768toPx0680j_4 + iJ + density.mo768toPx0680j_4(this.paddingValues.getBottom());
        if (!z) {
            i21 = 0;
        }
        return ConstraintsKt.m3291constrainHeightK40F9xA(j2, Math.max(i, Math.max(i2, rim.d.c(fMo768toPx0680j_42))) + i21 + i32);
    }

    /* JADX INFO: renamed from: calculateWidth-IzADHW4, reason: not valid java name */
    private final int m1381calculateWidthIzADHW4(Density density, int i, int i2, int i3, int i5, int i6, int i21, int i22, long j2, float f) {
        int i32 = i3 + i5;
        int iMax = Math.max(i6 + i32, Math.max(i22 + i32, MathHelpersKt.lerp(i21, 0, f))) + i + i2;
        PaddingValues paddingValues = this.paddingValues;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return ConstraintsKt.m3292constrainWidthK40F9xA(j2, Math.max(iMax, rim.d.c((i21 + density.mo768toPx0680j_4(Dp.m3297constructorimpl(this.paddingValues.mo851calculateRightPaddingu2uoSUM(layoutDirection) + paddingValues.mo850calculateLeftPaddingu2uoSUM(layoutDirection)))) * f)));
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        IntrinsicMeasurable intrinsicMeasurable;
        int iSubtractConstraintSafely;
        int iIntValue;
        IntrinsicMeasurable intrinsicMeasurable2;
        int iIntValue2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        int iIntValue3;
        IntrinsicMeasurable intrinsicMeasurable5;
        int iIntValue4;
        IntrinsicMeasurable intrinsicMeasurable6;
        IntrinsicMeasurable intrinsicMeasurable7;
        int i2;
        int iIntValue5;
        float fInvoke = this.labelProgress.invoke();
        List<? extends IntrinsicMeasurable> list2 = list;
        int size = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                intrinsicMeasurable = null;
                break;
            }
            intrinsicMeasurable = list.get(i3);
            if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable), "Leading")) {
                break;
            }
            i3++;
        }
        IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable;
        if (intrinsicMeasurable8 != null) {
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(i, intrinsicMeasurable8.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue = ((Number) function2.invoke(intrinsicMeasurable8, Integer.valueOf(i))).intValue();
        } else {
            iSubtractConstraintSafely = i;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size2) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i5);
            if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable2), "Trailing")) {
                break;
            }
            i5++;
        }
        IntrinsicMeasurable intrinsicMeasurable9 = intrinsicMeasurable2;
        if (intrinsicMeasurable9 != null) {
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable9.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue2 = ((Number) function2.invoke(intrinsicMeasurable9, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i6);
            if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable3), "Label")) {
                break;
            }
            i6++;
        }
        IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable3;
        int iIntValue6 = intrinsicMeasurable10 != null ? ((Number) function2.invoke(intrinsicMeasurable10, Integer.valueOf(MathHelpersKt.lerp(iSubtractConstraintSafely, i, fInvoke)))).intValue() : 0;
        int size4 = list2.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size4) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i21);
            if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable4), "Prefix")) {
                break;
            }
            i21++;
        }
        IntrinsicMeasurable intrinsicMeasurable11 = intrinsicMeasurable4;
        if (intrinsicMeasurable11 != null) {
            iIntValue3 = ((Number) function2.invoke(intrinsicMeasurable11, Integer.valueOf(iSubtractConstraintSafely))).intValue();
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable11.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list2.size();
        int i22 = 0;
        while (true) {
            if (i22 >= size5) {
                intrinsicMeasurable5 = null;
                break;
            }
            intrinsicMeasurable5 = list.get(i22);
            if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable5), "Suffix")) {
                break;
            }
            i22++;
        }
        IntrinsicMeasurable intrinsicMeasurable12 = intrinsicMeasurable5;
        if (intrinsicMeasurable12 != null) {
            iIntValue4 = ((Number) function2.invoke(intrinsicMeasurable12, Integer.valueOf(iSubtractConstraintSafely))).intValue();
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable12.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list2.size();
        int i32 = 0;
        while (i32 < size6) {
            IntrinsicMeasurable intrinsicMeasurable13 = list.get(i32);
            if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable13), "TextField")) {
                int iIntValue7 = ((Number) function2.invoke(intrinsicMeasurable13, Integer.valueOf(iSubtractConstraintSafely))).intValue();
                List<? extends IntrinsicMeasurable> list3 = list;
                int size7 = list3.size();
                int i33 = 0;
                while (true) {
                    if (i33 >= size7) {
                        intrinsicMeasurable6 = null;
                        break;
                    }
                    intrinsicMeasurable6 = list.get(i33);
                    if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable6), "Hint")) {
                        break;
                    }
                    i33++;
                }
                IntrinsicMeasurable intrinsicMeasurable14 = intrinsicMeasurable6;
                int iIntValue8 = intrinsicMeasurable14 != null ? ((Number) function2.invoke(intrinsicMeasurable14, Integer.valueOf(iSubtractConstraintSafely))).intValue() : 0;
                int size8 = list3.size();
                int i43 = 0;
                while (true) {
                    if (i43 >= size8) {
                        intrinsicMeasurable7 = null;
                        break;
                    }
                    intrinsicMeasurable7 = list.get(i43);
                    if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable7), "Supporting")) {
                        break;
                    }
                    i43++;
                }
                IntrinsicMeasurable intrinsicMeasurable15 = intrinsicMeasurable7;
                if (intrinsicMeasurable15 != null) {
                    i2 = iIntValue;
                    iIntValue5 = ((Number) function2.invoke(intrinsicMeasurable15, Integer.valueOf(i))).intValue();
                } else {
                    i2 = iIntValue;
                    iIntValue5 = 0;
                }
                return m1380calculateHeightmKXJcVc(intrinsicMeasureScope, i2, iIntValue2, iIntValue3, iIntValue4, iIntValue7, iIntValue6, iIntValue8, iIntValue5, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), false, fInvoke);
            }
            i32++;
            iIntValue6 = iIntValue6;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    private final int intrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        IntrinsicMeasurable intrinsicMeasurable5;
        IntrinsicMeasurable intrinsicMeasurable6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            IntrinsicMeasurable intrinsicMeasurable7 = list.get(i2);
            if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable7), "TextField")) {
                int iIntValue = ((Number) function2.invoke(intrinsicMeasurable7, Integer.valueOf(i))).intValue();
                List<? extends IntrinsicMeasurable> list2 = list;
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    intrinsicMeasurable = null;
                    if (i3 >= size2) {
                        intrinsicMeasurable2 = null;
                        break;
                    }
                    intrinsicMeasurable2 = list.get(i3);
                    if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable2), "Label")) {
                        break;
                    }
                    i3++;
                }
                IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable2;
                int iIntValue2 = intrinsicMeasurable8 != null ? ((Number) function2.invoke(intrinsicMeasurable8, Integer.valueOf(i))).intValue() : 0;
                int size3 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size3) {
                        intrinsicMeasurable3 = null;
                        break;
                    }
                    intrinsicMeasurable3 = list.get(i5);
                    if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable3), "Trailing")) {
                        break;
                    }
                    i5++;
                }
                IntrinsicMeasurable intrinsicMeasurable9 = intrinsicMeasurable3;
                int iIntValue3 = intrinsicMeasurable9 != null ? ((Number) function2.invoke(intrinsicMeasurable9, Integer.valueOf(i))).intValue() : 0;
                int size4 = list2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        intrinsicMeasurable4 = null;
                        break;
                    }
                    intrinsicMeasurable4 = list.get(i6);
                    if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable4), "Leading")) {
                        break;
                    }
                    i6++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable4;
                int iIntValue4 = intrinsicMeasurable10 != null ? ((Number) function2.invoke(intrinsicMeasurable10, Integer.valueOf(i))).intValue() : 0;
                int size5 = list2.size();
                int i21 = 0;
                while (true) {
                    if (i21 >= size5) {
                        intrinsicMeasurable5 = null;
                        break;
                    }
                    intrinsicMeasurable5 = list.get(i21);
                    if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable5), "Prefix")) {
                        break;
                    }
                    i21++;
                }
                IntrinsicMeasurable intrinsicMeasurable11 = intrinsicMeasurable5;
                int iIntValue5 = intrinsicMeasurable11 != null ? ((Number) function2.invoke(intrinsicMeasurable11, Integer.valueOf(i))).intValue() : 0;
                int size6 = list2.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size6) {
                        intrinsicMeasurable6 = null;
                        break;
                    }
                    intrinsicMeasurable6 = list.get(i22);
                    if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable6), "Suffix")) {
                        break;
                    }
                    i22++;
                }
                IntrinsicMeasurable intrinsicMeasurable12 = intrinsicMeasurable6;
                int iIntValue6 = intrinsicMeasurable12 != null ? ((Number) function2.invoke(intrinsicMeasurable12, Integer.valueOf(i))).intValue() : 0;
                int size7 = list2.size();
                int i32 = 0;
                while (true) {
                    if (i32 >= size7) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable13 = list.get(i32);
                    if (Intrinsics.f(LayoutUtilKt.getLayoutId(intrinsicMeasurable13), "Hint")) {
                        intrinsicMeasurable = intrinsicMeasurable13;
                        break;
                    }
                    i32++;
                }
                IntrinsicMeasurable intrinsicMeasurable14 = intrinsicMeasurable;
                return m1381calculateWidthIzADHW4(intrinsicMeasureScope, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, intrinsicMeasurable14 != null ? ((Number) function2.invoke(intrinsicMeasurable14, Integer.valueOf(i))).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.labelProgress.invoke());
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$11(OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Ref$ObjectRef ref$ObjectRef, Placeable placeable6, Placeable placeable7, Placeable placeable8, MeasureScope measureScope, boolean z, float f, Placeable.PlacementScope placementScope) {
        outlinedTextFieldMeasurePolicy.place(placementScope, i, i2, placeable, placeable2, placeable3, placeable4, placeable5, (Placeable) ref$ObjectRef.f186409a, placeable6, placeable7, placeable8, measureScope.getDensity(), measureScope.getLayoutDirection(), z, f, measureScope.mo768toPx0680j_4(outlinedTextFieldMeasurePolicy.horizontalIconPadding));
        return Unit.f186387a;
    }

    private final void place(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, float f, LayoutDirection layoutDirection, boolean z, float f4, float f5) {
        int i3;
        int i5;
        int i6;
        float f6;
        float f32;
        int heightOrZero = z ? LayoutUtilKt.getHeightOrZero(placeable6) : 0;
        Placeable.PlacementScope.place$default(placementScope, placeable8, 0, heightOrZero, BitmapDescriptorFactory.HUE_RED, 4, null);
        int heightOrZero2 = (i - LayoutUtilKt.getHeightOrZero(placeable9)) - (z ? LayoutUtilKt.getHeightOrZero(placeable6) : 0);
        int iC = rim.d.c(this.paddingValues.getTop() * f);
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), heightOrZero2) + heightOrZero, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (placeable6 != null) {
            int iLerp = MathHelpersKt.lerp(z ? 0 : this.singleLine ? Alignment.INSTANCE.getCenterVertically().align(placeable6.getHeight(), heightOrZero2) : iC, z ? 0 : -(placeable6.getHeight() / 2), f4);
            if (z) {
                Placeable.PlacementScope.place$default(placementScope, placeable6, TextFieldImplKt.getMinimizedAlignment(this.labelPosition).align(placeable6.getWidth(), i2, layoutDirection), iLerp, BitmapDescriptorFactory.HUE_RED, 4, null);
            } else {
                float fCalculateStartPadding = PaddingKt.calculateStartPadding(this.paddingValues, layoutDirection) * f;
                float fCalculateEndPadding = PaddingKt.calculateEndPadding(this.paddingValues, layoutDirection) * f;
                float f35 = BitmapDescriptorFactory.HUE_RED;
                if (placeable == null) {
                    f6 = fCalculateStartPadding;
                } else {
                    float width = placeable.getWidth();
                    float f36 = fCalculateStartPadding - f5;
                    if (f36 < BitmapDescriptorFactory.HUE_RED) {
                        f36 = 0.0f;
                    }
                    f6 = width + f36;
                }
                if (placeable2 == null) {
                    f32 = fCalculateEndPadding;
                } else {
                    float width2 = placeable2.getWidth();
                    float f37 = fCalculateEndPadding - f5;
                    if (f37 >= BitmapDescriptorFactory.HUE_RED) {
                        f35 = f37;
                    }
                    f32 = width2 + f35;
                }
                LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
                Placeable.PlacementScope.place$default(placementScope, placeable6, rim.d.c(MathHelpersKt.lerp(TextFieldImplKt.getExpandedAlignment(this.labelPosition).align(placeable6.getWidth(), i2 - rim.d.c(f6 + f32), layoutDirection) + (layoutDirection == layoutDirection2 ? f6 : f32), TextFieldImplKt.getMinimizedAlignment(this.labelPosition).align(placeable6.getWidth(), i2 - rim.d.c(fCalculateStartPadding + fCalculateEndPadding), layoutDirection) + (layoutDirection == layoutDirection2 ? fCalculateStartPadding : fCalculateEndPadding), f4)), iLerp, BitmapDescriptorFactory.HUE_RED, 4, null);
            }
        }
        if (placeable3 != null) {
            i3 = heightOrZero2;
            i5 = iC;
            i6 = heightOrZero;
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, LayoutUtilKt.getWidthOrZero(placeable), place$calculateVerticalPosition(i6, this, i3, i5, placeable6, placeable3), BitmapDescriptorFactory.HUE_RED, 4, null);
        } else {
            i3 = heightOrZero2;
            i5 = iC;
            i6 = heightOrZero;
        }
        int widthOrZero = LayoutUtilKt.getWidthOrZero(placeable3) + LayoutUtilKt.getWidthOrZero(placeable);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, widthOrZero, place$calculateVerticalPosition(i6, this, i3, i5, placeable6, placeable5), BitmapDescriptorFactory.HUE_RED, 4, null);
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, widthOrZero, place$calculateVerticalPosition(i6, this, i3, i5, placeable6, placeable7), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, (i2 - LayoutUtilKt.getWidthOrZero(placeable2)) - placeable4.getWidth(), place$calculateVerticalPosition(i6, this, i3, i5, placeable6, placeable4), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2 - placeable2.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i3) + i6, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, i6 + i3, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
    }

    private static final int place$calculateVerticalPosition(int i, OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy, int i2, int i3, Placeable placeable, Placeable placeable2) {
        if (outlinedTextFieldMeasurePolicy.singleLine) {
            i3 = Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i2);
        }
        return Math.max(i + i3, LayoutUtilKt.getHeightOrZero(placeable) / 2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new d(2));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(intrinsicMeasureScope, list, i, new d(1));
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
        int i;
        List<? extends Measurable> list2;
        long jM1875getZeroNHjbRc;
        List<? extends Measurable> list3;
        Measurable measurable6;
        Measurable measurable7;
        final float fInvoke = this.labelProgress.invoke();
        int iMo762roundToPx0680j_4 = measureScope.mo762roundToPx0680j_4(this.paddingValues.getBottom());
        long jM3271copyZbe2FdA$default = Constraints.m3271copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        List<? extends Measurable> list4 = list;
        int size = list4.size();
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
        Placeable placeableMo2530measureBRTryo03 = measurable8 != null ? measurable8.mo2530measureBRTryo0(jM3271copyZbe2FdA$default) : null;
        int widthOrZero = LayoutUtilKt.getWidthOrZero(placeableMo2530measureBRTryo03);
        int iMax = Math.max(0, LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo03));
        int size2 = list4.size();
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
        int size3 = list4.size();
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
        Placeable placeableMo2530measureBRTryo04 = measurable10 != null ? measurable10.mo2530measureBRTryo0(ConstraintsKt.m3294offsetNN6EwU$default(j3, -widthOrZero2, 0, 2, null)) : null;
        int widthOrZero3 = LayoutUtilKt.getWidthOrZero(placeableMo2530measureBRTryo04) + widthOrZero2;
        int iMax3 = Math.max(iMax2, LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo04));
        int size4 = list4.size();
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
        int size5 = list4.size();
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
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        int iMo762roundToPx0680j_42 = measureScope.mo762roundToPx0680j_4(this.paddingValues.mo851calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection())) + measureScope.mo762roundToPx0680j_4(this.paddingValues.mo850calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection()));
        int i22 = -MathHelpersKt.lerp(widthOrZero4 + iMo762roundToPx0680j_42, iMo762roundToPx0680j_42, fInvoke);
        int i32 = -iMo762roundToPx0680j_4;
        long j16 = j5;
        Placeable placeableMo2530measureBRTryo05 = measurable12 != null ? measurable12.mo2530measureBRTryo0(ConstraintsKt.m3293offsetNN6EwU(j16, i22, i32)) : null;
        ref$ObjectRef.f186409a = placeableMo2530measureBRTryo05;
        if (placeableMo2530measureBRTryo05 != null) {
            float width = placeableMo2530measureBRTryo05.getWidth();
            float height = placeableMo2530measureBRTryo05.getHeight();
            long jFloatToRawIntBits = Float.floatToRawIntBits(width);
            i = iMo762roundToPx0680j_4;
            list2 = list4;
            jM1875getZeroNHjbRc = Size.m1862constructorimpl((((long) Float.floatToRawIntBits(height)) & BodyPartID.bodyIdMax) | (jFloatToRawIntBits << 32));
        } else {
            i = iMo762roundToPx0680j_4;
            list2 = list4;
            jM1875getZeroNHjbRc = Size.INSTANCE.m1875getZeroNHjbRc();
        }
        this.onLabelMeasured.invoke(Size.m1861boximpl(jM1875getZeroNHjbRc));
        int size6 = list2.size();
        int i33 = 0;
        while (true) {
            if (i33 >= size6) {
                list3 = list;
                measurable6 = null;
                break;
            }
            list3 = list;
            measurable6 = list3.get(i33);
            int i43 = size6;
            if (Intrinsics.f(LayoutIdKt.getLayoutId(measurable6), "Supporting")) {
                break;
            }
            i33++;
            size6 = i43;
        }
        Measurable measurable13 = measurable6;
        int iMinIntrinsicHeight = measurable13 != null ? measurable13.minIntrinsicHeight(Constraints.m3281getMinWidthimpl(j2)) : 0;
        int iMax5 = Math.max(LayoutUtilKt.getHeightOrZero((Placeable) ref$ObjectRef.f186409a) / 2, measureScope.mo762roundToPx0680j_4(this.paddingValues.getTop()));
        long jM3271copyZbe2FdA$default2 = Constraints.m3271copyZbe2FdA$default(ConstraintsKt.m3293offsetNN6EwU(j2, -widthOrZero4, (i32 - iMax5) - iMinIntrinsicHeight), 0, 0, 0, 0, 11, null);
        int size7 = list2.size();
        int i59 = 0;
        while (i59 < size7) {
            Measurable measurable14 = list3.get(i59);
            if (Intrinsics.f(LayoutIdKt.getLayoutId(measurable14), "TextField")) {
                final Placeable placeableMo2530measureBRTryo06 = measurable14.mo2530measureBRTryo0(jM3271copyZbe2FdA$default2);
                long jM3271copyZbe2FdA$default3 = Constraints.m3271copyZbe2FdA$default(jM3271copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                List<? extends Measurable> list5 = list3;
                int size8 = list5.size();
                int i66 = 0;
                while (true) {
                    if (i66 >= size8) {
                        measurable7 = null;
                        break;
                    }
                    measurable7 = list3.get(i66);
                    if (Intrinsics.f(LayoutIdKt.getLayoutId(measurable7), "Hint")) {
                        break;
                    }
                    i66++;
                }
                Measurable measurable15 = measurable7;
                Placeable placeableMo2530measureBRTryo07 = measurable15 != null ? measurable15.mo2530measureBRTryo0(jM3271copyZbe2FdA$default3) : null;
                int iMax6 = Math.max(iMax4, Math.max(LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo06), LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo07)) + iMax5 + i);
                final int iM1381calculateWidthIzADHW4 = m1381calculateWidthIzADHW4(measureScope, LayoutUtilKt.getWidthOrZero(placeableMo2530measureBRTryo03), LayoutUtilKt.getWidthOrZero(placeableMo2530measureBRTryo0), LayoutUtilKt.getWidthOrZero(placeableMo2530measureBRTryo04), LayoutUtilKt.getWidthOrZero(placeableMo2530measureBRTryo02), placeableMo2530measureBRTryo06.getWidth(), LayoutUtilKt.getWidthOrZero((Placeable) ref$ObjectRef.f186409a), LayoutUtilKt.getWidthOrZero(placeableMo2530measureBRTryo07), j2, fInvoke);
                Placeable placeableMo2530measureBRTryo08 = measurable13 != null ? measurable13.mo2530measureBRTryo0(Constraints.m3271copyZbe2FdA$default(ConstraintsKt.m3294offsetNN6EwU$default(j16, 0, -iMax6, 1, null), 0, iM1381calculateWidthIzADHW4, 0, 0, 9, null)) : null;
                int heightOrZero = LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo08);
                final int iM1380calculateHeightmKXJcVc = m1380calculateHeightmKXJcVc(measureScope, LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo03), LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo0), LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo04), LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo02), placeableMo2530measureBRTryo06.getHeight(), LayoutUtilKt.getHeightOrZero((Placeable) ref$ObjectRef.f186409a), LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo07), LayoutUtilKt.getHeightOrZero(placeableMo2530measureBRTryo08), j2, false, fInvoke);
                int i74 = iM1380calculateHeightmKXJcVc - heightOrZero;
                int size9 = list5.size();
                int i92 = 0;
                while (i92 < size9) {
                    Measurable measurable16 = list3.get(i92);
                    if (Intrinsics.f(LayoutIdKt.getLayoutId(measurable16), "Container")) {
                        final Placeable placeableMo2530measureBRTryo09 = measurable16.mo2530measureBRTryo0(ConstraintsKt.Constraints(iM1381calculateWidthIzADHW4 != Integer.MAX_VALUE ? iM1381calculateWidthIzADHW4 : 0, iM1381calculateWidthIzADHW4, i74 != Integer.MAX_VALUE ? i74 : 0, i74));
                        final Placeable placeable = placeableMo2530measureBRTryo0;
                        final Placeable placeable2 = placeableMo2530measureBRTryo04;
                        final Placeable placeable3 = placeableMo2530measureBRTryo08;
                        final Placeable placeable4 = placeableMo2530measureBRTryo02;
                        final Placeable placeable5 = placeableMo2530measureBRTryo07;
                        final Placeable placeable6 = placeableMo2530measureBRTryo03;
                        return MeasureScope.layout$default(measureScope, iM1381calculateWidthIzADHW4, iM1380calculateHeightmKXJcVc, null, new Function1() { // from class: androidx.compose.material3.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OutlinedTextFieldMeasurePolicy.measure_3p2s80s$lambda$11(this.f7197a, iM1380calculateHeightmKXJcVc, iM1381calculateWidthIzADHW4, placeable6, placeable, placeable2, placeable4, placeableMo2530measureBRTryo06, ref$ObjectRef, placeable5, placeableMo2530measureBRTryo09, placeable3, measureScope, false, fInvoke, (Placeable.PlacementScope) obj2);
                            }
                        }, 4, null);
                    }
                    i92++;
                    placeableMo2530measureBRTryo08 = placeableMo2530measureBRTryo08;
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            i59++;
            j16 = j16;
            jM3271copyZbe2FdA$default2 = jM3271copyZbe2FdA$default2;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new d(0));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(intrinsicMeasureScope, list, i, new d(3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private OutlinedTextFieldMeasurePolicy(Function1<? super Size, Unit> function1, boolean z, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, PaddingValues paddingValues, float f) {
        this.onLabelMeasured = function1;
        this.singleLine = z;
        this.labelPosition = textFieldLabelPosition;
        this.labelProgress = floatProducer;
        this.paddingValues = paddingValues;
        this.horizontalIconPadding = f;
    }
}
