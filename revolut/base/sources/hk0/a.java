package hk0;

import com.revolut.core.model.FileExtension;
import com.revolut.core.network.retrofit.RawUrlRequestService;
import efm.d0;
import g2e.t;
import g80.c;
import hje.e;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.Response;
import te0.w;
import ufm.i;
import ufm.n;
import zk0.b;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f152842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f152843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f152844c;

    public a(t rawUrlRequestRepository, c urlHelper, b fileSystemRepository) {
        Intrinsics.checkNotNullParameter(rawUrlRequestRepository, "rawUrlRequestRepository");
        Intrinsics.checkNotNullParameter(urlHelper, "urlHelper");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        this.f152842a = rawUrlRequestRepository;
        this.f152843b = urlHelper;
        this.f152844c = fileSystemRepository;
    }

    public final n a(String url2, boolean z) {
        Intrinsics.checkNotNullParameter(url2, "url");
        RawUrlRequestService rawUrlRequestService = (RawUrlRequestService) this.f152842a.f140031b;
        Intrinsics.checkNotNullParameter(url2, "url");
        d0<Response<ResponseBody>> authUrlResponse = z ? rawUrlRequestService.getAuthUrlResponse(url2) : rawUrlRequestService.getUrlResponse(url2);
        e eVar = new e(new h8b.b(this, url2, 26), 9);
        authUrlResponse.getClass();
        i iVar = new i(authUrlResponse, eVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return w.i0(iVar);
    }

    public final n b(String url2, boolean z, FileExtension fileExtension) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(fileExtension, "fileExtension");
        i iVar = new i(this.f152842a.l(url2, z), new e(new g31.e(this, 25, url2, fileExtension), 8), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return w.i0(iVar);
    }
}
