package gl3;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import com.revolut.feature.contacts.core.platform.model.DeviceContact;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rfm.j;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f144547c = {"_id", "raw_contact_id", "display_name", "display_name", "is_primary", "is_super_primary", "photo_thumb_uri", "data1", "data4"};
    public static final String[] d = {"_id", "raw_contact_id", "display_name", "data1", "photo_thumb_uri"};
    public static final String[] e = {"_id"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f144548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y80.a f144549b;

    public f(Context context, y80.a permissionProvider, g structuredNameCursorWrapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(structuredNameCursorWrapper, "structuredNameCursorWrapper");
        this.f144548a = context;
        this.f144549b = permissionProvider;
    }

    public final sfm.b a(Long l2) {
        sfm.b bVar = new sfm.b(new j(this.f144549b.e("android.permission.READ_CONTACTS"), new gjg.e(new gk7.a(12), 11), 0), new gjg.e(new c(this, l2, 1), 12), 1);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }

    public final DeviceContact b(Cursor cursor) {
        Integer numG = edl.a.g(cursor, "has_phone_number");
        boolean z = true;
        if ((numG != null ? numG.intValue() : 1) != 1) {
            return null;
        }
        String strI = edl.a.i(cursor, "_id");
        if (strI == null) {
            strI = String.valueOf(Math.random() * ((double) 1000));
        }
        String strI2 = edl.a.i(cursor, "display_name");
        Context context = this.f144548a;
        Cursor cursorQuery = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = ?", new String[]{strI}, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    String strI3 = edl.a.i(cursorQuery, "data1");
                    if (strI3 == null && (strI3 = edl.a.i(cursorQuery, "data4")) == null) {
                        return null;
                    }
                    String str = strI3;
                    try {
                        if (cursorQuery.getLong(cursorQuery.getColumnIndex("is_super_primary")) <= 0) {
                            if (cursorQuery.getLong(cursorQuery.getColumnIndex("is_primary")) <= 0) {
                                z = false;
                            }
                        }
                    } catch (Exception unused) {
                    }
                    boolean z3 = z;
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("photo_thumb_uri"));
                    Integer numG2 = edl.a.g(cursorQuery, "raw_contact_id");
                    ContentResolver contentResolver = context.getContentResolver();
                    Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
                    h hVarA = g.a(contentResolver, numG2);
                    long j2 = Long.parseLong(strI);
                    il3.a aVar = il3.a.PHONE;
                    String str2 = strI2 == null ? str : strI2;
                    String strA = hVarA != null ? hVarA.a() : null;
                    String str3 = strA == null ? "" : strA;
                    String strB = hVarA != null ? hVarA.b() : null;
                    return new DeviceContact(j2, aVar, str, str2, str3, strB == null ? "" : strB, string, z3);
                }
            } finally {
                a.a.z(cursorQuery);
            }
        }
        return null;
    }

    public final sfm.b c(Long l2) {
        sfm.b bVar = new sfm.b(new j(this.f144549b.e("android.permission.READ_CONTACTS"), new gjg.e(new gk7.a(10), 9), 0), new gjg.e(new c(this, l2, 0), 10), 1);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }

    public final ArrayList d() {
        Cursor cursorQuery = this.f144548a.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
        ArrayList arrayList = new ArrayList();
        if (cursorQuery != null && cursorQuery.moveToFirst()) {
            do {
                try {
                    DeviceContact deviceContactB = b(cursorQuery);
                    if (deviceContactB != null) {
                        arrayList.add(deviceContactB);
                    }
                } catch (Exception e2) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var);
                }
            } while (cursorQuery.moveToNext());
        }
        a.a.z(cursorQuery);
        return arrayList;
    }
}
