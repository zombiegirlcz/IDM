package mrg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.view.image.impl.ui.gallery.ImageGalleryScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageGalleryScreenContract$InputData f208119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f208120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f208121c;

    public a(c cVar, d dVar, ImageGalleryScreenContract$InputData imageGalleryScreenContract$InputData) {
        this.f208119a = imageGalleryScreenContract$InputData;
        int i = 5;
        this.f208120b = e4m.b.b(new mil.a(this, 1, i));
        this.f208121c = e4m.b.b(new mil.a(this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
