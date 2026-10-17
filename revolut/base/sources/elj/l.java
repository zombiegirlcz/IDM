package elj;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ klj.k f127507b;

    public /* synthetic */ l(klj.k kVar, int i) {
        this.f127506a = i;
        this.f127507b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f127506a) {
            case 0:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                klj.k kVar = this.f127507b;
                return g.a(update, kVar.f185642b, kVar.f185641a, null, 4);
            case 1:
                plj.e update2 = (plj.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                klj.k kVar2 = this.f127507b;
                return plj.e.a(update2, null, null, kVar2.f185642b, kVar2.f185641a, null, 19);
            default:
                xkj.g update3 = (xkj.g) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                klj.k kVar3 = this.f127507b;
                return xkj.g.a(update3, null, null, kVar3.f185642b, kVar3.f185641a, null, null, null, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG);
        }
    }
}
