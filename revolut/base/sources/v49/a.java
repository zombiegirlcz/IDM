package v49;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import java.util.concurrent.CopyOnWriteArrayList;
import kl3.g;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import rd0.c;
import rd0.d;
import ue0.e;
import vc.s;
import vl3.n;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AbstractThreadedSyncAdapter {
    @Override // android.content.AbstractThreadedSyncAdapter
    public final void onPerformSync(Account account, Bundle extras, String authority, ContentProviderClient provider, SyncResult syncResult) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(authority, "authority");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(syncResult, "syncResult");
        try {
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.b(c.INFO, "RevContacts", "onPerformSync", null, null, 16);
            Object applicationContext = getContext().getApplicationContext();
            e0m.d dVar = applicationContext instanceof e0m.d ? (e0m.d) applicationContext : null;
            if (dVar != null) {
                dVar.init();
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            phm.a aVar = (phm.a) e.j(context).a().get(n.class);
            b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
            if (aVar2 == null) {
                throw new IllegalStateException("Api " + n.class + " is not found");
            }
            n nVar = (n) aVar2.b();
            nVar.getClass();
            cl3.a aVar3 = (cl3.a) nVar.f290239w.get();
            y80.a aVarR = nVar.f.r();
            s.j(aVarR);
            g gVar = new g(aVar3, aVarR);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            phm.a aVar4 = (phm.a) e.j(context2).a().get(an0.c.class);
            b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
            if (aVar5 == null) {
                throw new IllegalStateException("Api " + an0.c.class + " is not found");
            }
            if (((cn0.g) ((an0.c) aVar5.b()).j()).d() instanceof mm0.n) {
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                Intrinsics.checkNotNullParameter(context3, "context");
                Intrinsics.checkNotNullParameter(account, "account");
                synchronized (g.d) {
                    gVar.a(context3, account);
                    Unit unit = Unit.f186387a;
                }
            }
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
            d.a(c.ERROR, "Can't sync contact!", null, e, h0Var);
        }
    }
}
