package ynj;

import com.revolut.retail.feature.esim.api.model.EsimProfileEntry;
import dej.h0;
import dej.j3;
import dej.k0;
import dej.o0;
import dej.o1;
import dej.t1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m {
    public static boolean a(EsimProfileEntry simProfile, dm0.b deviceId, List installationStates) {
        Intrinsics.checkNotNullParameter(simProfile, "simProfile");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(installationStates, "installationStates");
        Intrinsics.checkNotNullParameter(simProfile, "simProfile");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(installationStates, "installationStates");
        return !(gc0.c.o(simProfile, installationStates) || gc0.c.n(simProfile, deviceId));
    }

    public static boolean b(t1 subscription, dm0.b deviceId, List installationStates) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(installationStates, "installationStates");
        if (!c(subscription.e, installationStates)) {
            EsimProfileEntry simProfile = subscription.e;
            j3 state = subscription.f113651b;
            Intrinsics.checkNotNullParameter(simProfile, "simProfile");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(installationStates, "installationStates");
            if (((!gc0.c.o(simProfile, installationStates) && gc0.c.n(simProfile, deviceId)) ? zhm.v.k(o1.READY, o1.UNINSTALLED, o1.INSTALLED, o1.DOWNLOADED).contains(simProfile.f100441b) : false) && (state == j3.ACTIVE || state == j3.GRACE)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(EsimProfileEntry simProfile, List installationStates) {
        Intrinsics.checkNotNullParameter(simProfile, "simProfile");
        Intrinsics.checkNotNullParameter(installationStates, "installationStates");
        List<o0> list = installationStates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (o0 o0Var : list) {
            if ((o0Var instanceof k0) && Intrinsics.f(((k0) o0Var).f113579a.f100423a, simProfile.f100440a)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(t1 subscription, List installationStates) {
        Object next;
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(installationStates, "installationStates");
        String str = subscription.e.f100440a;
        Iterator it8 = installationStates.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((o0) next).a().f100423a, str)) {
                break;
            }
        }
        o0 o0Var = (o0) next;
        if (o0Var == null) {
            return false;
        }
        if (!gj7.b.u(subscription) && !gj7.b.y(subscription)) {
            return false;
        }
        if (o0Var instanceof h0) {
            return true;
        }
        return (o0Var instanceof k0) && ((k0) o0Var).f113579a.f100424b != o1.INSTALLED;
    }
}
