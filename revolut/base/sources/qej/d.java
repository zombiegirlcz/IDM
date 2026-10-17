package qej;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.euicc.DownloadableSubscription;
import android.telephony.euicc.EuiccManager;
import androidx.core.content.ContextCompat;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;
import pej.f;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f245185w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f245186x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f245187y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2, Continuation continuation, e eVar) {
        super(2, continuation);
        this.f245185w = eVar;
        this.f245186x = str;
        this.f245187y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.f245186x, this.f245187y, continuation, this.f245185w);
        dVar.v = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProducerScope producerScope = (ProducerScope) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            com.bumptech.glide.c.E(producerScope, f.a.f235390a);
            e eVar = this.f245185w;
            sej.a aVar2 = eVar.f245189b;
            Context context = eVar.f245188a;
            kp0.b callback = new kp0.b(producerScope, eVar, 28);
            Intrinsics.checkNotNullParameter(callback, "callback");
            rej.c cVar = new rej.c(callback);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("esim_download_subscription");
            intentFilter.addAction("esim_resolve_error");
            ContextCompat.registerReceiver(context, cVar, intentFilter, a0.d.r(context.getApplicationContext().getPackageName(), ".lpa.permission.BROADCAST"), null, 4);
            String str = this.f245187y;
            DownloadableSubscription downloadableSubscriptionForActivationCode = DownloadableSubscription.forActivationCode(str);
            rej.e eVar2 = eVar.f245190c;
            String esimProfileId = this.f245186x;
            Intrinsics.checkNotNullParameter(esimProfileId, "esimProfileId");
            Context context2 = eVar2.f253642a;
            Intent intent = new Intent("esim_download_subscription");
            intent.setPackage(context2.getApplicationContext().getPackageName());
            intent.putExtra("esim_profile_id", esimProfileId);
            Unit unit = Unit.f186387a;
            PendingIntent broadcast = PendingIntent.getBroadcast(context2, 0, intent, 167772160);
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
            cVar.f253641c = str;
            EuiccManager euiccManagerA = eVar.a();
            if (euiccManagerA != null) {
                euiccManagerA.downloadSubscription(downloadableSubscriptionForActivationCode, true, broadcast);
            }
            qba.b bVar = new qba.b(eVar, cVar, 9);
            this.v = null;
            this.u = 1;
            if (com.bumptech.glide.d.d(producerScope, bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
