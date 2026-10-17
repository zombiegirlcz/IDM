package kl3;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b {

    @NotNull
    public static final a Companion = new a();

    public static void a(ContentResolver contentResolver, ArrayList arrayList) {
        try {
            Intrinsics.h(contentResolver.applyBatch("com.android.contacts", new ArrayList<>(arrayList)));
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "ContactActionSynchronizer", null, e, h0Var);
        } finally {
            arrayList.clear();
        }
    }

    public static void b(Cursor cursor) {
        if (cursor == null) {
            return;
        }
        try {
            if (cursor.isClosed()) {
                return;
            }
            cursor.close();
        } catch (Throwable th10) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "ContactActionSynchronizer", null, th10, h0Var);
        }
    }

    public static void c(long j2, String str, Account account, ArrayList arrayList, String str2, String str3, String str4, String str5) {
        a aVar = Companion;
        String strValueOf = String.valueOf(j2);
        aVar.getClass();
        int size = arrayList.size();
        ContentProviderOperation.Builder builderNewInsert = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
        Intrinsics.checkNotNullExpressionValue(builderNewInsert, "newInsert(...)");
        builderNewInsert.withValue("contact_id", strValueOf);
        builderNewInsert.withValue("account_name", account.name);
        builderNewInsert.withValue("account_type", account.type);
        builderNewInsert.withValue("sync1", strValueOf);
        arrayList.add(builderNewInsert.build());
        Uri uri2 = ContactsContract.Data.CONTENT_URI;
        ContentProviderOperation.Builder builderNewInsert2 = ContentProviderOperation.newInsert(uri2);
        Intrinsics.checkNotNullExpressionValue(builderNewInsert2, "newInsert(...)");
        builderNewInsert2.withValueBackReference("raw_contact_id", size);
        builderNewInsert2.withValue("mimetype", "vnd.android.cursor.item/name");
        if (str != null) {
            builderNewInsert2.withValue("data1", str);
        }
        arrayList.add(builderNewInsert2.build());
        ContentProviderOperation.Builder builderNewInsert3 = ContentProviderOperation.newInsert(uri2);
        Intrinsics.checkNotNullExpressionValue(builderNewInsert3, "newInsert(...)");
        builderNewInsert3.withValueBackReference("raw_contact_id", size);
        builderNewInsert3.withValue("mimetype", str2);
        builderNewInsert3.withValue("data1", strValueOf);
        builderNewInsert3.withValue("data2", "Revolut Send");
        builderNewInsert3.withValue("data3", str4);
        arrayList.add(builderNewInsert3.build());
        ContentProviderOperation.Builder builderNewInsert4 = ContentProviderOperation.newInsert(uri2);
        Intrinsics.checkNotNullExpressionValue(builderNewInsert4, "newInsert(...)");
        builderNewInsert4.withValueBackReference("raw_contact_id", size);
        builderNewInsert4.withValue("mimetype", str3);
        builderNewInsert4.withValue("data1", strValueOf);
        builderNewInsert4.withValue("data2", "Revolut Request");
        builderNewInsert4.withValue("data3", str5);
        arrayList.add(builderNewInsert4.build());
    }
}
