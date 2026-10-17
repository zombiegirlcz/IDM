package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import androidx.compose.ui.platform.b;
import fc.d;
import fc.g;
import java.util.concurrent.Executor;
import jpf.a;
import zb.j;
import zb.s;

/* JADX INFO: loaded from: classes16.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f37251a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        s.b(context);
        a aVarA = j.a();
        aVarA.x(queryParameter);
        aVarA.f177269c = jc.a.b(iIntValue);
        if (queryParameter2 != null) {
            aVarA.f177268b = Base64.decode(queryParameter2, 0);
        }
        g gVar = s.a().d;
        ((Executor) gVar.e).execute(new d(gVar, aVarA.j(), i, new b(1)));
    }
}
