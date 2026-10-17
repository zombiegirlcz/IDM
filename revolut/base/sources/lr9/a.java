package lr9;

import androidx.room.util.DBUtil;
import cr9.c0;
import cr9.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f199434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f199435c;

    public /* synthetic */ a(e eVar, String str, int i) {
        this.f199433a = i;
        this.f199434b = eVar;
        this.f199435c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        long createdDate;
        String id10;
        boolean zF;
        long createdDate2;
        long createdDate3;
        String id11;
        long createdDate4;
        switch (this.f199433a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                List list2 = (List) pair.f186386b;
                if (list.isEmpty()) {
                    return -1L;
                }
                List list3 = list;
                Iterator it8 = list3.iterator();
                if (!it8.hasNext()) {
                    throw new NoSuchElementException();
                }
                cr9.l lVar = (cr9.l) it8.next();
                if (lVar instanceof l.a) {
                    createdDate = ((l.a) lVar).getCreatedDate();
                } else {
                    if (!(lVar instanceof l.b)) {
                        if (lVar instanceof l.c) {
                            throw new IllegalStateException("Unknown type should've been filtered");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    createdDate = ((l.b) lVar).getCreatedDate();
                }
                while (it8.hasNext()) {
                    cr9.l lVar2 = (cr9.l) it8.next();
                    if (lVar2 instanceof l.a) {
                        createdDate2 = ((l.a) lVar2).getCreatedDate();
                    } else {
                        if (!(lVar2 instanceof l.b)) {
                            if (lVar2 instanceof l.c) {
                                throw new IllegalStateException("Unknown type should've been filtered");
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        createdDate2 = ((l.b) lVar2).getCreatedDate();
                    }
                    if (createdDate < createdDate2) {
                        createdDate = createdDate2;
                    }
                }
                ArrayList<cr9.l> arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list3) {
                    cr9.l lVar3 = (cr9.l) obj3;
                    if (lVar3 instanceof l.a) {
                        zF = Intrinsics.f(((l.a) lVar3).getState(), "CANCELLED");
                    } else {
                        if (!(lVar3 instanceof l.b)) {
                            if (lVar3 instanceof l.c) {
                                throw new IllegalStateException("Unknown type should've been filtered");
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        zF = Intrinsics.f(((l.b) lVar3).getState(), "CANCELLED");
                    }
                    if (zF) {
                        arrayList.add(obj3);
                    } else {
                        arrayList2.add(obj3);
                    }
                }
                boolean zIsEmpty = arrayList.isEmpty();
                e eVar = this.f199434b;
                if (!zIsEmpty) {
                    ArrayList arrayList3 = new ArrayList(w.t(arrayList, 10));
                    for (cr9.l lVar4 : arrayList) {
                        if (lVar4 instanceof l.a) {
                            id10 = ((l.a) lVar4).getId();
                        } else {
                            if (!(lVar4 instanceof l.b)) {
                                if (lVar4 instanceof l.c) {
                                    throw new IllegalStateException("Unknown type should've been filtered");
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            id10 = ((l.b) lVar4).getId();
                        }
                        arrayList3.add(id10);
                    }
                    yq9.e eVar2 = eVar.e;
                    eVar2.getClass();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("DELETE FROM payments_groups_bills_splits WHERE billId IN (");
                    DBUtil.performBlocking(eVar2.f315999a, false, true, new a54.c(20, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList3, sb6, ")"), arrayList3));
                    yq9.c cVar = (yq9.c) eVar.d;
                    cVar.getClass();
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append("DELETE FROM payments_groups_bills WHERE id IN (");
                    DBUtil.performBlocking(cVar.f315994a, false, true, new a54.c(19, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList3, sb9, ")"), arrayList3));
                }
                boolean zIsEmpty2 = arrayList2.isEmpty();
                String str = this.f199435c;
                if (!zIsEmpty2) {
                    List list4 = list2;
                    int iB = q0.b(w.t(list4, 10));
                    if (iB < 16) {
                        iB = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                    for (Object obj4 : list4) {
                        linkedHashMap.put(((oq9.o) obj4).b(), obj4);
                    }
                    ArrayList arrayListA = br9.c.a(arrayList2, str, linkedHashMap);
                    yq9.e eVar3 = eVar.e;
                    DBUtil.performBlocking(eVar3.f315999a, false, true, new yj2.b(eVar3, v13.d.b0(arrayListA), 17));
                    yq9.c cVar2 = (yq9.c) eVar.d;
                    DBUtil.performBlocking(cVar2.f315994a, false, true, new yj2.b(cVar2, v13.d.X(arrayListA), 15));
                }
                eVar.f199444h.f(j6.a.q("CACHE_KEY_BILLS_UPDATED_", str), Long.valueOf(createdDate));
                return Long.valueOf(createdDate);
            default:
                e eVar4 = this.f199434b;
                yq9.o oVar = eVar4.f;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list5 = (List) pair2.f186385a;
                List list6 = (List) pair2.f186386b;
                if (list5.isEmpty()) {
                    return -1L;
                }
                List list7 = list5;
                Iterator it9 = list7.iterator();
                if (!it9.hasNext()) {
                    throw new NoSuchElementException();
                }
                c0 c0Var = (c0) it9.next();
                if (c0Var instanceof c0.a) {
                    createdDate3 = ((c0.a) c0Var).getCreatedDate();
                } else if (c0Var instanceof c0.b) {
                    createdDate3 = ((c0.b) c0Var).getCreatedDate();
                } else {
                    if (!(c0Var instanceof c0.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    createdDate3 = ((c0.c) c0Var).getCreatedDate();
                }
                while (it9.hasNext()) {
                    c0 c0Var2 = (c0) it9.next();
                    if (c0Var2 instanceof c0.a) {
                        createdDate4 = ((c0.a) c0Var2).getCreatedDate();
                    } else if (c0Var2 instanceof c0.b) {
                        createdDate4 = ((c0.b) c0Var2).getCreatedDate();
                    } else {
                        if (!(c0Var2 instanceof c0.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        createdDate4 = ((c0.c) c0Var2).getCreatedDate();
                    }
                    if (createdDate3 < createdDate4) {
                        createdDate3 = createdDate4;
                    }
                }
                ArrayList<c0> arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : list7) {
                    if (((c0) obj5) instanceof c0.b) {
                        arrayList4.add(obj5);
                    } else {
                        arrayList5.add(obj5);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList(w.t(arrayList4, 10));
                    for (c0 c0Var3 : arrayList4) {
                        if (c0Var3 instanceof c0.a) {
                            id11 = ((c0.a) c0Var3).getId();
                        } else if (c0Var3 instanceof c0.b) {
                            id11 = ((c0.b) c0Var3).getId();
                        } else {
                            if (!(c0Var3 instanceof c0.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            id11 = ((c0.c) c0Var3).getId();
                        }
                        arrayList6.add(id11);
                    }
                    oVar.getClass();
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("DELETE FROM payments_groups_settlements WHERE id IN (");
                    DBUtil.performBlocking(oVar.f316023a, false, true, new a54.c(21, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList6, sb10, ")"), arrayList6));
                }
                boolean zIsEmpty3 = arrayList5.isEmpty();
                String str2 = this.f199435c;
                if (!zIsEmpty3) {
                    List list8 = list6;
                    int iB2 = q0.b(w.t(list8, 10));
                    if (iB2 < 16) {
                        iB2 = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                    for (Object obj6 : list8) {
                        linkedHashMap2.put(((oq9.o) obj6).b(), obj6);
                    }
                    DBUtil.performBlocking(oVar.f316023a, false, true, new yj2.b(oVar, a.a.K(br9.k.a(arrayList5, str2, linkedHashMap2)), 22));
                }
                eVar4.f199444h.f(j6.a.q("CACHE_KEY_SETTLEMENTS_UPDATED_", str2), Long.valueOf(createdDate3));
                return Long.valueOf(createdDate3);
        }
    }
}
