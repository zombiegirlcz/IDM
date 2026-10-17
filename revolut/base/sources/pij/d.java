package pij;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.dashboard.WaitingListV3DashboardScreen;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$EsimProfilesParcel;
import dej.j3;
import dej.o1;
import dej.q3;
import dej.t1;
import ip0.kg;
import ip0.w60;
import ip0.x60;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236535a;

    public /* synthetic */ d(int i) {
        this.f236535a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        switch (this.f236535a) {
            case 0:
                KProperty[] kPropertyArr = EsimSubscriptionsScreen.f101021d0;
                Object obj3 = ((com.revolut.core.ui_kit.delegates.t) obj2).f54722b.f51596l;
                if (obj3 instanceof EsimSubscriptionsScreenContract$EsimProfilesParcel) {
                    return (EsimSubscriptionsScreenContract$EsimProfilesParcel) obj3;
                }
                return null;
            case 1:
                com.revolut.core.ui_kit.delegates.t it8 = (com.revolut.core.ui_kit.delegates.t) obj2;
                KProperty[] kPropertyArr2 = EsimSubscriptionsScreen.f101021d0;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(Intrinsics.f(it8.f54722b.f51590a, "UNFREEZE_ESIM_BANNER"));
            case 2:
                String str = (String) obj2;
                KProperty[] kPropertyArr3 = EsimSubscriptionsScreen.f101021d0;
                return prk.o.m(str, "it", str, "MENU_HELP");
            case 3:
                KProperty[] kPropertyArr4 = EsimSubscriptionsScreen.f101021d0;
                Object obj4 = ((com.revolut.core.ui_kit.delegates.t) obj2).f54722b.f51596l;
                if (obj4 instanceof EsimProfile) {
                    return (EsimProfile) obj4;
                }
                return null;
            case 4:
                com.revolut.core.ui_kit.delegates.t it9 = (com.revolut.core.ui_kit.delegates.t) obj2;
                KProperty[] kPropertyArr5 = EsimSubscriptionsScreen.f101021d0;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(Intrinsics.f(it9.f54722b.f51590a, "UNFREEZE_AND_TRANSFER_ESIM_BANNER") || Intrinsics.f(it9.f54722b.f51590a, "TRANSFER_ESIM_BANNER"));
            case 5:
                com.revolut.core.ui_kit.delegates.t it10 = (com.revolut.core.ui_kit.delegates.t) obj2;
                KProperty[] kPropertyArr6 = EsimSubscriptionsScreen.f101021d0;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(!Intrinsics.f(it10.f54721a, ActionWidgetDelegate.a.C0395a.f51607a));
            case 6:
                Throwable it11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                throw it11;
            case 7:
                List profiles = (List) obj2;
                Intrinsics.checkNotNullParameter(profiles, "profiles");
                List list = profiles;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it12 = list.iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            EsimProfile esimProfile = (EsimProfile) it12.next();
                            Intrinsics.checkNotNullParameter(esimProfile, "<this>");
                            if (esimProfile.f100424b == o1.ORDERED) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 8:
                v update = (v) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return v.a(update, Data.copy$default(update.f236579a, null, null, true, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097150);
            case 9:
                List subscriptions = (List) obj2;
                Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
                List list2 = subscriptions;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it13 = list2.iterator();
                    while (true) {
                        if (it13.hasNext()) {
                            t1 t1Var = (t1) it13.next();
                            Intrinsics.checkNotNullParameter(t1Var, "<this>");
                            if (t1Var.f113651b == j3.ORDERED) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 10:
                Optional recipientOptional = (Optional) obj2;
                Intrinsics.checkNotNullParameter(recipientOptional, "recipientOptional");
                return (EsimGiftRecipient) gj7.b.m(recipientOptional);
            case 11:
                Map subscriptionsByDevice = (Map) obj2;
                Intrinsics.checkNotNullParameter(subscriptionsByDevice, "subscriptionsByDevice");
                aim.f builder = new aim.f();
                for (Map.Entry entry : subscriptionsByDevice.entrySet()) {
                    builder.put(new q3((UserDevice) entry.getKey()), (List) entry.getValue());
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                return builder.b();
            case 12:
                v update2 = (v) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return v.a(update2, new Data(null, null, true, 3, null), null, null, null, new Data(null, null, true, 3, null), null, null, null, null, null, null, null, null, null, null, null, new Data(null, null, true, 3, null), null, null, null, 1966062);
            case 13:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(!it14.isEmpty());
            case 14:
                v update3 = (v) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return v.a(update3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new Data(null, null, false, 7, null), null, null, null, null, 2031615);
            case 15:
                Throwable it15 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                throw it15;
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                kg kgVar = new kg("0", 14);
                yp0.b.l(kgVar, 0, 0, 0, 0, null, false, 63);
                kg kgVar2 = new kg("1", 14);
                yp0.b.l(kgVar2, 0, 0, 0, 0, null, false, 63);
                kg kgVar3 = new kg("2", 14);
                yp0.b.l(kgVar3, 0, 0, 0, 0, null, false, 63);
                return zhm.v.k(kgVar, kgVar2, kgVar3);
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return Boolean.FALSE;
            case 20:
                pj3.f update4 = (pj3.f) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return pj3.f.a(update4, null, null, null, 5);
            case 21:
                Context context = (Context) obj2;
                KProperty[] kPropertyArr7 = WaitingListV3DashboardScreen.S;
                Intrinsics.checkNotNullParameter(context, "context");
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
                linearLayoutManager.setStackFromEnd(true);
                return linearLayoutManager;
            case 22:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new pj4.f((au3.l) rVar.f314201a, ((Boolean) rVar.f314202b).booleanValue(), ((Boolean) rVar.f314203c).booleanValue());
            case 23:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                return Boolean.valueOf(!te0.w.Y(user));
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.TRUE;
            case 25:
                g05.d availability = (g05.d) obj2;
                Intrinsics.checkNotNullParameter(availability, "availability");
                return Boolean.valueOf(!(availability instanceof g05.c));
            case 26:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 27:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                List list3 = (List) getDefaultLoadingItems.invoke();
                n6.Companion.getClass();
                return new pj4.i(list3, null, new aw0.e(false, null, null, m6.a(), null, null, 55));
            case 28:
                pj9.f it16 = (pj9.f) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f236706c;
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.u.c(new x60("LOADING_STATE_ID", w60.CIRCLE_ASSET, null));
        }
    }

    public /* synthetic */ d(cli.n nVar, int i) {
        this.f236535a = i;
    }
}
