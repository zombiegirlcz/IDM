package i8;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes16.dex */
public final class q implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f159395b;

    public q(Context context, int i) {
        this.f159394a = i;
        switch (i) {
            case 1:
                this.f159395b = context.getApplicationContext();
                break;
            case 2:
                this.f159395b = context.getApplicationContext();
                break;
            default:
                this.f159395b = context;
                break;
        }
    }

    @Override // i8.u
    public final t a(Object obj2, int i, int i2, c8.k kVar) {
        Long l2;
        switch (this.f159394a) {
            case 0:
                Uri uri2 = (Uri) obj2;
                return new t(new x8.e(uri2), new p(this.f159395b, uri2, 0));
            case 1:
                Uri uri3 = (Uri) obj2;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                x8.e eVar = new x8.e(uri3);
                Context context = this.f159395b;
                return new t(eVar, d8.b.d(context, uri3, new d8.a(context.getContentResolver(), 0)));
            default:
                Uri uri4 = (Uri) obj2;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l2 = (Long) kVar.a(l8.e0.d)) == null || l2.longValue() != -1) {
                    return null;
                }
                x8.e eVar2 = new x8.e(uri4);
                Context context2 = this.f159395b;
                return new t(eVar2, d8.b.d(context2, uri4, new d8.a(context2.getContentResolver(), 1)));
        }
    }

    @Override // i8.u
    public final boolean b(Object obj2) {
        switch (this.f159394a) {
            case 0:
                return md6.s.i((Uri) obj2);
            case 1:
                Uri uri2 = (Uri) obj2;
                return md6.s.i(uri2) && !uri2.getPathSegments().contains("video");
            default:
                Uri uri3 = (Uri) obj2;
                return md6.s.i(uri3) && uri3.getPathSegments().contains("video");
        }
    }
}
