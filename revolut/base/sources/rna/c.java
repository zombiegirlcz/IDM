package rna;

import android.content.Intent;
import android.net.Uri;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.profile.impl.ui.profile.screens.app_settings.AppSettingsController;
import com.revolut.kompot.common.ExternalDestination;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t70.v;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AppSettingsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AppSettingsController appSettingsController, Continuation continuation) {
        super(2, continuation);
        this.v = appSettingsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.O.getValue();
        Intrinsics.h(model);
        i iVar = (i) eVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52613a, "ID_LANGUAGE_DIALOG_ACTION_BUTTON")) {
            s70.a aVar2 = iVar.f255542q;
            j60.a aVar3 = iVar.f255541p;
            Object obj3 = model.i;
            v vVar = obj3 instanceof v ? (v) obj3 : null;
            int i = vVar == null ? -1 : h.f255540a[vVar.ordinal()];
            if (i == -1) {
                j60.a.v(aVar3, false, null, 3);
                try {
                    m.Companion companion = m.INSTANCE;
                    throw new IllegalStateException("Expected parcel is missing");
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = m.INSTANCE;
                    Throwable thA = m.a(o.a(th10));
                    if (thA != null) {
                        hx7.e.n(thA);
                    }
                }
            } else if (i == 1) {
                j60.a.v(aVar3, false, null, 3);
            } else if (i == 2) {
                j60.a.v(aVar3, true, null, 2);
                ((s70.b) aVar2).getClass();
                iVar.C1(new ExternalDestination.ByIntent(new Intent("android.settings.LOCALE_SETTINGS"), null));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j60.a.v(aVar3, true, null, 2);
                s70.b bVar = (s70.b) aVar2;
                bVar.getClass();
                Intent intent = new Intent("android.settings.APP_LOCALE_SETTINGS");
                intent.setData(Uri.fromParts("package", bVar.f260499a.a(), null));
                iVar.C1(new ExternalDestination.ByIntent(intent, null));
            }
        }
        return Unit.f186387a;
    }
}
