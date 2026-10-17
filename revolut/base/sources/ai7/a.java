package ai7;

import gvc.g;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import q50.v;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f5203b;

    public /* synthetic */ a(int i, Integer num) {
        this.f5202a = i;
        this.f5203b = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f5202a) {
            case 0:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Integer num = this.f5203b;
                return num != null ? d0.V0(it8, num.intValue()) : it8;
            case 1:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g.a(update, null, null, null, null, null, null, null, Integer.valueOf(this.f5203b.intValue() - 1), false, 383);
            case 2:
                return new pk8.d(this.f5203b);
            case 3:
                v updateState = (v) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                y50.b config = updateState.f242283a;
                Intrinsics.checkNotNullParameter(config, "config");
                return new v(config, this.f5203b);
            default:
                wl5.g updateState2 = (wl5.g) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return wl5.g.a(updateState2, null, this.f5203b, null, null, null, false, null, ISO781611.SMT_TAG);
        }
    }
}
