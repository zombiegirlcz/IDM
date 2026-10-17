package i3g;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.joda.time.DateTime;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3g.g f158204b;

    public /* synthetic */ b(x3g.g gVar, int i) {
        this.f158203a = i;
        this.f158204b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List list;
        x3g.f fVar;
        switch (this.f158203a) {
            case 0:
                Data reviewsData = (Data) obj2;
                Intrinsics.checkNotNullParameter(reviewsData, "reviewsData");
                x3g.h hVar = (x3g.h) reviewsData.getContent();
                if (hVar == null || (list = hVar.d) == null) {
                    list = f0.f322471a;
                }
                List list2 = list;
                boolean loading = reviewsData.getLoading();
                x3g.h hVar2 = (x3g.h) reviewsData.getContent();
                return new lk0.e(list2, this.f158204b, loading, hVar2 != null ? hVar2.e : null, null, 16);
            default:
                b0g.d it8 = (b0g.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                String experienceId = this.f158204b.f302746a;
                Intrinsics.checkNotNullParameter(it8, "<this>");
                Intrinsics.checkNotNullParameter(experienceId, "experienceId");
                int count = it8.getCount();
                double averageScore = it8.getAverageScore();
                List reviews = it8.getReviews();
                ArrayList arrayList = new ArrayList(w.t(reviews, 10));
                Iterator it9 = reviews.iterator();
                while (it9.hasNext()) {
                    b0g.a aVar = (b0g.a) it9.next();
                    Intrinsics.checkNotNullParameter(aVar, "<this>");
                    DateTime dateTime = DateTime.parse(aVar.getPublishedDate());
                    Intrinsics.checkNotNullExpressionValue(dateTime, "parse(...)");
                    String userName = aVar.getUserName();
                    Integer rating = aVar.getRating();
                    String title = aVar.getTitle();
                    String text = aVar.getText();
                    b0g.c source = aVar.getSource();
                    Intrinsics.checkNotNullParameter(source, "<this>");
                    b0g.d dVar = it8;
                    String provider = source.getProvider();
                    Iterator it10 = it9;
                    x3g.f[] fVarArrValues = x3g.f.values();
                    String str = experienceId;
                    int length = fVarArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            fVar = fVarArrValues[i];
                            int i2 = i;
                            int i3 = length;
                            if (!a0.z(fVar.name(), provider, true)) {
                                i = i2 + 1;
                                length = i3;
                            }
                        } else {
                            fVar = null;
                        }
                    }
                    if (fVar == null) {
                        fVar = x3g.f.UNKNOWN;
                    }
                    b0g.b logos = source.getLogos();
                    Intrinsics.checkNotNullParameter(logos, "<this>");
                    arrayList.add(new x3g.c(dateTime, userName, rating, title, text, new x3g.e(fVar, new x3g.d(logos.getLight(), logos.getDark()))));
                    it8 = dVar;
                    it9 = it10;
                    experienceId = str;
                }
                return new x3g.h(experienceId, count, averageScore, arrayList, it8.getNextPageToken());
        }
    }
}
