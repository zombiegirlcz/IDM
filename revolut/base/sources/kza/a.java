package kza;

import com.revolut.feature.remote_stories.models.keys.RemoteStoriesKey;
import efm.r;
import f2i.o;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import z1i.l;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pza.a f191079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z3e.c f191080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f191081c;

    public a(pza.a repository, z3e.c storiesInteractor, o remoteStoriesEventHandlersProvider) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(storiesInteractor, "storiesInteractor");
        Intrinsics.checkNotNullParameter(remoteStoriesEventHandlersProvider, "remoteStoriesEventHandlersProvider");
        this.f191079a = repository;
        this.f191080b = storiesInteractor;
        this.f191081c = remoteStoriesEventHandlersProvider;
    }

    public final r a(RemoteStoriesKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String storyKey = mo3.a.q(key);
        Intrinsics.checkNotNullParameter(storyKey, "storyKey");
        r map = e.c(this.f191080b.f319258a.C0(j6.a.q("STORY_KEY_SHOWN_", storyKey), Boolean.TYPE), g.f186406a).map(new z3e.a(new l(23), 0));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
