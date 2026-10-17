package dyl;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f121159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f121160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bitmap f121161c;
    public final View d;

    public k(TextView amountInBubble, Bitmap amountInBubbleBitmap, Bitmap transferAmountBitmap, View amountAnchorView) {
        Intrinsics.checkNotNullParameter(amountInBubble, "amountInBubble");
        Intrinsics.checkNotNullParameter(amountInBubbleBitmap, "amountInBubbleBitmap");
        Intrinsics.checkNotNullParameter(transferAmountBitmap, "transferAmountBitmap");
        Intrinsics.checkNotNullParameter(amountAnchorView, "amountAnchorView");
        this.f121159a = amountInBubble;
        this.f121160b = amountInBubbleBitmap;
        this.f121161c = transferAmountBitmap;
        this.d = amountAnchorView;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f121159a, kVar.f121159a) && Intrinsics.f(this.f121160b, kVar.f121160b) && Intrinsics.f(this.f121161c, kVar.f121161c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f121161c.hashCode() + ((this.f121160b.hashCode() + (this.f121159a.hashCode() * 31)) * 31)) * 31);
    }
}
