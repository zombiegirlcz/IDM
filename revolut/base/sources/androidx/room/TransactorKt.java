package androidx.room;

import amf.i;
import androidx.sqlite.SQLiteStatement;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/room/PooledConnection;", "", "sql", "", "execSQL", "(Landroidx/room/PooledConnection;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class TransactorKt {
    public static final Object execSQL(@NotNull PooledConnection pooledConnection, @NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object objUsePrepared = pooledConnection.usePrepared(str, new i(21), continuation);
        return objUsePrepared == fim.a.COROUTINE_SUSPENDED ? objUsePrepared : Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean execSQL$lambda$0(SQLiteStatement it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.step();
    }
}
