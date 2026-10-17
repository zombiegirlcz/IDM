package fg8;

import com.revolut.feature.junior_allowance.api.navigation.JuniorAllowanceDestination;
import com.revolut.feature.junior_allowance.api.navigation.JuniorAllowanceLaunchMode;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f134975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f134976c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ o(q qVar, String str, boolean z, int i) {
        this.f134974a = i;
        this.f134975b = qVar;
        this.f134976c = str;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f134974a) {
            case 0:
                od0.i allowance = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(allowance, "allowance");
                boolean zD = allowance.d();
                q qVar = this.f134975b;
                String str = this.f134976c;
                boolean z = this.d;
                if (zD) {
                    return pd.b.n(skm.p0.f264003c, new p(z, qVar, str, null, null));
                }
                return pd.b.n(skm.p0.f264003c, new p(z, qVar, str, gc0.c.f(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new JuniorAllowanceDestination(str, null, new JuniorAllowanceLaunchMode.AsNaviCommand(JuniorAllowanceLaunchMode.AsNaviCommand.NaviCommandMode.WithRequestCode.f76819a), null), false, (Integer) 20023, 0, 53)), null));
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return pd.b.n(skm.p0.f264003c, new p(this.d, this.f134975b, this.f134976c, null, null));
        }
    }
}
