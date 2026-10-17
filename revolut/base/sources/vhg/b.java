package vhg;

import com.google.protobuf.b4;
import com.google.protobuf.d4;
import com.google.protobuf.f3;
import com.google.protobuf.h3;
import com.google.protobuf.r1;
import com.google.protobuf.s1;
import com.google.protobuf.w0;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static d4 a(Set set) {
        b4 b4VarNewBuilder = d4.newBuilder();
        r1 r1VarNewBuilder = s1.newBuilder();
        Set set2 = set;
        ArrayList arrayList = new ArrayList(w.t(set2, 10));
        Iterator it8 = set2.iterator();
        while (it8.hasNext()) {
            arrayList.add(d((String) it8.next()));
        }
        r1VarNewBuilder.h(arrayList);
        s1 s1Var = (s1) r1VarNewBuilder.a();
        b4VarNewBuilder.c();
        ((d4) b4VarNewBuilder.f49761b).setListValue(s1Var);
        w0 w0VarA = b4VarNewBuilder.a();
        Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
        return (d4) w0VarA;
    }

    public static d4 b(TravelMilesSearchLocation location) {
        h3 h3Var;
        Intrinsics.checkNotNullParameter(location, "location");
        b4 b4VarNewBuilder = d4.newBuilder();
        if (location instanceof TravelMilesSearchLocation.Airport) {
            f3 f3VarNewBuilder = h3.newBuilder();
            TravelMilesSearchLocation.Airport airport = (TravelMilesSearchLocation.Airport) location;
            f3VarNewBuilder.i("city", d(airport.f94141a));
            f3VarNewBuilder.i("iataCode", d(airport.f94142b));
            h3Var = (h3) f3VarNewBuilder.a();
        } else {
            if (!(location instanceof TravelMilesSearchLocation.City)) {
                throw new NoWhenBranchMatchedException();
            }
            f3 f3VarNewBuilder2 = h3.newBuilder();
            TravelMilesSearchLocation.City city = (TravelMilesSearchLocation.City) location;
            f3VarNewBuilder2.i("city", d(city.f94143a));
            f3VarNewBuilder2.i("countryCode", d(city.f94144b));
            h3Var = (h3) f3VarNewBuilder2.a();
        }
        b4VarNewBuilder.i(h3Var);
        w0 w0VarA = b4VarNewBuilder.a();
        Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
        return (d4) w0VarA;
    }

    public static d4 c(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        b4 b4VarNewBuilder = d4.newBuilder();
        f3 f3VarNewBuilder = h3.newBuilder();
        b4 b4VarNewBuilder2 = d4.newBuilder();
        double d = money.f115082a;
        b4VarNewBuilder2.c();
        ((d4) b4VarNewBuilder2.f49761b).setNumberValue(d);
        f3VarNewBuilder.i("amount", (d4) b4VarNewBuilder2.a());
        f3VarNewBuilder.i("currency", d(money.f115083b.f306286a));
        b4VarNewBuilder.i((h3) f3VarNewBuilder.a());
        w0 w0VarA = b4VarNewBuilder.a();
        Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
        return (d4) w0VarA;
    }

    public static d4 d(String str) {
        b4 b4VarNewBuilder = d4.newBuilder();
        b4VarNewBuilder.h(str);
        w0 w0VarA = b4VarNewBuilder.a();
        Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
        return (d4) w0VarA;
    }
}
