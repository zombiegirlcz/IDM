package ux7;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.insurance_pet.impl.ui.add.step.detail.PetBaseDetailsFragment;
import com.revolut.feature.selfserve.sot.impl.ui.evidencelist.EvidenceListFragment;
import com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreen;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.j1;
import uz8.b;
import uz8.i;
import uz8.p;
import uz8.r;
import uz8.u;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f283896a;

    public /* synthetic */ g(int i) {
        this.f283896a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f283896a) {
            case 0:
                int i = PetBaseDetailsFragment.j0;
                return new InputChecklistDelegate();
            case 1:
                EvidenceListFragment.Companion companion = EvidenceListFragment.INSTANCE;
                return new RowDelegate(null, null, 7);
            case 2:
                KProperty[] kPropertyArr = CryptoExchangeScreen.X;
                return new CellDetailsActionDelegate();
            case 3:
                KProperty[] kPropertyArr2 = CryptoExchangeScreen.X;
                return new CellDetailsDelegate();
            case 4:
                return new ihm.f();
            case 5:
                return new ihm.f();
            case 6:
                return new ihm.f();
            case 7:
                return new ihm.f();
            case 8:
                return new v60.i();
            case 9:
                return new ihm.f();
            case 10:
                return new ihm.f();
            case 11:
                return new ihm.f();
            case 12:
                return new ihm.f();
            case 13:
                return new ihm.f();
            case 14:
                return new ihm.f();
            case 15:
                return qz0.h.a();
            case 16:
                b.C1572b c1572b = uz8.b.Companion;
                return new qlm.e(vz8.a.f293409a);
            case 17:
                b.C1572b c1572b2 = uz8.b.Companion;
                return pz8.b.Companion.serializer();
            case 18:
                b.C1572b c1572b3 = uz8.b.Companion;
                return new qlm.e(uz8.k.Companion.serializer());
            case 19:
                b.C1572b c1572b4 = uz8.b.Companion;
                return zz8.c.INSTANCE.serializer();
            case 20:
                b.C1572b c1572b5 = uz8.b.Companion;
                return r.Companion.serializer();
            case 21:
                return j1.a("com.revolut.feature.learn.shared.impl.data.network.dto.lesson.BookingStatus", uz8.d.values(), new String[]{"SUCCESS", "FAILED_WARNING", "FAILED_BLOCKING"}, new Annotation[][]{null, null, null});
            case 22:
                return uz8.d.Companion.serializer();
            case 23:
                i.a aVar = uz8.i.Companion;
                p0 p0Var = o0.f186429a;
                KClass kClassB = p0Var.b(uz8.i.class);
                KClass[] kClassArr = {p0Var.b(uz8.b.class), p0Var.b(u.class)};
                KSerializer[] kSerializerArr = {b.a.f284633a, u.a.f284654a};
                Intrinsics.checkNotNullParameter("type", "discriminator");
                return new mlm.f("com.revolut.feature.learn.shared.impl.data.network.dto.lesson.LessonDto", kClassB, kClassArr, kSerializerArr, new Annotation[]{new uz8.h()});
            case 24:
                return j1.a("com.revolut.feature.learn.shared.impl.data.network.dto.lesson.LessonPrecondition", uz8.k.values(), new String[]{"US_LOCATION_POPUP"}, new Annotation[][]{null});
            case 25:
                return p.Companion.serializer();
            case 26:
                return j1.a("com.revolut.feature.learn.shared.impl.data.network.dto.lesson.LessonProgressState", p.values(), new String[]{"NOT_STARTED", "CONTENT_STARTED", "CONTENT_FINISHED", "QUIZ_STARTED", "COMPLETED", "LOCKED"}, new Annotation[][]{null, null, null, null, null, null});
            case 27:
                return j1.a("com.revolut.feature.learn.shared.impl.data.network.dto.lesson.LessonRewardStatus", r.values(), new String[]{"UNINITIALIZED", "PAYABLE", "PAYMENT_PENDING", "PAID", "INCENTIVE_ENDED"}, new Annotation[][]{null, null, null, null, null});
            case 28:
                u.b bVar = u.Companion;
                return new qlm.e(vz8.a.f293409a);
            default:
                u.b bVar2 = u.Companion;
                return pz8.b.Companion.serializer();
        }
    }
}
