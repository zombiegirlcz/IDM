package upi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import ihm.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t80.h;
import t80.l;
import t80.m;
import t80.v;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends fsi.c implements f, h {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final fsi.b f282055n = new fsi.b("MEDIA_PICKER_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Activity f282056h;
    public final y80.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v f282057j;
    public final j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f282058l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Integer f282059m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Activity activity, y80.b permissionRequestResolver, v mediaPicker) {
        super(f282055n);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permissionRequestResolver, "permissionRequestResolver");
        Intrinsics.checkNotNullParameter(mediaPicker, "mediaPicker");
        this.f282056h = activity;
        this.i = permissionRequestResolver;
        this.f282057j = mediaPicker;
        this.k = p.a.D("toSerialized(...)");
    }

    @Override // t80.h
    public final void K(List files, l source) {
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(source, "source");
        Integer num = this.f282059m;
        this.f282059m = null;
        this.k.onNext(new d(files, num));
    }

    @Override // fsi.a
    public final void o(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.o(i, permissions, grantResults);
        if (i != 10001) {
            return;
        }
        y80.c cVarA = this.i.a(this.f282056h, permissions, grantResults);
        if (pu7.a.w(cVarA) == y80.d.GRANTED) {
            if (i == 10001) {
                v.d(this.f282057j, this.f282058l, null, 2);
                return;
            }
            return;
        }
        y80.d dVarW = pu7.a.w(cVarA);
        Integer num = this.f282059m;
        this.f282059m = null;
        this.k.onNext(new c(m.d.f268770a, dVarW, num));
    }

    @Override // fsi.a
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f282057j.b(i, i2, intent);
    }

    @Override // fsi.a
    public final void onCreate(Bundle bundle) {
        v vVar = this.f282057j;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        vVar.f268788m = this;
        Bundle bundle2 = bundle != null ? bundle.getBundle("MEDIA_PICKER") : null;
        if (bundle2 != null) {
            vVar.f(bundle2);
        }
    }

    @Override // fsi.c, fsi.a
    public final void onDestroy() {
        super.onDestroy();
        this.f282057j.f268788m = null;
    }

    @Override // fsi.a
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        Bundle bundle = new Bundle();
        this.f282057j.g(bundle);
        outState.putBundle("MEDIA_PICKER", bundle);
    }

    @Override // t80.h
    public final void p(m reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Integer num = this.f282059m;
        this.f282059m = null;
        this.k.onNext(new c(reason, null, num));
    }
}
