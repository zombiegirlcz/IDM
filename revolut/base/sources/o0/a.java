package o0;

import android.view.View;
import androidx.camera.extensions.VendorExtenderFactory;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.audio.AudioOutput;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import bk4.e;
import com.revolut.core.ui_kit.background.StatefulAnimatedBackground;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.datepicker.ChallengeEditFrequencyDatePickerScreen;
import com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreen;
import cu3.d;
import eu3.c;
import iha.g;
import java.util.List;
import java.util.Map;
import kfm.o;
import kfm.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import o55.e0;
import o55.n;
import o5i.b;
import om4.t1;
import p24.h;
import p24.i;
import p24.j;
import p24.k;
import p24.l;
import p24.m;
import pfk.n0;
import pfk.w;
import q09.f;
import q09.q;
import q09.r;
import q09.t;
import q09.u;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements VendorExtenderFactory, ListenerSet.Event, o, p, OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221097a;

    public /* synthetic */ a() {
        this.f221097a = 22;
        n0 n0Var = n0.f;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f221097a) {
            case 6:
                o55.o oVar = o55.o.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) oVar.invoke(p0);
            case 7:
                n nVar = n.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (LoanDetails) nVar.invoke(p0);
            case 8:
                e0 e0Var = e0.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Map) e0Var.invoke(p0);
            case 9:
                b bVar = b.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wi0.b) bVar.invoke(p0);
            case 10:
                t1 t1Var = t1.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wi0.b) t1Var.invoke(p0);
            case 11:
                k kVar = k.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (su3.a) kVar.invoke(p0);
            case 12:
                m mVar = m.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (e) mVar.invoke(p0);
            case 13:
                l lVar = l.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (d) lVar.invoke(p0);
            case 14:
                j jVar = j.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (au3.d) jVar.invoke(p0);
            case 15:
                h hVar = h.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (c) hVar.invoke(p0);
            case 16:
                i iVar = i.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (bv3.b) iVar.invoke(p0);
            case 17:
            case 24:
            default:
                q09.e eVar = q09.e.f;
                KProperty[] kPropertyArr = LessonScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q) eVar.invoke(p0);
            case 18:
                pc0.a aVar = pc0.a.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) aVar.invoke(p0);
            case 19:
                pc0.c cVar = pc0.c.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) cVar.invoke(p0);
            case 20:
                pc0.d dVar = pc0.d.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wl2.e) dVar.invoke(p0);
            case 21:
                w wVar = w.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (g) wVar.invoke(p0);
            case 22:
                n0 n0Var = n0.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) n0Var.invoke(p0);
            case 23:
                plh.l lVar2 = plh.l.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (of1.e) lVar2.invoke(p0);
            case 25:
                pp8.c cVar2 = pp8.c.f;
                int i = ChallengeEditFrequencyDatePickerScreen.W;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (pp8.e) cVar2.invoke(p0);
            case 26:
                q09.i iVar2 = q09.i.f;
                KProperty[] kPropertyArr2 = LessonScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (u) iVar2.invoke(p0);
            case 27:
                f fVar = f.f;
                KProperty[] kPropertyArr3 = LessonScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (t) fVar.invoke(p0);
            case 28:
                q09.d dVar2 = q09.d.f;
                KProperty[] kPropertyArr4 = LessonScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (r) dVar2.invoke(p0);
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj2) {
        switch (this.f221097a) {
            case 1:
                ((AudioOutput.Listener) obj2).onUnderrun();
                break;
            case 2:
                ((AudioOutput.Listener) obj2).onReleased();
                break;
            case 3:
                ((AudioOutput.Listener) obj2).onOffloadDataRequest();
                break;
            case 4:
                ((AudioOutput.Listener) obj2).onOffloadPresentationEnded();
                break;
            default:
                ((o4.g) ((AudioOutputProvider.Listener) obj2)).f221903a.lambda$maybeAddAudioOutputProviderListener$0();
                break;
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        int i = StatefulAnimatedBackground.d;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        view.setTranslationY(-insets.getInsets(WindowInsetsCompat.Type.ime()).bottom);
        return insets;
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        p4i.q qVar = p4i.q.f;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) qVar.invoke(p0)).booleanValue();
    }

    public /* synthetic */ a(int i) {
        this.f221097a = i;
    }
}
