package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.ListingTileDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class pv implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ListingTileDelegate f165883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.u8 f165884c;

    public /* synthetic */ pv(ListingTileDelegate listingTileDelegate, com.revolut.core.ui_kit.delegates.u8 u8Var, int i) {
        this.f165882a = i;
        this.f165883b = listingTileDelegate;
        this.f165884c = u8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f165882a) {
            case 0:
                Intrinsics.h(view);
                this.f165883b.f52751c.onNext(this.f165884c);
                break;
            case 1:
                Intrinsics.h(view);
                this.f165883b.d.onNext(this.f165884c);
                break;
            default:
                Intrinsics.h(view);
                this.f165883b.e.onNext(this.f165884c);
                break;
        }
    }
}
