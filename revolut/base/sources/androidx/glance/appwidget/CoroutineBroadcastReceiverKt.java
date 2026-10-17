package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import fim.a;
import gim.d;
import gim.i;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aD\u0010\t\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroid/content/BroadcastReceiver;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "block", "goAsync", "(Landroid/content/BroadcastReceiver;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class CoroutineBroadcastReceiverKt {

    /* JADX INFO: renamed from: androidx.glance.appwidget.CoroutineBroadcastReceiverKt$goAsync$1, reason: invalid class name */
    @d(c = "androidx.glance.appwidget.CoroutineBroadcastReceiverKt$goAsync$1", f = "CoroutineBroadcastReceiver.kt", l = {45}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, CoroutineScope coroutineScope, BroadcastReceiver.PendingResult pendingResult, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$block = function2;
            this.$coroutineScope = coroutineScope;
            this.$pendingResult = pendingResult;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, this.$coroutineScope, this.$pendingResult, continuation);
            anonymousClass1.L$0 = obj2;
            return anonymousClass1;
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        o.b(obj2);
                        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                        Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.$block;
                        this.label = 1;
                        if (function2.invoke(coroutineScope, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                } catch (CancellationException e) {
                    try {
                        throw e;
                    } finally {
                        e0.k(this.$coroutineScope, null);
                    }
                } catch (Throwable th10) {
                }
                return Unit.f186387a;
            } finally {
                try {
                    this.$pendingResult.finish();
                } catch (IllegalStateException e2) {
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final void goAsync(@NotNull BroadcastReceiver broadcastReceiver, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        zkm.d dVarC = e0.c(e.d(e0.e(), coroutineContext));
        e0.C(dVarC, null, null, new AnonymousClass1(function2, dVarC, broadcastReceiver.goAsync(), null), 3);
    }

    public static void goAsync$default(BroadcastReceiver broadcastReceiver, CoroutineContext coroutineContext, Function2 function2, int i, Object obj2) {
        if ((i & 1) != 0) {
            coroutineContext = p0.f264002b;
        }
        goAsync(broadcastReceiver, coroutineContext, function2);
    }
}
