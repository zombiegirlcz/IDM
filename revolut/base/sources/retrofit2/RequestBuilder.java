package retrofit2;

import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import mmm.h;
import mmm.j;
import okhttp3.MultipartBody$Part;
import okhttp3.RequestBody;
import ue8.c;
import ulm.a1;
import ulm.b1;
import ulm.c1;
import ulm.i1;
import ulm.n0;
import ulm.s0;
import ulm.u0;
import ulm.v0;
import ulm.x0;

/* JADX INFO: loaded from: classes13.dex */
final class RequestBuilder {
    private final x0 baseUrl;
    private RequestBody body;
    private b1 contentType;
    private n0 formBuilder;
    private final boolean hasBody;
    private final s0 headersBuilder;
    private final String method;
    private c1 multipartBuilder;
    private String relativeUrl;
    private final i1 requestBuilder = new i1();
    private v0 urlBuilder;
    private static final String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Pattern PATH_TRAVERSAL = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: loaded from: classes14.dex */
    public static class ContentTypeOverridingRequestBody extends RequestBody {
        private final b1 contentType;
        private final RequestBody delegate;

        public ContentTypeOverridingRequestBody(RequestBody requestBody, b1 b1Var) {
            this.delegate = requestBody;
            this.contentType = b1Var;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() throws IOException {
            return this.delegate.contentLength();
        }

        @Override // okhttp3.RequestBody
        public b1 contentType() {
            return this.contentType;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(j jVar) throws IOException {
            this.delegate.writeTo(jVar);
        }
    }

    public RequestBuilder(String str, x0 x0Var, String str2, u0 u0Var, b1 b1Var, boolean z, boolean z3, boolean z4) {
        this.method = str;
        this.baseUrl = x0Var;
        this.relativeUrl = str2;
        this.contentType = b1Var;
        this.hasBody = z;
        if (u0Var != null) {
            this.headersBuilder = c.m(u0Var);
        } else {
            this.headersBuilder = new s0();
        }
        if (z3) {
            this.formBuilder = new n0();
        } else if (z4) {
            c1 c1Var = new c1();
            this.multipartBuilder = c1Var;
            c1Var.f(okhttp3.c.f226117n);
        }
    }

    private static String canonicalizeForPath(String str, boolean z) throws EOFException {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                h hVar = new h();
                hVar.C(0, iCharCount, str);
                canonicalizeForPath(hVar, str, iCharCount, length, z);
                return hVar.q();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    public void addFormField(String str, String str2, boolean z) {
        if (z) {
            this.formBuilder.b(str, str2);
        } else {
            this.formBuilder.a(str, str2);
        }
    }

    public void addHeader(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                b1.Companion.getClass();
                this.contentType = a1.a(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(j6.a.q("Malformed content type: ", str2), e);
            }
        }
        if (z) {
            this.headersBuilder.d(str, str2);
        } else {
            this.headersBuilder.a(str, str2);
        }
    }

    public void addHeaders(u0 headers) {
        s0 s0Var = this.headersBuilder;
        s0Var.getClass();
        Intrinsics.checkNotNullParameter(headers, "headers");
        c.c(s0Var, headers);
    }

    public void addPart(u0 u0Var, RequestBody requestBody) {
        this.multipartBuilder.d(u0Var, requestBody);
    }

    public void addPathParam(String str, String str2, boolean z) {
        if (this.relativeUrl == null) {
            throw new AssertionError();
        }
        String strCanonicalizeForPath = canonicalizeForPath(str2, z);
        String strReplace = this.relativeUrl.replace("{" + str + "}", strCanonicalizeForPath);
        if (PATH_TRAVERSAL.matcher(strReplace).matches()) {
            throw new IllegalArgumentException(j6.a.q("@Path parameters shouldn't perform path traversal ('.' or '..'): ", str2));
        }
        this.relativeUrl = strReplace;
    }

    public void addQueryParam(String encodedName, String str, boolean z) {
        String str2 = this.relativeUrl;
        if (str2 != null) {
            v0 v0VarH = this.baseUrl.h(str2);
            this.urlBuilder = v0VarH;
            if (v0VarH == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
            this.relativeUrl = null;
        }
        if (!z) {
            this.urlBuilder.a(encodedName, str);
            return;
        }
        v0 v0Var = this.urlBuilder;
        v0Var.getClass();
        Intrinsics.checkNotNullParameter(encodedName, "encodedName");
        if (v0Var.f281159g == null) {
            v0Var.f281159g = new ArrayList();
        }
        ArrayList arrayList = v0Var.f281159g;
        Intrinsics.h(arrayList);
        arrayList.add(jmm.a.a(encodedName, 0, true, " \"'<>#&=", 0, 83));
        ArrayList arrayList2 = v0Var.f281159g;
        Intrinsics.h(arrayList2);
        arrayList2.add(str != null ? jmm.a.a(str, 0, true, " \"'<>#&=", 0, 83) : null);
    }

    public <T> void addTag(Class<T> type, T t2) {
        i1 i1Var = this.requestBuilder;
        i1Var.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        KClass type2 = nim.a.r(type);
        Intrinsics.checkNotNullParameter(type2, "type");
        i1Var.e = i1Var.e.u(type2, t2);
    }

    public i1 get() {
        x0 url2;
        v0 v0Var = this.urlBuilder;
        if (v0Var != null) {
            url2 = v0Var.b();
        } else {
            x0 x0Var = this.baseUrl;
            String link = this.relativeUrl;
            x0Var.getClass();
            Intrinsics.checkNotNullParameter(link, "link");
            v0 v0VarH = x0Var.h(link);
            url2 = v0VarH != null ? v0VarH.b() : null;
            if (url2 == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
        }
        RequestBody contentTypeOverridingRequestBody = this.body;
        if (contentTypeOverridingRequestBody == null) {
            n0 n0Var = this.formBuilder;
            if (n0Var != null) {
                contentTypeOverridingRequestBody = n0Var.c();
            } else {
                c1 c1Var = this.multipartBuilder;
                if (c1Var != null) {
                    contentTypeOverridingRequestBody = c1Var.e();
                } else if (this.hasBody) {
                    contentTypeOverridingRequestBody = RequestBody.create((b1) null, new byte[0]);
                }
            }
        }
        b1 b1Var = this.contentType;
        if (b1Var != null) {
            if (contentTypeOverridingRequestBody != null) {
                contentTypeOverridingRequestBody = new ContentTypeOverridingRequestBody(contentTypeOverridingRequestBody, b1Var);
            } else {
                this.headersBuilder.a("Content-Type", b1Var.f281065a);
            }
        }
        i1 i1Var = this.requestBuilder;
        i1Var.getClass();
        Intrinsics.checkNotNullParameter(url2, "url");
        i1Var.f281089a = url2;
        s0 s0Var = this.headersBuilder;
        s0Var.getClass();
        u0 headers = c.e(s0Var);
        Intrinsics.checkNotNullParameter(headers, "headers");
        i1Var.f281091c = c.m(headers);
        i1Var.c(this.method, contentTypeOverridingRequestBody);
        return i1Var;
    }

    public void setBody(RequestBody requestBody) {
        this.body = requestBody;
    }

    public void setRelativeUrl(Object obj2) {
        this.relativeUrl = obj2.toString();
    }

    public void addPart(MultipartBody$Part multipartBody$Part) {
        this.multipartBuilder.c(multipartBody$Part);
    }

    private static void canonicalizeForPath(h hVar, String str, int i, int i2, boolean z) throws EOFException {
        h hVar2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt >= 32 && iCodePointAt < 127 && " \"<>^`{}|\\?#".indexOf(iCodePointAt) == -1 && (z || (iCodePointAt != 47 && iCodePointAt != 37))) {
                    hVar.E(iCodePointAt);
                } else {
                    if (hVar2 == null) {
                        hVar2 = new h();
                    }
                    hVar2.E(iCodePointAt);
                    long j2 = hVar2.f207266b;
                    for (long j3 = 0; j3 < j2; j3++) {
                        byte bJ = hVar2.j(j3);
                        int i3 = bJ & UnsignedBytes.MAX_VALUE;
                        hVar.w(37);
                        char[] cArr = HEX_DIGITS;
                        hVar.w(cArr[(i3 >> 4) & 15]);
                        hVar.w(cArr[bJ & 15]);
                    }
                    hVar2.f();
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }
}
