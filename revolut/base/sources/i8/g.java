package i8;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class g implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f159365b;

    public /* synthetic */ g(Context context, int i) {
        this.f159364a = i;
        this.f159365b = context;
    }

    @Override // i8.v
    public final u a(b0 b0Var) {
        switch (this.f159364a) {
            case 0:
                return new i(this.f159365b, this);
            case 1:
                return new i(this.f159365b, this);
            case 2:
                return new i(this.f159365b, this);
            case 3:
                return new q(this.f159365b, 0);
            case 4:
                return new i(this.f159365b, b0Var.a(Integer.class, AssetFileDescriptor.class));
            case 5:
                return new i(this.f159365b, b0Var.a(Integer.class, InputStream.class));
            case 6:
                return new q(this.f159365b, 1);
            default:
                return new q(this.f159365b, 2);
        }
    }
}
