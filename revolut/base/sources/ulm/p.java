package ulm;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: loaded from: classes13.dex */
public interface p {
    void onFailure(Call call, IOException iOException);

    void onResponse(Call call, Response response);
}
