package dfj;

import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.model.EsimProfileLock;
import dej.o1;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class t2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t2 f114112a = new t2();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        EsimProfileLock esimProfileLock;
        EsimProfile esimProfile = (EsimProfile) obj2;
        boolean z = true;
        if ((esimProfile != null ? esimProfile.f100424b : null) != o1.ORDERED && (esimProfile == null || (esimProfileLock = esimProfile.k) == null || !esimProfileLock.f100447a)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
