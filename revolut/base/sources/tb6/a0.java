package tb6;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.n3;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f269470b;

    public /* synthetic */ a0(c0 c0Var, int i) {
        this.f269469a = i;
        this.f269470b = c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List list;
        switch (this.f269469a) {
            case 0:
                whf.p content = (whf.p) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                if (content.f297646a.size() == 0) {
                    return f0.f322471a;
                }
                int size = content.f297646a.size();
                c0 c0Var = this.f269470b;
                c0Var.getClass();
                ListSubheaderDelegate.Model modelA = c0.a(size);
                List listV0 = zhm.d0.V0(whf.n.a(c0Var.f269476c, content, null, null, null, 14), 3);
                yp0.b.k(listV0, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
                return i2b.a.q(modelA, listV0);
            case 1:
                qa6.d content2 = (qa6.d) obj2;
                Intrinsics.checkNotNullParameter(content2, "content");
                List list2 = content2.f243966a;
                if (list2.size() == 0) {
                    return f0.f322471a;
                }
                int size2 = list2.size();
                c0 c0Var2 = this.f269470b;
                c0Var2.getClass();
                ListSubheaderDelegate.Model modelA2 = c0.a(size2);
                List list3 = list2;
                ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    arrayList.add(c0Var2.d.a((qa6.c) it8.next(), content2.f243967b));
                }
                yp0.b.k(arrayList, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
                return i2b.a.q(modelA2, arrayList);
            case 2:
                Data transactionsData = (Data) obj2;
                Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
                whf.p pVar = (whf.p) transactionsData.getContent();
                ArrayList arrayList2 = null;
                if (pVar != null && (list = pVar.f297646a) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it9 = list.iterator();
                    while (it9.hasNext()) {
                        n3 n3Var = ((a3) it9.next()).B0;
                        String str = n3Var != null ? n3Var.f272943a : null;
                        if (str != null) {
                            arrayList3.add(str);
                        }
                    }
                    arrayList2 = arrayList3;
                }
                return (arrayList2 == null || arrayList2.isEmpty()) ? efm.r.just(transactionsData) : this.f269470b.f269474a.a(zhm.d0.i1(arrayList2)).g(efm.r.just(transactionsData));
            default:
                qa6.d transactionsContent = (qa6.d) obj2;
                Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
                List list4 = transactionsContent.f243966a;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list4) {
                    if (obj3 instanceof qa6.a) {
                        arrayList4.add(obj3);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it10 = arrayList4.iterator();
                while (it10.hasNext()) {
                    n3 n3Var2 = ((qa6.a) it10.next()).f243962a.B0;
                    String str2 = n3Var2 != null ? n3Var2.f272943a : null;
                    if (str2 != null) {
                        arrayList5.add(str2);
                    }
                }
                Object objG = !arrayList5.isEmpty() ? this.f269470b.f269474a.a(zhm.d0.i1(arrayList5)).g(efm.r.just(new Data(transactionsContent, null, false, 6, null))) : efm.r.just(new Data(transactionsContent, null, false, 6, null));
                Intrinsics.h(objG);
                return objG;
        }
    }
}
