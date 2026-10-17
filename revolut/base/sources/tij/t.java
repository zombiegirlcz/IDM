package tij;

import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$InputData;
import dej.q3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import pij.a0;

/* JADX INFO: loaded from: classes11.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimSubscriptionsScreenContract$InputData f271570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f271571b;

    public t(EsimSubscriptionsScreenContract$InputData inputData, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f271570a = inputData;
        this.f271571b = featureToggleInteractor;
    }

    public static a0 a(Set set) {
        Object next;
        UserDevice userDevice;
        String str;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            if (obj2 instanceof q3) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            UserDevice userDevice2 = ((q3) next).f113630a;
            if (pd.b.j(userDevice2 != null ? Boolean.valueOf(userDevice2.f71921m) : null)) {
                break;
            }
        }
        q3 q3Var = (q3) next;
        if (q3Var == null || (userDevice = q3Var.f113630a) == null || (str = userDevice.f71914a) == null) {
            return null;
        }
        return new a0(str);
    }
}
