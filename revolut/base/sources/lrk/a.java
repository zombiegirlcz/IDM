package lrk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x4l.c f199524a;

    public a(x4l.c curatedCollectionsDod, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(curatedCollectionsDod, "curatedCollectionsDod");
                this.f199524a = curatedCollectionsDod;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(curatedCollectionsDod, "dod");
                this.f199524a = curatedCollectionsDod;
                break;
            default:
                Intrinsics.checkNotNullParameter(curatedCollectionsDod, "assetDataPointsDod");
                this.f199524a = curatedCollectionsDod;
                break;
        }
    }
}
