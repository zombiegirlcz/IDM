package b90;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.app.NotificationManagerCompat;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.deeplink.impl.ui.external.ExternalDeeplinkRoutingActivity;
import com.revolut.feature.push.PushDispatcherActivity;
import com.revolut.feature.push.PushDispatcherContract$Configuration;
import com.revolut.feature.push.PushEventAnalytics;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.ui.push.PushEventTrackerService;
import ipa.j;
import ipa.k;
import ipa.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContextThemeWrapper f13519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f13520b;

    public a(ContextThemeWrapper context, i mapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f13519a = context;
        this.f13520b = mapper;
    }

    public static void c(a aVar, j message, f action, String str, l lVar, String str2, String str3, int i) {
        Object obj2;
        String strI = (i & 4) != 0 ? k.i(message) : str;
        l priority = (i & 8) != 0 ? l.DEFAULT : lVar;
        String strO = (i & 16) != 0 ? null : str2;
        String strI2 = (i & 32) != 0 ? null : str3;
        ppa.b bVar = (ppa.b) aVar;
        yzl.a aVar2 = bVar.f238309h;
        ContextThemeWrapper context = bVar.f13519a;
        s70.a aVar3 = bVar.e;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(priority, "priority");
        String strH = k.h(message);
        if (strH == null) {
            strH = j6.a.p("toString(...)");
        }
        String str4 = strH;
        if ((strO == null || strO.length() == 0) && (strO = k.o(message)) == null) {
            strO = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
        }
        ipa.h hVarL = k.l(message);
        if ((strI2 == null || strI2.length() == 0) && (strI2 = k.i(message)) == null) {
            strI2 = "";
        }
        int i2 = R$drawable.uikit_icn_24_logo_revolut_colour;
        String str5 = strI == null ? "" : strI;
        String str6 = strI;
        ipa.i iVar = new ipa.i("Revolut", a10.b.o(R.string.notifiaction_channel_general_name, null, null, 14, bVar.f238307c), l.HIGH);
        Iterator it8 = bVar.f238308g.iterator();
        while (true) {
            if (!it8.hasNext()) {
                obj2 = null;
                break;
            }
            Object next = it8.next();
            if (((mpa.a) next).b(message, action)) {
                obj2 = next;
                break;
            }
        }
        mpa.a aVar4 = (mpa.a) obj2;
        Intent intentA = aVar4 != null ? aVar4.a(context, message, action) : new Intent("android.intent.action.VIEW", Uri.parse(action.b()));
        PushDispatcherActivity.Companion aVar5 = PushDispatcherActivity.INSTANCE;
        List listC = u.c(intentA);
        ((vzl.b) bVar.f).getClass();
        String str7 = "context";
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(message, "message");
        PushEventTrackerService.Companion aVar6 = PushEventTrackerService.INSTANCE;
        PushEventAnalytics pushEventAnalytics = new PushEventAnalytics(k.l(message), k.k(message), k.j(message), k.n(message), k.g(message));
        aVar6.getClass();
        PushDispatcherContract$Configuration pushDispatcherContract$Configuration = new PushDispatcherContract$Configuration(listC, PushEventTrackerService.Companion.a(context, pushEventAnalytics));
        aVar5.getClass();
        s70.b bVar2 = (s70.b) aVar3;
        ipa.i iVar2 = iVar;
        ipa.f fVar = new ipa.f(bVar2.g(context, aVar2.a(), PushDispatcherActivity.Companion.a(context, pushDispatcherContract$Configuration), 1140850688, 4));
        String str8 = str6 == null ? "" : str6;
        List<g> listA = action.a();
        ArrayList arrayList = new ArrayList();
        for (g gVar : listA) {
            String strB = gVar.b();
            bVar.a(str8);
            ipa.f fVar2 = fVar;
            v06.g gVar2 = bVar.d;
            String deeplink = gVar.a();
            gVar2.getClass();
            Intrinsics.checkNotNullParameter(context, str7);
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intent intent = new Intent(context, (Class<?>) ExternalDeeplinkRoutingActivity.class);
            intent.putExtra("EXTRA_NOTIFICATION_TAG", str8);
            intent.setData(Uri.parse(deeplink));
            intent.setAction("com.revolut.navigation.deeplink.action.QUICK_ACTION");
            intent.addFlags(32768);
            a0.x(u.c(new Pair(strB, new ipa.f(bVar2.g(context, aVar2.a(), intent, 1140850688, 4)))), arrayList);
            iVar2 = iVar2;
            fVar = fVar2;
            str7 = str7;
        }
        bVar.b(new ipa.b(str4, str5, hVarL, iVar2, strO, strI2, i2, arrayList, fVar, priority, 4224));
    }

    public final void a(String tag2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        d().cancel(tag2, 0);
    }

    public final void b(ipa.g message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (NotificationManagerCompat.from(this.f13519a).areNotificationsEnabled()) {
            ipa.i channel = message.a();
            String strA = channel.a();
            String strB = channel.b();
            Intrinsics.checkNotNullParameter(channel, "channel");
            int i = h.f13530a[channel.c().ordinal()];
            int i2 = 2;
            if (i != 1) {
                if (i == 2) {
                    i2 = 3;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 4;
                }
            }
            NotificationChannel notificationChannel = new NotificationChannel(strA, strB, i2);
            notificationChannel.setDescription(null);
            d().createNotificationChannel(notificationChannel);
            d().notify(message.c(), message.b(), gc0.c.p(message, this.f13520b));
        }
    }

    public final NotificationManager d() {
        Object systemService = this.f13519a.getSystemService("notification");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (NotificationManager) systemService;
    }
}
