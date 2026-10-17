package i0k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4l.f f157425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4l.f f157426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4l.f f157427c;

    public h(w4l.f newsArticleDod, w4l.f searchNewsDod, w4l.f assetNewsDod, w4l.f personalisedNewsDod) {
        Intrinsics.checkNotNullParameter(newsArticleDod, "newsArticleDod");
        Intrinsics.checkNotNullParameter(searchNewsDod, "searchNewsDod");
        Intrinsics.checkNotNullParameter(assetNewsDod, "assetNewsDod");
        Intrinsics.checkNotNullParameter(personalisedNewsDod, "personalisedNewsDod");
        this.f157425a = newsArticleDod;
        this.f157426b = assetNewsDod;
        this.f157427c = personalisedNewsDod;
    }
}
