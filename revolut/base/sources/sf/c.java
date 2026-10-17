package sf;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;
import xf.d0;
import xf.f0;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final qf.a f262246c = qf.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f262247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f262248b;

    public c(f0 f0Var, Context context) {
        this.f262248b = context;
        this.f262247a = f0Var;
    }

    @Override // sf.e
    public final boolean a() {
        URI uriCreate;
        f0 f0Var = this.f262247a;
        String url2 = f0Var.getUrl();
        boolean zIsEmpty = url2 == null ? true : url2.trim().isEmpty();
        qf.a aVar = f262246c;
        if (zIsEmpty) {
            aVar.f("URL is missing:" + f0Var.getUrl());
            return false;
        }
        String url3 = f0Var.getUrl();
        if (url3 == null) {
            uriCreate = null;
        } else {
            try {
                uriCreate = URI.create(url3);
            } catch (IllegalArgumentException | IllegalStateException e) {
                aVar.g("getResultUrl throws exception %s", e.getMessage());
                uriCreate = null;
            }
        }
        if (uriCreate == null) {
            aVar.f("URL cannot be parsed");
            return false;
        }
        Context context = this.f262248b;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier != 0) {
            qf.a.d().a("Detected domain allowlist, only allowlisted domains will be measured.");
            if (tz4.d.f275868a == null) {
                tz4.d.f275868a = resources.getStringArray(identifier);
            }
            String host = uriCreate.getHost();
            if (host != null) {
                for (String str : tz4.d.f275868a) {
                    if (!host.contains(str)) {
                    }
                }
                aVar.f("URL fails allowlist rule: " + uriCreate);
                return false;
            }
        }
        String host2 = uriCreate.getHost();
        if (host2 == null || host2.trim().isEmpty() || host2.length() > 255) {
            aVar.f("URL host is null or invalid");
            return false;
        }
        String scheme = uriCreate.getScheme();
        if (scheme == null || (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme))) {
            aVar.f("URL scheme is null or invalid");
            return false;
        }
        if (uriCreate.getUserInfo() != null) {
            aVar.f("URL user info is null");
            return false;
        }
        int port = uriCreate.getPort();
        if (port != -1 && port <= 0) {
            aVar.f("URL port is less than or equal to 0");
            return false;
        }
        d0 httpMethod = f0Var.hasHttpMethod() ? f0Var.getHttpMethod() : null;
        if (httpMethod == null || httpMethod == d0.HTTP_METHOD_UNKNOWN) {
            aVar.f("HTTP Method is null or invalid: " + f0Var.getHttpMethod());
            return false;
        }
        if (f0Var.hasHttpResponseCode() && f0Var.getHttpResponseCode() <= 0) {
            aVar.f("HTTP ResponseCode is a negative value:" + f0Var.getHttpResponseCode());
            return false;
        }
        if (f0Var.hasRequestPayloadBytes()) {
            if (!(f0Var.getRequestPayloadBytes() >= 0)) {
                aVar.f("Request Payload is a negative value:" + f0Var.getRequestPayloadBytes());
                return false;
            }
        }
        if (f0Var.hasResponsePayloadBytes()) {
            if (!(f0Var.getResponsePayloadBytes() >= 0)) {
                aVar.f("Response Payload is a negative value:" + f0Var.getResponsePayloadBytes());
                return false;
            }
        }
        if (!f0Var.hasClientStartTimeUs() || f0Var.getClientStartTimeUs() <= 0) {
            aVar.f("Start time of the request is null, or zero, or a negative value:" + f0Var.getClientStartTimeUs());
            return false;
        }
        if (f0Var.hasTimeToRequestCompletedUs()) {
            if (!(f0Var.getTimeToRequestCompletedUs() >= 0)) {
                aVar.f("Time to complete the request is a negative value:" + f0Var.getTimeToRequestCompletedUs());
                return false;
            }
        }
        if (f0Var.hasTimeToResponseInitiatedUs()) {
            if (!(f0Var.getTimeToResponseInitiatedUs() >= 0)) {
                aVar.f("Time from the start of the request to the start of the response is null or a negative value:" + f0Var.getTimeToResponseInitiatedUs());
                return false;
            }
        }
        if (!f0Var.hasTimeToResponseCompletedUs() || f0Var.getTimeToResponseCompletedUs() <= 0) {
            aVar.f("Time from the start of the request to the end of the response is null, negative or zero:" + f0Var.getTimeToResponseCompletedUs());
            return false;
        }
        if (f0Var.hasHttpResponseCode()) {
            return true;
        }
        aVar.f("Did not receive a HTTP Response Code");
        return false;
    }
}
