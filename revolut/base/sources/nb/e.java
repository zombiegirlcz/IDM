package nb;

import aem.p;
import aem.s;
import aem.t;
import fem.g;
import hem.f;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213952a;

    public /* synthetic */ e(int i) {
        this.f213952a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = 1;
        int i2 = 0;
        switch (this.f213952a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                Map.Entry DelegatingMutableSet = (Map.Entry) obj2;
                Intrinsics.checkNotNullParameter(DelegatingMutableSet, "$this$DelegatingMutableSet");
                break;
            case 15:
                Map.Entry DelegatingMutableSet2 = (Map.Entry) obj2;
                Intrinsics.checkNotNullParameter(DelegatingMutableSet2, "$this$DelegatingMutableSet");
                break;
            case 16:
                oem.d DelegatingMutableSet3 = (oem.d) obj2;
                Intrinsics.checkNotNullParameter(DelegatingMutableSet3, "$this$DelegatingMutableSet");
                break;
            case 17:
                String DelegatingMutableSet4 = (String) obj2;
                Intrinsics.checkNotNullParameter(DelegatingMutableSet4, "$this$DelegatingMutableSet");
                break;
            case 18:
                Map it8 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 19:
                vdm.b install = (vdm.b) obj2;
                Intrinsics.checkNotNullParameter(install, "$this$install");
                Logger logger = t.f3777a;
                Intrinsics.checkNotNullParameter(install, "<this>");
                int i3 = 3;
                Continuation continuation = null;
                install.d.f(g.i, new p(i3, i2, continuation));
                f fVar = install.e;
                jem.b bVar = f.f151730g;
                fVar.f(bVar, new s(install, null));
                Intrinsics.checkNotNullParameter(install, "<this>");
                fVar.f(bVar, new p(i3, i, continuation));
                break;
            case 20:
                Intrinsics.checkNotNullParameter(obj2, "<this>");
                break;
            case 21:
                OkHttpClient.a aVar = (OkHttpClient.a) obj2;
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                aVar.i = false;
                aVar.f226075j = false;
                aVar.f = true;
                break;
            default:
                OkHttpClient it9 = (OkHttpClient) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                break;
        }
        return Unit.f186387a;
    }
}
