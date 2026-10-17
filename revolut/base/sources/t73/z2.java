package t73;

import com.revolut.data.model.Data;
import com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.CharityDetailsScreen;
import com.revolut.feature.junior.isa.impl.ui.jisa_national_number.JuniorIsaNationalNumberScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.TravelHotelsLocationPickerScreen;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsArticle;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class z2 implements kfm.o, kfm.p, zp0.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f268581b;

    public /* synthetic */ z2(Object obj2, int i) {
        this.f268580a = i;
        this.f268581b = obj2;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f268580a;
        Object obj2 = this.f268581b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((avc.o) obj2).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((x2) obj2).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((y2) obj2).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((y2) obj2).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Map) ((y2) obj2).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((y2) obj2).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (s63.g) ((x2) obj2).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k77.i) ((y2) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((y2) obj2).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k77.n) ((y2) obj2).invoke(p0);
            case 10:
                return (Boolean) ((y2) obj2).invoke(p0);
            case 11:
            case 13:
            case 20:
            case 22:
            case 24:
            default:
                KProperty[] kPropertyArr = TravelHotelsLocationPickerScreen.S;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((t9b.a) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (WealthNewsArticle) ((y2) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((y2) obj2).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((t5e.m) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((y2) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (p97.a) ((t5e.m) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((su0.c) obj2).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((su0.c) obj2).invoke(p0);
            case 21:
                KProperty[] kPropertyArr2 = CharityDetailsScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((t9b.a) obj2).invoke(p0);
            case 23:
                KProperty[] kPropertyArr3 = CharityDetailsScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ba6.l) ((t9b.a) obj2).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((t9b.a) obj2).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((t9b.a) obj2).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((tb6.a0) obj2).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (hce.a) ((pud.b) obj2).invoke(p0);
        }
    }

    @Override // zp0.x
    public void e(String str, String text, String str2, boolean z) {
        JuniorIsaNationalNumberScreen juniorIsaNationalNumberScreen = (JuniorIsaNationalNumberScreen) this.f268581b;
        KProperty[] kPropertyArr = JuniorIsaNationalNumberScreen.S;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(text, "extractedValue");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        com.revolut.feature.junior.isa.impl.ui.jisa_national_number.a aVar = (com.revolut.feature.junior.isa.impl.ui.jisa_national_number.a) juniorIsaNationalNumberScreen.d();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        String upperCase = text.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        ta8.o.Companion.getClass();
        boolean zF = ta8.h.f269159b.f(upperCase);
        aVar.H2(aVar.f76808r, new ay2.k(upperCase, zF, zF && !(aVar.o.d == s98.a.PROFILE_EDIT && upperCase.equals(aVar.I2())), 7));
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f268580a;
        Object obj2 = this.f268581b;
        switch (i) {
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 22:
                KProperty[] kPropertyArr = CharityDetailsScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                KProperty[] kPropertyArr2 = CharityDetailsScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) ((t9b.a) obj2).invoke(p0)).booleanValue();
    }
}
