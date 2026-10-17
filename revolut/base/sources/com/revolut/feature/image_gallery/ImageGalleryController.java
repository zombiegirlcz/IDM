package com.revolut.feature.image_gallery;

import aii.q;
import com.revolut.feature.image_gallery.ImageGalleryController;
import com.revolut.kompot.navigable.vc.ViewController;
import k50.k2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import rd7.j;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/image_gallery/ImageGalleryController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_image_gallery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ImageGalleryController extends ViewController<q> implements f {
    public final j K;
    public final Function2 L;
    public final Function1 M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public ImageGalleryController(j inputData, Function2 function2, k2 k2Var, int i) {
        function2 = (i & 2) != 0 ? null : function2;
        k2Var = (i & 4) != 0 ? null : k2Var;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = function2;
        this.M = k2Var;
        final int i2 = 0;
        this.N = w.y0(new Function0(this) { // from class: rd7.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ImageGalleryController f253362b;

            {
                this.f253362b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                l gVar;
                b bVar;
                switch (i2) {
                    case 0:
                        ImageGalleryController imageGalleryController = this.f253362b;
                        j jVar = imageGalleryController.K;
                        Function2 function22 = imageGalleryController.L;
                        if (function22 == null) {
                            l.Companion.getClass();
                            gVar = k.f253373b;
                        } else {
                            gVar = new os2.g(function22, 15);
                        }
                        Function1 function1 = imageGalleryController.M;
                        if (function1 == null) {
                            b.Companion.getClass();
                            bVar = a.f253360b;
                        } else {
                            bVar = new lhi.b(25, function1);
                        }
                        jVar.getClass();
                        return new ud7.b(jVar, gVar, bVar);
                    case 1:
                        return (ud7.b) this.f253362b.N.getValue();
                    case 2:
                        ud7.b bVar2 = (ud7.b) this.f253362b.N.getValue();
                        return new com.revolut.feature.image_gallery.flow.a(bVar2.f279166a, (td7.a) bVar2.e.get(), bVar2.f279167b);
                    case 3:
                        return (td7.b) this.f253362b.P.getValue();
                    default:
                        ImageGalleryController imageGalleryController2 = this.f253362b;
                        return czi.c.d(0, 6, null, imageGalleryController2, (td7.b) imageGalleryController2.P.getValue());
                }
            }
        });
        final int i3 = 1;
        this.O = w.y0(new Function0(this) { // from class: rd7.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ImageGalleryController f253362b;

            {
                this.f253362b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                l gVar;
                b bVar;
                switch (i3) {
                    case 0:
                        ImageGalleryController imageGalleryController = this.f253362b;
                        j jVar = imageGalleryController.K;
                        Function2 function22 = imageGalleryController.L;
                        if (function22 == null) {
                            l.Companion.getClass();
                            gVar = k.f253373b;
                        } else {
                            gVar = new os2.g(function22, 15);
                        }
                        Function1 function1 = imageGalleryController.M;
                        if (function1 == null) {
                            b.Companion.getClass();
                            bVar = a.f253360b;
                        } else {
                            bVar = new lhi.b(25, function1);
                        }
                        jVar.getClass();
                        return new ud7.b(jVar, gVar, bVar);
                    case 1:
                        return (ud7.b) this.f253362b.N.getValue();
                    case 2:
                        ud7.b bVar2 = (ud7.b) this.f253362b.N.getValue();
                        return new com.revolut.feature.image_gallery.flow.a(bVar2.f279166a, (td7.a) bVar2.e.get(), bVar2.f279167b);
                    case 3:
                        return (td7.b) this.f253362b.P.getValue();
                    default:
                        ImageGalleryController imageGalleryController2 = this.f253362b;
                        return czi.c.d(0, 6, null, imageGalleryController2, (td7.b) imageGalleryController2.P.getValue());
                }
            }
        });
        final int i5 = 2;
        this.P = w.y0(new Function0(this) { // from class: rd7.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ImageGalleryController f253362b;

            {
                this.f253362b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                l gVar;
                b bVar;
                switch (i5) {
                    case 0:
                        ImageGalleryController imageGalleryController = this.f253362b;
                        j jVar = imageGalleryController.K;
                        Function2 function22 = imageGalleryController.L;
                        if (function22 == null) {
                            l.Companion.getClass();
                            gVar = k.f253373b;
                        } else {
                            gVar = new os2.g(function22, 15);
                        }
                        Function1 function1 = imageGalleryController.M;
                        if (function1 == null) {
                            b.Companion.getClass();
                            bVar = a.f253360b;
                        } else {
                            bVar = new lhi.b(25, function1);
                        }
                        jVar.getClass();
                        return new ud7.b(jVar, gVar, bVar);
                    case 1:
                        return (ud7.b) this.f253362b.N.getValue();
                    case 2:
                        ud7.b bVar2 = (ud7.b) this.f253362b.N.getValue();
                        return new com.revolut.feature.image_gallery.flow.a(bVar2.f279166a, (td7.a) bVar2.e.get(), bVar2.f279167b);
                    case 3:
                        return (td7.b) this.f253362b.P.getValue();
                    default:
                        ImageGalleryController imageGalleryController2 = this.f253362b;
                        return czi.c.d(0, 6, null, imageGalleryController2, (td7.b) imageGalleryController2.P.getValue());
                }
            }
        });
        final int i6 = 3;
        this.Q = w.y0(new Function0(this) { // from class: rd7.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ImageGalleryController f253362b;

            {
                this.f253362b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                l gVar;
                b bVar;
                switch (i6) {
                    case 0:
                        ImageGalleryController imageGalleryController = this.f253362b;
                        j jVar = imageGalleryController.K;
                        Function2 function22 = imageGalleryController.L;
                        if (function22 == null) {
                            l.Companion.getClass();
                            gVar = k.f253373b;
                        } else {
                            gVar = new os2.g(function22, 15);
                        }
                        Function1 function1 = imageGalleryController.M;
                        if (function1 == null) {
                            b.Companion.getClass();
                            bVar = a.f253360b;
                        } else {
                            bVar = new lhi.b(25, function1);
                        }
                        jVar.getClass();
                        return new ud7.b(jVar, gVar, bVar);
                    case 1:
                        return (ud7.b) this.f253362b.N.getValue();
                    case 2:
                        ud7.b bVar2 = (ud7.b) this.f253362b.N.getValue();
                        return new com.revolut.feature.image_gallery.flow.a(bVar2.f279166a, (td7.a) bVar2.e.get(), bVar2.f279167b);
                    case 3:
                        return (td7.b) this.f253362b.P.getValue();
                    default:
                        ImageGalleryController imageGalleryController2 = this.f253362b;
                        return czi.c.d(0, 6, null, imageGalleryController2, (td7.b) imageGalleryController2.P.getValue());
                }
            }
        });
        final int i21 = 4;
        this.R = w.y0(new Function0(this) { // from class: rd7.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ImageGalleryController f253362b;

            {
                this.f253362b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                l gVar;
                b bVar;
                switch (i21) {
                    case 0:
                        ImageGalleryController imageGalleryController = this.f253362b;
                        j jVar = imageGalleryController.K;
                        Function2 function22 = imageGalleryController.L;
                        if (function22 == null) {
                            l.Companion.getClass();
                            gVar = k.f253373b;
                        } else {
                            gVar = new os2.g(function22, 15);
                        }
                        Function1 function1 = imageGalleryController.M;
                        if (function1 == null) {
                            b.Companion.getClass();
                            bVar = a.f253360b;
                        } else {
                            bVar = new lhi.b(25, function1);
                        }
                        jVar.getClass();
                        return new ud7.b(jVar, gVar, bVar);
                    case 1:
                        return (ud7.b) this.f253362b.N.getValue();
                    case 2:
                        ud7.b bVar2 = (ud7.b) this.f253362b.N.getValue();
                        return new com.revolut.feature.image_gallery.flow.a(bVar2.f279166a, (td7.a) bVar2.e.get(), bVar2.f279167b);
                    case 3:
                        return (td7.b) this.f253362b.P.getValue();
                    default:
                        ImageGalleryController imageGalleryController2 = this.f253362b;
                        return czi.c.d(0, 6, null, imageGalleryController2, (td7.b) imageGalleryController2.P.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (b) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.R.getValue();
    }
}
