package oi8;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import til.r;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a f225458b;

    public /* synthetic */ d(com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a aVar, int i) {
        this.f225457a = i;
        this.f225458b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        switch (this.f225457a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a aVar = this.f225458b;
                aVar.l2(new f(aVar, null, 1), new yi5.b(26));
                return Boolean.TRUE;
            case 1:
                r output = (r) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                this.f225458b.J2(output);
                return Unit.f186387a;
            default:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a aVar2 = this.f225458b;
                aVar2.getClass();
                aVar2.l2(new f(aVar2, null, 1), new yi5.b(26));
                return Boolean.TRUE;
        }
    }
}
