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
import org.jmrtd.lds.LDSFile;
import yhm.o;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes16.dex */
@d(c = "androidx.room.RxRoom$Companion$createSingle$1", f = "RxRoom.kt", l = {LDSFile.EF_DG13_TAG}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "T", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class RxRoom$Companion$createSingle$1<T> extends i implements Function2<CoroutineScope, Continuation<? super T>, Object> {
    final /* synthetic */ Function1<SQLiteConnection, T> $block;
    final /* synthetic */ RoomDatabase $db;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RxRoom$Companion$createSingle$1(RoomDatabase roomDatabase, boolean z, boolean z3, Function1<? super SQLiteConnection, ? extends T> function1, Continuation<? super RxRoom$Companion$createSingle$1> continuation) {
        super(2, continuation);
        this.$db = roomDatabase;
        this.$isReadOnly = z;
        this.$inTransaction = z3;
        this.$block = function1;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new RxRoom$Companion$createSingle$1(this.$db, this.$isReadOnly, this.$inTransaction, this.$block, continuation);
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
            Function1<SQLiteConnection, T> function1 = this.$block;
            this.label = 1;
            obj2 = DBUtil.performSuspending(roomDatabase, z, z3, function1, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new EmptyResultSetException("Query returned empty result set.");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
        return ((RxRoom$Companion$createSingle$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
