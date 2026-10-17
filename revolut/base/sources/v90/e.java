package v90;

import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.HtmlItem;
import com.revolut.feature.backend_flow.domain.models.HtmlPromptScreen;
import com.revolut.feature.backend_flow.domain.models.ImageItem;
import com.revolut.feature.backend_flow.domain.models.PollingInfo;
import com.revolut.feature.backend_flow.domain.models.StoriesScreen;
import com.revolut.feature.backend_flow.domain.models.Transition;
import com.revolut.feature.backend_flow.domain.models.TutorialScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nd.o;
import q90.a3;
import q90.h4;
import q90.i4;
import q90.m4;
import q90.p3;
import q90.r1;
import q90.s1;
import q90.u1;
import u90.a0;
import u90.x;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286953a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f286954b;

    public e(o transitionMapper) {
        Intrinsics.checkNotNullParameter(transitionMapper, "transitionMapper");
        this.f286954b = transitionMapper;
    }

    @Override // v90.a
    public final BackendScreen a(m4 m4Var) {
        ArrayList arrayList;
        String str;
        PollingInfo pollingInfo;
        switch (this.f286953a) {
            case 0:
                s1 screen = (s1) m4Var;
                Intrinsics.checkNotNullParameter(screen, "screen");
                return new HtmlPromptScreen(screen.getId(), screen.getTitle(), (HtmlItem) ((x) this.f286954b).a(screen.getHtmlItem(), f0.f322471a), screen.getPreviousViewId(), screen.getAnalyticsName());
            case 1:
                p3 screen2 = (p3) m4Var;
                Intrinsics.checkNotNullParameter(screen2, "screen");
                String id10 = screen2.getId();
                String previousViewId = screen2.getPreviousViewId();
                boolean zJ = pd.b.j(screen2.getSkippable());
                List next = screen2.getNext();
                if (next != null) {
                    List list = next;
                    o oVar = (o) this.f286954b;
                    arrayList = new ArrayList(w.t(list, 10));
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(oVar.k((h4) it8.next()));
                    }
                } else {
                    arrayList = null;
                }
                return new StoriesScreen(id10, screen2.getStoryId(), arrayList, screen2.getSchemaId(), previousViewId, zJ);
            default:
                i4 screen3 = (i4) m4Var;
                Intrinsics.checkNotNullParameter(screen3, "screen");
                String id11 = screen3.getId();
                String previousViewId2 = screen3.getPreviousViewId();
                String next2 = screen3.getNext();
                String title = screen3.getTitle();
                String subtitle = screen3.getSubtitle();
                String nextText = screen3.getNextText();
                String lottieUrl = screen3.getLottieUrl();
                String backgroundImageUrl = screen3.getBackgroundImageUrl();
                a3 pollingInfo2 = screen3.getPollingInfo();
                if (pollingInfo2 != null) {
                    str = id11;
                    pollingInfo = new PollingInfo(pollingInfo2.getIntervalMillis());
                } else {
                    str = id11;
                    pollingInfo = null;
                }
                String nextActionDeeplink = screen3.getNextActionDeeplink();
                u1 image = screen3.getImage();
                return new TutorialScreen(str, pollingInfo, next2, nextText, title, subtitle, lottieUrl, image != null ? (ImageItem) ((a0) this.f286954b).a(image, f0.f322471a) : null, backgroundImageUrl, nextActionDeeplink, previousViewId2);
        }
    }

    @Override // v90.a
    public final m4 b(BackendScreen backendScreen) {
        ArrayList arrayList;
        switch (this.f286953a) {
            case 0:
                HtmlPromptScreen screen = (HtmlPromptScreen) backendScreen;
                Intrinsics.checkNotNullParameter(screen, "screen");
                String str = screen.f63478a;
                String str2 = screen.d;
                String str3 = screen.f63479b;
                HtmlItem item = screen.f63480c;
                Intrinsics.checkNotNullParameter(item, "item");
                return new s1(str, str2, str3, new r1(item.f63477a), screen.e);
            case 1:
                StoriesScreen screen2 = (StoriesScreen) backendScreen;
                Intrinsics.checkNotNullParameter(screen2, "screen");
                String str4 = screen2.f63663a;
                String str5 = screen2.f;
                List list = screen2.f63665c;
                if (list != null) {
                    List list2 = list;
                    o oVar = (o) this.f286954b;
                    arrayList = new ArrayList(w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(oVar.m((Transition) it8.next()));
                    }
                } else {
                    arrayList = null;
                }
                return new p3(str4, str5, Boolean.valueOf(screen2.f63664b), arrayList, screen2.d, screen2.e);
            default:
                TutorialScreen screen3 = (TutorialScreen) backendScreen;
                Intrinsics.checkNotNullParameter(screen3, "screen");
                String str6 = screen3.f63711a;
                String str7 = screen3.k;
                String str8 = screen3.e;
                String str9 = screen3.f;
                String str10 = screen3.f63713c;
                String str11 = screen3.d;
                String str12 = screen3.f63714g;
                String str13 = screen3.i;
                PollingInfo pollingInfo = screen3.f63712b;
                a3 a3Var = pollingInfo != null ? new a3(pollingInfo.f63577a) : null;
                String str14 = screen3.f63716j;
                ImageItem imageItem = screen3.f63715h;
                return new i4(str6, str7, str8, str9, str10, str11, imageItem != null ? a0.c(imageItem) : null, str12, str13, a3Var, str14);
        }
    }

    public e(x htmlItemMapper) {
        Intrinsics.checkNotNullParameter(htmlItemMapper, "htmlItemMapper");
        this.f286954b = htmlItemMapper;
    }

    public e(a0 imageItemMapper) {
        Intrinsics.checkNotNullParameter(imageItemMapper, "imageItemMapper");
        this.f286954b = imageItemMapper;
    }
}
