package n4d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes13.dex */
public abstract class n {
    public abstract void a(String str, String str2, String str3);

    public abstract int b(ArrayList arrayList);

    public abstract DateTime c();

    public abstract List d(List list);

    public abstract List e();

    public abstract void f(ArrayList arrayList);

    public abstract void g(ArrayList arrayList);

    public abstract void h(String str, String str2, String str3);

    public void i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Iterator it8 = items.iterator();
        while (it8.hasNext()) {
            o4d.c cVar = (o4d.c) it8.next();
            String strC = cVar.c();
            if (Intrinsics.f(strC, "ADD")) {
                h(cVar.a(), cVar.b(), cVar.d());
            } else if (Intrinsics.f(strC, "REMOVE")) {
                a(cVar.a(), cVar.b(), cVar.d());
            }
        }
    }

    public void j(ArrayList items, List assetTypeKeys) {
        Intrinsics.checkNotNullParameter(assetTypeKeys, "assetTypeKeys");
        Intrinsics.checkNotNullParameter(items, "items");
        List list = assetTypeKeys;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((FavouritesAssetTypeKey) it8.next()).f86866a);
        }
        b(arrayList);
        f(items);
    }
}
