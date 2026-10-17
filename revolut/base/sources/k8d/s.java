package k8d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.shared.help_centre.impl.R$string;
import java.util.List;
import ka2.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182126a;

    public /* synthetic */ s(int i) {
        this.f182126a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f182126a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null));
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new TextLocalisedClause(R$string.help_center_screen_help_title_header, null, null, 14);
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.u.c(k8g.u.d("ERROR_TRANSACTIONS_ITEM_ID"));
            case 4:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return k8g.u.a(zhm.u.c(k8g.u.d("ERROR_AIRLINES_AND_ACCOUNTS_ITEM_ID")), k8g.u.b());
            case 5:
                return f0.f322471a;
            case 6:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new k9c.h((List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null)), null, null, null, null, null);
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.u.c(x.b());
            case 10:
                Throwable error = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (iVar == null) {
                    return error;
                }
                return null;
            case 11:
                Throwable error2 = (Throwable) obj2;
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (juniorBankingProfile == null) {
                    return error2;
                }
                return null;
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return kbb.f.a();
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 15:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 16:
                Throwable error3 = (Throwable) obj2;
                fo3.c cVar = (fo3.c) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (cVar == null) {
                    return error3;
                }
                return null;
            case 17:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 18:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 24:
                Throwable error4 = (Throwable) obj2;
                dj0.d dVar = (dj0.d) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (dVar == null) {
                    return error4;
                }
                return null;
            case 25:
                Throwable error5 = (Throwable) obj2;
                Image image = (Image) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (image == null) {
                    return error5;
                }
                return null;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 28:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                throw new IllegalStateException("Can't show consent prompt. Consents are null");
            default:
                Throwable error6 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list == null) {
                    return error6;
                }
                return null;
        }
    }

    public /* synthetic */ s(Object obj2, int i) {
        this.f182126a = i;
    }
}
