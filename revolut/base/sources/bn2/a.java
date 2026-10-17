package bn2;

import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.impl.interactor.ThemesInteractor$Theme;
import com.revolut.feature.backgroundpicker.impl.model.UiAssetLockState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends gim.i implements Function3 {
    public /* synthetic */ List u;
    public /* synthetic */ Map v;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        a aVar = new a(3, (Continuation) obj4);
        aVar.u = (List) obj2;
        aVar.v = (Map) obj3;
        return aVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int iNextIndex;
        List list = this.u;
        Map map = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        aim.f builder = new aim.f();
        String id10 = em2.b.UPLOADED.getId();
        UiAssetLockState.Available available = UiAssetLockState.Available.f63805a;
        builder.put(id10, available);
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (((ThemesInteractor$Theme) listIterator.previous()).f63800a.getD() == null) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        int i = 0;
        for (Object obj3 : list) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            ThemesInteractor$Theme themesInteractor$Theme = (ThemesInteractor$Theme) obj3;
            Iterator it8 = themesInteractor$Theme.f63800a.X6().iterator();
            while (it8.hasNext()) {
                builder.put((String) it8.next(), themesInteractor$Theme.f63801b);
            }
            if (i == iNextIndex) {
                cm2.e.Companion.getClass();
                Iterator it9 = cm2.d.f25112b.iterator();
                while (it9.hasNext()) {
                    builder.put((String) it9.next(), available);
                }
            }
            i = i2;
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        aim.f fVarB = builder.b();
        Set setEntrySet = map.entrySet();
        int iB = q0.b(zhm.w.t(setEntrySet, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj4 : setEntrySet) {
            linkedHashMap.put(((em2.b) ((Map.Entry) obj4).getKey()).getId(), obj4);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : (aim.k) fVarB.entrySet()) {
            String str = (String) entry.getKey();
            UiAssetLockState uiAssetLockState = (UiAssetLockState) entry.getValue();
            Map.Entry entry2 = (Map.Entry) linkedHashMap.get(str);
            Pair pair = entry2 != null ? new Pair(entry2.getKey(), new t((Data) entry2.getValue(), uiAssetLockState)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return r0.t(arrayList);
    }
}
