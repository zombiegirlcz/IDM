package qb9;

import com.revolut.feature.onboarding.impl.onboarding.service.WaitingListService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import ib9.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import q2j.k;
import qa9.r;
import ufm.i;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WaitingListService f244142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile e99.a f244143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4l.f f244144c;

    public g(WaitingListService waitingListService) {
        Intrinsics.checkNotNullParameter(waitingListService, "waitingListService");
        this.f244142a = waitingListService;
        final int i = 0;
        final int i2 = 1;
        this.f244144c = new w4l.f(new Function2(this) { // from class: qb9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f244141b;

            {
                this.f244141b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        g gVar = this.f244141b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<h> waitingList = gVar.f244142a.getWaitingList();
                        f fVar = f.f;
                        k kVar = new k(7);
                        waitingList.getClass();
                        i iVar = new i(waitingList, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        g gVar2 = this.f244141b;
                        e99.a waitingList2 = (e99.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(waitingList2, "waitingList");
                        gVar2.f244143b = waitingList2;
                        return Unit.f186387a;
                }
            }
        }, new r(this, 7), new Function2(this) { // from class: qb9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f244141b;

            {
                this.f244141b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        g gVar = this.f244141b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<h> waitingList = gVar.f244142a.getWaitingList();
                        f fVar = f.f;
                        k kVar = new k(7);
                        waitingList.getClass();
                        i iVar = new i(waitingList, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        g gVar2 = this.f244141b;
                        e99.a waitingList2 = (e99.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(waitingList2, "waitingList");
                        gVar2.f244143b = waitingList2;
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
