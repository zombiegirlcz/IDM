package vc;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f287571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f287572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f287573c;
    public final long d;
    public final long e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f287574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PendingIntent f287575h;
    public final List i;

    public c(int i, int i2, int i3, long j2, long j3, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.f287571a = i;
        this.f287572b = i2;
        this.f287573c = i3;
        this.d = j2;
        this.e = j3;
        this.f = list;
        this.f287574g = list2;
        this.f287575h = pendingIntent;
        this.i = list3;
    }

    public static c a(int i, int i2, int i3, long j2, long j3, List list, List list2) {
        if (i2 != 8) {
            return new c(i, i2, i3, j2, j3, list, list2, null, null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    public static c e(Bundle bundle) {
        return new c(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public final PendingIntent b() {
        return this.f287575h;
    }

    public final int c() {
        return this.f287572b;
    }

    public final List d() {
        return this.i;
    }

    public final boolean equals(Object obj2) {
        List list;
        List list2;
        PendingIntent pendingIntent;
        List list3;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof c) {
            c cVar = (c) obj2;
            List list4 = cVar.i;
            PendingIntent pendingIntent2 = cVar.f287575h;
            List list5 = cVar.f287574g;
            List list6 = cVar.f;
            if (this.f287571a == cVar.f287571a && this.f287572b == cVar.f287572b && this.f287573c == cVar.f287573c && this.d == cVar.d && this.e == cVar.e && ((list = this.f) != null ? list.equals(list6) : list6 == null) && ((list2 = this.f287574g) != null ? list2.equals(list5) : list5 == null) && ((pendingIntent = this.f287575h) != null ? pendingIntent.equals(pendingIntent2) : pendingIntent2 == null) && ((list3 = this.i) != null ? list3.equals(list4) : list4 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.f287571a ^ 1000003) * 1000003) ^ this.f287572b) * 1000003) ^ this.f287573c;
        long j2 = this.d;
        long j3 = j2 ^ (j2 >>> 32);
        long j5 = this.e;
        long j16 = (j5 >>> 32) ^ j5;
        List list = this.f;
        int iHashCode = ((((((i * 1000003) ^ ((int) j3)) * 1000003) ^ ((int) j16)) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f287574g;
        int iHashCode2 = (iHashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f287575h;
        int iHashCode3 = (iHashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.i;
        return iHashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f);
        String strValueOf2 = String.valueOf(this.f287574g);
        String strValueOf3 = String.valueOf(this.f287575h);
        String strValueOf4 = String.valueOf(this.i);
        StringBuilder sbW = com.google.android.gms.internal.mlkit_vision_face.a.w("SplitInstallSessionState{sessionId=", this.f287571a, this.f287572b, ", status=", ", errorCode=");
        sbW.append(this.f287573c);
        sbW.append(", bytesDownloaded=");
        sbW.append(this.d);
        sbW.append(", totalBytesToDownload=");
        sbW.append(this.e);
        sbW.append(", moduleNamesNullable=");
        j6.a.D(sbW, strValueOf, ", languagesNullable=", strValueOf2, ", resolutionIntent=");
        return j6.a.w(sbW, strValueOf3, ", splitFileIntents=", strValueOf4, "}");
    }
}
