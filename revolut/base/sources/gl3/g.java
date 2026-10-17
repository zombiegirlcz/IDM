package gl3;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.ContactsContract;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class g {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f144550a = {"raw_contact_id", "data2", "data3"};

    public static final class a {
        private a() {
        }
    }

    public static h a(ContentResolver contentResolver, Integer num) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        if (num == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Contact raw id should not be NULL");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return null;
        }
        Cursor cursorQuery = contentResolver.query(ContactsContract.Data.CONTENT_URI, f144550a, j6.a.l(num.intValue(), "mimetype = 'vnd.android.cursor.item/name' AND raw_contact_id = '", "'"), null, null);
        if (cursorQuery != null) {
            hVar = cursorQuery.moveToNext() ? new h(edl.a.i(cursorQuery, "data2"), edl.a.i(cursorQuery, "data3")) : null;
            a.a.z(cursorQuery);
        }
        return hVar;
    }
}
