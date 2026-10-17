package ihi;

import ch.qos.logback.core.CoreConstants;
import com.revolut.flexbox.FlexboxLayoutManager;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f161423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f161424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f161425c;
    public int d = 0;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f161426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ FlexboxLayoutManager f161427h;

    public d(FlexboxLayoutManager flexboxLayoutManager) {
        this.f161427h = flexboxLayoutManager;
    }

    public static void a(d dVar) {
        FlexboxLayoutManager flexboxLayoutManager = dVar.f161427h;
        if (flexboxLayoutManager.l() || !flexboxLayoutManager.f) {
            dVar.f161425c = dVar.e ? flexboxLayoutManager.f98215n.getEndAfterPadding() : flexboxLayoutManager.f98215n.getStartAfterPadding();
        } else {
            dVar.f161425c = dVar.e ? flexboxLayoutManager.f98215n.getEndAfterPadding() : flexboxLayoutManager.getWidth() - flexboxLayoutManager.f98215n.getStartAfterPadding();
        }
    }

    public static void b(d dVar) {
        dVar.f161423a = -1;
        dVar.f161424b = -1;
        dVar.f161425c = Integer.MIN_VALUE;
        dVar.f = false;
        dVar.f161426g = false;
        FlexboxLayoutManager flexboxLayoutManager = dVar.f161427h;
        if (flexboxLayoutManager.l()) {
            int i = flexboxLayoutManager.f98208b;
            if (i == 0) {
                dVar.e = flexboxLayoutManager.f98207a == 1;
                return;
            } else {
                dVar.e = i == 2;
                return;
            }
        }
        int i2 = flexboxLayoutManager.f98208b;
        if (i2 == 0) {
            dVar.e = flexboxLayoutManager.f98207a == 3;
        } else {
            dVar.e = i2 == 2;
        }
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("AnchorInfo{mPosition=");
        sb6.append(this.f161423a);
        sb6.append(", mFlexLinePosition=");
        sb6.append(this.f161424b);
        sb6.append(", mCoordinate=");
        sb6.append(this.f161425c);
        sb6.append(", mPerpendicularCoordinate=");
        sb6.append(this.d);
        sb6.append(", mLayoutFromEnd=");
        sb6.append(this.e);
        sb6.append(", mValid=");
        sb6.append(this.f);
        sb6.append(", mAssignedFromSavedState=");
        return j6.a.x(sb6, this.f161426g, CoreConstants.CURLY_RIGHT);
    }
}
