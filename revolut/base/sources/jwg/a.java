package jwg;

import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WidgetisedAnalyticsType f178996b;

    public /* synthetic */ a(WidgetisedAnalyticsType widgetisedAnalyticsType, int i) {
        this.f178995a = i;
        this.f178996b = widgetisedAnalyticsType;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f178995a) {
            case 0:
                mwg.e it8 = (mwg.e) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Iterator it9 = it8.e.values().iterator();
                int size = 0;
                while (it9.hasNext()) {
                    size += ((List) it9.next()).size();
                }
                return new c(this.f178996b, Integer.valueOf(size), it8.f209452c);
            case 1:
                mwg.a it10 = (mwg.a) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new c(this.f178996b, Integer.valueOf(it10.e.size()), it10.f209436c);
            default:
                jyg.c update = (jyg.c) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return jyg.c.a(update, this.f178996b, null, 6);
        }
    }
}
