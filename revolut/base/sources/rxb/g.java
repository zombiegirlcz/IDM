package rxb;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f258123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f258124c;

    public /* synthetic */ g(l lVar, String str, int i) {
        this.f258122a = i;
        this.f258123b = lVar;
        this.f258124c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f258122a) {
            case 0:
                Boolean isHistoryFetched = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isHistoryFetched, "isHistoryFetched");
                boolean zBooleanValue = isHistoryFetched.booleanValue();
                l lVar = this.f258123b;
                String str = this.f258124c;
                if (zBooleanValue) {
                    lVar.e.set(true);
                    return lVar.c(str);
                }
                return new rfm.e(lVar.a(str).m(lVar.c(str)), lVar.e(), 0);
            default:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f258123b.a(this.f258124c).m(rfm.h.f253943a);
        }
    }
}
