package poj;

import com.revolut.feature.uipersonalisation.api.ChristmasThemeDeclaration;
import efm.d0;
import ekg.g;
import java.time.Month;
import java.time.MonthDay;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import po9.w;
import toj.b;
import ufm.i;
import vjg.f;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends moj.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f238042c;
    public final e d;
    public final g e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f238043g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b regularWelcomeMessageProvider, e dateProvider, g uiPersonalisationInteractor) {
        super("ID_EVENT_CHRISTMAS_AND_NEW_YEAR");
        Intrinsics.checkNotNullParameter(regularWelcomeMessageProvider, "regularWelcomeMessageProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        this.f238042c = regularWelcomeMessageProvider;
        this.d = dateProvider;
        this.e = uiPersonalisationInteractor;
        Month month = Month.DECEMBER;
        MonthDay monthDayOf = MonthDay.of(month, 23);
        Intrinsics.checkNotNullExpressionValue(monthDayOf, "of(...)");
        MonthDay monthDayOf2 = MonthDay.of(month, 28);
        Intrinsics.checkNotNullExpressionValue(monthDayOf2, "of(...)");
        this.f = new f(monthDayOf, monthDayOf2);
        MonthDay monthDayOf3 = MonthDay.of(month, 31);
        Intrinsics.checkNotNullExpressionValue(monthDayOf3, "of(...)");
        MonthDay monthDayOf4 = MonthDay.of(Month.JANUARY, 4);
        Intrinsics.checkNotNullExpressionValue(monthDayOf4, "of(...)");
        this.f238043g = new f(monthDayOf3, monthDayOf4);
    }

    @Override // q7l.b
    public final boolean c(p7l.a user) {
        Intrinsics.checkNotNullParameter(user, "user");
        return this.e.j().f94561a instanceof ChristmasThemeDeclaration;
    }

    @Override // q7l.b
    public final boolean d() {
        return true;
    }

    @Override // q7l.b
    public final d0 e(p7l.a user) {
        Intrinsics.checkNotNullParameter(user, "user");
        i iVar = new i(this.f238042c.b(user), new w(4, new pj3.b(user, this, 7)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
