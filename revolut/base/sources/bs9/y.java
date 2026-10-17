package bs9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.ui_chat.settings.a;
import jt9.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_chat.chat.a f18139b;

    public /* synthetic */ y(com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar, int i) {
        this.f18138a = i;
        this.f18139b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f18138a) {
            case 0:
                jt9.b it8 = (jt9.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (Intrinsics.f(it8, b.a.f178432a)) {
                    com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar = this.f18139b;
                    aVar.S.onNext(Boolean.TRUE);
                    aVar.H2(aVar.W, new y(aVar, 1));
                } else if (!Intrinsics.f(it8, b.C1013b.f178433a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 1:
                o update = (o) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return o.a(update, null, null, false, false, false, null, null, this.f18139b.J2().f18120h + 1, null, null, null, 8063);
            case 2:
                Boolean forceReload = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(forceReload, "forceReload");
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar2 = this.f18139b;
                b9k.f fVar = aVar2.o;
                PaymentGroup group = aVar2.J2().f18116a;
                boolean zBooleanValue = forceReload.booleanValue();
                fVar.getClass();
                Intrinsics.checkNotNullParameter(group, "group");
                sfm.b bVar = new sfm.b(((ang.f) fVar.f13816a).f(false), new blh.g0(new a09.z(zBooleanValue, fVar, group, 9), 16), 2);
                Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
                return ue0.e.H(bVar, zhm.h0.f322473a, new e(13));
            case 3:
                com.revolut.feature.payments.groups.impl.ui_chat.settings.a output = (com.revolut.feature.payments.groups.impl.ui_chat.settings.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof a.C0518a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f18139b.C2(s.f18128a);
                return Unit.f186387a;
            default:
                return o.a((o) obj2, null, null, false, false, false, null, null, this.f18139b.J2().f18120h + 1, null, null, null, 8063);
        }
    }
}
