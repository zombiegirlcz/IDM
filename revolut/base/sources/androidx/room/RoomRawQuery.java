package androidx.room;

import a31.k;
import androidx.sqlite.SQLiteStatement;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/room/RoomRawQuery;", "", "sql", "", "onBindStatement", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteStatement;", "", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getSql", "()Ljava/lang/String;", "bindingFunction", "getBindingFunction", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoomRawQuery {

    @NotNull
    private final Function1<SQLiteStatement, Unit> bindingFunction;

    @NotNull
    private final String sql;

    public RoomRawQuery(@NotNull String sql2, @NotNull Function1<? super SQLiteStatement, Unit> onBindStatement) {
        Intrinsics.checkNotNullParameter(sql2, "sql");
        Intrinsics.checkNotNullParameter(onBindStatement, "onBindStatement");
        this.sql = sql2;
        this.bindingFunction = new k(6, onBindStatement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindingFunction$lambda$1(Function1 function1, SQLiteStatement it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new BindOnlySQLiteStatement(it8));
        return Unit.f186387a;
    }

    @NotNull
    public final Function1<SQLiteStatement, Unit> getBindingFunction() {
        return this.bindingFunction;
    }

    @NotNull
    public final String getSql() {
        return this.sql;
    }
}
