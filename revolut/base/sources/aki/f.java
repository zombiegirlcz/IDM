package aki;

import com.revolut.kompot.navigable.ControllerKey;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStateWrapper;
import dki.g;
import dki.s;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yji.o;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements c {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5962a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5963b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5964c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashSet e = new LinkedHashSet();
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5965g;

    public final boolean b(qji.c cVar) {
        Set setB;
        if (cVar instanceof BaseFlow) {
            s sVarS2 = ((BaseFlow) cVar).S2();
            g gVar = sVarS2 instanceof g ? (g) sVarS2 : null;
            if (gVar != null) {
                FlowStateWrapper flowStateWrapperA2 = gVar.A2();
                setB = new LinkedHashSet();
                ControllerKey controllerKey = flowStateWrapperA2.f;
                if (controllerKey != null) {
                    setB.add(controllerKey);
                }
                Iterator it8 = gVar.f115534m.iterator();
                while (it8.hasNext()) {
                    ControllerKey controllerKey2 = ((FlowStateWrapper) it8.next()).f;
                    if (controllerKey2 != null) {
                        setB.add(controllerKey2);
                    }
                }
            } else {
                setB = h0.f322473a;
            }
        } else {
            if (!(cVar instanceof yki.f)) {
                return false;
            }
            setB = ((yki.f) cVar).k().s().b();
        }
        Iterator it9 = setB.iterator();
        while (it9.hasNext()) {
            o oVarD = d((ControllerKey) it9.next());
            if (oVarD != null && (!(oVarD instanceof qji.c) || !b((qji.c) oVarD))) {
                return false;
            }
        }
        return true;
    }

    public final String c() {
        StringBuilder sb6 = new StringBuilder("--------- Cache statistics ---------\n");
        LinkedHashMap linkedHashMap = this.f5962a;
        int size = linkedHashMap.size();
        LinkedHashMap linkedHashMap2 = this.f5963b;
        int size2 = linkedHashMap2.size();
        LinkedHashMap linkedHashMap3 = this.f5964c;
        int size3 = size2 + size + linkedHashMap3.size();
        int size4 = linkedHashMap3.size() + linkedHashMap2.size();
        StringBuilder sbW = com.google.android.gms.internal.mlkit_vision_face.a.w("Size ", size3, size, " (strong: ", "; weak: ");
        sbW.append(size4);
        sbW.append(")");
        sb6.append(sbW.toString());
        sb6.append('\n');
        if (!linkedHashMap.values().isEmpty()) {
            sb6.append("Strong storing: \n");
            for (Map.Entry entry : d0.I0(linkedHashMap.entrySet())) {
                ControllerKey controllerKey = (ControllerKey) entry.getKey();
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) entry.getValue();
                String strP2 = aVar.p2();
                String strT2 = aVar.t2();
                String str = controllerKey.f98378a;
                StringBuilder sbM = v0.a.m("    ", strP2, " (", strT2, ")  key: ");
                sbM.append(str);
                sb6.append(sbM.toString());
                sb6.append('\n');
            }
        }
        Collection collectionValues = linkedHashMap2.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        if (!collectionValues.isEmpty()) {
            sb6.append("Weak storing: \n");
            Set setEntrySet = linkedHashMap2.entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
            for (Map.Entry entry2 : d0.I0(setEntrySet)) {
                Intrinsics.h(entry2);
                Object key = entry2.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "component1(...)");
                Object value = entry2.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "component2(...)");
                com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) value;
                String strP22 = aVar2.p2();
                String strT22 = aVar2.t2();
                String str2 = ((ControllerKey) key).f98378a;
                StringBuilder sbM2 = v0.a.m("    ", strP22, " (", strT22, ")  key: ");
                sbM2.append(str2);
                sb6.append(sbM2.toString());
                sb6.append('\n');
            }
        }
        if (!linkedHashMap3.values().isEmpty()) {
            sb6.append("Flow Weak storing: \n");
            for (Map.Entry entry3 : d0.I0(linkedHashMap3.entrySet())) {
                ControllerKey controllerKey2 = (ControllerKey) entry3.getKey();
                com.revolut.kompot.navigable.a aVar3 = (com.revolut.kompot.navigable.a) entry3.getValue();
                String strP23 = aVar3.p2();
                String strT23 = aVar3.t2();
                String str3 = controllerKey2.f98378a;
                StringBuilder sbM3 = v0.a.m("    ", strP23, " (", strT23, ")  key: ");
                sbM3.append(str3);
                sbM3.append(")");
                sb6.append(sbM3.toString());
                sb6.append('\n');
            }
        }
        LinkedHashMap linkedHashMap4 = this.d;
        for (ControllerKey controllerKey3 : linkedHashMap4.keySet()) {
            sb6.append(controllerKey3.f98378a + " dependants:");
            sb6.append('\n');
            List list = (List) linkedHashMap4.get(controllerKey3);
            if (list != null) {
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    sb6.append("    " + ((ControllerKey) it8.next()).f98378a);
                    sb6.append('\n');
                }
            }
        }
        return sb6.toString();
    }

    public final com.revolut.kompot.navigable.a d(ControllerKey controllerKey) {
        Intrinsics.checkNotNullParameter(controllerKey, "controllerKey");
        com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) this.f5963b.get(controllerKey);
        return (aVar == null && (aVar = (com.revolut.kompot.navigable.a) this.f5964c.get(controllerKey)) == null) ? (com.revolut.kompot.navigable.a) this.f5962a.get(controllerKey) : aVar;
    }

    public final void e(ControllerKey controllerKey, boolean z, boolean z3, String str) {
        com.revolut.kompot.navigable.a aVar;
        ControllerKey controllerKeyU2;
        this.f5965g++;
        com.revolut.kompot.navigable.a aVarD = d(controllerKey);
        if (aVarD != null) {
            a.C0597a c0597a = aVarD.f;
            c0597a.d(this.f5965g);
            c0597a.c(str);
            if (!aVarD.f98410s && z) {
                if (!aVarD.f98407p) {
                    aVarD.I2();
                }
                aVarD.onDestroy();
            }
        } else {
            aVarD = null;
        }
        this.f5962a.remove(controllerKey);
        this.f5963b.remove(controllerKey);
        LinkedHashMap linkedHashMap = this.d;
        List list = (List) linkedHashMap.get(controllerKey);
        if (list != null) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                e((ControllerKey) it8.next(), true, z3, str);
            }
        }
        linkedHashMap.remove(controllerKey);
        this.e.remove(controllerKey);
        LinkedHashMap linkedHashMap2 = this.f5964c;
        linkedHashMap2.remove(controllerKey);
        if (!z3 || aVarD == null || (aVar = aVarD.f98405m) == null || (controllerKeyU2 = aVar.u2()) == null) {
            return;
        }
        Object obj2 = linkedHashMap2.get(controllerKeyU2);
        qji.c cVar = obj2 instanceof qji.c ? (qji.c) obj2 : null;
        if (cVar != null && b(cVar)) {
            e(controllerKeyU2, true, true, "parent_removal");
        }
    }
}
