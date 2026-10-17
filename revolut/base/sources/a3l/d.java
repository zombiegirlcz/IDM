package a3l;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f1175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Drawable f1176c;

    public /* synthetic */ d(Function1 function1, Drawable drawable, int i) {
        this.f1174a = i;
        this.f1175b = function1;
        this.f1176c = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1174a;
        Drawable drawable = this.f1176c;
        Function1 function1 = this.f1175b;
        switch (i) {
            case 0:
                Handler handler = e.f1177a;
                if (function1 != null) {
                    function1.invoke(drawable);
                }
                break;
            default:
                function1.invoke(drawable);
                break;
        }
    }
}
