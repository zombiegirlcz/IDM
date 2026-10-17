package dfj;

import com.revolut.retail.feature.esim.api.model.EsimProfile;
import dej.o1;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class s2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s2 f114104a = new s2();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        EsimProfile esimProfile = (EsimProfile) obj2;
        return Boolean.valueOf((esimProfile != null ? esimProfile.f100424b : null) == o1.ORDERED);
    }
}
