package rg8;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.junior_graduation.api.navigation.JuniorGraduationFeatureConfig;
import ig8.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import rd3.k;
import rd3.x;
import rul.e;
import w4l.h;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements hg8.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f254046a;

    public d(e juniorGraduationInteractor) {
        Intrinsics.checkNotNullParameter(juniorGraduationInteractor, "juniorGraduationInteractor");
        this.f254046a = juniorGraduationInteractor;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.f54722b.f51596l instanceof i;
    }

    @Override // i49.c
    public final Flow f(j49.i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return rd0.e.e(mo3.a.f(this.f254046a.m((2 & 1) != 0 ? h.f294642c : w4l.i.f294643c, false), new k(18), new x(this, 2), new k(19)), h0.f322473a, new c(3, null));
    }

    @Override // i49.c
    public final Object g(t tVar, Continuation continuation) {
        ActionWidgetDelegate.a aVar = tVar.f54721a;
        if (Intrinsics.f(aVar, ActionWidgetDelegate.a.c.f51609a) || Intrinsics.f(aVar, ActionWidgetDelegate.a.d.f51610a)) {
            return new j49.b(new JuniorGraduationFeatureConfig.MigrationAssetDetails.Destination(null));
        }
        if ((aVar instanceof com.revolut.core.ui_kit.delegates.h) || Intrinsics.f(aVar, ActionWidgetDelegate.a.C0395a.f51607a) || Intrinsics.f(aVar, ActionWidgetDelegate.a.b.f51608a)) {
            return j49.c.f171322a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
