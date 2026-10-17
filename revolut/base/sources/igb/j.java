package igb;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_profile.api.models.f;
import ij8.d;
import il9.c;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import lr7.a;
import qlm.d1;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161139a;

    public /* synthetic */ j(int i) {
        this.f161139a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f161139a) {
            case 0:
                return new qlm.e(v1.f247718a);
            case 1:
                return new qlm.e(l.f161141a);
            case 2:
                return new d1("com.revolut.feature.retail.salary_account.impl.salary_hub.data.dto.SalaryHubResponseDto.NotAvailable", i0.INSTANCE, new Annotation[0]);
            case 3:
                return j1.a("com.revolut.feature.cms.stories.impl.data.network.model.CmsStoryCtaPlacementDto", ij3.k.values(), new String[]{"NONE", "ALL_SCREENS", "END_SCREEN"}, new Annotation[][]{null, null, null});
            case 4:
                return ij3.p.Companion.serializer();
            case 5:
                return ij3.k.Companion.serializer();
            case 6:
                return new qlm.e(ij3.g.f161679a);
            case 7:
                return new qlm.e(ij3.q.f161688a);
            case 8:
                return j1.a("com.revolut.feature.cms.stories.impl.data.network.model.CmsStoryLayoutDto", ij3.p.values(), new String[]{"MARKETING", "FINCRIME"}, new Annotation[][]{null, null});
            case 9:
                JuniorBankingProfile.Companion bVar = JuniorBankingProfile.INSTANCE;
                return j1.b("com.revolut.core.model.gender.Gender", bj0.b.values());
            case 10:
                JuniorBankingProfile.Companion bVar2 = JuniorBankingProfile.INSTANCE;
                return j1.b("com.revolut.feature.junior_profile.api.models.JuniorProfileState", ij8.h.values());
            case 11:
                d.b bVar3 = ij8.d.Companion;
                return j1.b("com.revolut.core.model.gender.Gender", bj0.b.values());
            case 12:
                return j1.b("com.revolut.core.model.gender.Gender", bj0.b.values());
            case 13:
                return new qlm.e(com.revolut.feature.junior_profile.api.models.f.Companion.serializer());
            case 14:
                f.a aVar = com.revolut.feature.junior_profile.api.models.f.Companion;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.junior_profile.api.models.OfferedService", p0Var.b(com.revolut.feature.junior_profile.api.models.f.class), new KClass[]{p0Var.b(com.revolut.feature.junior_profile.api.models.e.class), p0Var.b(com.revolut.feature.junior_profile.api.models.h.class)}, new KSerializer[]{com.revolut.feature.junior_profile.api.models.d.f77120a, com.revolut.feature.junior_profile.api.models.g.f77126a}, new Annotation[]{new hi9.g(3)});
            case 15:
                return j1.b("com.revolut.feature.junior_profile.api.models.JuniorProfileState", ij8.h.values());
            case 16:
                return j1.b("com.revolut.feature.junior_profile.api.models.JuniorProfileState", ij8.h.values());
            case 17:
                ne0.n.Companion.getClass();
                return ne0.l.a(1, 5L);
            case 18:
                return new qlm.e(il7.j.f162112a);
            case 19:
                return new qlm.e(il7.g.f162104a);
            case 20:
                return new qlm.e(v1.f247718a);
            case 21:
                return new qlm.e(v1.f247718a);
            case 22:
                return new qlm.e(a.C1131a.f199428a);
            case 23:
                return new qlm.e(il7.m.f162117a);
            case 24:
                return new qlm.e(il7.a.f162089a);
            case 25:
                c.a aVar2 = il9.c.Companion;
                p0 p0Var2 = o0.f186429a;
                return new mlm.f("com.revolut.feature.pay_with_photo.impl.models.PayWithPhotoResultItem", p0Var2.b(il9.c.class), new KClass[]{p0Var2.b(il9.f.class), p0Var2.b(il9.i.class)}, new KSerializer[]{il9.d.f162180a, il9.g.f162183a}, new Annotation[0]);
            case 26:
                return j1.b("com.revolut.feature.pay_with_photo.impl.models.PayWithPhotoResultItem.BeneficiaryType", il9.b.values());
            case 27:
                v1 v1Var = v1.f247718a;
                return new qlm.h0(v1Var, v1Var, 1);
            case 28:
                v1 v1Var2 = v1.f247718a;
                return new qlm.h0(v1Var2, v1Var2, 1);
            default:
                return il9.b.Companion.serializer();
        }
    }
}
