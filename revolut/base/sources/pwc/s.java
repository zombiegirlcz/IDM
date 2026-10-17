package pwc;

import com.revolut.data.model.Data;
import com.revolut.feature.security_hub.api.models.StreetModeInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StreetModeInfo f240420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a f240421c;

    public /* synthetic */ s(StreetModeInfo streetModeInfo, com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a aVar, int i) {
        this.f240419a = i;
        this.f240420b = streetModeInfo;
        this.f240421c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f240419a) {
            case 0:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g.a(update, null, false, !Intrinsics.f(((g) ((j2) this.f240421c.D.f22677a).getValue()).f240405j, Boolean.FALSE), null, null, new Data(StreetModeInfo.a(this.f240420b, false, null, 62), null, false, 6, null), false, null, null, false, 3703);
            default:
                return g.a((g) obj2, null, false, !Intrinsics.f(((g) ((j2) this.f240421c.D.f22677a).getValue()).f240405j, Boolean.TRUE), null, null, new Data(StreetModeInfo.a(this.f240420b, true, null, 62), null, false, 6, null), false, null, null, false, 3959);
        }
    }
}
