package jz0;

import android.view.View;
import android.webkit.MimeTypeMap;
import androidx.core.view.ViewGroupKt;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_core.displayers.media.models.UrlMedia;
import com.revolut.core.ui_kit_core.displayers.video.Video;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import ofm.q;
import org.jetbrains.annotations.NotNull;
import yy0.f;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f179561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mz0.a f179562b;

    public b(f imageDisplayer, mz0.a videoDisplayer) {
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        Intrinsics.checkNotNullParameter(videoDisplayer, "videoDisplayer");
        this.f179561a = imageDisplayer;
        this.f179562b = videoDisplayer;
    }

    public final void b(Media media, e to6, c cVar) {
        Media urlVideo;
        Intrinsics.checkNotNullParameter(to6, "to");
        if (to6 == null) {
            throw new IllegalArgumentException("Only [MediaView] is supported by this displayer");
        }
        if (media instanceof UrlMedia) {
            UrlMedia urlMedia = (UrlMedia) media;
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(urlMedia.f60075a));
            urlVideo = mimeTypeFromExtension != null ? d0.J(mimeTypeFromExtension, "video", false) : false ? new UrlVideo(urlMedia.f60075a, (String) null, false, (oz0.b) null, false, (oz0.c) null, 126) : new UrlImage(urlMedia.f60075a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
        } else {
            urlVideo = media;
        }
        if (urlVideo instanceof Image) {
            q.d(this.f179561a, (Image) urlVideo, ((UiKitMediaView) to6).i(), cVar);
            return;
        }
        if (urlVideo instanceof Video) {
            this.f179562b.a((Video) urlVideo, ((UiKitMediaView) to6).j(), cVar);
            return;
        }
        if (urlVideo != null) {
            throw new IllegalArgumentException("Unsupported media type, object:" + media);
        }
        Iterator it8 = ViewGroupKt.getChildren((UiKitMediaView) to6).iterator();
        while (it8.hasNext()) {
            ((View) it8.next()).setVisibility(8);
        }
    }
}
