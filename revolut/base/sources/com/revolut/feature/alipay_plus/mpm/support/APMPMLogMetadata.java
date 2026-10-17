package com.revolut.feature.alipay_plus.mpm.support;

import a0.d;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.revolut.feature.alipay_plus.mpm.model.APMPMDecodeRequest;
import com.revolut.feature.alipay_plus.mpm.model.APMPMError;
import com.revolut.feature.alipay_plus.mpm.model.APMPMProxyRequest;
import com.revolut.feature.alipay_plus.mpm.model.APMPMProxyResponse;
import java.net.URI;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlin.text.f0;
import nkm.t;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J0\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\t\u001a\u00020\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007J\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\t\u001a\u00020\rJ\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0011\u001a\u00020\u0012J.\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J,\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u001d\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/support/APMPMLogMetadata;", "", "<init>", "()V", "REDACTED", "", "url", "", "decodeRequest", "request", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMDecodeRequest;", "metadata", "proxyRequest", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMProxyRequest;", "proxyResponse", "response", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMProxyResponse;", "error", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMError;", "jsapi", "name", "params", "keys", "json", "Lorg/json/JSONObject;", "redactedValue", "value", "redactedUrl", "prefixed", "prefix", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMLogMetadata {

    @NotNull
    public static final String REDACTED = "<redacted>";

    @NotNull
    public static final APMPMLogMetadata INSTANCE = new APMPMLogMetadata();

    private APMPMLogMetadata() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Map decodeRequest$default(APMPMLogMetadata aPMPMLogMetadata, APMPMDecodeRequest aPMPMDecodeRequest, Map map, int i, Object obj2) {
        if ((i & 2) != 0) {
            map = r0.g();
        }
        return aPMPMLogMetadata.decodeRequest(aPMPMDecodeRequest, map);
    }

    private final Map<String, String> prefixed(Map<String, String> map, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
        Iterator<T> it8 = map.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            linkedHashMap.put(str + "." + entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    private final String redactedUrl(String url2) {
        Object objA;
        String str = "<redacted>";
        try {
            m.Companion companion = m.INSTANCE;
            URI uri2 = new URI(url2);
            StringBuilder sb6 = new StringBuilder();
            String scheme = uri2.getScheme();
            if (scheme != null) {
                sb6.append(scheme);
                sb6.append("://");
            }
            String host = uri2.getHost();
            if (host != null) {
                sb6.append(host);
            }
            String path = uri2.getPath();
            if (path != null) {
                sb6.append(path);
            }
            String string = sb6.toString();
            boolean zW = d0.W(string);
            objA = string;
            if (zW) {
                objA = "<redacted>";
            }
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Object obj2 = str;
        if (!(objA instanceof n)) {
            obj2 = objA;
        }
        return (String) obj2;
    }

    @NotNull
    public final Map<String, String> decodeRequest(@NotNull APMPMDecodeRequest request, @NotNull Map<String, String> metadata) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        LinkedHashMap linkedHashMapN = r0.n(new Pair("codeValue", "<redacted>"));
        String passThroughInfo = request.getPassThroughInfo();
        if (passThroughInfo != null && !d0.W(passThroughInfo)) {
            linkedHashMapN.put("hasPassThroughInfo", "true");
        }
        linkedHashMapN.putAll(metadata);
        return linkedHashMapN;
    }

    @NotNull
    public final Map<String, String> error(@NotNull APMPMError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Pair pair = new Pair("code", error.getCode());
        String message = error.getMessage();
        if (message == null) {
            message = "";
        }
        return r0.k(pair, new Pair("message", message));
    }

    @NotNull
    public final Map<String, String> jsapi(@NotNull String name, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(params, "params");
        return r0.k(new Pair("name", name), new Pair("paramKeys", zhm.d0.k0(zhm.d0.O0(params.keySet()), ",", null, null, 0, null, 62)));
    }

    @NotNull
    public final String keys(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        Iterator<String> itKeys = json.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        return zhm.d0.k0(zhm.d0.O0(y.J(t.c(itKeys))), ",", null, null, 0, null, 62);
    }

    @NotNull
    public final Map<String, String> proxyRequest(@NotNull APMPMProxyRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return r0.k(new Pair("operationType", request.getOperationType()), new Pair("sdkRequestDataKeys", keys(request.getSdkRequestData())));
    }

    @NotNull
    public final Map<String, String> proxyResponse(@NotNull APMPMProxyResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return r0.k(new Pair("primaryDataKeys", keys(response.getSdkResponseData())), new Pair("sdkResponseHeaderKeys", keys(response.getSdkResponseHeader())));
    }

    @NotNull
    public final String redactedValue(String value) {
        String string = value != null ? d0.F0(value).toString() : null;
        if (string == null) {
            string = "";
        }
        return string.length() == 0 ? "" : string.length() <= 6 ? "<redacted>" : a.o(f0.U0(3, string), "...", f0.V0(3, string));
    }

    @NotNull
    public final Map<String, String> url(String url2) {
        return (url2 == null || d0.W(url2)) ? r0.g() : d.x("url", redactedUrl(url2));
    }
}
