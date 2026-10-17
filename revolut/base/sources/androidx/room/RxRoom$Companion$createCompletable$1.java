package androidx.room;

import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes16.dex */
@d(c = "androidx.room.RxRoom$Companion$createCompletable$1", f = "RxRoom.kt", l = {96}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class RxRoom$Companion$createCompletable$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<SQLiteConnection, Unit> $block;
    final /* synthetic */ RoomDatabase $db;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RxRoom$Companion$createCompletable$1(RoomDatabase roomDatabase, boolean z, boolean z3, Function1<? super SQLiteConnection, Unit> function1, Continuation<? super RxRoom$Companion$createCompletable$1> continuation) {
        super(2, continuation);
        this.$db = roomDatabase;
        this.$isReadOnly = z;
        this.$inTransaction = z3;
        this.$block = function1;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new RxRoom$Companion$createCompletable$1(this.$db, this.$isReadOnly, this.$inTransaction, this.$block, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            RoomDatabase roomDatabase = this.$db;
            boolean z = this.$isReadOnly;
            boolean z3 = this.$inTransaction;
            Function1<SQLiteConnection, Unit> function1 = this.$block;
            this.label = 1;
            if (DBUtil.performSuspending(roomDatabase, z, z3, function1, this) == aVar) {
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
        return ((RxRoom$Companion$createCompletable$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
