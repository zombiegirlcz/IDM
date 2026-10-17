package com.revolut.feature.tab.accounts.impl.ui.spaces;

import aie.c0;
import aie.d0;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.spaces.ProductContext;
import com.revolut.feature.tab.accounts.api.model.spaces.SpaceContentModel;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f89648a;

    public k(a cellsMapper) {
        Intrinsics.checkNotNullParameter(cellsMapper, "cellsMapper");
        this.f89648a = cellsMapper;
    }

    public static boolean a(SpaceContentModel spaceContentModel) {
        List list = spaceContentModel.f89558c;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            List f = ((SubSpaceContentModel) it8.next()).getF();
            if (!(f instanceof Collection) || !f.isEmpty()) {
                Iterator it9 = f.iterator();
                while (it9.hasNext()) {
                    ProductAccount productAccount = ((SubSpaceAccountItem) it9.next()).f89560b;
                    if ((productAccount instanceof ProductAccount.ValueItem) || (productAccount instanceof ProductAccount.PendingItem)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean b(SubSpaceContentModel subSpaceContentModel) {
        List f = subSpaceContentModel.getF();
        if ((f instanceof Collection) && f.isEmpty()) {
            return false;
        }
        Iterator it8 = f.iterator();
        while (it8.hasNext()) {
            if (!(((SubSpaceAccountItem) it8.next()).f89560b instanceof ProductAccount.ValueItem.Discover)) {
                return true;
            }
        }
        return false;
    }

    public static int e(qv0.k kVar) {
        switch (d0.f5237a[kVar.ordinal()]) {
            case 1:
            case 3:
                return R$attr.uikit_dp4;
            case 2:
            case 4:
            case 5:
            case 6:
                return R$attr.uikit_dp8;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static int f(qv0.k kVar) {
        switch (d0.f5237a[kVar.ordinal()]) {
            case 1:
            case 2:
                return R$attr.uikit_dp4;
            case 3:
            case 4:
            case 5:
            case 6:
                return R$attr.uikit_dp8;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final ArrayList c(SubSpaceContentModel subSpaceContentModel, ProductAccountDescriptor$Value productAccountDescriptor$Value, boolean z) {
        List f = subSpaceContentModel.getF();
        ArrayList<SubSpaceAccountItem> arrayList = new ArrayList();
        for (Object obj2 : f) {
            if (!(((SubSpaceAccountItem) obj2).f89560b instanceof ProductAccount.ValueItem.Discover)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (SubSpaceAccountItem subSpaceAccountItem : arrayList) {
            ProductId f89727a = productAccountDescriptor$Value != null ? productAccountDescriptor$Value.getF89727a() : null;
            ProductContext productContext = subSpaceAccountItem.f89559a;
            ProductAccount productAccount = subSpaceAccountItem.f89560b;
            boolean z3 = false;
            boolean z4 = f89727a == productContext.f89553a && Intrinsics.f(productAccountDescriptor$Value.getF89728b(), productAccount.getF89504c());
            ProductContext productContext2 = subSpaceAccountItem.f89559a;
            if (z && subSpaceContentModel.getF().size() > 1) {
                z3 = true;
            }
            arrayList2.add(this.f89648a.d(productContext2, productAccount, z4, z3));
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x01f0, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v22, types: [zhm.f0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList d(java.util.List r40, boolean r41, com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r42) {
        /*
            Method dump skipped, instruction units count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.tab.accounts.impl.ui.spaces.k.d(java.util.List, boolean, com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value):java.util.ArrayList");
    }
}
