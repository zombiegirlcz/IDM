package rbh;

import android.graphics.Bitmap;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.retail.trading.core.domain.PocketInfo;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253073a;

    public /* synthetic */ j(int i) {
        this.f253073a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f253073a) {
            case 0:
                Throwable th10 = (Throwable) obj2;
                if (((m1h.h) obj3) == null) {
                    return th10;
                }
                return null;
            case 1:
                Throwable th11 = (Throwable) obj2;
                if (((PocketInfo) obj3) == null) {
                    return th11;
                }
                return null;
            case 2:
                Throwable th12 = (Throwable) obj2;
                if (((Set) obj3) == null) {
                    return th12;
                }
                return null;
            case 3:
                Throwable error = (Throwable) obj2;
                FreelancerAccountOnboardingState freelancerAccountOnboardingState = (FreelancerAccountOnboardingState) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (freelancerAccountOnboardingState == null) {
                    return error;
                }
                return null;
            case 4:
                Throwable th13 = (Throwable) obj2;
                if (((Set) obj3) == null) {
                    return th13;
                }
                return null;
            case 5:
                Throwable th14 = (Throwable) obj2;
                if (((Set) obj3) == null) {
                    return th14;
                }
                return null;
            case 6:
                Integer count = (Integer) obj3;
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(count, "count");
                return count;
            case 7:
                ((Boolean) obj2).booleanValue();
                return wk5.n.NOT_RESTRICTED;
            case 8:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 9:
                Throwable th15 = (Throwable) obj2;
                if (((psg.a) obj3) == null) {
                    return th15;
                }
                return null;
            case 10:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 11:
                Throwable error2 = (Throwable) obj2;
                Bitmap bitmap = (Bitmap) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (bitmap == null) {
                    return error2;
                }
                return null;
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 13:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null));
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return CounterTextDelegate.c.a.f52173a;
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 17:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 18:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                rd3.d.Companion.getClass();
                return rd3.d.f253322b;
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                rd3.d.Companion.getClass();
                return rd3.d.f253322b;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                rd3.d.Companion.getClass();
                return rd3.d.f253322b;
        }
    }
}
