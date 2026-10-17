package androidx.room;

import ai0.j;
import androidx.room.coroutines.FlowUtil;
import androidx.sqlite.SQLiteConnection;
import efm.d0;
import efm.e0;
import efm.k;
import efm.r;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import skm.g1;
import te0.w;
import vkm.t0;
import yhm.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/room/RxRoom;", "", "<init>", "()V", "Companion", "room-rxjava2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class RxRoom {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Object NOTHING = new Object();

    /* JADX INFO: loaded from: classes16.dex */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00018\u00000\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00018\u00000\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J;\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00160\fH\u0007¢\u0006\u0004\b\u0018\u0010\u0019JM\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00018\u00000\fH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\b\b\u0000\u0010\u0004*\u00020\u00012\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001dH\u0007¢\u0006\u0004\b\u001b\u0010\u001fR\u0014\u0010 \u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/room/RxRoom$Companion;", "", "<init>", "()V", "T", "Landroidx/room/RoomDatabase;", "db", "", "inTransaction", "", "", "tableNames", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteConnection;", "block", "Lefm/r;", "createObservable", "(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lefm/r;", "isReadOnly", "Lefm/k;", "createMaybe", "(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Lefm/k;", "", "Lefm/b;", "createCompletable", "(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Lefm/b;", "Lefm/d0;", "createSingle", "(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Lefm/d0;", "Ljava/util/concurrent/Callable;", "callable", "(Ljava/util/concurrent/Callable;)Lefm/d0;", "NOTHING", "Ljava/lang/Object;", "room-rxjava2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createSingle$lambda$6(Callable callable, e0 emitter) throws Exception {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            try {
                Object objCall = callable.call();
                if (objCall == null) {
                    throw new EmptyResultSetException("Query returned empty result set.");
                }
                ((ufm.a) emitter).b(objCall);
            } catch (EmptyResultSetException e) {
                ((ufm.a) emitter).c(e);
            }
        }

        @NotNull
        public final efm.b createCompletable(@NotNull RoomDatabase db8, boolean isReadOnly, boolean inTransaction, @NotNull Function1<? super SQLiteConnection, Unit> block) {
            Intrinsics.checkNotNullParameter(db8, "db");
            Intrinsics.checkNotNullParameter(block, "block");
            return pd.b.n(db8.getQueryContext().minusKey(g1.f263979a), new RxRoom$Companion$createCompletable$1(db8, isReadOnly, inTransaction, block, null));
        }

        @NotNull
        public final <T> k<T> createMaybe(@NotNull RoomDatabase db8, boolean isReadOnly, boolean inTransaction, @NotNull Function1<? super SQLiteConnection, ? extends T> block) {
            Intrinsics.checkNotNullParameter(db8, "db");
            Intrinsics.checkNotNullParameter(block, "block");
            return q.L(db8.getQueryContext().minusKey(g1.f263979a), new RxRoom$Companion$createMaybe$1(db8, isReadOnly, inTransaction, block, null));
        }

        @NotNull
        public final <T> r<T> createObservable(@NotNull RoomDatabase db8, boolean inTransaction, @NotNull String[] tableNames, @NotNull Function1<? super SQLiteConnection, ? extends T> block) {
            Intrinsics.checkNotNullParameter(db8, "db");
            Intrinsics.checkNotNullParameter(tableNames, "tableNames");
            Intrinsics.checkNotNullParameter(block, "block");
            return e.c(new t0(FlowUtil.createFlow(db8, inTransaction, tableNames, block), 1), db8.getQueryContext());
        }

        @NotNull
        public final <T> d0<T> createSingle(@NotNull RoomDatabase db8, boolean isReadOnly, boolean inTransaction, @NotNull Function1<? super SQLiteConnection, ? extends T> block) {
            Intrinsics.checkNotNullParameter(db8, "db");
            Intrinsics.checkNotNullParameter(block, "block");
            return w.o0(db8.getQueryContext().minusKey(g1.f263979a), new RxRoom$Companion$createSingle$1(db8, isReadOnly, inTransaction, block, null));
        }

        private Companion() {
        }

        @NotNull
        public final <T> d0<T> createSingle(@NotNull Callable<? extends T> callable) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            ufm.b bVar = new ufm.b(new j(callable, 19), 0);
            Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
            return bVar;
        }
    }

    @d
    public RxRoom() {
    }

    @NotNull
    public static final efm.b createCompletable(@NotNull RoomDatabase roomDatabase, boolean z, boolean z3, @NotNull Function1<? super SQLiteConnection, Unit> function1) {
        return INSTANCE.createCompletable(roomDatabase, z, z3, function1);
    }

    @NotNull
    public static final <T> k<T> createMaybe(@NotNull RoomDatabase roomDatabase, boolean z, boolean z3, @NotNull Function1<? super SQLiteConnection, ? extends T> function1) {
        return INSTANCE.createMaybe(roomDatabase, z, z3, function1);
    }

    @NotNull
    public static final <T> r<T> createObservable(@NotNull RoomDatabase roomDatabase, boolean z, @NotNull String[] strArr, @NotNull Function1<? super SQLiteConnection, ? extends T> function1) {
        return INSTANCE.createObservable(roomDatabase, z, strArr, function1);
    }

    @NotNull
    public static final <T> d0<T> createSingle(@NotNull RoomDatabase roomDatabase, boolean z, boolean z3, @NotNull Function1<? super SQLiteConnection, ? extends T> function1) {
        return INSTANCE.createSingle(roomDatabase, z, z3, function1);
    }

    @NotNull
    public static final <T> d0<T> createSingle(@NotNull Callable<? extends T> callable) {
        return INSTANCE.createSingle(callable);
    }
}
