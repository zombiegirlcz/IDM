package s1;

import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* JADX INFO: loaded from: classes15.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ boolean A(Object obj2) {
        return obj2 instanceof DeleteRangeGesture;
    }

    public static /* bridge */ /* synthetic */ boolean B(Object obj2) {
        return obj2 instanceof InsertGesture;
    }

    public static /* bridge */ /* synthetic */ boolean C(Object obj2) {
        return obj2 instanceof RemoveSpaceGesture;
    }

    public static /* bridge */ /* synthetic */ boolean D(Object obj2) {
        return obj2 instanceof JoinOrSplitGesture;
    }

    public static /* bridge */ /* synthetic */ DeleteGesture k(Object obj2) {
        return (DeleteGesture) obj2;
    }

    public static /* bridge */ /* synthetic */ DeleteRangeGesture l(Object obj2) {
        return (DeleteRangeGesture) obj2;
    }

    public static /* bridge */ /* synthetic */ HandwritingGesture m(Object obj2) {
        return (HandwritingGesture) obj2;
    }

    public static /* bridge */ /* synthetic */ InsertGesture n(Object obj2) {
        return (InsertGesture) obj2;
    }

    public static /* bridge */ /* synthetic */ JoinOrSplitGesture o(Object obj2) {
        return (JoinOrSplitGesture) obj2;
    }

    public static /* bridge */ /* synthetic */ RemoveSpaceGesture p(Object obj2) {
        return (RemoveSpaceGesture) obj2;
    }

    public static /* bridge */ /* synthetic */ SelectGesture q(Object obj2) {
        return (SelectGesture) obj2;
    }

    public static /* bridge */ /* synthetic */ SelectRangeGesture r(Object obj2) {
        return (SelectRangeGesture) obj2;
    }

    public static /* bridge */ /* synthetic */ boolean v(Object obj2) {
        return obj2 instanceof DeleteGesture;
    }

    public static /* bridge */ /* synthetic */ boolean z(Object obj2) {
        return obj2 instanceof SelectRangeGesture;
    }
}
