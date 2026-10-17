package coa;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_categories.NotificationCategoriesViewController;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.NotificationSettingsDetails;
import foa.z;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ NotificationCategoriesViewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(NotificationCategoriesViewController notificationCategoriesViewController, Continuation continuation) {
        super(2, continuation);
        this.v = notificationCategoriesViewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        NotificationSettingsDetails notificationSettingsDetails;
        RowDelegate.Model item = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = (c) this.v.N.getValue();
        Intrinsics.h(item);
        i iVar = (i) cVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        Object obj3 = item.u;
        if (obj3 instanceof soa.b) {
            notificationSettingsDetails = new NotificationSettingsDetails((soa.b) obj3);
        } else {
            if (!(obj3 instanceof pp3.a)) {
                IllegalStateException illegalStateException = new IllegalStateException("Unsupported notification category item");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return Unit.f186387a;
            }
            pp3.a settings = (pp3.a) obj3;
            Intrinsics.checkNotNullParameter(settings, "settings");
            notificationSettingsDetails = new NotificationSettingsDetails(z.CREDIT_COLLECTION, settings.f238251a, settings.f238252b, Boolean.valueOf(settings.f238253c), Boolean.valueOf(settings.e), Boolean.valueOf(settings.f), null, Boolean.valueOf(settings.d), null, null, 832);
        }
        iVar.C2(new d(notificationSettingsDetails));
        return Unit.f186387a;
    }
}
