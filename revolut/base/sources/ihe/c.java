package ihe;

import com.revolut.feature.tab.accounts.api.model.spaces.SpaceContentModel;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r10.a f161403b;

    public /* synthetic */ c(r10.a aVar, int i) {
        this.f161402a = i;
        this.f161403b = aVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f161402a) {
            case 0:
                r10.a aVar = this.f161403b;
                return cim.b.b(Integer.valueOf(((a) aVar.f250811a).a(((SpaceContentModel) obj2).f89556a.f89741a)), Integer.valueOf(((a) aVar.f250811a).a(((SpaceContentModel) obj3).f89556a.f89741a)));
            default:
                b bVar = (b) this.f161403b.f250812b;
                return cim.b.b(Integer.valueOf(bVar.a(((SubSpaceContentModel) obj2).getE())), Integer.valueOf(bVar.a(((SubSpaceContentModel) obj3).getE())));
        }
    }
}
