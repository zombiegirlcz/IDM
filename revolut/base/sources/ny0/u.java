package ny0;

import androidx.collection.ArrayMap;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class u {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FloatingBottomBarView f220612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f220613b = s.MOST_RESTRICTIVE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f220614c;
    public final ArrayMap d;

    public u(FloatingBottomBarView floatingBottomBarView) {
        this.f220612a = floatingBottomBarView;
        ArrayMap arrayMap = new ArrayMap();
        this.d = arrayMap;
        if (floatingBottomBarView.getVisibility() != 0) {
            arrayMap.put("EXTERNAL_VISIBILITY_TOKEN", Integer.valueOf(floatingBottomBarView.getVisibility()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        int iMax;
        ArrayMap arrayMap = this.d;
        if (arrayMap.isEmpty()) {
            iMax = 0;
        } else {
            int[] iArr = t.f220611a;
            s sVar = this.f220613b;
            int i = iArr[sVar.ordinal()];
            if (i == 1) {
                iMax = 0;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iMax = 8;
            }
            int size = arrayMap.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                int iIntValue = ((Number) arrayMap.valueAt(i2)).intValue();
                int i3 = t.f220611a[sVar.ordinal()];
                if (i3 == 1) {
                    iMax = Math.max(iMax, iIntValue);
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iMax = Math.min(iMax, iIntValue);
                }
            }
        }
        FloatingBottomBarView floatingBottomBarView = this.f220612a;
        if (floatingBottomBarView.getVisibility() != iMax) {
            this.f220614c = true;
            try {
                floatingBottomBarView.setVisibility(iMax);
            } finally {
                this.f220614c = false;
            }
        }
    }

    public final void b(int i, String requestToken) {
        Intrinsics.checkNotNullParameter(requestToken, "requestToken");
        this.d.put(requestToken, Integer.valueOf(i));
        a();
    }
}
