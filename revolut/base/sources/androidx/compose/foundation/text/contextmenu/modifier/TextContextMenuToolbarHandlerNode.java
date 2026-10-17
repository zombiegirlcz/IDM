package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import com.youTransactor.uCube.rpc.Constants;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import skm.d0;
import skm.e0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003Be\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001e\u0010\n\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006\u0012\u001e\u0010\u000b\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u0013R:\u0010\n\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R:\u0010\u000b\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010'\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001b\u00106\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\"R\u0016\u00107\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuDataProvider;", "Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;", "requester", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "onShow", "onHide", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "computeContentBounds", "<init>", "(Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "toolbarRequester", "update", "(Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;)V", "onAttach", "()V", "onDetach", "show", "hide", "destinationCoordinates", "Landroidx/compose/ui/geometry/Offset;", "position-tuRUvjQ", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "position", "contentBounds", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", "data", "()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", "Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;", "getRequester", "()Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;", "setRequester", "Lkotlin/jvm/functions/Function1;", "getOnShow", "()Lkotlin/jvm/functions/Function1;", "setOnShow", "(Lkotlin/jvm/functions/Function1;)V", "getOnHide", "setOnHide", "getComputeContentBounds", "setComputeContentBounds", "Lkotlinx/coroutines/Job;", "textToolbarJob", "Lkotlinx/coroutines/Job;", "derivedData$delegate", "Landroidx/compose/runtime/State;", "getDerivedData", "derivedData", "previousContentBounds", "Landroidx/compose/ui/geometry/Rect;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextContextMenuToolbarHandlerNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, TextContextMenuDataProvider {

    @NotNull
    private Function1<? super LayoutCoordinates, Rect> computeContentBounds;
    private Function1<? super Continuation<? super Unit>, ? extends Object> onHide;
    private Function1<? super Continuation<? super Unit>, ? extends Object> onShow;

    @NotNull
    private ToolbarRequester requester;
    private Job textToolbarJob;

    /* JADX INFO: renamed from: derivedData$delegate, reason: from kotlin metadata */
    @NotNull
    private final State derivedData = SnapshotStateKt.derivedStateOf(new pyc.a(this, 8));

    @NotNull
    private Rect previousContentBounds = Rect.INSTANCE.getZero();

    /* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1, reason: invalid class name */
    @d(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1", f = "TextContextMenuToolbarHandlerModifier.kt", l = {Constants.TAG_KSN_FORMATS, 206, 208, 208}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TextContextMenuProvider $provider;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextContextMenuProvider textContextMenuProvider, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$provider = textContextMenuProvider;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return TextContextMenuToolbarHandlerNode.this.new AnonymousClass1(this.$provider, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
        
            if (r7.invoke(r6) == r0) goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r6.label
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L30
                if (r1 == r5) goto L2c
                if (r1 == r4) goto L26
                if (r1 == r3) goto L22
                if (r1 == r2) goto L1a
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r0 = r6.L$0
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                yhm.o.b(r7)
                goto L79
            L22:
                yhm.o.b(r7)
                goto L62
            L26:
                yhm.o.b(r7)     // Catch: java.lang.Throwable -> L2a
                goto L51
            L2a:
                r7 = move-exception
                goto L65
            L2c:
                yhm.o.b(r7)     // Catch: java.lang.Throwable -> L2a
                goto L44
            L30:
                yhm.o.b(r7)
                androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode r7 = androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode.this     // Catch: java.lang.Throwable -> L2a
                kotlin.jvm.functions.Function1 r7 = r7.getOnShow()     // Catch: java.lang.Throwable -> L2a
                if (r7 == 0) goto L44
                r6.label = r5     // Catch: java.lang.Throwable -> L2a
                java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L2a
                if (r7 != r0) goto L44
                goto L77
            L44:
                androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider r7 = r6.$provider     // Catch: java.lang.Throwable -> L2a
                androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode r1 = androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode.this     // Catch: java.lang.Throwable -> L2a
                r6.label = r4     // Catch: java.lang.Throwable -> L2a
                java.lang.Object r7 = r7.showTextContextMenu(r1, r6)     // Catch: java.lang.Throwable -> L2a
                if (r7 != r0) goto L51
                goto L77
            L51:
                androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode r7 = androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode.this
                kotlin.jvm.functions.Function1 r7 = r7.getOnHide()
                if (r7 == 0) goto L62
                r6.label = r3
                java.lang.Object r7 = r7.invoke(r6)
                if (r7 != r0) goto L62
                goto L77
            L62:
                kotlin.Unit r7 = kotlin.Unit.f186387a
                return r7
            L65:
                androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode r1 = androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode.this
                kotlin.jvm.functions.Function1 r1 = r1.getOnHide()
                if (r1 == 0) goto L7a
                r6.L$0 = r7
                r6.label = r2
                java.lang.Object r1 = r1.invoke(r6)
                if (r1 != r0) goto L78
            L77:
                return r0
            L78:
                r0 = r7
            L79:
                r7 = r0
            L7a:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public TextContextMenuToolbarHandlerNode(@NotNull ToolbarRequester toolbarRequester, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Function1<? super Continuation<? super Unit>, ? extends Object> function12, @NotNull Function1<? super LayoutCoordinates, Rect> function13) {
        this.requester = toolbarRequester;
        this.onShow = function1;
        this.onHide = function12;
        this.computeContentBounds = function13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextContextMenuData derivedData_delegate$lambda$0(TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode) {
        return textContextMenuToolbarHandlerNode.getIsAttached() ? TextContextMenuModifierKt.collectTextContextMenuData(textContextMenuToolbarHandlerNode) : TextContextMenuData.INSTANCE.getEmpty();
    }

    private final TextContextMenuData getDerivedData() {
        return (TextContextMenuData) this.derivedData.getValue();
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
    @NotNull
    public Rect contentBounds(@NotNull LayoutCoordinates destinationCoordinates) {
        Rect rect;
        if (getIsAttached() && (rect = (Rect) this.computeContentBounds.invoke(destinationCoordinates)) != null) {
            this.previousContentBounds = rect;
            return rect;
        }
        return this.previousContentBounds;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
    @NotNull
    public TextContextMenuData data() {
        return getDerivedData();
    }

    public final Function1<Continuation<? super Unit>, Object> getOnHide() {
        return this.onHide;
    }

    public final Function1<Continuation<? super Unit>, Object> getOnShow() {
        return this.onShow;
    }

    public final void hide() {
        Job job2 = this.textToolbarJob;
        if (job2 == null) {
            return;
        }
        job2.f(null);
        this.textToolbarJob = null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.requester.setToolbarHandlerState$foundation(ToolbarHandlerState.Attached);
        this.requester.setToolbarHandlerNode$foundation(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.requester.setToolbarHandlerState$foundation(ToolbarHandlerState.Detached);
        this.requester.setToolbarHandlerNode$foundation(null);
        super.onDetach();
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
    /* JADX INFO: renamed from: position-tuRUvjQ */
    public long mo1073positiontuRUvjQ(@NotNull LayoutCoordinates destinationCoordinates) {
        return contentBounds(destinationCoordinates).m1851getTopLeftF1C5BW0();
    }

    public final void setComputeContentBounds(@NotNull Function1<? super LayoutCoordinates, Rect> function1) {
        this.computeContentBounds = function1;
    }

    public final void setOnHide(Function1<? super Continuation<? super Unit>, ? extends Object> function1) {
        this.onHide = function1;
    }

    public final void setOnShow(Function1<? super Continuation<? super Unit>, ? extends Object> function1) {
        this.onShow = function1;
    }

    public final void show() {
        TextContextMenuProvider textContextMenuProvider;
        if (getIsAttached()) {
            Job job2 = this.textToolbarJob;
            if ((job2 == null || !job2.d()) && (textContextMenuProvider = (TextContextMenuProvider) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextContextMenuProviderKt.getLocalTextContextMenuToolbarProvider())) != null) {
                this.textToolbarJob = e0.C(getCoroutineScope(), null, d0.UNDISPATCHED, new AnonymousClass1(textContextMenuProvider, null), 1);
            }
        }
    }

    public final void update(@NotNull ToolbarRequester toolbarRequester) {
        this.requester.setToolbarHandlerNode$foundation(null);
        this.requester = toolbarRequester;
        toolbarRequester.setToolbarHandlerNode$foundation(this);
        this.requester.setToolbarHandlerState$foundation(getIsAttached() ? ToolbarHandlerState.Attached : ToolbarHandlerState.Detached);
    }
}
