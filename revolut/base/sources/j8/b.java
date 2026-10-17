package j8;

import android.content.Context;
import android.net.Uri;
import i8.b0;
import i8.u;
import i8.v;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class b implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f172063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f172064b;

    public b(Context context, Class cls) {
        this.f172063a = context;
        this.f172064b = cls;
    }

    @Override // i8.v
    public final u a(b0 b0Var) {
        Class cls = this.f172064b;
        return new d(this.f172063a, b0Var.a(File.class, cls), b0Var.a(Uri.class, cls), cls);
    }
}
