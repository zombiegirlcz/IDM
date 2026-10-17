package bl0;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import net.zetetic.database.sqlcipher.SQLiteConnection;
import net.zetetic.database.sqlcipher.SQLiteDatabaseHook;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements SQLiteDatabaseHook {
    @Override // net.zetetic.database.sqlcipher.SQLiteDatabaseHook
    public final void a(SQLiteConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        try {
            connection.h("PRAGMA cipher_use_hmac = OFF;", null, null);
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        }
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteDatabaseHook
    public final void i(SQLiteConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
    }
}
