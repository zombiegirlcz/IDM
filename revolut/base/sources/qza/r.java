package qza;

import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$RemoteStoriesModel;
import com.revolut.feature.stories.models.StoryPage;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v3e.e0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StoryPage f250475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.remote_stories.impl.ui.b f250476c;

    public /* synthetic */ r(StoryPage storyPage, com.revolut.feature.remote_stories.impl.ui.b bVar, int i) {
        this.f250474a = i;
        this.f250475b = storyPage;
        this.f250476c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        StoryPage storyPage;
        Object next;
        List list;
        StoryPage storyPage2;
        Object next2;
        List list2;
        List storiesModels = (List) obj2;
        switch (this.f250474a) {
            case 0:
                Intrinsics.checkNotNullParameter(storiesModels, "storiesModels");
                Iterator it8 = storiesModels.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    storyPage = this.f250475b;
                    Continuation continuation = null;
                    if (zHasNext) {
                        next = it8.next();
                        if (((RemoteStoriesContract$RemoteStoriesModel) next).f81974a.f88786c.contains(storyPage)) {
                        }
                    } else {
                        next = null;
                    }
                }
                RemoteStoriesContract$RemoteStoriesModel remoteStoriesContract$RemoteStoriesModel = (RemoteStoriesContract$RemoteStoriesModel) next;
                String str = (remoteStoriesContract$RemoteStoriesModel == null || (list = (List) remoteStoriesContract$RemoteStoriesModel.f81976c.get(storyPage.getF88840a())) == null) ? null : (String) zhm.d0.d0(list);
                com.revolut.feature.remote_stories.impl.ui.b bVar = this.f250476c;
                NaviCommand naviCommandJ3 = bVar.j3();
                if (naviCommandJ3 != null) {
                    e0 e0Var = ((b0) bVar.f81988c).f250459b;
                } else if (str == null) {
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(storiesModels, "storiesModels");
                Iterator it9 = storiesModels.iterator();
                while (true) {
                    boolean zHasNext2 = it9.hasNext();
                    storyPage2 = this.f250475b;
                    Continuation continuation2 = null;
                    if (zHasNext2) {
                        next2 = it9.next();
                        if (((RemoteStoriesContract$RemoteStoriesModel) next2).f81974a.f88786c.contains(storyPage2)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                RemoteStoriesContract$RemoteStoriesModel remoteStoriesContract$RemoteStoriesModel2 = (RemoteStoriesContract$RemoteStoriesModel) next2;
                String str2 = (remoteStoriesContract$RemoteStoriesModel2 == null || (list2 = (List) remoteStoriesContract$RemoteStoriesModel2.f81976c.get(storyPage2.getF88840a())) == null) ? null : (String) zhm.d0.e0(1, list2);
                if (str2 == null) {
                }
                break;
        }
        return pfm.m.f235744a;
    }
}
