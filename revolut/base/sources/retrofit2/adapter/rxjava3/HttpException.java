package retrofit2.adapter.rxjava3;

import retrofit2.Response;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public final class HttpException extends retrofit2.HttpException {
    public HttpException(Response<?> response) {
        super(response);
    }
}
