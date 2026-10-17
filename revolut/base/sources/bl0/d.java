package bl0;

import java.nio.charset.Charset;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements c {
    public final SQLiteDatabase a(String path, String passphrase, boolean z) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(passphrase, "passphrase");
        b bVar = !z ? new b() : null;
        WeakHashMap weakHashMap = SQLiteDatabase.f214722j;
        SQLiteDatabase sQLiteDatabaseR = SQLiteDatabase.r(268435456, path, null, null, bVar, (passphrase == null || passphrase.length() == 0) ? new byte[0] : passphrase.getBytes(Charset.forName("UTF-8")));
        Intrinsics.checkNotNullExpressionValue(sQLiteDatabaseR, "openOrCreateDatabase(...)");
        return sQLiteDatabaseR;
    }
}
