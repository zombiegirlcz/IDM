package androidx.compose.ui.node;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class LookaheadPassDelegate$layoutChildrenBlock$1 extends u implements Function0<Unit> {
    final /* synthetic */ LookaheadPassDelegate this$0;

    /* JADX INFO: renamed from: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "child", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<AlignmentLinesOwner, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((AlignmentLinesOwner) obj2);
            return Unit.f186387a;
        }

        public final void invoke(AlignmentLinesOwner alignmentLinesOwner) {
            alignmentLinesOwner.getAlignmentLines().setUsedDuringParentLayout$ui(false);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "child", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass4 extends u implements Function1<AlignmentLinesOwner, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((AlignmentLinesOwner) obj2);
            return Unit.f186387a;
        }

        public final void invoke(AlignmentLinesOwner alignmentLinesOwner) {
            alignmentLinesOwner.getAlignmentLines().setPreviousUsedDuringParentLayout$ui(alignmentLinesOwner.getAlignmentLines().getUsedDuringParentLayout());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LookaheadPassDelegate$layoutChildrenBlock$1(LookaheadPassDelegate lookaheadPassDelegate) {
        super(0);
        this.this$0 = lookaheadPassDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m2668invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m2668invoke() {
        this.this$0.clearPlaceOrder();
        this.this$0.forEachChildAlignmentLinesOwner(AnonymousClass1.INSTANCE);
        LookaheadDelegate lookaheadDelegate = this.this$0.getInnerCoordinator().getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            boolean isPlacingForAlignment = lookaheadDelegate.getIsPlacingForAlignment();
            List<LayoutNode> children$ui = this.this$0.getLayoutNode().getChildren$ui();
            int size = children$ui.size();
            for (int i = 0; i < size; i++) {
                LookaheadDelegate lookaheadDelegate2 = children$ui.get(i).getOuterCoordinator$ui().getLookaheadDelegate();
                if (lookaheadDelegate2 != null) {
                    lookaheadDelegate2.setPlacingForAlignment$ui(isPlacingForAlignment);
                }
            }
        }
        LookaheadDelegate lookaheadDelegate3 = this.this$0.getInnerCoordinator().getLookaheadDelegate();
        Intrinsics.h(lookaheadDelegate3);
        lookaheadDelegate3.getMeasureResult$ui().placeChildren();
        LookaheadDelegate lookaheadDelegate4 = this.this$0.getInnerCoordinator().getLookaheadDelegate();
        if (lookaheadDelegate4 != null) {
            lookaheadDelegate4.getIsPlacingForAlignment();
            List<LayoutNode> children$ui2 = this.this$0.getLayoutNode().getChildren$ui();
            int size2 = children$ui2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                LookaheadDelegate lookaheadDelegate5 = children$ui2.get(i2).getOuterCoordinator$ui().getLookaheadDelegate();
                if (lookaheadDelegate5 != null) {
                    lookaheadDelegate5.setPlacingForAlignment$ui(false);
                }
            }
        }
        this.this$0.checkChildrenPlaceOrderForUpdates();
        this.this$0.forEachChildAlignmentLinesOwner(AnonymousClass4.INSTANCE);
    }
}
