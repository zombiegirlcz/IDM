package qza;

import android.content.Context;
import com.revolut.core.ui_kit.internal.views.stories.StoryPagesView;
import com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel;
import com.revolut.data.model.Data;
import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$RemoteStoriesModel;
import com.revolut.feature.stories.StoriesActivity;
import com.revolut.shared.feature.event_appearance.api.models.EventAppearance;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineDispatcher;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250473a;

    public /* synthetic */ q(int i) {
        this.f250473a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f250473a) {
            case 0:
                List remoteStoriesModels = (List) obj2;
                Intrinsics.checkNotNullParameter(remoteStoriesModels, "remoteStoriesModels");
                List list = remoteStoriesModels;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((RemoteStoriesContract$RemoteStoriesModel) it8.next()).f81974a);
                }
                return arrayList;
            case 1:
                jv0.m it9 = (jv0.m) obj2;
                StoryPagesView.a aVar = StoryPagesView.Companion;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (it9 instanceof jv0.o) {
                    return (jv0.o) it9;
                }
                return null;
            case 2:
                StoryPagesView.a aVar2 = StoryPagesView.Companion;
                Intrinsics.checkNotNullParameter((BaseStoriesModel) obj2, "it");
                return Unit.f186387a;
            case 3:
                StoryPagesView.a aVar3 = StoryPagesView.Companion;
                Intrinsics.checkNotNullParameter((BaseStoriesModel) obj2, "it");
                return Unit.f186387a;
            case 4:
                StoryPagesView.a aVar4 = StoryPagesView.Companion;
                Intrinsics.checkNotNullParameter((BaseStoriesModel) obj2, "it");
                return Unit.f186387a;
            case 5:
                StoryPagesView.a aVar5 = StoryPagesView.Companion;
                Intrinsics.checkNotNullParameter((ru0.e) obj2, "it");
                return Unit.f186387a;
            case 6:
                StoryPagesView.a aVar6 = StoryPagesView.Companion;
                Intrinsics.checkNotNullParameter((BaseStoriesModel) obj2, "it");
                return Unit.f186387a;
            case 7:
                StoryPagesView.a aVar7 = StoryPagesView.Companion;
                Intrinsics.checkNotNullParameter((BaseStoriesModel) obj2, "it");
                return Unit.f186387a;
            case 8:
                StoryPagesView.a aVar8 = StoryPagesView.Companion;
                Intrinsics.checkNotNullParameter((BaseStoriesModel) obj2, "it");
                return Unit.f186387a;
            case 9:
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (element instanceof CoroutineDispatcher) {
                    return (CoroutineDispatcher) element;
                }
                return null;
            case 10:
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                if (element2 instanceof kotlinx.coroutines.c) {
                    return (kotlinx.coroutines.c) element2;
                }
                return null;
            case 11:
                th0.k args = (th0.k) obj2;
                Intrinsics.checkNotNullParameter(args, "args");
                Context context = args.f271236a;
                sg0.c cVar = args.f271237b;
                cVar.getClass();
                th0.a aVar9 = new th0.a(context, cVar);
                pi0.c appEnvironmentLogger = new pi0.c(new oh0.c((oh0.a) aVar9.f271232c.get()));
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(appEnvironmentLogger, "appEnvironmentLogger");
                th0.l.Companion.getClass();
                wh0.a.a(context);
                appEnvironmentLogger.init();
                return aVar9;
            case 12:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return (data.getContent() != null || data.getLoading()) ? data : Data.copy$default(data, Boolean.TRUE, null, false, 6, null);
            case 13:
                return Boolean.valueOf(((WeakReference) obj2).get() == null);
            case 14:
                Map.Entry entry = (Map.Entry) obj2;
                Intrinsics.checkNotNullParameter(entry, "<destruct>");
                return Boolean.valueOf(((WeakReference) entry.getValue()).get() == null);
            case 15:
                hy0.c state = (hy0.c) obj2;
                KProperty[] kPropertyArr = StoriesActivity.f88741w0;
                Intrinsics.checkNotNullParameter(state, "state");
                return Boolean.valueOf(state == hy0.c.FINISH_REQUESTED);
            case 16:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Pair pair2 = (Pair) pair.f186385a;
                return new yhm.r(pair2.f186385a, pair2.f186386b, pair.f186386b);
            case 17:
                Intrinsics.checkNotNullParameter((Data) obj2, "data");
                return Boolean.valueOf(!r9.getLoading());
            case 18:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                Boolean bool = (Boolean) pair3.f186385a;
                bool.booleanValue();
                return bool;
            case 19:
                od0.i it10 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (EventAppearance) it10.f224257a;
            case 20:
                od0.i it11 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (Boolean) it11.f224257a;
            case 21:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 22:
                Throwable th10 = (Throwable) obj2;
                Intrinsics.h(th10);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                return Unit.f186387a;
            case 23:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return Boolean.TRUE;
            case 24:
                Throwable it12 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return efm.d0.l(new vf0.c(it12));
            case 25:
                return obj2;
            case 26:
                return Unit.f186387a;
            case 27:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Unit.f186387a;
            case 28:
                Intrinsics.checkNotNullParameter(obj2, "<unused var>");
                return Unit.f186387a;
            default:
                a0.d.B(obj2);
                Intrinsics.checkNotNullParameter(null, "key");
                throw null;
        }
    }

    public /* synthetic */ q(wf0.x xVar) {
        this.f250473a = 29;
    }
}
