package zr0;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f324524a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f324525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f324526c;
    public final /* synthetic */ View d;

    public d(View view, e eVar, int i) {
        this.d = view;
        this.f324525b = eVar;
        this.f324526c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f324524a) {
            case 0:
                e eVar = this.f324525b;
                int i = eVar.f324528b;
                int i2 = this.f324526c;
                if (i == i2 && !eVar.e) {
                    eVar.a();
                } else {
                    ViewGroup viewGroup = (ViewGroup) this.d;
                    OneShotPreDrawListener.add(viewGroup, new d(viewGroup, eVar, i2));
                }
                break;
            default:
                e eVar2 = this.f324525b;
                if (eVar2.f324528b == this.f324526c && eVar2.d == null) {
                    eVar2.a();
                    break;
                }
                break;
        }
    }

    public d(ViewGroup viewGroup, e eVar, int i, ViewGroup viewGroup2) {
        this.f324525b = eVar;
        this.f324526c = i;
        this.d = viewGroup2;
    }
}
