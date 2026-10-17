package wf0;

import com.revolut.core.faq.data.network.FaqService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zf0.c f296911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f296912c;

    public /* synthetic */ o(x xVar, zf0.c cVar, int i) {
        this.f296910a = i;
        this.f296912c = xVar;
        this.f296911b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f296910a;
        zf0.c cVar = this.f296911b;
        x xVar = this.f296912c;
        switch (i) {
            case 0:
                String scope = (String) obj2;
                Intrinsics.checkNotNullParameter(scope, "scope");
                FaqService faqService = xVar.d;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("X-User-Country", cVar.f321832a.f297794a);
                String str = cVar.f321834c;
                if (str.length() > 0) {
                    linkedHashMap.put("If-Modified-Since", str);
                }
                Unit unit = Unit.f186387a;
                return faqService.getFaqScoped(scope, linkedHashMap);
            case 1:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                String str2 = cVar.e;
                return new zf0.d(xVar.e.a(str2), str2, it8);
            default:
                Response response = (Response) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                if (!response.isSuccessful()) {
                    if (response.code() == 304) {
                        throw new NoSuchElementException();
                    }
                    throw new HttpException(response);
                }
                String strA = response.headers().a("last-modified");
                if (strA != null) {
                    xVar.e.b(cVar.e, strA);
                }
                return (List) response.body();
        }
    }

    public /* synthetic */ o(zf0.c cVar, x xVar) {
        this.f296910a = 1;
        this.f296911b = cVar;
        this.f296912c = xVar;
    }
}
