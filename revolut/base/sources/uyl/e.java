package uyl;

import android.view.View;
import com.revolut.uicomponent.products.EditTextDelegate;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditTextDelegate f284453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EditTextDelegate.b f284454c;

    public /* synthetic */ e(EditTextDelegate editTextDelegate, EditTextDelegate.b bVar, int i) {
        this.f284452a = i;
        this.f284453b = editTextDelegate;
        this.f284454c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f284452a) {
            case 0:
                this.f284453b.f.onNext(this.f284454c.f107169a);
                break;
            default:
                this.f284453b.d.onNext(this.f284454c.f107169a);
                break;
        }
    }
}
