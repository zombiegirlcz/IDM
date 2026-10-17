package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.ListingCardSmallDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class cv implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ListingCardSmallDelegate f163798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xu f163799c;

    public /* synthetic */ cv(ListingCardSmallDelegate listingCardSmallDelegate, xu xuVar, int i) {
        this.f163797a = i;
        this.f163798b = listingCardSmallDelegate;
        this.f163799c = xuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f163797a) {
            case 0:
                Intrinsics.h(view);
                this.f163798b.f52749c.onNext(this.f163799c);
                break;
            default:
                Intrinsics.h(view);
                this.f163798b.f52750g.onNext(this.f163799c);
                break;
        }
    }
}
