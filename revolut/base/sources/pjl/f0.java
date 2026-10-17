package pjl;

import android.database.Cursor;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 {
    private f0() {
    }

    public static g0 a(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        try {
            try {
                List listJ = nkm.y.J(nkm.y.x(nkm.t.h(new p(cursor, 1)), new e0(cursor, cursor.getColumnIndex("key"), cursor.getColumnIndex("value"), 0)));
                cursor.close();
                return new g0(listJ);
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
