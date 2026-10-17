package sq0;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class i extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f264981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f264982c;
    public int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f264983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f264984h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f264985j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i, int i2, f position) {
        super(position);
        Intrinsics.checkNotNullParameter(position, "position");
        this.f264981b = i;
        this.f264982c = i2;
    }

    public final void u(RecyclerView parent) {
        int iValueAt;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.f264985j) {
            return;
        }
        o31.d dVarM = p31.a.m(parent);
        Context context = dVarM.f221678a;
        int i = R$attr.uikit_colorGreyTone8;
        SparseIntArray sparseIntArray = dVarM.f221679b;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            iValueAt = sparseIntArray.valueAt(iIndexOfKey);
        } else {
            int iS = kli.a.s(i, context);
            sparseIntArray.put(i, iS);
            iValueAt = iS;
        }
        this.d = iValueAt;
        this.e = kli.a.k(context, 1.0f);
        this.f = kli.a.k(context, 2.0f);
        this.f264983g = kli.a.k(context, 2.0f);
        int i2 = this.f264981b;
        this.f264984h = i2 == 0 ? 0 : dVarM.a(i2);
        int i3 = this.f264982c;
        this.i = i3 != 0 ? dVarM.a(i3) : 0;
        this.f264985j = true;
    }
}
