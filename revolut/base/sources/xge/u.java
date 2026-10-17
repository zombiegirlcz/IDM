package xge;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class u {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f305746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rfe.k f305747b;

    public u(Map sourcesByKey, rfe.k policy) {
        Intrinsics.checkNotNullParameter(sourcesByKey, "sourcesByKey");
        Intrinsics.checkNotNullParameter(policy, "policy");
        this.f305746a = sourcesByKey;
        this.f305747b = policy;
    }

    public static final vfe.a a(u uVar, vfe.a aVar, Function1 function1) {
        List list = aVar.f288608c;
        if (!list.isEmpty()) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    if (!((Boolean) function1.invoke(it8.next())).booleanValue()) {
                    }
                }
            }
            return aVar;
        }
        ArrayList subSpaces = new ArrayList();
        for (Object obj2 : list) {
            if (((Boolean) function1.invoke(obj2)).booleanValue()) {
                subSpaces.add(obj2);
            }
        }
        if (subSpaces.isEmpty()) {
            return null;
        }
        ProductSpaceIdentifier spaceId = aVar.f288606a;
        Clause clause = aVar.f288607b;
        Intrinsics.checkNotNullParameter(spaceId, "spaceId");
        Intrinsics.checkNotNullParameter(subSpaces, "subSpaces");
        return new vfe.a(clause, spaceId, subSpaces);
    }

    public final ArrayList b(rfe.j jVar, Set set) {
        Set setKeySet = this.f305746a.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setKeySet) {
            if (!set.contains((pie.a) obj2)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(new rfe.f((pie.a) it8.next(), jVar));
        }
        return arrayList2;
    }
}
