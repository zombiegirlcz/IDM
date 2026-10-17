package s28;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rzj.k;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f259258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f259259c;

    public /* synthetic */ e(f fVar, int i, int i2) {
        this.f259257a = i2;
        this.f259258b = fVar;
        this.f259259c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f259257a) {
            case 0:
                k news = (k) obj2;
                Intrinsics.checkNotNullParameter(news, "news");
                return news.f258697a.isEmpty() ? this.f259258b.a(this.f259259c) : new go.g(zi0.c.P(new a(news), false, null, 3), 2);
            case 1:
                List feed = (List) obj2;
                Intrinsics.checkNotNullParameter(feed, "feed");
                return feed.isEmpty() ? this.f259258b.b(this.f259259c) : new go.g(zi0.c.P(new b(feed), false, null, 3), 2);
            default:
                List feed2 = (List) obj2;
                Intrinsics.checkNotNullParameter(feed2, "feed");
                return feed2.isEmpty() ? this.f259258b.c(this.f259259c) : new go.g(zi0.c.P(new b(feed2), false, null, 3), 2);
        }
    }
}
