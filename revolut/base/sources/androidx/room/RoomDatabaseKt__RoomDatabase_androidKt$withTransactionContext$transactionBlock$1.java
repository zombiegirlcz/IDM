package androidx.room;

import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes16.dex */
@d(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1", f = "RoomDatabase.android.kt", l = {YearClass.CLASS_2015}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1<R> extends i implements Function2<CoroutineScope, Continuation<? super R>, Object> {
    final /* synthetic */ Function1<Continuation<? super R>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1(Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1> continuation) {
        super(2, continuation);
        this.$block = function1;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 = new RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1(this.$block, continuation);
        roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1.L$0 = obj2;
        return roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        TransactionElement transactionElement;
        Throwable th10;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transactionElement = (TransactionElement) this.L$0;
            try {
                o.b(obj2);
                transactionElement.release();
                return obj2;
            } catch (Throwable th11) {
                th10 = th11;
                transactionElement.release();
                throw th10;
            }
        }
        o.b(obj2);
        CoroutineContext.Element element = ((CoroutineScope) this.L$0).getCoroutineContext().get(TransactionElement.INSTANCE);
        Intrinsics.h(element);
        TransactionElement transactionElement2 = (TransactionElement) element;
        transactionElement2.acquire();
        try {
            Function1<Continuation<? super R>, Object> function1 = this.$block;
            this.L$0 = transactionElement2;
            this.label = 1;
            Object objInvoke = function1.invoke(this);
            if (objInvoke == aVar) {
                return aVar;
            }
            transactionElement = transactionElement2;
            obj2 = objInvoke;
            transactionElement.release();
            return obj2;
        } catch (Throwable th12) {
            transactionElement = transactionElement2;
            th10 = th12;
            transactionElement.release();
            throw th10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
        return ((RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
