package com.revolut.feature.mainscreen.impl.toexctract.contacts;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.IntentService;
import android.content.Intent;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.concurrent.CopyOnWriteArrayList;
import kl3.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import phm.a;
import rd0.c;
import rd0.d;
import ue0.e;
import vc.s;
import vl3.n;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/mainscreen/impl/toexctract/contacts/ContactSyncService;", "Landroid/app/IntentService;", "<init>", "()V", "Companion", "a", "retail_feature_main_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContactSyncService extends IntentService {
    public ContactSyncService() {
        super("ContactSyncService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        c cVar = c.INFO;
        d.b(cVar, "ContactSyncService", "Start sync from ContactSyncService", null, null, 16);
        Intrinsics.checkNotNullParameter(this, "context");
        Account[] accountsByType = AccountManager.get(this).getAccountsByType(getString(R.string.system_account_name));
        Intrinsics.checkNotNullExpressionValue(accountsByType, "getAccountsByType(...)");
        Account account = (Account) kotlin.collections.d.P(accountsByType);
        if (account == null) {
            d.b(cVar, "ContactSyncService", "Account is null", null, null, 16);
            return;
        }
        a aVar = (a) e.j(this).a().get(n.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", n.class, " is not found"));
        }
        n nVar = (n) aVar2.b();
        nVar.getClass();
        cl3.a aVar3 = (cl3.a) nVar.f290239w.get();
        y80.a aVarR = nVar.f.r();
        s.j(aVarR);
        g gVar = new g(aVar3, aVarR);
        Intrinsics.checkNotNullParameter(this, "context");
        Intrinsics.checkNotNullParameter(account, "account");
        synchronized (g.d) {
            gVar.a(this, account);
            Unit unit = Unit.f186387a;
        }
    }
}
