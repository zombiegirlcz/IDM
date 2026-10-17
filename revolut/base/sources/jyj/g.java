package jyj;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ufm.n;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f179446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f179447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f179448c;
    public final d d;
    public final f01.a e;

    public g(a imageBytesProvider, m userAvatarProvider, c paintBrush, d imageBytesManipulator, f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(imageBytesProvider, "imageBytesProvider");
        Intrinsics.checkNotNullParameter(userAvatarProvider, "userAvatarProvider");
        Intrinsics.checkNotNullParameter(paintBrush, "paintBrush");
        Intrinsics.checkNotNullParameter(imageBytesManipulator, "imageBytesManipulator");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f179446a = imageBytesProvider;
        this.f179447b = userAvatarProvider;
        this.f179448c = paintBrush;
        this.d = imageBytesManipulator;
        this.e = uiKitResources;
    }

    public final ufm.i a(UrlImage image, dj0.d money, String str, String amountDescription) {
        Intrinsics.checkNotNullParameter(image, "backgroundImage");
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(amountDescription, "amountDescription");
        f fVar = (f) this.f179446a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(image, "image");
        n nVarD = ((qz0.n) fVar.f179445a).d(UrlImage.a(image, null, null, null, null, null, 393215));
        e eVar = e.f;
        ufm.i iVar = new ufm.i(nVarD, new joe.e(7), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        m mVar = this.f179447b;
        mVar.getClass();
        ufm.b bVar = new ufm.b(new jy2.a(mVar, 4), 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        ufm.i iVar2 = new ufm.i(w.H0(iVar, w.i0(bVar)), new jy2.a(new ja3.d(this, str, money, amountDescription, 4), 3), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }
}
