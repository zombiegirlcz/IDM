package t0m;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes23.dex */
public final class a {
    public static void a(Context context, String str) {
        File databasePath = context.getDatabasePath("snowplowEvents.sqlite");
        File databasePath2 = context.getDatabasePath("snowplowEvents.sqlite-wal");
        File databasePath3 = context.getDatabasePath("snowplowEvents.sqlite-shm");
        File parentFile = databasePath.getParentFile();
        File file = new File(parentFile, str);
        File file2 = new File(parentFile, str + "-wal");
        File file3 = new File(parentFile, str + "-shm");
        if (databasePath.renameTo(file) && databasePath2.renameTo(file2)) {
            databasePath3.renameTo(file3);
        }
    }
}
