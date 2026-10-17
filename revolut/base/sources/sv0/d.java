package sv0;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f265823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f265824b;

    public /* synthetic */ d(Activity activity, int i) {
        this.f265823a = i;
        this.f265824b = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f265823a) {
            case 0:
                Context applicationContext = this.f265824b.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                return applicationContext;
            default:
                View rootView = this.f265824b.getWindow().getDecorView().getRootView();
                Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                return new w01.c((ViewGroup) rootView);
        }
    }
}
