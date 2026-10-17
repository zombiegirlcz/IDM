package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class qy implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ihm.f f166066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NewsDelegate.Model f166067c;

    public /* synthetic */ qy(ihm.f fVar, NewsDelegate.Model model, int i) {
        this.f166065a = i;
        this.f166066b = fVar;
        this.f166067c = model;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f166065a) {
            case 0:
                Intrinsics.h(view);
                this.f166066b.onNext(this.f166067c);
                break;
            default:
                Intrinsics.h(view);
                this.f166066b.onNext(this.f166067c);
                break;
        }
    }
}
