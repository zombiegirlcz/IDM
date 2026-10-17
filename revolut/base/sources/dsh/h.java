package dsh;

import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import jf7.l1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.y;
import zhm.d0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f117322a;

    public h(ImmutableMap blockItemsProviders, int i) {
        switch (i) {
            case 3:
                Intrinsics.checkNotNullParameter(blockItemsProviders, "blockItemsProviders");
                this.f117322a = blockItemsProviders;
                break;
            default:
                Intrinsics.checkNotNullParameter(blockItemsProviders, "hiddenAccountsDataProviders");
                this.f117322a = blockItemsProviders;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Flow a(List blocks) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        int i = 2;
        if (blocks.isEmpty()) {
            return new go.g(f0.f322471a, i);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it8 = blocks.iterator();
        while (it8.hasNext()) {
            l1 l1Var = (l1) it8.next();
            Object obj2 = this.f117322a.get(l1Var.getClass());
            y yVarE = null;
            Object[] objArr = 0;
            xf7.b bVar = obj2 instanceof xf7.b ? (xf7.b) obj2 : null;
            if (bVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("No block items provider found for block " + l1Var);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            } else {
                yVarE = rd0.e.e(new tnb.k(bVar.a(l1Var), 5), h0.f322473a, new tc6.d(3, 20, objArr == true ? 1 : 0));
            }
            if (yVarE != null) {
                arrayList.add(yVarE);
            }
        }
        return arrayList.isEmpty() ? new go.g(f0.f322471a, i) : new uf0.b((Flow[]) d0.d1(arrayList).toArray(new Flow[0]), 6);
    }

    public h(LinkedHashMap linkedHashMap) {
        this.f117322a = linkedHashMap;
    }

    public h(r10.f fVar, n46.a aVar, ImmutableMap immutableMap, ash.i iVar) {
        this.f117322a = immutableMap;
    }
}
