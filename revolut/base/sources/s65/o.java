package s65;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.register.EnrollmentRegistrationScreen;
import com.revolut.feature.shared.branding.impl.ui.settings.BrandingSettingsScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import com.youTransactor.uCube.payment.PaymentService;
import defpackage.e1;
import efm.h0;
import efm.u;
import efm.w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import sa1.v;
import tfm.z0;
import zp0.x;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class o implements kfm.o, x, kfm.p, kfm.g, u, kfm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f260147b;

    public /* synthetic */ o(Object obj2, int i) {
        this.f260146a = i;
        this.f260147b = obj2;
    }

    @Override // efm.u
    public void a(z0 emitter) {
        v vVar = (v) this.f260147b;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        ea1.b.a("Payment cancellation is in progress...", fa1.k.INFO);
        ihm.f fVar = vVar.f261259b;
        if (fVar != null) {
            fVar.onNext(Boolean.TRUE);
        }
        PaymentService paymentService = vVar.f261258a;
        if (paymentService != null) {
            paymentService.cancel(new e1(vVar, emitter, 3));
        }
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f260146a) {
            case 22:
                ((kpi.b) this.f260147b).invoke(obj2);
                break;
            case 23:
                ((sa1.f) this.f260147b).invoke(obj2);
                break;
            default:
                ((sa1.f) this.f260147b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f260146a;
        Object obj2 = this.f260147b;
        switch (i) {
            case 0:
                return (Data) ((s4b.e) obj2).invoke(p0);
            case 1:
                BrandingSettingsScreen.Companion aVar = BrandingSettingsScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (koi.j) ((r) obj2).invoke(p0);
            case 2:
                BrandingSettingsScreen.Companion aVar2 = BrandingSettingsScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ActionsView.Item) ((r) obj2).invoke(p0);
            case 3:
            case 6:
            case 21:
            case 22:
            case 23:
            case 24:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((s8h.h) obj2).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((s6e.e) obj2).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((ro7.n) obj2).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (dj0.d) ((s06.e) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i6e.b) ((s6e.f) obj2).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((s6e.g) obj2).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((s6e.g) obj2).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((s6e.g) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((s8h.g) obj2).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((s8h.i) obj2).invoke(p0);
                return Boolean.TRUE;
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((s8h.g) obj2).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((s8h.i) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((pud.b) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((pud.b) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((s78.d) obj2).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((s78.d) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((pud.b) obj2).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((s8h.h) obj2).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (fa1.l) ((s8h.h) obj2).invoke(p0);
        }
    }

    @Override // zp0.x
    public void e(String listId, String input, String formattedValue, boolean z) {
        int i = this.f260146a;
        int i2 = 12;
        Object obj2 = this.f260147b;
        switch (i) {
            case 3:
                BrandingSettingsScreen.Companion aVar = BrandingSettingsScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(listId, "<unused var>");
                Intrinsics.checkNotNullParameter(input, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "<unused var>");
                com.revolut.feature.shared.branding.impl.ui.settings.a aVar2 = (com.revolut.feature.shared.branding.impl.ui.settings.a) ((BrandingSettingsScreen) obj2).R2();
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                aVar2.H2(aVar2.f86085y, new rvc.k(input, i2));
                break;
            default:
                KProperty[] kPropertyArr = EnrollmentRegistrationScreen.S;
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(input, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                s92.k kVar = (s92.k) ((EnrollmentRegistrationScreen) obj2).R2();
                kVar.getClass();
                Intrinsics.checkNotNullParameter(input, "text");
                kVar.H2(kVar.f261098p, new a31.i(input, kVar.f261099q.f(input), i2));
                break;
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        r rVar = (r) this.f260147b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) rVar.invoke(p0)).booleanValue();
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        k5e.h hVar = (k5e.h) this.f260147b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (Data) hVar.invoke(p0, p17);
    }
}
