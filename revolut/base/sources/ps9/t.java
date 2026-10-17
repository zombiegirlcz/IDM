package ps9;

import com.revolut.feature.payments.groups.impl.ui_chat.settings.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_chat.settings.d f239446b;

    public /* synthetic */ t(com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar, int i) {
        this.f239445a = i;
        this.f239446b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f239445a) {
            case 0:
                p update = (p) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return p.a(update, null, null, !((p) ((j2) this.f239446b.C.f22677a).getValue()).f239439c, 11);
            case 1:
                pt9.b result = (pt9.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar = this.f239446b;
                dVar.H2(dVar.C, new pp5.d(result, 19));
                return Unit.f186387a;
            default:
                os9.o result2 = (os9.o) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (Intrinsics.f(result2, os9.m.f229274a)) {
                    this.f239446b.C2(a.C0518a.f79384a);
                } else if (!Intrinsics.f(result2, os9.n.f229275a) && !Intrinsics.f(result2, os9.l.f229273a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }
}
