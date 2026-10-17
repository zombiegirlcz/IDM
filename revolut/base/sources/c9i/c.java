package c9i;

import android.graphics.Color;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature_news_impl.R$drawable;
import com.revolut.retail.common.ui.model.NewsUiItem;
import com.revolut.tracking.v3.IdContext;
import java.util.Date;
import java.util.List;
import kii.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements Function2 {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static NewsUiItem a(w61.a news, String str) {
        List list;
        Instant instant;
        Integer num;
        Instant instant2;
        Date date;
        Date date2;
        Intrinsics.checkNotNullParameter(news, "news");
        String rootUrl = str;
        Intrinsics.checkNotNullParameter(rootUrl, "rootUrl");
        String str2 = news.f295361a;
        String str3 = news.f295362b;
        String str4 = news.d;
        String str5 = news.f295363c;
        String str6 = news.i;
        String strO = str6 == null ? news.f295365h : str6;
        boolean z = str6 != null;
        if (strO == null) {
            strO = "";
        } else if (!a0.H(strO, "http://", false) && !a0.H(strO, "https://", false)) {
            if (rootUrl.length() == 0) {
                rootUrl = "https://assets.revolut.com/news-icons/";
            }
            strO = com.google.android.gms.internal.mlkit_vision_face.a.o(rootUrl, strO, z ? ".gif" : ".png");
        }
        boolean zBooleanValue = false;
        UrlImage urlImage = new UrlImage(strO, null, Integer.valueOf(R$drawable.background_banner_placeholder), null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524282);
        String str7 = news.f;
        String str8 = str7 == null ? "" : str7;
        String str9 = news.f295364g;
        String str10 = news.e;
        String str11 = news.f295366j;
        Integer numValueOf = str11 != null ? Integer.valueOf(Color.parseColor(str11)) : null;
        List list2 = news.k;
        Boolean bool = news.f295369n;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        boolean z3 = zBooleanValue;
        LocalDate localDate = news.f295367l;
        if (localDate == null || (date2 = localDate.toDate()) == null) {
            list = list2;
            instant = null;
        } else {
            list = list2;
            instant = new Instant(date2.getTime());
        }
        LocalDate localDate2 = news.f295368m;
        if (localDate2 == null || (date = localDate2.toDate()) == null) {
            num = numValueOf;
            instant2 = null;
        } else {
            num = numValueOf;
            instant2 = new Instant(date.getTime());
        }
        Boolean bool2 = news.f295371q;
        return new NewsUiItem(str2, str3, str4, str5, urlImage, str8, str9, str10, num, list, z3, instant, instant2, bool2 != null ? bool2.booleanValue() : true, null, new AnalyticsContext(e.d(IdContext.newBuilder(), news.f295361a, AnalyticsContext.INSTANCE)), news.f295372r, 1294336);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
        return a((w61.a) obj2, (String) obj3);
    }
}
