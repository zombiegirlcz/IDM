package kl3;

import a08.f0;
import a08.s;
import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;
import sl3.k;
import wim.z;
import wl3.h;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f185280c = TimeUnit.MINUTES.toMillis(20);
    public static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cl3.a f185281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y80.a f185282b;

    public g(cl3.a contactsInteractor, y80.a permissionProvider) {
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        this.f185281a = contactsInteractor;
        this.f185282b = permissionProvider;
    }

    public final void a(Context context, Account account) {
        ContentResolver contentResolver;
        Cursor cursorQuery;
        Account account2 = account;
        long jCurrentTimeMillis = System.currentTimeMillis();
        h hVar = (h) this.f185281a;
        Long l2 = (Long) ((k) hVar.f298380a).d.T2("contacts_sync_time", k.o);
        if (jCurrentTimeMillis - (l2 != null ? l2.longValue() : 0L) > f185280c) {
            ((k) hVar.f298380a).d.G(Long.valueOf(System.currentTimeMillis()), "contacts_sync_time", z.d(o0.b(Long.TYPE)));
            y80.a permissionProvider = this.f185282b;
            Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(account2, "account");
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.c cVar = rd0.c.INFO;
            rd0.d.b(cVar, "ContactActionSynchronizer", "addActionsToContacts started", null, null, 16);
            if (permissionProvider.c("android.permission.WRITE_CONTACTS")) {
                String string = context.getString(R.string.mime_type_send);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = context.getString(R.string.mime_type_request);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String string3 = context.getString(R.string.contacts_action_send);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String string4 = context.getString(R.string.contacts_action_request);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                ContentResolver contentResolver2 = context.getContentResolver();
                Intrinsics.checkNotNullExpressionValue(contentResolver2, "getContentResolver(...)");
                b.Companion.getClass();
                try {
                    Uri uriBuild = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", account2.name).appendQueryParameter("account_type", account2.type).build();
                    Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
                    rd0.d.b(cVar, "ContactActionSynchronizer", "deleted " + contentResolver2.delete(uriBuild, null, null) + " Revolut contacts", null, null, 16);
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "ContactActionSynchronizer", null, e, h0Var);
                }
                b.Companion.getClass();
                try {
                    contentResolver = contentResolver2;
                    try {
                        cursorQuery = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, new String[]{"_id", "display_name"}, "has_phone_number = ?", new String[]{"1"}, null);
                    } catch (SecurityException e2) {
                        e = e2;
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                        cursorQuery = null;
                        rd0.d.a(rd0.c.ERROR, "ContactActionSynchronizer", null, e, h0Var2);
                    }
                } catch (SecurityException e4) {
                    e = e4;
                    contentResolver = contentResolver2;
                }
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            ArrayList arrayList = new ArrayList();
                            while (true) {
                                long j2 = cursorQuery.getLong(cursorQuery.getColumnIndex("_id"));
                                String string5 = cursorQuery.getString(cursorQuery.getColumnIndex("display_name"));
                                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                                rd0.d.b(rd0.c.INFO, "ContactActionSynchronizer", "add actions for id = " + j2 + ", name = " + string5, null, null, 16);
                                b.c(j2, string5, account2, arrayList, string, string2, string3, string4);
                                if (arrayList.size() > 150) {
                                    b.a(contentResolver, arrayList);
                                }
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                } else {
                                    account2 = account;
                                }
                            }
                            if (arrayList.size() > 0) {
                                b.a(contentResolver, arrayList);
                            }
                        }
                    } catch (Throwable th10) {
                        b.b(cursorQuery);
                        throw th10;
                    }
                }
                b.b(cursorQuery);
            }
        }
        efm.b bVarIgnoreElements = ((k) hVar.f298380a).f264121n.ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        efm.b bVarH = bVarIgnoreElements.h(d.f185277a);
        Intrinsics.checkNotNullExpressionValue(bVarH, "compose(...)");
        pfm.a aVar = new pfm.a(bVarH, new f0(23, new j2i.c(new BreadcrumbException(), 14)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        Intrinsics.checkNotNullExpressionValue(aVar.w(new s(21, f.f185279a), e.f185278a), "subscribe(...)");
    }
}
