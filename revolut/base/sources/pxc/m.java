package pxc;

import com.revolut.shared.feature.selfserve.entity.config.api.navigation.EntityConfigDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import pfm.z;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f240610a;

    public m(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f240610a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "tickets") && !d0.W(cVar.e(2));
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        if (d0.W(cVar.e(2))) {
            return null;
        }
        return new q06.h(new EntityConfigDestination(new EntityConfigDestination.InputData.Ticket(cVar.e(2))), null);
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        z zVarD = new pfm.h(new phc.d(this, deeplink, 4), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
