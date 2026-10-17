package q3d;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jpc.e f241942b;

    public /* synthetic */ b(jpc.e eVar, int i) {
        this.f241941a = i;
        this.f241942b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        od0.i iVarA;
        Data data2;
        od0.i iVarA2;
        Data data3 = (Data) obj2;
        switch (this.f241941a) {
            case 0:
                Intrinsics.checkNotNullParameter(data3, "data");
                v1d.c cVar = (v1d.c) this.f241942b.f177256b;
                try {
                    Object content = data3.getContent();
                    if (content != null) {
                        od0.i.Companion.getClass();
                        iVarA = od0.h.a((WatchlistItem) content);
                    } else {
                        iVarA = null;
                    }
                    data = new Data(iVarA, data3.getError(), data3.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data3.getLoading());
                }
                return ((e) cVar).a(data);
            default:
                Intrinsics.checkNotNullParameter(data3, "data");
                v1d.c cVar2 = (v1d.c) this.f241942b.f177256b;
                try {
                    Object content2 = data3.getContent();
                    if (content2 != null) {
                        od0.h hVar = od0.i.Companion;
                        Object objD0 = d0.d0((List) content2);
                        hVar.getClass();
                        iVarA2 = od0.h.a(objD0);
                    } else {
                        iVarA2 = null;
                    }
                    data2 = new Data(iVarA2, data3.getError(), data3.getLoading());
                    break;
                } catch (Throwable th11) {
                    data2 = new Data(null, th11, data3.getLoading());
                }
                return ((e) cVar2).a(data2);
        }
    }
}
