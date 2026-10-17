package i6f;

import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f158935b;

    public /* synthetic */ h0(Data data, int i) {
        this.f158934a = i;
        this.f158935b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List listA;
        switch (this.f158934a) {
            case 0:
                return t.a((t) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f158935b, 131071);
            case 1:
                return t.a((t) obj2, this.f158935b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262142);
            case 2:
                return t.a((t) obj2, null, null, null, null, null, null, null, null, null, null, this.f158935b, null, null, null, null, null, null, null, 261119);
            case 3:
                return t.a((t) obj2, null, this.f158935b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262141);
            case 4:
                return t.a((t) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f158935b, null, null, null, null, 253951);
            case 5:
                return i6g.f.a((i6g.f) obj2, null, this.f158935b, 1);
            case 6:
                return i6g.f.a((i6g.f) obj2, null, this.f158935b, 1);
            case 7:
                return i6j.f.a((i6j.f) obj2, this.f158935b, null, null, null, null, 30);
            case 8:
                return i6j.f.a((i6j.f) obj2, null, null, this.f158935b, null, null, 27);
            case 9:
                return i6j.f.a((i6j.f) obj2, null, null, null, null, this.f158935b, 15);
            case 10:
                return i6j.f.a((i6j.f) obj2, null, this.f158935b, null, null, null, 29);
            case 11:
                return i6j.f.a((i6j.f) obj2, null, null, null, this.f158935b, null, 23);
            case 12:
                Data inboxItems = this.f158935b;
                Intrinsics.h(inboxItems);
                ((i79.g) obj2).getClass();
                Intrinsics.checkNotNullParameter(inboxItems, "inboxItems");
                return new i79.g(inboxItems);
            case 13:
                String bookingId = ((i7g.e) obj2).f159293a;
                Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                Data bookingDetails = this.f158935b;
                Intrinsics.checkNotNullParameter(bookingDetails, "bookingDetails");
                return new i7g.e(bookingDetails, bookingId);
            case 14:
                Data data = this.f158935b;
                Intrinsics.h(data);
                return i83.f.a((i83.f) obj2, null, data, 5);
            case 15:
                q35.g0 g0Var = ((i85.n) obj2).f159461b;
                Data screenContent = this.f158935b;
                Intrinsics.checkNotNullParameter(screenContent, "screenContent");
                return new i85.n(screenContent, g0Var);
            case 16:
                ((iad.d) obj2).getClass();
                Data pdfFileData = this.f158935b;
                Intrinsics.checkNotNullParameter(pdfFileData, "pdfFileData");
                return new iad.d(pdfFileData);
            case 17:
                Data hotelsProperty = this.f158935b;
                Intrinsics.h(hotelsProperty);
                ((ibg.d) obj2).getClass();
                Intrinsics.checkNotNullParameter(hotelsProperty, "hotelsProperty");
                return new ibg.d(hotelsProperty);
            case 18:
                return ich.l.a((ich.l) obj2, null, null, null, false, null, null, null, this.f158935b, null, 383);
            case 19:
                return ich.l.a((ich.l) obj2, null, null, this.f158935b, false, null, null, null, null, null, 507);
            case 20:
                Data data2 = this.f158935b;
                Intrinsics.h(data2);
                return ieg.m.a((ieg.m) obj2, data2, null, null, null, 14);
            case 21:
                ((iek.e) obj2).getClass();
                Data podNomineeData = this.f158935b;
                Intrinsics.checkNotNullParameter(podNomineeData, "podNomineeData");
                return new iek.e(podNomineeData);
            case 22:
                ((iga.e) obj2).getClass();
                Data benefitsLayout = this.f158935b;
                Intrinsics.checkNotNullParameter(benefitsLayout, "benefitsLayout");
                return new iga.e(benefitsLayout);
            case 23:
                igf.c cVar = (igf.c) obj2;
                Data data3 = this.f158935b;
                List list = (List) data3.getContent();
                if (list != null) {
                    igf.g.Companion.getClass();
                    listA = igf.e.a(list);
                } else {
                    listA = cVar.f161187b;
                }
                return igf.c.a(cVar, null, listA, null, data3, 5);
            case 24:
                ((ih5.a) obj2).getClass();
                Data breakdown = this.f158935b;
                Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                return new ih5.a(breakdown);
            case 25:
                ((ij6.f) obj2).getClass();
                Data consentDetailsData = this.f158935b;
                Intrinsics.checkNotNullParameter(consentDetailsData, "consentDetailsData");
                return new ij6.f(consentDetailsData);
            case 26:
                ijd.c cVar2 = (ijd.c) obj2;
                String productName = cVar2.f161770a;
                String description = cVar2.f161771b;
                String imageUrl = cVar2.f161772c;
                int i = cVar2.d;
                Map map = cVar2.e;
                Address address = cVar2.f;
                double d = cVar2.f161773g;
                Intrinsics.checkNotNullParameter(productName, "productName");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                return new ijd.c(productName, description, imageUrl, i, map, address, d, this.f158935b);
            case 27:
                ((ijj.f) obj2).getClass();
                Data cancellationQuote = this.f158935b;
                Intrinsics.checkNotNullParameter(cancellationQuote, "cancellationQuote");
                return new ijj.f(cancellationQuote);
            case 28:
                ikk.e eVar = (ikk.e) obj2;
                Data subscription = this.f158935b;
                Intrinsics.h(subscription);
                lha.k inviter = eVar.f161992a;
                boolean z = eVar.f161993b;
                Intrinsics.checkNotNullParameter(inviter, "inviter");
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                return new ikk.e(inviter, z, subscription);
            default:
                ((hlb.f) obj2).getClass();
                Data infoSheetData = this.f158935b;
                Intrinsics.checkNotNullParameter(infoSheetData, "infoSheetData");
                return new hlb.f(infoSheetData);
        }
    }
}
