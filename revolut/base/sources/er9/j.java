package er9;

import androidx.room.util.DBUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f128575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f128576c;

    public /* synthetic */ j(x xVar, String str, int i) {
        this.f128574a = i;
        this.f128575b = xVar;
        this.f128576c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f128574a) {
            case 0:
                x xVar = this.f128575b;
                yq9.h hVar = xVar.f128596a;
                List list = (List) DBUtil.performBlocking(hVar.f316005a, true, false, new ypd.i(hVar, 7));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (Intrinsics.f(((ar9.r) obj2).f8572a, this.f128576c)) {
                        arrayList.add(obj2);
                    }
                }
                yq9.l lVar = xVar.f128597b;
                return z92.f.B(arrayList, (List) DBUtil.performBlocking(lVar.f316016a, true, false, new ypd.i(lVar, 9)));
            default:
                yq9.l lVar2 = this.f128575b.f128597b;
                return zi0.c.S((List) DBUtil.performBlocking(lVar2.f316016a, true, false, new y9d.c(22, this.f128576c, lVar2)));
        }
    }
}
