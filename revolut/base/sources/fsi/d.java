package fsi;

import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseDelegatesActivity f137709b;

    public /* synthetic */ d(BaseDelegatesActivity baseDelegatesActivity, int i) {
        this.f137708a = i;
        this.f137709b = baseDelegatesActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f137708a;
        BaseDelegatesActivity baseDelegatesActivity = this.f137709b;
        switch (i) {
            case 0:
                BaseDelegatesActivity.a aVar = BaseDelegatesActivity.Companion;
                return baseDelegatesActivity.L0().e0();
            case 1:
                BaseDelegatesActivity.a aVar2 = BaseDelegatesActivity.Companion;
                return baseDelegatesActivity.L0().W();
            case 2:
                BaseDelegatesActivity.a aVar3 = BaseDelegatesActivity.Companion;
                return baseDelegatesActivity.L0().X();
            case 3:
                BaseDelegatesActivity.a aVar4 = BaseDelegatesActivity.Companion;
                baseDelegatesActivity.R0();
                return Unit.f186387a;
            default:
                BaseDelegatesActivity.a aVar5 = BaseDelegatesActivity.Companion;
                return sv0.e.b(baseDelegatesActivity);
        }
    }
}
