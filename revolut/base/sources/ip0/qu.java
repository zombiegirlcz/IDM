package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.ListingCardDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class qu implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ListingCardDelegate f166060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ku f166061c;

    public /* synthetic */ qu(ListingCardDelegate listingCardDelegate, ku kuVar, int i) {
        this.f166059a = i;
        this.f166060b = listingCardDelegate;
        this.f166061c = kuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f166059a) {
            case 0:
                Intrinsics.h(view);
                this.f166060b.f.onNext(this.f166061c);
                break;
            case 1:
                Intrinsics.h(view);
                this.f166060b.f52747c.onNext(this.f166061c);
                break;
            default:
                Intrinsics.h(view);
                this.f166060b.f52748g.onNext(this.f166061c);
                break;
        }
    }
}
