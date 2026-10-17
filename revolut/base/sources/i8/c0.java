package i8;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f159352b;

    public /* synthetic */ c0(Resources resources, int i) {
        this.f159351a = i;
        this.f159352b = resources;
    }

    @Override // i8.v
    public final u a(b0 b0Var) {
        switch (this.f159351a) {
            case 0:
                return new b(this.f159352b, b0Var.a(Uri.class, AssetFileDescriptor.class));
            case 1:
                return new b(this.f159352b, b0Var.a(Uri.class, InputStream.class));
            default:
                return new b(this.f159352b, f0.f159362b);
        }
    }
}
