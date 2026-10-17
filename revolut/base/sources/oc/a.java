package oc;

import android.app.PendingIntent;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f223995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f223996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f223997c;
    public final Integer d;
    public final int e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f223998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PendingIntent f223999h;
    public final PendingIntent i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f224000j = false;

    public a(int i, int i2, int i3, Integer num, int i5, long j2, long j3, long j5, long j16, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, HashMap map) {
        this.f223995a = i;
        this.f223996b = i2;
        this.f223997c = i3;
        this.d = num;
        this.e = i5;
        this.f = j2;
        this.f223998g = j3;
        this.f223999h = pendingIntent;
        this.i = pendingIntent2;
    }

    public final PendingIntent a(k kVar) {
        PendingIntent pendingIntent;
        int i = kVar.f224017a;
        if (i == 0) {
            PendingIntent pendingIntent2 = this.i;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            return null;
        }
        if (i != 1 || (pendingIntent = this.f223999h) == null) {
            return null;
        }
        return pendingIntent;
    }
}
