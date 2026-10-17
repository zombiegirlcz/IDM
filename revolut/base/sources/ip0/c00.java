package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class c00 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f163669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f163670c;
    public final /* synthetic */ koi.b d;

    public /* synthetic */ c00(koi.b bVar, float f, float f4, int i) {
        this.f163668a = i;
        this.d = bVar;
        this.f163669b = f;
        this.f163670c = f4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float bottom;
        switch (this.f163668a) {
            case 0:
                d00 d00Var = (d00) this.d;
                aim.e eVarB = zhm.u.b();
                View view = d00Var.k;
                TextView textView = d00Var.i;
                int visibility = view.getVisibility();
                float f = this.f163669b;
                if (visibility == 0) {
                    bottom = view.getY() - f;
                } else {
                    bottom = (textView.getVisibility() == 0 ? textView.getBottom() : d00Var.f163815g.getBottom()) + this.f163670c;
                }
                eVarB.add(Float.valueOf(bottom));
                if (view.getVisibility() == 0) {
                    eVarB.add(Float.valueOf(view.getBottom() + f));
                }
                return zhm.u.a(eVarB);
            default:
                j00 j00Var = (j00) this.d;
                aim.e eVarB2 = zhm.u.b();
                ImageView imageView = j00Var.f164773j;
                int visibility2 = imageView.getVisibility();
                float f4 = this.f163669b;
                eVarB2.add(Float.valueOf(visibility2 == 0 ? imageView.getY() - f4 : j00Var.f164772h.getBottom() + this.f163670c));
                if (imageView.getVisibility() == 0) {
                    eVarB2.add(Float.valueOf(imageView.getBottom() + f4));
                }
                return zhm.u.a(eVarB2);
        }
    }
}
