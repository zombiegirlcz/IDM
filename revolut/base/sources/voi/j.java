package voi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e8.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import voi.i;

/* JADX INFO: loaded from: classes13.dex */
public final class j extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        z2l.a.f319097a.c();
        i.a aVar = i.Companion;
        hf0.b bVar = hf0.b.d;
        s80.b bVar2 = (s80.b) ((ip.a) bVar.g()).b().D5().n();
        Continuation continuation = null;
        int i = 3;
        r.d(bVar2.f260873b, null, 3);
        r.d(bVar2.f260874c, null, 3);
        i.m();
        hf0.a aVarG = bVar.g();
        CoroutineScope coroutineScopeA = ((ip.a) aVarG).b().E5().a();
        phm.a aVar2 = (phm.a) aVarG.a().get(jhf.a.class);
        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
        if (aVar3 == null) {
            throw new IllegalStateException(a0.d.q("Api ", jhf.a.class, " is not found"));
        }
        e0.C(coroutineScopeA, null, null, new vmf.k(((bjf.a) ((jhf.a) aVar3.b())).e(), continuation, i), 3);
    }
}
