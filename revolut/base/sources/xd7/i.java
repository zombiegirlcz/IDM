package xd7;

import androidx.collection.MutableIntObjectMap;
import cli.y;
import cli.z;
import com.revolut.feature.image_gallery.screens.lightbox.ImageGalleryLightboxScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kxk.o;
import rd7.l;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends oki.h implements z {
    public final l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final td7.a f304283p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f304284q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final rd7.c f304285r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f304286s;

    /* JADX WARN: Multi-variable type inference failed */
    public i(o stateMapper, ImageGalleryLightboxScreenContract$InputData inputData, rd7.j galleryInput, l shareHandler, td7.a captionsHolder) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(galleryInput, "galleryInput");
        Intrinsics.checkNotNullParameter(shareHandler, "shareHandler");
        Intrinsics.checkNotNullParameter(captionsHolder, "captionsHolder");
        this.o = shareHandler;
        this.f304283p = captionsHolder;
        List list = galleryInput.f253369a;
        this.f304284q = list;
        this.f304285r = galleryInput.f253371c;
        int i = inputData.f74770a;
        this.f304286s = mra.d.b(this, new g(i, null, (String) captionsHolder.f269936a.getOrDefault(i, ""), list), stateMapper, null, false, 12);
    }

    public final void I2() {
        if (this.f304285r != rd7.c.EDITABLE) {
            return;
        }
        y yVar = this.f304286s;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        Integer num = ((g) j2Var.getValue()).f304279c;
        int iIntValue = num != null ? num.intValue() : ((g) j2Var2.getValue()).f304278b;
        String text = ((g) j2Var2.getValue()).d;
        MutableIntObjectMap mutableIntObjectMap = this.f304283p.f269936a;
        Intrinsics.checkNotNullParameter(text, "text");
        if (d0.W(text)) {
            mutableIntObjectMap.remove(iIntValue);
        } else {
            mutableIntObjectMap.set(iIntValue, text);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f304286s;
    }
}
