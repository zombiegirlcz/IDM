package u90;

import com.revolut.feature.backend_flow.domain.models.BackendFlowIcon;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.ImageContentType;
import com.revolut.feature.backend_flow.domain.models.ImageItem;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import q90.u1;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 extends c {
    public static u1 c(ImageItem item) {
        BackendFlowIcon backendFlowIcon;
        ImageContentType imageContentType;
        Intrinsics.checkNotNullParameter(item, "item");
        boolean z = item instanceof ImageItem.Url;
        q90.o oVarB = null;
        ImageItem.Url url2 = z ? (ImageItem.Url) item : null;
        String str = url2 != null ? url2.f63492a : null;
        ImageItem.Url url3 = z ? (ImageItem.Url) item : null;
        String str2 = (url3 == null || (imageContentType = url3.f63493b) == null) ? null : imageContentType.f63487a;
        ImageItem.Icon icon = item instanceof ImageItem.Icon ? (ImageItem.Icon) item : null;
        if (icon != null && (backendFlowIcon = icon.f63491a) != null) {
            oVarB = t90.e.b(backendFlowIcon);
        }
        return new u1(str, str2, oVarB);
    }

    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        u1 item = (u1) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String url2 = item.getUrl();
        String content = item.getContent();
        q90.o icon = item.getIcon();
        if (icon != null) {
            return new ImageItem.Icon(t90.e.a(icon, null));
        }
        if (url2 != null && content != null) {
            return content.equals("LOTTIE") ? new ImageItem.Url(url2, ImageContentType.Lottie.f63488b) : content.equals("STATIC") ? new ImageItem.Url(url2, ImageContentType.Static.f63489b) : new ImageItem.Url(url2, new ImageContentType.Unknown(content));
        }
        IllegalStateException illegalStateException = new IllegalStateException("All ImageItem fields are null");
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return new ImageItem.Icon(new BackendFlowIcon.Default(null, "IGNORED"));
    }

    @Override // u90.c
    public final /* bridge */ /* synthetic */ q90.v b(BackendItem backendItem) {
        return c((ImageItem) backendItem);
    }
}
