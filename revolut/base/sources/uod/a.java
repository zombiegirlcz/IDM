package uod;

import cli.j;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import h30.l;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f281618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f281619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZonedDateTime f281620c;
    public final Image d;
    public final List e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f281621g;

    public a(String userName, Set visitedCountries, ZonedDateTime joinDate, Image image, List supportedShareActions, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(visitedCountries, "visitedCountries");
        Intrinsics.checkNotNullParameter(joinDate, "joinDate");
        Intrinsics.checkNotNullParameter(supportedShareActions, "supportedShareActions");
        this.f281618a = userName;
        this.f281619b = visitedCountries;
        this.f281620c = joinDate;
        this.d = image;
        this.e = supportedShareActions;
        this.f = num;
        this.f281621g = num2;
    }

    public static a a(a aVar, Image image, ArrayList arrayList, Integer num, int i) {
        String userName = aVar.f281618a;
        Set visitedCountries = aVar.f281619b;
        ZonedDateTime joinDate = aVar.f281620c;
        if ((i & 8) != 0) {
            image = aVar.d;
        }
        Image image2 = image;
        List list = arrayList;
        if ((i & 16) != 0) {
            list = aVar.e;
        }
        List supportedShareActions = list;
        if ((i & 32) != 0) {
            num = aVar.f;
        }
        Integer num2 = aVar.f281621g;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(visitedCountries, "visitedCountries");
        Intrinsics.checkNotNullParameter(joinDate, "joinDate");
        Intrinsics.checkNotNullParameter(supportedShareActions, "supportedShareActions");
        return new a(userName, visitedCountries, joinDate, image2, supportedShareActions, num, num2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f281618a, aVar.f281618a) && Intrinsics.f(this.f281619b, aVar.f281619b) && Intrinsics.f(this.f281620c, aVar.f281620c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f281621g, aVar.f281621g);
    }

    public final int hashCode() {
        int iH = l.h(this.f281620c, p.a.f(this.f281618a.hashCode() * 31, 31, this.f281619b), 31);
        Image image = this.d;
        int iD = p.a.d((iH + (image == null ? 0 : image.hashCode())) * 31, 31, this.e);
        Integer num = this.f;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f281621g;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }
}
