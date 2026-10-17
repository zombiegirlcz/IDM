package u4e;

import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f277332b;

    public /* synthetic */ l(Data data, int i) {
        this.f277331a = i;
        this.f277332b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        Data data2;
        ArrayList arrayList;
        String strA;
        switch (this.f277331a) {
            case 0:
                return d.a((d) obj2, null, null, this.f277332b, 3);
            case 1:
                ((u4i.j) obj2).getClass();
                Data fee2 = this.f277332b;
                Intrinsics.checkNotNullParameter(fee2, "fee");
                return new u4i.j(fee2);
            case 2:
                return u6b.e.a((u6b.e) obj2, null, null, this.f277332b, false, 11);
            case 3:
                ((u7k.a) obj2).getClass();
                Data data3 = this.f277332b;
                Intrinsics.checkNotNullParameter(data3, "data");
                return new u7k.a(data3);
            case 4:
                Data loanDetails = this.f277332b;
                Intrinsics.h(loanDetails);
                ((u85.g) obj2).getClass();
                Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
                return new u85.g(loanDetails);
            case 5:
                return u87.e.a((u87.e) obj2, null, null, null, null, null, null, this.f277332b, null, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            case 6:
                Data data4 = this.f277332b;
                u87.e eVar = (u87.e) obj2;
                try {
                    Object content = data4.getContent();
                    data = new Data(content != null ? eel.j.a(eel.k.Companion, (eel.e) content) : null, data4.getError(), data4.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data4.getLoading());
                }
                return u87.e.a(eVar, null, null, null, data, null, null, null, null, null, 503);
            case 7:
                return u87.e.a((u87.e) obj2, this.f277332b, null, null, null, null, null, null, null, null, 510);
            case 8:
                return u87.e.a((u87.e) obj2, null, null, this.f277332b, null, null, null, null, null, null, 507);
            case 9:
                return u87.e.a((u87.e) obj2, null, null, null, null, null, null, null, null, this.f277332b, 255);
            case 10:
                return u87.e.a((u87.e) obj2, null, null, null, null, null, this.f277332b, null, null, null, 479);
            case 11:
                return u8j.b.a((u8j.b) obj2, false, null, (n9l.a) this.f277332b.getContent(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194287);
            case 12:
                return u8j.b.a((u8j.b) obj2, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f277332b, 2097151);
            case 13:
                return u8j.b.a((u8j.b) obj2, false, null, null, null, null, this.f277332b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194175);
            case 14:
                return u8j.b.a((u8j.b) obj2, false, null, null, null, null, null, null, null, null, null, this.f277332b, null, null, null, null, null, null, null, null, null, 4190207);
            case 15:
                return u8j.b.a((u8j.b) obj2, false, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f277332b, null, null, null, null, null, 4128767);
            case 16:
                return u8j.b.a((u8j.b) obj2, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f277332b, null, null, null, null, 4063231);
            case 17:
                return u8j.b.a((u8j.b) obj2, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Boolean) this.f277332b.getContent(), null, 3145727);
            case 18:
                u95.h hVar = (u95.h) obj2;
                Data overdraftDetails = hVar.f278390a;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(overdraftDetails, "overdraftDetails");
                Data agreements = this.f277332b;
                Intrinsics.checkNotNullParameter(agreements, "agreements");
                return new u95.h(overdraftDetails, agreements);
            case 19:
                u95.h hVar2 = (u95.h) obj2;
                Data agreements2 = hVar2.f278391b;
                hVar2.getClass();
                Data overdraftDetails2 = this.f277332b;
                Intrinsics.checkNotNullParameter(overdraftDetails2, "overdraftDetails");
                Intrinsics.checkNotNullParameter(agreements2, "agreements");
                return new u95.h(overdraftDetails2, agreements2);
            case 20:
                ua2.d dVar = (ua2.d) obj2;
                Data data5 = this.f277332b;
                Intrinsics.h(data5);
                try {
                    Object content2 = data5.getContent();
                    if (content2 != null) {
                        arrayList = new ArrayList();
                        for (f5j.a aVar : (List) content2) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            Map map = aVar.u;
                            String str = map != null ? (String) map.get("ALIAS_NAME") : null;
                            fa2.a aVar2 = (str == null || (strA = f5j.c.a(aVar)) == null) ? null : new fa2.a(aVar.f132329a, str, strA, aVar);
                            if (aVar2 != null) {
                                arrayList.add(aVar2);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    data2 = new Data(arrayList, data5.getError(), data5.getLoading());
                    break;
                } catch (Throwable th11) {
                    data2 = new Data(null, th11, data5.getLoading());
                }
                return ua2.d.a(dVar, null, data2, null, 5);
            case 21:
                Data data6 = this.f277332b;
                Intrinsics.h(data6);
                return uag.e.a((uag.e) obj2, null, data6, 3);
            case 22:
                Data data7 = this.f277332b;
                Intrinsics.h(data7);
                return ubi.f.a((ubi.f) obj2, data7, null, 2);
            case 23:
                Data transactionsData = this.f277332b;
                Intrinsics.h(transactionsData);
                ((uc5.a) obj2).getClass();
                Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
                return new uc5.a(transactionsData);
            case 24:
                ((ud2.e) obj2).getClass();
                Data alias = this.f277332b;
                Intrinsics.checkNotNullParameter(alias, "alias");
                return new ud2.e(alias);
            case 25:
                Data data8 = this.f277332b;
                Intrinsics.h(data8);
                return ud3.i.a((ud3.i) obj2, data8, null, null, null, null, null, null, null, null, null, null, null, false, 16382);
            case 26:
                return ud3.i.a((ud3.i) obj2, null, null, null, null, null, null, null, null, null, null, this.f277332b, null, false, 14335);
            case 27:
                Data data9 = this.f277332b;
                Intrinsics.h(data9);
                return ud3.i.a((ud3.i) obj2, null, null, null, null, null, null, null, null, data9, null, null, null, false, 16127);
            case 28:
                Data data10 = this.f277332b;
                Intrinsics.h(data10);
                return ud3.i.a((ud3.i) obj2, null, null, null, null, null, null, null, null, null, null, null, data10, false, 12287);
            default:
                Data data11 = this.f277332b;
                Intrinsics.h(data11);
                return ud3.i.a((ud3.i) obj2, null, data11, null, null, null, null, null, null, null, null, null, null, false, 16381);
        }
    }
}
