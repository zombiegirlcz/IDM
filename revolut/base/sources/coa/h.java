package coa;

import hma.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qla.a f25508b;

    public /* synthetic */ h(s sVar, qla.a aVar) {
        this.f25507a = 2;
        this.f25508b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Set setB;
        switch (this.f25507a) {
            case 0:
                return a.a((a) obj2, null, this.f25508b, null, null, 29);
            case 1:
                return a.a((a) obj2, null, this.f25508b, null, null, 29);
            default:
                List settings = (List) obj2;
                Intrinsics.checkNotNullParameter(settings, "notificationSettings");
                qla.a profileType = this.f25508b;
                Intrinsics.checkNotNullParameter(profileType, "profileType");
                Intrinsics.checkNotNullParameter(settings, "settings");
                int i = ioa.a.f163209a[profileType.ordinal()];
                if (i == 1 || i == 2) {
                    setB = y0.b(soa.c.REVOLUT_X_MARKETING);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    setB = d0.A0(d0.A0(soa.c.a(), soa.c.REVOLUT_X_MARKETING), soa.c.CRYPTOCURRENCY_VOLATILITY);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : settings) {
                    if (!setB.contains(((soa.b) obj3).f264801a)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
        }
    }

    public /* synthetic */ h(qla.a aVar, int i) {
        this.f25507a = i;
        this.f25508b = aVar;
    }
}
