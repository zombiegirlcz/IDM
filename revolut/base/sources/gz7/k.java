package gz7;

import efm.d0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f147948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f147949c;

    public /* synthetic */ k(l lVar, String str, int i) {
        this.f147947a = i;
        this.f147948b = lVar;
        this.f147949c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List renewalDetails = (List) obj2;
        switch (this.f147947a) {
            case 0:
                Intrinsics.checkNotNullParameter(renewalDetails, "renewalDetails");
                l lVar = this.f147948b;
                lVar.getClass();
                d0 list = efm.r.fromIterable(renewalDetails).flatMapSingle(new gv5.b(new gwe.d(lVar, 9), 19)).toList();
                Intrinsics.checkNotNullExpressionValue(list, "toList(...)");
                gv5.b bVar = new gv5.b(new k(lVar, this.f147949c, 1), 17);
                list.getClass();
                ufm.i iVar = new ufm.i(new ufm.i(list, bVar, 1), new gv5.b(new gvi.p(22), 18), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            default:
                Intrinsics.checkNotNullParameter(renewalDetails, "it");
                this.f147948b.getClass();
                String str = this.f147949c;
                if (str == null) {
                    return renewalDetails;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : renewalDetails) {
                    zw7.d0 d0Var = ((c) obj3).f147943a;
                    if (Intrinsics.f(d0Var != null ? d0Var.f325764a : null, str)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
        }
    }
}
