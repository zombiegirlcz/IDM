package znd;

import aw0.k4;
import com.revolut.core.ui_kit.delegates.ai;
import com.revolut.core.ui_kit.delegates.zh;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsController;
import ip0.wi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AnalyticsDetailsController f323795w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(AnalyticsDetailsController analyticsDetailsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f323795w = analyticsDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(this.f323795w, continuation, 0);
                uVar.v = obj2;
                return uVar;
            case 1:
                u uVar2 = new u(this.f323795w, continuation, 1);
                uVar2.v = obj2;
                return uVar2;
            case 2:
                u uVar3 = new u(this.f323795w, continuation, 2);
                uVar3.v = obj2;
                return uVar3;
            case 3:
                u uVar4 = new u(this.f323795w, continuation, 3);
                uVar4.v = obj2;
                return uVar4;
            case 4:
                u uVar5 = new u(this.f323795w, continuation, 4);
                uVar5.v = obj2;
                return uVar5;
            case 5:
                u uVar6 = new u(this.f323795w, continuation, 5);
                uVar6.v = obj2;
                return uVar6;
            default:
                u uVar7 = new u(this.f323795w, continuation, 6);
                uVar7.v = obj2;
                return uVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((u) create((wi) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((u) create((PopupMenuItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((u) create((ai) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((u) create((zh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((u) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((u) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((u) create((k4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0204  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: znd.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
