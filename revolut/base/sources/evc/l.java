package evc;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kuc.d f129775b;

    public /* synthetic */ l(kuc.d dVar, int i) {
        this.f129774a = i;
        this.f129775b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f129774a) {
            case 0:
                return d.a((d) obj2, this.f129775b, false, 2);
            default:
                ((iuc.c) obj2).getClass();
                kuc.d gamblingBlockState = this.f129775b;
                Intrinsics.checkNotNullParameter(gamblingBlockState, "gamblingBlockState");
                return new iuc.c(gamblingBlockState);
        }
    }
}
