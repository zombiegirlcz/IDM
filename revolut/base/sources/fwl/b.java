package fwl;

import android.content.Intent;
import android.os.Bundle;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import fsi.c;
import iri.g;
import iri.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sri.m;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends c {

    @NotNull
    public static final a Companion = new a();
    public static final fsi.b i = new fsi.b("LEGACY_FLOW_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f138709h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BaseDelegatesActivity activity, j flowLifecycleStateWrapper, m navigator) {
        super(i);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(flowLifecycleStateWrapper, "flowLifecycleStateWrapper");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (!(activity instanceof u2l.a)) {
            throw new IllegalStateException("this delegate can only work with legacy BaseActivity");
        }
        iri.m mVarD1 = ((u2l.a) activity).d1();
        this.f138709h = new g(flowLifecycleStateWrapper, mVarD1 == null ? new iri.b() : mVarD1, activity, navigator);
    }

    @Override // fsi.a
    public final void I() {
        this.f138709h.getClass();
    }

    @Override // fsi.a
    public final void o(int i2, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        this.f138709h.o(i2, permissions, grantResults);
    }

    @Override // fsi.a
    public final void onActivityResult(int i2, int i3, Intent intent) {
        this.f138709h.getClass();
    }

    @Override // fsi.a
    public final void onCreate(Bundle bundle) {
        this.f138709h.onCreate(bundle);
    }

    @Override // fsi.c, fsi.a
    public final void onDestroy() {
        super.onDestroy();
        this.f138709h.onDestroy();
    }

    @Override // fsi.c, fsi.a
    public final void onPause() {
        super.onPause();
        this.f138709h.onPause();
    }

    @Override // fsi.a
    public final void onResume() {
        this.f138709h.onResume();
    }

    @Override // fsi.a
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f138709h.onSaveInstanceState(outState);
    }

    @Override // fsi.a
    public final void onStart() {
        this.f138709h.getClass();
    }

    @Override // fsi.c, fsi.a
    public final void onStop() {
        super.onStop();
        this.f138709h.onStop();
    }

    @Override // fsi.a
    public final void x() {
        this.f138709h.getClass();
    }
}
