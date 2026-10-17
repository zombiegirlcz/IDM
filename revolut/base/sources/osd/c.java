package osd;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f229315a = new c();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List uiModels = (List) obj2;
        Intrinsics.checkNotNullParameter(uiModels, "uiModels");
        if (uiModels.size() > 1) {
            IllegalStateException illegalStateException = new IllegalStateException(a0.d.n("CreditCardTotalWealthGroupProviderImpl: expected one entry point but got ", uiModels.size()));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return uiModels;
    }
}
