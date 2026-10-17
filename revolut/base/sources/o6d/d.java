package o6d;

import aii.o;
import ami.n;
import android.app.Activity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultRegistry;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.revolut.core.ui_kit_resources.R$style;
import com.revolut.kompot.navigable.vc.ViewController;
import et6.r0;
import et6.t0;
import f60.t;
import f60.u;
import f60.v;
import f60.w;
import f60.x;
import f60.y;
import f60.z;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import o5k.i;
import rp0.m;
import t80.e;
import us6.x1;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f222546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f222547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f222548c;
    public final int d;

    public d(f fVar, c cVar, e eVar, int i) {
        this.f222546a = fVar;
        this.f222547b = cVar;
        this.f222548c = eVar;
        this.d = i;
    }

    @Override // phm.a
    public final Object get() {
        f fVar = this.f222546a;
        e eVar = this.f222548c;
        int i = this.d;
        switch (i) {
            case 0:
                n60.a aVar = (n60.a) eVar.e.get();
                i.l(aVar);
                return aVar;
            case 1:
                return i.q((com.revolut.kompot.navigable.a) eVar.d.get());
            case 2:
                return f0k.d.p((e60.a) eVar.f222556m.get());
            case 3:
                com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) eVar.d.get();
                g60.a aVarA = v.a((com.revolut.kompot.navigable.a) eVar.d.get());
                Activity activityA = t.a((com.revolut.kompot.navigable.a) eVar.d.get());
                t80.b bVarB = eVar.b();
                com.revolut.kompot.navigable.a aVar3 = (com.revolut.kompot.navigable.a) eVar.d.get();
                y.a(aVar3);
                d4m.a aVarA2 = e4m.b.a(eVar.f222552g);
                nli.a aVar4 = new nli.a((t80.c) eVar.f222553h.get(), t.a((com.revolut.kompot.navigable.a) eVar.d.get()));
                t80.b bVarB2 = eVar.b();
                l70.e eVar2 = eVar.f222550b.f222560a;
                zk0.b bVarL = eVar2.l();
                s.j(bVarL);
                oli.c cVar = new oli.c(bVarB2, bVarL, new nli.a((t80.c) eVar.f222553h.get(), t.a((com.revolut.kompot.navigable.a) eVar.d.get())), v.a((com.revolut.kompot.navigable.a) eVar.d.get()), eVar.j());
                ComponentActivity componentActivityA = u.a(t.a((com.revolut.kompot.navigable.a) eVar.d.get()));
                ActivityResultRegistry activityResultRegistryE = v1.c.e((com.revolut.kompot.navigable.a) eVar.d.get());
                n nVar = new n(e4m.b.a(eVar.i), 1);
                d4m.a aVarA3 = e4m.b.a(eVar.f222552g);
                t80.b bVarB3 = eVar.b();
                nli.a aVar5 = new nli.a((t80.c) eVar.f222553h.get(), t.a((com.revolut.kompot.navigable.a) eVar.d.get()));
                eVar2.getClass();
                return v1.c.q(aVar2, new t80.v(aVarA, activityA, bVarB, aVar3, aVarA2, aVar4, cVar, new oli.g(componentActivityA, activityResultRegistryE, nVar, aVarA3, bVarB3, aVar5, new i90.b(), eVar.c(), eVar.j()), eVar.j()), x.a(), (m) eVar.f222554j.get(), (e60.t) eVar.f222555l.get());
            case 4:
                com.revolut.kompot.navigable.a aVar6 = (com.revolut.kompot.navigable.a) eVar.d.get();
                y.a(aVar6);
                return pli.c.a(new ks0.n(aVar6));
            case 5:
                i6d.b mediaPickerConfigurationProvider = (i6d.b) ((x1) fVar.f222562c).d.get();
                s.j(mediaPickerConfigurationProvider);
                t6d.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mediaPickerConfigurationProvider, "mediaPickerConfigurationProvider");
                return new t80.c(new e.a("branding"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
            case 6:
                return t96.a.a();
            case 7:
                return z.a();
            case 8:
                o oVar = (o) eVar.k.get();
                y80.a aVarR = fVar.f222560a.r();
                s.j(aVarR);
                return new e60.y(oVar, aVarR, eVar.c(), Optional.empty());
            case 9:
                e60.t tVar = (e60.t) eVar.f222555l.get();
                w.a(tVar);
                return tVar;
            case 10:
                t0 t0Var = (t0) ((x1) fVar.f222562c).f282802c.get();
                s.j(t0Var);
                n60.a aVar7 = (n60.a) eVar.e.get();
                e60.a aVar8 = (e60.a) eVar.f222556m.get();
                mc4.h hVar = new mc4.h((c90.c) eVar.f222558p.get(), 1);
                f fVar2 = eVar.f222550b;
                l70.e eVar3 = fVar2.f222560a;
                c90.a aVarE = eVar3.e();
                s.j(aVarE);
                f80.a aVarX = eVar3.x();
                s.j(aVarX);
                ks0.n nVar2 = new ks0.n(aVarX);
                uh1.a aVar9 = (uh1.a) ((yh1.e) fVar2.f222561b).f.get();
                s.j(aVar9);
                s6d.w wVar = new s6d.w(hVar, aVarE, nVar2, aVar9);
                l6d.a aVar10 = (l6d.a) fVar.e.get();
                x80.a aVarQ = fVar.f222560a.q();
                s.j(aVarQ);
                r0 r0Var = (r0) ((x1) fVar.f222562c).e.get();
                s.j(r0Var);
                return new com.revolut.feature.shared.branding.impl.ui.settings.a(t0Var, aVar7, aVar8, wVar, aVar10, aVarQ, r0Var, new s6d.a(), eVar.f222549a, new mc4.h((c90.c) eVar.f222558p.get(), 1));
            case 11:
                ViewController screen = this.f222547b.f222544b;
                t6d.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen, "screen");
                return new c90.c(new ContextThemeWrapper(screen.m2(), R$style.UiKitColorsTheme_Day));
            default:
                throw new AssertionError(i);
        }
    }
}
