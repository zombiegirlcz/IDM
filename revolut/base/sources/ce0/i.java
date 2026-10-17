package ce0;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends RoomDatabase.Callback {
    @Override // androidx.room.RoomDatabase.Callback
    public final void onOpen(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        try {
            db8.execSQL("PRAGMA cipher_memory_security = OFF;");
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        }
    }
}
