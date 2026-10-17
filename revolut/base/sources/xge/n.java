package xge;

import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rfe.a f305735a;

    public n(rfe.a visibilityFilter) {
        Intrinsics.checkNotNullParameter(visibilityFilter, "visibilityFilter");
        this.f305735a = visibilityFilter;
    }

    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            SubSpaceAccountItem subSpaceAccountItem = (SubSpaceAccountItem) obj2;
            if (this.f305735a.a(subSpaceAccountItem.f89559a.f89553a, subSpaceAccountItem.f89560b.getF89504c().f89730b)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
