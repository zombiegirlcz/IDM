package androidx.view;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.view.contextaware.OnContextAvailableListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements OnContextAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f6789b;

    public /* synthetic */ h(ComponentActivity componentActivity, int i) {
        this.f6788a = i;
        this.f6789b = componentActivity;
    }

    @Override // androidx.view.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context) {
        switch (this.f6788a) {
            case 0:
                ComponentActivity._init_$lambda$4(this.f6789b, context);
                break;
            default:
                ((FragmentActivity) this.f6789b).lambda$init$3(context);
                break;
        }
    }
}
