package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.OnLayoutRectChangedModifierKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.q;
import skm.r;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00060\u0002R\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\u00052\n\u0010\n\u001a\u00060\u0002R\u00020\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\b\u0018\u00010\u0002R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier$Node;", "<init>", "()V", "", "waitForFirstLayout", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier$Node;", "node", "update", "(Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier$Node;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "attachedNode", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier$Node;", "Lskm/q;", "lock", "Lskm/q;", "Node", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AwaitFirstLayoutModifier extends ModifierNodeElement<Node> {
    private Node attachedNode;
    private q lock;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0006\u0010\b\u001a\u00020\u0005J\b\u0010\t\u001a\u00020\u0005H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier$Node;", "Landroidx/compose/ui/Modifier$Node;", "<init>", "(Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;)V", "onAttach", "", "handle", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "requestOnAfterLayoutCallback", "onDetach", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Node extends Modifier.Node {
        private DelegatableNode.RegistrationHandle handle;

        public Node() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestOnAfterLayoutCallback$lambda$0(Node node, AwaitFirstLayoutModifier awaitFirstLayoutModifier, RelativeLayoutBounds relativeLayoutBounds) {
            DelegatableNode.RegistrationHandle registrationHandle = node.handle;
            if (registrationHandle != null) {
                registrationHandle.unregister();
            }
            node.handle = null;
            q qVar = awaitFirstLayoutModifier.lock;
            if (qVar != null) {
                ((r) qVar).U(Unit.f186387a);
            }
            awaitFirstLayoutModifier.lock = null;
            return Unit.f186387a;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onAttach() {
            AwaitFirstLayoutModifier.this.attachedNode = this;
            if (AwaitFirstLayoutModifier.this.lock != null) {
                requestOnAfterLayoutCallback();
            }
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onDetach() {
            if (AwaitFirstLayoutModifier.this.attachedNode == this) {
                AwaitFirstLayoutModifier.this.attachedNode = null;
            }
            DelegatableNode.RegistrationHandle registrationHandle = this.handle;
            if (registrationHandle != null) {
                registrationHandle.unregister();
            }
            this.handle = null;
        }

        public final void requestOnAfterLayoutCallback() {
            this.handle = OnLayoutRectChangedModifierKt.registerOnLayoutRectChanged(this, 0L, 0L, new k1.a(this, AwaitFirstLayoutModifier.this, 0));
        }
    }

    public boolean equals(Object other) {
        return other == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Constants.TAG_EMV_ICC_CONFIG_VERSION;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        inspectorInfo.setName("AwaitFirstLayoutModifier");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@NotNull Node node) {
    }

    public final Object waitForFirstLayout(@NotNull Continuation<? super Unit> continuation) {
        q qVarB = this.lock;
        if (qVarB == null) {
            qVarB = e0.b();
            this.lock = qVarB;
            Node node = this.attachedNode;
            if (node != null && node.getIsAttached()) {
                node.requestOnAfterLayoutCallback();
            }
        }
        Object objY = ((r) qVarB).y(continuation);
        return objY == fim.a.COROUTINE_SUSPENDED ? objY : Unit.f186387a;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public Node create() {
        return new Node();
    }
}
