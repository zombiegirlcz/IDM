package androidx.glance.session;

import android.content.Context;
import fim.a;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a[\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00052\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"observeIdleEvents", "T", "context", "Landroid/content/Context;", "onIdle", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "block", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class IdleEventBroadcastReceiverKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.glance.session.IdleEventBroadcastReceiverKt$observeIdleEvents$2, reason: invalid class name */
    @d(c = "androidx.glance.session.IdleEventBroadcastReceiverKt$observeIdleEvents$2", f = "IdleEventBroadcastReceiver.kt", l = {88}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2<T> extends i implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function1<Continuation<? super T>, Object> $block;
        final /* synthetic */ Context $context;
        final /* synthetic */ Function1<Continuation<? super Unit>, Object> $onIdle;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Context context, Function1<? super Continuation<? super T>, ? extends Object> function1, Function1<? super Continuation<? super Unit>, ? extends Object> function12, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$block = function1;
            this.$onIdle = function12;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$context, this.$block, this.$onIdle, continuation);
            anonymousClass2.L$0 = obj2;
            return anonymousClass2;
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) throws Throwable {
            IdleEventBroadcastReceiver idleEventBroadcastReceiver;
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                idleEventBroadcastReceiver = (IdleEventBroadcastReceiver) this.L$0;
                try {
                    o.b(obj2);
                    this.$context.unregisterReceiver(idleEventBroadcastReceiver);
                    return obj2;
                } catch (Throwable th10) {
                    th = th10;
                    this.$context.unregisterReceiver(idleEventBroadcastReceiver);
                    throw th;
                }
            }
            o.b(obj2);
            IdleEventBroadcastReceiver idleEventBroadcastReceiver2 = new IdleEventBroadcastReceiver(new IdleEventBroadcastReceiverKt$observeIdleEvents$2$idleReceiver$1((CoroutineScope) this.L$0, this.$onIdle));
            this.$context.registerReceiver(idleEventBroadcastReceiver2, IdleEventBroadcastReceiver.INSTANCE.getFilter());
            try {
                idleEventBroadcastReceiver2.checkIdleStatus$glance_release(this.$context);
                Function1<Continuation<? super T>, Object> function1 = this.$block;
                this.L$0 = idleEventBroadcastReceiver2;
                this.label = 1;
                obj2 = function1.invoke(this);
                if (obj2 == aVar) {
                    return aVar;
                }
                idleEventBroadcastReceiver = idleEventBroadcastReceiver2;
                this.$context.unregisterReceiver(idleEventBroadcastReceiver);
                return obj2;
            } catch (Throwable th11) {
                th = th11;
                idleEventBroadcastReceiver = idleEventBroadcastReceiver2;
                this.$context.unregisterReceiver(idleEventBroadcastReceiver);
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final <T> Object observeIdleEvents(@NotNull Context context, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> function1, @NotNull Function1<? super Continuation<? super T>, ? extends Object> function12, @NotNull Continuation<? super T> continuation) {
        return e0.o(new AnonymousClass2(context, function12, function1, null), continuation);
    }
}
