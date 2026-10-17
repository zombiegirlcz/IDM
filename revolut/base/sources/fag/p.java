package fag;

import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r10.w f133357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f133358c;

    public /* synthetic */ p(r10.w wVar, String str, int i) {
        this.f133356a = i;
        this.f133357b = wVar;
        this.f133358c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        File fileM;
        int i = this.f133356a;
        String str = this.f133358c;
        r10.w wVar = this.f133357b;
        switch (i) {
            case 0:
                zk0.b bVar = (zk0.b) wVar.f250866b;
                Response response = (Response) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                ResponseBody responseBody = (ResponseBody) response.body();
                if (!response.isSuccessful() || responseBody == null) {
                    HttpException httpException = new HttpException(response);
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, httpException, h0Var);
                    fileM = ((a80.h) bVar).m(zk0.a.INTERNAL_CACHE, p.a.p("hotel_booking_confirmation_", str, ".pdf"));
                    if (!fileM.exists()) {
                        throw httpException;
                    }
                } else {
                    fileM = ((a80.h) bVar).n(zk0.a.INTERNAL_CACHE, responseBody.byteStream(), p.a.p("hotel_booking_confirmation_", str, ".pdf"));
                    if (fileM == null) {
                        throw new IllegalStateException("Could not create file");
                    }
                }
                return fileM;
            default:
                Throwable exception = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(exception, "exception");
                File fileM2 = ((a80.h) ((zk0.b) wVar.f250866b)).m(zk0.a.INTERNAL_CACHE, p.a.p("hotel_booking_confirmation_", str, ".pdf"));
                if (fileM2.exists()) {
                    return fileM2;
                }
                throw exception;
        }
    }
}
