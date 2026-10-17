package dfj;

import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.model.EsimProfileLock;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class u2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u2 f114120a = new u2();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        EsimProfileLock esimProfileLock;
        EsimProfile esimProfile = (EsimProfile) obj2;
        boolean z = false;
        if (esimProfile != null && (esimProfileLock = esimProfile.k) != null && esimProfileLock.f100447a) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
