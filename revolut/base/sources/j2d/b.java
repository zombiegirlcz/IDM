package j2d;

import ch.qos.logback.core.CoreConstants;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.h0;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    static {
        y0.b(new FavouritesAssetTypeKey("SECURITY"));
    }

    public static final Set a(jf0.c cVar) {
        List listM0;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String str = (String) cVar.d.get("selectedAssetTypes");
        if (str != null && (listM0 = d0.m0(str, new char[]{CoreConstants.COMMA_CHAR}, 6)) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listM0) {
                if (((String) obj2).length() > 0) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add(new FavouritesAssetTypeKey((String) it8.next()));
            }
            Set setI1 = zhm.d0.i1(arrayList2);
            if (setI1 != null) {
                return setI1;
            }
        }
        return h0.f322473a;
    }
}
