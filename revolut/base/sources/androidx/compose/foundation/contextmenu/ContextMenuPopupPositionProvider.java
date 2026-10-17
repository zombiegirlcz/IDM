package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import dy0.e0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nB/\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\fJ/\u0010\u0015\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R(\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuPopupPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Lkotlin/Function0;", "Landroidx/compose/ui/unit/IntOffset;", "anchorPositionBlock", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "", "onPositionCalculated", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "anchorPosition", "(JLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function2;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContextMenuPopupPositionProvider implements PopupPositionProvider {

    @NotNull
    private final Function0<IntOffset> anchorPositionBlock;
    private final Function2<IntOffset, IntRect, Unit> onPositionCalculated;

    public /* synthetic */ ContextMenuPopupPositionProvider(long j2, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, (Function2<? super IntOffset, ? super IntRect, Unit>) function2);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4, reason: not valid java name */
    public long mo663calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long windowSize, @NotNull LayoutDirection layoutDirection, long popupContentSize) {
        long packedValue = ((IntOffset) this.anchorPositionBlock.invoke()).getPackedValue();
        long jM3329constructorimpl = IntOffset.m3329constructorimpl((((long) ContextMenuPopupPositionProviderKt.alignPopupAxis(IntOffset.m3334getXimpl(packedValue) + anchorBounds.getLeft(), (int) (popupContentSize >> 32), (int) (windowSize >> 32), layoutDirection == LayoutDirection.Ltr)) << 32) | (BodyPartID.bodyIdMax & ((long) ContextMenuPopupPositionProviderKt.alignPopupAxis$default(IntOffset.m3335getYimpl(packedValue) + anchorBounds.getTop(), (int) (popupContentSize & BodyPartID.bodyIdMax), (int) (windowSize & BodyPartID.bodyIdMax), false, 8, null))));
        Function2<IntOffset, IntRect, Unit> function2 = this.onPositionCalculated;
        if (function2 != null) {
            function2.invoke(IntOffset.m3328boximpl(packedValue), IntRectKt.m3349IntRectVbeCjmY(jM3329constructorimpl, popupContentSize));
        }
        return jM3329constructorimpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContextMenuPopupPositionProvider(@NotNull Function0<IntOffset> function0, Function2<? super IntOffset, ? super IntRect, Unit> function2) {
        this.anchorPositionBlock = function0;
        this.onPositionCalculated = function2;
    }

    public /* synthetic */ ContextMenuPopupPositionProvider(Function0 function0, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((Function0<IntOffset>) function0, (Function2<? super IntOffset, ? super IntRect, Unit>) ((i & 2) != 0 ? null : function2));
    }

    public /* synthetic */ ContextMenuPopupPositionProvider(long j2, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, (i & 2) != 0 ? null : function2, null);
    }

    private ContextMenuPopupPositionProvider(long j2, Function2<? super IntOffset, ? super IntRect, Unit> function2) {
        this(new e0(j2, 1), function2);
    }
}
