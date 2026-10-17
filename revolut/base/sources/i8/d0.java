package i8;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* JADX INFO: loaded from: classes16.dex */
public final class d0 implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f159355b;

    public /* synthetic */ d0(u uVar, int i) {
        this.f159354a = i;
        this.f159355b = uVar;
    }

    @Override // i8.u
    public final t a(Object obj2, int i, int i2, c8.k kVar) {
        Uri uriFromFile;
        switch (this.f159354a) {
            case 0:
                String str = (String) obj2;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri2 = Uri.parse(str);
                    uriFromFile = uri2.getScheme() == null ? Uri.fromFile(new File(str)) : uri2;
                }
                if (uriFromFile == null) {
                    return null;
                }
                u uVar = this.f159355b;
                if (uVar.b(uriFromFile)) {
                    return uVar.a(uriFromFile, i, i2, kVar);
                }
                return null;
            default:
                return this.f159355b.a(new k((URL) obj2), i, i2, kVar);
        }
    }

    @Override // i8.u
    public final /* bridge */ /* synthetic */ boolean b(Object obj2) {
        switch (this.f159354a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
