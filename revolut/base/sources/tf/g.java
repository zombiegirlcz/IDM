package tf;

import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import xf.e0;
import xf.f0;
import xf.z;

/* JADX INFO: loaded from: classes17.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f270143a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    public static Long a(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            qf.a.d().a("The content-length value is not a valid number");
            return null;
        }
    }

    public static String b(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    public static void c(rf.d dVar) {
        if (!((f0) dVar.d.f49761b).hasHttpResponseCode()) {
            z zVar = dVar.d;
            e0 e0Var = e0.GENERIC_CLIENT_ERROR;
            zVar.c();
            ((f0) zVar.f49761b).setNetworkClientErrorReason(e0Var);
        }
        dVar.b();
    }
}
