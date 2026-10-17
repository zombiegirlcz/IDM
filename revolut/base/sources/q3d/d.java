package q3d;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v1d.m;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jpc.e f241946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f241947c;

    public /* synthetic */ d(jpc.e eVar, int i, int i2) {
        this.f241945a = i2;
        this.f241946b = eVar;
        this.f241947c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        Data watchlist = (Data) obj2;
        switch (this.f241945a) {
            case 0:
                Intrinsics.checkNotNullParameter(watchlist, "it");
                e eVar = (e) ((v1d.c) this.f241946b.f177256b);
                Intrinsics.checkNotNullParameter(watchlist, "watchlist");
                try {
                    Object content = watchlist.getContent();
                    data = new Data(content != null ? ((Watchlist) content).d : null, watchlist.getError(), watchlist.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, watchlist.getLoading());
                }
                Data data2 = data;
                Watchlist watchlist2 = (Watchlist) watchlist.getContent();
                String str = watchlist2 != null ? watchlist2.f86896b : null;
                Watchlist watchlist3 = (Watchlist) watchlist.getContent();
                return (m) iii.c.f(data2, new q2a.a(29), new q34.a(1), new pyb.m(eVar, watchlist3 != null ? watchlist3.f86895a : null, this.f241947c, str, 1));
            default:
                Intrinsics.checkNotNullParameter(watchlist, "it");
                e eVar2 = (e) ((v1d.c) this.f241946b.f177256b);
                Intrinsics.checkNotNullParameter(watchlist, "items");
                return (m) iii.c.f(watchlist, new q2a.a(29), new q34.a(1), new pyb.m(eVar2, null, this.f241947c, null, 1));
        }
    }
}
