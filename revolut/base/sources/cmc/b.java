package cmc;

import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f25195b;

    public /* synthetic */ b(h hVar, int i) {
        this.f25194a = i;
        this.f25195b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f25194a) {
            case 0:
                alc.k onboardingStatus = (alc.k) obj2;
                Intrinsics.checkNotNullParameter(onboardingStatus, "onboardingStatus");
                if (onboardingStatus != alc.k.NONE) {
                    return d0.m(j.f25211a);
                }
                h hVar = this.f25195b;
                return new ufm.i(new ufm.i(clc.b.a(hVar.f25204b, 3), new d(new b(hVar, 1), 2), 0), new d(new c(1), 3), 1);
            default:
                NaviCommand it8 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((llc.b) this.f25195b.e).a(it8);
        }
    }
}
