package w56;

import com.revolut.data.model.Data;
import egb.j0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f294710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f294711b;

    public /* synthetic */ o(Data data, int i) {
        this.f294710a = i;
        this.f294711b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        egb.c cVar;
        int i = this.f294710a;
        Data valueReminderData = this.f294711b;
        switch (i) {
            case 0:
                Intrinsics.h(valueReminderData);
                break;
            case 1:
                ((w5h.c) obj2).getClass();
                break;
            case 2:
                Intrinsics.h(valueReminderData);
                break;
            case 3:
                ((w7b.i) obj2).getClass();
                Intrinsics.checkNotNullParameter(valueReminderData, "valueReminderData");
                break;
            case 4:
                ((w7f.a) obj2).getClass();
                break;
            case 5:
                Intrinsics.h(valueReminderData);
                ((w86.e) obj2).getClass();
                Intrinsics.checkNotNullParameter(valueReminderData, "devices");
                break;
            case 6:
                w8l.e update = (w8l.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Set expandedMoreInfoIds = valueReminderData.getContent() != null ? h0.f322473a : update.f295654b;
                update.getClass();
                Intrinsics.checkNotNullParameter(valueReminderData, "screenData");
                Intrinsics.checkNotNullParameter(expandedMoreInfoIds, "expandedMoreInfoIds");
                break;
            case 7:
                Intrinsics.checkNotNullParameter((w9a.c) obj2, "$this$update");
                break;
            case 8:
                break;
            case 9:
                od0.i.Companion.getClass();
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                Data data = this.f294711b;
                Intrinsics.h(data);
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                ((wbj.d) obj2).getClass();
                Intrinsics.checkNotNullParameter(valueReminderData, "depositReturnContent");
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                wfh.l lVar = (wfh.l) obj2;
                break;
            case 26:
                wgb.h update2 = (wgb.h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Data data2 = this.f294711b;
                egb.c cVar2 = (egb.c) data2.getContent();
                if (cVar2 != null) {
                    j0 header = cVar2.f125582a;
                    List blocks = cVar2.f125583b;
                    List list = cVar2.f125584c;
                    egb.b bVar = egb.c.Companion;
                    Intrinsics.checkNotNullParameter(header, "header");
                    Intrinsics.checkNotNullParameter(blocks, "blocks");
                    cVar = new egb.c(header, blocks, list, null);
                } else {
                    cVar = null;
                }
                Data salaryPromotion = Data.copy$default(data2, cVar, null, false, 6, null);
                update2.getClass();
                Intrinsics.checkNotNullParameter(salaryPromotion, "salaryPromotion");
                break;
            case 27:
                Data salaryPromotion2 = new Data(null, valueReminderData.getError(), false, 5, null);
                ((wgb.h) obj2).getClass();
                Intrinsics.checkNotNullParameter(salaryPromotion2, "salaryPromotion");
                break;
            case 28:
                ((wgb.h) obj2).getClass();
                Intrinsics.checkNotNullParameter(valueReminderData, "salaryPromotion");
                break;
            default:
                ((wgb.h) obj2).getClass();
                Intrinsics.checkNotNullParameter(valueReminderData, "salaryPromotion");
                break;
        }
        return new wgb.h(valueReminderData);
    }
}
