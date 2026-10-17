package com.revolut.retail.core.ui.activity;

import androidx.fragment.app.FragmentActivity;
import com.revolut.retail.core.mvp.BaseMvpFragment;
import kotlin.Metadata;
import pri.e;
import rri.a;
import yhm.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/core/ui/activity/BaseDelegatesFragment;", "Lpri/e;", "P", "Lrri/a;", "V", "Lcom/revolut/retail/core/mvp/BaseMvpFragment;", "<init>", "()V", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public class BaseDelegatesFragment<P extends e, V extends a> extends BaseMvpFragment<P, V> {
    public final BaseDelegatesActivity D() {
        FragmentActivity activity = getActivity();
        BaseDelegatesActivity baseDelegatesActivity = activity instanceof BaseDelegatesActivity ? (BaseDelegatesActivity) activity : null;
        if (baseDelegatesActivity != null) {
            return baseDelegatesActivity;
        }
        throw new IllegalArgumentException(requireActivity().getClass().getSimpleName().concat(" doesn't inherited from BaseDelegatesActivity"));
    }
}
