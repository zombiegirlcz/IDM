package v3a;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f285868b;

    public /* synthetic */ d(h hVar, int i) {
        this.f285867a = i;
        this.f285868b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        NaviCommand naviCommand = (NaviCommand) obj2;
        switch (this.f285867a) {
            case 0:
                m mVar = this.f285868b.d;
                Intrinsics.h(naviCommand);
                mVar.c(naviCommand);
                break;
            default:
                m mVar2 = this.f285868b.d;
                Intrinsics.h(naviCommand);
                mVar2.c(naviCommand);
                break;
        }
        return Unit.f186387a;
    }
}
