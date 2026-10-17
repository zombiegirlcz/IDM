package yfe;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreen;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import hg6.b;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import sg6.a;
import yh6.b;
import yh6.c;
import yh6.d;
import yh6.i;
import yh6.k;
import yh6.m;
import yh6.o;
import yh6.p;
import yh6.t;
import yh6.x;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f313244a;

    public /* synthetic */ b2(int i) {
        this.f313244a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f313244a) {
            case 0:
                return ExtendedSubaccountType.INSTANCE.serializer();
            case 1:
                return new qlm.d1("savings", p2.INSTANCE, new Annotation[0]);
            case 2:
                return new qlm.d1("cfd", q2.INSTANCE, new Annotation[0]);
            case 3:
                return new qlm.d1("commodities", r2.INSTANCE, new Annotation[0]);
            case 4:
                return new qlm.d1("gia", t2.INSTANCE, new Annotation[0]);
            case 5:
                return new qlm.d1("isa", u2.INSTANCE, new Annotation[0]);
            case 6:
                return new qlm.d1("jisa", v2.INSTANCE, new Annotation[0]);
            case 7:
                return new qlm.d1("joint_gia", w2.INSTANCE, new Annotation[0]);
            case 8:
                return new qlm.d1("pea", x2.INSTANCE, new Annotation[0]);
            case 9:
                return new qlm.d1("robo", y2.INSTANCE, new Annotation[0]);
            case 10:
                return new qlm.d1("strategies", z2.INSTANCE, new Annotation[0]);
            case 11:
                return new qlm.e(zg3.b.Companion.serializer());
            case 12:
                KProperty[] kPropertyArr = SubformScreen.V;
                return new RowDelegate(null, null, 7);
            case 13:
                KProperty[] kPropertyArr2 = SubformScreen.V;
                return new ListSubheaderDelegate();
            case 14:
                KProperty[] kPropertyArr3 = SubformScreen.V;
                return new InputChecklistDelegate();
            case 15:
                return new qlm.e(ygc.g.f313606a);
            case 16:
                return new qlm.e(ygc.n.f313626a);
            case 17:
                return new qlm.e(ygc.g.f313606a);
            case 18:
                return new qlm.e(ygc.t.f313631a);
            case 19:
                return new qlm.e(ygc.e0.f313602a);
            case 20:
                b.C1748b c1748b = yh6.b.Companion;
                return new qlm.e(b.a.f152113a);
            case 21:
                d.b bVar = yh6.d.Companion;
                return new qlm.e(c.a.f313790a);
            case 22:
                d.b bVar2 = yh6.d.Companion;
                return new qlm.e(c.a.f313790a);
            case 23:
                i.Companion companion = yh6.i.INSTANCE;
                return new qlm.e(qlm.v1.f247718a);
            case 24:
                k.b bVar3 = yh6.k.Companion;
                return yh6.j.Companion.serializer();
            case 25:
                m.b bVar4 = yh6.m.Companion;
                return new qlm.e(b.a.f152113a);
            case 26:
                p.b bVar5 = yh6.p.Companion;
                return new qlm.e(o.a.f313831a);
            case 27:
                p.b bVar6 = yh6.p.Companion;
                return new qlm.e(o.a.f313831a);
            case 28:
                t.b bVar7 = yh6.t.Companion;
                return new qlm.e(a.C1459a.f262598a);
            default:
                x.Companion bVar8 = yh6.x.INSTANCE;
                qlm.v1 v1Var = qlm.v1.f247718a;
                return new qlm.h0(v1Var, v1Var, 1);
        }
    }
}
