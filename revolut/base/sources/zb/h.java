package zb;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f320768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f320769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f320770c;
    public Long d;
    public Long e;
    public HashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f320771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f320772h;
    public byte[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f320773j;

    public final void a(String str, String str2) {
        HashMap map = this.f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public final i b() {
        String strR = this.f320768a == null ? " transportName" : "";
        if (this.f320770c == null) {
            strR = strR.concat(" encodedPayload");
        }
        if (this.d == null) {
            strR = a0.d.r(strR, " eventMillis");
        }
        if (this.e == null) {
            strR = a0.d.r(strR, " uptimeMillis");
        }
        if (this.f == null) {
            strR = a0.d.r(strR, " autoMetadata");
        }
        if (strR.isEmpty()) {
            return new i(this.f320768a, this.f320769b, this.f320770c, this.d.longValue(), this.e.longValue(), this.f, this.f320771g, this.f320772h, this.i, this.f320773j);
        }
        throw new IllegalStateException("Missing required properties:".concat(strR));
    }
}
