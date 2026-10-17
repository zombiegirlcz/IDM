package ku1;

import com.revolut.data.model.Data;
import com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f189631b;

    public /* synthetic */ y(Data data, int i) {
        this.f189630a = i;
        this.f189631b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f189630a) {
            case 0:
                return h.a((h) obj2, null, this.f189631b, null, null, null, null, 61);
            case 1:
                ku8.j update = (ku8.j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                SelectedKycDocs selectedDocs = update.f189741b;
                update.getClass();
                Data documents = this.f189631b;
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(selectedDocs, "selectedDocs");
                return new ku8.j(documents, selectedDocs);
            case 2:
                return kug.g.a((kug.g) obj2, this.f189631b, null, 6);
            case 3:
                ((kv7.e) obj2).getClass();
                Data cards = this.f189631b;
                Intrinsics.checkNotNullParameter(cards, "cards");
                return new kv7.e(cards);
            case 4:
                return new kvg.b(this.f189631b, ((kvg.b) obj2).f190114b);
            case 5:
                return kvk.k.a((kvk.k) obj2, null, null, null, this.f189631b, 7);
            case 6:
                return kvk.k.a((kvk.k) obj2, null, this.f189631b, null, null, 13);
            case 7:
                return kw4.i.a((kw4.i) obj2, this.f189631b);
            case 8:
                return kxk.f.a((kxk.f) obj2, this.f189631b, null, 2);
            case 9:
                Data earnOptionsBottomSheet = this.f189631b;
                Intrinsics.h(earnOptionsBottomSheet);
                ((kzb.f) obj2).getClass();
                Intrinsics.checkNotNullParameter(earnOptionsBottomSheet, "earnOptionsBottomSheet");
                return new kzb.f(earnOptionsBottomSheet);
            case 10:
                return l0c.j.a((l0c.j) obj2, null, this.f189631b, false, 5);
            case 11:
                e13.a flowType = ((l13.f) obj2).f191429a;
                Intrinsics.checkNotNullParameter(flowType, "flowType");
                Data eligibility = this.f189631b;
                Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                return new l13.f(flowType, eligibility);
            case 12:
                l1g.c type = ((l1g.b) obj2).f191533b;
                Data experience = this.f189631b;
                Intrinsics.checkNotNullParameter(experience, "experience");
                Intrinsics.checkNotNullParameter(type, "type");
                return new l1g.b(experience, type);
            case 13:
                l1k.i updateState = (l1k.i) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return l1k.i.a(updateState, null, this.f189631b, null, null, 29);
            case 14:
                l1k.i updateState2 = (l1k.i) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                Data data = this.f189631b;
                Intrinsics.h(data);
                return l1k.i.a(updateState2, data, null, null, null, 30);
            case 15:
                return l26.b.a((l26.b) obj2, null, null, null, null, this.f189631b, null, null, null, null, 495);
            case 16:
                return l26.b.a((l26.b) obj2, (n9l.a) this.f189631b.getContent(), null, null, null, null, null, null, null, null, 510);
            case 17:
                return l26.b.a((l26.b) obj2, null, null, null, null, null, null, null, null, this.f189631b, 255);
            case 18:
                return l27.d.a((l27.d) obj2, this.f189631b, null, 5);
            case 19:
                Data data2 = this.f189631b;
                Intrinsics.h(data2);
                return l27.d.a((l27.d) obj2, null, data2, 3);
            case 20:
                Data data3 = this.f189631b;
                Intrinsics.h(data3);
                return l2c.g.a((l2c.g) obj2, 0, null, null, data3, null, null, 55);
            case 21:
                return l2c.g.a((l2c.g) obj2, 0, null, null, null, this.f189631b, null, 47);
            case 22:
                Data data4 = this.f189631b;
                Intrinsics.h(data4);
                return l2c.g.a((l2c.g) obj2, 0, null, null, null, null, data4, 31);
            case 23:
                return l3e.a.a((l3e.a) obj2, this.f189631b, null, false, 6);
            case 24:
                ((l42.a) obj2).getClass();
                Data data5 = this.f189631b;
                Intrinsics.checkNotNullParameter(data5, "data");
                return new l42.a(data5);
            case 25:
                ((l43.c) obj2).getClass();
                Data cardPaymentsLimit = this.f189631b;
                Intrinsics.checkNotNullParameter(cardPaymentsLimit, "cardPaymentsLimit");
                return new l43.c(cardPaymentsLimit);
            case 26:
                Data data6 = this.f189631b;
                Intrinsics.h(data6);
                return l4g.e.a((l4g.e) obj2, null, data6, 3);
            case 27:
                return l5a.l.a((l5a.l) obj2, null, null, null, null, null, false, null, null, false, this.f189631b, 511);
            case 28:
                Data data7 = this.f189631b;
                Intrinsics.h(data7);
                return l5a.l.a((l5a.l) obj2, null, null, null, data7, null, false, null, null, false, null, 1015);
            default:
                String bookingId = ((l5g.e) obj2).f192258a;
                Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                Data bookingDetails = this.f189631b;
                Intrinsics.checkNotNullParameter(bookingDetails, "bookingDetails");
                return new l5g.e(bookingDetails, bookingId);
        }
    }
}
