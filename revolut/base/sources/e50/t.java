package e50;

import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.chat.ui.inbox.InboxScreenContract$DomainState;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v30.y;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f122697b;

    public /* synthetic */ t(Data data, int i) {
        this.f122696a = i;
        this.f122697b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ArrayList arrayList;
        switch (this.f122696a) {
            case 0:
                return InboxScreenContract$DomainState.a((InboxScreenContract$DomainState) obj2, null, null, null, null, null, false, false, this.f122697b, null, 383);
            case 1:
                Data data = this.f122697b;
                Intrinsics.h(data);
                return InboxScreenContract$DomainState.a((InboxScreenContract$DomainState) obj2, null, null, data, null, null, false, false, null, null, 507);
            case 2:
                InboxScreenContract$DomainState inboxScreenContract$DomainState = (InboxScreenContract$DomainState) obj2;
                Data data2 = this.f122697b;
                if (zi0.c.D(data2) && inboxScreenContract$DomainState.f51168b.getContent() != null) {
                    return inboxScreenContract$DomainState;
                }
                List list = (List) data2.getContent();
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (!((y) obj3).f285837h) {
                            arrayList.add(obj3);
                        }
                    }
                } else {
                    arrayList = null;
                }
                List list2 = (List) data2.getContent();
                boolean z = false;
                if (list2 != null) {
                    List list3 = list2;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it8 = list3.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                if (((y) it8.next()).f285837h) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                return InboxScreenContract$DomainState.a(inboxScreenContract$DomainState, null, new Data(arrayList, data2.getError(), data2.getLoading()), null, null, null, z, false, null, null, 477);
            case 3:
                InboxScreenContract$DomainState inboxScreenContract$DomainState2 = (InboxScreenContract$DomainState) obj2;
                Boolean bool = (Boolean) this.f122697b.getContent();
                return InboxScreenContract$DomainState.a(inboxScreenContract$DomainState2, null, null, null, null, null, false, bool != null ? bool.booleanValue() : false, null, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            case 4:
                return e69.f.a((e69.f) obj2, this.f122697b, null, 2);
            case 5:
                return e69.f.a((e69.f) obj2, null, this.f122697b, 1);
            case 6:
                ((e75.f) obj2).getClass();
                Data content = this.f122697b;
                Intrinsics.checkNotNullParameter(content, "content");
                return new e75.f(content);
            case 7:
                return e7f.e.a((e7f.e) obj2, null, null, this.f122697b, null, 11);
            case 8:
                return e7f.e.a((e7f.e) obj2, this.f122697b, null, null, null, 14);
            case 9:
                return e7f.e.a((e7f.e) obj2, null, this.f122697b, null, null, 13);
            case 10:
                return e7f.e.a((e7f.e) obj2, null, null, null, this.f122697b, 7);
            case 11:
                return e85.g.a((e85.g) obj2, this.f122697b, null, 5);
            case 12:
                return com.revolut.feature.global_markets.impl.ui.flow.index_details.a.a((com.revolut.feature.global_markets.impl.ui.flow.index_details.a) obj2, null, null, this.f122697b, null, 95);
            case 13:
                return com.revolut.feature.global_markets.impl.ui.flow.index_details.a.a((com.revolut.feature.global_markets.impl.ui.flow.index_details.a) obj2, null, null, null, this.f122697b, 63);
            case 14:
                return e8e.m.a((e8e.m) obj2, this.f122697b, null, null, null, 61);
            case 15:
                return e94.m.a((e94.m) obj2, this.f122697b, false, 2);
            case 16:
                return eac.h.a((eac.h) obj2, this.f122697b, null, null, null, null, 62);
            case 17:
                return eac.h.a((eac.h) obj2, null, this.f122697b, null, null, null, 61);
            case 18:
                return eac.h.a((eac.h) obj2, null, null, this.f122697b, null, null, 59);
            case 19:
                return eac.h.a((eac.h) obj2, null, null, null, this.f122697b, null, 55);
            case 20:
                return eac.h.a((eac.h) obj2, null, null, null, null, this.f122697b, 47);
            case 21:
                return ead.f.a((ead.f) obj2, null, this.f122697b, null, null, 27);
            case 22:
                return ead.f.a((ead.f) obj2, null, null, this.f122697b, null, 23);
            case 23:
                return ead.f.a((ead.f) obj2, null, null, null, this.f122697b, 15);
            case 24:
                return eaf.f.a((eaf.f) obj2, null, this.f122697b, 13);
            case 25:
                return ebf.h.a((ebf.h) obj2, this.f122697b, null, 47);
            case 26:
                return ebf.h.a((ebf.h) obj2, null, this.f122697b, 31);
            case 27:
                return ebg.e.a((ebg.e) obj2, this.f122697b, null, 2);
            case 28:
                return ebg.e.a((ebg.e) obj2, null, this.f122697b, 1);
            default:
                Data data3 = this.f122697b;
                Intrinsics.h(data3);
                return ec6.e.a((ec6.e) obj2, data3, null, 2);
        }
    }
}
