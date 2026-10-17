package pjl;

import android.database.Cursor;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q {
    private q() {
    }

    public static r a(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        try {
            try {
                List listJ = nkm.y.J(nkm.y.x(nkm.t.h(new p(cursor, 0)), new l2c.l(cursor.getColumnIndex("account"), 8)));
                cursor.close();
                return new r(listJ);
            } finally {
            }
        } catch (Exception e) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }
}
