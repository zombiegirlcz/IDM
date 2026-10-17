package j0i;

import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_crypto_picker.impl.ui.picker.a f170055b;

    public /* synthetic */ p(com.revolut.feature_crypto_picker.impl.ui.picker.a aVar, int i) {
        this.f170054a = i;
        this.f170055b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f170054a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                List list2 = (List) pair.f186386b;
                com.revolut.feature_crypto_picker.impl.ui.picker.a aVar = this.f170055b;
                aVar.H2(aVar.u, new hsa.l(list, 28, aVar, list2));
                return Unit.f186387a;
            default:
                a update = (a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                c cVar = update.f170040b;
                c cVar2 = c.ASC;
                if (cVar == cVar2) {
                    cVar2 = c.DESC;
                }
                c cVar3 = cVar2;
                return a.a(update, null, cVar3, null, null, this.f170055b.J2(update.f170041c, update.d, cVar3), null, null, null, null, null, GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT);
        }
    }
}
