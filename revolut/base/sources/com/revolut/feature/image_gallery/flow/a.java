package com.revolut.feature.image_gallery.flow;

import com.revolut.feature.image_gallery.flow.ImageGalleryFlowContract$Step;
import cp5.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import oki.h;
import rd7.c;
import rd7.j;
import td7.b;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final td7.a f74767p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rd7.b f74768q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f74769r;

    public a(j input, td7.a captionsHolder, rd7.b captionHandler) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(captionsHolder, "captionsHolder");
        Intrinsics.checkNotNullParameter(captionHandler, "captionHandler");
        this.o = input;
        this.f74767p = captionsHolder;
        this.f74768q = captionHandler;
        Integer num = input.f253370b;
        this.f74769r = d.a(this, num != null ? new ImageGalleryFlowContract$Step.Pager(num.intValue()) : ImageGalleryFlowContract$Step.Gallery.f74765a, f0.f322471a, new ta8.a(this, 10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yji.l
    public final void K1() {
        j jVar = this.o;
        if (jVar.f253371c == c.EDITABLE) {
            td7.a aVar = this.f74767p;
            if (aVar.f269937b) {
                List images = jVar.f253369a;
                Intrinsics.checkNotNullParameter(images, "images");
                List list = images;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                int i = 0;
                for (Object obj2 : list) {
                    int i2 = i + 1;
                    String str = null;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    rd7.h hVar = (rd7.h) obj2;
                    String str2 = (String) aVar.f269936a.get(i);
                    if (str2 != null && !d0.W(str2)) {
                        str = str2;
                    }
                    arrayList.add(hVar.b(str));
                    i = i2;
                }
                this.f74768q.a(arrayList);
            }
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74769r;
    }
}
