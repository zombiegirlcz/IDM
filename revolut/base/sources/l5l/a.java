package l5l;

import android.R;
import android.app.Activity;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rp0.g1;
import rp0.x0;
import zhm.u;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f192335b;

    public /* synthetic */ a(e eVar, int i) {
        this.f192334a = i;
        this.f192335b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f192334a) {
            case 0:
                return u.c(this.f192335b.f192339l);
            default:
                Activity activity = this.f192335b.f192338j;
                View viewFindViewById = activity.findViewById(R.id.content);
                if (viewFindViewById == null) {
                    viewFindViewById = activity.getWindow().getDecorView();
                }
                Intrinsics.h(viewFindViewById);
                return x0.a(g1.Companion, viewFindViewById);
        }
    }
}
