package com.revolut.sso.impl.data.storage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import bkl.a;
import c84.y;
import chc.c0;
import com.revolut.sso.impl.data.storage.RevolutAccountsManagerContentProvider;
import elm.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pjl.b0;
import pjl.k;
import pjl.m;
import pjl.t;
import pjl.v;
import pjl.z;
import pn0.b;
import qlm.e;
import qlm.v1;
import rd0.c;
import rd0.d;
import rlm.o;
import skm.b1;
import skm.e0;
import skm.p0;
import yhm.j;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/sso/impl/data/storage/RevolutAccountsManagerContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutAccountsManagerContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Uri e = Uri.EMPTY;
    public static final MatrixCursor f = new MatrixCursor(new String[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f106030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f106031c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f106029a = j.b(new c0(22));
    public final ReentrantReadWriteLock d = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: com.revolut.sso.impl.data.storage.RevolutAccountsManagerContentProvider$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public RevolutAccountsManagerContentProvider() {
        final int i = 0;
        this.f106030b = j.b(new Function0(this) { // from class: ckl.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutAccountsManagerContentProvider f24891b;

            {
                this.f24891b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevolutAccountsManagerContentProvider revolutAccountsManagerContentProvider = this.f24891b;
                switch (i2) {
                    case 0:
                        RevolutAccountsManagerContentProvider.Companion companion = RevolutAccountsManagerContentProvider.INSTANCE;
                        return AccountManager.get(revolutAccountsManagerContentProvider.getContext());
                    default:
                        RevolutAccountsManagerContentProvider.Companion companion2 = RevolutAccountsManagerContentProvider.INSTANCE;
                        UriMatcher uriMatcher = new UriMatcher(-1);
                        Context context = revolutAccountsManagerContentProvider.getContext();
                        if (context == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        uriMatcher.addURI(context.getPackageName() + ".sso.provider", "accounts", 1);
                        uriMatcher.addURI(context.getPackageName() + ".sso.provider", "1/tokens", 2);
                        uriMatcher.addURI(context.getPackageName() + ".sso.provider", "1/userData", 3);
                        return uriMatcher;
                }
            }
        });
        final int i2 = 1;
        this.f106031c = j.b(new Function0(this) { // from class: ckl.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutAccountsManagerContentProvider f24891b;

            {
                this.f24891b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevolutAccountsManagerContentProvider revolutAccountsManagerContentProvider = this.f24891b;
                switch (i22) {
                    case 0:
                        RevolutAccountsManagerContentProvider.Companion companion = RevolutAccountsManagerContentProvider.INSTANCE;
                        return AccountManager.get(revolutAccountsManagerContentProvider.getContext());
                    default:
                        RevolutAccountsManagerContentProvider.Companion companion2 = RevolutAccountsManagerContentProvider.INSTANCE;
                        UriMatcher uriMatcher = new UriMatcher(-1);
                        Context context = revolutAccountsManagerContentProvider.getContext();
                        if (context == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        uriMatcher.addURI(context.getPackageName() + ".sso.provider", "accounts", 1);
                        uriMatcher.addURI(context.getPackageName() + ".sso.provider", "1/tokens", 2);
                        uriMatcher.addURI(context.getPackageName() + ".sso.provider", "1/userData", 3);
                        return uriMatcher;
                }
            }
        });
    }

    public static void j(Object obj2, String str) {
        IllegalStateException illegalStateException = new IllegalStateException(str);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.ERROR, "Revolut SSO", null, illegalStateException, h0Var);
    }

    public final Uri a(Uri uri2, ContentValues contentValues) {
        m mVar;
        o oVar;
        a aVar;
        String asString;
        Uri EMPTY_URI = e;
        if (contentValues == null) {
            j(EMPTY_URI, "values cannot be null");
            Intrinsics.checkNotNullExpressionValue(EMPTY_URI, "logErrorAndReturnValue(...)");
            return EMPTY_URI;
        }
        m.Companion.getClass();
        Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        try {
            oVar = pjl.h0.f236817b;
            aVar = pjl.h0.f236816a;
            asString = contentValues.getAsString("account");
        } catch (Exception e2) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, e2, h0Var);
            mVar = null;
        }
        if (asString == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Account account = (Account) oVar.b(aVar, asString);
        String asString2 = contentValues.getAsString("keys");
        if (asString2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        v1 v1Var = v1.f247718a;
        List list = (List) oVar.b(new e(v1Var), asString2);
        String asString3 = contentValues.getAsString("values");
        if (asString3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        mVar = new m(account, d0.l1(list, (List) oVar.b(new e(v1Var), asString3)));
        if (mVar == null) {
            Intrinsics.checkNotNullExpressionValue(EMPTY_URI, "EMPTY_URI");
            return EMPTY_URI;
        }
        Account account2 = mVar.f236825a;
        List list2 = mVar.f236826b;
        Account account3 = new Account(account2.name, account2.type);
        AccountManager accountManagerE = e();
        Pair[] pairArr = (Pair[]) list2.toArray(new Pair[0]);
        accountManagerE.addAccountExplicitly(account3, null, BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return uri2;
    }

    public final Uri b(Uri uri2, ContentValues contentValues) {
        t tVar;
        o oVar;
        a aVar;
        String asString;
        Uri EMPTY_URI = e;
        if (contentValues == null) {
            j(EMPTY_URI, "values cannot be null");
            Intrinsics.checkNotNullExpressionValue(EMPTY_URI, "logErrorAndReturnValue(...)");
            return EMPTY_URI;
        }
        t.Companion.getClass();
        Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        try {
            oVar = pjl.h0.f236817b;
            aVar = pjl.h0.f236816a;
            asString = contentValues.getAsString("account");
        } catch (Exception e2) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            tVar = null;
            d.a(c.ERROR, null, null, e2, h0Var);
        }
        if (asString == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Account account = (Account) oVar.b(aVar, asString);
        String asString2 = contentValues.getAsString("tokenType");
        if (asString2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String asString3 = contentValues.getAsString("token");
        if (asString3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        tVar = new t(account, asString2, asString3);
        if (tVar == null) {
            Intrinsics.checkNotNullExpressionValue(EMPTY_URI, "EMPTY_URI");
            return EMPTY_URI;
        }
        e().setAuthToken(tVar.f236848a, tVar.f236849b, tVar.f236850c);
        return uri2;
    }

    public final Uri c(Uri uri2, ContentValues contentValues) {
        z zVar;
        o oVar;
        a aVar;
        String asString;
        Uri EMPTY_URI = e;
        if (contentValues == null) {
            j(EMPTY_URI, "values cannot be null");
            Intrinsics.checkNotNullExpressionValue(EMPTY_URI, "logErrorAndReturnValue(...)");
            return EMPTY_URI;
        }
        z.Companion.getClass();
        Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        try {
            oVar = pjl.h0.f236817b;
            aVar = pjl.h0.f236816a;
            asString = contentValues.getAsString("account");
        } catch (Exception e2) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, e2, h0Var);
            zVar = null;
        }
        if (asString == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Account account = (Account) oVar.b(aVar, asString);
        String asString2 = contentValues.getAsString("keys");
        if (asString2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        v1 v1Var = v1.f247718a;
        List list = (List) oVar.b(new e(v1Var), asString2);
        String asString3 = contentValues.getAsString("values");
        if (asString3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        zVar = new z(account, d0.l1(list, (List) oVar.b(new e(v1Var), asString3)));
        if (zVar == null) {
            Intrinsics.checkNotNullExpressionValue(EMPTY_URI, "EMPTY_URI");
            return EMPTY_URI;
        }
        Account account2 = zVar.f236870a;
        for (Pair pair : zVar.f236871b) {
            e().setUserData(account2, (String) pair.f186385a, (String) pair.f186386b);
        }
        return uri2;
    }

    public final int d(String[] value) {
        k kVar;
        Account account;
        if (value == null) {
            Integer num = 0;
            j(num, "selectionArgs cannot be null");
            return num.intValue();
        }
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        try {
        } catch (Exception e2) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, e2, h0Var);
            kVar = null;
        }
        if (value.length == 0 || value.length != 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        kVar = new k((Account) pjl.h0.f236817b.b(pjl.h0.f236816a, value[0]));
        if (kVar == null || (account = kVar.f236820a) == null) {
            return 0;
        }
        e().removeAccountExplicitly(account);
        return 1;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri2, String str, String[] strArr) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        ReentrantReadWriteLock reentrantReadWriteLock = this.d;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int iD = 0;
            if (i() && ((UriMatcher) this.f106031c.getValue()).match(uri2) == 1) {
                iD = d(strArr);
            }
            return iD;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public final AccountManager e() {
        Object value = this.f106030b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AccountManager) value;
    }

    public final MatrixCursor f(String[] value) {
        pjl.o oVar;
        String str;
        MatrixCursor matrixCursor = f;
        if (value == null) {
            j(matrixCursor, "selectionArgs cannot be null");
            return matrixCursor;
        }
        pjl.o.Companion.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        try {
        } catch (Exception e2) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, e2, h0Var);
            oVar = null;
        }
        if (value.length == 0 || value.length != 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        oVar = new pjl.o(value[0]);
        if (oVar != null && (str = oVar.f236833a) != null) {
            Account[] accountsByType = e().getAccountsByType(str);
            Intrinsics.checkNotNullExpressionValue(accountsByType, "getAccountsByType(...)");
            List accounts = kotlin.collections.d.v0(accountsByType);
            Intrinsics.checkNotNullParameter(accounts, "accounts");
            matrixCursor = new MatrixCursor(new String[]{"account"});
            Iterator it8 = accounts.iterator();
            while (it8.hasNext()) {
                matrixCursor.addRow(new String[]{pjl.h0.f236817b.c(pjl.h0.f236816a, (Account) it8.next())});
            }
        }
        return matrixCursor;
    }

    public final MatrixCursor g(String[] value) {
        v vVar;
        MatrixCursor matrixCursor = f;
        if (value == null) {
            j(matrixCursor, "selectionArgs cannot be null");
            return matrixCursor;
        }
        v.Companion.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        try {
        } catch (Exception e2) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, e2, h0Var);
            vVar = null;
        }
        if (value.length == 0 || value.length != 2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        vVar = new v((Account) pjl.h0.f236817b.b(pjl.h0.f236816a, value[0]), value[1]);
        if (vVar != null) {
            String token = e().peekAuthToken(vVar.f236856a, vVar.f236857b);
            if (token != null) {
                Intrinsics.checkNotNullParameter(token, "token");
                MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"token"});
                matrixCursor2.addRow(new String[]{token});
                return matrixCursor2;
            }
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri2) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        return null;
    }

    public final MatrixCursor h(String value, String[] values) {
        pjl.d0 d0Var;
        Account account;
        List list;
        MatrixCursor matrixCursor = f;
        if (values == null) {
            j(matrixCursor, "projection cannot be null");
            return matrixCursor;
        }
        if (value == null) {
            j(matrixCursor, "selection cannot be null");
            return matrixCursor;
        }
        pjl.d0.Companion.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        b0 b0Var = null;
        try {
            d0Var = new pjl.d0((Account) pjl.h0.f236817b.b(pjl.h0.f236816a, value));
        } catch (Exception e2) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, e2, h0Var);
            d0Var = null;
        }
        if (d0Var != null && (account = d0Var.f236801a) != null) {
            b0.Companion.getClass();
            Intrinsics.checkNotNullParameter(values, "values");
            try {
            } catch (Exception e4) {
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
                d.a(c.ERROR, null, null, e4, h0Var2);
            }
            if (values.length == 0) {
                throw new IllegalStateException("values can't be empty");
            }
            b0Var = new b0(kotlin.collections.d.v0(values));
            if (b0Var != null && (list = b0Var.f236793a) != null) {
                List<String> list2 = list;
                ArrayList<Pair> userDataKeysWithValues = new ArrayList(w.t(list2, 10));
                for (String str : list2) {
                    userDataKeysWithValues.add(new Pair(str, e().getUserData(account, str)));
                }
                Intrinsics.checkNotNullParameter(userDataKeysWithValues, "userDataKeysWithValues");
                MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"key", "value"});
                for (Pair pair : userDataKeysWithValues) {
                    matrixCursor2.addRow(new String[]{(String) pair.f186385a, (String) pair.f186386b});
                }
                return matrixCursor2;
            }
        }
        return matrixCursor;
    }

    public final boolean i() {
        String callingPackage = getCallingPackage();
        if (callingPackage == null) {
            j(Boolean.FALSE, "Cannot identify the caller");
            return false;
        }
        b bVar = (b) this.f106029a.getValue();
        if (bVar != null) {
            return bVar.a(callingPackage);
        }
        j(Boolean.FALSE, "Cannot verify caller: verifier is not available");
        return false;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri2, ContentValues contentValues, Bundle bundle) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        return !i() ? e : insert(uri2, contentValues);
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        nn0.b.Companion.d(new b0.b(context, 4));
        jjl.d.Companion.d(new cf6.a(context, this, 9));
        p0 p0Var = p0.f264001a;
        e0.C(b1.f263958a, f.f127540b, null, new y(this, null, 24), 2);
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri2, String[] strArr, String str, String[] strArr2, String str2) {
        MatrixCursor matrixCursorH;
        Intrinsics.checkNotNullParameter(uri2, "uri");
        ReentrantReadWriteLock reentrantReadWriteLock = this.d;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (i()) {
                int iMatch = ((UriMatcher) this.f106031c.getValue()).match(uri2);
                matrixCursorH = iMatch != 1 ? iMatch != 2 ? iMatch != 3 ? null : h(str, strArr) : g(strArr2) : f(strArr2);
            } else {
                matrixCursorH = f;
            }
            return matrixCursorH;
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri2, ContentValues contentValues, String str, String[] strArr) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri2, ContentValues contentValues) {
        Uri uriA;
        Intrinsics.checkNotNullParameter(uri2, "uri");
        ReentrantReadWriteLock reentrantReadWriteLock = this.d;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (i()) {
                int iMatch = ((UriMatcher) this.f106031c.getValue()).match(uri2);
                if (iMatch == 1) {
                    uriA = a(uri2, contentValues);
                } else if (iMatch != 2) {
                    uriA = iMatch != 3 ? null : c(uri2, contentValues);
                } else {
                    uriA = b(uri2, contentValues);
                }
            } else {
                uriA = e;
            }
            return uriA;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
}
