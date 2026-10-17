package dk9;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.r0;
import zh9.v0;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f115482b;

    public /* synthetic */ t(r0 r0Var, int i) {
        this.f115481a = i;
        this.f115482b = r0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f115481a) {
            case 0:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new Pair(this.f115482b, d0.d0(it8));
            default:
                whf.p it9 = (whf.p) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new v0(this.f115482b, it9.f297646a, it9.f297647b);
        }
    }
}
