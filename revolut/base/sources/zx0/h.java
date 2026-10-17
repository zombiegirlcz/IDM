package zx0;

import android.view.animation.AccelerateDecelerateInterpolator;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.feature.selfserve.sot.impl.ui.home.SotHomeFragment;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.filters.AirportLoungesPassActivityFiltersScreen;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.d1;
import zz8.a;
import zz8.c;
import zz8.e;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325996a;

    public /* synthetic */ h(int i) {
        this.f325996a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f325996a) {
            case 0:
                ReactionsKeyboardView.Companion companion = ReactionsKeyboardView.INSTANCE;
                return new AccelerateDecelerateInterpolator();
            case 1:
                ReactionsKeyboardView.Companion companion2 = ReactionsKeyboardView.INSTANCE;
                return new lu0.i();
            case 2:
                KProperty[] kPropertyArr = AirportLoungesPassActivityFiltersScreen.R;
                return new InputChecklistDelegate();
            case 3:
                SotHomeFragment.Companion companion3 = SotHomeFragment.INSTANCE;
                return new RowDelegate(null, null, 7);
            case 4:
                c.Companion companion4 = zz8.c.INSTANCE;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.learn.shared.impl.data.network.dto.reward.RewardDto", p0Var.b(zz8.c.class), new KClass[]{p0Var.b(zz8.a.class), p0Var.b(zz8.d.class), p0Var.b(zz8.e.class)}, new KSerializer[]{a.C1809a.f326589a, new d1("NO_REWARD", zz8.d.INSTANCE, new Annotation[]{new zz8.b()}), e.a.f326593a}, new Annotation[]{new zz8.b()});
            default:
                return new d1("NO_REWARD", zz8.d.INSTANCE, new Annotation[]{new zz8.b()});
        }
    }
}
