package hfb;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.reverywhere.impl.onboarding.a f151787b;

    public /* synthetic */ c(com.revolut.feature.retail.reverywhere.impl.onboarding.a aVar, int i) {
        this.f151786a = i;
        this.f151787b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f151786a;
        com.revolut.feature.retail.reverywhere.impl.onboarding.a aVar = this.f151787b;
        Throwable throwable = (Throwable) obj2;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
                aVar.N2();
                break;
            case 1:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var2);
                aVar.N2();
                break;
            default:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var3);
                aVar.N2();
                break;
        }
        return Boolean.TRUE;
    }
}
