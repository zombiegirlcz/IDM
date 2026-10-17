package gy0;

import com.revolut.core.ui_kit.views.status.StatusView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StatusView f147770b;

    public /* synthetic */ a(StatusView statusView, int i) {
        this.f147769a = i;
        this.f147770b = statusView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f147769a;
        StatusView statusView = this.f147770b;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) obj2;
                StatusView.Companion companion = StatusView.INSTANCE;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                statusView.f59716c.onNext(clickData);
                break;
            default:
                Integer num = (Integer) obj2;
                Intrinsics.h(num);
                statusView.y(num.intValue());
                break;
        }
        return Unit.f186387a;
    }
}
