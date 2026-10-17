package ds7;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.feature.credit.card.impl.ui.instalment.term.InstalmentTermScreen;
import ds7.b;
import ds7.d;
import du7.d2;
import du7.e;
import du7.h1;
import du7.i0;
import du7.j1;
import du7.l1;
import du7.m;
import du7.m0;
import du7.m1;
import du7.n0;
import du7.w;
import du7.w0;
import du7.x;
import du7.z0;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.d1;
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117258a;

    public /* synthetic */ a(int i) {
        this.f117258a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f117258a) {
            case 0:
                b.Companion companion = b.INSTANCE;
                return new qlm.e(c.f117262a);
            case 1:
                return d.INSTANCE.serializer();
            case 2:
                d.Companion companion2 = d.INSTANCE;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_credit.impl.data.dto.conditions.ConditionsSectionDto.ConditionDto.ActionDto", p0Var.b(d.class), new KClass[]{p0Var.b(d.b.class), p0Var.b(d.c.class)}, new KSerializer[]{d.b.a.f117266a, new d1("UNKNOWN", d.c.INSTANCE, new Annotation[]{new e()})}, new Annotation[]{new e()});
            case 3:
                return new d1("UNKNOWN", d.c.INSTANCE, new Annotation[]{new e()});
            case 4:
                KProperty[] kPropertyArr = InstalmentTermScreen.W;
                return new CellDetailsDelegate();
            case 5:
                KProperty[] kPropertyArr2 = InstalmentTermScreen.W;
                return new RowDelegate(null, null, 7);
            case 6:
                KProperty[] kPropertyArr3 = InstalmentTermScreen.W;
                return new FullScreenStateDelegate();
            case 7:
                KProperty[] kPropertyArr4 = InstalmentTermScreen.W;
                return new SuggestionsBarDelegate();
            case 8:
                KProperty[] kPropertyArr5 = InstalmentTermScreen.W;
                return new LargeActionButtonDelegate();
            case 9:
                return new qlm.e(v1.f247718a);
            case 10:
                return new qlm.e(v1.f247718a);
            case 11:
                return new d1("com.revolut.feature.insurance_embedded.impl.data.dto.BottomSheetDto.ActionDto.Dismiss", e.c.INSTANCE, new Annotation[0]);
            case 12:
                return new d1("com.revolut.feature.insurance_embedded.impl.data.dto.BottomSheetDto.ActionDto.Unknown", e.f.INSTANCE, new Annotation[0]);
            case 13:
                e.g.Companion companion3 = e.g.INSTANCE;
                return new qlm.e(v1.f247718a);
            case 14:
                return new qlm.e(m.f117755a);
            case 15:
                return new qlm.e(w.f117883a);
            case 16:
                return new d1("com.revolut.feature.insurance_embedded.impl.data.dto.CfacCoverageSelectionLayoutDto.CoverageDto.ActionDto.Unknown", x.c.INSTANCE, new Annotation[0]);
            case 17:
                return new d1("com.revolut.feature.insurance_embedded.impl.data.dto.ClaimsLayoutDto.Unknown", i0.d.INSTANCE, new Annotation[0]);
            case 18:
                return new qlm.e(m0.f117756a);
            case 19:
                return new d1("com.revolut.feature.insurance_embedded.impl.data.dto.ConditionsSectionDto.ConditionDto.ActionDto.Unknown", n0.d.INSTANCE, new Annotation[0]);
            case 20:
                return new qlm.e(v1.f247718a);
            case 21:
                return new d1("com.revolut.feature.insurance_embedded.impl.data.dto.ContactsLayoutDto.ClaimUrlDto.Unknown", w0.d.INSTANCE, new Annotation[0]);
            case 22:
                return new d1("com.revolut.feature.insurance_embedded.impl.data.dto.ContactsLayoutDto.ContactsLayoutFooterButtonActionDto.Unknown", z0.e.INSTANCE, new Annotation[0]);
            case 23:
                h1.Companion companion4 = h1.INSTANCE;
                return new qlm.e(j1.f117724a);
            case 24:
                return new qlm.e(l1.f117741a);
            case 25:
                return new d1("com.revolut.feature.insurance_embedded.impl.data.dto.ContactsSectionDto.ContactDto.ActionDto.AskAi", m1.a.INSTANCE, new Annotation[0]);
            case 26:
                m1.b.Companion companion5 = m1.b.INSTANCE;
                return new qlm.e(v1.f247718a);
            case 27:
                return new d1("com.revolut.feature.insurance_embedded.impl.data.dto.ContactsSectionDto.ContactDto.ActionDto.Unknown", m1.i.INSTANCE, new Annotation[0]);
            case 28:
                return new qlm.e(v1.f247718a);
            default:
                return new d1("com.revolut.feature.insurance_embedded.impl.data.dto.CoverageDetailsLayoutDto.FooterButtonDto.ActionDto.MakeClaim", d2.d.INSTANCE, new Annotation[0]);
        }
    }
}
