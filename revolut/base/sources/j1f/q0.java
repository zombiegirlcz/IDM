package j1f;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.CardExtraSecurityController;
import j3c.c;
import j3c.c0;
import j3c.d;
import j3c.h;
import j3c.m;
import j3c.n;
import j3c.p;
import j3c.q;
import j3c.r;
import j3c.s;
import j3c.u;
import j3c.v;
import j3c.w;
import j3c.x;
import j3c.z;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import qlm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170424a;

    public /* synthetic */ q0(int i) {
        this.f170424a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f170424a) {
            case 0:
                return new qlm.e(a1.f170365a);
            case 1:
                return new qlm.e(j20.b.f170638a);
            case 2:
                return new qlm.e(j20.e.f170641a);
            case 3:
                return new qlm.e(j29.f.f170751a);
            case 4:
                return new qlm.e(j29.a.f170737a);
            case 5:
                return new qlm.e(j29.a.f170737a);
            case 6:
                return new qlm.e(j29.x.f170773a);
            case 7:
                return new qlm.e(j29.u.f170769a);
            case 8:
                return new qlm.e(j29.a.f170737a);
            case 9:
                return new PromptContentDelegate();
            case 10:
                CardExtraSecurityController.a aVar = CardExtraSecurityController.Companion;
                return new RowDelegate(null, null, 7);
            case 11:
                c.b bVar = j3c.c.Companion;
                return new qlm.e(j3c.i.Companion.serializer());
            case 12:
                d.b bVar2 = j3c.d.Companion;
                kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.feature.revolut_shop.data.model.CheckoutRequestDto", p0Var.b(j3c.d.class), new KClass[]{p0Var.b(d.a.class), p0Var.b(d.C0971d.class)}, new KSerializer[]{d.a.C0970a.f171040a, d.C0971d.a.f171046a}, new Annotation[0]);
            case 13:
                h.Companion companion = j3c.h.INSTANCE;
                v1 v1Var = v1.f247718a;
                return new qlm.h0(v1Var, v1Var, 1);
            case 14:
                h.Companion companion2 = j3c.h.INSTANCE;
                v1 v1Var2 = v1.f247718a;
                return new qlm.h0(v1Var2, v1Var2, 1);
            case 15:
                m.b bVar3 = j3c.m.Companion;
                return new qlm.e(n.a.f171092a);
            case 16:
                m.b bVar4 = j3c.m.Companion;
                return new qlm.e(p.a.f171101a);
            case 17:
                p.b bVar5 = j3c.p.Companion;
                return new qlm.e(q.a.f171105a);
            case 18:
                r.b bVar6 = j3c.r.Companion;
                return new qlm.e(u.a.f171147a);
            case 19:
                r.b bVar7 = j3c.r.Companion;
                return new qlm.e(v1.f247718a);
            case 20:
                s.c.b bVar8 = s.c.Companion;
                return new qlm.e(s.c.C0972c.a.f171123a);
            case 21:
                s.d.b bVar9 = s.d.Companion;
                return new qlm.e(s.d.c.a.f171131a);
            case 22:
                s.d.c.b bVar10 = s.d.c.Companion;
                return new qlm.e(v1.f247718a);
            case 23:
                s.e.b bVar11 = s.e.Companion;
                return new qlm.h0(v1.f247718a, s.f.a.f171138a, 1);
            case 24:
                return new Regex("([0-9A-Z]+[a-z]*|^[a-z]+)");
            case 25:
                u.b bVar12 = j3c.u.Companion;
                return new qlm.e(v1.f247718a);
            case 26:
                u.b bVar13 = j3c.u.Companion;
                return new qlm.e(c0.a.f171035a);
            case 27:
                v.b bVar14 = j3c.v.Companion;
                return new qlm.e(w.a.f171155a);
            case 28:
                x.b bVar15 = j3c.x.Companion;
                return new qlm.e(z.a.f171174a);
            default:
                x.b bVar16 = j3c.x.Companion;
                return new qlm.e(v.a.f171151a);
        }
    }
}
