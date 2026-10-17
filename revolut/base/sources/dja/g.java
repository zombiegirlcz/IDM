package dja;

import kotlin.jvm.internal.Intrinsics;
import mmm.k;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115269a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Converter f115270b;

    @Override // retrofit2.Converter
    public final Object convert(Object obj2) {
        Converter converter;
        ResponseBody body = (ResponseBody) obj2;
        switch (this.f115269a) {
            case 0:
                k kVarSource = body.source();
                if (body.contentLength() == 0 || kVarSource.J()) {
                    return null;
                }
                return this.f115270b.convert(body);
            default:
                Intrinsics.checkNotNullParameter(body, "body");
                k kVarSource2 = body.source();
                kVarSource2.a(Long.MAX_VALUE);
                if (kVarSource2.getBuffer().f207266b == 0 || (converter = this.f115270b) == null) {
                    return null;
                }
                return converter.convert(body);
        }
    }
}
