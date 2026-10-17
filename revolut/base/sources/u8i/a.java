package u8i;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import n8i.x;
import n8i.z;
import u7k.f0;
import vkm.h;
import vkm.q;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f278219a;

    public a(n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f278219a = countryInteractor;
    }

    @Override // n8i.z
    public final Flow a(h contentFlow) {
        Intrinsics.checkNotNullParameter(contentFlow, "contentFlow");
        return q.H(new f0(this, null, 8), contentFlow);
    }

    @Override // n8i.z
    public final Class getType() {
        return x.class;
    }
}
