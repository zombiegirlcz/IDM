package androidx.compose.ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.WeakReference;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "closedConnection", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class InputMethodSession$createInputConnection$1$1 extends u implements Function1<NullableInputConnectionWrapper, Unit> {
    final /* synthetic */ InputMethodSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputMethodSession$createInputConnection$1$1(InputMethodSession inputMethodSession) {
        super(1);
        this.this$0 = inputMethodSession;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((NullableInputConnectionWrapper) obj2);
        return Unit.f186387a;
    }

    public final void invoke(NullableInputConnectionWrapper nullableInputConnectionWrapper) {
        nullableInputConnectionWrapper.disposeDelegate();
        MutableVector mutableVector = this.this$0.connections;
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (Intrinsics.f((WeakReference) objArr[i], nullableInputConnectionWrapper)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            this.this$0.connections.removeAt(i);
        }
        if (this.this$0.connections.getSize() == 0) {
            this.this$0.onAllConnectionsClosed.invoke();
        }
    }
}
