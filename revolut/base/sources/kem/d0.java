package kem;

import com.google.android.gms.wallet.WalletConstants;
import com.youTransactor.uCube.rpc.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class d0 implements Comparable {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f183191c;
    public static final d0 d;
    public static final d0 e;
    public static final d0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d0 f183192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f183193h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f183194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f183195b;

    static {
        d0 d0Var = new d0(100, "Continue");
        d0 d0Var2 = new d0(101, "Switching Protocols");
        d0 d0Var3 = new d0(102, "Processing");
        d0 d0Var4 = new d0(200, "OK");
        d0 d0Var5 = new d0(201, "Created");
        d0 d0Var6 = new d0(202, "Accepted");
        d0 d0Var7 = new d0(Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_1, "Non-Authoritative Information");
        d0 d0Var8 = new d0(Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2, "No Content");
        d0 d0Var9 = new d0(Constants.TAG_KSN_FORMATS, "Reset Content");
        d0 d0Var10 = new d0(206, "Partial Content");
        d0 d0Var11 = new d0(Constants.TAG_CF_ENHANCED_SRED_CONFIGURATION, "Multi-Status");
        d0 d0Var12 = new d0(300, "Multiple Choices");
        d0 d0Var13 = new d0(301, "Moved Permanently");
        f183191c = d0Var13;
        d0 d0Var14 = new d0(302, "Found");
        d = d0Var14;
        d0 d0Var15 = new d0(303, "See Other");
        e = d0Var15;
        d0 d0Var16 = new d0(304, "Not Modified");
        d0 d0Var17 = new d0(305, "Use Proxy");
        d0 d0Var18 = new d0(306, "Switch Proxy");
        d0 d0Var19 = new d0(307, "Temporary Redirect");
        f = d0Var19;
        d0 d0Var20 = new d0(308, "Permanent Redirect");
        f183192g = d0Var20;
        List listK = zhm.v.k(d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6, d0Var7, d0Var8, d0Var9, d0Var10, d0Var11, d0Var12, d0Var13, d0Var14, d0Var15, d0Var16, d0Var17, d0Var18, d0Var19, d0Var20, new d0(400, "Bad Request"), new d0(401, "Unauthorized"), new d0(WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE, "Payment Required"), new d0(403, "Forbidden"), new d0(WalletConstants.ERROR_CODE_INVALID_PARAMETERS, "Not Found"), new d0(WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR, "Method Not Allowed"), new d0(WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED, "Not Acceptable"), new d0(407, "Proxy Authentication Required"), new d0(408, "Request Timeout"), new d0(WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR, "Conflict"), new d0(WalletConstants.ERROR_CODE_INVALID_TRANSACTION, "Gone"), new d0(WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE, "Length Required"), new d0(WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION, "Precondition Failed"), new d0(WalletConstants.ERROR_CODE_UNKNOWN, "Payload Too Large"), new d0(WalletConstants.ERROR_CODE_ILLEGAL_CALLER, "Request-URI Too Long"), new d0(WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE, "Unsupported Media Type"), new d0(416, "Requested Range Not Satisfiable"), new d0(417, "Expectation Failed"), new d0(422, "Unprocessable Entity"), new d0(423, "Locked"), new d0(424, "Failed Dependency"), new d0(425, "Too Early"), new d0(426, "Upgrade Required"), new d0(429, "Too Many Requests"), new d0(431, "Request Header Fields Too Large"), new d0(500, "Internal Server Error"), new d0(501, "Not Implemented"), new d0(502, "Bad Gateway"), new d0(503, "Service Unavailable"), new d0(504, "Gateway Timeout"), new d0(505, "HTTP Version Not Supported"), new d0(506, "Variant Also Negotiates"), new d0(507, "Insufficient Storage"));
        f183193h = listK;
        List list = listK;
        int iB = zhm.q0.b(zhm.w.t(list, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : list) {
            linkedHashMap.put(Integer.valueOf(((d0) obj2).f183194a), obj2);
        }
    }

    public d0(int i, String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f183194a = i;
        this.f183195b = description;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        d0 other = (d0) obj2;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f183194a - other.f183194a;
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof d0) && ((d0) obj2).f183194a == this.f183194a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f183194a);
    }

    public final String toString() {
        return this.f183194a + zsc.p.SPACE_CHAR + this.f183195b;
    }
}
