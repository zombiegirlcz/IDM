package fzd;

import com.revolut.feature.statements.api.models.Product;
import com.revolut.feature.statements.api.models.ProductElement;
import com.revolut.feature.statements.api.models.ProductSelection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.flow.StateFlow;
import vkm.j2;
import zhm.a1;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class y extends x {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j2 f139169l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j2 f139170m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f139171n;

    public y() {
        j2 j2VarC = vkm.q.c(new lzd.c(h0.f322473a, ProductSelection.INSTANCE.getEMPTY()));
        this.f139169l = j2VarC;
        this.f139170m = j2VarC;
        this.f139171n = f0.f322471a;
    }

    @Override // fzd.x
    public final void Z2() {
        j2 j2Var = this.f139170m;
        lzd.c cVarA = lzd.c.a((lzd.c) j2Var.getValue(), null, ProductSelection.INSTANCE.getEMPTY(), 1);
        j2Var.getClass();
        j2Var.g(null, cVarA);
    }

    @Override // fzd.x
    public final StateFlow b3() {
        return this.f139170m;
    }

    @Override // fzd.x
    public final void c3(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (!kotlin.text.a0.H(listId, "ID_PRODUCT_", false)) {
            if (kotlin.text.a0.H(listId, "ID_ELEMENT_", false)) {
                i3(d0.e0(listId, "ID_ELEMENT_"));
                return;
            }
            return;
        }
        String strE0 = d0.e0(listId, "ID_PRODUCT_");
        Product productH3 = h3(strE0);
        if (productH3 == null) {
            return;
        }
        if (productH3.getElements().isEmpty()) {
            j3(productH3);
            return;
        }
        j2 j2Var = this.f139170m;
        Set set = ((lzd.c) j2Var.getValue()).f200964a;
        j2Var.g(null, lzd.c.a((lzd.c) j2Var.getValue(), set.contains(strE0) ? a1.j(set, strE0) : a1.m(set, strE0), null, 2));
    }

    @Override // fzd.x
    public final void d3(String listId) {
        Map mapL;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (!kotlin.text.a0.H(listId, "ID_PRODUCT_SELECTABLE_", false)) {
            if (kotlin.text.a0.H(listId, "ID_ELEMENT_SELECTABLE_", false)) {
                i3(d0.e0(listId, "ID_ELEMENT_SELECTABLE_"));
                return;
            }
            return;
        }
        Product productH3 = h3(d0.e0(listId, "ID_PRODUCT_SELECTABLE_"));
        if (productH3 == null) {
            return;
        }
        if (productH3.getElements().isEmpty()) {
            j3(productH3);
            return;
        }
        j2 j2Var = this.f139170m;
        ProductSelection productSelection = ((lzd.c) j2Var.getValue()).f200965b;
        Set<String> set = productSelection.getSelectedElements().get(productH3.getType());
        if (set == null) {
            set = h0.f322473a;
        }
        if (set.size() != productH3.getElements().size()) {
            List<ProductElement> elements = productH3.getElements();
            ArrayList arrayList = new ArrayList(zhm.w.t(elements, 10));
            Iterator<T> it8 = elements.iterator();
            while (it8.hasNext()) {
                arrayList.add(((ProductElement) it8.next()).getId());
            }
            mapL = r0.q(productSelection.getSelectedElements(), new Pair(productH3.getType(), zhm.d0.i1(arrayList)));
        } else {
            mapL = r0.l(productH3.getType(), productSelection.getSelectedElements());
        }
        j2Var.g(null, lzd.c.a((lzd.c) j2Var.getValue(), null, ProductSelection.copy$default(productSelection, null, mapL, 1, null), 1));
    }

    @Override // fzd.x
    public final void e3() {
        List list = this.f139171n;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Product) obj2).getElements().isEmpty()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((Product) it8.next()).getType());
        }
        List list2 = this.f139171n;
        ArrayList<Product> arrayList3 = new ArrayList();
        for (Object obj3 : list2) {
            if (!((Product) obj3).getElements().isEmpty()) {
                arrayList3.add(obj3);
            }
        }
        Set setI1 = zhm.d0.i1(arrayList2);
        int iB = q0.b(zhm.w.t(arrayList3, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Product product : arrayList3) {
            String type = product.getType();
            List<ProductElement> elements = product.getElements();
            ArrayList arrayList4 = new ArrayList(zhm.w.t(elements, 10));
            Iterator<T> it9 = elements.iterator();
            while (it9.hasNext()) {
                arrayList4.add(((ProductElement) it9.next()).getId());
            }
            linkedHashMap.put(type, zhm.d0.i1(arrayList4));
        }
        lzd.c cVarA = lzd.c.a((lzd.c) this.f139170m.getValue(), null, new ProductSelection(setI1, linkedHashMap), 1);
        j2 j2Var = this.f139169l;
        j2Var.getClass();
        j2Var.g(null, cVarA);
    }

    @Override // fzd.x
    public final void f3(List products) {
        Intrinsics.checkNotNullParameter(products, "products");
        this.f139171n = products;
    }

    @Override // fzd.x
    public final void g3(lzd.c state) {
        Intrinsics.checkNotNullParameter(state, "state");
        j2 j2Var = this.f139169l;
        j2Var.getClass();
        j2Var.g(null, state);
    }

    public final Product h3(String str) {
        Object next;
        Iterator it8 = this.f139171n.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((Product) next).getType(), str)) {
                break;
            }
        }
        return (Product) next;
    }

    public final void i3(String str) {
        Object next;
        Iterator it8 = this.f139171n.iterator();
        loop0: while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            List<ProductElement> elements = ((Product) next).getElements();
            if (!(elements instanceof Collection) || !elements.isEmpty()) {
                Iterator<T> it9 = elements.iterator();
                while (it9.hasNext()) {
                    if (Intrinsics.f(((ProductElement) it9.next()).getId(), str)) {
                        break loop0;
                    }
                }
            }
        }
        Product product = (Product) next;
        j2 j2Var = this.f139170m;
        ProductSelection productSelection = ((lzd.c) j2Var.getValue()).f200965b;
        if (product == null) {
            return;
        }
        Set<String> set = productSelection.getSelectedElements().get(product.getType());
        if (set == null) {
            set = h0.f322473a;
        }
        LinkedHashSet linkedHashSetM = !set.contains(str) ? a1.m(set, str) : a1.j(set, str);
        j2Var.g(null, lzd.c.a((lzd.c) j2Var.getValue(), null, ProductSelection.copy$default(productSelection, null, linkedHashSetM.isEmpty() ? r0.l(product.getType(), productSelection.getSelectedElements()) : r0.q(productSelection.getSelectedElements(), new Pair(product.getType(), linkedHashSetM)), 1, null), 1));
    }

    public final void j3(Product product) {
        j2 j2Var = this.f139170m;
        ProductSelection productSelection = ((lzd.c) j2Var.getValue()).f200965b;
        lzd.c cVarA = lzd.c.a((lzd.c) j2Var.getValue(), null, ProductSelection.copy$default(productSelection, productSelection.getSelectedProducts().contains(product.getType()) ? a1.j(productSelection.getSelectedProducts(), product.getType()) : a1.m(productSelection.getSelectedProducts(), product.getType()), null, 2, null), 1);
        j2Var.getClass();
        j2Var.g(null, cVarA);
    }
}
