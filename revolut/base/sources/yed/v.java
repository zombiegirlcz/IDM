package yed;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f312902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b f312903b;

    public /* synthetic */ v(com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b bVar, int i) {
        this.f312902a = i;
        this.f312903b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f312902a) {
            case 0:
                final cfd.e it8 = (cfd.e) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                final int i = 1;
                this.f312903b.x2(new Function1() { // from class: yed.w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        o updateState = (o) obj3;
                        switch (i) {
                            case 0:
                                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                Object obj4 = it8.f23681a;
                                Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.shared_separate_favourites.domain.alerts.AlertFrequency");
                                return o.a(updateState, null, null, null, null, false, false, null, null, (mgd.b) obj4, null, false, null, false, null, null, null, 1047551);
                            default:
                                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                Object obj5 = it8.f23681a;
                                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.shared_separate_favourites.domain.alerts.AlertTimeRange");
                                return o.a(updateState, null, null, null, null, false, false, null, null, null, null, false, null, false, (mgd.e) obj5, null, null, 983039);
                        }
                    }
                });
                break;
            case 1:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                this.f312903b.x2(new ye1.m(6));
                break;
            case 2:
                bfd.e it9 = (bfd.e) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                mgd.f fVar = it9.f14963a;
                com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b bVar = this.f312903b;
                if (fVar != ((o) bVar.t2()).f312879j) {
                    bVar.x2(new y8a.h(it9, 28));
                }
                break;
            default:
                final cfd.e it10 = (cfd.e) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                final int i2 = 0;
                this.f312903b.x2(new Function1() { // from class: yed.w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        o updateState = (o) obj3;
                        switch (i2) {
                            case 0:
                                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                Object obj4 = it10.f23681a;
                                Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.shared_separate_favourites.domain.alerts.AlertFrequency");
                                return o.a(updateState, null, null, null, null, false, false, null, null, (mgd.b) obj4, null, false, null, false, null, null, null, 1047551);
                            default:
                                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                Object obj5 = it10.f23681a;
                                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.shared_separate_favourites.domain.alerts.AlertTimeRange");
                                return o.a(updateState, null, null, null, null, false, false, null, null, null, null, false, null, false, (mgd.e) obj5, null, null, 983039);
                        }
                    }
                });
                break;
        }
        return Unit.f186387a;
    }
}
