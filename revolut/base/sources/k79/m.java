package k79;

import com.revolut.data.model.Data;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.j2;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f181929b;

    public /* synthetic */ m(r rVar, int i) {
        this.f181928a = i;
        this.f181929b = rVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        switch (this.f181928a) {
            case 0:
                Pair pair = (Pair) obj2;
                s69.j jVar = (s69.j) pair.f186385a;
                Data data = (Data) pair.f186386b;
                r rVar = this.f181929b;
                rVar.H2(rVar.f181939r, new b(jVar, data, rVar));
                break;
            case 1:
                r rVar2 = this.f181929b;
                rVar2.H2(rVar2.f181939r, new b(rVar2, (Map) obj2, 2));
                break;
            case 2:
                String str = (String) obj2;
                if (str != null) {
                    r rVar3 = this.f181929b;
                    List list = (List) ((g) ((j2) rVar3.f181939r.f22677a).getValue()).f181918a.getContent();
                    if (list != null) {
                        Iterator it8 = list.iterator();
                        int i = 0;
                        while (true) {
                            if (!it8.hasNext()) {
                                i = -1;
                            } else if (!Intrinsics.f(((g79.a) it8.next()).f141133a.f260158a, str)) {
                                i++;
                            }
                        }
                        if (i >= 0) {
                            HashSet hashSet = new HashSet();
                            int iJ = v.j(list);
                            if (i <= iJ) {
                                while (true) {
                                    s69.d dVar = ((g79.a) list.get(i)).f141133a;
                                    String str2 = dVar.f260158a;
                                    if (dVar.d == s69.f.CREATED && rVar3.u.add(str2)) {
                                        hashSet.add(str2);
                                    }
                                    if (i != iJ) {
                                        i++;
                                    }
                                }
                            }
                            if (!hashSet.isEmpty()) {
                                rVar3.l2(new k(rVar3, hashSet, null, 1), new yi5.b(26));
                            }
                        }
                    }
                }
                break;
            default:
                List<koi.j> list2 = (List) obj2;
                r rVar4 = this.f181929b;
                List list3 = (List) ((g) ((j2) rVar4.f181939r.f22677a).getValue()).f181918a.getContent();
                if (list3 != null) {
                    String str3 = null;
                    String str4 = null;
                    for (koi.j jVar2 : list2) {
                        qv0.p pVar = jVar2 instanceof qv0.p ? (qv0.p) jVar2 : null;
                        Object f53456l = pVar != null ? pVar.getE() : null;
                        g79.a aVar = f53456l instanceof g79.a ? (g79.a) f53456l : null;
                        if (aVar != null) {
                            str4 = aVar.f141133a.f260158a;
                            if (str3 == null) {
                                str3 = str4;
                            }
                            rVar4.J2(aVar);
                        }
                    }
                    int size = list3.size();
                    int i2 = -1;
                    int i3 = 0;
                    int i5 = -1;
                    for (int i6 = 0; i6 < size; i6++) {
                        String str5 = ((g79.a) list3.get(i6)).f141133a.f260158a;
                        if (Intrinsics.f(str5, str4)) {
                            i2 = i6;
                        }
                        if (Intrinsics.f(str5, str3)) {
                            i5 = i6;
                        }
                    }
                    if (i2 > 0) {
                        int i21 = i2 - 1;
                        int i22 = i2 - 3;
                        if (i22 < 0) {
                            i22 = 0;
                        }
                        if (i22 <= i21) {
                            int i32 = 0;
                            while (true) {
                                if ((!rVar4.J2((g79.a) list3.get(i21)) || (i32 = i32 + 1) < 2) && i21 != i22) {
                                    i21--;
                                }
                            }
                        }
                    }
                    if (i5 >= 0 && i5 < list3.size() - 1) {
                        int i33 = i5 + 1;
                        int i43 = i5 + 3;
                        int size2 = list3.size() - 1;
                        if (i43 > size2) {
                            i43 = size2;
                        }
                        if (i33 <= i43) {
                            while (true) {
                                if ((!rVar4.J2((g79.a) list3.get(i33)) || (i3 = i3 + 1) < 2) && i33 != i43) {
                                    i33++;
                                }
                            }
                        }
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
