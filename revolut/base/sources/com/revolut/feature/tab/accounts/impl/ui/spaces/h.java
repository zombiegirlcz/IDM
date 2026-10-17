package com.revolut.feature.tab.accounts.impl.ui.spaces;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.spaces.SpaceContentModel;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel;
import com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import mw0.l;
import skm.k0;
import vge.t3;
import vge.z2;
import vkm.j2;
import yhm.o;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function2 {
    public ArrayList u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f89634w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ProductAccountDescriptor$Value f89635x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ SpaceContentListMapper$ItemParcel.SubspaceValueItem f89636y;
    public final /* synthetic */ RowDelegate.Model z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, ProductAccountDescriptor$Value productAccountDescriptor$Value, SpaceContentListMapper$ItemParcel.SubspaceValueItem subspaceValueItem, RowDelegate.Model model, Continuation continuation) {
        super(2, continuation);
        this.f89634w = iVar;
        this.f89635x = productAccountDescriptor$Value;
        this.f89636y = subspaceValueItem;
        this.z = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.f89634w, this.f89635x, this.f89636y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayList;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        ProductAccountDescriptor$Value descriptor = this.f89635x;
        i iVar = this.f89634w;
        if (i == 0) {
            o.b(obj2);
            z2 z2Var = iVar.f89639r;
            this.v = 1;
            obj2 = ((t3) z2Var).e(descriptor);
            if (obj2 != aVar) {
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = this.u;
            o.b(obj2);
            iVar.f89640s.e(this.z.f53228a, zi0.c.d(arrayList), mw0.o.VIEW_BOUNDS, new l(false));
            iVar.G = true;
            return Unit.f186387a;
        }
        o.b(obj2);
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (!zBooleanValue) {
            Iterator it8 = ((AccountSpacesContract$State) ((j2) iVar.I.f22677a).getValue()).f89607a.iterator();
            int i2 = 0;
            while (it8.hasNext()) {
                Iterator it9 = ((SpaceContentModel) it8.next()).f89558c.iterator();
                int size = 0;
                while (it9.hasNext()) {
                    List f = ((SubSpaceContentModel) it9.next()).getF();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : f) {
                        if (((SubSpaceAccountItem) obj3).f89560b instanceof ProductAccount.ValueItem) {
                            arrayList2.add(obj3);
                        }
                    }
                    size += arrayList2.size();
                }
                i2 += size;
            }
            if (i2 < 2) {
                return Unit.f186387a;
            }
        }
        j jVar = iVar.o;
        boolean z = this.f89636y.f;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList arrayListE0 = d0.E0(v.l(jVar.f89646b.a(descriptor, z)), mge.a.b(descriptor, zBooleanValue));
        this.u = arrayListE0;
        this.v = 2;
        if (k0.b(300L, this) != aVar) {
            arrayList = arrayListE0;
            iVar.f89640s.e(this.z.f53228a, zi0.c.d(arrayList), mw0.o.VIEW_BOUNDS, new l(false));
            iVar.G = true;
            return Unit.f186387a;
        }
        return aVar;
    }
}
