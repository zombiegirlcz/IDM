package ad0;

import com.revolut.feature.backend_flow.domain.models.BackendEntityItem;
import com.revolut.feature.backend_flow.domain.models.EntitiesListItem;
import com.revolut.feature.backend_flow.domain.models.EntitiesSelectionItem;
import com.revolut.feature.backend_flow.domain.models.EntityCellItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zc0.l3;

/* JADX INFO: loaded from: classes19.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yc0.e f3219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hbl.d f3220b;

    public n(yc0.e iconMapper, hbl.d sharedTransactionMapper) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(sharedTransactionMapper, "sharedTransactionMapper");
        this.f3219a = iconMapper;
        this.f3220b = sharedTransactionMapper;
    }

    public static l3 a(BackendEntityItem backendEntityItem, xl2.r rVar) {
        l3 l3Var = new l3(backendEntityItem, rVar);
        if (backendEntityItem instanceof EntityCellItem) {
            if (rVar.a() == null) {
                return null;
            }
        } else {
            if (!(backendEntityItem instanceof EntitiesListItem)) {
                if (backendEntityItem instanceof EntitiesSelectionItem) {
                    return l3Var;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (rVar.a() == null) {
                return null;
            }
        }
        return l3Var;
    }

    public static xl2.q b(ArrayList arrayList, v9l.a aVar) {
        Object next;
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((xl2.q) next).f306927a, aVar.f287078a.f272581b)) {
                break;
            }
        }
        return (xl2.q) next;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List c(com.revolut.feature.backend_flow.domain.models.BackendEntityItem r47, java.util.List r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad0.n.c(com.revolut.feature.backend_flow.domain.models.BackendEntityItem, java.util.List):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList d(com.revolut.feature.backend_flow.domain.models.BackendEntityItem r18, java.util.List r19, ad0.m r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad0.n.d(com.revolut.feature.backend_flow.domain.models.BackendEntityItem, java.util.List, ad0.m):java.util.ArrayList");
    }
}
