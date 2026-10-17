package sl3;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.google.gson.reflect.TypeToken;
import com.revolut.data.model.Data;
import com.revolut.feature.contacts.impl.data.network.UserService;
import com.youTransactor.uCube.rpc.Constants;
import efm.c0;
import efm.d0;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import skm.p0;
import te0.w;
import tnb.g0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class k implements fl3.a {

    @NotNull
    public static final j Companion = new j();
    public static final Type o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ao.h f264113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UserService f264114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gl3.f f264115c;
    public final xe0.e d;
    public final b e;
    public final g0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ne0.n f264116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f264117h;
    public final ne0.n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f264118j;
    public final Lazy k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.b f264119l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f264120m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final efm.r f264121n;

    static {
        Type type = new TypeToken<Long>() { // from class: com.revolut.feature.contacts.impl.data.repository.ContactsRepositoryImpl$Companion$LONG_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        o = type;
    }

    public k(ao.h contactsDataStorage, UserService userService, gl3.f deviceContacts, xe0.e contactsStorage, b contactsPermissionRepository, wl3.s deviceContactsSynchronizer, g0 trustedRevolutContactsProvider) {
        Intrinsics.checkNotNullParameter(contactsDataStorage, "contactsDataStorage");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(deviceContacts, "deviceContacts");
        Intrinsics.checkNotNullParameter(contactsStorage, "contactsStorage");
        Intrinsics.checkNotNullParameter(contactsPermissionRepository, "contactsPermissionRepository");
        Intrinsics.checkNotNullParameter(deviceContactsSynchronizer, "deviceContactsSynchronizer");
        Intrinsics.checkNotNullParameter(trustedRevolutContactsProvider, "trustedRevolutContactsProvider");
        this.f264113a = contactsDataStorage;
        this.f264114b = userService;
        this.f264115c = deviceContacts;
        this.d = contactsStorage;
        this.e = contactsPermissionRepository;
        this.f = trustedRevolutContactsProvider;
        ne0.n.Companion.getClass();
        this.f264116g = ne0.l.a(128, 5L);
        final int i = 0;
        final int i2 = 1;
        this.f264117h = new w4l.f(new Function2(this) { // from class: sl3.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f264109b;

            {
                this.f264109b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String username = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(username, "username");
                        d0<List<ql3.d>> users = this.f264109b.f264114b.getUsers(username);
                        sk2.g gVar = new sk2.g(5, new sk2.f(17));
                        users.getClass();
                        ufm.i iVar = new ufm.i(users, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        String userName = (String) obj2;
                        List users2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(userName, "userName");
                        Intrinsics.checkNotNullParameter(users2, "users");
                        if (!users2.isEmpty()) {
                            this.f264109b.f264116g.f(userName, users2);
                        }
                        return Unit.f186387a;
                }
            }
        }, new c(this, 8), new Function2(this) { // from class: sl3.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f264109b;

            {
                this.f264109b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String username = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(username, "username");
                        d0<List<ql3.d>> users = this.f264109b.f264114b.getUsers(username);
                        sk2.g gVar = new sk2.g(5, new sk2.f(17));
                        users.getClass();
                        ufm.i iVar = new ufm.i(users, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        String userName = (String) obj2;
                        List users2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(userName, "userName");
                        Intrinsics.checkNotNullParameter(users2, "users");
                        if (!users2.isEmpty()) {
                            this.f264109b.f264116g.f(userName, users2);
                        }
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        this.i = ne0.l.a(1, 5L);
        this.f264118j = v0.a.d("create(...)");
        this.k = yhm.j.b(new Function0(this) { // from class: sl3.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f264111b;

            {
                this.f264111b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        k kVar = this.f264111b;
                        d0 list = kVar.f264115c.c(null).toList();
                        sk2.g gVar = new sk2.g(17, new c(kVar, 2));
                        list.getClass();
                        ufm.i iVar = new ufm.i(list, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        Intrinsics.checkNotNullParameter(iVar, "<this>");
                        c0 c0Var = hhm.f.f152431c;
                        mfm.f.b(c0Var, "scheduler is null");
                        rfm.l lVar = new rfm.l(iVar, c0Var, 9);
                        Intrinsics.checkNotNullExpressionValue(lVar, "unsubscribeOn(...)");
                        return w.i0(lVar);
                    default:
                        return this.f264111b.f264121n.concatWith(w.h(Boolean.TRUE)).share();
                }
            }
        });
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f264119l = bVarE;
        this.f264120m = yhm.j.b(new Function0(this) { // from class: sl3.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f264111b;

            {
                this.f264111b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        k kVar = this.f264111b;
                        d0 list = kVar.f264115c.c(null).toList();
                        sk2.g gVar = new sk2.g(17, new c(kVar, 2));
                        list.getClass();
                        ufm.i iVar = new ufm.i(list, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        Intrinsics.checkNotNullParameter(iVar, "<this>");
                        c0 c0Var = hhm.f.f152431c;
                        mfm.f.b(c0Var, "scheduler is null");
                        rfm.l lVar = new rfm.l(iVar, c0Var, 9);
                        Intrinsics.checkNotNullExpressionValue(lVar, "unsubscribeOn(...)");
                        return w.i0(lVar);
                    default:
                        return this.f264111b.f264121n.concatWith(w.h(Boolean.TRUE)).share();
                }
            }
        });
        p0 p0Var = p0.f264001a;
        pfm.h hVarN = pd.b.n(elm.f.f127540b, new afe.a(deviceContactsSynchronizer, this, (Continuation) null, 16));
        oma.r rVar = new oma.r(this, 26);
        dfm.c cVar = mfm.f.d;
        en.a aVar = mfm.f.f205043c;
        efm.r rVarShare = new pfm.t(hVarN, cVar, cVar, aVar, rVar, aVar, aVar).g(efm.r.just(Boolean.TRUE)).share();
        Intrinsics.checkNotNullExpressionValue(rVarShare, "share(...)");
        this.f264121n = rVarShare;
    }

    public static ArrayList b(List list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (hashSet.add(((ml3.i) obj2).n())) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList h(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(pu7.a.G((ml3.i) it8.next()));
        }
        return arrayList;
    }

    public final long a(String str, String str2, String str3) throws IOException {
        ContentProviderResult contentProviderResult;
        Uri uri2;
        Cursor cursorQuery;
        Context context = this.f264115c.f144548a;
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        ContentProviderResult[] contentProviderResultArrApplyBatch = null;
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", null).withValue("account_name", null).build());
        if (str != null) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data1", str).build());
        }
        if (str2 != null) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", str2).withValue("data2", 2).build());
        }
        if (str3 != null) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/email_v2").withValue("data1", str3).withValue("data2", 2).build());
        }
        try {
            contentProviderResultArrApplyBatch = context.getContentResolver().applyBatch("com.android.contacts", arrayList);
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        }
        if (contentProviderResultArrApplyBatch != null && (contentProviderResult = (ContentProviderResult) kotlin.collections.d.W(0, contentProviderResultArrApplyBatch)) != null && (uri2 = contentProviderResult.uri) != null && (cursorQuery = context.getContentResolver().query(uri2, null, null, null, null)) != null) {
            try {
                j = cursorQuery.moveToFirst() ? cursorQuery.getLong(cursorQuery.getColumnIndex("contact_id")) : 0L;
                Unit unit = Unit.f186387a;
                cursorQuery.close();
            } finally {
            }
        }
        return j;
    }

    public final ufm.n c() {
        ufm.c cVar = new ufm.c(new f(this, 0), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return w.i0(cVar);
    }

    public final z d() {
        int i = 1;
        z zVar = new z(new ufm.i(this.e.a(), new sk2.g(12, new c(this, 1)), 0), i, new s1c.d(7), null);
        Intrinsics.checkNotNullExpressionValue(zVar, "onErrorReturn(...)");
        return zVar;
    }

    public final rfm.w e(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        rfm.m mVar = new rfm.m(new rfm.o(new d(this, code, 4)), new sk2.g(29, new i(0)), 1);
        Intrinsics.checkNotNullExpressionValue(mVar, "map(...)");
        return w.h0(mVar);
    }

    public final rfm.w f(String point) {
        Intrinsics.checkNotNullParameter(point, "point");
        rfm.m mVar = new rfm.m(new rfm.o(new d(this, point, 3)), new sk2.g(28, new sk2.f(29)), 1);
        Intrinsics.checkNotNullExpressionValue(mVar, "map(...)");
        return w.h0(mVar);
    }

    public final efm.r g() {
        efm.r rVarRepeatWhen = new ufm.i(c(), new sk2.g(6, new sk2.f(18)), 1).x().repeatWhen(new sk2.g(7, new c(this, 0)));
        efm.r rVarSwitchMap = ((efm.r) this.f264120m.getValue()).switchMap(new sk2.g(8, new pbi.h(rVarRepeatWhen, 2)));
        efm.k kVarFirstElement = rVarRepeatWhen.firstElement();
        Intrinsics.checkNotNullExpressionValue(kVarFirstElement, "firstElement(...)");
        efm.r rVarStartWith = rVarSwitchMap.startWith((efm.w) ue0.e.G(kVarFirstElement, new Data(f0.f322471a, null, false, 6, null)).n().map(new sk2.g(10, new sk2.f(19))));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }
}
