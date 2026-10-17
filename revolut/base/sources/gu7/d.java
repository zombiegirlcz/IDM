package gu7;

import com.revolut.feature.insurance_embedded.impl.data.model.CfacPolicy;
import com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout;
import com.revolut.feature.insurance_embedded.impl.data.model.c;
import com.revolut.feature.insurance_embedded.impl.data.model.f0;
import com.revolut.feature.insurance_embedded.impl.data.model.j;
import com.revolut.feature.insurance_embedded.impl.data.model.k;
import com.revolut.feature.insurance_embedded.impl.data.model.s;
import com.revolut.feature.insurance_embedded.impl.data.model.v;
import gu7.u;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146727a;

    public /* synthetic */ d(int i) {
        this.f146727a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f146727a) {
            case 0:
                return com.revolut.feature.insurance_embedded.impl.data.model.c.INSTANCE.serializer();
            case 1:
                c.Companion companion = com.revolut.feature.insurance_embedded.impl.data.model.c.INSTANCE;
                kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_embedded.impl.data.model.CfacCoverageSelectionLayout.Coverage.Action", p0Var.b(com.revolut.feature.insurance_embedded.impl.data.model.c.class), new KClass[]{p0Var.b(com.revolut.feature.insurance_embedded.impl.data.model.e.class)}, new KSerializer[]{com.revolut.feature.insurance_embedded.impl.data.model.d.f75980a}, new Annotation[]{new bka.b(21)});
            case 2:
                CfacPolicy.Companion companion2 = CfacPolicy.INSTANCE;
                return qlm.j1.b("com.revolut.feature.insurance.models.InsuranceSubtype", dl7.a.values());
            case 3:
                j.Companion companion3 = com.revolut.feature.insurance_embedded.impl.data.model.j.INSTANCE;
                kotlin.jvm.internal.p0 p0Var2 = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_embedded.impl.data.model.ClaimsLayout", p0Var2.b(com.revolut.feature.insurance_embedded.impl.data.model.j.class), new KClass[]{p0Var2.b(com.revolut.feature.insurance_embedded.impl.data.model.h.class), p0Var2.b(com.revolut.feature.insurance_embedded.impl.data.model.i.class)}, new KSerializer[]{h.f146754a, j.f146767a}, new Annotation[]{new bka.b(22)});
            case 4:
                return new qlm.e(n.f146798a);
            case 5:
                return com.revolut.feature.insurance_embedded.impl.data.model.k.INSTANCE.serializer();
            case 6:
                k.Companion companion4 = com.revolut.feature.insurance_embedded.impl.data.model.k.INSTANCE;
                kotlin.jvm.internal.p0 p0Var3 = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_embedded.impl.data.model.ConditionsSection.Condition.Action", p0Var3.b(com.revolut.feature.insurance_embedded.impl.data.model.k.class), new KClass[]{p0Var3.b(com.revolut.feature.insurance_embedded.impl.data.model.l.class), p0Var3.b(com.revolut.feature.insurance_embedded.impl.data.model.n.class)}, new KSerializer[]{o.f146805a, com.revolut.feature.insurance_embedded.impl.data.model.m.f76015a}, new Annotation[]{new bka.b(23)});
            case 7:
                return new qlm.e(n0.f146799a);
            case 8:
                return u.INSTANCE.serializer();
            case 9:
                u.Companion companion5 = u.INSTANCE;
                kotlin.jvm.internal.p0 p0Var4 = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_embedded.impl.data.model.ContactsLayout.ClaimUrl", p0Var4.b(u.class), new KClass[]{p0Var4.b(x.class), p0Var4.b(a0.class)}, new KSerializer[]{v.f146844a, y.f146868a}, new Annotation[]{new bka.b(24)});
            case 10:
                return com.revolut.feature.insurance_embedded.impl.data.model.s.INSTANCE.serializer();
            case 11:
                s.Companion companion6 = com.revolut.feature.insurance_embedded.impl.data.model.s.INSTANCE;
                kotlin.jvm.internal.p0 p0Var5 = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_embedded.impl.data.model.ContactsLayout.ContactsLayoutFooterButtonAction", p0Var5.b(com.revolut.feature.insurance_embedded.impl.data.model.s.class), new KClass[]{p0Var5.b(com.revolut.feature.insurance_embedded.impl.data.model.r.class), p0Var5.b(com.revolut.feature.insurance_embedded.impl.data.model.t.class), p0Var5.b(com.revolut.feature.insurance_embedded.impl.data.model.u.class)}, new KSerializer[]{com.revolut.feature.insurance_embedded.impl.data.model.q.f76029a, i0.f146764a, k0.f146775a}, new Annotation[]{new bka.b(24)});
            case 12:
                return new qlm.e(p0.f146807a);
            case 13:
                return com.revolut.feature.insurance_embedded.impl.data.model.v.INSTANCE.serializer();
            case 14:
                v.Companion companion7 = com.revolut.feature.insurance_embedded.impl.data.model.v.INSTANCE;
                kotlin.jvm.internal.p0 p0Var6 = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_embedded.impl.data.model.ContactsSection.Contact.Action", p0Var6.b(com.revolut.feature.insurance_embedded.impl.data.model.v.class), new KClass[]{p0Var6.b(v.a.class), p0Var6.b(com.revolut.feature.insurance_embedded.impl.data.model.x.class), p0Var6.b(com.revolut.feature.insurance_embedded.impl.data.model.y.class), p0Var6.b(com.revolut.feature.insurance_embedded.impl.data.model.z.class), p0Var6.b(com.revolut.feature.insurance_embedded.impl.data.model.a0.class), p0Var6.b(com.revolut.feature.insurance_embedded.impl.data.model.b0.class), p0Var6.b(com.revolut.feature.insurance_embedded.impl.data.model.c0.class)}, new KSerializer[]{new qlm.d1("ASK_AI", v.a.INSTANCE, new Annotation[]{new bka.b(25)}), com.revolut.feature.insurance_embedded.impl.data.model.w.f76036a, r0.f146820a, t0.f146834a, v0.f146845a, x0.f146861a, z0.f146872a}, new Annotation[]{new bka.b(25)});
            case 15:
                return new qlm.d1("ASK_AI", v.a.INSTANCE, new Annotation[]{new bka.b(25)});
            case 16:
                return new qlm.e(qlm.v1.f247718a);
            case 17:
                return new qlm.e(n4.f146804a);
            case 18:
                CoverageDetailsLayout.Companion companion8 = CoverageDetailsLayout.INSTANCE;
                return new qlm.e(CoverageDetailsLayout.RestrictionsSection.a.f75936a);
            case 19:
                CoverageDetailsLayout.Exclusions.Companion companion9 = CoverageDetailsLayout.Exclusions.INSTANCE;
                return new qlm.e(qlm.v1.f247718a);
            case 20:
                CoverageDetailsLayout.FooterButton.Companion companion10 = CoverageDetailsLayout.FooterButton.INSTANCE;
                return CoverageDetailsLayout.FooterButton.Action.INSTANCE.serializer();
            case 21:
                CoverageDetailsLayout.FooterButton.Action.Companion companion11 = CoverageDetailsLayout.FooterButton.Action.INSTANCE;
                kotlin.jvm.internal.p0 p0Var7 = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout.FooterButton.Action", p0Var7.b(CoverageDetailsLayout.FooterButton.Action.class), new KClass[]{p0Var7.b(CoverageDetailsLayout.FooterButton.Action.Deeplink.class), p0Var7.b(CoverageDetailsLayout.FooterButton.Action.MakeCfacClaim.class), p0Var7.b(CoverageDetailsLayout.FooterButton.Action.MakeClaim.class), p0Var7.b(CoverageDetailsLayout.FooterButton.Action.Upgrade.class)}, new KSerializer[]{CoverageDetailsLayout.FooterButton.Action.Deeplink.a.f75921a, CoverageDetailsLayout.FooterButton.Action.MakeCfacClaim.a.f75923a, new qlm.d1("MAKE_CLAIM", CoverageDetailsLayout.FooterButton.Action.MakeClaim.INSTANCE, new Annotation[]{new com.revolut.feature.insurance_embedded.impl.data.model.e0()}), CoverageDetailsLayout.FooterButton.Action.Upgrade.a.f75927a}, new Annotation[]{new com.revolut.feature.insurance_embedded.impl.data.model.e0()});
            case 22:
                return new qlm.d1("MAKE_CLAIM", CoverageDetailsLayout.FooterButton.Action.MakeClaim.INSTANCE, new Annotation[]{new com.revolut.feature.insurance_embedded.impl.data.model.e0()});
            case 23:
                CoverageDetailsLayout.FooterButton.Action.Upgrade.Companion companion12 = CoverageDetailsLayout.FooterButton.Action.Upgrade.INSTANCE;
                return new qlm.e(qlm.v1.f247718a);
            case 24:
                CoverageDetailsLayout.RestrictionsSection.Companion companion13 = CoverageDetailsLayout.RestrictionsSection.INSTANCE;
                return new qlm.e(CoverageDetailsLayout.Restriction.a.f75932a);
            case 25:
                return new qlm.e(m1.f146793a);
            case 26:
                return com.revolut.feature.insurance_embedded.impl.data.model.f0.INSTANCE.serializer();
            case 27:
                f0.Companion companion14 = com.revolut.feature.insurance_embedded.impl.data.model.f0.INSTANCE;
                kotlin.jvm.internal.p0 p0Var8 = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_embedded.impl.data.model.CoveragesSection.Coverage.Action", p0Var8.b(com.revolut.feature.insurance_embedded.impl.data.model.f0.class), new KClass[]{p0Var8.b(com.revolut.feature.insurance_embedded.impl.data.model.g0.class), p0Var8.b(com.revolut.feature.insurance_embedded.impl.data.model.i0.class)}, new KSerializer[]{n1.f146800a, com.revolut.feature.insurance_embedded.impl.data.model.h0.f75994a}, new Annotation[]{new bka.b(26)});
            case 28:
                return new qlm.e(i2.f146765a);
            default:
                return w1.INSTANCE.serializer();
        }
    }
}
