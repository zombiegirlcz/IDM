package y9m;

import android.util.Base64;
import android.webkit.JavascriptInterface;
import dam.s;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import skm.e0;

/* JADX INFO: loaded from: classes17.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f311881a;

    public g(s transact) {
        Intrinsics.checkNotNullParameter(transact, "transact");
        this.f311881a = transact;
    }

    @JavascriptInterface
    @NotNull
    public final Job emit(@NotNull String type, @NotNull String data) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        return e0.C(this.f311881a.f112593j, null, null, new cuc.c(23, this, new JSONObject(data), type, (Continuation) null), 3);
    }

    @JavascriptInterface
    public final void handleAction(@NotNull String data) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = data.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] rawPayload = Base64.decode(bytes, 0);
        Intrinsics.checkNotNullExpressionValue(rawPayload, "rawPayload");
        JSONObject jSONObject = new JSONObject(new String(rawPayload, charset));
        String action = jSONObject.getString("event");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("payload");
        Objects.toString(jSONObjectOptJSONObject);
        Intrinsics.checkNotNullExpressionValue(action, "action");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        e0.C(this.f311881a.f112593j, null, null, new cuc.c(23, this, jSONObjectOptJSONObject, action, (Continuation) null), 3);
    }
}
