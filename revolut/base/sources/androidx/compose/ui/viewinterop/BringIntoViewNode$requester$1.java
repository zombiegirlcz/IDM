package androidx.compose.ui.viewinterop;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.relocation.BringIntoViewModifierNodeKt;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class BringIntoViewNode$requester$1 extends u implements Function1<Rect, Unit> {
    final /* synthetic */ BringIntoViewNode this$0;

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1, reason: invalid class name */
    @d(c = "androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1", f = "AndroidViewHolder.android.kt", l = {763}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Rect $rect;
        int label;
        final /* synthetic */ BringIntoViewNode this$0;

        /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Rect;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C00551 extends u implements Function0<Rect> {
            final /* synthetic */ Rect $rect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00551(Rect rect) {
                super(0);
                this.$rect = rect;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Rect invoke() {
                return this.$rect;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BringIntoViewNode bringIntoViewNode, Rect rect, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = bringIntoViewNode;
            this.$rect = rect;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$rect, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                BringIntoViewNode bringIntoViewNode = this.this$0;
                C00551 c00551 = new C00551(this.$rect);
                this.label = 1;
                if (BringIntoViewModifierNodeKt.bringIntoView(bringIntoViewNode, c00551, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewNode$requester$1(BringIntoViewNode bringIntoViewNode) {
        super(1);
        this.this$0 = bringIntoViewNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((Rect) obj2);
        return Unit.f186387a;
    }

    public final void invoke(Rect rect) {
        if (this.this$0.getIsAttached()) {
            e0.C(this.this$0.getCoroutineScope(), null, null, new AnonymousClass1(this.this$0, rect, null), 3);
        }
    }
}
