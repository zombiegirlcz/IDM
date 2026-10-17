package rzc;

import a3e.s;
import aii.e0;
import aii.u;
import android.net.Uri;
import ao.h;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.feature.stories.models.StoryAction;
import com.revolut.feature.stories.models.StoryLink;
import com.revolut.feature.stories.models.StoryPage;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.StackDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.BrowserCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import fc7.d;
import fva.e;
import java.time.Instant;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import lk0.g;
import rp0.y;
import s08.p;
import s28.j;
import s2g.w;
import s3d.k;
import s8h.m;
import sa6.i;
import sce.f;
import te0.r;
import uh7.l;
import v3e.d0;
import vkm.j2;
import wim.z;
import z9h.n;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f258586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f258587c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f258585a = i;
        this.f258586b = obj2;
        this.f258587c = obj3;
    }

    @Override // kfm.a
    public final void run() {
        Object value;
        StoryLink d;
        StoryAction storyAction;
        switch (this.f258585a) {
            case 0:
                ((c) this.f258586b).f258590c.onNext((String) this.f258587c);
                return;
            case 1:
                ((opi.b) ((p) this.f258586b).o).Z((y) this.f258587c);
                return;
            case 2:
                ((j) this.f258586b).f259271c.a((StackDestination) this.f258587c);
                return;
            case 3:
                ((w) this.f258586b).x2(new s((g) this.f258587c, 14));
                return;
            case 4:
                ((k) this.f258586b).f259654c.a((u) this.f258587c);
                return;
            case 5:
                ((m) this.f258586b).f261023c.c((NaviCommand) this.f258587c);
                return;
            case 6:
                ((i) this.f258586b).f261324b.onNext((g) this.f258587c);
                return;
            case 7:
                ((sc7.j) this.f258586b).i.b(new d(new e0(((KompotBridgeFeatureConfig) this.f258587c).f98274b, com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE), false, 4)));
                return;
            case 8:
                ((sce.g) ((f) this.f258586b).e).d.set((e) this.f258587c);
                return;
            case 9:
                ((sdg.a) this.f258586b).f261873b.onNext((g) this.f258587c);
                return;
            case 10:
                sl3.k kVar = (sl3.k) this.f258586b;
                List points = (List) this.f258587c;
                h hVar = kVar.f264113a;
                Intrinsics.checkNotNullParameter(points, "points");
                long jD = jli.b.d();
                ((ml3.a) hVar.f7847b).m(jD, points);
                ne0.j jVar = (ne0.j) hVar.f7848c;
                for (ml3.i iVar : jVar.getAll()) {
                    if (points.contains(iVar.f206594b) || points.contains(iVar.f)) {
                        jVar.f(iVar.f206594b, ml3.i.a(iVar, iVar.f206600m + 1, jD));
                    }
                }
                return;
            case 11:
                ((sl3.u) this.f258586b).d.G(Long.valueOf(((Instant) this.f258587c).toEpochMilli()), "remote_contacts_sync_time", z.d(o0.b(Long.TYPE)));
                return;
            case 12:
                sp5.c cVar = (sp5.c) this.f258586b;
                qp5.b bVar = (qp5.b) this.f258587c;
                j2 j2Var = cVar.f264882g.f308115a;
                do {
                    value = j2Var.getValue();
                } while (!j2Var.h(value, null));
                cVar.f264881c.c0(new ym.b(bVar, false));
                return;
            case 13:
                ((sp5.j) this.f258586b).f264896h.c0(new ym.b((qp5.d) this.f258587c, false));
                return;
            case 14:
                ((k39.b) this.f258586b).b((NaviCommand) this.f258587c);
                return;
            case 15:
                t33.w wVar = (t33.w) this.f258586b;
                SuggestionsBarDelegate.Suggestion suggestion = (SuggestionsBarDelegate.Suggestion) this.f258587c;
                t33.d dVar = wVar.i;
                Object obj2 = suggestion.f53496h;
                Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.String");
                String name = (String) obj2;
                t33.m mVar = (t33.m) dVar;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                t33.y yVar = (t33.y) mVar.f267618a;
                yVar.f.getValue(yVar, t33.y.f267639l[4]).set(name);
                return;
            case 16:
                ((th6.w) this.f258586b).e.h((String) this.f258587c);
                return;
            case 17:
                ((ts5.p) this.f258586b).f273986a.b(new dt5.d((u) this.f258587c));
                return;
            case 18:
                ((ts5.p) this.f258586b).f273986a.b(new dt5.c((BridgeDestination) this.f258587c));
                return;
            case 19:
                o0j.p pVar = (o0j.p) this.f258586b;
                ((twj.f) this.f258587c).f275039c.G(new rwj.d(pVar.f221246a, pVar.f221247b, pVar.f221248c), "user_phone_data", z.d(o0.b(rwj.d.class)));
                return;
            case 20:
                n.l(String.class, ((twj.f) this.f258586b).f275039c, "device_fingerprint", (String) this.f258587c);
                return;
            case 21:
                c70.a.b(((u08.a) this.f258586b).f276092a, null, (String) this.f258587c, false, 5);
                return;
            case 22:
                ((u21.k) this.f258586b).f276539h.onNext((t61.b) this.f258587c);
                return;
            case 23:
                ((k39.b) this.f258586b).b((NaviCommand) this.f258587c);
                return;
            case 24:
                ((uc7.c) this.f258586b).Z2((StatusViewConfiguration) this.f258587c);
                return;
            case 25:
                ((ueg.e) this.f258586b).f279383c.onNext((g) this.f258587c);
                return;
            case 26:
                l lVar = (l) this.f258586b;
                String collectionKey = (String) this.f258587c;
                b7h.a aVar = lVar.f280121b;
                nh7.d widget = lVar.f280122c;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(widget, "widget");
                Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
                ne0.j jVar2 = aVar.f13040a;
                r rVar = (r) jVar2.get(widget.name());
                if (rVar != null) {
                    rVar.set(collectionKey);
                    return;
                } else {
                    jVar2.f(widget.name(), new r(collectionKey));
                    return;
                }
            case 27:
                ((uif.g) this.f258586b).b(((uif.a) this.f258587c).a());
                return;
            case 28:
                ((d0) this.f258586b).R((NaviCommand) this.f258587c);
                return;
            default:
                qv0.p pVar2 = (qv0.p) this.f258586b;
                d0 d0Var = (d0) this.f258587c;
                Object f53623w = pVar2.getD();
                StoryPage storyPage = f53623w instanceof StoryPage ? (StoryPage) f53623w : null;
                if (storyPage == null || (d = storyPage.getD()) == null || (storyAction = d.f88795b) == null) {
                    return;
                }
                if (storyAction instanceof StoryAction.Dialog) {
                    StoryAction.Dialog dialog = (StoryAction.Dialog) storyAction;
                    npi.f.B(d0Var.f285884n, dialog.f88789a, dialog.f88790b, dialog.f88791c, 8);
                    return;
                } else if (storyAction instanceof StoryAction.NavigationCommand) {
                    d0Var.R(((StoryAction.NavigationCommand) storyAction).f88792a);
                    return;
                } else {
                    if (!(storyAction instanceof StoryAction.Url)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Uri uriF = ((f80.b) d0Var.o).f(((StoryAction.Url) storyAction).f88793a);
                    if (uriF == null) {
                        return;
                    }
                    d0Var.f285881j.c(new BrowserCommand(uriF));
                    return;
                }
        }
    }
}
