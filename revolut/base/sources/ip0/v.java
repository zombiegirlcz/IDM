package ip0;

import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f166748b;

    public /* synthetic */ v(z zVar, int i) {
        this.f166747a = i;
        this.f166748b = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) obj2;
        switch (this.f166747a) {
            case 0:
                Intrinsics.checkNotNullParameter(item, "item");
                z zVar = this.f166748b;
                return new y(zVar.f167368a, item, zVar.f167377p);
            case 1:
                Intrinsics.checkNotNullParameter(item, "item");
                z zVar2 = this.f166748b;
                return new y(zVar2.f167368a, item, zVar2.f167377p);
            default:
                Intrinsics.checkNotNullParameter(item, "item");
                z zVar3 = this.f166748b;
                return new y(zVar3.f167368a, item, zVar3.f167377p);
        }
    }
}
