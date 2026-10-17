package zmj;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a f323555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f323556c;

    public /* synthetic */ g0(com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar, boolean z, int i) {
        this.f323554a = i;
        this.f323555b = aVar;
        this.f323556c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        n update = (n) obj2;
        switch (this.f323554a) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                break;
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                break;
        }
        return n.a(update, null, null, null, null, null, Data.copy$default(((n) ((j2) this.f323555b.J.f22677a).getValue()).f323571g, Boolean.valueOf(this.f323556c), null, false, 6, null), null, null, null, null, null, null, 16319);
    }
}
