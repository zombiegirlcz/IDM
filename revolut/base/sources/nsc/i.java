package nsc;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.sca_prompt.impl.trusted_entities.a f218783b;

    public /* synthetic */ i(com.revolut.feature.sca_prompt.impl.trusted_entities.a aVar, int i) {
        this.f218782a = i;
        this.f218783b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable it8 = (Throwable) obj2;
        switch (this.f218782a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f218783b.J2();
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f218783b.J2();
                break;
        }
        return Boolean.TRUE;
    }
}
