package fgl;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.n;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentIssuerImage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v1.m;
import yy0.o;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f135096b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f135097c;
    public final Object d;

    public d(c instrumentImageHelper, f urlProvider) {
        Intrinsics.checkNotNullParameter(instrumentImageHelper, "instrumentImageHelper");
        Intrinsics.checkNotNullParameter(urlProvider, "urlProvider");
        this.f135097c = instrumentImageHelper;
        this.d = urlProvider;
    }

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        switch (this.f135096b) {
            case 0:
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(to6, "to");
                if (!(image instanceof InstrumentImage)) {
                    throw new IllegalStateException("InstrumentImageLoader displays only InstrumentImage");
                }
                InstrumentImage instrumentImage = (InstrumentImage) image;
                b bVar = new b(instrumentImage.f105355b, instrumentImage.f105356c, instrumentImage.d);
                String strA = ((f) this.d).a(instrumentImage.f105354a);
                if (strA != null) {
                    this.f135097c.b(to6, bVar, strA, function1, function0);
                    return;
                } else {
                    c.c(to6, bVar, this.f317758a, function1, function0);
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(to6, "to");
                if (!(image instanceof InstrumentIssuerImage)) {
                    throw new IllegalStateException("InstrumentIssuerImageLoader displays only InstrumentIssuerImage");
                }
                InstrumentIssuerImage instrumentIssuerImage = (InstrumentIssuerImage) image;
                b bVar2 = new b(instrumentIssuerImage.f105359c, instrumentIssuerImage.d, instrumentIssuerImage.e);
                String strA2 = ((h) this.d).a(instrumentIssuerImage.f105357a, instrumentIssuerImage.f105358b);
                if (strA2 != null) {
                    this.f135097c.b(to6, bVar2, strA2, function1, function0);
                    return;
                } else {
                    c.c(to6, bVar2, this.f317758a, function1, function0);
                    return;
                }
        }
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        switch (this.f135096b) {
            case 0:
                Intrinsics.checkNotNullParameter(imageView, "imageView");
                n nVarE = com.bumptech.glide.b.e(imageView);
                nVarE.getClass();
                a0.d.z(imageView, nVarE);
                break;
            default:
                Intrinsics.checkNotNullParameter(imageView, "imageView");
                n nVarE2 = com.bumptech.glide.b.e(imageView);
                nVarE2.getClass();
                a0.d.z(imageView, nVarE2);
                break;
        }
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        switch (this.f135096b) {
            case 0:
                Intrinsics.checkNotNullParameter(image, "image");
                return image instanceof InstrumentImage;
            default:
                Intrinsics.checkNotNullParameter(image, "image");
                return image instanceof InstrumentIssuerImage;
        }
    }

    @Override // yy0.d
    public final void f(Image image, Context context, int i, int i2, m mVar, a3l.b bVar) {
        switch (this.f135096b) {
            case 0:
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(context, "context");
                if (!(image instanceof InstrumentImage)) {
                    throw new IllegalStateException("InstrumentImageLoader displays only InstrumentImage");
                }
                InstrumentImage instrumentImage = (InstrumentImage) image;
                b bVar2 = new b(instrumentImage.f105355b, instrumentImage.f105356c, instrumentImage.d);
                String strA = ((f) this.d).a(instrumentImage.f105354a);
                if (strA != null) {
                    this.f135097c.d(context, bVar2, strA, i, i2, mVar, bVar);
                    return;
                } else {
                    if (bVar != null) {
                        bVar.invoke();
                        return;
                    }
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(context, "context");
                if (!(image instanceof InstrumentIssuerImage)) {
                    throw new IllegalStateException("InstrumentIssuerImageLoader displays only InstrumentIssuerImage");
                }
                InstrumentIssuerImage instrumentIssuerImage = (InstrumentIssuerImage) image;
                b bVar3 = new b(instrumentIssuerImage.f105359c, instrumentIssuerImage.d, instrumentIssuerImage.e);
                String strA2 = ((h) this.d).a(instrumentIssuerImage.f105357a, instrumentIssuerImage.f105358b);
                if (strA2 != null) {
                    this.f135097c.d(context, bVar3, strA2, i, i2, mVar, bVar);
                    return;
                } else {
                    if (bVar != null) {
                        bVar.invoke();
                        return;
                    }
                    return;
                }
        }
    }

    public d(c instrumentIssuerImageHelper, h urlProvider) {
        Intrinsics.checkNotNullParameter(instrumentIssuerImageHelper, "instrumentIssuerImageHelper");
        Intrinsics.checkNotNullParameter(urlProvider, "urlProvider");
        this.f135097c = instrumentIssuerImageHelper;
        this.d = urlProvider;
    }
}
