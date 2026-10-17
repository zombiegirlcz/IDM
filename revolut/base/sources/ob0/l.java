package ob0;

import com.revolut.feature.backend_flow.domain.models.CountrySelectionOption;
import com.revolut.feature.backend_flow.domain.models.PhoneInputItem;
import java.util.Comparator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ afa.a f223831b;

    public /* synthetic */ l(afa.a aVar, int i) {
        this.f223830a = i;
        this.f223831b = aVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f223830a) {
            case 0:
                int iD = cim.b.d(obj2, obj3, (Function1[]) this.f223831b.f3975b);
                return iD != 0 ? iD : cim.b.b(((CountrySelectionOption) obj2).f63373b, ((CountrySelectionOption) obj3).f63373b);
            case 1:
                int iD2 = cim.b.d(obj2, obj3, (Function1[]) this.f223831b.f3975b);
                return iD2 != 0 ? iD2 : cim.b.b(((PhoneInputItem.Country) obj2).f63576c, ((PhoneInputItem.Country) obj3).f63576c);
            case 2:
                int iD3 = cim.b.d(obj2, obj3, (Function1[]) this.f223831b.f3975b);
                return iD3 != 0 ? iD3 : cim.b.b(((qci.b) obj2).f244790b, ((qci.b) obj3).f244790b);
            default:
                int iD4 = cim.b.d(obj2, obj3, (Function1[]) this.f223831b.f3975b);
                return iD4 != 0 ? iD4 : cim.b.b(((sog.a) obj2).f264825b, ((sog.a) obj3).f264825b);
        }
    }
}
